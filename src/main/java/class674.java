import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class674 implements Runnable {
   @OriginalMember(
      owner = "client!bl",
      name = "f",
      descriptor = "I"
   )
   private int field9878 = 0;
   @OriginalMember(
      owner = "client!bl",
      name = "g",
      descriptor = "I"
   )
   private int field9882 = 0;
   @OriginalMember(
      owner = "client!bl",
      name = "b",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field9885;
   @OriginalMember(
      owner = "client!bl",
      name = "k",
      descriptor = "I"
   )
   private int field9880;
   @OriginalMember(
      owner = "client!bl",
      name = "l",
      descriptor = "[B"
   )
   private byte[] field9893;
   @OriginalMember(
      owner = "client!bl",
      name = "e",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field9889;
   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9894 = new String[]{method4931(method4930("YB ]\u000f")), method4931(method4930("YB _\u000f")), method4931(method4930("@\u0000 2Z")), method4931(method4930("YB X\u000f")), method4931(method4930("U[bp")), method4931(method4930("LG`")), method4931(method4930("YB ^\u000f")), method4931(method4930("YB Y\u000f")), method4931(method4930("YB nRU\u0006")), method4931(method4930("YB  NUGz\"\u000f"))};
   @OriginalMember(
      owner = "client!bl",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field9879 = false;
   @OriginalMember(
      owner = "client!bl",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field9886 = true;
   @OriginalMember(
      owner = "client!bl",
      name = "o",
      descriptor = "D"
   )
   public static double field9888;
   @OriginalMember(
      owner = "client!bl",
      name = "c",
      descriptor = "I"
   )
   public static int field9881;
   @OriginalMember(
      owner = "client!bl",
      name = "h",
      descriptor = "I"
   )
   public static int field9883;
   @OriginalMember(
      owner = "client!bl",
      name = "m",
      descriptor = "I"
   )
   public static int field9884;
   @OriginalMember(
      owner = "client!bl",
      name = "i",
      descriptor = "I"
   )
   public static int field9887;
   @OriginalMember(
      owner = "client!bl",
      name = "d",
      descriptor = "I"
   )
   public static int field9890;
   @OriginalMember(
      owner = "client!bl",
      name = "j",
      descriptor = "I"
   )
   public static int field9891;
   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "I"
   )
   public static int field9892;
   @OriginalMember(
      owner = "client!bl",
      name = "p",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field9877;

   @OriginalMember(
      owner = "client!bl",
      name = "run",
      descriptor = "()V",
      line = 4
   )
   public final void run() {
      boolean var1 = client.field4564;

      try {
         ++field9890;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label81: {
                     if (this.field9877 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (~this.field9882 == -1) {
                        var3 = -this.field9878 + this.field9880 + -1;
                        if (!var1) {
                           break label81;
                        }
                     }

                     if (this.field9878 < this.field9882) {
                        var3 = this.field9882 - (this.field9878 - -1);
                        if (!var1) {
                           break label81;
                        }
                     }

                     var3 = -this.field9878 + this.field9880;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var15) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            int var4;
            try {
               var4 = this.field9885.read(this.field9893, this.field9878, var3);
               if (~var4 == 0) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field9877 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field9878 = (this.field9878 - -var4) % this.field9880;
            }
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field9894[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(B)V",
      line = 63
   )
   public final void method4925(byte arg0) {
      try {
         ++field9892;
         synchronized(this) {
            if (arg0 != -107) {
               field9879 = false;
            }

            if (this.field9877 == null) {
               this.field9877 = new IOException("");
            }

            this.notifyAll();
         }

         try {
            this.field9889.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9894[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V",
      line = 154
   )
   public class674(InputStream arg0, int arg1) {
      try {
         this.field9885 = arg0;
         this.field9880 = arg1 + 1;
         this.field9893 = new byte[this.field9880];
         this.field9889 = new Thread(this);
         this.field9889.setDaemon(true);
         this.field9889.start();
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9894[9] + (arg0 != null ? field9894[2] : field9894[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(I)V",
      line = 95
   )
   public final void method4926(int arg0) {
      try {
         int var2 = 68 % ((50 - arg0) / 44);
         ++field9883;
         this.field9885 = new class729();
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9894[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(ZI)Z",
      line = 105
   )
   public final boolean method4927(boolean arg0, int arg1) throws IOException {
      try {
         ++field9884;
         if (arg0) {
            this.run();
         }

         if (~arg1 < -1 && this.field9880 > arg1) {
            synchronized(this) {
               int var4;
               label38: {
                  if (this.field9878 < this.field9882) {
                     var4 = this.field9880 - this.field9882 - -this.field9878;
                     if (!client.field4564) {
                        break label38;
                     }
                  }

                  var4 = this.field9878 - this.field9882;
               }

               if (arg1 > var4) {
                  if (this.field9877 != null) {
                     throw new IOException(this.field9877.toString());
                  } else {
                     this.notifyAll();
                     return false;
                  }
               } else {
                  return true;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field9894[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IB[BI)I",
      line = 169
   )
   public final int method4928(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field4564;

      try {
         ++field9887;
         if (~arg0 <= -1 && arg3 >= 0 && ~arg2.length <= ~(arg0 + arg3)) {
            synchronized(this) {
               int var7;
               label58: {
                  if (this.field9878 < this.field9882) {
                     var7 = this.field9880 + this.field9878 + -this.field9882;
                     if (!var5) {
                        break label58;
                     }
                  }

                  var7 = -this.field9882 + this.field9878;
               }

               if (~arg0 < ~var7) {
                  arg0 = var7;
               }

               if (arg0 == 0 && this.field9877 != null) {
                  throw new IOException(this.field9877.toString());
               } else {
                  if (arg1 > -15) {
                     field9886 = false;
                  }

                  label49: {
                     if (this.field9882 + arg0 <= this.field9880) {
                        class365.method2856(this.field9893, this.field9882, arg2, arg3, arg0);
                        if (!var5) {
                           break label49;
                        }
                     }

                     int var8 = -this.field9882 + this.field9880;
                     class365.method2856(this.field9893, this.field9882, arg2, arg3, var8);
                     class365.method2856(this.field9893, 0, arg2, arg3 + var8, -var8 + arg0);
                  }

                  this.field9882 = (this.field9882 + arg0) % this.field9880;
                  this.notifyAll();
                  return arg0;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field9894[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9894[2] : field9894[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "b",
      descriptor = "(I)I",
      line = 212
   )
   public static final int method4929(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field9891;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         if (class412.field6033.field9456 && !class412.field6033.field9441) {
            label128: {
               var2 = true;
               if (~class359.field5381.field9635 > -513 && ~class359.field5381.field9635 != -1) {
                  var2 = false;
               }

               if (!class651.field9433.startsWith(field9894[5])) {
                  var3 = true;
                  if (!var1) {
                     break label128;
                  }
               }

               var4 = true;
               var3 = true;
            }
         }

         if (class428.field6191) {
            var2 = false;
         }

         if (class274.field3891) {
            var3 = false;
         }

         if (class368.field5465) {
            var4 = false;
         }

         if (!var2 && !var3 && !var4) {
            return class732.method5279(-3);
         } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
               try {
                  var5 = class12.method78((byte)-88, 2, 1000);
               } catch (Exception var17) {
               }
            }

            int var7 = -1;
            if (var4) {
               try {
                  var7 = class12.method78((byte)-88, 3, 1000);
                  if (~class510.field7454.field11145.method2098(false) == -4) {
                     label129: {
                        long var9;
                        label130: {
                           class698 var8 = class444.field6473.method273();
                           var9 = var8.field10225 & 281474976710655L;
                           int var11 = var8.field10222;
                           if (var11 != 4318) {
                              if (~var11 != -4099) {
                                 break label129;
                              }

                              if (!var1) {
                                 break label130;
                              }
                           }

                           var3 &= var9 >= 64425238954L;
                           if (!var1) {
                              break label129;
                           }
                        }

                        var3 &= var9 >= 60129613779L;
                     }
                  }
               } catch (Exception var18) {
               }
            }

            if (var3) {
               try {
                  var6 = class12.method78((byte)-88, 1, 1000);
               } catch (Exception var16) {
               }
            }

            if (var5 == -1 && ~var6 == 0 && ~var7 == 0) {
               return class732.method5279(-3);
            } else {
               int var12 = (int)((float)var6 * 1.1F);
               int var13 = -6 % ((arg0 - -51) / 52);
               int var14 = (int)((float)var7 * 1.1F);
               if (~var5 < ~var14 && ~var5 < ~var12) {
                  return class773.method5593((byte)122, var5);
               } else {
                  return ~var12 > ~var14 ? class377.method2945(5000, 3, var14) : class377.method2945(5000, 1, var12);
               }
            }
         }
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field9894[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4930(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4931(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
