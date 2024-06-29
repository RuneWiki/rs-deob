import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class593 {
   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8749 = new String[]{method4418(method4417(").\u0019Bk")), method4418(method4417(").\u0019@k")), method4418(method4417(" 5[o")), method4418(method4417(").\u0019Ak")), method4418(method4417("5n\u0019->"))};
   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "Lse;"
   )
   public static class6 field8744 = new class6(83, 3);
   @OriginalMember(
      owner = "client!gn",
      name = "i",
      descriptor = "I"
   )
   public static int field8740;
   @OriginalMember(
      owner = "client!gn",
      name = "h",
      descriptor = "I"
   )
   public int field8741;
   @OriginalMember(
      owner = "client!gn",
      name = "c",
      descriptor = "I"
   )
   public int field8742;
   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "I"
   )
   public int field8743;
   @OriginalMember(
      owner = "client!gn",
      name = "d",
      descriptor = "I"
   )
   public int field8745;
   @OriginalMember(
      owner = "client!gn",
      name = "f",
      descriptor = "I"
   )
   public static int field8746;
   @OriginalMember(
      owner = "client!gn",
      name = "g",
      descriptor = "Ld;"
   )
   public static class102 field8747;
   @OriginalMember(
      owner = "client!gn",
      name = "e",
      descriptor = "Lkv;"
   )
   public static class19 field8748;

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method4414(int param0, int param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(ILgea;)Lm;"
   )
   public static final class555 method4415(int arg0, class66 arg1) {
      try {
         ++field8740;
         class366 var2 = class413.method3239(arg1, arg0 ^ 16777154);
         if (arg0 != 16777215) {
            method4414(-89, 93, (byte)-96);
         }

         int var3 = arg1.method659(116);
         return new class555(var2.field5091, var2.field5093, var2.field5095, var2.field5098, var2.field5094, var3);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8749[3] + arg0 + ',' + (arg1 != null ? field8749[4] : field8749[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4416(int arg0) {
      try {
         field8748 = null;
         field8744 = null;
         if (arg0 >= 99) {
            field8747 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8749[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4417(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4418(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
