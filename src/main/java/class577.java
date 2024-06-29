import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class577 {
   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "I"
   )
   public int field8144;
   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8148 = new String[]{method4269(method4268("^\bJ}\u001fT\b\u0010\u007f^")), method4269(method4268("^\bJ\u0003^")), method4269(method4268("^\bJ5\u0019i\u0015\u0016(\u0018]I"))};
   @OriginalMember(
      owner = "client!di",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field8146 = new int[25];
   @OriginalMember(
      owner = "client!di",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field8147 = false;
   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "I"
   )
   public static int field8145;
   @OriginalMember(
      owner = "client!di",
      name = "c",
      descriptor = "Lsa;"
   )
   public static class39 field8143;

   @OriginalMember(
      owner = "client!di",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8145;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8148[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(Ldea;III)V"
   )
   public static final void method4266(class471 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class155.field2381) {
         class312 var4 = class324.field4826[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field4677 != null && var4.field4677.method731(255)) {
            arg0.method719(0, var4.field4677, 0, true, class720.field10315, class44.field655, 0);
         }
      }

      if (arg3 < class155.field2381) {
         class312 var5 = class324.field4826[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field4677 != null && var5.field4677.method731(255)) {
            arg0.method719(0, var5.field4677, class44.field655, true, class720.field10315, 0, 0);
         }
      }

      if (arg2 < class155.field2381 && arg3 < class25.field360) {
         class312 var6 = class324.field4826[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field4677 != null && var6.field4677.method731(255)) {
            arg0.method719(0, var6.field4677, class44.field655, true, class720.field10315, class44.field655, 0);
         }
      }

      if (arg2 < class155.field2381 && arg3 > 0) {
         class312 var7 = class324.field4826[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field4677 != null && var7.field4677.method731(255)) {
            arg0.method719(0, var7.field4677, -class44.field655, true, class720.field10315, class44.field655, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4267(byte arg0) {
      try {
         field8143 = null;
         field8146 = null;
         if (arg0 != -87) {
            method4266((class471)null, 94, -65, 60);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8148[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class577(int arg0, int arg1) {
      try {
         this.field8144 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8148[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4268(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4269(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
