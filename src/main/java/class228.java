import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class228 implements class534 {
   @OriginalMember(
      owner = "client!jka",
      name = "i",
      descriptor = "Lvj;"
   )
   private class283 field3547;
   @OriginalMember(
      owner = "client!jka",
      name = "f",
      descriptor = "Llia;"
   )
   private class372 field3542;
   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3551 = new String[]{method2032(method2031("H5\u0015S0\n")), method2032(method2031("H5\u0015S=\n")), method2032(method2031("YpZS\u0004")), method2032(method2031("H5\u0015SEK0\u001d\tG\n")), method2032(method2031("L+\u0018\u0011")), method2032(method2031("H5\u0015S1\n")), method2032(method2031("H5\u0015S;\n")), method2032(method2031("H5\u0015S8\n")), method2032(method2031("H5\u0015S<\n")), method2032(method2031("H5\u0015S>\n")), method2032(method2031("H5\u0015S:\n"))};
   @OriginalMember(
      owner = "client!jka",
      name = "j",
      descriptor = "D"
   )
   public static double field3541;
   @OriginalMember(
      owner = "client!jka",
      name = "h",
      descriptor = "I"
   )
   public static int field3540;
   @OriginalMember(
      owner = "client!jka",
      name = "e",
      descriptor = "I"
   )
   public static int field3543;
   @OriginalMember(
      owner = "client!jka",
      name = "k",
      descriptor = "I"
   )
   public static int field3544;
   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "I"
   )
   public static int field3545;
   @OriginalMember(
      owner = "client!jka",
      name = "g",
      descriptor = "I"
   )
   public static int field3546;
   @OriginalMember(
      owner = "client!jka",
      name = "d",
      descriptor = "I"
   )
   public static int field3548;
   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "I"
   )
   public static int field3549;
   @OriginalMember(
      owner = "client!jka",
      name = "c",
      descriptor = "I"
   )
   public static int field3550;

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method984(int arg0) {
      try {
         if (arg0 <= 67) {
            return true;
         } else {
            ++field3549;
            return this.field3542.method2914(true);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3551[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(Loga;Lka;IIII)V"
   )
   public static final void method2026(class358 arg0, class761 arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3540;
         int var6 = 91 % ((-30 - arg3) / 61);
         if (arg1 != null) {
            arg0.method2814(arg1.method782(), arg2, arg1.method797(), arg1.method800(), arg5, arg1.method758(), arg1.method783(), (byte)9, arg4, arg1.method801(), arg1.method779());
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3551[10] + (arg0 != null ? field3551[2] : field3551[4]) + ',' + (arg1 != null ? field3551[2] : field3551[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method983(boolean arg0, int arg1) {
      try {
         ++field3543;
         class596 var3 = this.field3542.method2916(this.field3547.field4279, 0);
         if (arg1 >= -55) {
            this.field3547 = null;
         }

         if (var3 != null) {
            int var4 = this.field3547.field4283.method4636(class111.field1737, (byte)-79, this.field3547.field4278) - -this.field3547.field4263;
            int var5 = this.field3547.field4262.method5290(this.field3547.field4277, class595.field8386, 103) - -this.field3547.field4284;
            if (this.field3547.field4271) {
               class54.field794.method257(var4, var5, this.field3547.field4278, this.field3547.field4277, this.field3547.field4270, 0);
            }

            int var6 = var5 + 12 * this.method2030(class437.field6409, var4, 5, var5, -723, var3.field8392);
            int var11 = var6 + 8;
            if (this.field3547.field4271) {
               class54.field794.method196(var4, var11, this.field3547.field4278 + var4 - 1, var11, this.field3547.field4270, 0);
            }

            var6 = var11 + 1;
            int var7 = var6 + this.method2030(class437.field6409, var4, 5, var6, -723, var3.field8396) * 12;
            int var12 = var7 + 5;
            int var10000 = var12 + 12 * this.method2030(class437.field6409, var4, 5, var12, -723, var3.field8395);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3551[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method988(byte arg0) {
      try {
         if (arg0 >= 88) {
            ++field3548;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3551[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(BLlw;)V"
   )
   public static final void method2027(byte arg0, class408 arg1) {
      try {
         arg1.method674(-88, class121.field1955.method430((byte)100));
         ++field3550;
         arg1.method674(-69, class13.field195.method430((byte)116));
         arg1.method674(-127, class324.field4825.method430((byte)103));
         arg1.method674(-112, class379.field5554.method430((byte)62));
         arg1.method674(-114, class327.field4855.method430((byte)95));
         arg1.method674(-70, class488.field6962.method430((byte)93));
         arg1.method674(-66, class580.field8166.method430((byte)124));
         arg1.method674(-48, class571.field8096.method430((byte)112));
         arg1.method674(-19, class790.field11506.method430((byte)62));
         arg1.method674(-55, class7.field126.method430((byte)71));
         if (arg0 <= 118) {
            method2028(true);
         }

         arg1.method674(-38, class448.field6520.method430((byte)78));
         arg1.method674(-83, class72.field1167.method430((byte)51));
         arg1.method674(-102, class577.field8143.method430((byte)118));
         arg1.method674(-91, class1.field5.method430((byte)112));
         arg1.method674(-53, class306.field4638.method430((byte)66));
         arg1.method674(-108, class348.field5112.method430((byte)116));
         arg1.method674(-24, class442.field6467.method430((byte)77));
         arg1.method674(-121, class344.field5067.method430((byte)83));
         arg1.method674(-79, class283.field4282.method430((byte)83));
         arg1.method674(-53, class184.field2712.method430((byte)113));
         arg1.method674(-70, class778.field11349.method430((byte)82));
         arg1.method674(-24, class517.field7316.method430((byte)75));
         arg1.method674(-79, class692.field9956.method430((byte)126));
         arg1.method674(-107, class254.field3858.method430((byte)66));
         arg1.method674(-21, class435.field6370.method430((byte)121));
         arg1.method674(-95, class496.field7072.method430((byte)92));
         arg1.method674(-103, class278.field4220.method430((byte)73));
         arg1.method674(-16, class290.field4346.method430((byte)100));
         arg1.method674(-20, class324.field4827.method430((byte)74));
         arg1.method674(-91, class156.field2386.method430((byte)103));
         arg1.method674(-119, class492.field7020.method430((byte)109));
         arg1.method674(-28, class199.field2876.method430((byte)63));
         arg1.method674(-16, class355.method2791(false));
         arg1.method674(-76, class360.method2833(1));
         arg1.method674(-34, class499.field7100.method430((byte)75));
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3551[8] + arg0 + ',' + (arg1 != null ? field3551[2] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(Z)Lcu;"
   )
   public static final class65 method2028(boolean arg0) {
      try {
         ++field3546;
         class65 var1 = new class65(518);
         class536.field7523 = new int[4];
         class536.field7523[2] = (int)(Math.random() * 9.9999999E7D);
         class536.field7523[1] = (int)(Math.random() * 9.9999999E7D);
         class536.field7523[3] = (int)(Math.random() * 9.9999999E7D);
         class536.field7523[0] = (int)(9.9999999E7D * Math.random());
         var1.method656((byte)-125, 10);
         var1.method674(-100, class536.field7523[0]);
         if (arg0) {
            return null;
         } else {
            var1.method674(-103, class536.field7523[1]);
            var1.method674(-28, class536.field7523[2]);
            var1.method674(-71, class536.field7523[3]);
            return var1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3551[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2029(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field3545;
         int var7 = -arg5 + arg1;
         int var8 = -arg0 + arg2;
         if (var7 == 0) {
            if (~var8 != -1) {
               class278.method2341(arg3, arg5, arg2, arg0, (byte)-56);
            }

         } else if (~var8 == -1) {
            class623.method4592(arg5, true, arg3, arg1, arg0);
         } else {
            if (arg4 < 113) {
               method2026((class358)null, (class761)null, 72, -34, -105, 88);
            }

            int var9;
            int var10;
            int var11;
            int var12;
            label81: {
               var9 = (var8 << 12) / var7;
               var10 = -(arg5 * var9 >> 12) + arg0;
               if (arg1 < class729.field10384) {
                  var11 = (class729.field10384 * var9 >> 12) + var10;
                  var12 = class729.field10384;
                  if (!var6) {
                     break label81;
                  }
               }

               if (~arg1 < ~class604.field8618) {
                  var11 = (class604.field8618 * var9 >> 12) + var10;
                  var12 = class604.field8618;
                  if (!var6) {
                     break label81;
                  }
               }

               var11 = arg2;
               var12 = arg1;
            }

            int var13;
            int var14;
            label63: {
               if (~class729.field10384 >= ~arg5) {
                  if (~class604.field8618 <= ~arg5) {
                     var13 = arg5;
                     var14 = arg0;
                     if (!var6) {
                        break label63;
                     }
                  }

                  var13 = class604.field8618;
                  var14 = (class604.field8618 * var9 >> 12) + var10;
                  if (!var6) {
                     break label63;
                  }
               }

               var13 = class729.field10384;
               var14 = (class729.field10384 * var9 >> 12) + var10;
            }

            label55: {
               if (class587.field8239 > var11) {
                  var11 = class587.field8239;
                  var12 = (class587.field8239 - var10 << 12) / var9;
                  if (!var6) {
                     break label55;
                  }
               }

               if (~var11 < ~class767.field11011) {
                  var12 = (-var10 + class767.field11011 << 12) / var9;
                  var11 = class767.field11011;
               }
            }

            label50: {
               if (class587.field8239 > var14) {
                  var14 = class587.field8239;
                  var13 = (-var10 + class587.field8239 << 12) / var9;
                  if (!var6) {
                     break label50;
                  }
               }

               if (~var14 < ~class767.field11011) {
                  var13 = (-var10 + class767.field11011 << 12) / var9;
                  var14 = class767.field11011;
               }
            }

            class231.method2058(arg3, var11, var12, false, var14, var13);
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field3551[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "<init>",
      descriptor = "(Llia;Lvj;)V"
   )
   public class228(class372 arg0, class283 arg1) {
      try {
         this.field3547 = arg1;
         this.field3542 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3551[3] + (arg0 != null ? field3551[2] : field3551[4]) + ',' + (arg1 != null ? field3551[2] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(Lda;IIIILjava/lang/String;)I"
   )
   private final int method2030(class216 arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
      try {
         ++field3544;
         if (arg4 != -723) {
            this.field3547 = null;
         }

         return arg0.method1870(0, (int[])null, 0, arg2 + arg3, 0, arg1 - -arg2, 0, this.field3547.field4276, this.field3547.field4275, (class684)null, arg5, this.field3547.field4278 - arg2 * 2, (byte)-127, (class148[])null, this.field3547.field4277 - arg2 * 2, 0);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3551[6] + (arg0 != null ? field3551[2] : field3551[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3551[2] : field3551[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2031(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2032(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
