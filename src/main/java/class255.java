import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class255 {
   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3217 = new String[]{method2056(method2055("\u0018/\t\u001eG")), method2056(method2055("\u0018/\t\u001fG")), method2056(method2055("\u0018/\t(\u0000<0U5\u0001\bl")), method2056(method2055("\u0018/\t\u0018G")), method2056(method2055("O\u0014N$\n\u00037\u001d|")), method2056(method2055(" 'D0\u001a\u000b!CfO(6H)\u0001\u000b~")), method2056(method2055(";+S=\u0003O\u000bW=\u001e\u001a!\u0007\u0013\u0001\u001c'U9\n\u0001~\u0007")), method2056(method2055("O\u0005D(\u0006\u0019!\u001d|")), method2056(method2055(" 'D0\u001a\u000b!U/UO")), method2056(method2055("+=I=\u0002\u0006'\u001d|")), method2056(method2055("O\u0013F0\u0003\u001c~\u0007")), method2056(method2055("O\u0007w/UO")), method2056(method2055("\u001a7")), method2056(method2055(";+S=\u0003O\u0010U=\u0001\u001cdh2\u001c\f6B9\u0001Ud")), method2056(method2055(" 'D0\u001a\u000b!\u0007\u001f\u000e\u0003'\u0007\b\u0000\u0000/\u001d|"))};
   @OriginalMember(
      owner = "client!wk",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field3215 = new float[16384];
   @OriginalMember(
      owner = "client!wk",
      name = "b",
      descriptor = "[F"
   )
   public static float[] field3216 = new float[16384];
   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "I"
   )
   public static int field3212;
   @OriginalMember(
      owner = "client!wk",
      name = "d",
      descriptor = "I"
   )
   public static int field3213;
   @OriginalMember(
      owner = "client!wk",
      name = "c",
      descriptor = "I"
   )
   public static int field3214;

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2051() {
      byte var0 = 10;
      byte var1 = 30;
      if (class645.field9669 != 0 && class519.field7302 != null) {
         class158.field2032.method417(class374.field5235);

         for(int var2 = 0; var2 < class278.field3549.length; ++var2) {
            class158.field2032.method3640(class374.field5235[1], class374.field5235[3] - class374.field5235[1], class785.field11472[var2] + class278.field3549[var2], -256, true);
         }

         for(int var3 = 0; var3 < class422.field5761; ++var3) {
            class529 var11 = class379.field5274[var3];
            class158.field2032.method452(var11.field7410[0], var11.field7418[0], var11.field7406[0], class77.field1021);
            class158.field2032.method452(var11.field7410[1], var11.field7418[1], var11.field7406[1], class5.field73);
            class158.field2032.method452(var11.field7410[2], var11.field7418[2], var11.field7406[2], class466.field6412);
            class158.field2032.method452(var11.field7410[3], var11.field7418[3], var11.field7406[3], class313.field4346);
            if (class77.field1021[2] != -1 && class5.field73[2] != -1 && class466.field6412[2] != -1 && class313.field4346[2] != -1) {
               int var12 = -65536;
               if (var11.field7409 == 4) {
                  var12 = -16776961;
               }

               class158.field2032.method3635(class5.field73[0], class5.field73[1], class77.field1021[0], false, class77.field1021[1], var12);
               class158.field2032.method3635(class466.field6412[0], class466.field6412[1], class5.field73[0], false, class5.field73[1], var12);
               class158.field2032.method3635(class313.field4346[0], class313.field4346[1], class466.field6412[0], false, class466.field6412[1], var12);
               class158.field2032.method3635(class77.field1021[0], class77.field1021[1], class313.field4346[0], false, class313.field4346[1], var12);
               class158.field2032.method3635(class466.field6412[0], class466.field6412[1], class77.field1021[0], false, class77.field1021[1], var12);
            }
         }

         class519.field7302.method3433(field3217[9] + class315.field4362 + "/" + 5000, var1 + 45, -112, -16777216, var0, -256);
         class519.field7302.method3433(field3217[6] + class465.field6400 + "/" + 10000, var1 + 60, 116, -16777216, var0, -256);
         class519.field7302.method3433(field3217[13] + class289.field3990 + "/" + 5000, var1 + 75, -5, -16777216, var0, -256);
         class519.field7302.method3433(field3217[8] + (class484.field6739 + class347.field4754) + field3217[7] + class422.field5761, var1 + 90, -21, -16777216, var0, -256);
         class519.field7302.method3433(field3217[5] + class627.field9262 + field3217[10] + class26.field399 + field3217[11] + class159.field2042 + field3217[4] + class516.field7237, var1 + 105, 0, -16777216, var0, -256);
         class519.field7302.method3433(field3217[14] + class448.field6062 / 1000L + field3217[12], var1 + 120, 33, -16777216, var0, -256);
         if (class645.field9669 == 2 && class566.field8330 != null) {
            for(int var4 = 0; var4 < class566.field8330.length; ++var4) {
               float var6 = (float)class566.field8330[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class566.field8330[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class648 var5 = class158.field2032.method3638(class277.field3541, -82, class566.field8330, class362.field5024, class277.field3541, 0);
            var5.method2399(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method2052(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wk",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3212;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3217[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2053(int arg0, int arg1) {
      try {
         ++field3214;
         class487 var2 = class2.method12((long)arg0, arg1, (byte)43);
         var2.method3696(-11118);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3217[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2054(boolean arg0) {
      try {
         field3215 = null;
         if (!arg0) {
            method2052(14, 122, -17, -69, 99, 112, -42, 46);
         }

         field3216 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3217[0] + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field3216[var2] = (float)Math.sin((double)var2 * var0);
         field3215[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2055(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2056(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
