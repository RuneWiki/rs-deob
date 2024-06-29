import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class711 {
   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10437 = new String[]{method5188(method5187("n6z@#3")), method5188(method5187("n6z@ 3"))};
   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "[J"
   )
   public static long[] field10435 = new long[10];
   @OriginalMember(
      owner = "client!ufa",
      name = "e",
      descriptor = "F"
   )
   public static float field10436;
   @OriginalMember(
      owner = "client!ufa",
      name = "d",
      descriptor = "I"
   )
   public static int field10433;
   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "I"
   )
   public static int field10434;
   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field10432;

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5185(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5186(int arg0) {
      try {
         field10435 = null;
         field10432 = null;
         if (arg0 < 29) {
            method5185(-82);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10437[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5187(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5188(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
