import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class343 {
   @OriginalMember(
      owner = "client!rl",
      name = "l",
      descriptor = "I"
   )
   public int field5047 = -1;
   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5057 = new String[]{method2730(method2729("\u0005\u00020s\u0017")), method2730(method2729("\u0005\u00020p\u0017"))};
   @OriginalMember(
      owner = "client!rl",
      name = "e",
      descriptor = "Ltb;"
   )
   public static class392 field5054 = null;
   @OriginalMember(
      owner = "client!rl",
      name = "b",
      descriptor = "I"
   )
   public int field5045;
   @OriginalMember(
      owner = "client!rl",
      name = "k",
      descriptor = "I"
   )
   public int field5046;
   @OriginalMember(
      owner = "client!rl",
      name = "j",
      descriptor = "I"
   )
   public int field5049;
   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "I"
   )
   public int field5050;
   @OriginalMember(
      owner = "client!rl",
      name = "i",
      descriptor = "I"
   )
   public int field5051;
   @OriginalMember(
      owner = "client!rl",
      name = "f",
      descriptor = "I"
   )
   public static int field5052;
   @OriginalMember(
      owner = "client!rl",
      name = "g",
      descriptor = "I"
   )
   public int field5053;
   @OriginalMember(
      owner = "client!rl",
      name = "h",
      descriptor = "I"
   )
   public int field5055;
   @OriginalMember(
      owner = "client!rl",
      name = "c",
      descriptor = "I"
   )
   public int field5056;
   @OriginalMember(
      owner = "client!rl",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field5048;

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(FFBF)I"
   )
   public static final int method2727(float arg0, float arg1, byte arg2, float arg3) {
      try {
         ++field5052;
         if (arg2 != 118) {
            method2727(-1.1996101F, -1.0726488F, (byte)104, 0.4837586F);
         }

         float var4 = arg0 < 0.0F ? -arg0 : arg0;
         float var5 = arg1 < 0.0F ? -arg1 : arg1;
         float var6 = !(arg3 < 0.0F) ? arg3 : -arg3;
         if (var4 < var5 && var5 > var6) {
            return !(arg1 > 0.0F) ? 1 : 0;
         } else if (var6 > var4 && var6 > var5) {
            return arg3 > 0.0F ? 2 : 3;
         } else {
            return arg0 > 0.0F ? 4 : 5;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5057[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2728(int arg0) {
      try {
         field5054 = null;
         if (arg0 != 2) {
            field5048 = true;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5057[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2729(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2730(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
