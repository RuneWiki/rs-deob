import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class304 {
   @OriginalMember(
      owner = "client!oaa",
      name = "f",
      descriptor = "Lce;"
   )
   private class327 field4039;
   @OriginalMember(
      owner = "client!oaa",
      name = "d",
      descriptor = "Lio;"
   )
   private class465 field4029;
   @OriginalMember(
      owner = "client!oaa",
      name = "p",
      descriptor = "I"
   )
   public int field4032;
   @OriginalMember(
      owner = "client!oaa",
      name = "o",
      descriptor = "I"
   )
   private int field4040;
   @OriginalMember(
      owner = "client!oaa",
      name = "g",
      descriptor = "[B"
   )
   public byte[] field4028;
   @OriginalMember(
      owner = "client!oaa",
      name = "h",
      descriptor = "I"
   )
   private int field4037;
   @OriginalMember(
      owner = "client!oaa",
      name = "q",
      descriptor = "I"
   )
   private int field4035;
   @OriginalMember(
      owner = "client!oaa",
      name = "k",
      descriptor = "I"
   )
   private int field4025;
   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4043 = new String[]{method2293(method2292("7E\u0019l\u000fp")), method2293(method2292("7E\u0019l\bp")), method2293(method2292("7E\u0019l\tp")), method2293(method2292("6Q\u0014.")), method2293(method2292("#\nVl7")), method2293(method2292("7E\u0019l\u000bp")), method2293(method2292("7E\u0019lv1J\u00116tp")), method2293(method2292("7E\u0019l\rp")), method2293(method2292("7E\u0019l\u000ep")), method2293(method2292("7E\u0019l\fp"))};
   @OriginalMember(
      owner = "client!oaa",
      name = "e",
      descriptor = "S"
   )
   public static short field4030 = 32767;
   @OriginalMember(
      owner = "client!oaa",
      name = "m",
      descriptor = "Ldg;"
   )
   public static class436 field4027 = new class436(method2293(method2292("\u0014m.\u0007")), "", "", 0);
   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "I"
   )
   public static int field4041 = 0;
   @OriginalMember(
      owner = "client!oaa",
      name = "i",
      descriptor = "I"
   )
   public static int field4024;
   @OriginalMember(
      owner = "client!oaa",
      name = "j",
      descriptor = "I"
   )
   public static int field4026;
   @OriginalMember(
      owner = "client!oaa",
      name = "c",
      descriptor = "I"
   )
   public static int field4031;
   @OriginalMember(
      owner = "client!oaa",
      name = "s",
      descriptor = "I"
   )
   public static int field4033;
   @OriginalMember(
      owner = "client!oaa",
      name = "n",
      descriptor = "I"
   )
   public static int field4034;
   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "I"
   )
   public static int field4038;
   @OriginalMember(
      owner = "client!oaa",
      name = "l",
      descriptor = "I"
   )
   public static int field4042;
   @OriginalMember(
      owner = "client!oaa",
      name = "r",
      descriptor = "[[Ljr;"
   )
   private class121[][] field4036;

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   private final void method2285(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      boolean var6 = client.field4273;

      try {
         ++field4024;
         if (this.field4036 != null) {
            int var7 = -88 / ((arg4 - 23) / 63);
            int var8 = arg2 - 1 >> 7;
            int var9 = arg3 - 1 + arg2 + -1 >> 7;
            int var10 = arg0 + -1 >> 7;
            int var11 = arg1 - 1 + arg0 + -1 >> 7;
            int var12 = var8;
            if (var6 || var9 >= var8) {
               do {
                  class121[] var13 = this.field4036[var12];
                  int var14 = var10;
                  if (var6) {
                     if (var13[var10] != null) {
                        var13[var10].field1523 = true;
                     }

                     var14 = var10 + 1;
                  }

                  while(true) {
                     while(~var14 >= ~var11) {
                        if (var13[var14] != null) {
                           var13[var14].field1523 = true;
                        }

                        ++var14;
                     }

                     if (!var6) {
                        ++var12;
                        break;
                     }

                     ++var14;
                  }
               } while(var9 >= var12);

            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field4043[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IIILr;)V"
   )
   public final void method2286(int arg0, int arg1, int arg2, class194 arg3) {
      try {
         if (arg2 == 1595587943) {
            ++field4038;
            class192 var5 = (class192)arg3;
            arg0 += var5.field2333 - -1;
            arg1 += var5.field2335 + 1;
            int var6 = this.field4032 * arg1 + arg0;
            int var7 = 0;
            int var8 = var5.field2336;
            int var9 = var5.field2329;
            int var10 = this.field4032 - var9;
            if (arg1 <= 0) {
               int var11 = 1 - arg1;
               var7 += var9 * var11;
               var6 += this.field4032 * var11;
               arg1 = 1;
               var8 -= var11;
            }

            int var12 = 0;
            if (arg1 + var8 >= this.field4040) {
               int var13 = arg1 - -1 - this.field4040 + var8;
               var8 -= var13;
            }

            if (~arg0 >= -1) {
               int var14 = 1 - arg0;
               var7 += var14;
               var12 += var14;
               var10 += var14;
               arg0 = 1;
               var6 += var14;
               var9 -= var14;
            }

            if (~(arg0 - -var9) <= ~this.field4032) {
               int var15 = arg0 + var9 + 1 + -this.field4032;
               var10 += var15;
               var9 -= var15;
               var12 += var15;
            }

            if (var9 > 0 && ~var8 < -1) {
               class8.method66(arg2 + -1595587824, var9, var5.field2340, var10, var12, var7, var8, var6, this.field4028);
               this.method2285(arg1, var8, arg0, var9, (byte)126);
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field4043[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4043[4] : field4043[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IILr;B)Z"
   )
   public final boolean method2287(int arg0, int arg1, class194 arg2, byte arg3) {
      try {
         if (arg3 != -61) {
            this.method2291(70, -55, (boolean[][])null, 91, -56, true);
         }

         ++field4034;
         class192 var5 = (class192)arg2;
         arg1 += var5.field2333 + 1;
         arg0 += var5.field2335 - -1;
         int var6 = arg1 - -(this.field4032 * arg0);
         int var7 = var5.field2336;
         int var8 = var5.field2329;
         if (arg0 <= 0) {
            int var9 = -arg0 + 1;
            arg0 = 1;
            var6 += this.field4032 * var9;
            var7 -= var9;
         }

         int var10 = this.field4032 - var8;
         if (~this.field4040 >= ~(arg0 + var7)) {
            int var11 = arg0 - -var7 - (this.field4040 + -1);
            var7 -= var11;
         }

         if (arg1 <= 0) {
            int var12 = 1 - arg1;
            arg1 = 1;
            var6 += var12;
            var10 += var12;
            var8 -= var12;
         }

         if (~(arg1 + var8) <= ~this.field4032) {
            int var13 = -this.field4032 + arg1 + var8 + 1;
            var10 += var13;
            var8 -= var13;
         }

         if (var8 > 0 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 - 1) * this.field4032 + var10;
            return class210.method1603(var14, this.field4028, var6, var7, (byte)127, var15, var8);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field4043[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4043[4] : field4043[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2288(int arg0) {
      try {
         if (arg0 != -1) {
            method2288(125);
         }

         field4027 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4043[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2289(int arg0) {
      boolean var2 = client.field4273;

      try {
         this.field4036 = new class121[this.field4035][this.field4025];
         ++field4033;
         if (arg0 == 10569) {
            int var3 = 0;
            if (var2 || this.field4025 > var3) {
               do {
                  int var4 = 0;
                  if (var2) {
                     this.field4036[var4][var3] = new class121(this.field4039, this, this.field4029, var4, var3, this.field4037, var4 * 128 + 1, var3 * 128 + 1);
                     if (this.field4036[var4][var3].field1527 == 0) {
                        this.field4036[var4][var3] = null;
                     }

                     ++var4;
                  }

                  while(true) {
                     while(var4 < this.field4035) {
                        this.field4036[var4][var3] = new class121(this.field4039, this, this.field4029, var4, var3, this.field4037, var4 * 128 + 1, var3 * 128 + 1);
                        if (this.field4036[var4][var3].field1527 == 0) {
                           this.field4036[var4][var3] = null;
                        }

                        ++var4;
                     }

                     if (!var2) {
                        ++var3;
                        break;
                     }

                     if (this.field4036[var4][var3].field1527 == 0) {
                        this.field4036[var4][var3] = null;
                     }

                     ++var4;
                  }
               } while(this.field4025 > var3);

            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4043[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(Lr;BII)V"
   )
   public final void method2290(class194 arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field4026;
         class192 var5 = (class192)arg0;
         arg3 += var5.field2333 + 1;
         arg2 += var5.field2335 - -1;
         int var6 = this.field4032 * arg2 + arg3;
         int var7 = 0;
         int var8 = var5.field2336;
         if (arg1 >= -57) {
            this.method2290((class194)null, (byte)5, -25, 33);
         }

         int var9 = var5.field2329;
         int var10 = this.field4032 - var9;
         int var11 = 0;
         if (~arg2 >= -1) {
            int var12 = -arg2 + 1;
            var6 += this.field4032 * var12;
            var7 += var9 * var12;
            arg2 = 1;
            var8 -= var12;
         }

         if (~(arg2 + var8) <= ~this.field4040) {
            int var13 = var8 - this.field4040 + arg2 + 1;
            var8 -= var13;
         }

         if (arg3 <= 0) {
            int var14 = 1 - arg3;
            var9 -= var14;
            var6 += var14;
            var7 += var14;
            var11 += var14;
            arg3 = 1;
            var10 += var14;
         }

         if (~(arg3 + var9) <= ~this.field4032) {
            int var15 = arg3 - (-var9 - -this.field4032) + 1;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
         }

         if (~var9 < -1 && ~var8 < -1) {
            class177.method1370(4, this.field4028, var5.field2340, var9, var8, var7, var6, var10, var11);
            this.method2285(arg2, var8, arg3, var9, (byte)-100);
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field4043[5] + (arg0 != null ? field4043[4] : field4043[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(II[[ZIIZ)V"
   )
   public final void method2291(int param1, int param2, boolean[][] param3, int param4, int param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "<init>",
      descriptor = "(Lce;Lio;)V"
   )
   public class304(class327 arg0, class465 arg1) {
      try {
         this.field4039 = arg0;
         this.field4029 = arg1;
         this.field4032 = 2 - -(this.field4029.field3873 * this.field4029.field3869 >> this.field4039.field4585);
         this.field4040 = 2 - -(this.field4029.field3871 * this.field4029.field3869 >> this.field4039.field4585);
         this.field4028 = new byte[this.field4040 * this.field4032];
         this.field4037 = this.field4039.field4585 + 7 + -this.field4029.field3874;
         this.field4035 = this.field4029.field3873 >> this.field4037;
         this.field4025 = this.field4029.field3871 >> this.field4037;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4043[6] + (arg0 != null ? field4043[4] : field4043[3]) + ',' + (arg1 != null ? field4043[4] : field4043[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2292(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2293(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
