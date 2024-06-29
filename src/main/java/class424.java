import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class424 implements Runnable {
   @OriginalMember(
      owner = "client!oh",
      name = "i",
      descriptor = "I"
   )
   private int field6429 = 0;
   @OriginalMember(
      owner = "client!oh",
      name = "e",
      descriptor = "I"
   )
   private int field6430 = 0;
   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "Z"
   )
   private boolean field6441 = false;
   @OriginalMember(
      owner = "client!oh",
      name = "t",
      descriptor = "Z"
   )
   private boolean field6448 = false;
   @OriginalMember(
      owner = "client!oh",
      name = "l",
      descriptor = "Lhg;"
   )
   private class719 field6435;
   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field6431;
   @OriginalMember(
      owner = "client!oh",
      name = "g",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field6426;
   @OriginalMember(
      owner = "client!oh",
      name = "j",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field6427;
   @OriginalMember(
      owner = "client!oh",
      name = "s",
      descriptor = "I"
   )
   private int field6444;
   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6449 = new String[]{method3228(method3227("@X\b\u0015|AQJ\u001aoJ\u0018")), method3228(method3227("@X\b4=")), method3228(method3227("@X\b;=")), method3228(method3227("@X\b\u0001`A\u0018")), method3228(method3227("@X\b0=")), method3228(method3227("AEJ\u001f")), method3228(method3227("T\u001e\b]h")), method3228(method3227("@X\b1=")), method3228(method3227("@X\b2=")), method3228(method3227("@X\b6=")), method3228(method3227("@X\b5=")), method3228(method3227("@X\b7=")), method3228(method3227("@X\bO|AYRM="))};
   @OriginalMember(
      owner = "client!oh",
      name = "q",
      descriptor = "I"
   )
   public static int field6436 = 0;
   @OriginalMember(
      owner = "client!oh",
      name = "w",
      descriptor = "I"
   )
   public static int field6428;
   @OriginalMember(
      owner = "client!oh",
      name = "d",
      descriptor = "I"
   )
   public static int field6432;
   @OriginalMember(
      owner = "client!oh",
      name = "k",
      descriptor = "I"
   )
   public static int field6433;
   @OriginalMember(
      owner = "client!oh",
      name = "h",
      descriptor = "I"
   )
   public static int field6434;
   @OriginalMember(
      owner = "client!oh",
      name = "o",
      descriptor = "I"
   )
   public static int field6437;
   @OriginalMember(
      owner = "client!oh",
      name = "f",
      descriptor = "I"
   )
   public static int field6439;
   @OriginalMember(
      owner = "client!oh",
      name = "p",
      descriptor = "I"
   )
   public static int field6440;
   @OriginalMember(
      owner = "client!oh",
      name = "m",
      descriptor = "I"
   )
   public static int field6443;
   @OriginalMember(
      owner = "client!oh",
      name = "c",
      descriptor = "I"
   )
   public static int field6445;
   @OriginalMember(
      owner = "client!oh",
      name = "u",
      descriptor = "I"
   )
   public static int field6446;
   @OriginalMember(
      owner = "client!oh",
      name = "n",
      descriptor = "I"
   )
   public static int field6447;
   @OriginalMember(
      owner = "client!oh",
      name = "r",
      descriptor = "Ldaa;"
   )
   private class12 field6438;
   @OriginalMember(
      owner = "client!oh",
      name = "v",
      descriptor = "[B"
   )
   private byte[] field6442;

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(II[BI)V",
      line = 10
   )
   public final void method3219(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      int var5 = client.field4530;

      try {
         ++field6443;
         if (!this.field6448) {
            while(true) {
               int var10000;
               if (~arg3 >= -1) {
                  var10000 = arg0;
                  if (var5 == 0) {
                     if (arg0 != -455) {
                        this.field6441 = false;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = this.field6426.read(arg2, arg1, arg3);
               }

               int var6 = var10000;
               if (~var6 >= -1) {
                  throw new EOFException();
               }

               arg3 -= var6;
               arg1 += var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6449[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6449[6] : field6449[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "(I)I",
      line = 36
   )
   public final int method3220(int arg0) throws IOException {
      try {
         if (arg0 != 0) {
            method3224(12, (class86)null, -25, 120);
         }

         ++field6439;
         return this.field6448 ? 0 : this.field6426.read();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6449[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "run",
      descriptor = "()V",
      line = 50
   )
   public final void run() {
      int var1 = client.field4530;

      try {
         try {
            label260:
            while(true) {
               synchronized(this){}

               Throwable var10000;
               boolean var10001;
               int var3;
               try {
                  if (~this.field6430 == ~this.field6429) {
                     if (this.field6448) {
                        break;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var27) {
                     }
                  }

                  var3 = this.field6430;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  throw var10000;
               }

               int var4;
               do {
                  try {
                     label243: {
                        if (~this.field6429 > ~this.field6430) {
                           var4 = this.field6444 - this.field6430;
                           if (var1 == 0) {
                              break label243;
                           }
                        }

                        var4 = -this.field6430 + this.field6429;
                     }
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     throw var10000;
                  }

                  if (var4 <= 0) {
                     continue label260;
                  }

                  try {
                     this.field6427.write(this.field6442, var3, var4);
                  } catch (IOException var28) {
                     this.field6441 = true;
                     break;
                  }
               } while(var1 != 0);

               this.field6430 = (this.field6430 + var4) % this.field6444;

               try {
                  if (~this.field6430 == ~this.field6429) {
                     this.field6427.flush();
                  }
               } catch (IOException var26) {
                  this.field6441 = true;
               }
            }

            try {
               if (this.field6426 != null) {
                  this.field6426.close();
               }

               if (this.field6427 != null) {
                  this.field6427.close();
               }

               if (this.field6431 != null) {
                  this.field6431.close();
               }
            } catch (IOException var25) {
            }

            this.field6442 = null;
         } catch (Exception var31) {
            class238.method1776(-31, var31, (String)null);
         }

         ++field6432;
      } catch (RuntimeException var32) {
         throw class670.method4877(var32, field6449[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "c",
      descriptor = "(I)V",
      line = 120
   )
   public final void method3221(int arg0) throws IOException {
      try {
         ++field6445;
         if (!this.field6448) {
            if (arg0 <= 120) {
               method3224(41, (class86)null, 44, 18);
            }

            if (this.field6441) {
               this.field6441 = false;
               throw new IOException();
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6449[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(Z)V",
      line = 148
   )
   public final void method3222(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field6433;
         if (!this.field6448) {
            synchronized(this) {
               this.field6448 = arg0;
               this.notifyAll();
            }

            if (this.field6438 != null) {
               if (var2 != 0) {
                  class89.method817(1L, 2535);
               }

               while(this.field6438.field159 == 0) {
                  class89.method817(1L, 2535);
               }

               if (this.field6438.field159 == 1) {
                  try {
                     ((Thread)this.field6438.field160).join();
                  } catch (InterruptedException var5) {
                  }
               }
            }

            this.field6438 = null;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6449[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Lhg;I)V",
      line = 330
   )
   public class424(Socket arg0, class719 arg1, int arg2) throws IOException {
      try {
         this.field6435 = arg1;
         this.field6431 = arg0;
         this.field6431.setSoTimeout(30000);
         this.field6431.setTcpNoDelay(true);
         this.field6426 = this.field6431.getInputStream();
         this.field6427 = this.field6431.getOutputStream();
         this.field6444 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6449[12] + (arg0 != null ? field6449[6] : field6449[5]) + ',' + (arg1 != null ? field6449[6] : field6449[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "d",
      descriptor = "(I)I",
      line = 189
   )
   public final int method3223(int arg0) throws IOException {
      try {
         if (arg0 != 0) {
            this.run();
         }

         ++field6446;
         return this.field6448 ? 0 : this.field6426.available();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6449[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(ILkl;II)J",
      line = 216
   )
   public static final long method3224(int arg0, class86 arg1, int arg2, int arg3) {
      try {
         ++field6428;
         long var4 = 4194304L;
         long var6 = Long.MIN_VALUE;
         class557 var8 = class151.field1896.method5072(30, arg1.method350(25061));
         long var9 = (long)(arg1.method355(-29081) << 14 | arg2 | arg0 << 7 | arg1.method358(34) << 20 | 1073741824);
         if (var8.field8317 == 0) {
            var9 |= var6;
         }

         if (arg3 != 18774) {
            method3224(-32, (class86)null, 1, 125);
         }

         if (var8.field8288 == 1) {
            var9 |= var4;
         }

         return var9 | (long)arg1.method350(25061) << 32;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field6449[9] + arg0 + ',' + (arg1 != null ? field6449[6] : field6449[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(I)V",
      line = 244
   )
   public final void method3225(int arg0) {
      try {
         ++field6440;
         if (!this.field6448) {
            if (arg0 != 0) {
               this.field6431 = null;
            }

            this.field6426 = new class729();
            this.field6427 = new class473();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6449[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "finalize",
      descriptor = "()V",
      line = 264
   )
   protected final void finalize() {
      try {
         this.method3222(true);
         ++field6434;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6449[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "([BIII)V",
      line = 275
   )
   public final void method3226(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      int var5 = client.field4530;

      try {
         ++field6447;
         if (!this.field6448) {
            if (this.field6441) {
               this.field6441 = false;
               throw new IOException();
            } else {
               if (this.field6442 == null) {
                  this.field6442 = new byte[this.field6444];
               }

               synchronized(this) {
                  int var7 = 0;
                  if (var5 != 0) {
                     this.field6442[this.field6429] = arg0[arg2 + var7];
                     this.field6429 = (this.field6429 + 1) % this.field6444;
                     if (~this.field6429 == ~((this.field6444 + -100 + this.field6430) % this.field6444)) {
                        throw new IOException();
                     }

                     ++var7;
                  }

                  while(true) {
                     while(~var7 > ~arg1) {
                        this.field6442[this.field6429] = arg0[arg2 + var7];
                        this.field6429 = (this.field6429 + 1) % this.field6444;
                        if (~this.field6429 == ~((this.field6444 + -100 + this.field6430) % this.field6444)) {
                           throw new IOException();
                        }

                        ++var7;
                     }

                     if (var5 == 0) {
                        if (arg3 != 1) {
                           this.field6429 = 100;
                        }

                        if (this.field6438 == null) {
                           this.field6438 = this.field6435.method5214(this, arg3 ^ 87, 3);
                        }

                        this.notifyAll();
                        return;
                     }

                     if (arg3 == 1) {
                        throw new IOException();
                     }

                     ++var7;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field6449[4] + (arg0 != null ? field6449[6] : field6449[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3227(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3228(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
