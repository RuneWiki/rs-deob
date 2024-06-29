import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class471 implements Runnable {
   @OriginalMember(
      owner = "client!fd",
      name = "t",
      descriptor = "Z"
   )
   private boolean field6484 = false;
   @OriginalMember(
      owner = "client!fd",
      name = "u",
      descriptor = "Z"
   )
   private boolean field6493 = false;
   @OriginalMember(
      owner = "client!fd",
      name = "n",
      descriptor = "I"
   )
   private int field6489 = 0;
   @OriginalMember(
      owner = "client!fd",
      name = "m",
      descriptor = "I"
   )
   private int field6499 = 0;
   @OriginalMember(
      owner = "client!fd",
      name = "i",
      descriptor = "Lgj;"
   )
   private class736 field6497;
   @OriginalMember(
      owner = "client!fd",
      name = "h",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field6487;
   @OriginalMember(
      owner = "client!fd",
      name = "o",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field6479;
   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field6496;
   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "I"
   )
   private int field6483;
   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6500 = new String[]{method3583(method3582("\u0013n\u001dft")), method3583(method3582("\u0013n\u001dkt")), method3583(method3582("\u0013n\u001dht")), method3583(method3582("\u001b\u007f_A")), method3583(method3582("\u000e$\u001d\u0003!")), method3583(method3582("\u0013n\u001dlt")), method3583(method3582("\u0013n\u001det")), method3583(method3582("\u0013n\u001dit")), method3583(method3582("\u0013n\u001ddt")), method3583(method3582("\u0013n\u001dK5\u001bk_D&\u0010\"")), method3583(method3582("\u0013n\u001d\u00115\u001bcG\u0013t")), method3583(method3582("\u0013n\u001d_)\u001b\"")), method3583(method3582("\u0013n\u001djt")), method3583(method3582("\u0013n\u001dot")), method3583(method3582("\u0013n\u001dgt")), method3583(method3582("\u0013n\u001dnt"))};
   @OriginalMember(
      owner = "client!fd",
      name = "q",
      descriptor = "[F"
   )
   public static float[] field6480 = new float[16];
   @OriginalMember(
      owner = "client!fd",
      name = "r",
      descriptor = "I"
   )
   public static int field6475;
   @OriginalMember(
      owner = "client!fd",
      name = "x",
      descriptor = "I"
   )
   public static int field6476;
   @OriginalMember(
      owner = "client!fd",
      name = "l",
      descriptor = "I"
   )
   public static int field6477;
   @OriginalMember(
      owner = "client!fd",
      name = "k",
      descriptor = "I"
   )
   public static int field6478;
   @OriginalMember(
      owner = "client!fd",
      name = "c",
      descriptor = "I"
   )
   public static int field6481;
   @OriginalMember(
      owner = "client!fd",
      name = "e",
      descriptor = "I"
   )
   public static int field6482;
   @OriginalMember(
      owner = "client!fd",
      name = "s",
      descriptor = "I"
   )
   public static int field6485;
   @OriginalMember(
      owner = "client!fd",
      name = "d",
      descriptor = "I"
   )
   public static int field6486;
   @OriginalMember(
      owner = "client!fd",
      name = "j",
      descriptor = "I"
   )
   public static int field6488;
   @OriginalMember(
      owner = "client!fd",
      name = "w",
      descriptor = "I"
   )
   public static int field6492;
   @OriginalMember(
      owner = "client!fd",
      name = "y",
      descriptor = "I"
   )
   public static int field6495;
   @OriginalMember(
      owner = "client!fd",
      name = "f",
      descriptor = "I"
   )
   public static int field6498;
   @OriginalMember(
      owner = "client!fd",
      name = "g",
      descriptor = "Lww;"
   )
   public static class339 field6491;
   @OriginalMember(
      owner = "client!fd",
      name = "v",
      descriptor = "Lit;"
   )
   private class769 field6494;
   @OriginalMember(
      owner = "client!fd",
      name = "p",
      descriptor = "[B"
   )
   private byte[] field6490;

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method3571(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field1481;

      try {
         ++field6482;
         if (!this.field6493) {
            if (this.field6484) {
               this.field6484 = false;
               throw new IOException();
            } else {
               if (this.field6490 == null) {
                  this.field6490 = new byte[this.field6483];
               }

               synchronized(this) {
                  if (arg3 != 10) {
                     this.run();
                  }

                  int var7 = 0;
                  if (var5) {
                     this.field6490[this.field6499] = arg2[arg1 + var7];
                     this.field6499 = (this.field6499 + 1) % this.field6483;
                     if (~((this.field6489 - -this.field6483 + -100) % this.field6483) == ~this.field6499) {
                        throw new IOException();
                     }

                     ++var7;
                  }

                  while(true) {
                     class471 var10000;
                     if (arg0 <= var7) {
                        var10000 = this;
                        if (!var5) {
                           if (this.field6494 == null) {
                              this.field6494 = this.field6497.method5338(0, 3, this);
                           }

                           this.notifyAll();
                           return;
                        }
                     } else {
                        this.field6490[this.field6499] = arg2[arg1 + var7];
                        this.field6499 = (this.field6499 + 1) % this.field6483;
                        var10000 = this;
                     }

                     if (~((var10000.field6489 - -this.field6483 + -100) % this.field6483) == ~this.field6499) {
                        throw new IOException();
                     }

                     ++var7;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6500[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6500[4] : field6500[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3572(int arg0) throws IOException {
      try {
         ++field6498;
         if (arg0 != 1) {
            method3574(false);
         }

         return this.field6493 ? 0 : this.field6479.read();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6500[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method3573(int arg0, char arg1) {
      try {
         ++field6481;
         if (arg0 != 48) {
            field6491 = null;
         }

         return arg1 >= '0' && ~arg1 >= -58 || arg1 >= 'A' && ~arg1 >= -91 || arg1 >= 'a' && arg1 <= 'z';
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6500[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "(Z)Lgea;"
   )
   public static final class66 method3574(boolean arg0) {
      try {
         ++field6477;
         class66 var1 = new class66(518);
         class747.field10919 = new int[4];
         class747.field10919[0] = (int)(Math.random() * 9.9999999E7D);
         class747.field10919[3] = (int)(9.9999999E7D * Math.random());
         class747.field10919[2] = (int)(Math.random() * 9.9999999E7D);
         class747.field10919[1] = (int)(9.9999999E7D * Math.random());
         if (!arg0) {
            field6480 = null;
         }

         var1.method593(10, 867770704);
         var1.method649((byte)-124, class747.field10919[0]);
         var1.method649((byte)-124, class747.field10919[1]);
         var1.method649((byte)-124, class747.field10919[2]);
         var1.method649((byte)-124, class747.field10919[3]);
         return var1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6500[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         this.method3578(1);
         ++field6485;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6500[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(CLjava/lang/String;ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method3575(char arg0, String arg1, int arg2, String arg3) {
      boolean var4 = client.field1481;

      try {
         ++field6492;
         int var5 = arg1.length();
         int var6 = arg3.length();
         int var7 = var5;
         int var8 = var6 + -1;
         if (~var8 != -1) {
            int var9 = 0;

            do {
               var9 = arg1.indexOf(arg0, var9);
               if (~var9 > -1) {
                  break;
               }

               var7 += var8;
               ++var9;
            } while(!var4);
         }

         StringBuffer var10 = new StringBuffer(var7);
         int var11 = arg2;

         while(true) {
            int var12 = arg1.indexOf(arg0, var11);
            if (var12 >= 0) {
               var10.append(arg1.substring(var11, var12));
               var11 = var12 + 1;
               var10.append(arg3);
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            var10.append(arg1.substring(var11));
            break;
         }

         return var10.toString();
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field6500[2] + arg0 + ',' + (arg1 != null ? field6500[4] : field6500[3]) + ',' + arg2 + ',' + (arg3 != null ? field6500[4] : field6500[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3576(boolean arg0) {
      try {
         if (!arg0) {
            field6480 = null;
         }

         field6480 = null;
         field6491 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6500[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3577(int arg0) throws IOException {
      try {
         ++field6476;
         if (!this.field6493) {
            if (arg0 >= 68) {
               if (this.field6484) {
                  this.field6484 = false;
                  throw new IOException();
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6500[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3578(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field6488;
         if (!this.field6493) {
            if (arg0 != 1) {
               this.method3579(115);
            }

            synchronized(this) {
               this.field6493 = true;
               this.notifyAll();
            }

            if (this.field6494 != null) {
               if (var2) {
                  class340.method2717(1L, (byte)-119);
               }

               while(~this.field6494.field11210 == -1) {
                  class340.method2717(1L, (byte)-119);
               }

               if (this.field6494.field11210 == 1) {
                  try {
                     ((Thread)this.field6494.field11212).join();
                  } catch (InterruptedException var5) {
                  }
               }
            }

            this.field6494 = null;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6500[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3579(int arg0) {
      try {
         if (arg0 < -90) {
            ++field6486;
            if (!this.field6493) {
               this.field6479 = new class646();
               this.field6496 = new class322();
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6500[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(I[BBI)V"
   )
   public final void method3580(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
      boolean var5 = client.field1481;

      try {
         ++field6475;
         if (!this.field6493) {
            int var6 = -114 % ((arg2 - 91) / 32);
            if (var5 || ~arg0 < -1) {
               do {
                  int var7 = this.field6479.read(arg1, arg3, arg0);
                  if (var7 <= 0) {
                     throw new EOFException();
                  }

                  arg0 -= var7;
                  arg3 += var7;
               } while(~arg0 < -1);

            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6500[6] + arg0 + ',' + (arg1 != null ? field6500[4] : field6500[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3581(int arg0) throws IOException {
      try {
         if (arg0 != 31335) {
            return -128;
         } else {
            ++field6478;
            return this.field6493 ? 0 : this.field6479.available();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6500[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fd",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Lgj;I)V"
   )
   public class471(Socket arg0, class736 arg1, int arg2) throws IOException {
      try {
         this.field6497 = arg1;
         this.field6487 = arg0;
         this.field6487.setSoTimeout(30000);
         this.field6487.setTcpNoDelay(true);
         this.field6479 = this.field6487.getInputStream();
         this.field6496 = this.field6487.getOutputStream();
         this.field6483 = arg2;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6500[10] + (arg0 != null ? field6500[4] : field6500[3]) + ',' + (arg1 != null ? field6500[4] : field6500[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3582(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3583(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
