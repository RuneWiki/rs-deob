import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class532 {
   @OriginalMember(
      owner = "client!qn",
      name = "q",
      descriptor = "J"
   )
   private long field7806 = -1L;
   @OriginalMember(
      owner = "client!qn",
      name = "w",
      descriptor = "I"
   )
   private int field7821 = 0;
   @OriginalMember(
      owner = "client!qn",
      name = "m",
      descriptor = "J"
   )
   private long field7816 = -1L;
   @OriginalMember(
      owner = "client!qn",
      name = "j",
      descriptor = "Lqp;"
   )
   private class492 field7808;
   @OriginalMember(
      owner = "client!qn",
      name = "l",
      descriptor = "J"
   )
   private long field7801;
   @OriginalMember(
      owner = "client!qn",
      name = "x",
      descriptor = "J"
   )
   private long field7818;
   @OriginalMember(
      owner = "client!qn",
      name = "y",
      descriptor = "[B"
   )
   private byte[] field7810;
   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "[B"
   )
   private byte[] field7820;
   @OriginalMember(
      owner = "client!qn",
      name = "o",
      descriptor = "J"
   )
   private long field7819;
   @OriginalMember(
      owner = "client!qn",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7824 = new String[]{method4055(method4054("\b6gKP")), method4055(method4054("06?b\u0014\u0010<ip\u001d\u001c3iw\u0017Y")), method4055(method4054("\b6gDP")), method4055(method4054("Y1'#\u001e\u00104,#")), method4055(method4054("\u0002vg-\u0005")), method4055(method4054("\u0017-%o")), method4055(method4054("\b6g?\u0011\u00171==P")), method4055(method4054("\b6gHP")), method4055(method4054("\b6gBP")), method4055(method4054("\b6gIP")), method4055(method4054("\b6gJP")), method4055(method4054("\b6gEP")), method4055(method4054("\b6gGP")), method4055(method4054("\b6gFP")), method4055(method4054("\b6gAP")), method4055(method4054("\b6g@P"))};
   @OriginalMember(
      owner = "client!qn",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field7802 = false;
   @OriginalMember(
      owner = "client!qn",
      name = "p",
      descriptor = "I"
   )
   public static int field7796;
   @OriginalMember(
      owner = "client!qn",
      name = "v",
      descriptor = "I"
   )
   public static int field7797;
   @OriginalMember(
      owner = "client!qn",
      name = "B",
      descriptor = "I"
   )
   public static int field7799;
   @OriginalMember(
      owner = "client!qn",
      name = "f",
      descriptor = "I"
   )
   public static int field7803;
   @OriginalMember(
      owner = "client!qn",
      name = "i",
      descriptor = "I"
   )
   public static int field7804;
   @OriginalMember(
      owner = "client!qn",
      name = "k",
      descriptor = "I"
   )
   public static int field7805;
   @OriginalMember(
      owner = "client!qn",
      name = "n",
      descriptor = "I"
   )
   public static int field7809;
   @OriginalMember(
      owner = "client!qn",
      name = "g",
      descriptor = "I"
   )
   public static int field7814;
   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "I"
   )
   private int field7815;
   @OriginalMember(
      owner = "client!qn",
      name = "e",
      descriptor = "I"
   )
   public static int field7822;
   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "I"
   )
   public static int field7823;
   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "J"
   )
   public static long field7807;
   @OriginalMember(
      owner = "client!qn",
      name = "s",
      descriptor = "J"
   )
   private long field7817;
   @OriginalMember(
      owner = "client!qn",
      name = "h",
      descriptor = "Llga;"
   )
   public static class20 field7813;
   @OriginalMember(
      owner = "client!qn",
      name = "d",
      descriptor = "Lff;"
   )
   public static class310 field7812;
   @OriginalMember(
      owner = "client!qn",
      name = "t",
      descriptor = "Lqn;"
   )
   public static class532 field7811;
   @OriginalMember(
      owner = "client!qn",
      name = "A",
      descriptor = "Ljb;"
   )
   public static class754 field7798;
   @OriginalMember(
      owner = "client!qn",
      name = "u",
      descriptor = "Lga;"
   )
   public static class76 field7800;

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method4043(int arg0) throws IOException {
      boolean var2 = client.field1481;

      try {
         if (~this.field7806 != 0L) {
            if (this.field7817 != this.field7806) {
               this.field7808.method3742(this.field7806, 88);
               this.field7817 = this.field7806;
            }

            this.field7808.method3741(this.field7821, 0, this.field7820, 1);
            this.field7817 += (long)this.field7821;
            if (~this.field7817 < ~this.field7801) {
               this.field7801 = this.field7817;
            }

            long var3;
            long var5;
            label78: {
               var3 = -1L;
               var5 = -1L;
               if (this.field7816 > this.field7806 || (long)this.field7815 + this.field7816 <= this.field7806) {
                  if (~this.field7806 < ~this.field7816 || ~((long)this.field7821 + this.field7806) >= ~this.field7816) {
                     break label78;
                  }

                  var3 = this.field7816;
                  if (!var2) {
                     break label78;
                  }
               }

               var3 = this.field7806;
            }

            label53: {
               if (~((long)this.field7821 + this.field7806) < ~this.field7816 && (long)this.field7815 + this.field7816 >= this.field7806 - -((long)this.field7821)) {
                  var5 = (long)this.field7821 + this.field7806;
                  if (!var2) {
                     break label53;
                  }
               }

               if (this.field7806 < (long)this.field7815 + this.field7816 && ~(this.field7806 - -((long)this.field7821)) <= ~((long)this.field7815 + this.field7816)) {
                  var5 = (long)this.field7815 + this.field7816;
               }
            }

            if (~var3 < 0L && ~var5 < ~var3) {
               int var7 = (int)(-var3 + var5);
               class349.method2762(this.field7820, (int)(-this.field7806 + var3), this.field7810, (int)(-this.field7816 + var3), var7);
            }

            this.field7821 = 0;
            this.field7806 = -1L;
         }

         ++field7799;
         if (arg0 >= -62) {
            field7802 = true;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7824[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4044(byte arg0) throws IOException {
      try {
         ++field7803;
         if (arg0 != 0) {
            this.method4050(-50);
         }

         this.method4043(-84);
         this.field7808.method3744(arg0 ^ 1571);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7824[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(II[BI)V"
   )
   public final void method4045(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field1481;

      try {
         ++field7814;

         try {
            if (this.field7818 < (long)arg3 + this.field7819) {
               this.field7818 = (long)arg3 + this.field7819;
            }

            if (~this.field7806 != 0L && (this.field7806 > this.field7819 || ~((long)this.field7821 + this.field7806) > ~this.field7819)) {
               this.method4043(arg1 + -81);
            }

            if ((long)arg1 != this.field7806 && (long)this.field7820.length + this.field7806 < (long)arg3 + this.field7819) {
               int var6 = (int)(this.field7806 - this.field7819 + (long)this.field7820.length);
               class349.method2762(arg2, arg0, this.field7820, (int)(this.field7819 - this.field7806), var6);
               this.field7819 += (long)var6;
               arg3 -= var6;
               arg0 += var6;
               this.field7821 = this.field7820.length;
               this.method4043(arg1 + -68);
            }

            if (~this.field7820.length <= ~arg3) {
               if (arg3 > 0) {
                  if (~this.field7806 == 0L) {
                     this.field7806 = this.field7819;
                  }

                  class349.method2762(arg2, arg0, this.field7820, (int)(this.field7819 - this.field7806), arg3);
                  this.field7819 += (long)arg3;
                  if (~(-this.field7806 + this.field7819) < ~((long)this.field7821)) {
                     this.field7821 = (int)(this.field7819 - this.field7806);
                  }

               }
            } else {
               if (this.field7819 != this.field7817) {
                  this.field7808.method3742(this.field7819, arg1 ^ -119);
                  this.field7817 = this.field7819;
               }

               this.field7808.method3741(arg3, arg0, arg2, arg1 + 2);
               this.field7817 += (long)arg3;
               if (~this.field7817 < ~this.field7801) {
                  this.field7801 = this.field7817;
               }

               long var7;
               long var9;
               label94: {
                  var7 = -1L;
                  var9 = -1L;
                  if (~this.field7816 >= ~this.field7819 && ~(this.field7816 - -((long)this.field7815)) < ~this.field7819) {
                     var7 = this.field7819;
                     if (!var5) {
                        break label94;
                     }
                  }

                  if (~this.field7819 >= ~this.field7816 && this.field7816 < (long)arg3 + this.field7819) {
                     var7 = this.field7816;
                  }
               }

               label88: {
                  if (~((long)arg3 + this.field7819) < ~this.field7816 && ~((long)this.field7815 + this.field7816) <= ~((long)arg3 + this.field7819)) {
                     var9 = (long)arg3 + this.field7819;
                     if (!var5) {
                        break label88;
                     }
                  }

                  if (this.field7819 < (long)this.field7815 + this.field7816 && this.field7819 - -((long)arg3) >= (long)this.field7815 + this.field7816) {
                     var9 = (long)this.field7815 + this.field7816;
                  }
               }

               if (var7 > -1L && ~var9 < ~var7) {
                  int var11 = (int)(-var7 + var9);
                  class349.method2762(arg2, (int)((long)arg0 + -this.field7819 - -var7), this.field7810, (int)(var7 - this.field7816), var11);
               }

               this.field7819 += (long)arg3;
            }
         } catch (IOException var14) {
            this.field7817 = -1L;
            throw var14;
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field7824[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7824[4] : field7824[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method4046(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field7797;
            return ~(arg2 & 32) != -1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7824[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method4047(byte[] arg0, int arg1) throws IOException {
      try {
         this.method4052(arg1 ^ -76, arg0.length, arg0, arg1);
         ++field7796;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7824[11] + (arg0 != null ? field7824[4] : field7824[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method4048(byte arg0) throws IOException {
      boolean var2 = client.field1481;

      try {
         if (arg0 <= 110) {
            this.field7817 = 0L;
         }

         ++field7823;
         this.field7815 = 0;
         if (this.field7819 != this.field7817) {
            this.field7808.method3742(this.field7819, -28);
            this.field7817 = this.field7819;
         }

         this.field7816 = this.field7819;
         if (var2 || this.field7810.length > this.field7815) {
            do {
               int var3 = this.field7810.length + -this.field7815;
               if (~var3 < -200000001) {
                  var3 = 200000000;
               }

               int var4 = this.field7808.method3739(this.field7810, var3, (byte)-114, this.field7815);
               if (var4 == -1) {
                  break;
               }

               this.field7815 += var4;
               this.field7817 += (long)var4;
            } while(this.field7810.length > this.field7815);
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7824[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(JI)V"
   )
   public final void method4049(long arg0, int arg1) throws IOException {
      try {
         ++field7804;
         if (arg1 != -1) {
            method4046(true, 52, -17);
         }

         if (~arg0 > -1L) {
            throw new IOException(field7824[1] + arg0 + field7824[3] + this.method4053(arg1 + -14196));
         } else {
            this.field7819 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7824[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method4050(int arg0) {
      try {
         if (arg0 != 0) {
            method4046(true, 21, 20);
         }

         ++field7809;
         return this.field7818;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7824[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4051(byte arg0) {
      try {
         field7811 = null;
         field7813 = null;
         if (arg0 < 65) {
            field7813 = null;
         }

         field7812 = null;
         field7800 = null;
         field7798 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7824[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(II[BI)V"
   )
   public final void method4052(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
      boolean var5 = client.field1481;

      try {
         ++field7822;
         int var6 = 60 / ((arg0 - -30) / 34);

         try {
            if (~(arg3 - -arg1) < ~arg2.length) {
               throw new ArrayIndexOutOfBoundsException(arg1 + arg3 + -arg2.length);
            }

            if (this.field7806 != -1L && ~this.field7806 >= ~this.field7819 && ~((long)arg1 + this.field7819) >= ~(this.field7806 - -((long)this.field7821))) {
               class349.method2762(this.field7820, (int)(-this.field7806 + this.field7819), arg2, arg3, arg1);
               this.field7819 += (long)arg1;
               return;
            }

            long var7 = this.field7819;
            int var9 = arg3;
            int var10 = arg1;
            if (this.field7816 <= this.field7819 && ~((long)this.field7815 + this.field7816) < ~this.field7819) {
               int var11 = (int)(this.field7816 - this.field7819 + (long)this.field7815);
               if (~var11 < ~arg1) {
                  var11 = arg1;
               }

               class349.method2762(this.field7810, (int)(-this.field7816 + this.field7819), arg2, arg3, var11);
               this.field7819 += (long)var11;
               arg1 -= var11;
               arg3 += var11;
            }

            int var13;
            if (this.field7810.length >= arg1) {
               if (~arg1 < -1) {
                  this.method4048((byte)120);
                  var13 = arg1;
                  if (this.field7815 < arg1) {
                     var13 = this.field7815;
                  }

                  class349.method2762(this.field7810, 0, arg2, arg3, var13);
                  arg1 -= var13;
                  arg3 += var13;
                  this.field7819 += (long)var13;
               }
            } else {
               this.field7808.method3742(this.field7819, -20);
               this.field7817 = this.field7819;
               if (var5 || ~arg1 < -1) {
                  do {
                     int var12 = this.field7808.method3739(arg2, arg1, (byte)-116, arg3);
                     if (~var12 == 0) {
                        break;
                     }

                     arg3 += var12;
                     arg1 -= var12;
                     this.field7819 += (long)var12;
                     this.field7817 += (long)var12;
                  } while(~arg1 < -1);
               }

               if (var5 && ~arg1 < -1) {
                  this.method4048((byte)120);
                  var13 = arg1;
                  if (this.field7815 < arg1) {
                     var13 = this.field7815;
                  }

                  class349.method2762(this.field7810, 0, arg2, arg3, var13);
                  arg1 -= var13;
                  arg3 += var13;
                  this.field7819 += (long)var13;
               }
            }

            if (this.field7806 != -1L) {
               if (this.field7819 < this.field7806 && ~arg1 < -1) {
                  int var14 = (int)(this.field7806 - this.field7819) + arg3;
                  if (~(arg1 + arg3) > ~var14) {
                     var14 = arg1 + arg3;
                     if (var5) {
                        arg2[arg3++] = 0;
                        --arg1;
                        ++this.field7819;
                     }
                  }

                  while(~arg3 > ~var14) {
                     arg2[arg3++] = 0;
                     --arg1;
                     ++this.field7819;
                  }
               }

               long var15;
               long var17;
               label198: {
                  var15 = -1L;
                  var17 = -1L;
                  if (this.field7806 < var7 || ~this.field7806 <= ~((long)var10 + var7)) {
                     if (this.field7806 > var7 || (long)this.field7821 + this.field7806 <= var7) {
                        break label198;
                     }

                     var15 = var7;
                     if (!var5) {
                        break label198;
                     }
                  }

                  var15 = this.field7806;
               }

               label199: {
                  if (var7 >= (long)this.field7821 + this.field7806 || var7 - -((long)var10) < (long)this.field7821 + this.field7806) {
                     if (this.field7806 >= (long)var10 + var7 || ~((long)var10 + var7) < ~((long)this.field7821 + this.field7806)) {
                        break label199;
                     }

                     var17 = var7 - -((long)var10);
                     if (!var5) {
                        break label199;
                     }
                  }

                  var17 = (long)this.field7821 + this.field7806;
               }

               if (var15 > -1L && ~var17 < ~var15) {
                  int var19 = (int)(-var15 + var17);
                  class349.method2762(this.field7820, (int)(-this.field7806 + var15), arg2, var9 - -((int)(-var7 + var15)), var19);
                  if (~var17 < ~this.field7819) {
                     arg1 = (int)((long)arg1 - (-this.field7819 + var17));
                     this.field7819 = var17;
                  }
               }
            }
         } catch (IOException var22) {
            this.field7817 = -1L;
            throw var22;
         }

         if (~arg1 < -1) {
            throw new EOFException();
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field7824[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7824[4] : field7824[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(I)Ljava/io/File;"
   )
   private final File method4053(int arg0) {
      try {
         if (arg0 != -14197) {
            return null;
         } else {
            ++field7805;
            return this.field7808.method3740(0);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7824[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(Lqp;II)V"
   )
   public class532(class492 arg0, int arg1, int arg2) throws IOException {
      try {
         this.field7808 = arg0;
         this.field7818 = this.field7801 = arg0.method3743(3);
         this.field7810 = new byte[arg1];
         this.field7820 = new byte[arg2];
         this.field7819 = 0L;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7824[6] + (arg0 != null ? field7824[4] : field7824[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4054(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4055(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
