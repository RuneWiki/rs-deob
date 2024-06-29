import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class110 implements Runnable {
   @OriginalMember(
      owner = "client!eda",
      name = "t",
      descriptor = "Z"
   )
   private boolean field1367 = false;
   @OriginalMember(
      owner = "client!eda",
      name = "k",
      descriptor = "I"
   )
   private int field1384 = 0;
   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "I"
   )
   private int field1382 = 0;
   @OriginalMember(
      owner = "client!eda",
      name = "m",
      descriptor = "Z"
   )
   private boolean field1379 = false;
   @OriginalMember(
      owner = "client!eda",
      name = "n",
      descriptor = "Lnu;"
   )
   private class619 field1387;
   @OriginalMember(
      owner = "client!eda",
      name = "p",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field1365;
   @OriginalMember(
      owner = "client!eda",
      name = "u",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field1366;
   @OriginalMember(
      owner = "client!eda",
      name = "g",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field1369;
   @OriginalMember(
      owner = "client!eda",
      name = "v",
      descriptor = "I"
   )
   private int field1380;
   @OriginalMember(
      owner = "client!eda",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1390 = new String[]{method900(method899("L\u0003=#`\u0001")), method900(method899("L\u0003=#S\\\tt")), method900(method899("RIr#\\")), method900(method899("L\u0003=#\u001d@\t5y\u001f\u0001")), method900(method899("G\u00120a")), method900(method899("L\u0003=#G@\t=aHS\u0002t")), method900(method899("L\u0003=#h\u0001")), method900(method899("L\u0003=#d\u0001")), method900(method899("L\u0003=#k\u0001")), method900(method899("L\u0003=#b\u0001")), method900(method899("L\u0003=#c\u0001")), method900(method899("L\u0003=#g\u0001")), method900(method899("L\u0003=#e\u0001")), method900(method899("L\u0003=#i\u0001")), method900(method899("L\u0003=#f\u0001")), method900(method899("L\u0003=#j\u0001"))};
   @OriginalMember(
      owner = "client!eda",
      name = "w",
      descriptor = "Llea;"
   )
   public static class639 field1372 = new class639(10, 4);
   @OriginalMember(
      owner = "client!eda",
      name = "i",
      descriptor = "Lek;"
   )
   public static class536 field1386 = new class536(14, 3);
   @OriginalMember(
      owner = "client!eda",
      name = "j",
      descriptor = "I"
   )
   public static int field1389 = 0;
   @OriginalMember(
      owner = "client!eda",
      name = "A",
      descriptor = "I"
   )
   public static int field1364;
   @OriginalMember(
      owner = "client!eda",
      name = "f",
      descriptor = "I"
   )
   public static int field1368;
   @OriginalMember(
      owner = "client!eda",
      name = "s",
      descriptor = "I"
   )
   public static int field1370;
   @OriginalMember(
      owner = "client!eda",
      name = "l",
      descriptor = "I"
   )
   public static int field1371;
   @OriginalMember(
      owner = "client!eda",
      name = "x",
      descriptor = "I"
   )
   public static int field1373;
   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "I"
   )
   public static int field1374;
   @OriginalMember(
      owner = "client!eda",
      name = "q",
      descriptor = "I"
   )
   public static int field1375;
   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "I"
   )
   public static int field1377;
   @OriginalMember(
      owner = "client!eda",
      name = "h",
      descriptor = "I"
   )
   public static int field1378;
   @OriginalMember(
      owner = "client!eda",
      name = "d",
      descriptor = "I"
   )
   public static int field1381;
   @OriginalMember(
      owner = "client!eda",
      name = "c",
      descriptor = "I"
   )
   public static int field1383;
   @OriginalMember(
      owner = "client!eda",
      name = "o",
      descriptor = "I"
   )
   public static int field1385;
   @OriginalMember(
      owner = "client!eda",
      name = "r",
      descriptor = "I"
   )
   public static int field1388;
   @OriginalMember(
      owner = "client!eda",
      name = "y",
      descriptor = "Lvca;"
   )
   private class296 field1363;
   @OriginalMember(
      owner = "client!eda",
      name = "e",
      descriptor = "[B"
   )
   private byte[] field1376;

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method888(byte arg0) throws IOException {
      try {
         if (arg0 != -49) {
            return -32;
         } else {
            ++field1364;
            return this.field1367 ? 0 : this.field1366.available();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1390[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method889(int arg0) throws IOException {
      try {
         if (arg0 == 0) {
            ++field1370;
            if (!this.field1367) {
               if (this.field1379) {
                  this.field1379 = false;
                  throw new IOException();
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1390[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4360;

      try {
         try {
            label260:
            while(true) {
               synchronized(this){}

               Throwable var10000;
               boolean var10001;
               int var3;
               try {
                  if (this.field1384 == this.field1382) {
                     if (this.field1367) {
                        break;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var27) {
                     }
                  }

                  var3 = this.field1384;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  throw var10000;
               }

               int var4;
               do {
                  try {
                     label243: {
                        if (this.field1382 < this.field1384) {
                           var4 = -this.field1384 + this.field1380;
                           if (!var1) {
                              break label243;
                           }
                        }

                        var4 = -this.field1384 + this.field1382;
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
                     this.field1369.write(this.field1376, var3, var4);
                  } catch (IOException var28) {
                     this.field1379 = true;
                     break;
                  }
               } while(var1);

               this.field1384 = (this.field1384 - -var4) % this.field1380;

               try {
                  if (~this.field1384 == ~this.field1382) {
                     this.field1369.flush();
                  }
               } catch (IOException var26) {
                  this.field1379 = true;
               }
            }

            try {
               if (this.field1366 != null) {
                  this.field1366.close();
               }

               if (this.field1369 != null) {
                  this.field1369.close();
               }

               if (this.field1365 != null) {
                  this.field1365.close();
               }
            } catch (IOException var25) {
            }

            this.field1376 = null;
         } catch (Exception var31) {
            class668.method4876(-124, (String)null, var31);
         }

         ++field1368;
      } catch (RuntimeException var32) {
         throw class237.method1823(var32, field1390[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method890(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         label28: {
            ++field1381;
            if (class666.field9666 == 1) {
               class719.method5229(class194.field2756, arg0, arg1, (byte)-126);
               if (!var3) {
                  break label28;
               }
            }

            if (~class666.field9666 == -3) {
               label23: {
                  if (!class681.field10034) {
                     class444.method3263(0, arg0, arg1);
                     if (!var3) {
                        break label23;
                     }
                  }

                  class444.method3263(arg2, class85.method755((byte)78) + arg0, class592.method4305((byte)72) + arg1);
               }
            }
         }

         class194.field2756 = null;
         class666.field9666 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1390[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method891(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field4360;

      try {
         ++field1377;
         if (!this.field1367) {
            if (this.field1379) {
               this.field1379 = false;
               throw new IOException();
            } else {
               if (this.field1376 == null) {
                  this.field1376 = new byte[this.field1380];
               }

               synchronized(this) {
                  int var7 = 0;
                  if (arg3 >= -80) {
                     this.field1366 = null;
                     if (var5) {
                        this.field1376[this.field1382] = arg0[arg2 + var7];
                        this.field1382 = (this.field1382 + 1) % this.field1380;
                        if (~this.field1382 == ~((this.field1384 - -this.field1380 + -100) % this.field1380)) {
                           throw new IOException();
                        }

                        ++var7;
                     }
                  }

                  while(true) {
                     class110 var10000;
                     if (var7 >= arg1) {
                        var10000 = this;
                        if (!var5) {
                           if (this.field1363 == null) {
                              this.field1363 = this.field1387.method4504(this, 3, 0);
                           }

                           this.notifyAll();
                           return;
                        }
                     } else {
                        this.field1376[this.field1382] = arg0[arg2 + var7];
                        this.field1382 = (this.field1382 + 1) % this.field1380;
                        var10000 = this;
                     }

                     if (~var10000.field1382 == ~((this.field1384 - -this.field1380 + -100) % this.field1380)) {
                        throw new IOException();
                     }

                     ++var7;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1390[6] + (arg0 != null ? field1390[2] : field1390[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method892(int arg0) {
      try {
         field1386 = null;
         int var1 = 108 % ((arg0 - 50) / 40);
         field1372 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1390[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method893(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field1378;
         if (!this.field1367) {
            synchronized(this) {
               this.field1367 = true;
               this.notifyAll();
            }

            if (this.field1363 != null) {
               if (var2) {
                  class661.method4825(0, 1L);
               }

               while(true) {
                  int var10000;
                  if (~this.field1363.field4078 != -1) {
                     var10000 = ~this.field1363.field4078;
                     if (!var2) {
                        if (var10000 == -2) {
                           try {
                              ((Thread)this.field1363.field4077).join();
                           } catch (InterruptedException var5) {
                           }
                        }
                        break;
                     }
                  } else {
                     var10000 = 0;
                  }

                  class661.method4825(var10000, 1L);
               }
            }

            this.field1363 = null;
            if (arg0 != 0) {
               this.field1376 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1390[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method894(int arg0) {
      try {
         ++field1385;
         if (!this.field1367) {
            this.field1366 = new class741();
            int var2 = -126 % ((arg0 - 59) / 36);
            this.field1369 = new class78();
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1390[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method895(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
      boolean var5 = client.field4360;

      try {
         ++field1374;
         if (!this.field1367) {
            if (arg2 <= 31) {
               this.field1366 = null;
               if (!var5 && ~arg1 >= -1) {
                  return;
               }
            } else if (~arg1 >= -1) {
               return;
            }

            do {
               int var6 = this.field1366.read(arg3, arg0, arg1);
               if (~var6 >= -1) {
                  throw new EOFException();
               }

               arg1 -= var6;
               arg0 += var6;
            } while(~arg1 < -1);

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1390[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1390[2] : field1390[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method896(int arg0, int arg1, int arg2) {
      try {
         ++field1383;
         if (arg2 > -6) {
            return false;
         } else {
            return (arg1 & 50560) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1390[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         this.method893(0);
         ++field1373;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1390[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method897(int arg0) throws IOException {
      try {
         ++field1375;
         if (this.field1367) {
            return 0;
         } else {
            return arg0 >= -91 ? 58 : this.field1366.read();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1390[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;"
   )
   public static final Class method898(String arg0, int arg1) throws ClassNotFoundException {
      try {
         ++field1371;
         if (arg0.equals("B")) {
            return Byte.TYPE;
         } else if (arg0.equals("I")) {
            return Integer.TYPE;
         } else if (arg0.equals("S")) {
            return Short.TYPE;
         } else {
            if (arg1 < 44) {
               field1372 = null;
            }

            if (arg0.equals("J")) {
               return Long.TYPE;
            } else if (arg0.equals("Z")) {
               return Boolean.TYPE;
            } else if (arg0.equals("F")) {
               return Float.TYPE;
            } else if (arg0.equals("D")) {
               return Double.TYPE;
            } else {
               return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1390[13] + (arg0 != null ? field1390[2] : field1390[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Lnu;I)V"
   )
   public class110(Socket arg0, class619 arg1, int arg2) throws IOException {
      try {
         this.field1387 = arg1;
         this.field1365 = arg0;
         this.field1365.setSoTimeout(30000);
         this.field1365.setTcpNoDelay(true);
         this.field1366 = this.field1365.getInputStream();
         this.field1369 = this.field1365.getOutputStream();
         this.field1380 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1390[3] + (arg0 != null ? field1390[2] : field1390[4]) + ',' + (arg1 != null ? field1390[2] : field1390[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method899(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method900(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
