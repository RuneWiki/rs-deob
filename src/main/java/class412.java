import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class412 implements Runnable {
   @OriginalMember(
      owner = "client!ada",
      name = "y",
      descriptor = "I"
   )
   private int field6403 = 0;
   @OriginalMember(
      owner = "client!ada",
      name = "v",
      descriptor = "Z"
   )
   private boolean field6411 = false;
   @OriginalMember(
      owner = "client!ada",
      name = "h",
      descriptor = "Z"
   )
   private boolean field6410 = false;
   @OriginalMember(
      owner = "client!ada",
      name = "s",
      descriptor = "I"
   )
   private int field6418 = 0;
   @OriginalMember(
      owner = "client!ada",
      name = "o",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field6395;
   @OriginalMember(
      owner = "client!ada",
      name = "p",
      descriptor = "Lsu;"
   )
   private class289 field6409;
   @OriginalMember(
      owner = "client!ada",
      name = "k",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field6417;
   @OriginalMember(
      owner = "client!ada",
      name = "w",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field6399;
   @OriginalMember(
      owner = "client!ada",
      name = "x",
      descriptor = "I"
   )
   private int field6404;
   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6419 = new String[]{method3306(method3305("\\\u001b\u0011q\u0019T\u0011\u0019+\u001b\u0015")), method3306(method3305("FQ^qX")), method3306(method3305("S\n\u001c3")), method3306(method3305("\\\u001b\u0011qm\u0015")), method3306(method3305("\\\u001b\u0011qc\u0015")), method3306(method3305("\\\u001b\u0011qf\u0015")), method3306(method3305("\\\u001b\u0011qg\u0015")), method3306(method3305("\\\u001b\u0011q`\u0015")), method3306(method3305("\\\u001b\u0011qWH\u0011X")), method3306(method3305("\\\u001b\u0011qd\u0015")), method3306(method3305("\\\u001b\u0011qb\u0015")), method3306(method3305("\\\u001b\u0011ql\u0015")), method3306(method3305("\\\u001b\u0011qCT\u0011\u00113LG\u001aX")), method3306(method3305("\\\u001b\u0011qa\u0015"))};
   @OriginalMember(
      owner = "client!ada",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field6412 = false;
   @OriginalMember(
      owner = "client!ada",
      name = "q",
      descriptor = "I"
   )
   public static int field6394;
   @OriginalMember(
      owner = "client!ada",
      name = "i",
      descriptor = "I"
   )
   public static int field6396;
   @OriginalMember(
      owner = "client!ada",
      name = "u",
      descriptor = "I"
   )
   public static int field6397;
   @OriginalMember(
      owner = "client!ada",
      name = "g",
      descriptor = "I"
   )
   public static int field6398;
   @OriginalMember(
      owner = "client!ada",
      name = "j",
      descriptor = "I"
   )
   public static int field6400;
   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "I"
   )
   public static int field6402;
   @OriginalMember(
      owner = "client!ada",
      name = "f",
      descriptor = "I"
   )
   public static int field6405;
   @OriginalMember(
      owner = "client!ada",
      name = "r",
      descriptor = "I"
   )
   public static int field6406;
   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "I"
   )
   public static int field6407;
   @OriginalMember(
      owner = "client!ada",
      name = "d",
      descriptor = "I"
   )
   public static int field6413;
   @OriginalMember(
      owner = "client!ada",
      name = "l",
      descriptor = "I"
   )
   public static int field6415;
   @OriginalMember(
      owner = "client!ada",
      name = "m",
      descriptor = "Lbja;"
   )
   private class275 field6414;
   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "Lkf;"
   )
   public static class401 field6408;
   @OriginalMember(
      owner = "client!ada",
      name = "e",
      descriptor = "Leia;"
   )
   public static class81 field6401;
   @OriginalMember(
      owner = "client!ada",
      name = "t",
      descriptor = "[B"
   )
   private byte[] field6416;

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(II[BI)V",
      line = 11
   )
   public final void method3296(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field1786;

      try {
         ++field6406;
         if (!this.field6411) {
            if (this.field6410) {
               this.field6410 = false;
               throw new IOException();
            } else {
               if (this.field6416 == null) {
                  this.field6416 = new byte[this.field6404];
               }

               synchronized(this) {
                  int var7 = 0;
                  if (var5) {
                     this.field6416[this.field6418] = arg2[arg0 + var7];
                     this.field6418 = (this.field6418 + 1) % this.field6404;
                     if (~((this.field6404 + -100 + this.field6403) % this.field6404) == ~this.field6418) {
                        throw new IOException();
                     }

                     ++var7;
                  }

                  while(true) {
                     class412 var10000;
                     if (arg3 <= var7) {
                        var10000 = this;
                        if (!var5) {
                           if (this.field6414 == null) {
                              this.field6414 = this.field6409.method2442(this, false, 3);
                           }

                           this.notifyAll();
                           if (arg1 != 1) {
                              this.field6404 = -18;
                           }

                           return;
                        }
                     } else {
                        this.field6416[this.field6418] = arg2[arg0 + var7];
                        var10000 = this;
                     }

                     var10000.field6418 = (this.field6418 + 1) % this.field6404;
                     if (~((this.field6404 + -100 + this.field6403) % this.field6404) == ~this.field6418) {
                        throw new IOException();
                     }

                     ++var7;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6419[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6419[1] : field6419[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "(I)V",
      line = 65
   )
   public final void method3297(int arg0) {
      try {
         ++field6394;
         if (!this.field6411) {
            this.field6417 = new class544();
            this.field6399 = new class682();
            if (arg0 != -1) {
               this.field6399 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6419[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "(I)V",
      line = 83
   )
   public static void method3298(int arg0) {
      try {
         field6401 = null;
         field6408 = null;
         if (arg0 != -27431) {
            field6408 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6419[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "e",
      descriptor = "(I)V",
      line = 97
   )
   public final void method3299(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field6398;
         if (!this.field6411) {
            synchronized(this) {
               this.field6411 = true;
               this.notifyAll();
            }

            if (this.field6414 != null) {
               if (var2) {
                  class697.method5128(1L, -95);
               }

               while(this.field6414.field4398 == 0) {
                  class697.method5128(1L, -95);
               }

               if (~this.field6414.field4398 == -2) {
                  try {
                     ((Thread)this.field6414.field4401).join();
                  } catch (InterruptedException var5) {
                  }
               }
            }

            this.field6414 = null;
            if (arg0 != -2) {
               this.field6395 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6419[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(I[BII)V",
      line = 136
   )
   public final void method3300(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field1786;

      try {
         ++field6400;
         if (!this.field6411) {
            if (arg3 != 24322) {
               this.run();
               if (!var5 && arg2 <= 0) {
                  return;
               }
            } else if (arg2 <= 0) {
               return;
            }

            do {
               int var6 = this.field6417.read(arg1, arg0, arg2);
               if (~var6 >= -1) {
                  throw new EOFException();
               }

               arg0 += var6;
               arg2 -= var6;
            } while(arg2 > 0);

         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6419[4] + arg0 + ',' + (arg1 != null ? field6419[1] : field6419[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "finalize",
      descriptor = "()V",
      line = 165
   )
   protected final void finalize() {
      try {
         this.method3299(-2);
         ++field6405;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6419[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "run",
      descriptor = "()V",
      line = 173
   )
   public final void run() {
      boolean var1 = client.field1786;

      try {
         try {
            label260:
            while(true) {
               synchronized(this){}

               Throwable var10000;
               boolean var10001;
               int var3;
               try {
                  if (~this.field6418 == ~this.field6403) {
                     if (this.field6411) {
                        break;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var27) {
                     }
                  }

                  var3 = this.field6403;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  throw var10000;
               }

               int var4;
               do {
                  try {
                     label243: {
                        if (this.field6418 < this.field6403) {
                           var4 = -this.field6403 + this.field6404;
                           if (!var1) {
                              break label243;
                           }
                        }

                        var4 = -this.field6403 + this.field6418;
                     }
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     throw var10000;
                  }

                  if (~var4 >= -1) {
                     continue label260;
                  }

                  try {
                     this.field6399.write(this.field6416, var3, var4);
                  } catch (IOException var28) {
                     this.field6410 = true;
                     break;
                  }
               } while(var1);

               this.field6403 = (this.field6403 + var4) % this.field6404;

               try {
                  if (~this.field6418 == ~this.field6403) {
                     this.field6399.flush();
                  }
               } catch (IOException var26) {
                  this.field6410 = true;
               }
            }

            try {
               if (this.field6417 != null) {
                  this.field6417.close();
               }

               if (this.field6399 != null) {
                  this.field6399.close();
               }

               if (this.field6395 != null) {
                  this.field6395.close();
               }
            } catch (IOException var25) {
            }

            this.field6416 = null;
         } catch (Exception var31) {
            class281.method2349(1, (String)null, var31);
         }

         ++field6413;
      } catch (RuntimeException var32) {
         throw class482.method3757(var32, field6419[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "([J[Ljava/lang/Object;I)V",
      line = 245
   )
   public static final void method3301(long[] arg0, Object[] arg1, int arg2) {
      try {
         ++field6402;
         int var3 = -75 / ((arg2 - -41) / 45);
         class295.method2481(arg0.length - 1, arg1, 0, arg0, 1116);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6419[3] + (arg0 != null ? field6419[1] : field6419[2]) + ',' + (arg1 != null ? field6419[1] : field6419[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "d",
      descriptor = "(I)I",
      line = 255
   )
   public final int method3302(int arg0) throws IOException {
      try {
         ++field6396;
         if (arg0 != 0) {
            return -15;
         } else {
            return this.field6411 ? 0 : this.field6417.read();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6419[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(I)I",
      line = 269
   )
   public final int method3303(int arg0) throws IOException {
      try {
         ++field6397;
         if (arg0 != 0) {
            this.field6404 = 125;
         }

         return this.field6411 ? 0 : this.field6417.available();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6419[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Lsu;I)V",
      line = 327
   )
   public class412(Socket arg0, class289 arg1, int arg2) throws IOException {
      try {
         this.field6395 = arg0;
         this.field6409 = arg1;
         this.field6395.setSoTimeout(30000);
         this.field6395.setTcpNoDelay(true);
         this.field6417 = this.field6395.getInputStream();
         this.field6399 = this.field6395.getOutputStream();
         this.field6404 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6419[0] + (arg0 != null ? field6419[1] : field6419[2]) + ',' + (arg1 != null ? field6419[1] : field6419[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(B)V",
      line = 302
   )
   public final void method3304(byte arg0) throws IOException {
      try {
         ++field6407;
         if (!this.field6411) {
            if (arg0 != 23) {
               this.finalize();
            }

            if (this.field6410) {
               this.field6410 = false;
               throw new IOException();
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6419[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3305(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3306(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
