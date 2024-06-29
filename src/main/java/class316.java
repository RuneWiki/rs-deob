import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class316 {
   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4307 = new String[]{method2323(method2322("E,\u0015z\u0018\u0003")), method2323(method2322("E,\u0015z\u001d\u0003")), method2323(method2322("E,\u0015z\u001f\u0003")), method2323(method2322("E,\u0015z\u001e\u0003"))};
   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field4301 = new class118(2, 5);
   @OriginalMember(
      owner = "client!nba",
      name = "c",
      descriptor = "[Lgk;"
   )
   public static class503[] field4305 = new class503[0];
   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "I"
   )
   public static int field4299;
   @OriginalMember(
      owner = "client!nba",
      name = "e",
      descriptor = "I"
   )
   public static int field4300;
   @OriginalMember(
      owner = "client!nba",
      name = "f",
      descriptor = "I"
   )
   public static int field4303;
   @OriginalMember(
      owner = "client!nba",
      name = "d",
      descriptor = "Lnu;"
   )
   public static class619 field4304;
   @OriginalMember(
      owner = "client!nba",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field4302;
   @OriginalMember(
      owner = "client!nba",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field4306;

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(II)V",
      line = 4
   )
   public static final void method2318(int arg0, int arg1) {
      try {
         ++field4300;
         class755 var2 = class317.method2325((long)arg0, 93, 2);
         var2.method5481(arg1 + -12554);
         if (arg1 != 12438) {
            method2318(-87, 86);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4307[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IIIIZI)V",
      line = 19
   )
   public static final void method2319(int param0, int param1, int param2, int param3, boolean param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(B)V",
      line = 154
   )
   public static void method2320(byte arg0) {
      try {
         field4306 = null;
         field4305 = null;
         field4304 = null;
         field4301 = null;
         if (arg0 != 27) {
            method2318(-15, 114);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4307[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(III)Z",
      line = 167
   )
   public static final boolean method2321(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 1024) {
            return false;
         } else {
            ++field4303;
            return (33 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4307[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2322(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2323(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
