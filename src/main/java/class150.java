import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class150 {
   @OriginalMember(
      owner = "client!hc",
      name = "d",
      descriptor = "Ltda;"
   )
   private class663 field1888;
   @OriginalMember(
      owner = "client!hc",
      name = "p",
      descriptor = "Lck;"
   )
   private class667 field1887;
   @OriginalMember(
      owner = "client!hc",
      name = "e",
      descriptor = "I"
   )
   public int field1876;
   @OriginalMember(
      owner = "client!hc",
      name = "h",
      descriptor = "I"
   )
   private int field1880;
   @OriginalMember(
      owner = "client!hc",
      name = "s",
      descriptor = "[B"
   )
   public byte[] field1874;
   @OriginalMember(
      owner = "client!hc",
      name = "r",
      descriptor = "I"
   )
   private int field1879;
   @OriginalMember(
      owner = "client!hc",
      name = "k",
      descriptor = "I"
   )
   private int field1891;
   @OriginalMember(
      owner = "client!hc",
      name = "m",
      descriptor = "I"
   )
   private int field1882;
   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1893 = new String[]{method1239(method1238("^f\u0017i\n")), method1239(method1238("^f\u0017h\n")), method1239(method1238("XpUM")), method1239(method1238("^f\u0017b\n")), method1239(method1238("M+\u0017\u000f_")), method1239(method1238("^f\u0017c\n")), method1239(method1238("^f\u0017`\n")), method1239(method1238("^f\u0017\u001dKXlM\u001f\n")), method1239(method1238("^f\u0017g\n")), method1239(method1238("^f\u0017f\n")), method1239(method1238("^f\u0017d\n")), method1239(method1238("^f\u0017e\n"))};
   @OriginalMember(
      owner = "client!hc",
      name = "f",
      descriptor = "Lsd;"
   )
   public static class101 field1885 = new class101(17, -1);
   @OriginalMember(
      owner = "client!hc",
      name = "g",
      descriptor = "Lwga;"
   )
   public static class779 field1892 = new class779(64);
   @OriginalMember(
      owner = "client!hc",
      name = "o",
      descriptor = "I"
   )
   public static int field1875;
   @OriginalMember(
      owner = "client!hc",
      name = "j",
      descriptor = "I"
   )
   public static int field1877;
   @OriginalMember(
      owner = "client!hc",
      name = "n",
      descriptor = "I"
   )
   public static int field1878;
   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "I"
   )
   public static int field1881;
   @OriginalMember(
      owner = "client!hc",
      name = "l",
      descriptor = "I"
   )
   public static int field1883;
   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "I"
   )
   public static int field1884;
   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "I"
   )
   public static int field1889;
   @OriginalMember(
      owner = "client!hc",
      name = "q",
      descriptor = "I"
   )
   public static int field1890;
   @OriginalMember(
      owner = "client!hc",
      name = "i",
      descriptor = "[[Ltu;"
   )
   private class367[][] field1886;

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method1229(int arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         ++field1875;
         if (this.field1886 != null) {
            int var7 = arg0 + -1 >> 7;
            int var8 = arg0 - (-arg4 + arg2) + -1 >> 7;
            int var9 = arg1 + -1 >> 7;
            int var10 = arg1 + -1 + arg3 + -1 >> 7;
            int var11 = var7;
            if (var6 != 0 || var7 <= var8) {
               do {
                  class367[] var12 = this.field1886[var11];
                  int var13 = var9;
                  if (var6 != 0) {
                     var12[var9].field5517 = true;
                     var13 = var9 + 1;
                  }

                  while(true) {
                     while(~var10 <= ~var13) {
                        var12[var13].field5517 = true;
                        ++var13;
                     }

                     if (var6 == 0) {
                        ++var11;
                        break;
                     }

                     ++var13;
                  }
               } while(var11 <= var8);

            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field1893[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(II[[ZIIZ)V"
   )
   public final void method1230(int param1, int param2, boolean[][] param3, int param4, int param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public static final void method1231(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field1877;
         if (~class96.field1187 != ~arg1 || class445.field6759 != arg0 || class252.field3376 != arg2) {
            class96.field1187 = arg1;
            class321.field4583 = arg3;
            class252.field3376 = arg2;
            class445.field6759 = arg0;
            double var4 = -((double)(arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double)(arg0 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class482.field7154 = var8 * var12;
            class751.field11120 = var14;
            class148.field1852 = var10 * var14;
            class468.field7007 = var10;
            class790.field11481 = var12;
            class707.field10581 = -var10 * var12;
            class165.field2072 = -var8 * var14;
            class654.field9516 = 0.0D;
            class449.field6818 = var8;
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field1893[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Lr;III)Z"
   )
   public final boolean method1232(class193 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1883;
         class290 var5 = (class290)arg0;
         arg3 += var5.field4063 + 1;
         arg1 += var5.field4068 + 1;
         int var6 = this.field1876 * arg3 + arg1;
         int var7 = var5.field4064;
         int var8 = var5.field4060;
         int var9 = -var8 + this.field1876;
         if (~arg3 >= -1) {
            int var10 = -arg3 + 1;
            var7 -= var10;
            arg3 = 1;
            var6 += this.field1876 * var10;
         }

         if (~(arg3 + var7) <= ~this.field1880) {
            int var11 = -this.field1880 + 1 + arg3 + var7;
            var7 -= var11;
         }

         if (arg1 <= arg2) {
            int var12 = -arg1 + 1;
            var9 += var12;
            arg1 = 1;
            var8 -= var12;
            var6 += var12;
         }

         if (this.field1876 <= arg1 + var8) {
            int var13 = -this.field1876 + 1 + var8 + arg1;
            var9 += var13;
            var8 -= var13;
         }

         if (var8 > 0 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field1876 + var9;
            return class407.method3115(var8, -49, var14, this.field1874, var6, var15, var7);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field1893[3] + (arg0 != null ? field1893[4] : field1893[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1233(int arg0) {
      try {
         field1892 = null;
         if (arg0 != -22248) {
            method1235(-87, -101, false, 120, (class526)null, 67, -22);
         }

         field1885 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1893[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IBLr;I)V"
   )
   public final void method1234(int arg0, byte arg1, class193 arg2, int arg3) {
      try {
         ++field1884;
         class290 var5 = (class290)arg2;
         arg0 += var5.field4063 - -1;
         arg3 += var5.field4068 - -1;
         int var6 = this.field1876 * arg0 + arg3;
         int var7 = 0;
         int var8 = var5.field4064;
         int var9 = var5.field4060;
         int var10 = -var9 + this.field1876;
         if (arg1 != -2) {
            this.field1886 = null;
         }

         if (~arg0 >= -1) {
            int var11 = -arg0 + 1;
            var8 -= var11;
            var7 += var9 * var11;
            arg0 = 1;
            var6 += this.field1876 * var11;
         }

         int var12 = 0;
         if (arg0 + var8 >= this.field1880) {
            int var13 = -this.field1880 + var8 + arg0 + 1;
            var8 -= var13;
         }

         if (~arg3 >= -1) {
            int var14 = -arg3 + 1;
            arg3 = 1;
            var10 += var14;
            var9 -= var14;
            var6 += var14;
            var7 += var14;
            var12 += var14;
         }

         if (this.field1876 <= arg3 + var9) {
            int var15 = var9 - -1 + arg3 - this.field1876;
            var10 += var15;
            var12 += var15;
            var9 -= var15;
         }

         if (var9 > 0 && var8 > 0) {
            class244.method1831(var7, var5.field4058, var12, var6, var10, var8, true, this.field1874, var9);
            this.method1229(arg3, arg0, 1, var8, var9);
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field1893[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1893[4] : field1893[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IIZILeaa;II)V"
   )
   public static final void method1235(int arg0, int arg1, boolean arg2, int arg3, class526 arg4, int arg5, int arg6) {
      try {
         label31: {
            if (arg3 > 0) {
               class9.field136 = arg0;
               class668.field10055 = arg5;
               class560.field8372 = arg6;
               class67.field837 = arg4;
               class660.field9569 = arg2;
               class627.field9106 = 1;
               class660.field9563 = null;
               class357.field5407 = class663.field9609.method451(arg1 + -18) / arg3;
               if (~class357.field5407 <= -2) {
                  break label31;
               }

               class357.field5407 = 1;
               if (client.field4530 == 0) {
                  break label31;
               }
            }

            class158.method1310(arg6, arg0, (byte)-120, arg2, arg4, arg5);
         }

         if (arg1 != 17) {
            method1233(11);
         }

         ++field1878;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1893[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1893[4] : field1893[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IZILr;)V"
   )
   public final void method1236(int arg0, boolean arg1, int arg2, class193 arg3) {
      try {
         ++field1881;
         class290 var5 = (class290)arg3;
         arg0 += var5.field4063 + 1;
         arg2 += var5.field4068 + 1;
         int var6 = this.field1876 * arg0 + arg2;
         int var7 = 0;
         int var8 = var5.field4064;
         int var9 = var5.field4060;
         int var10 = -var9 + this.field1876;
         if (arg1) {
            this.method1234(-35, (byte)-5, (class193)null, 71);
         }

         int var11 = 0;
         if (arg0 <= 0) {
            int var12 = -arg0 + 1;
            var8 -= var12;
            var6 += this.field1876 * var12;
            arg0 = 1;
            var7 += var9 * var12;
         }

         if (~(arg0 + var8) <= ~this.field1880) {
            int var13 = arg0 + var8 + -this.field1880 - -1;
            var8 -= var13;
         }

         if (~arg2 >= -1) {
            int var14 = -arg2 + 1;
            var10 += var14;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            arg2 = 1;
            var9 -= var14;
         }

         if (arg2 + var9 >= this.field1876) {
            int var15 = arg2 - -1 + var9 - this.field1876;
            var10 += var15;
            var9 -= var15;
            var11 += var15;
         }

         if (var9 > 0 && ~var8 < -1) {
            class698.method5062(var5.field4058, var9, var10, var8, (byte)35, var6, var11, this.field1874, var7);
            this.method1229(arg2, arg0, 1, var8, var9);
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field1893[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1893[4] : field1893[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1237(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field1890;
         this.field1886 = new class367[this.field1891][this.field1882];
         if (arg0 > 15) {
            int var3 = 0;
            if (var2 != 0 || ~var3 > ~this.field1882) {
               do {
                  int var4 = 0;
                  if (var2 != 0) {
                     this.field1886[var4][var3] = new class367(this.field1887, this, this.field1888, var4, var3, this.field1879, var4 * 128 + 1, var3 * 128 - -1);
                     ++var4;
                  }

                  while(true) {
                     while(~this.field1891 < ~var4) {
                        this.field1886[var4][var3] = new class367(this.field1887, this, this.field1888, var4, var3, this.field1879, var4 * 128 + 1, var3 * 128 - -1);
                        ++var4;
                     }

                     if (var2 == 0) {
                        ++var3;
                        break;
                     }

                     ++var4;
                  }
               } while(~var3 > ~this.field1882);

            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1893[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "<init>",
      descriptor = "(Lck;Ltda;)V"
   )
   public class150(class667 arg0, class663 arg1) {
      try {
         this.field1888 = arg1;
         this.field1887 = arg0;
         this.field1876 = (this.field1888.field4087 * this.field1888.field4080 >> this.field1887.field9903) + 2;
         this.field1880 = (this.field1888.field4081 * this.field1888.field4080 >> this.field1887.field9903) + 2;
         this.field1874 = new byte[this.field1880 * this.field1876];
         this.field1879 = 7 - this.field1888.field4086 + this.field1887.field9903;
         this.field1891 = this.field1888.field4087 >> this.field1879;
         this.field1882 = this.field1888.field4081 >> this.field1879;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1893[7] + (arg0 != null ? field1893[4] : field1893[2]) + ',' + (arg1 != null ? field1893[4] : field1893[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1238(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1239(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
