import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class710 extends IOException {
   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10193 = new String[]{method5163(method5162("\fu\u0007\u007f@")), method5163(method5162("\bcER")), method5163(method5162("\u001d8\u0007\u0010\u0015"))};
   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "I"
   )
   public static int field10191;
   @OriginalMember(
      owner = "client!jc",
      name = "b",
      descriptor = "I"
   )
   public static int field10192;

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(ZLcu;)Lsq;"
   )
   public static final class742 method5161(boolean arg0, class65 arg1) {
      try {
         ++field10192;
         class53 var2 = class646.method4704(arg1, -54);
         if (arg0) {
            method5161(true, (class65)null);
         }

         int var3 = arg1.method655((byte)58);
         return new class742(var2.field8705, var2.field8709, var2.field8712, var2.field8703, var2.field8701, var2.field8708, var2.field8707, var2.field8706, var2.field8704, var2.field780, var2.field776, var2.field779, var2.field777, var2.field781, var2.field782, var3);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10193[0] + arg0 + ',' + (arg1 != null ? field10193[2] : field10193[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class710(String arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5162(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5163(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
