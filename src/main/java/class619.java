import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class619 {
   @OriginalMember(
      owner = "client!uo",
      name = "i",
      descriptor = "I"
   )
   public int field9006 = -1;
   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9012 = new String[]{method4558(method4557("k.W\u0002<")), method4558(method4557("k.W\u0001<"))};
   @OriginalMember(
      owner = "client!uo",
      name = "l",
      descriptor = "Ltv;"
   )
   public static class311 field9004 = new class311(method4558(method4557("l4\u0017&g} \t&")), method4558(method4557("L4\u0017&G} \t&")), 0);
   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field9009 = new class113(47, 7);
   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "I"
   )
   public static int field9011 = 0;
   @OriginalMember(
      owner = "client!uo",
      name = "e",
      descriptor = "I"
   )
   public int field8999;
   @OriginalMember(
      owner = "client!uo",
      name = "g",
      descriptor = "I"
   )
   public int field9000;
   @OriginalMember(
      owner = "client!uo",
      name = "k",
      descriptor = "I"
   )
   public int field9001;
   @OriginalMember(
      owner = "client!uo",
      name = "j",
      descriptor = "I"
   )
   public int field9002;
   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "I"
   )
   public int field9003;
   @OriginalMember(
      owner = "client!uo",
      name = "h",
      descriptor = "I"
   )
   public int field9005;
   @OriginalMember(
      owner = "client!uo",
      name = "f",
      descriptor = "I"
   )
   public static int field9007;
   @OriginalMember(
      owner = "client!uo",
      name = "m",
      descriptor = "I"
   )
   public int field9008;
   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "I"
   )
   public int field9010;

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4555(int arg0) {
      try {
         if (arg0 != 47) {
            method4555(117);
         }

         field9009 = null;
         field9004 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9012[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4556(int arg0) {
      try {
         ++field9007;
         class21.field273 = new class675();
         if (arg0 != 0) {
            field9009 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9012[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4557(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4558(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
