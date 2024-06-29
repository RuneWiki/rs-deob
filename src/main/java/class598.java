import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class598 {
   @OriginalMember(
      owner = "client!sm",
      name = "n",
      descriptor = "[F"
   )
   private float[] field8420 = new float[16];
   @OriginalMember(
      owner = "client!sm",
      name = "v",
      descriptor = "Lar;"
   )
   private class637 field8413 = new class637(786336);
   @OriginalMember(
      owner = "client!sm",
      name = "l",
      descriptor = "I"
   )
   private int field8424 = class682.method4979(1600, true);
   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "I"
   )
   private int field8430 = 0;
   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "[I"
   )
   private int[] field8432 = new int[1600];
   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "[I"
   )
   private int[] field8429 = new int[8191];
   @OriginalMember(
      owner = "client!sm",
      name = "h",
      descriptor = "[[Lqja;"
   )
   private class137[][] field8433 = new class137[1600][64];
   @OriginalMember(
      owner = "client!sm",
      name = "k",
      descriptor = "[I"
   )
   private int[] field8431 = new int[64];
   @OriginalMember(
      owner = "client!sm",
      name = "j",
      descriptor = "[[Lqja;"
   )
   private class137[][] field8428 = new class137[64][768];
   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8434 = new String[]{method4388(method4387("$yB_U")), method4388(method4387("1\"\u0000\u001d")), method4388(method4387(",:B6\u0000")), method4388(method4387(",:B2\u0000")), method4388(method4387(",:B5\u0000")), method4388(method4387(",:B3\u0000")), method4388(method4387(",:B9\u0000")), method4388(method4387(",:B0\u0000")), method4388(method4387(",:B4\u0000")), method4388(method4387(",:B7\u0000"))};
   @OriginalMember(
      owner = "client!sm",
      name = "w",
      descriptor = "I"
   )
   public static int field8419 = 0;
   @OriginalMember(
      owner = "client!sm",
      name = "s",
      descriptor = "Lvf;"
   )
   public static class73 field8416 = new class73();
   @OriginalMember(
      owner = "client!sm",
      name = "g",
      descriptor = "I"
   )
   public static int field8411;
   @OriginalMember(
      owner = "client!sm",
      name = "e",
      descriptor = "I"
   )
   public static int field8412;
   @OriginalMember(
      owner = "client!sm",
      name = "f",
      descriptor = "I"
   )
   public static int field8414;
   @OriginalMember(
      owner = "client!sm",
      name = "r",
      descriptor = "I"
   )
   public static int field8415;
   @OriginalMember(
      owner = "client!sm",
      name = "q",
      descriptor = "I"
   )
   public static int field8418;
   @OriginalMember(
      owner = "client!sm",
      name = "i",
      descriptor = "I"
   )
   public static int field8421;
   @OriginalMember(
      owner = "client!sm",
      name = "t",
      descriptor = "I"
   )
   public static int field8422;
   @OriginalMember(
      owner = "client!sm",
      name = "o",
      descriptor = "Lwu;"
   )
   private class451 field8423;
   @OriginalMember(
      owner = "client!sm",
      name = "p",
      descriptor = "Lwu;"
   )
   private class451 field8425;
   @OriginalMember(
      owner = "client!sm",
      name = "d",
      descriptor = "Lwu;"
   )
   private class451 field8426;
   @OriginalMember(
      owner = "client!sm",
      name = "u",
      descriptor = "Luba;"
   )
   private class516 field8427;
   @OriginalMember(
      owner = "client!sm",
      name = "m",
      descriptor = "Lua;"
   )
   public static class569 field8417;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Luv;Laea;II)V"
   )
   public final void method4379(class521 param1, class678 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "(Laea;II)V"
   )
   private final void method4380(class678 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(BLlba;Llba;)V"
   )
   public static final void method4381(byte arg0, class247 arg1, class247 arg2) {
      try {
         if (arg1.field3776 != null) {
            arg1.method2140((byte)122);
         }

         int var3 = 65 / ((arg0 - 32) / 54);
         ++field8415;
         arg1.field3776 = arg2.field3776;
         arg1.field3781 = arg2;
         arg1.field3776.field3781 = arg1;
         arg1.field3781.field3776 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8434[3] + arg0 + ',' + (arg1 != null ? field8434[0] : field8434[1]) + ',' + (arg2 != null ? field8434[0] : field8434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4382(int arg0) {
      try {
         field8417 = null;
         field8416 = null;
         if (arg0 != 16) {
            method4382(-85);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8434[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "(Laea;I)V"
   )
   private final void method4383(class678 arg0, int arg1) {
      try {
         if (arg1 != 2090769324) {
            this.method4385((class678)null, 87, -9);
         }

         arg0.method4894(true, (byte)56);
         ++field8414;
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
         if (class243.field3742 != arg0.field9807) {
            arg0.method197(class243.field3742);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8434[7] + (arg0 != null ? field8434[0] : field8434[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Laea;I)V"
   )
   public final void method4384(class678 arg0, int arg1) {
      try {
         ++field8412;
         this.field8427 = arg0.method4912(24, (byte)15, 196584, true, (byte[])null);
         this.field8426 = new class451(this.field8427, 5126, 2, 0);
         this.field8425 = new class451(this.field8427, 5126, 3, arg1);
         this.field8423 = new class451(this.field8427, 5121, 4, 20);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8434[8] + (arg0 != null ? field8434[0] : field8434[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Laea;II)V"
   )
   private final void method4385(class678 arg0, int arg1, int arg2) {
      try {
         ++field8411;
         class243.field3742 = arg0.field9807;
         arg0.method4955((float)arg2, 81);
         arg0.method4957(31691);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg0.method4894(false, (byte)80);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
         if (arg1 > -39) {
            this.method4380((class678)null, -90, -73);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8434[2] + (arg0 != null ? field8434[0] : field8434[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(ILaea;)V"
   )
   private final void method4386(int arg0, class678 arg1) {
      try {
         class243.field3742 = arg1.field9807;
         ++field8422;
         arg1.method4945(false);
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
         arg1.method4894(false, (byte)84);
         OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
         if (arg0 < 68) {
            this.field8425 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8434[4] + arg0 + ',' + (arg1 != null ? field8434[0] : field8434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
