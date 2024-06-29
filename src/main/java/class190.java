import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class190 implements Runnable {
   @OriginalMember(
      owner = "client!pv",
      name = "k",
      descriptor = "I"
   )
   private int field2408 = 0;
   @OriginalMember(
      owner = "client!pv",
      name = "i",
      descriptor = "I"
   )
   private int field2409 = 0;
   @OriginalMember(
      owner = "client!pv",
      name = "g",
      descriptor = "I"
   )
   private int field2418;
   @OriginalMember(
      owner = "client!pv",
      name = "e",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field2415;
   @OriginalMember(
      owner = "client!pv",
      name = "l",
      descriptor = "[B"
   )
   private byte[] field2412;
   @OriginalMember(
      owner = "client!pv",
      name = "m",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field2417;
   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2420 = new String[]{method1589(method1588("\r0\u0006}w")), method1589(method1588("\u00133DP")), method1589(method1588("\r0\u0006xw")), method1589(method1588("\u0006h\u0006\u0012\"")), method1589(method1588("\r0\u0006N*\u0013n")), method1589(method1588("\r0\u0006\u007fw")), method1589(method1588("\r0\u0006~w")), method1589(method1588("\r0\u0006\u00006\u0013/\\\u0002w"))};
   @OriginalMember(
      owner = "client!pv",
      name = "b",
      descriptor = "I"
   )
   public static int field2416 = 2;
   @OriginalMember(
      owner = "client!pv",
      name = "h",
      descriptor = "Lifa;"
   )
   public static class75 field2414 = new class75(12, 19);
   @OriginalMember(
      owner = "client!pv",
      name = "d",
      descriptor = "I"
   )
   public static int field2407;
   @OriginalMember(
      owner = "client!pv",
      name = "j",
      descriptor = "I"
   )
   public static int field2410;
   @OriginalMember(
      owner = "client!pv",
      name = "f",
      descriptor = "I"
   )
   public static int field2411;
   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "I"
   )
   public static int field2413;
   @OriginalMember(
      owner = "client!pv",
      name = "c",
      descriptor = "Ljava/io/IOException;"
   )
   private IOException field2419;

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(B[BII)V"
   )
   public final void method1584(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field1481;

      try {
         ++field2410;
         if (~arg2 <= -1 && arg3 >= 0 && ~(arg2 + arg3) >= ~arg1.length) {
            synchronized(this) {
               if (this.field2419 != null) {
                  throw new IOException(this.field2419.toString());
               } else {
                  int var7;
                  label53: {
                     if (this.field2409 < this.field2408) {
                        var7 = this.field2408 + -1 - this.field2409;
                        if (!var5) {
                           break label53;
                        }
                     }

                     var7 = -this.field2409 + -1 + this.field2418 + this.field2408;
                  }

                  if (arg2 > var7) {
                     throw new IOException("");
                  } else if (arg0 >= 45) {
                     label45: {
                        if (~this.field2418 > ~(this.field2409 - -arg2)) {
                           int var8 = this.field2418 - this.field2409;
                           class349.method2762(arg1, arg3, this.field2412, this.field2409, var8);
                           class349.method2762(arg1, arg3 - -var8, this.field2412, 0, -var8 + arg2);
                           if (!var5) {
                              break label45;
                           }
                        }

                        class349.method2762(arg1, arg3, this.field2412, this.field2409, arg2);
                     }

                     this.field2409 = (this.field2409 - -arg2) % this.field2418;
                     this.notifyAll();
                  }
               }
            }
         } else {
            throw new IOException();
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field2420[2] + arg0 + ',' + (arg1 != null ? field2420[3] : field2420[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field1481;

      try {
         ++field2407;

         while(true) {
            int var3;
            synchronized(this) {
               while(true) {
                  label61: {
                     if (this.field2419 != null) {
                        if (!var1) {
                           return;
                        }
                     } else if (~this.field2409 > ~this.field2408) {
                        var3 = this.field2418 + this.field2409 + -this.field2408;
                        if (!var1) {
                           break label61;
                        }
                     }

                     var3 = -this.field2408 + this.field2409;
                  }

                  if (var3 > 0) {
                     break;
                  }

                  try {
                     this.field2415.flush();
                  } catch (IOException var18) {
                     this.field2419 = var18;
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
                  if (~(this.field2408 + var3) >= ~this.field2418) {
                     this.field2415.write(this.field2412, this.field2408, var3);
                     if (!var1) {
                        break label76;
                     }
                  }

                  int var5 = -this.field2408 + this.field2418;
                  this.field2415.write(this.field2412, this.field2408, var5);
                  this.field2415.write(this.field2412, 0, -var5 + var3);
               }
            } catch (IOException var21) {
               IOException var6 = var21;
               synchronized(this) {
                  this.field2419 = var6;
                  return;
               }
            }

            synchronized(this) {
               this.field2408 = (this.field2408 + var3) % this.field2418;
            }
         }
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field2420[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1585(int arg0) {
      try {
         ++field2411;
         this.field2415 = new class335();
         if (arg0 != 19) {
            field2414 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2420[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1586(byte arg0) {
      try {
         int var1 = -18 % ((54 - arg0) / 59);
         field2414 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2420[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "<init>",
      descriptor = "(Ljava/io/OutputStream;I)V"
   )
   public class190(OutputStream arg0, int arg1) {
      try {
         this.field2418 = arg1 + 1;
         this.field2415 = arg0;
         this.field2412 = new byte[this.field2418];
         this.field2417 = new Thread(this);
         this.field2417.setDaemon(true);
         this.field2417.start();
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2420[7] + (arg0 != null ? field2420[3] : field2420[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1587(int arg0) {
      try {
         synchronized(this) {
            if (this.field2419 == null) {
               this.field2419 = new IOException("");
            }

            this.notifyAll();
            if (arg0 <= 91) {
               this.field2415 = null;
            }
         }

         ++field2413;

         try {
            this.field2417.join();
         } catch (InterruptedException var4) {
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2420[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
