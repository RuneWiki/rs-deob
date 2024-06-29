import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class class288 {
   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3987 = new String[]{method2339(method2338("2.\u0014\u001bD")), method2339(method2338("(4\\>\u0001!/")), method2339(method2338("3\"[(\t`,[1\u0002")), method2339(method2338("2.\u0014\u001aD"))};
   @OriginalMember(
      owner = "client!ro",
      name = "c",
      descriptor = "Lnf;"
   )
   public static class137 field3985 = new class137(0, 0);
   @OriginalMember(
      owner = "client!ro",
      name = "f",
      descriptor = "Lse;"
   )
   public static class6 field3986 = new class6(25, 4);
   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "I"
   )
   public static int field3981;
   @OriginalMember(
      owner = "client!ro",
      name = "e",
      descriptor = "I"
   )
   public static int field3984;
   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field3983;
   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field3982;

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2335(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(Llaa;I)Llaa;"
   )
   public abstract class502 method2336(class502 arg0, int arg1);

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2337(byte arg0) {
      try {
         field3982 = null;
         field3985 = null;
         int var1 = -20 % ((arg0 - 80) / 45);
         field3986 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3987[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2338(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2339(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
