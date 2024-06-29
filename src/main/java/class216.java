import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class216 {
   @OriginalMember(
      owner = "client!da",
      name = "i",
      descriptor = "Lwm;"
   )
   private class440 field3083;
   @OriginalMember(
      owner = "client!da",
      name = "o",
      descriptor = "Lha;"
   )
   private class17 field3084;
   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3103 = new String[]{method1881(method1880("jI+s\r")), method1881(method1880("`]iX")), method1881(method1880("u\u0006+\u001aX")), method1881(method1880("jI+e\r")), method1881(method1880("jI+r\r")), method1881(method1880("jI+q\r")), method1881(method1880("jI+|\r")), method1881(method1880("jI+`\r")), method1881(method1880("|Mb")), method1881(method1880("k]w[")), method1881(method1880("zAhQV")), method1881(method1880("}@|")), method1881(method1880("jI+z\r")), method1881(method1880("`JvD")), method1881(method1880("mGuM")), method1881(method1880("b\\")), method1881(method1880("i\\")), method1881(method1880("gEb\t")), method1881(method1880("jI+v\r")), method1881(method1880("jI+a\r")), method1881(method1880("jI+{\r")), method1881(method1880("jI+f\r")), method1881(method1880("}\\w\t")), method1881(method1880("}@dP")), method1881(method1880("!KjX")), method1881(method1880("![mUA")), method1881(method1880("}@dP\u0018#\u0019")), method1881(method1880("lZ")), method1881(method1880("mGi\t")), method1881(method1880("}@dP\u0018")), method1881(method1880("!]")), method1881(method1880("{\u0015")), method1881(method1880("oZbV\u0018")), method1881(method1880("!IwSG")), method1881(method1880("jI+\u007f\r")), method1881(method1880("![qF")), method1881(method1880("}\\w")), method1881(method1880("jI+~\r")), method1881(method1880("jI+y\r")), method1881(method1880("jI+p\r")), method1881(method1880("jI+}\r")), method1881(method1880("jI+d\r")), method1881(method1880("jI+w\r")), method1881(method1880("jI+x\r")), method1881(method1880("jI+\bL`Aq\n\r"))};
   @OriginalMember(
      owner = "client!da",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class398 field3081 = new class398(64);
   @OriginalMember(
      owner = "client!da",
      name = "q",
      descriptor = "Lhha;"
   )
   public static class724 field3100 = new class724(82, 7);
   @OriginalMember(
      owner = "client!da",
      name = "f",
      descriptor = "I"
   )
   public static int field3080;
   @OriginalMember(
      owner = "client!da",
      name = "k",
      descriptor = "I"
   )
   public static int field3082;
   @OriginalMember(
      owner = "client!da",
      name = "s",
      descriptor = "I"
   )
   public static int field3086;
   @OriginalMember(
      owner = "client!da",
      name = "d",
      descriptor = "I"
   )
   public static int field3087;
   @OriginalMember(
      owner = "client!da",
      name = "g",
      descriptor = "I"
   )
   public static int field3088;
   @OriginalMember(
      owner = "client!da",
      name = "n",
      descriptor = "I"
   )
   public static int field3089;
   @OriginalMember(
      owner = "client!da",
      name = "t",
      descriptor = "I"
   )
   public static int field3090;
   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "I"
   )
   public static int field3091;
   @OriginalMember(
      owner = "client!da",
      name = "h",
      descriptor = "I"
   )
   public static int field3092;
   @OriginalMember(
      owner = "client!da",
      name = "u",
      descriptor = "I"
   )
   public static int field3093;
   @OriginalMember(
      owner = "client!da",
      name = "w",
      descriptor = "I"
   )
   public static int field3094;
   @OriginalMember(
      owner = "client!da",
      name = "r",
      descriptor = "I"
   )
   public static int field3095;
   @OriginalMember(
      owner = "client!da",
      name = "j",
      descriptor = "I"
   )
   public static int field3096;
   @OriginalMember(
      owner = "client!da",
      name = "e",
      descriptor = "I"
   )
   public static int field3097;
   @OriginalMember(
      owner = "client!da",
      name = "c",
      descriptor = "I"
   )
   public static int field3098;
   @OriginalMember(
      owner = "client!da",
      name = "v",
      descriptor = "I"
   )
   public static int field3099;
   @OriginalMember(
      owner = "client!da",
      name = "p",
      descriptor = "I"
   )
   public static int field3101;
   @OriginalMember(
      owner = "client!da",
      name = "m",
      descriptor = "I"
   )
   public static int field3102;
   @OriginalMember(
      owner = "client!da",
      name = "l",
      descriptor = "Lil;"
   )
   public static class574 field3085;

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIILjava/lang/String;IBII)V"
   )
   public final void method1859(int arg0, int arg1, int arg2, String arg3, int arg4, byte arg5, int arg6, int arg7) {
      boolean var9 = client.field10022;

      try {
         ++field3091;
         if (arg3 != null) {
            this.method1871((byte)-92, arg0, arg4);
            double var10 = -((double)arg2 / 8.0D) + 7.0D;
            if (var10 < 0.0D) {
               var10 = 0.0D;
            }

            int var12 = arg3.length();
            int[] var13 = new int[var12];
            int var14 = 0;
            if (var9) {
               var13[var14] = (int)(var10 * Math.sin((double)var14 / 1.5D + (double)arg1));
               ++var14;
            }

            while(true) {
               while(~var14 > ~var12) {
                  var13[var14] = (int)(var10 * Math.sin((double)var14 / 1.5D + (double)arg1));
                  ++var14;
               }

               if (!var9) {
                  if (arg5 <= 3) {
                     return;
                  }

                  this.method1866(var13, arg3, arg7 - this.field3083.method3430(32, arg3) / 2, arg6, (class148[])null, (int[])null, (int[])null, false);
                  return;
               }

               ++var14;
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field3103[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3103[2] : field3103[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IZIIILjava/lang/String;)V"
   )
   public final void method1860(int arg0, boolean arg1, int arg2, int arg3, int arg4, String arg5) {
      try {
         if (arg1) {
            this.method1873(17, 86, 85, -28, -71, (String)null, 111);
         }

         ++field3097;
         if (arg5 != null) {
            this.method1871((byte)-92, arg4, arg3);
            this.method1879((int[])null, arg5, true, (class684)null, (class148[])null, 0, arg0, 0, arg2);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3103[38] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3103[2] : field3103[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;IIIIZ)V"
   )
   public final void method1861(String arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field3102;
         if (!arg5) {
            if (arg0 != null) {
               this.method1871((byte)-92, arg3, arg2);
               this.method1879((int[])null, arg0, true, (class684)null, (class148[])null, 0, arg4 - this.field3083.method3430(32, arg0) / 2, 0, arg1);
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3103[37] + (arg0 != null ? field3103[2] : field3103[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIII[Lma;I[IILaa;IIIIIIILjava/lang/String;)I"
   )
   public final int method1862(int arg0, int arg1, int arg2, int arg3, class148[] arg4, int arg5, int[] arg6, int arg7, class684 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, String arg16) {
      boolean var18 = client.field10022;

      try {
         ++field3090;
         if (arg16 == null) {
            return 0;
         } else {
            this.method1871((byte)-92, arg14, arg7);
            if (~arg0 == -1) {
               arg0 = this.field3083.field6439;
            }

            int[] var19;
            label171: {
               if (~arg1 <= ~(this.field3083.field6459 + this.field3083.field6458 + arg0) || ~(arg0 - -arg0) >= ~arg1) {
                  var19 = new int[]{arg12};
                  if (!var18) {
                     break label171;
                  }
               }

               var19 = null;
            }

            int var20 = this.field3083.method3426((byte)122, arg16, class686.field9898, var19, arg4);
            if (arg3 == -1) {
               arg3 = arg1 / arg0;
               if (arg3 <= 0) {
                  arg3 = 1;
               }
            }

            if (~arg3 < -1 && var20 >= arg3) {
               class686.field9898[arg3 + -1] = this.field3083.method3427(4, arg4, arg12, class686.field9898[arg3 + -1]);
               var20 = arg3;
            }

            if (~arg2 == -4 && var20 == 1) {
               arg2 = 1;
            }

            int var21;
            label156: {
               if (~arg2 == -1) {
                  var21 = this.field3083.field6459 + arg15;
                  if (!var18) {
                     break label156;
                  }
               }

               if (arg2 != 1) {
                  if (arg2 == 2) {
                     var21 = arg1 + arg15 + -this.field3083.field6458 + -((var20 - 1) * arg0);
                     if (!var18) {
                        break label156;
                     }
                  }

                  int var22 = (-this.field3083.field6458 + arg1 + -((var20 + -1) * arg0) + -this.field3083.field6459) / (var20 + 1);
                  if (var22 < 0) {
                     var22 = 0;
                  }

                  var21 = arg15 + var22 - -this.field3083.field6459;
                  arg0 += var22;
                  if (!var18) {
                     break label156;
                  }
               }

               var21 = (-this.field3083.field6459 + arg1 + -((var20 - 1) * arg0) + -this.field3083.field6458) / 2 + this.field3083.field6459 + arg15;
            }

            int var23 = arg9;
            int var10000;
            if (var18) {
               var10000 = arg13;
            } else if (arg9 >= var20) {
               var10000 = var20;
               if (!var18) {
                  return var20;
               }
            } else {
               var10000 = arg13;
            }

            while(true) {
               label159: {
                  if (var10000 == 0) {
                     this.method1879(arg6, class686.field9898[var23], true, arg8, arg4, arg11, arg5, arg10, var21);
                     if (!var18) {
                        break label159;
                     }
                  }

                  if (~arg13 == -2) {
                     this.method1879(arg6, class686.field9898[var23], true, arg8, arg4, arg11, (arg12 - this.field3083.method3430(32, class686.field9898[var23])) / 2 + arg5, arg10, var21);
                     if (!var18) {
                        break label159;
                     }
                  }

                  if (~arg13 == -3) {
                     this.method1879(arg6, class686.field9898[var23], true, arg8, arg4, arg11, -this.field3083.method3430(32, class686.field9898[var23]) + arg5 + arg12, arg10, var21);
                     if (!var18) {
                        break label159;
                     }
                  }

                  if (var20 + -1 != var23) {
                     this.method1864(arg12, class686.field9898[var23], 0);
                     this.method1879(arg6, class686.field9898[var23], true, arg8, arg4, arg11, arg5, arg10, var21);
                     class484.field6925 = 0;
                     if (!var18) {
                        break label159;
                     }
                  }

                  this.method1879(arg6, class686.field9898[var23], true, arg8, arg4, arg11, arg5, arg10, var21);
               }

               var21 += arg0;
               ++var23;
               if (var23 >= var20) {
                  var10000 = var20;
                  if (!var18) {
                     return var20;
                  }
               } else {
                  var10000 = arg13;
               }
            }
         }
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field3103[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3103[2] : field3103[1]) + ',' + arg5 + ',' + (arg6 != null ? field3103[2] : field3103[1]) + ',' + arg7 + ',' + (arg8 != null ? field3103[2] : field3103[1]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + (arg16 != null ? field3103[2] : field3103[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IILjava/util/Random;I[Lma;IZI[II[IIIILjava/lang/String;)I"
   )
   public final int method1863(int arg0, int arg1, Random arg2, int arg3, class148[] arg4, int arg5, boolean arg6, int arg7, int[] arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, String arg14) {
      boolean var16 = client.field10022;

      try {
         ++field3092;
         if (arg14 == null) {
            return 0;
         } else {
            arg2.setSeed((long)arg0);
            int var17 = 192 - -(31 & arg2.nextInt());
            this.method1871((byte)-92, var17 << 24 | arg11 & 16777215, var17 << 24 | 16777215 & arg1);
            int var18 = arg14.length();
            int[] var19 = new int[var18];
            int var20 = 0;
            int var21 = 0;
            if (var16) {
               var19[var21] = var20;
               if (~(arg2.nextInt() & 3) == -1) {
                  ++var20;
               }

               ++var21;
            }

            while(true) {
               while(~var21 > ~var18) {
                  var19[var21] = var20;
                  if (~(arg2.nextInt() & 3) == -1) {
                     ++var20;
                  }

                  ++var21;
               }

               int var22 = arg7;
               int var23 = arg5 - -this.field3083.field6459;
               if (!var16) {
                  label78: {
                     if (arg9 != 1) {
                        if (~arg9 != -3) {
                           break label78;
                        }

                        var23 = arg5 - (-arg13 - -this.field3083.field6458);
                        if (!var16) {
                           break label78;
                        }
                     }

                     var23 += (arg13 - this.field3083.field6459 + -this.field3083.field6458) / 2;
                  }

                  int var24;
                  label71: {
                     var24 = -1;
                     if (~arg3 == -2) {
                        var24 = this.field3083.method3430(32, arg14) - -var20;
                        var22 = (arg12 - var24) / 2 + arg7;
                        if (!var16) {
                           break label71;
                        }
                     }

                     if (~arg3 == -3) {
                        var24 = this.field3083.method3430(32, arg14) - -var20;
                        var22 += arg12 - var24;
                     }
                  }

                  this.method1866((int[])null, arg14, var22, var23, arg4, var19, arg10, arg6);
                  if (arg8 != null) {
                     if (var24 == -1) {
                        var24 = this.field3083.method3430(32, arg14) + var20;
                     }

                     arg8[2] = var24;
                     arg8[3] = this.field3083.field6459 + this.field3083.field6458;
                     arg8[0] = var22;
                     arg8[1] = -this.field3083.field6459 + var23;
                  }

                  return var20;
               }

               if (arg9 == 1) {
                  ++var20;
               }

               ++var21;
            }
         }
      } catch (RuntimeException var26) {
         throw class612.method4503(var26, field3103[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3103[2] : field3103[1]) + ',' + arg3 + ',' + (arg4 != null ? field3103[2] : field3103[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field3103[2] : field3103[1]) + ',' + arg9 + ',' + (arg10 != null ? field3103[2] : field3103[1]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field3103[2] : field3103[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   private final void method1864(int arg0, String arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field3098;
         int var5 = 0;
         boolean var6 = false;
         int var7 = arg2;
         int var10000;
         if (var4) {
            var10000 = arg1.charAt(arg2);
         } else if (~arg1.length() >= ~arg2) {
            var10000 = ~var5;
            if (!var4) {
               if (var10000 < -1) {
                  class484.field6925 = (-this.field3083.method3430(32, arg1) + arg0 << 8) / var5;
                  return;
               }

               return;
            }
         } else {
            var10000 = arg1.charAt(arg2);
         }

         while(true) {
            int var8 = var10000;
            if (~var8 == -61) {
               var6 = true;
               if (var4) {
                  if (var8 == 62) {
                     var6 = false;
                     if (var4) {
                        if (!var6 && ~var8 == -33) {
                           ++var5;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }
                  } else {
                     if (!var6 && ~var8 == -33) {
                        ++var5;
                     }

                     ++var7;
                  }
               } else {
                  ++var7;
               }
            } else if (var8 == 62) {
               var6 = false;
               if (var4) {
                  if (!var6 && ~var8 == -33) {
                     ++var5;
                  }

                  ++var7;
               } else {
                  ++var7;
               }
            } else {
               if (!var6 && ~var8 == -33) {
                  ++var5;
               }

               ++var7;
            }

            if (~arg1.length() >= ~var7) {
               var10000 = ~var5;
               if (!var4) {
                  if (var10000 < -1) {
                     class484.field6925 = (-this.field3083.method3430(32, arg1) + arg0 << 8) / var5;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg1.charAt(var7);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3103[7] + arg0 + ',' + (arg1 != null ? field3103[2] : field3103[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIIIII)Z"
   )
   public static final boolean method1865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg6 <= 29) {
            field3100 = null;
         }

         ++field3087;
         int var7 = arg1 + arg2;
         int var8 = arg5 - -arg4;
         int var9 = arg0 + arg3;
         if (!class366.method2883(var8, var7, arg1, var8, arg0, var8, var9, arg1, var9, false)) {
            return false;
         } else if (!class366.method2883(var8, var7, arg1, var8, arg0, var8, var9, var7, arg0, false)) {
            return false;
         } else {
            if (~class386.field5636 < ~arg1) {
               if (!class366.method2883(var8, arg1, arg1, arg5, var9, var8, var9, arg1, arg0, false)) {
                  return false;
               }

               if (!class366.method2883(arg5, arg1, arg1, arg5, var9, var8, arg0, arg1, arg0, false)) {
                  return false;
               }
            } else {
               if (!class366.method2883(var8, var7, var7, arg5, var9, var8, var9, var7, arg0, false)) {
                  return false;
               }

               if (!class366.method2883(arg5, var7, var7, arg5, var9, var8, arg0, var7, arg0, false)) {
                  return false;
               }
            }

            if (~arg0 > ~class297.field4416) {
               if (!class366.method2883(var8, var7, arg1, arg5, arg0, var8, arg0, arg1, arg0, false)) {
                  return false;
               }

               if (!class366.method2883(arg5, var7, arg1, arg5, arg0, var8, arg0, var7, arg0, false)) {
                  return false;
               }
            } else {
               if (!class366.method2883(var8, var7, arg1, arg5, var9, var8, var9, arg1, var9, false)) {
                  return false;
               }

               if (!class366.method2883(arg5, var7, arg1, arg5, var9, var8, var9, var7, var9, false)) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field3103[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([ILjava/lang/String;II[Lma;[I[IZ)V"
   )
   private final void method1866(int[] param1, String param2, int param3, int param4, class148[] param5, int[] param6, int[] param7, boolean param8) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "<init>",
      descriptor = "(Lha;Lwm;)V"
   )
   public class216(class17 arg0, class440 arg1) {
      try {
         this.field3083 = arg1;
         this.field3084 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3103[44] + (arg0 != null ? field3103[2] : field3103[1]) + ',' + (arg1 != null ? field3103[2] : field3103[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;ZZILjava/lang/String;)V"
   )
   public static final void method1867(String arg0, boolean arg1, boolean arg2, int arg3, String arg4) {
      try {
         class123.field1977 = arg2;
         class76.field1214 = arg1;
         class492.field7022 = arg0;
         ++field3088;
         class226.field3216 = arg4;
         if (!arg1) {
            class777.field11335 = -1;
         }

         if (class76.field1214 || !class226.field3216.equals("") && !class492.field7022.equals("")) {
            if (~class793.field11537 != -2) {
               class268.field4090 = -1;
               class312.field4676 = -1;
               class711.field10211 = 0;
            }

            class527.field7461.field3726 = false;
            class547.method4096(-3, (byte)-23);
            class3.field23 = arg3;
            class116.field1840 = 0;
            class528.field7463 = 1;
         } else {
            class547.method4096(3, (byte)-20);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3103[6] + (arg0 != null ? field3103[2] : field3103[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3103[2] : field3103[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIILjava/lang/String;I)V"
   )
   public final void method1868(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
      try {
         ++field3095;
         if (arg4 != null) {
            this.method1871((byte)-92, arg1, arg0);
            this.method1879((int[])null, arg4, true, (class684)null, (class148[])null, arg2, -this.field3083.method3430(32, arg4) + arg3, 0, arg5);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3103[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3103[2] : field3103[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   private final void method1869(String arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         try {
            label130: {
               if (arg1 != -1421) {
                  return;
               }

               label123: {
                  if (!arg0.startsWith(field3103[28])) {
                     if (!arg0.equals(field3103[24])) {
                        break label123;
                     }

                     class306.field4634 = class196.field2830 & 16777215 | -16777216 & class306.field4634;
                     if (!var3) {
                        break label123;
                     }
                  }

                  class306.field4634 = class306.field4634 & -16777216 | class788.method5692(arg0.substring(4), arg1 ^ -1527, 16) & 16777215;
               }

               if (!arg0.startsWith(field3103[32])) {
                  if (arg0.equals(field3103[33])) {
                     class306.field4634 = class196.field2830;
                     if (!var3) {
                        break label130;
                     }
                  }

                  if (arg0.startsWith(field3103[22])) {
                     class705.field10142 = class306.field4634 & -16777216 | class788.method5692(arg0.substring(4), arg1 + 1540, 16);
                     if (!var3) {
                        break label130;
                     }
                  }

                  if (!arg0.equals(field3103[36])) {
                     if (arg0.equals(field3103[35])) {
                        class705.field10142 = -1;
                        if (!var3) {
                           break label130;
                        }
                     }

                     if (!arg0.startsWith(field3103[31])) {
                        if (arg0.equals("u")) {
                           class440.field6444 = class306.field4634 & -16777216;
                           if (!var3) {
                              break label130;
                           }
                        }

                        if (!arg0.equals(field3103[30])) {
                           if (arg0.equalsIgnoreCase(field3103[26])) {
                              class157.field2390 = 0;
                              if (!var3) {
                                 break label130;
                              }
                           }

                           if (!arg0.startsWith(field3103[29])) {
                              if (!arg0.equals(field3103[23])) {
                                 if (arg0.equals(field3103[25])) {
                                    class157.field2390 = class715.field10252;
                                    if (!var3) {
                                       break label130;
                                    }
                                 }

                                 if (!arg0.equals(field3103[27])) {
                                    break label130;
                                 }

                                 this.method1871((byte)-92, class196.field2830, class715.field10252);
                                 if (!var3) {
                                    break label130;
                                 }
                              }

                              class157.field2390 = class306.field4634 & -16777216;
                              if (!var3) {
                                 break label130;
                              }
                           }

                           class157.field2390 = class306.field4634 & -16777216 | class788.method5692(arg0.substring(5), arg1 + 1520, 16);
                           if (!var3) {
                              break label130;
                           }
                        }

                        class440.field6444 = -1;
                        if (!var3) {
                           break label130;
                        }
                     }

                     class440.field6444 = class306.field4634 & -16777216 | class788.method5692(arg0.substring(2), 81, 16);
                     if (!var3) {
                        break label130;
                     }
                  }

                  class705.field10142 = class306.field4634 & -16777216 | 8388608;
                  if (!var3) {
                     break label130;
                  }
               }

               class306.field4634 = class788.method5692(arg0.substring(5), 98, 16);
            }
         } catch (Exception var5) {
         }

         ++field3086;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3103[34] + (arg0 != null ? field3103[2] : field3103[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(I[IIIIIIIILaa;Ljava/lang/String;IB[Lma;II)I"
   )
   public final int method1870(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class684 arg9, String arg10, int arg11, byte arg12, class148[] arg13, int arg14, int arg15) {
      try {
         ++field3089;
         if (arg12 > -121) {
            field3081 = null;
         }

         return this.method1862(arg2, arg14, arg6, 0, arg13, arg5, arg1, arg7, arg9, 0, arg0, arg15, arg11, arg4, arg8, arg3, arg10);
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field3103[40] + arg0 + ',' + (arg1 != null ? field3103[2] : field3103[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field3103[2] : field3103[1]) + ',' + (arg10 != null ? field3103[2] : field3103[1]) + ',' + arg11 + ',' + arg12 + ',' + (arg13 != null ? field3103[2] : field3103[1]) + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(BII)V"
   )
   private final void method1871(byte arg0, int arg1, int arg2) {
      try {
         class440.field6444 = -1;
         ++field3099;
         class705.field10142 = -1;
         if (arg0 != -92) {
            this.method1878((char)65511, -30, 80, -47, false, (class684)null, 50, -116);
         }

         if (arg2 == -1) {
            arg2 = 0;
         }

         class484.field6925 = 0;
         class102.field1607 = 0;
         class196.field2830 = arg1;
         class306.field4634 = arg1;
         class715.field10252 = arg2;
         class157.field2390 = arg2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3103[42] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1872(boolean arg0) {
      try {
         field3100 = null;
         field3085 = null;
         if (!arg0) {
            field3100 = null;
         }

         field3081 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3103[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIIIILjava/lang/String;I)V"
   )
   public final void method1873(int param1, int param2, int param3, int param4, int param5, String param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(Ljava/lang/String;I[II[Lma;III)V"
   )
   public final void method1874(String arg0, int arg1, int[] arg2, int arg3, class148[] arg4, int arg5, int arg6, int arg7) {
      try {
         ++field3096;
         if (arg0 != null) {
            if (arg6 != 215) {
               field3085 = null;
            }

            this.method1871((byte)-92, arg7, arg1);
            this.method1879(arg2, arg0, true, (class684)null, arg4, 0, arg3, 0, arg5);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3103[0] + (arg0 != null ? field3103[2] : field3103[1]) + ',' + arg1 + ',' + (arg2 != null ? field3103[2] : field3103[1]) + ',' + arg3 + ',' + (arg4 != null ? field3103[2] : field3103[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public abstract void method1875(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(IIILjava/lang/String;III)V"
   )
   public final void method1876(int param1, int param2, int param3, String param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(II[Lma;IBLjava/lang/String;Ljava/util/Random;[III)I"
   )
   public final int method1877(int arg0, int arg1, class148[] arg2, int arg3, byte arg4, String arg5, Random arg6, int[] arg7, int arg8, int arg9) {
      boolean var11 = client.field10022;

      try {
         ++field3082;
         if (arg5 == null) {
            return 0;
         } else {
            arg6.setSeed((long)arg0);
            int var12 = (arg6.nextInt() & 31) + 192;
            this.method1871((byte)-92, var12 << 24 | 16777215 & arg8, var12 << 24 | 16777215 & arg3);
            if (arg4 <= 35) {
               return 86;
            } else {
               int var13 = arg5.length();
               int[] var14 = new int[var13];
               int var15 = 0;
               int var16 = 0;
               if (var11) {
                  var14[var16] = var15;
                  if (~(3 & arg6.nextInt()) == -1) {
                     ++var15;
                  }

                  ++var16;
               }

               while(true) {
                  while(~var13 < ~var16) {
                     var14[var16] = var15;
                     if (~(3 & arg6.nextInt()) == -1) {
                        ++var15;
                     }

                     ++var16;
                  }

                  this.method1866((int[])null, arg5, arg9, arg1, arg2, var14, arg7, false);
                  if (!var11) {
                     return var15;
                  }

                  if (var15 == -1) {
                     ++var15;
                  }

                  ++var16;
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field3103[19] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3103[2] : field3103[1]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3103[2] : field3103[1]) + ',' + (arg6 != null ? field3103[2] : field3103[1]) + ',' + (arg7 != null ? field3103[2] : field3103[1]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public abstract void method1878(char arg0, int arg1, int arg2, int arg3, boolean arg4, class684 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!da",
      name = "a",
      descriptor = "([ILjava/lang/String;ZLaa;[Lma;IIII)V"
   )
   private final void method1879(int[] param1, String param2, boolean param3, class684 param4, class148[] param5, int param6, int param7, int param8, int param9) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1880(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!da",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1881(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
