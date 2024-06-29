import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class764 {
   @OriginalMember(
      owner = "client!fm",
      name = "o",
      descriptor = "Lrk;"
   )
   private class35 field11081;
   @OriginalMember(
      owner = "client!fm",
      name = "n",
      descriptor = "Liaa;"
   )
   private class518 field11088;
   @OriginalMember(
      owner = "client!fm",
      name = "i",
      descriptor = "I"
   )
   public int field11086;
   @OriginalMember(
      owner = "client!fm",
      name = "e",
      descriptor = "I"
   )
   private int field11091;
   @OriginalMember(
      owner = "client!fm",
      name = "t",
      descriptor = "[B"
   )
   public byte[] field11087;
   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "I"
   )
   private int field11077;
   @OriginalMember(
      owner = "client!fm",
      name = "d",
      descriptor = "I"
   )
   private int field11084;
   @OriginalMember(
      owner = "client!fm",
      name = "l",
      descriptor = "I"
   )
   private int field11095;
   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11099 = new String[]{method5536(method5535("DFC\u0015E")), method5536(method5535("Y\u0005C~\u0010")), method5536(method5535("Q\u001d\u0001W")), method5536(method5535("Y\u0005C\u007f\u0010")), method5536(method5535("Y\u0005Cs\u0010")), method5536(method5535("Y\u0005C}\u0010")), method5536(method5535("Y\u0005Cr\u0010")), method5536(method5535("Y\u0005Cq\u0010")), method5536(method5535("Y\u0005Cz\u0010")), method5536(method5535("Y\u0005Cy\u0010")), method5536(method5535("Y\u0005C\u0007QQ\u0001\u0019\u0005\u0010")), method5536(method5535("Y\u0005C|\u0010")), method5536(method5535("Y\u0005Cx\u0010"))};
   @OriginalMember(
      owner = "client!fm",
      name = "k",
      descriptor = "[F"
   )
   public static float[] field11083 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   @OriginalMember(
      owner = "client!fm",
      name = "s",
      descriptor = "I"
   )
   public static int field11078;
   @OriginalMember(
      owner = "client!fm",
      name = "r",
      descriptor = "I"
   )
   public static int field11080;
   @OriginalMember(
      owner = "client!fm",
      name = "m",
      descriptor = "I"
   )
   public static int field11082;
   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "I"
   )
   public static int field11085;
   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "I"
   )
   public static int field11089;
   @OriginalMember(
      owner = "client!fm",
      name = "p",
      descriptor = "I"
   )
   public static int field11090;
   @OriginalMember(
      owner = "client!fm",
      name = "f",
      descriptor = "I"
   )
   public static int field11092;
   @OriginalMember(
      owner = "client!fm",
      name = "u",
      descriptor = "I"
   )
   public static int field11093;
   @OriginalMember(
      owner = "client!fm",
      name = "j",
      descriptor = "I"
   )
   public static int field11094;
   @OriginalMember(
      owner = "client!fm",
      name = "h",
      descriptor = "I"
   )
   public static int field11098;
   @OriginalMember(
      owner = "client!fm",
      name = "v",
      descriptor = "Lek;"
   )
   public static class531 field11096;
   @OriginalMember(
      owner = "client!fm",
      name = "q",
      descriptor = "[Z"
   )
   public static boolean[] field11079;
   @OriginalMember(
      owner = "client!fm",
      name = "g",
      descriptor = "[[Liea;"
   )
   private class502[][] field11097;

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(ILr;II)Z",
      line = 3
   )
   public final boolean method5525(int arg0, class192 arg1, int arg2, int arg3) {
      try {
         ++field11098;
         class580 var5 = (class580)arg1;
         arg2 += var5.field8330 + 1;
         arg3 += var5.field8328 + 1;
         int var6 = this.field11086 * arg2 + arg3;
         int var7 = var5.field8334;
         int var8 = var5.field8332;
         int var9 = -var8 + this.field11086;
         if (arg2 <= 0) {
            int var10 = -arg2 + 1;
            arg2 = 1;
            var7 -= var10;
            var6 += this.field11086 * var10;
         }

         if (arg2 + var7 >= this.field11091) {
            int var11 = var7 - this.field11091 + arg2 + 1;
            var7 -= var11;
         }

         if (~arg3 >= -1) {
            int var12 = -arg3 + 1;
            arg3 = 1;
            var8 -= var12;
            var6 += var12;
            var9 += var12;
         }

         if (~(arg3 - -var8) <= ~this.field11086) {
            int var13 = -this.field11086 + arg3 + var8 + 1;
            var8 -= var13;
            var9 += var13;
         }

         if (var8 > 0 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field11086 + var9;
            int var16 = -71 % ((arg0 - 63) / 39);
            return class487.method3678(var15, var8, true, var14, var6, var7, this.field11087);
         } else {
            return false;
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field11099[1] + arg0 + ',' + (arg1 != null ? field11099[0] : field11099[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IILaf;B)V",
      line = 73
   )
   public static final void method5526(int arg0, int arg1, class457 arg2, byte arg3) {
      try {
         if (arg3 <= 7) {
            field11083 = null;
         }

         ++field11089;
         int[] var4 = new int[4];
         class365.method2852(var4, 0, var4.length, arg1);
         class192.method1673(arg2, arg0, 0, var4);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11099[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11099[0] : field11099[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(BII)Z",
      line = 87
   )
   public static final boolean method5527(byte arg0, int arg1, int arg2) {
      try {
         ++field11090;
         if (arg0 != -56) {
            return false;
         } else {
            return ~(16 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11099[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I[[ZIIIZ)V",
      line = 103
   )
   public final void method5528(int param1, boolean[][] param2, int param3, int param4, int param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 283
   )
   public static final void method5529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         int var8;
         label26: {
            ++field11080;
            var8 = arg6 - 334;
            if (var8 < 0) {
               var8 = 0;
               if (!client.field4564) {
                  break label26;
               }
            }

            if (~var8 < -101) {
               var8 = 100;
            }
         }

         int var9 = (-class98.field1571 + class731.field10505) * var8 / 100 + class98.field1571;
         class75.field1316 = class75.field1322 * var9 >> 8;
         int var17 = arg5 * var9 >> 8;
         int var10 = 16383 & -arg0 + 16384;
         int var11 = 16383 & -arg2 + 16384;
         int var12 = 0;
         int var13 = 0;
         int var14 = var17;
         if (~var10 != -1) {
            var13 = class593.field8539[var10] * -var17 >> 14;
            var14 = class593.field8548[var10] * var17 >> 14;
         }

         if (~var11 != arg1) {
            var12 = class593.field8539[var11] * var14 >> 14;
            var14 = class593.field8548[var11] * var14 >> 14;
         }

         class583.field8442 = -var12 + arg3;
         class373.field5548 = arg2;
         class494.field7193 = arg4 - var13;
         class677.field9932 = -var14 + arg7;
         class414.field6073 = arg0;
         class127.field2133 = 0;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field11099[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IBILr;)V",
      line = 333
   )
   public final void method5530(int arg0, byte arg1, int arg2, class192 arg3) {
      try {
         ++field11078;
         class580 var5 = (class580)arg3;
         arg0 += var5.field8330 - -1;
         arg2 += var5.field8328 + 1;
         int var6 = arg2 - -(this.field11086 * arg0);
         int var7 = 0;
         int var8 = var5.field8334;
         if (arg1 <= -52) {
            int var9 = var5.field8332;
            int var10 = -var9 + this.field11086;
            int var11 = 0;
            if (~arg0 >= -1) {
               int var12 = -arg0 + 1;
               var7 += var9 * var12;
               var6 += this.field11086 * var12;
               arg0 = 1;
               var8 -= var12;
            }

            if (arg0 + var8 >= this.field11091) {
               int var13 = -this.field11091 + arg0 + var8 - -1;
               var8 -= var13;
            }

            if (arg2 <= 0) {
               int var14 = 1 - arg2;
               var7 += var14;
               var9 -= var14;
               var11 += var14;
               var10 += var14;
               arg2 = 1;
               var6 += var14;
            }

            if (~(arg2 + var9) <= ~this.field11086) {
               int var15 = -this.field11086 + 1 + arg2 + var9;
               var9 -= var15;
               var10 += var15;
               var11 += var15;
            }

            if (~var9 < -1 && ~var8 < -1) {
               class693.method5039(var10, var7, this.field11087, var11, var9, var8, var5.field8325, var6, -571462391);
               this.method5533(arg2, var9, 112, arg0, var8);
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field11099[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11099[0] : field11099[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I)V",
      line = 403
   )
   public static void method5531(int arg0) {
      try {
         field11083 = null;
         if (arg0 < -112) {
            field11079 = null;
            field11096 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11099[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IILr;I)V",
      line = 422
   )
   public final void method5532(int arg0, int arg1, class192 arg2, int arg3) {
      try {
         ++field11092;
         class580 var5 = (class580)arg2;
         arg3 += var5.field8328 + 1;
         arg1 += var5.field8330 - -1;
         int var6 = arg3 - -(this.field11086 * arg1);
         int var7 = 0;
         int var8 = var5.field8334;
         int var9 = var5.field8332;
         int var10 = -74 % ((53 - arg0) / 62);
         int var11 = -var9 + this.field11086;
         int var12 = 0;
         if (arg1 <= 0) {
            int var13 = -arg1 + 1;
            var8 -= var13;
            arg1 = 1;
            var6 += this.field11086 * var13;
            var7 += var9 * var13;
         }

         if (this.field11091 <= arg1 - -var8) {
            int var14 = arg1 + 1 - -var8 - this.field11091;
            var8 -= var14;
         }

         if (arg3 <= 0) {
            int var15 = -arg3 + 1;
            var11 += var15;
            arg3 = 1;
            var6 += var15;
            var7 += var15;
            var9 -= var15;
            var12 += var15;
         }

         if (arg3 - -var9 >= this.field11086) {
            int var16 = arg3 + 1 - -var9 + -this.field11086;
            var12 += var16;
            var11 += var16;
            var9 -= var16;
         }

         if (var9 > 0 && ~var8 < -1) {
            class133.method1268(var12, var8, -75, var7, var11, this.field11087, var5.field8325, var6, var9);
            this.method5533(arg3, var9, 25, arg1, var8);
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field11099[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11099[0] : field11099[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(IIIII)V",
      line = 493
   )
   private final void method5533(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         ++field11093;
         if (this.field11097 != null) {
            int var7 = arg0 + -1 >> 7;
            int var8 = arg0 + arg1 + -2 >> 7;
            int var9 = arg3 + -1 >> 7;
            if (arg2 < 11) {
               this.field11095 = -40;
            }

            int var10 = arg4 + -1 + -1 + arg3 >> 7;
            int var11 = var7;
            if (var6 || ~var7 >= ~var8) {
               do {
                  class502[] var12 = this.field11097[var11];
                  int var13 = var9;
                  if (var6) {
                     var12[var9].field7315 = true;
                     var13 = var9 + 1;
                  }

                  while(true) {
                     while(~var13 >= ~var10) {
                        var12[var13].field7315 = true;
                        ++var13;
                     }

                     if (!var6) {
                        ++var11;
                        break;
                     }

                     ++var13;
                  }
               } while(~var11 >= ~var8);

            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field11099[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "(I)V",
      line = 538
   )
   public final void method5534(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field11082;
         this.field11097 = new class502[this.field11084][this.field11095];
         int var3 = 0;
         if (arg0 > 70) {
            while(~var3 > ~this.field11095) {
               int var4 = 0;
               if (var2) {
                  this.field11097[var4][var3] = new class502(this.field11081, this, this.field11088, var4, var3, this.field11077, var4 * 128 + 1, var3 * 128 + 1);
                  ++var4;
               }

               while(true) {
                  while(this.field11084 > var4) {
                     this.field11097[var4][var3] = new class502(this.field11081, this, this.field11088, var4, var3, this.field11077, var4 * 128 + 1, var3 * 128 + 1);
                     ++var4;
                  }

                  if (!var2) {
                     ++var3;
                     break;
                  }

                  ++var4;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11099[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "<init>",
      descriptor = "(Lrk;Liaa;)V",
      line = 569
   )
   public class764(class35 arg0, class518 arg1) {
      try {
         this.field11081 = arg0;
         this.field11088 = arg1;
         this.field11086 = (this.field11088.field4083 * this.field11088.field4080 >> this.field11081.field726) + 2;
         this.field11091 = 2 - -(this.field11088.field4083 * this.field11088.field4077 >> this.field11081.field726);
         this.field11087 = new byte[this.field11091 * this.field11086];
         this.field11077 = this.field11081.field726 + 7 + -this.field11088.field4081;
         this.field11084 = this.field11088.field4080 >> this.field11077;
         this.field11095 = this.field11088.field4077 >> this.field11077;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11099[10] + (arg0 != null ? field11099[0] : field11099[2]) + ',' + (arg1 != null ? field11099[0] : field11099[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5535(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5536(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
