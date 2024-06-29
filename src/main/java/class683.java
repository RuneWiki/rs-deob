import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class683 extends class476 {
   @OriginalMember(
      owner = "client!kja",
      name = "r",
      descriptor = "Z"
   )
   private boolean field10038 = false;
   @OriginalMember(
      owner = "client!kja",
      name = "F",
      descriptor = "I"
   )
   private int field10044 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "n",
      descriptor = "I"
   )
   private int field10043 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "d",
      descriptor = "I"
   )
   private int field10056 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "D",
      descriptor = "I"
   )
   private int field10062 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "j",
      descriptor = "I"
   )
   private int field10052;
   @OriginalMember(
      owner = "client!kja",
      name = "g",
      descriptor = "Lcs;"
   )
   private class357 field10036;
   @OriginalMember(
      owner = "client!kja",
      name = "C",
      descriptor = "I"
   )
   private int field10040;
   @OriginalMember(
      owner = "client!kja",
      name = "l",
      descriptor = "Lnfa;"
   )
   private class706 field10061;
   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "Z"
   )
   private boolean field10067;
   @OriginalMember(
      owner = "client!kja",
      name = "y",
      descriptor = "Z"
   )
   private boolean field10050;
   @OriginalMember(
      owner = "client!kja",
      name = "A",
      descriptor = "Z"
   )
   private boolean field10059;
   @OriginalMember(
      owner = "client!kja",
      name = "B",
      descriptor = "Z"
   )
   private boolean field10046;
   @OriginalMember(
      owner = "client!kja",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10068 = new String[]{method4989(method4988("\u0012\u0002oM!Q")), method4989(method4988("\u0002F M\u0012")), method4989(method4988("\u0017\u001db\u000f")), method4989(method4988("\u0012\u0002oM-8@")), method4989(method4988("\u0012\u0002oMS\u0010\u0006g\u0017QQ")), method4989(method4988("\u0012\u0002oM&Q")), method4989(method4988("\u0012\u0002oM#Q")), method4989(method4988("\u0012\u0002oM)8@")), method4989(method4988("\u0012\u0002oM$Q")), method4989(method4988("\u0012\u0002oM+Q")), method4989(method4988("\u0012\u0002oM)Q")), method4989(method4988("\u0012\u0002oM+8@")), method4989(method4988("\u0012\u0002oM\"Q")), method4989(method4988("\u0012\u0002oM.Q")), method4989(method4988("\u0012\u0002oM*Q")), method4989(method4988("\u0012\u0002oM:Q")), method4989(method4988("\u0012\u0002oM.8@")), method4989(method4988("\u0012\u0002oM-Q")), method4989(method4988("\u0012\u0002oM,Q")), method4989(method4988("\u0012\u0002oM;Q")), method4989(method4988("\u0012\u0002oM$8@")), method4989(method4988("\u0012\u0002oM?Q")), method4989(method4988("0\u0006x\u0002\u0003\u0010\f.\u0011\u000e\u001d\u0001vY"))};
   @OriginalMember(
      owner = "client!kja",
      name = "E",
      descriptor = "I"
   )
   public static int field10037;
   @OriginalMember(
      owner = "client!kja",
      name = "k",
      descriptor = "I"
   )
   public static int field10039;
   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "I"
   )
   public static int field10041;
   @OriginalMember(
      owner = "client!kja",
      name = "f",
      descriptor = "I"
   )
   public static int field10042;
   @OriginalMember(
      owner = "client!kja",
      name = "o",
      descriptor = "I"
   )
   public static int field10045;
   @OriginalMember(
      owner = "client!kja",
      name = "x",
      descriptor = "I"
   )
   public static int field10047;
   @OriginalMember(
      owner = "client!kja",
      name = "i",
      descriptor = "I"
   )
   public static int field10048;
   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "I"
   )
   public static int field10049;
   @OriginalMember(
      owner = "client!kja",
      name = "t",
      descriptor = "I"
   )
   public static int field10051;
   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "I"
   )
   public static int field10053;
   @OriginalMember(
      owner = "client!kja",
      name = "u",
      descriptor = "I"
   )
   public static int field10054;
   @OriginalMember(
      owner = "client!kja",
      name = "p",
      descriptor = "I"
   )
   public static int field10055;
   @OriginalMember(
      owner = "client!kja",
      name = "v",
      descriptor = "I"
   )
   public static int field10057;
   @OriginalMember(
      owner = "client!kja",
      name = "e",
      descriptor = "I"
   )
   public static int field10058;
   @OriginalMember(
      owner = "client!kja",
      name = "m",
      descriptor = "I"
   )
   public static int field10060;
   @OriginalMember(
      owner = "client!kja",
      name = "h",
      descriptor = "I"
   )
   public static int field10063;
   @OriginalMember(
      owner = "client!kja",
      name = "w",
      descriptor = "I"
   )
   public static int field10064;
   @OriginalMember(
      owner = "client!kja",
      name = "q",
      descriptor = "I"
   )
   public static int field10065;
   @OriginalMember(
      owner = "client!kja",
      name = "s",
      descriptor = "I"
   )
   public static int field10066;

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3006(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10056 = arg0;
         ++field10054;
         this.field10044 = arg1;
         this.field10062 = arg2;
         this.field10043 = arg3;
         this.field10038 = ~this.field10056 != -1 || ~this.field10044 != -1 || this.field10062 != 0 || ~this.field10043 != -1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10068[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method3003(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field10060;
         class104 var11 = this.field10036.method2755(0);
         class104 var12 = this.field10036.method2776((byte)97);
         this.field10061.method460((byte)-41, !this.field10067 && !this.field10050 && ~(1 & arg9) != -1 ? class185.field2801 : class308.field4438);
         this.field10036.method2798(-4649);
         this.field10036.method2806(false, this.field10061);
         this.field10036.method2748(arg8, (byte)-21);
         this.field10036.method2738(-124, arg6);
         this.field10036.method2779(8, 1, class295.field4119);
         this.field10036.method2783(3592, class295.field4119, 1);
         this.field10036.method2754(arg7, (byte)-122);
         if (this.field10038) {
            float var13 = (float)this.method3009();
            float var14 = (float)this.method3000();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (-arg0 + arg4) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float)this.field10044 * var17;
            float var20 = (float)this.field10044 * var18;
            float var21 = (float)this.field10056 * var15;
            float var22 = (float)this.field10056 * var16;
            float var23 = (float)this.field10062 * -var15;
            float var24 = (float)this.field10062 * -var16;
            float var25 = (float)this.field10043 * -var17;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            arg0 = arg0 + var21 + var19;
            float var26 = (float)this.field10043 * -var18;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
         }

         var11.method1010(arg5 - arg1, -arg0 + arg4, -arg0 + arg2, -arg1 + arg3, 0.0F, 1.0F, 0.0F, 0, 0.0F, 0.0F);
         var11.method1003(arg1, (byte)-92, arg0, 0.0F);
         var12.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2746((byte)62);
         this.field10036.method2777(-48);
         this.field10036.method2744(false);
         this.field10036.method2779(8, 1, class315.field4537);
         this.field10036.method2783(3592, class315.field4537, 1);
      } catch (RuntimeException var28) {
         throw class608.method4462(var28, field10068[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method1059(int arg0, int arg1, class510 arg2, int arg3, int arg4) {
      try {
         ++field10051;
         class298 var6 = (class298)arg2;
         int var14 = this.field10044 + arg1;
         int var13 = this.field10056 + arg0;
         class706 var7 = var6.field4165;
         this.field10061.method460((byte)-120, class308.field4438);
         this.field10036.method2798(-4649);
         this.field10036.method2806(false, this.field10061);
         this.field10036.method2748(1, (byte)-21);
         this.field10036.method2738(-116, 1);
         class104 var8 = this.field10036.method2755(0);
         var8.method984((float)this.field10052, (byte)-125, (float)this.field10040, 0.0F);
         var8.method990(var13, var14, 0);
         this.field10036.method2746((byte)89);
         class104 var9 = this.field10036.method2776((byte)97);
         var9.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2767((byte)-112, 1);
         this.field10036.method2806(false, var7);
         this.field10036.method2761(class641.field9348, (byte)-69, class621.field9036);
         this.field10036.method2779(8, 0, class315.field4537);
         class104 var10 = this.field10036.method2776((byte)97);
         var10.method984(var7.method880(-10745, (float)this.field10052), (byte)-125, var7.method881((float)this.field10040, false), 1.0F);
         var10.method1003(var7.method881((float)(var14 - arg4), false), (byte)-92, var7.method880(-10745, (float)(-arg3 + var13)), 0.0F);
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2777(-38);
         this.field10036.method2744(false);
         this.field10036.method2779(8, 0, class540.field7850);
         this.field10036.method2761(class621.field9036, (byte)-69, class621.field9036);
         this.field10036.method2806(false, (class47)null);
         this.field10036.method2767((byte)-112, 0);
         this.field10036.method2744(false);
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10068[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10068[1] : field10068[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method4983(int arg0) {
      try {
         ++field10045;
         if (arg0 != 2041) {
            method4985(18, true, (class65)null);
         }

         return ~class241.field3483 != -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10068[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   private final void method4984(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      try {
         ++field10049;
         this.field10061.method887(arg1, arg4, arg6, arg0, arg3, arg5, false, arg2);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10068[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10068[1] : field10068[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1056(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         int[] var6;
         label212: {
            ++field10057;
            int[] var5 = this.field10036.method407(arg0, arg1, this.field10052, this.field10040);
            var6 = new int[this.field10052 * this.field10040];
            this.field10061.method883(0, 0, this.field10040, var6, (byte)-118, 0, this.field10052);
            if (~arg2 == -1) {
               int var7 = 0;
               if (var4 || ~this.field10040 < ~var7) {
                  do {
                     int var8 = this.field10052 * var7;
                     int var9 = 0;
                     if (var4) {
                        var6[var8 + var9] = class93.method899(class66.method706(var5[var8 + var9] << 8, -16777155), class66.method706(16777215, var6[var8 + var9]));
                        ++var9;
                     }

                     while(true) {
                        while(this.field10052 > var9) {
                           var6[var8 + var9] = class93.method899(class66.method706(var5[var8 + var9] << 8, -16777155), class66.method706(16777215, var6[var8 + var9]));
                           ++var9;
                        }

                        if (!var4) {
                           ++var7;
                           break;
                        }

                        ++var9;
                     }
                  } while(~this.field10040 < ~var7);
               }

               if (!var4) {
                  break label212;
               }
            }

            if (arg2 != 1) {
               if (arg2 != 2) {
                  if (arg2 != 3) {
                     break label212;
                  }

                  int var10 = 0;
                  if (!var4 && ~this.field10040 >= ~var10) {
                     if (!var4) {
                        break label212;
                     }
                  } else {
                     label169:
                     while(true) {
                        int var11 = this.field10052 * var10;
                        int var12 = 0;
                        if (var4) {
                           var6[var11 + var12] = class93.method899(class66.method706(var6[var11 + var12], 16777215), var5[var11 + var12] != 0 ? -16777216 : 0);
                           ++var12;
                        }

                        while(true) {
                           while(var12 < this.field10052) {
                              var6[var11 + var12] = class93.method899(class66.method706(var6[var11 + var12], 16777215), var5[var11 + var12] != 0 ? -16777216 : 0);
                              ++var12;
                           }

                           if (!var4) {
                              ++var10;
                              if (~this.field10040 >= ~var10) {
                                 if (!var4) {
                                    break label212;
                                 }
                                 break label169;
                              }
                              break;
                           }

                           ++var12;
                        }
                     }
                  }
               }

               int var13 = 0;
               if (var4 || this.field10040 > var13) {
                  do {
                     int var14 = this.field10052 * var13;
                     int var15 = 0;
                     if (var4) {
                        var6[var14 + var15] = class93.method899(class66.method706(var6[var14 + var15], 16777215), class66.method706(var5[var14 + var15], 367407615) << 24);
                        ++var15;
                     }

                     while(true) {
                        while(~var15 > ~this.field10052) {
                           var6[var14 + var15] = class93.method899(class66.method706(var6[var14 + var15], 16777215), class66.method706(var5[var14 + var15], 367407615) << 24);
                           ++var15;
                        }

                        if (!var4) {
                           ++var13;
                           break;
                        }

                        ++var15;
                     }
                  } while(this.field10040 > var13);
               }

               if (!var4) {
                  break label212;
               }
            }

            int var16 = 0;
            if (var4 || ~var16 > ~this.field10040) {
               do {
                  int var17 = this.field10052 * var16;
                  int var18 = 0;
                  if (var4) {
                     var6[var17 + var18] = class93.method899(class66.method706(var5[var17 + var18], -28311808) << 16, class66.method706(16777215, var6[var17 + var18]));
                     ++var18;
                  }

                  while(true) {
                     while(~this.field10052 < ~var18) {
                        var6[var17 + var18] = class93.method899(class66.method706(var5[var17 + var18], -28311808) << 16, class66.method706(16777215, var6[var17 + var18]));
                        ++var18;
                     }

                     if (!var4) {
                        ++var16;
                        break;
                     }

                     ++var18;
                  }
               } while(~var16 > ~this.field10040);
            }
         }

         this.method4984(0, 0, this.field10052, this.field10040, var6, 0, this.field10052);
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field10068[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IZLha;)Lika;"
   )
   public static final class445 method4985(int arg0, boolean arg1, class65 arg2) {
      try {
         ++field10058;
         if (arg1) {
            method4986(true, (Component)null);
         }

         class300 var3 = class532.method3985(arg2, -27775, arg0, true);
         return var3 == null ? null : var3.field4198;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10068[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10068[1] : field10068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10064;
         class104 var6 = this.field10036.method2755(0);
         class104 var7 = this.field10036.method2776((byte)97);
         int var11 = this.field10044 + arg1;
         int var10 = this.field10056 + arg0;
         this.field10061.method460((byte)-73, class308.field4438);
         this.field10036.method2798(-4649);
         this.field10036.method2806(false, this.field10061);
         this.field10036.method2748(arg4, (byte)-21);
         this.field10036.method2738(-120, arg2);
         this.field10036.method2779(8, 1, class295.field4119);
         this.field10036.method2783(3592, class295.field4119, 1);
         this.field10036.method2754(arg3, (byte)-88);
         var6.method984((float)this.field10052, (byte)-125, (float)this.field10040, 0.0F);
         var6.method990(var10, var11, 0);
         var7.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2746((byte)81);
         this.field10036.method2777(7);
         this.field10036.method2744(false);
         this.field10036.method2779(8, 1, class315.field4537);
         this.field10036.method2783(3592, class315.field4537, 1);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10068[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method3001(int[] arg0) {
      try {
         ++field10041;
         arg0[2] = this.field10062;
         arg0[0] = this.field10056;
         arg0[3] = this.field10043;
         arg0[1] = this.field10044;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10068[20] + (arg0 != null ? field10068[1] : field10068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method3008(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
      try {
         class104 var11;
         class104 var12;
         class706 var14;
         label30: {
            ++field10053;
            var11 = this.field10036.method2755(0);
            var12 = this.field10036.method2776((byte)97);
            class298 var13 = (class298)arg7;
            var14 = var13.field4165;
            this.field10061.method460((byte)-86, !this.field10067 && !this.field10050 && ~(1 & arg6) != -1 ? class185.field2801 : class308.field4438);
            this.field10036.method2798(-4649);
            this.field10036.method2806(false, this.field10061);
            this.field10036.method2748(1, (byte)-21);
            this.field10036.method2738(-104, 1);
            if (!this.field10038) {
               var11.method1010(arg5 - arg1, -arg0 + arg4, -arg0 + arg2, -arg1 + arg3, 0.0F, 1.0F, 0.0F, 0, 0.0F, 0.0F);
               var11.method1003(arg1, (byte)-92, arg0, 0.0F);
               if (!client.field4564) {
                  break label30;
               }
            }

            float var15 = (float)this.field10052 / (float)this.method3009();
            float var16 = (float)this.field10040 / (float)this.method3000();
            var11.method1010((arg5 - arg1) * var16, (-arg0 + arg4) * var16, (-arg0 + arg2) * var15, (arg3 - arg1) * var15, 0.0F, 1.0F, 0.0F, 0, 0.0F, 0.0F);
            var11.method1003(((float)this.field10044 + arg1) * var16, (byte)-92, ((float)this.field10056 + arg0) * var15, 0.0F);
         }

         var12.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2767((byte)-112, 1);
         this.field10036.method2806(false, var14);
         this.field10036.method2761(class641.field9348, (byte)-69, class621.field9036);
         this.field10036.method2779(8, 0, class315.field4537);
         class104 var17 = this.field10036.method2776((byte)97);
         var17.method982(var11);
         var17.method990(-arg8, -arg9, 0);
         var17.method985(var14.method881(1.0F, false), 1.0F, -128, var14.method880(-10745, 1.0F));
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2746((byte)74);
         this.field10036.method2777(126);
         this.field10036.method2744(false);
         this.field10036.method2779(8, 0, class540.field7850);
         this.field10036.method2761(class621.field9036, (byte)-69, class621.field9036);
         this.field10036.method2806(false, (class47)null);
         this.field10036.method2767((byte)-112, 0);
         this.field10036.method2744(false);
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field10068[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10068[1] : field10068[2]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "d",
      descriptor = "()I"
   )
   public final int method3005() {
      try {
         ++field10065;
         return this.field10040;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10068[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "()I"
   )
   public final int method3009() {
      try {
         ++field10039;
         return this.field10056 + this.field10052 - -this.field10062;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10068[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1053(int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ZLjava/awt/Component;)Lbga;"
   )
   public static final class373 method4986(boolean arg0, Component arg1) {
      try {
         ++field10042;
         if (arg0) {
            method4987(true, -31, (String)null, 89);
         }

         return new class631(arg1);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10068[13] + arg0 + ',' + (arg1 != null ? field10068[1] : field10068[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "()I"
   )
   public final int method3002() {
      try {
         ++field10063;
         return this.field10052;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10068[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field10066;
         class104 var9 = this.field10036.method2755(0);
         class104 var10 = this.field10036.method2776((byte)97);
         this.field10061.method460((byte)-95, !this.field10067 && !this.field10050 && ~(1 & arg7) != -1 ? class185.field2801 : class308.field4438);
         this.field10036.method2798(-4649);
         this.field10036.method2806(false, this.field10061);
         this.field10036.method2748(arg6, (byte)-21);
         this.field10036.method2738(-128, arg4);
         this.field10036.method2779(8, 1, class295.field4119);
         this.field10036.method2783(3592, class295.field4119, 1);
         this.field10036.method2754(arg5, (byte)-89);
         var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
         if (this.field10038) {
            arg2 = this.field10052 * arg2 / this.method3009();
            arg3 = this.field10040 * arg3 / this.method3000();
            arg1 += this.field10044 * arg3 / this.field10040;
            arg0 += this.field10056 * arg2 / this.field10052;
         }

         var9.method984((float)arg2, (byte)-125, (float)arg3, 0.0F);
         var9.method990(arg0, arg1, 0);
         this.field10036.method2765(class392.field5781, 140);
         this.field10036.method2746((byte)26);
         this.field10036.method2777(121);
         this.field10036.method2744(false);
         this.field10036.method2779(8, 1, class315.field4537);
         this.field10036.method2783(3592, class315.field4537, 1);
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10068[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method3007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         label240: {
            ++field10037;
            class104 var9 = this.field10036.method2755(0);
            class104 var10 = this.field10036.method2776((byte)97);
            this.field10061.method460((byte)-35, class308.field4438);
            this.field10036.method2798(-4649);
            this.field10036.method2806(false, this.field10061);
            this.field10036.method2748(arg6, (byte)-21);
            this.field10036.method2738(-78, arg4);
            this.field10036.method2779(8, 1, class295.field4119);
            this.field10036.method2783(3592, class295.field4119, 1);
            this.field10036.method2754(arg5, (byte)-108);
            boolean var11 = this.field10046 && ~this.field10044 == -1 && this.field10043 == 0;
            boolean var12 = this.field10059 && this.field10056 == 0 && this.field10062 == 0;
            if (!(var12 & var11)) {
               if (var12) {
                  int var13 = arg1 - -arg3;
                  int var14 = this.method3000();
                  var10.method984(this.field10061.method880(-10745, (float)arg2), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
                  this.field10036.method2765(class392.field5781, 140);
                  int var15 = this.field10044 + arg1;
                  int var16 = var15 - -this.field10040;
                  if (var8) {
                     var9.method984((float)arg2, (byte)-125, (float)this.field10040, 0.0F);
                     var9.method990(arg0, var15, 0);
                     this.field10036.method2746((byte)80);
                     this.field10036.method2777(127);
                     var15 += var14;
                     var16 += var14;
                  }

                  while(true) {
                     while(~var16 >= ~var13) {
                        var9.method984((float)arg2, (byte)-125, (float)this.field10040, 0.0F);
                        var9.method990(arg0, var15, 0);
                        this.field10036.method2746((byte)80);
                        this.field10036.method2777(127);
                        var15 += var14;
                        var16 += var14;
                     }

                     if (!var8) {
                        if (var13 <= var15) {
                           break label240;
                        }

                        int var17 = -var15 + var13;
                        var10.method984(this.field10061.method880(-10745, (float)arg2), (byte)-125, this.field10061.method881((float)var17, false), 1.0F);
                        this.field10036.method2765(class392.field5781, 140);
                        var9.method984((float)arg2, (byte)-125, (float)var17, 0.0F);
                        var9.method990(arg0, var15, 0);
                        this.field10036.method2746((byte)124);
                        this.field10036.method2777(10);
                        if (!var8) {
                           break label240;
                        }
                        break;
                     }

                     var16 = var13 + var15;
                  }
               }

               int var10000;
               int var10001;
               if (!var11) {
                  label273: {
                     int var18 = arg1 - -arg3;
                     int var19 = arg0 + arg2;
                     int var20 = this.method3009();
                     int var21 = this.method3000();
                     int var22 = this.field10044 + arg1;
                     int var23 = this.field10040 + var22;
                     int var24;
                     int var25;
                     int var27;
                     int var28;
                     int var29;
                     int var30;
                     if (var8) {
                        var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
                        this.field10036.method2765(class392.field5781, 140);
                        var24 = arg0 + this.field10056;
                        var25 = this.field10052 + var24;
                        if (var8) {
                           var9.method984((float)this.field10052, (byte)-125, (float)this.field10040, 0.0F);
                           var9.method990(var24, var22, 0);
                           this.field10036.method2746((byte)81);
                           var24 += var20;
                           var25 += var20;
                           this.field10036.method2777(28);
                        }
                     } else {
                        if (~var18 > ~var23) {
                           var10000 = var18;
                           var10001 = var22;
                           if (!var8) {
                              if (var18 <= var22) {
                                 break label240;
                              }

                              var27 = -var22 + var18;
                              var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)var27, false), 1.0F);
                              this.field10036.method2765(class392.field5781, 140);
                              var28 = this.field10056 + arg0;
                              var29 = this.field10052 + var28;
                              if (var8) {
                                 var9.method984((float)this.field10052, (byte)-125, (float)var27, 0.0F);
                                 var9.method990(var28, var22, 0);
                                 this.field10036.method2746((byte)73);
                                 var29 += var20;
                                 var28 += var20;
                                 this.field10036.method2777(119);
                              }

                              while(true) {
                                 while(~var29 >= ~var19) {
                                    var9.method984((float)this.field10052, (byte)-125, (float)var27, 0.0F);
                                    var9.method990(var28, var22, 0);
                                    this.field10036.method2746((byte)73);
                                    var29 += var20;
                                    var28 += var20;
                                    this.field10036.method2777(119);
                                 }

                                 if (!var8) {
                                    if (var28 >= var19) {
                                       break label240;
                                    }

                                    var30 = -var28 + var19;
                                    var10.method984(this.field10061.method880(-10745, (float)var30), (byte)-125, this.field10061.method881((float)var27, false), 1.0F);
                                    this.field10036.method2765(class392.field5781, 140);
                                    var9.method984((float)var30, (byte)-125, (float)var27, 0.0F);
                                    var9.method990(var28, var22, 0);
                                    this.field10036.method2746((byte)102);
                                    this.field10036.method2777(123);
                                    if (!var8) {
                                       break label240;
                                    }
                                    break label273;
                                 }

                                 var28 += var19;
                                 this.field10036.method2777(119);
                              }
                           }
                        } else {
                           var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
                           this.field10036.method2765(class392.field5781, 140);
                           var10000 = arg0;
                           var10001 = this.field10056;
                        }

                        var24 = var10000 + var10001;
                        var25 = this.field10052 + var24;
                        if (var8) {
                           var9.method984((float)this.field10052, (byte)-125, (float)this.field10040, 0.0F);
                           var9.method990(var24, var22, 0);
                           this.field10036.method2746((byte)81);
                           var24 += var20;
                           var25 += var20;
                           this.field10036.method2777(28);
                        }
                     }

                     label212:
                     while(true) {
                        while(~var25 >= ~var19) {
                           var9.method984((float)this.field10052, (byte)-125, (float)this.field10040, 0.0F);
                           var9.method990(var24, var22, 0);
                           this.field10036.method2746((byte)81);
                           var24 += var20;
                           var25 += var20;
                           this.field10036.method2777(28);
                        }

                        if (!var8) {
                           if (var19 > var24) {
                              int var26 = -var24 + var19;
                              var10.method984(this.field10061.method880(-10745, (float)var26), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
                              this.field10036.method2765(class392.field5781, 140);
                              var9.method984((float)var26, (byte)-125, (float)this.field10040, 0.0F);
                              var9.method990(var24, var22, 0);
                              this.field10036.method2746((byte)104);
                              this.field10036.method2777(-91);
                           }

                           var22 += var21;
                           var23 += var21;
                           if (~var18 > ~var23) {
                              var10000 = var18;
                              var10001 = var22;
                              if (!var8) {
                                 if (var18 <= var22) {
                                    break label240;
                                 }

                                 var27 = -var22 + var18;
                                 var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)var27, false), 1.0F);
                                 this.field10036.method2765(class392.field5781, 140);
                                 var28 = this.field10056 + arg0;
                                 var29 = this.field10052 + var28;
                                 if (var8) {
                                    var9.method984((float)this.field10052, (byte)-125, (float)var27, 0.0F);
                                    var9.method990(var28, var22, 0);
                                    this.field10036.method2746((byte)73);
                                    var29 += var20;
                                    var28 += var20;
                                    this.field10036.method2777(119);
                                 }

                                 while(true) {
                                    while(~var29 >= ~var19) {
                                       var9.method984((float)this.field10052, (byte)-125, (float)var27, 0.0F);
                                       var9.method990(var28, var22, 0);
                                       this.field10036.method2746((byte)73);
                                       var29 += var20;
                                       var28 += var20;
                                       this.field10036.method2777(119);
                                    }

                                    if (!var8) {
                                       if (var28 >= var19) {
                                          break label240;
                                       }

                                       var30 = -var28 + var19;
                                       var10.method984(this.field10061.method880(-10745, (float)var30), (byte)-125, this.field10061.method881((float)var27, false), 1.0F);
                                       this.field10036.method2765(class392.field5781, 140);
                                       var9.method984((float)var30, (byte)-125, (float)var27, 0.0F);
                                       var9.method990(var28, var22, 0);
                                       this.field10036.method2746((byte)102);
                                       this.field10036.method2777(123);
                                       if (!var8) {
                                          break label240;
                                       }
                                       break label212;
                                    }

                                    var28 += var19;
                                    this.field10036.method2777(119);
                                 }
                              }
                           } else {
                              var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)this.field10040, false), 1.0F);
                              this.field10036.method2765(class392.field5781, 140);
                              var10000 = arg0;
                              var10001 = this.field10056;
                           }

                           var24 = var10000 + var10001;
                           var25 = this.field10052 + var24;
                           if (var8) {
                              var9.method984((float)this.field10052, (byte)-125, (float)this.field10040, 0.0F);
                              var9.method990(var24, var22, 0);
                              this.field10036.method2746((byte)81);
                              var24 += var20;
                              var25 += var20;
                              this.field10036.method2777(28);
                           }
                        } else {
                           var25 = var19 + var24;
                           this.field10036.method2777(28);
                        }
                     }
                  }
               }

               int var31 = arg0 + arg2;
               int var32 = this.method3009();
               var10.method984(this.field10061.method880(-10745, (float)this.field10052), (byte)-125, this.field10061.method881((float)arg3, false), 1.0F);
               this.field10036.method2765(class392.field5781, 140);
               int var33 = this.field10056 + arg0;
               int var34 = var33 - -this.field10052;
               if (var8) {
                  var9.method984((float)this.field10052, (byte)-125, (float)arg3, 0.0F);
                  var9.method990(var33, arg1, 0);
                  this.field10036.method2746((byte)115);
                  this.field10036.method2777(-71);
                  var34 += var32;
                  var33 += var32;
               }

               while(true) {
                  while(~var34 >= ~var31) {
                     var9.method984((float)this.field10052, (byte)-125, (float)arg3, 0.0F);
                     var9.method990(var33, arg1, 0);
                     this.field10036.method2746((byte)115);
                     this.field10036.method2777(-71);
                     var34 += var32;
                     var33 += var32;
                  }

                  var10000 = ~var31;
                  var10001 = ~var33;
                  if (!var8) {
                     if (var10000 >= var10001) {
                        break label240;
                     }

                     int var35 = -var33 + var31;
                     var10.method984(this.field10061.method880(-10745, (float)var35), (byte)-125, this.field10061.method881((float)arg3, false), 1.0F);
                     this.field10036.method2765(class392.field5781, 140);
                     var9.method984((float)var35, (byte)-125, (float)arg3, 0.0F);
                     var9.method990(var33, arg1, 0);
                     this.field10036.method2746((byte)56);
                     this.field10036.method2777(126);
                     if (!var8) {
                        break label240;
                     }
                     break;
                  }

                  var33 = var10000 + var10001;
               }
            }

            var10.method984(this.field10061.method880(-10745, (float)arg2), (byte)-125, this.field10061.method881((float)arg3, false), 1.0F);
            var9.method984((float)arg2, (byte)-125, (float)arg3, 0.0F);
            var9.method990(arg0, arg1, 0);
            this.field10036.method2765(class392.field5781, 140);
            this.field10036.method2746((byte)54);
            this.field10036.method2777(125);
         }

         this.field10036.method2744(false);
         this.field10036.method2779(8, 1, class315.field4537);
         this.field10036.method2783(3592, class315.field4537, 1);
      } catch (RuntimeException var37) {
         throw class608.method4462(var37, field10068[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "()I"
   )
   public final int method3000() {
      try {
         ++field10055;
         return this.field10044 + this.field10040 + this.field10043;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10068[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ZILjava/lang/String;I)I"
   )
   public static final int method4987(boolean arg0, int arg1, String arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field10047;
         if (~arg1 <= -3 && arg1 <= 36) {
            boolean var5 = false;
            boolean var6 = false;
            int var7 = 0;
            int var8 = arg2.length();
            int var9 = 0;
            int var10000;
            if (var4) {
               var10000 = arg2.charAt(var9);
            } else if (var9 >= var8) {
               var10000 = arg3;
               if (!var4) {
                  if (arg3 != 30012) {
                     return 11;
                  }

                  if (!var6) {
                     throw new NumberFormatException();
                  }

                  return var7;
               }
            } else {
               var10000 = arg2.charAt(var9);
            }

            while(true) {
               label177: {
                  int var10 = var10000;
                  if (~var9 == -1) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label177;
                        }
                     }

                     if (~var10 == -44 && arg0 && !var4) {
                        ++var9;
                        break label177;
                     }
                  }

                  int var11;
                  if (var10 >= 48 && var10 <= 57) {
                     var10 -= 48;
                     if (!var4) {
                        if (arg1 <= var10) {
                           throw new NumberFormatException();
                        }

                        if (var5) {
                           var10 = -var10;
                        }

                        var11 = arg1 * var7 + var10;
                        if (~(var11 / arg1) != ~var7) {
                           throw new NumberFormatException();
                        }

                        var7 = var11;
                        var6 = true;
                        ++var9;
                        break label177;
                     }
                  }

                  if (var10 >= 65) {
                     if (var10 > 90) {
                        if (~var10 > -98 || var10 > 122) {
                           break;
                        }

                        var10 -= 87;
                        if (var4) {
                           var10 -= 55;
                        }
                     } else {
                        var10 -= 55;
                     }
                  } else {
                     if (~var10 > -98 || var10 > 122) {
                        break;
                     }

                     var10 -= 87;
                     if (var4) {
                        var10 -= 55;
                     }
                  }

                  if (arg1 <= var10) {
                     throw new NumberFormatException();
                  }

                  if (var5) {
                     var10 = -var10;
                  }

                  var11 = arg1 * var7 + var10;
                  if (~(var11 / arg1) != ~var7) {
                     throw new NumberFormatException();
                  }

                  var7 = var11;
                  var6 = true;
                  ++var9;
               }

               if (var9 >= var8) {
                  var10000 = arg3;
                  if (!var4) {
                     if (arg3 != 30012) {
                        return 11;
                     }

                     if (!var6) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg2.charAt(var9);
               }
            }

            throw new NumberFormatException();
         } else {
            throw new IllegalArgumentException(field10068[22] + arg1);
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10068[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10068[1] : field10068[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "<init>",
      descriptor = "(Lcs;IIZ)V"
   )
   public class683(class357 arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field10052 = arg1;
         this.field10036 = arg0;
         this.field10040 = arg2;
         this.field10061 = arg0.method1197(arg1, arg2, 17171, arg3 ? class296.field4146 : class431.field6246, class209.field3106);
         this.field10061.method884(true, -50, true);
         this.field10067 = this.field10061.method889(28570) != arg1;
         this.field10050 = ~this.field10061.method886(-19759) != ~arg2;
         this.field10059 = !this.field10067 && this.field10061.method878(true);
         this.field10046 = !this.field10050 && this.field10061.method878(true);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10068[4] + (arg0 != null ? field10068[1] : field10068[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "<init>",
      descriptor = "(Lcs;II[III)V"
   )
   public class683(class357 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
      try {
         this.field10040 = arg2;
         this.field10052 = arg1;
         this.field10036 = arg0;
         this.field10061 = arg0.method1212(arg2, -13473, false, arg5, arg3, arg1, arg4);
         this.field10061.method884(true, 70, true);
         this.field10067 = ~arg1 != ~this.field10061.method889(28570);
         this.field10050 = ~arg2 != ~this.field10061.method886(-19759);
         this.field10059 = !this.field10067 && this.field10061.method878(true);
         this.field10046 = !this.field10050 && this.field10061.method878(true);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10068[4] + (arg0 != null ? field10068[1] : field10068[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10068[1] : field10068[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4988(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4989(char[] arg0) {
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
            var10005 = 104;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
