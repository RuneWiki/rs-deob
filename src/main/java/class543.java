import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class543 {
   @OriginalMember(
      owner = "client!nga",
      name = "v",
      descriptor = "[F"
   )
   private float[] field7403 = new float[16];
   @OriginalMember(
      owner = "client!nga",
      name = "s",
      descriptor = "Liu;"
   )
   private class608 field7397 = new class608(786336);
   @OriginalMember(
      owner = "client!nga",
      name = "d",
      descriptor = "I"
   )
   private int field7404 = class138.method1155(1600, (byte)-122);
   @OriginalMember(
      owner = "client!nga",
      name = "p",
      descriptor = "[I"
   )
   private int[] field7420 = new int[8191];
   @OriginalMember(
      owner = "client!nga",
      name = "j",
      descriptor = "[I"
   )
   private int[] field7422 = new int[64];
   @OriginalMember(
      owner = "client!nga",
      name = "h",
      descriptor = "[I"
   )
   private int[] field7419 = new int[1600];
   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "[[Lva;"
   )
   private class526[][] field7421 = new class526[64][768];
   @OriginalMember(
      owner = "client!nga",
      name = "A",
      descriptor = "I"
   )
   private int field7423 = 0;
   @OriginalMember(
      owner = "client!nga",
      name = "i",
      descriptor = "[[Lva;"
   )
   private class526[][] field7417 = new class526[1600][64];
   @OriginalMember(
      owner = "client!nga",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7424 = new String[]{method3928(method3927("&`!Wx`")), method3928(method3927("3)nWD")), method3928(method3927("&r,\u0015")), method3928(method3927("&`!W\u007f`")), method3928(method3927("&`!Wz`")), method3928(method3927("&`!W{`")), method3928(method3927("&`!Wq`")), method3928(method3927("&`!Ws`")), method3928(method3927("gw}")), method3928(method3927("gf}")), method3928(method3927("dfr")), method3928(method3927(" s4\t\u0003g(")), method3928(method3927("gk}")), method3928(method3927("\u0017t%\u0015_")), method3928(method3927("dh")), method3928(method3927("&`!Wr`")), method3928(method3927("gm")), method3928(method3927("&`!W|`")), method3928(method3927("&`!W~`")), method3928(method3927("&`!W}`")), method3928(method3927("&`!Wp`"))};
   @OriginalMember(
      owner = "client!nga",
      name = "c",
      descriptor = "Lro;"
   )
   public static class2 field7399 = new class2(2);
   @OriginalMember(
      owner = "client!nga",
      name = "B",
      descriptor = "Lbga;"
   )
   public static class378 field7406 = new class378(18, 7);
   @OriginalMember(
      owner = "client!nga",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field7414 = new int[3];
   @OriginalMember(
      owner = "client!nga",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field7418 = new int[1000];
   @OriginalMember(
      owner = "client!nga",
      name = "n",
      descriptor = "Lod;"
   )
   public static class536 field7412 = new class536();
   @OriginalMember(
      owner = "client!nga",
      name = "l",
      descriptor = "I"
   )
   public static int field7396;
   @OriginalMember(
      owner = "client!nga",
      name = "w",
      descriptor = "I"
   )
   public static int field7398;
   @OriginalMember(
      owner = "client!nga",
      name = "x",
      descriptor = "I"
   )
   public static int field7400;
   @OriginalMember(
      owner = "client!nga",
      name = "g",
      descriptor = "I"
   )
   public static int field7401;
   @OriginalMember(
      owner = "client!nga",
      name = "e",
      descriptor = "I"
   )
   public static int field7402;
   @OriginalMember(
      owner = "client!nga",
      name = "r",
      descriptor = "I"
   )
   public static int field7405;
   @OriginalMember(
      owner = "client!nga",
      name = "f",
      descriptor = "I"
   )
   public static int field7408;
   @OriginalMember(
      owner = "client!nga",
      name = "k",
      descriptor = "I"
   )
   public static int field7411;
   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "I"
   )
   public static int field7413;
   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "I"
   )
   public static int field7415;
   @OriginalMember(
      owner = "client!nga",
      name = "u",
      descriptor = "Lwq;"
   )
   private class178 field7407;
   @OriginalMember(
      owner = "client!nga",
      name = "q",
      descriptor = "Lwq;"
   )
   private class178 field7409;
   @OriginalMember(
      owner = "client!nga",
      name = "t",
      descriptor = "Lwq;"
   )
   private class178 field7410;
   @OriginalMember(
      owner = "client!nga",
      name = "o",
      descriptor = "Lei;"
   )
   private class189 field7416;

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(Lor;I)V"
   )
   private final void method3916(class670 arg0, int arg1) {
      try {
         arg0.method4837(true, -32);
         ++field7402;
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
         if (class179.field2233 != arg0.field9808) {
            arg0.method557(class179.field2233);
         }

         if (arg1 != -12239) {
            method3921(-71);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7424[4] + (arg0 != null ? field7424[1] : field7424[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(Lor;Z)V"
   )
   private final void method3917(class670 arg0, boolean arg1) {
      try {
         class179.field2233 = arg0.field9808;
         ++field7396;
         arg0.method4836((byte)-15);
         OpenGL.glDisable(16384);
         if (!arg1) {
            method3920((byte)-53, (class297)null);
         }

         OpenGL.glDisable(16385);
         arg0.method4837(false, -32);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7424[0] + (arg0 != null ? field7424[1] : field7424[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(ILor;Z)V"
   )
   private final void method3918(int param1, class670 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3919(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(BLkd;)Z"
   )
   public static final boolean method3920(byte arg0, class297 arg1) {
      try {
         ++field7408;
         if (arg1 == null) {
            return false;
         } else if (!arg1.field3931) {
            return false;
         } else if (!arg1.method2239(class618.field8614, (byte)-92)) {
            return false;
         } else if (class561.field7692.method1839(-124, (long)arg1.field3914) != null) {
            return false;
         } else if (arg0 <= 87) {
            return true;
         } else {
            return class507.field7016.method1839(3, (long)arg1.field3902) == null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7424[6] + arg0 + ',' + (arg1 != null ? field7424[1] : field7424[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3921(int arg0) {
      try {
         field7399 = null;
         field7406 = null;
         field7412 = null;
         field7418 = null;
         if (arg0 >= -18) {
            field7406 = null;
         }

         field7414 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7424[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(BLor;)V"
   )
   public final void method3922(byte arg0, class670 arg1) {
      try {
         ++field7411;
         this.field7416 = arg1.method4835(true, (byte[])null, 196584, (byte)85, 24);
         if (arg0 != 57) {
            this.field7409 = null;
         }

         this.field7409 = new class178(this.field7416, 5126, 2, 0);
         this.field7407 = new class178(this.field7416, 5126, 3, 8);
         this.field7410 = new class178(this.field7416, 5121, 4, 20);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7424[17] + arg0 + ',' + (arg1 != null ? field7424[1] : field7424[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(IILor;)V"
   )
   private final void method3923(int arg0, int arg1, class670 arg2) {
      try {
         ++field7405;
         class179.field2233 = arg2.field9808;
         if (arg0 != -25272) {
            field7412 = null;
         }

         arg2.method4897(-4, (float)arg1);
         arg2.method4867(-99);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg2.method4837(false, -32);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7424[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7424[1] : field7424[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(ILor;Ljea;I)V"
   )
   public final void method3924(int param1, class670 param2, class478 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3925(int arg0) {
      boolean var1 = client.field4273;

      try {
         if (arg0 != 24933) {
            method3925(-22);
         }

         int var2 = 0;
         int var10000;
         if (var1) {
            var10000 = class348.method2749(var2 - -class671.field9871, class124.field1540, (byte)-72) * class498.field6856;
         } else if (~var2 <= ~class124.field1540) {
            var10000 = field7400 + 1;
            if (!var1) {
               field7400 = var10000;
               return;
            }
         } else {
            var10000 = class348.method2749(var2 - -class671.field9871, class124.field1540, (byte)-72) * class498.field6856;
         }

         while(true) {
            int var3 = var10000;
            int var4 = 0;
            if (var1 || ~class498.field6856 < ~var4) {
               do {
                  int var5 = var3 + class348.method2749(class458.field6280 + var4, class498.field6856, (byte)-72);
                  if (~class302.field4001[var5] == ~class492.field6769) {
                     class599.field8362[var5].method1309(0, 0, class477.field6599, class182.field2249, class477.field6599 * var4, class182.field2249 * var2, true, true);
                  }

                  ++var4;
               } while(~class498.field6856 < ~var4);
            }

            ++var2;
            if (~var2 <= ~class124.field1540) {
               var10000 = field7400 + 1;
               if (!var1) {
                  field7400 = var10000;
                  return;
               }
            } else {
               var10000 = class348.method2749(var2 - -class671.field9871, class124.field1540, (byte)-72) * class498.field6856;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7424[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(IILjava/lang/String;)Z"
   )
   public static final boolean method3926(int arg0, int arg1, String arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7413;
         if (class61.field671.field3257) {
            class698.field10191 = new class454();
            class698.field10191.field6242 = arg0;
            class698.field10191.field6244 = arg2;
            if (class304.field4027 != class269.field3480) {
               class698.field10191.field6239 = class698.field10191.field6242 + 40000;
               class698.field10191.field6241 = class698.field10191.field6242 + 50000;
            }

            int var4 = 0;
            if (var3) {
               if (class182.field2252[var4].field971 == arg0) {
                  class633.field8955 = class182.field2252[var4].field7688;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (class182.field2252.length <= var4) {
                  var10000 = 1;
                  if (!var3) {
                     return true;
                  }
               } else {
                  var10000 = class182.field2252[var4].field971;
               }

               if (var10000 == arg0) {
                  class633.field8955 = class182.field2252[var4].field7688;
               }

               ++var4;
            }
         } else {
            String var5 = "";
            if (class304.field4027 != class269.field3480) {
               var5 = ":" + (arg0 + 7000);
            }

            String var6 = "";
            if (class701.field10211 != null) {
               var6 = field7424[8] + class701.field10211;
            }

            if (arg1 != -29330) {
               method3926(108, 126, (String)null);
            }

            String var7 = field7424[11] + arg2 + var5 + field7424[12] + class494.field6787 + field7424[9] + class74.field924 + var6 + field7424[16] + (class710.field10422 ? "1" : "0") + field7424[14] + (!class647.field9062 ? "0" : "1") + field7424[10];

            try {
               class15.field197.getAppletContext().showDocument(new URL(var7), field7424[13]);
               return true;
            } catch (Exception var9) {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field7424[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7424[1] : field7424[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3927(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3928(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
