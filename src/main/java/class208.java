import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class208 implements Runnable {
   @OriginalMember(
      owner = "client!fh",
      name = "e",
      descriptor = "I"
   )
   private int field2965 = 0;
   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "I"
   )
   private int field2971 = 0;
   @OriginalMember(
      owner = "client!fh",
      name = "l",
      descriptor = "I"
   )
   private int field2967;
   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field2960;
   @OriginalMember(
      owner = "client!fh",
      name = "h",
      descriptor = "[B"
   )
   private byte[] field2964;
   @OriginalMember(
      owner = "client!fh",
      name = "o",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field2958;
   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2972 = new String[]{method1802(method1801("\u000b+yEj")), method1802(method1801("\u000b+y@j")), method1802(method1801("\u000b+yv7\u0003k")), method1802(method1801("\u000b+yFj")), method1802(method1801("\u00036;h")), method1802(method1801("\u0016my*?")), method1802(method1801("\u000b+yAj")), method1802(method1801("\u000b+y8+\u0003*#:j")), method1802(method1801("\u000b+yGj"))};
   @OriginalMember(
      owner = "client!fh",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field2957 = false;
   @OriginalMember(
      owner = "client!fh",
      name = "g",
      descriptor = "I"
   )
   public static int field2959;
   @OriginalMember(
      owner = "client!fh",
      name = "i",
      descriptor = "I"
   )
   public static int field2961;
   @OriginalMember(
      owner = "client!fh",
      name = "f",
      descriptor = "I"
   )
   public static int field2962;
   @OriginalMember(
      owner = "client!fh",
      name = "d",
      descriptor = "I"
   )
   public static int field2968;
   @OriginalMember(
      owner = "client!fh",
      name = "c",
      descriptor = "I"
   )
   public static int field2969;
   @OriginalMember(
      owner = "client!fh",
      name = "n",
      descriptor = "Llda;"
   )
   public static class355 field2966;
   @OriginalMember(
      owner = "client!fh",
      name = "m",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field2963;
   @OriginalMember(
      owner = "client!fh",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field2970;

   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1796(boolean arg0) {
      try {
         field2970 = null;
         if (arg0) {
            field2966 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2972[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method1797(int arg0, byte arg1) throws IOException {
      try {
         ++field2959;
         if (arg0 > 0 && this.field2967 > arg0) {
            synchronized(this) {
               if (arg1 != 45) {
                  return false;
               } else {
                  int var5;
                  label40: {
                     if (this.field2971 > this.field2965) {
                        var5 = -this.field2971 + this.field2965 + this.field2967;
                        if (!client.field10022) {
                           break label40;
                        }
                     }

                     var5 = -this.field2971 + this.field2965;
                  }

                  if (var5 < arg0) {
                     if (this.field2963 != null) {
                        throw new IOException(this.field2963.toString());
                     } else {
                        this.notifyAll();
                        return false;
                     }
                  } else {
                     return true;
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field2972[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1798(byte arg0) {
      try {
         this.field2960 = new class629();
         ++field2969;
         if (arg0 != 91) {
            method1796(false);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2972[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "([BIZI)I"
   )
   public final int method1799(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
      boolean var5 = client.field10022;

      try {
         ++field2962;
         if (arg3 >= 0 && ~arg1 <= -1 && ~arg0.length <= ~(arg1 + arg3)) {
            synchronized(this) {
               int var7;
               label58: {
                  if (~this.field2971 >= ~this.field2965) {
                     var7 = -this.field2971 + this.field2965;
                     if (!var5) {
                        break label58;
                     }
                  }

                  var7 = -this.field2971 + this.field2965 + this.field2967;
               }

               if (var7 < arg3) {
                  arg3 = var7;
               }

               if (arg2) {
                  this.field2964 = null;
               }

               if (arg3 == 0 && this.field2963 != null) {
                  throw new IOException(this.field2963.toString());
               } else {
                  label49: {
                     if (~this.field2967 <= ~(this.field2971 + arg3)) {
                        class474.method3640(this.field2964, this.field2971, arg0, arg1, arg3);
                        if (!var5) {
                           break label49;
                        }
                     }

                     int var8 = -this.field2971 + this.field2967;
                     class474.method3640(this.field2964, this.field2971, arg0, arg1, var8);
                     class474.method3640(this.field2964, 0, arg0, arg1 + var8, -var8 + arg3);
                  }

                  this.field2971 = (this.field2971 + arg3) % this.field2967;
                  this.notifyAll();
                  return arg3;
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field2972[3] + (arg0 != null ? field2972[5] : field2972[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1800(boolean arg0) {
      try {
         ++field2968;
         synchronized(this) {
            if (this.field2963 == null) {
               this.field2963 = new IOException("");
            }

            this.notifyAll();
            if (arg0) {
               method1796(false);
            }
         }

         try {
            this.field2958.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2972[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field10022;

      try {
         ++field2961;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label57: {
                     if (this.field2963 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (this.field2971 != 0) {
                        if (this.field2965 < this.field2971) {
                           var3 = this.field2971 + -1 + -this.field2965;
                           if (!var1) {
                              break label57;
                           }
                        }

                        var3 = -this.field2965 + this.field2967;
                        if (!var1) {
                           break label57;
                        }
                     }

                     var3 = -this.field2965 - 1 + this.field2967;
                  }

                  if (var3 > 0) {
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
               var4 = this.field2960.read(this.field2964, this.field2965, var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            } catch (IOException var17) {
               IOException var5 = var17;
               synchronized(this) {
                  this.field2963 = var5;
                  return;
               }
            }

            synchronized(this) {
               this.field2965 = (this.field2965 - -var4) % this.field2967;
            }
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field2972[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "<init>",
      descriptor = "(Ljava/io/InputStream;I)V"
   )
   public class208(InputStream arg0, int arg1) {
      try {
         this.field2967 = arg1 + 1;
         this.field2960 = arg0;
         this.field2964 = new byte[this.field2967];
         this.field2958 = new Thread(this);
         this.field2958.setDaemon(true);
         this.field2958.start();
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2972[7] + (arg0 != null ? field2972[5] : field2972[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
