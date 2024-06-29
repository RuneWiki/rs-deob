import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class778 implements Runnable {
   @OriginalMember(
      owner = "client!vm",
      name = "l",
      descriptor = "I"
   )
   private int field11353 = 0;
   @OriginalMember(
      owner = "client!vm",
      name = "g",
      descriptor = "I"
   )
   private int field11356 = 0;
   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field11348;
   @OriginalMember(
      owner = "client!vm",
      name = "p",
      descriptor = "I"
   )
   private int field11360;
   @OriginalMember(
      owner = "client!vm",
      name = "j",
      descriptor = "[B"
   )
   private byte[] field11350;
   @OriginalMember(
      owner = "client!vm",
      name = "e",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field11347;
   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11362 = new String[]{method5626(method5625("J^nR")), method5626(method5625("RF,\u0002RJBv\u0000\u0013")), method5626(method5625("_\u0005,\u0010F")), method5626(method5625("RF,}\u0013")), method5626(method5625("RF,{\u0013")), method5626(method5625("RF,LNJ\u0003")), method5626(method5625("RF,z\u0013")), method5626(method5625("RF,|\u0013")), method5626(method5625("RF,x\u0013")), method5626(method5625("RF,y\u0013")), method5626(method5625("RF,\u007f\u0013"))};
   @OriginalMember(
      owner = "client!vm",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field11346 = new int[8];
   @OriginalMember(
      owner = "client!vm",
      name = "m",
      descriptor = "I"
   )
   public static int field11343;
   @OriginalMember(
      owner = "client!vm",
      name = "h",
      descriptor = "I"
   )
   public static int field11345;
   @OriginalMember(
      owner = "client!vm",
      name = "f",
      descriptor = "I"
   )
   public static int field11351;
   @OriginalMember(
      owner = "client!vm",
      name = "o",
      descriptor = "I"
   )
   public static int field11354;
   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "I"
   )
   public static int field11357;
   @OriginalMember(
      owner = "client!vm",
      name = "i",
      descriptor = "I"
   )
   public static int field11358;
   @OriginalMember(
      owner = "client!vm",
      name = "k",
      descriptor = "I"
   )
   public static int field11359;
   @OriginalMember(
      owner = "client!vm",
      name = "c",
      descriptor = "I"
   )
   public static int field11361;
   @OriginalMember(
      owner = "client!vm",
      name = "n",
      descriptor = "Lqaa;"
   )
   public static class119 field11344;
   @OriginalMember(
      owner = "client!vm",
      name = "s",
      descriptor = "Lsa;"
   )
   public static class39 field11349;
   @OriginalMember(
      owner = "client!vm",
      name = "r",
      descriptor = "Ljga;"
   )
   public static class91 field11352;
   @OriginalMember(
      owner = "client!vm",
      name = "q",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field11355;

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5618(int arg0) {
      try {
         synchronized(this) {
            if (this.field11355 == null) {
               this.field11355 = new IOException("");
            }

            this.notifyAll();
         }

         ++field11361;

         try {
            if (arg0 != 0) {
               this.run();
            }

            this.field11347.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11362[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5619(byte arg0) {
      try {
         if (arg0 == 65) {
            this.field11348 = new class190();
            ++field11357;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11362[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5620(int arg0) {
      try {
         field11346 = null;
         field11352 = null;
         field11349 = null;
         if (arg0 >= -47) {
            method5621(87);
         }

         field11344 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11362[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5621(int arg0) {
      try {
         ++field11345;
         class107 var1 = class545.field7775;
         synchronized(class545.field7775) {
            class545.field7775.method1052(true);
            if (arg0 != -5168) {
               field11346 = null;
            }
         }

         class107 var2 = class211.field3013;
         synchronized(class211.field3013) {
            class211.field3013.method1052(true);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11362[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5622(byte arg0) {
      try {
         ++field11351;
         if (!class211.field3020) {
            class126.field2033 += (-class126.field2033 + -12.0F) / 2.0F;
            class411.field6028 = true;
            if (arg0 != 67) {
               method5620(60);
            }

            class211.field3020 = true;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11362[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(IBIIIII)J"
   )
   public static final long method5623(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field11359;
         class309.field4655.clear();
         class309.field4655.set(arg4, arg5, arg2, arg0, arg3, arg6);
         int var7 = 67 % ((-29 - arg1) / 56);
         return class309.field4655.getTime().getTime();
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field11362[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(BI[BI)V"
   )
   public final void method5624(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field10022;

      try {
         ++field11343;
         if (arg1 >= 0 && arg3 >= 0 && ~arg2.length <= ~(arg1 + arg3)) {
            synchronized(this) {
               if (this.field11355 != null) {
                  throw new IOException(this.field11355.toString());
               } else {
                  int var7;
                  label50: {
                     if (~this.field11353 > ~this.field11356) {
                        var7 = -this.field11353 + -1 + this.field11356;
                        if (!var5) {
                           break label50;
                        }
                     }

                     var7 = -this.field11353 + this.field11356 + this.field11360 + -1;
                  }

                  if (var7 < arg1) {
                     throw new IOException("");
                  } else {
                     label44: {
                        if (this.field11360 < this.field11353 + arg1) {
                           int var8 = -this.field11353 + this.field11360;
                           class474.method3640(arg2, arg3, this.field11350, this.field11353, var8);
                           class474.method3640(arg2, arg3 + var8, this.field11350, 0, -var8 + arg1);
                           if (!var5) {
                              break label44;
                           }
                        }

                        class474.method3640(arg2, arg3, this.field11350, this.field11353, arg1);
                     }

                     this.field11353 = (this.field11353 + arg1) % this.field11360;
                     if (arg0 < 106) {
                        method5621(-89);
                     }

                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field11362[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11362[2] : field11362[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field10022;

      try {
         ++field11354;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label61: {
                     if (this.field11355 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field11353 >= this.field11356) {
                        var3 = -this.field11356 + this.field11353;
                        if (!var1) {
                           break label61;
                        }
                     }

                     var3 = this.field11360 + this.field11353 + -this.field11356;
                  }

                  if (~var3 < -1) {
                     break;
                  }

                  try {
                     this.field11348.flush();
                  } catch (IOException var18) {
                     this.field11355 = var18;
                     return;
                  }

                  try {
                     this.wait();
                  } catch (InterruptedException var19) {
                     if (var1) {
                        break;
                     }
                  }
               }
            }

            try {
               label76: {
                  if (this.field11360 >= this.field11356 + var3) {
                     this.field11348.write(this.field11350, this.field11356, var3);
                     if (!var1) {
                        break label76;
                     }
                  }

                  int var5 = this.field11360 - this.field11356;
                  this.field11348.write(this.field11350, this.field11356, var5);
                  this.field11348.write(this.field11350, 0, -var5 + var3);
               }
            } catch (IOException var21) {
               IOException var6 = var21;
               synchronized(this) {
                  this.field11355 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field11356 = (this.field11356 + var3) % this.field11360;
            }
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field11362[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V"
   )
   public class778(OutputStream arg0, int arg1) {
      try {
         this.field11348 = arg0;
         this.field11360 = arg1 - -1;
         this.field11350 = new byte[this.field11360];
         this.field11347 = new Thread(this);
         this.field11347.setDaemon(true);
         this.field11347.start();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11362[1] + (arg0 != null ? field11362[2] : field11362[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5625(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5626(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
