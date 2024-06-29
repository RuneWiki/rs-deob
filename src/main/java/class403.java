import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class403 {
   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5652 = new String[]{method3053(method3052("f\u0003vn^")), method3053(method3052("f\u0003vo^"))};
   @OriginalMember(
      owner = "client!oj",
      name = "b",
      descriptor = "Lsca;"
   )
   public static class49 field5647 = new class49(method3053(method3052("^ \b")), 2);
   @OriginalMember(
      owner = "client!oj",
      name = "c",
      descriptor = "[S"
   )
   public static short[] field5650 = new short[]{3, 8, 22, 11, 46, 53, 49, 5};
   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "F"
   )
   public static float field5649;
   @OriginalMember(
      owner = "client!oj",
      name = "d",
      descriptor = "I"
   )
   public static int field5648;
   @OriginalMember(
      owner = "client!oj",
      name = "e",
      descriptor = "I"
   )
   public static int field5651;

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3050(byte arg0) {
      try {
         field5647 = null;
         if (arg0 != 60) {
            field5649 = -1.0462235F;
         }

         field5650 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5652[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3051(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3052(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3053(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
