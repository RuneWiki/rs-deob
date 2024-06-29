import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class637 extends class65 {
   @OriginalMember(
      owner = "client!ar",
      name = "Nb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9013 = new String[]{method4651(method4650("W[\u0007KU\u001e")), method4651(method4650("W[\u0007HU\u001e")), method4651(method4650("W[\u0007IU\u001e")), method4651(method4650("W[\u0007NU\u001e"))};
   @OriginalMember(
      owner = "client!ar",
      name = "Lb",
      descriptor = "I"
   )
   public static int field9007 = 1409;
   @OriginalMember(
      owner = "client!ar",
      name = "O",
      descriptor = "Lsb;"
   )
   public static class261 field9006 = new class261();
   @OriginalMember(
      owner = "client!ar",
      name = "Mb",
      descriptor = "I"
   )
   public static int field9010 = 0;
   @OriginalMember(
      owner = "client!ar",
      name = "Jb",
      descriptor = "Ldb;"
   )
   public static class685 field9012 = new class685(13, 19);
   @OriginalMember(
      owner = "client!ar",
      name = "Hb",
      descriptor = "I"
   )
   public static int field9008;
   @OriginalMember(
      owner = "client!ar",
      name = "Kb",
      descriptor = "I"
   )
   public static int field9009;
   @OriginalMember(
      owner = "client!ar",
      name = "Ib",
      descriptor = "I"
   )
   public static int field9011;

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(IIIIIIB)V"
   )
   public static final void method4646(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ar",
      name = "t",
      descriptor = "(I)V"
   )
   public static void method4647(int arg0) {
      try {
         if (arg0 != 1409) {
            field9006 = null;
         }

         field9012 = null;
         field9006 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9013[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class637(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method4648(int arg0, float arg1) {
      try {
         ++field9009;
         int var3 = Stream.floatToRawIntBits(arg1);
         if (arg0 != 14571) {
            field9012 = null;
         }

         super.field942[super.field945++] = (byte)var3;
         super.field942[super.field945++] = (byte)(var3 >> 8);
         super.field942[super.field945++] = (byte)(var3 >> 16);
         super.field942[super.field945++] = (byte)(var3 >> 24);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9013[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(FI)V"
   )
   public final void method4649(float arg0, int arg1) {
      try {
         ++field9008;
         int var3 = Stream.floatToRawIntBits(arg0);
         super.field942[super.field945++] = (byte)(var3 >> 24);
         if (arg1 == 1409) {
            super.field942[super.field945++] = (byte)(var3 >> 16);
            super.field942[super.field945++] = (byte)(var3 >> 8);
            super.field942[super.field945++] = (byte)var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9013[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4650(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4651(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
