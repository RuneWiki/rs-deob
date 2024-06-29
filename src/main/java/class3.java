import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public class class3 {
   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field17 = new String[]{method15(method14("jSCm\u001b/")), method15(method14("jSCm\u0018/"))};
   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "Lnaa;"
   )
   public static class113 field16 = new class113(68, 1);
   @OriginalMember(
      owner = "client!mka",
      name = "b",
      descriptor = "I"
   )
   public static int field15;

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(IBII)V",
      line = 11
   )
   public static final void method12(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field15;
         if (arg1 == -97) {
            class566 var4 = class146.method1321((long)arg2, 11, -1428737160);
            var4.method4269((byte)-113);
            var4.field8398 = arg0;
            var4.field8394 = arg3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field17[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(Z)V",
      line = 32
   )
   public static void method13(boolean arg0) {
      try {
         field16 = null;
         if (arg0) {
            method13(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field17[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method14(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method15(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
