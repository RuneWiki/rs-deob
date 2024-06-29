import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public abstract class class735 {
   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10952 = new String[]{method5411(method5410("jL13p4")), method5411(method5410("jL13q4"))};
   @OriginalMember(
      owner = "client!vba",
      name = "e",
      descriptor = "I"
   )
   public static int field10947 = 0;
   @OriginalMember(
      owner = "client!vba",
      name = "c",
      descriptor = "I"
   )
   public static int field10948 = -1;
   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "Lnaa;"
   )
   public static class113 field10950 = new class113(4, 3);
   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "I"
   )
   public static int field10949;
   @OriginalMember(
      owner = "client!vba",
      name = "d",
      descriptor = "Lgg;"
   )
   public static class429 field10951;

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5408(byte arg0) {
      try {
         field10950 = null;
         if (arg0 <= 34) {
            field10950 = null;
         }

         field10951 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10952[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method4639(int arg0);

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method5409(byte param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5410(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5411(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
