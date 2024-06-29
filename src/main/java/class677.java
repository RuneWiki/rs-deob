import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class677 implements Runnable {
   @OriginalMember(
      owner = "client!lc",
      name = "j",
      descriptor = "I"
   )
   private int field9928 = 0;
   @OriginalMember(
      owner = "client!lc",
      name = "w",
      descriptor = "Z"
   )
   private boolean field9930 = false;
   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "Z"
   )
   private boolean field9929 = false;
   @OriginalMember(
      owner = "client!lc",
      name = "v",
      descriptor = "I"
   )
   private int field9933 = 0;
   @OriginalMember(
      owner = "client!lc",
      name = "h",
      descriptor = "Lbj;"
   )
   private class255 field9945;
   @OriginalMember(
      owner = "client!lc",
      name = "r",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field9939;
   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field9949;
   @OriginalMember(
      owner = "client!lc",
      name = "q",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field9940;
   @OriginalMember(
      owner = "client!lc",
      name = "n",
      descriptor = "I"
   )
   private int field9948;
   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9950 = new String[]{method4967(method4966("\b}Qnp")), method4967(method4966("\b}Q\u00181\nw\u000b\u001ap")), method4967(method4966("\nk\u0013H")), method4967(method4966("\u001f0Q\n%")), method4967(method4966("\b}Qbp")), method4967(method4966("\b}Qep")), method4967(method4966("\b}Qlp")), method4967(method4966("\b}Qap")), method4967(method4966("\b}QV-\n6")), method4967(method4966("\u0007q\u0010O1\u0001v\u0010W,")), method4967(method4966("\u0007q\u0010O1\u0001n\rA>\rf")), method4967(method4966("_>2E I_\u0018Ae")), method4967(method4966("_>:\\(\rl\u001aWe0v\n\bxT/Rn9\n3N\u001doT>O\u0014bT.E\u0014hDY2pcDS\u001e\\u%y\u001a\u0019h")), method4967(method4966("_>:\\(\rl\u001aWe")), method4967(method4966("\u0000q\u001cQ5\u0001p\u000b\n;\u000bq\u0014M=Y<")), method4967(method4966("_>\tA*\u0017w\u0010JeU%_T9\u0010vB\u000bcDz\u0010I9\rpB")), method4967(method4966("\b}Qcp")), method4967(method4966("\u0017{\u000bP1\ny\f\u0019")), method4967(method4966("\b}Q`p")), method4967(method4966("\b}Qgp")), method4967(method4966("\b}QB1\n\u007f\u0013M\"\u00016")), method4967(method4966("\b}Qmp")), method4967(method4966("\b}Qfp"))};
   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "I"
   )
   public static int field9944 = 0;
   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "I"
   )
   public static int field9926;
   @OriginalMember(
      owner = "client!lc",
      name = "k",
      descriptor = "I"
   )
   public static int field9927;
   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "I"
   )
   public static int field9931;
   @OriginalMember(
      owner = "client!lc",
      name = "t",
      descriptor = "I"
   )
   public static int field9932;
   @OriginalMember(
      owner = "client!lc",
      name = "g",
      descriptor = "I"
   )
   public static int field9935;
   @OriginalMember(
      owner = "client!lc",
      name = "s",
      descriptor = "I"
   )
   public static int field9937;
   @OriginalMember(
      owner = "client!lc",
      name = "x",
      descriptor = "I"
   )
   public static int field9938;
   @OriginalMember(
      owner = "client!lc",
      name = "o",
      descriptor = "I"
   )
   public static int field9941;
   @OriginalMember(
      owner = "client!lc",
      name = "m",
      descriptor = "I"
   )
   public static int field9942;
   @OriginalMember(
      owner = "client!lc",
      name = "u",
      descriptor = "I"
   )
   public static int field9943;
   @OriginalMember(
      owner = "client!lc",
      name = "l",
      descriptor = "I"
   )
   public static int field9946;
   @OriginalMember(
      owner = "client!lc",
      name = "i",
      descriptor = "I"
   )
   public static int field9947;
   @OriginalMember(
      owner = "client!lc",
      name = "p",
      descriptor = "Lvea;"
   )
   private class289 field9936;
   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "[B"
   )
   private byte[] field9934;

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method4956(String arg0, byte arg1) {
      try {
         ++field9927;
         class701.field10211 = arg0;
         if (class126.field1586 != null) {
            try {
               String var2 = class126.field1586.getParameter(field9950[10]);
               if (arg1 > -31) {
                  field9944 = 62;
               }

               String var4;
               label29: {
                  String var3 = class126.field1586.getParameter(field9950[9]);
                  var4 = var2 + field9950[17] + arg0 + field9950[15] + var3;
                  if (arg0.length() == 0) {
                     var4 = var4 + field9950[12];
                     if (!client.field4273) {
                        break label29;
                     }
                  }

                  var4 = var4 + field9950[13] + class688.method5020(94608000000L + class792.method5708(-25005), -109) + field9950[11] + 94608000L;
               }

               class164.method1308(field9950[14] + var4 + "\"", -31829, class126.field1586);
            } catch (Throwable var6) {
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9950[16] + (arg0 != null ? field9950[3] : field9950[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4957(int arg0) {
      try {
         ++field9931;
         if (arg0 == 0) {
            if (!this.field9930) {
               this.field9949 = new class397();
               this.field9940 = new class348();
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9950[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4958(int arg0) throws IOException {
      try {
         ++field9941;
         if (this.field9930) {
            return 0;
         } else {
            return arg0 != 25264 ? 116 : this.field9949.read();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9950[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method4959(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      boolean var5 = client.field4273;

      try {
         ++field9946;
         if (!this.field9930) {
            if (this.field9929) {
               this.field9929 = false;
               throw new IOException();
            } else {
               if (this.field9934 == null) {
                  this.field9934 = new byte[this.field9948];
               }

               synchronized(this) {
                  int var7 = arg2;
                  if (var5) {
                     this.field9934[this.field9933] = arg1[arg3 + arg2];
                     this.field9933 = (this.field9933 - -1) % this.field9948;
                     if (this.field9933 == (this.field9948 + this.field9928 - 100) % this.field9948) {
                        throw new IOException();
                     }

                     var7 = arg2 + 1;
                  }

                  while(true) {
                     while(~var7 > ~arg0) {
                        this.field9934[this.field9933] = arg1[arg3 + var7];
                        this.field9933 = (this.field9933 - -1) % this.field9948;
                        if (this.field9933 == (this.field9948 + this.field9928 - 100) % this.field9948) {
                           throw new IOException();
                        }

                        ++var7;
                     }

                     if (!var5) {
                        if (this.field9936 == null) {
                           this.field9936 = this.field9945.method1956(this, -100, 3);
                        }

                        this.notifyAll();
                        return;
                     }

                     if (this.field9933 == (this.field9948 + this.field9928 - 100) % this.field9948) {
                        throw new IOException();
                     }

                     ++var7;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9950[4] + arg0 + ',' + (arg1 != null ? field9950[3] : field9950[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4960(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field9943;
         if (!this.field9930) {
            synchronized(this) {
               this.field9930 = true;
               this.notifyAll();
            }

            if (this.field9936 != null) {
               if (var2) {
                  class173.method1347(-83, 1L);
               }

               while(true) {
                  int var10000;
                  if (this.field9936.field3826 != 0) {
                     var10000 = this.field9936.field3826;
                     if (!var2) {
                        if (var10000 == 1) {
                           try {
                              ((Thread)this.field9936.field3830).join();
                           } catch (InterruptedException var5) {
                           }
                        }
                        break;
                     }
                  } else {
                     var10000 = -83;
                  }

                  class173.method1347(var10000, 1L);
               }
            }

            if (arg0 != 90) {
               this.field9945 = null;
            }

            this.field9936 = null;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9950[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(ZI[BI)V"
   )
   public final void method4961(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      try {
         ++field9932;
         if (!arg0) {
            this.field9928 = -124;
         }

         if (!this.field9930) {
            while(arg1 > 0) {
               int var5 = this.field9949.read(arg2, arg3, arg1);
               if (var5 <= 0) {
                  throw new EOFException();
               }

               arg3 += var5;
               arg1 -= var5;
            }

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9950[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9950[3] : field9950[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      try {
         this.method4960((byte)90);
         ++field9935;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9950[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4962(int arg0) throws IOException {
      try {
         ++field9938;
         if (!this.field9930) {
            if (this.field9929) {
               this.field9929 = false;
               throw new IOException();
            } else if (arg0 > -31) {
               method4964(98, (byte)-18);
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9950[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method4963(boolean arg0) throws IOException {
      try {
         if (!arg0) {
            field9944 = -11;
         }

         ++field9926;
         return this.field9930 ? 0 : this.field9949.available();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9950[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method4964(int arg0, byte arg1) {
      try {
         ++field9942;
         if (arg1 >= -90) {
            return false;
         } else {
            return ~arg0 <= -1 && arg0 <= 3 || arg0 == 9;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9950[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4965(int arg0, int arg1) {
      try {
         if (arg0 != 28991) {
            return false;
         } else {
            ++field9937;
            return arg1 == 0 || ~arg1 == -3;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9950[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Lbj;I)V"
   )
   public class677(Socket arg0, class255 arg1, int arg2) throws IOException {
      try {
         this.field9945 = arg1;
         this.field9939 = arg0;
         this.field9939.setSoTimeout(30000);
         this.field9939.setTcpNoDelay(true);
         this.field9949 = this.field9939.getInputStream();
         this.field9940 = this.field9939.getOutputStream();
         this.field9948 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9950[1] + (arg0 != null ? field9950[3] : field9950[2]) + ',' + (arg1 != null ? field9950[3] : field9950[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4966(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4967(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
