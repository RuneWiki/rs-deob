import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class65 {
   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "Ld;"
   )
   public class160 field1192;
   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "I"
   )
   public int field1193;
   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1200 = new String[]{method705(method704("i\u0002Y0")), method705(method704("o\u0016\u001b\u0012]/")), method705(method704("|Y\u001brj")), method705(method704("R:")), method705(method704("o\u0016\u001b\u000f]/")), method705(method704("o\u0016\u001b\u001d\\/")), method705(method704("o\u0016\u001b\t]/")), method705(method704("o\u0016\u001b:~i\u0016Y5mb_")), method705(method704("o\u0016\u001b\n]/")), method705(method704("o\u0016\u001b\u000e]/")), method705(method704("o\u0016\u001b\u0011]/")), method705(method704("o\u0016\u001b\u0013]/")), method705(method704("o\u0016\u001b\f]/")), method705(method704("o\u0016\u001b`~i\u001eAb?")), method705(method704("I1a\u0015")), method705(method704("o\u0016\u001b\r]/")), method705(method704("o\u0016\u001b\u0010]/")), method705(method704("o\u0016\u001b\u000b]/")), method705(method704("o\u0016\u001b\u0017]/")), method705(method704("o\u0016\u001b\u0016]/")), method705(method704("o\u0016\u001b\b]/"))};
   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "Lgh;"
   )
   public static class572 field1182 = new class572(126, 0);
   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field1195 = new float[16];
   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "I"
   )
   public static int field1180;
   @OriginalMember(
      owner = "client!ha",
      name = "t",
      descriptor = "I"
   )
   public static int field1181;
   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "I"
   )
   public static int field1183;
   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "I"
   )
   public static int field1184;
   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "I"
   )
   public static int field1185;
   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "I"
   )
   public static int field1186;
   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "I"
   )
   public static int field1187;
   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "I"
   )
   public static int field1188;
   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "I"
   )
   public static int field1189;
   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "I"
   )
   public static int field1190;
   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "I"
   )
   public static int field1194;
   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "I"
   )
   public static int field1196;
   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "I"
   )
   public static int field1197;
   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "I"
   )
   public static int field1198;
   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "I"
   )
   public static int field1199;
   @OriginalMember(
      owner = "client!ha",
      name = "s",
      descriptor = "Lhw;"
   )
   public static class141 field1191;

   @OriginalMember(
      owner = "client!ha",
      name = "finalize",
      descriptor = "()V",
      line = 4
   )
   protected void finalize() {
      try {
         this.method697(true);
         ++field1181;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1200[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIB)V",
      line = 22
   )
   public final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      try {
         if (arg5 < -109) {
            ++field1194;
            this.method340(arg2, arg3, arg4, arg0, arg1, 1);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1200[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(I)V",
      line = 79
   )
   public final void method690(int arg0) throws class328 {
      try {
         ++field1187;
         this.method393(0, 0);
         if (arg0 != -6145) {
            this.field1193 = 88;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1200[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(BIIIII)V",
      line = 122
   )
   public final void method691(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.method403(arg5, arg3, arg4, arg2, arg1, 1);
         if (arg0 > 54) {
            ++field1183;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1200[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IILhw;Ld;III)Lha;",
      line = 133
   )
   public static final synchronized class65 method692(Canvas arg0, int arg1, int arg2, class141 arg3, class160 arg4, int arg5, int arg6, int arg7) {
      try {
         ++field1184;
         if (~arg1 == -1) {
            return class774.method5598((byte)66, arg6, arg4, arg7, arg0);
         } else if (arg1 == 2) {
            return class646.method4747(arg0, arg4, arg5 ^ -2049, arg6, arg7);
         } else if (~arg1 == -2) {
            return class690.method5023(-70, arg4, arg0, arg2);
         } else if (arg1 == 5) {
            return class499.method3760(arg3, arg4, arg0, arg2, (byte)118);
         } else if (arg1 == 3) {
            return class338.method2616(arg2, arg4, arg3, 48, arg0);
         } else if (arg5 != 2048) {
            return null;
         } else {
            throw new IllegalArgumentException(field1200[3]);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1200[1] + (arg0 != null ? field1200[2] : field1200[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1200[2] : field1200[0]) + ',' + (arg4 != null ? field1200[2] : field1200[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(IIIIII)V",
      line = 181
   )
   public final void method693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg0 != 10240) {
            field1195 = null;
         }

         this.method295(arg5, arg4, arg2, arg3, arg1, 1);
         ++field1197;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1200[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 196
   )
   public final void method694(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1185;
         this.method270(arg4, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1200[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIB)V",
      line = 204
   )
   public final void method695(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.method299(arg3, arg0, arg1, arg2, 1);
         ++field1186;
         int var6 = -13 % ((42 - arg4) / 60);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1200[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIII[I)Ltd;",
      line = 214
   )
   public final class476 method696(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      try {
         ++field1188;
         if (arg3 >= -53) {
            this.field1193 = -93;
         }

         return this.method357(arg5, arg2, arg1, arg4, arg0, true);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field1200[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1200[2] : field1200[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Z)V",
      line = 229
   )
   public final void method697(boolean arg0) {
      try {
         class145.field2373[this.field1193] = false;
         ++field1198;
         this.method272();
         if (!arg0) {
            this.field1193 = 47;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1200[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "(I)V",
      line = 243
   )
   public static void method698(int arg0) {
      try {
         if (arg0 < 38) {
            field1191 = null;
         }

         field1182 = null;
         field1195 = null;
         field1191 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1200[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIII)V",
      line = 258
   )
   public final void method699(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method361(arg2, arg4, arg3, arg1, 1);
         ++field1199;
         if (arg0 < 109) {
            this.method406((class713)null, 116);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1200[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIBII)V",
      line = 290
   )
   public static final void method700(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field1189;
         if (arg2 <= -44) {
            if (~arg3 <= ~class515.field7502 && class130.field2163 >= arg3) {
               int var7 = class741.method5346(arg0, class3.field16, class581.field8354, -1);
               int var8 = class741.method5346(arg4, class3.field16, class581.field8354, -1);
               class729.method5265(arg3, var8, var7, 4558, arg1);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1200[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ltd;I)V",
      line = 317
   )
   public final void method701(class476 arg0, int arg1) {
      try {
         ++field1196;
         if (arg1 == 16032) {
            this.method253(this.method301(arg0, this.method358(arg0.method3002(), arg0.method3005())));
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1200[12] + (arg0 != null ? field1200[2] : field1200[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "<init>",
      descriptor = "(Ld;)V",
      line = 333
   )
   public class65(class160 arg0) {
      boolean var2 = client.field4564;
      super();

      try {
         this.field1192 = arg0;
         int var3 = -1;
         int var4 = 0;
         int var10000;
         if (var2) {
            var10000 = class145.field2373[var4];
         } else if (var4 >= 8) {
            var10000 = var3;
            if (!var2) {
               if (var3 == -1) {
                  throw new IllegalStateException(field1200[14]);
               }

               this.field1193 = var3;
               return;
            }
         } else {
            var10000 = class145.field2373[var4];
         }

         do {
            while(true) {
               if (var10000 == 0) {
                  class145.field2373[var4] = true;
                  var3 = var4;
                  if (!var2) {
                     var10000 = var4;
                     break;
                  }

                  ++var4;
               } else {
                  ++var4;
               }

               if (var4 >= 8) {
                  var10000 = var3;
                  if (!var2) {
                     if (var3 == -1) {
                        throw new IllegalStateException(field1200[14]);
                     }

                     this.field1193 = var3;
                     return;
                  }
               } else {
                  var10000 = class145.field2373[var4];
               }
            }
         } while(var2);

         if (var4 == -1) {
            throw new IllegalStateException(field1200[14]);
         } else {
            this.field1193 = var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1200[13] + (arg0 != null ? field1200[2] : field1200[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIILoha;)V",
      line = 365
   )
   public static final void method702(int arg0, int arg1, int arg2, int arg3, class771 arg4) {
      boolean var5 = client.field4564;

      try {
         int var6 = -22 / ((arg0 - 7) / 61);
         ++field1190;
         class654 var7 = arg4.method5574(31482);
         int var8 = 16383 & arg4.field11293 - arg4.field11236.field6800;
         if (arg1 == -1) {
            if (var8 == 0 && arg4.field11260 <= 25) {
               if (!arg4.field11266 || !var7.method4810(arg4.field11284, 0)) {
                  arg4.field11284 = var7.method4806(0);
                  arg4.field11266 = arg4.field11284 != -1;
               }

            } else {
               label288: {
                  if (~arg3 > -1 && ~var7.field9494 != 0) {
                     arg4.field11284 = var7.field9494;
                     arg4.field11266 = false;
                     if (!var5) {
                        break label288;
                     }
                  }

                  if (arg3 > 0 && ~var7.field9528 != 0) {
                     arg4.field11284 = var7.field9528;
                     if (!var5) {
                        break label288;
                     }
                  }

                  arg4.field11284 = var7.field9514;
               }

               arg4.field11266 = false;
            }
         } else if (arg4.field11263 != -1 && (var8 >= 10240 || ~var8 >= -2049)) {
            int var9 = 16383 & class7.field71[arg2] + -arg4.field11236.field6800;
            arg4.field11266 = false;
            if (~arg1 == -3 && ~var7.field9524 != 0) {
               if (var9 > 2048 && var9 <= 6144 && ~var7.field9520 != 0) {
                  arg4.field11284 = var7.field9520;
               } else if (~var9 <= -10241 && ~var9 > -14337 && var7.field9539 != -1) {
                  arg4.field11284 = var7.field9539;
               } else if (var9 > 6144 && ~var9 > -10241 && var7.field9525 != -1) {
                  arg4.field11284 = var7.field9525;
               } else {
                  arg4.field11284 = var7.field9524;
               }
            } else if (~arg1 == -1 && var7.field9515 != -1) {
               if (~var9 < -2049 && ~var9 >= -6145 && var7.field9516 != -1) {
                  arg4.field11284 = var7.field9516;
               } else if (var9 >= 10240 && var9 < 14336 && var7.field9491 != -1) {
                  arg4.field11284 = var7.field9491;
               } else if (~var9 < -6145 && ~var9 > -10241 && var7.field9542 != -1) {
                  arg4.field11284 = var7.field9542;
               } else {
                  arg4.field11284 = var7.field9515;
               }
            } else if (var9 > 2048 && ~var9 >= -6145 && var7.field9489 != -1) {
               arg4.field11284 = var7.field9489;
            } else if (var9 >= 10240 && var9 < 14336 && ~var7.field9522 != 0) {
               arg4.field11284 = var7.field9522;
            } else if (var9 > 6144 && ~var9 > -10241 && var7.field9499 != -1) {
               arg4.field11284 = var7.field9499;
            } else {
               arg4.field11284 = var7.field9514;
            }
         } else if (var8 == 0 && arg4.field11260 <= 25) {
            label310: {
               if (arg1 == 2 && var7.field9524 != -1) {
                  arg4.field11284 = var7.field9524;
                  if (!var5) {
                     break label310;
                  }
               }

               if (arg1 != 0 || var7.field9515 == -1) {
                  arg4.field11284 = var7.field9514;
                  if (!var5) {
                     break label310;
                  }
               }

               arg4.field11284 = var7.field9515;
            }

            arg4.field11266 = false;
         } else {
            arg4.field11266 = false;
            if (~arg1 == -3 && ~var7.field9524 != 0) {
               if (~arg3 > -1 && var7.field9493 != -1) {
                  arg4.field11284 = var7.field9493;
               } else if (arg3 > 0 && var7.field9497 != -1) {
                  arg4.field11284 = var7.field9497;
               } else {
                  arg4.field11284 = var7.field9524;
               }
            } else if (arg1 == 0 && var7.field9515 != -1) {
               if (arg3 < 0 && ~var7.field9502 != 0) {
                  arg4.field11284 = var7.field9502;
               } else if (~arg3 < -1 && ~var7.field9537 != 0) {
                  arg4.field11284 = var7.field9537;
               } else {
                  arg4.field11284 = var7.field9515;
               }
            } else if (arg3 < 0 && ~var7.field9498 != 0) {
               arg4.field11284 = var7.field9498;
            } else if (arg3 > 0 && ~var7.field9500 != 0) {
               arg4.field11284 = var7.field9500;
            } else {
               arg4.field11284 = var7.field9514;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1200[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1200[2] : field1200[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;BI)V",
      line = 539
   )
   public final void method703(Rectangle[] arg0, byte arg1, int arg2) throws class328 {
      try {
         if (arg1 <= -1) {
            this.method381(arg0, arg2, 0, 0);
            ++field1180;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1200[9] + (arg0 != null ? field1200[2] : field1200[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ha",
      name = "xa",
      descriptor = "(F)V"
   )
   public abstract void method297(float arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "E",
      descriptor = "()I"
   )
   public abstract int method287();

   @OriginalMember(
      owner = "client!ha",
      name = "m",
      descriptor = "()Lvfa;"
   )
   public abstract class698 method273();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lvm;I)V"
   )
   public abstract void method406(class713 arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "g",
      descriptor = "(I)V"
   )
   public abstract void method444(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lpa;Lpa;FLpa;)Lpa;"
   )
   public abstract class386 method441(class386 arg0, class386 arg1, float arg2, class386 arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "da",
      descriptor = "(III[I)V"
   )
   public abstract void method389(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lika;[Ltn;Z)Lda;"
   )
   public abstract class66 method414(class445 arg0, class94[] arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "la",
      descriptor = "()V"
   )
   public abstract void method349();

   @OriginalMember(
      owner = "client!ha",
      name = "y",
      descriptor = "()Ldfa;"
   )
   public abstract class173 method398();

   @OriginalMember(
      owner = "client!ha",
      name = "pa",
      descriptor = "()V"
   )
   public abstract void method374();

   @OriginalMember(
      owner = "client!ha",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public abstract void method270(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "i",
      descriptor = "()I"
   )
   public abstract int method291();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public abstract void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public abstract void method261(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lsfa;)V"
   )
   public abstract void method253(class723 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "C",
      descriptor = "(Z)V"
   )
   public abstract void method316(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "T",
      descriptor = "(IIII)V"
   )
   public abstract void method309(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public abstract void method325(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "x",
      descriptor = "()Z"
   )
   public abstract boolean method348();

   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "(I)V"
   )
   public abstract void method378(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "k",
      descriptor = "()Z"
   )
   public abstract boolean method308();

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(II)Lrj;"
   )
   public abstract class619 method263(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "Y",
      descriptor = "()[I"
   )
   public abstract int[] method278();

   @OriginalMember(
      owner = "client!ha",
      name = "I",
      descriptor = "()I"
   )
   public abstract int method346();

   @OriginalMember(
      owner = "client!ha",
      name = "s",
      descriptor = "()Z"
   )
   public abstract boolean method404();

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method391(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public abstract void method361(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lpa;)V"
   )
   public abstract void method402(class386 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIZ)Ltd;"
   )
   public abstract class476 method342(int arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "M",
      descriptor = "()I"
   )
   public abstract int method318();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([IIIIIZ)Ltd;"
   )
   public abstract class476 method357(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public abstract void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "()Z"
   )
   public abstract boolean method274();

   @OriginalMember(
      owner = "client!ha",
      name = "p",
      descriptor = "()V"
   )
   public abstract void method272();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(FFF)V"
   )
   public abstract void method371(float arg0, float arg1, float arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "()Z"
   )
   public abstract boolean method411();

   @OriginalMember(
      owner = "client!ha",
      name = "F",
      descriptor = "(II)V"
   )
   public abstract void method326(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method323(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "()Z"
   )
   public abstract boolean method351();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lph;IIII)Lka;"
   )
   public abstract class495 method352(class668 arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIZ)Ltd;"
   )
   public abstract class476 method265(int arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "X",
      descriptor = "(I)V"
   )
   public abstract void method339(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public abstract void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "()Z"
   )
   public abstract boolean method416();

   @OriginalMember(
      owner = "client!ha",
      name = "K",
      descriptor = "([I)V"
   )
   public abstract void method254(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public abstract void method381(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class328;

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(I)Lza;"
   )
   public abstract class432 method300(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(II)V"
   )
   public abstract void method296(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "t",
      descriptor = "()V"
   )
   public abstract void method321();

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method336(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lvm;)V"
   )
   public abstract void method256(class713 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "()V"
   )
   public abstract void method268();

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(Z)V"
   )
   public abstract void method394(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "(II)I"
   )
   public abstract int method354(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public abstract void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "w",
      descriptor = "()Z"
   )
   public abstract boolean method386();

   @OriginalMember(
      owner = "client!ha",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method312(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "u",
      descriptor = "()Z"
   )
   public abstract boolean method410();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public abstract void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public abstract class510 method304(int arg0, int arg1, int[] arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public abstract int[] method407(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "H",
      descriptor = "(III[I)V"
   )
   public abstract void method367(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public abstract int method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "L",
      descriptor = "(III)V"
   )
   public abstract void method424(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public abstract void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIIF)Lke;"
   )
   public abstract class622 method258(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public abstract int method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public abstract void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public abstract void method260(int arg0, class510 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method393(int arg0, int arg1) throws class328;

   @OriginalMember(
      owner = "client!ha",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method379();

   @OriginalMember(
      owner = "client!ha",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public abstract void method280(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ha",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public abstract void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public abstract void method310(Canvas arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ha",
      name = "d",
      descriptor = "(II)I"
   )
   public abstract int method269(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public abstract void method337(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "ya",
      descriptor = "()V"
   )
   public abstract void method380();

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "()Ldfa;"
   )
   public abstract class173 method255();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method317(boolean arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "j",
      descriptor = "()Z"
   )
   public abstract boolean method327();

   @OriginalMember(
      owner = "client!ha",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public abstract void method429(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method264(int[] arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "o",
      descriptor = "()Ldfa;"
   )
   public abstract class173 method432();

   @OriginalMember(
      owner = "client!ha",
      name = "l",
      descriptor = "()Z"
   )
   public abstract boolean method328();

   @OriginalMember(
      owner = "client!ha",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public abstract void method408(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public abstract class293 method396(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method417(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "e",
      descriptor = "()V"
   )
   public abstract void method375();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(II)Leg;"
   )
   public abstract class117 method358(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "h",
      descriptor = "(I)V"
   )
   public abstract void method442(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "n",
      descriptor = "()V"
   )
   public abstract void method433();

   @OriginalMember(
      owner = "client!ha",
      name = "GA",
      descriptor = "(I)V"
   )
   public abstract void method421(int arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method427(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(I[Lke;)V"
   )
   public abstract void method364(int arg0, class622[] arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "q",
      descriptor = "()V"
   )
   public abstract void method438();

   @OriginalMember(
      owner = "client!ha",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method267();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public abstract void method286(class432 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Lrj;Leg;)Lsfa;"
   )
   public abstract class723 method301(class619 arg0, class117 arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "v",
      descriptor = "()I"
   )
   public abstract int method329();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public abstract void method338(class173 arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "XA",
      descriptor = "()I"
   )
   public abstract int method437();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ltn;Z)Ltd;"
   )
   public abstract class476 method307(class94 arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public abstract void method315(Canvas arg0);

   @OriginalMember(
      owner = "client!ha",
      name = "b",
      descriptor = "()Z"
   )
   public abstract boolean method392();

   @OriginalMember(
      owner = "client!ha",
      name = "a",
      descriptor = "(IIIIII)Lpa;"
   )
   public abstract class386 method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ha",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public abstract void method333(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method704(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method705(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
