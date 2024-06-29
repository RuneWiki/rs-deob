import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 implements Runnable {
   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "I"
   )
   private int field37 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "k",
      descriptor = "I"
   )
   private int field33 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "g",
      descriptor = "Z"
   )
   private boolean field42 = false;
   @OriginalMember(
      owner = "client!ft",
      name = "w",
      descriptor = "Z"
   )
   private boolean field39 = false;
   @OriginalMember(
      owner = "client!ft",
      name = "l",
      descriptor = "Ljava/net/Socket;"
   )
   private Socket field26;
   @OriginalMember(
      owner = "client!ft",
      name = "h",
      descriptor = "Loo;"
   )
   private class651 field47;
   @OriginalMember(
      owner = "client!ft",
      name = "s",
      descriptor = "Ljava/io/InputStream;"
   )
   private InputStream field28;
   @OriginalMember(
      owner = "client!ft",
      name = "p",
      descriptor = "Ljava/io/OutputStream;"
   )
   private OutputStream field24;
   @OriginalMember(
      owner = "client!ft",
      name = "m",
      descriptor = "I"
   )
   private int field27;
   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field48 = new String[]{method34(method33("\u001e8J3\u0014\u0016d")), method34(method33("\u001e8J\u0006I")), method34(method33("\u001e8J'\b\u0016-\b(\u001b\u001dd")), method34(method33("\u001e8J}\b\u0016%\u0010\u007fI")), method34(method33("\u0003bJo\u001c")), method34(method33("\u00169\b-")), method34(method33("\u001e8J\u0002I")), method34(method33("\u001e8J\u000bI")), method34(method33("\u001e8J\u0004I")), method34(method33("\u001e8J\u0003I")), method34(method33("\u001e8J\bI")), method34(method33("\u001e8J\u0007I")), method34(method33("\u001e8J\u0005I")), method34(method33("\u001e8J\tI"))};
   @OriginalMember(
      owner = "client!ft",
      name = "u",
      descriptor = "I"
   )
   public static int field25;
   @OriginalMember(
      owner = "client!ft",
      name = "o",
      descriptor = "I"
   )
   public static int field29;
   @OriginalMember(
      owner = "client!ft",
      name = "n",
      descriptor = "I"
   )
   public static int field30;
   @OriginalMember(
      owner = "client!ft",
      name = "q",
      descriptor = "I"
   )
   public static int field31;
   @OriginalMember(
      owner = "client!ft",
      name = "t",
      descriptor = "I"
   )
   public static int field34;
   @OriginalMember(
      owner = "client!ft",
      name = "r",
      descriptor = "I"
   )
   public static int field35;
   @OriginalMember(
      owner = "client!ft",
      name = "i",
      descriptor = "I"
   )
   public static int field38;
   @OriginalMember(
      owner = "client!ft",
      name = "e",
      descriptor = "I"
   )
   public static int field40;
   @OriginalMember(
      owner = "client!ft",
      name = "f",
      descriptor = "I"
   )
   public static int field41;
   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "I"
   )
   public static int field43;
   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "I"
   )
   public static int field46;
   @OriginalMember(
      owner = "client!ft",
      name = "v",
      descriptor = "J"
   )
   public static long field44;
   @OriginalMember(
      owner = "client!ft",
      name = "j",
      descriptor = "Lika;"
   )
   public static class445 field45;
   @OriginalMember(
      owner = "client!ft",
      name = "x",
      descriptor = "Leca;"
   )
   private class789 field36;
   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "[B"
   )
   private byte[] field32;

   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public final void method23(int arg0) {
      try {
         ++field35;
         if (!this.field39) {
            this.field28 = new class149();
            this.field24 = new class251();
            if (arg0 != 0) {
               method24((byte)127);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field48[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(B)V",
      line = 20
   )
   public static void method24(byte arg0) {
      try {
         int var1 = 14 % ((arg0 - -20) / 39);
         field45 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field48[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(I[BII)V",
      line = 31
   )
   public final void method25(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
      try {
         if (arg3 != 0) {
            field41 = -127;
         }

         ++field38;
         if (!this.field39) {
            while(arg0 > 0) {
               int var5 = this.field28.read(arg1, arg2, arg0);
               if (var5 <= 0) {
                  throw new EOFException();
               }

               arg0 -= var5;
               arg2 += var5;
            }

         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field48[9] + arg0 + ',' + (arg1 != null ? field48[4] : field48[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "finalize",
      descriptor = "()V",
      line = 58
   )
   protected final void finalize() {
      try {
         this.method29(1);
         ++field46;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field48[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(B)V",
      line = 68
   )
   public final void method26(byte arg0) throws IOException {
      try {
         ++field40;
         if (!this.field39) {
            if (this.field42) {
               this.field42 = false;
               throw new IOException();
            } else if (arg0 != 42) {
               this.finalize();
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field48[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "()V",
      line = 89
   )
   public static final void method27() {
      class458.field6722 = class458.field6721;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "run",
      descriptor = "()V",
      line = 93
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IBI)Z",
      line = 167
   )
   public static final boolean method28(int arg0, byte arg1, int arg2) {
      try {
         ++field29;
         if (arg1 != -43) {
            method28(39, (byte)-79, 127);
         }

         return (544 & arg0) == 544 | (arg0 & 24) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field48[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(I)V",
      line = 179
   )
   public final void method29(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 == 1) {
            ++field34;
            if (!this.field39) {
               synchronized(this) {
                  this.field39 = true;
                  this.notifyAll();
               }

               if (this.field36 != null) {
                  if (var2) {
                     class624.method4569((byte)98, 1L);
                  }

                  while(true) {
                     int var10000;
                     if (this.field36.field11542 != 0) {
                        var10000 = this.field36.field11542;
                        if (!var2) {
                           if (var10000 == 1) {
                              try {
                                 ((Thread)this.field36.field11537).join();
                              } catch (InterruptedException var5) {
                              }
                           }
                           break;
                        }
                     } else {
                        var10000 = 98;
                     }

                     class624.method4569((byte)var10000, 1L);
                  }
               }

               this.field36 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field48[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(II[BB)V",
      line = 217
   )
   public final void method30(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
      boolean var5 = client.field4564;

      try {
         ++field25;
         if (!this.field39) {
            if (this.field42) {
               this.field42 = false;
               throw new IOException();
            } else {
               if (this.field32 == null) {
                  this.field32 = new byte[this.field27];
               }

               synchronized(this) {
                  int var7 = 0;
                  if (var5) {
                     this.field32[this.field33] = arg2[arg1 + var7];
                     this.field33 = (this.field33 + 1) % this.field27;
                     if (~((this.field37 + this.field27 + -100) % this.field27) == ~this.field33) {
                        throw new IOException();
                     }

                     ++var7;
                  }

                  while(true) {
                     class4 var10000;
                     if (var7 >= arg0) {
                        var10000 = this;
                        if (!var5) {
                           if (this.field36 == null) {
                              this.field36 = this.field47.method4792((byte)-97, 3, this);
                           }

                           if (arg3 != -68) {
                              this.field27 = -78;
                           }

                           this.notifyAll();
                           return;
                        }
                     } else {
                        this.field32[this.field33] = arg2[arg1 + var7];
                        var10000 = this;
                     }

                     var10000.field33 = (this.field33 + 1) % this.field27;
                     if (~((this.field37 + this.field27 + -100) % this.field27) == ~this.field33) {
                        throw new IOException();
                     }

                     ++var7;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field48[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field48[4] : field48[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "(I)I",
      line = 270
   )
   public final int method31(int arg0) throws IOException {
      try {
         ++field31;
         if (arg0 > -13) {
            return -87;
         } else {
            return this.field39 ? 0 : this.field28.available();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field48[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "<init>",
      descriptor = "(Ljava/net/Socket;Loo;I)V",
      line = 319
   )
   public class4(Socket arg0, class651 arg1, int arg2) throws IOException {
      try {
         this.field26 = arg0;
         this.field47 = arg1;
         this.field26.setSoTimeout(30000);
         this.field26.setTcpNoDelay(true);
         this.field28 = this.field26.getInputStream();
         this.field24 = this.field26.getOutputStream();
         this.field27 = arg2;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field48[3] + (arg0 != null ? field48[4] : field48[5]) + ',' + (arg1 != null ? field48[4] : field48[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(I)I",
      line = 290
   )
   public final int method32(int arg0) throws IOException {
      try {
         ++field43;
         if (arg0 >= -46) {
            this.field47 = null;
         }

         return this.field39 ? 0 : this.field28.read();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field48[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method33(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method34(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
