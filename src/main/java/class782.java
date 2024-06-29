import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class782 extends class22 implements class184 {
   @OriginalMember(
      owner = "client!fja",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11458 = new String[]{method5652(method5651("\fI->")), method5652(method5651("\u0004V |pJ")), method5652(method5651("\u0019\u0012o|J")), method5652(method5651("\u0004V |qJ")), method5652(method5651("\u0004V |tJ")), method5652(method5651("\u0004V |rJ")), method5652(method5651("\u0004V |~J")), method5652(method5651("\u0004V |\u007fJ")), method5652(method5651("\u0004V |uJ")), method5652(method5651("\u0004V |vJ")), method5652(method5651("\u0004V |sJ"))};
   @OriginalMember(
      owner = "client!fja",
      name = "p",
      descriptor = "Lgh;"
   )
   public static class572 field11452 = new class572(41, 10);
   @OriginalMember(
      owner = "client!fja",
      name = "o",
      descriptor = "I"
   )
   public static int field11454 = 0;
   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "Luw;"
   )
   public static class435 field11453 = new class435(3, 7);
   @OriginalMember(
      owner = "client!fja",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field11457 = new int[32];
   @OriginalMember(
      owner = "client!fja",
      name = "k",
      descriptor = "C"
   )
   public char field11448;
   @OriginalMember(
      owner = "client!fja",
      name = "l",
      descriptor = "I"
   )
   public static int field11439;
   @OriginalMember(
      owner = "client!fja",
      name = "r",
      descriptor = "I"
   )
   public static int field11440;
   @OriginalMember(
      owner = "client!fja",
      name = "v",
      descriptor = "I"
   )
   public int field11441;
   @OriginalMember(
      owner = "client!fja",
      name = "w",
      descriptor = "I"
   )
   public static int field11442;
   @OriginalMember(
      owner = "client!fja",
      name = "t",
      descriptor = "I"
   )
   public int field11443;
   @OriginalMember(
      owner = "client!fja",
      name = "s",
      descriptor = "I"
   )
   public static int field11444;
   @OriginalMember(
      owner = "client!fja",
      name = "u",
      descriptor = "I"
   )
   public static int field11445;
   @OriginalMember(
      owner = "client!fja",
      name = "j",
      descriptor = "I"
   )
   public static int field11446;
   @OriginalMember(
      owner = "client!fja",
      name = "q",
      descriptor = "I"
   )
   public static int field11447;
   @OriginalMember(
      owner = "client!fja",
      name = "x",
      descriptor = "I"
   )
   public static int field11451;
   @OriginalMember(
      owner = "client!fja",
      name = "m",
      descriptor = "I"
   )
   public static int field11455;
   @OriginalMember(
      owner = "client!fja",
      name = "A",
      descriptor = "I"
   )
   public int field11456;
   @OriginalMember(
      owner = "client!fja",
      name = "B",
      descriptor = "J"
   )
   public static long field11449;
   @OriginalMember(
      owner = "client!fja",
      name = "y",
      descriptor = "J"
   )
   public long field11450;

   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "(B)C",
      line = 5
   )
   public final char method1623(byte arg0) {
      try {
         ++field11444;
         return arg0 > -33 ? '\\' : this.field11448;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11458[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(B)J",
      line = 17
   )
   public final long method1621(byte arg0) {
      try {
         ++field11446;
         return arg0 >= -8 ? 79L : this.field11450;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11458[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(ZI)V",
      line = 28
   )
   public static final void method5647(boolean arg0, int arg1) {
      try {
         ++field11447;
         if (!arg0) {
            field11454 = 105;
         }

         class536 var2 = class108.method1038((long)arg1, 106, 4);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11458[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "b",
      descriptor = "(I)I",
      line = 41
   )
   public final int method1622(int arg0) {
      try {
         ++field11445;
         if (arg0 != 14255) {
            field11449 = 15L;
         }

         return this.field11456;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11458[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(Ljava/lang/String;ZLjava/lang/String;BZII)V",
      line = 53
   )
   public static final void method5648(String param0, boolean param1, String param2, byte param3, boolean param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fja",
      name = "c",
      descriptor = "(B)I",
      line = 168
   )
   public final int method1620(byte arg0) {
      try {
         ++field11439;
         return arg0 != 73 ? 0 : this.field11441;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11458[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(IIIFFFII)[F",
      line = 182
   )
   public static final float[] method5649(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, int arg7) {
      try {
         ++field11440;
         float[] var8 = new float[9];
         float[] var9 = new float[9];
         if (arg1 != -11021) {
            method5648((String)null, true, (String)null, (byte)-124, true, 85, -97);
         }

         label34: {
            float var10 = (float)Math.cos((double)((float)arg7 * 0.024543693F));
            float var11 = (float)Math.sin((double)((float)arg7 * 0.024543693F));
            var8[1] = 0.0F;
            var8[0] = var10;
            var8[2] = var11;
            var8[8] = var10;
            var8[4] = 1.0F;
            var8[6] = -var11;
            var8[3] = 0.0F;
            var8[5] = 0.0F;
            var8[7] = 0.0F;
            float var12 = -var10 + 1.0F;
            float[] var13 = new float[9];
            float var14 = 1.0F;
            float var15 = (float)arg0 / 32767.0F;
            float var16 = 0.0F;
            float var17 = 1.0F - var15;
            float var18 = -((float)Math.sqrt((double)(-(var15 * var15) + 1.0F)));
            float var19 = (float)Math.sqrt((double)(arg2 * arg2 + arg6 * arg6));
            if (var19 != 0.0F || var15 != 0.0F) {
               if (var19 != 0.0F) {
                  var16 = (float)arg2 / var19;
                  var14 = (float)(-arg6) / var19;
               }

               var13[7] = -var14 * var18;
               var13[4] = var15;
               var13[1] = var16 * var18;
               var13[8] = var16 * var16 * var17 + var15;
               var13[3] = -var16 * var18;
               var13[6] = var14 * var16 * var17;
               var13[5] = var14 * var18;
               var13[2] = var14 * var16 * var17;
               var13[0] = var14 * var14 * var17 + var15;
               var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
               var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
               var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
               var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
               var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
               var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
               var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
               var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
               var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
               if (!client.field4564) {
                  break label34;
               }
            }

            var9 = var8;
         }

         var9[5] *= arg3;
         var9[3] *= arg3;
         var9[4] *= arg3;
         var9[0] *= arg5;
         var9[2] *= arg5;
         var9[6] *= arg4;
         var9[7] *= arg4;
         var9[8] *= arg4;
         var9[1] *= arg5;
         return var9;
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field11458[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "a",
      descriptor = "(I)I",
      line = 269
   )
   public final int method1619(int arg0) {
      try {
         if (arg0 < 11) {
            this.method1621((byte)14);
         }

         ++field11455;
         return this.field11443;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11458[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "d",
      descriptor = "(B)V",
      line = 296
   )
   public static void method5650(byte arg0) {
      try {
         field11453 = null;
         field11452 = null;
         int var1 = -9 % ((arg0 - -21) / 50);
         field11457 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11458[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5651(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5652(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
