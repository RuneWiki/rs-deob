import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class645 extends class512 {
   @OriginalMember(
      owner = "client!tl",
      name = "c",
      descriptor = "[I"
   )
   public int[] field9387;
   @OriginalMember(
      owner = "client!tl",
      name = "e",
      descriptor = "[I"
   )
   public int[] field9384;
   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9388 = new String[]{method4657(method4656("\tH\u001a<Y")), method4657(method4656("\u0006\n\u001aP\f")), method4657(method4656("\u0013QX\u0012")), method4657(method4656("\tH\u001aB\u0018\u0013M@@Y")), method4657(method4656("\tH\u001a=Y"))};
   @OriginalMember(
      owner = "client!tl",
      name = "f",
      descriptor = "Lum;"
   )
   public static class550 field9385 = new class550();
   @OriginalMember(
      owner = "client!tl",
      name = "d",
      descriptor = "I"
   )
   public static int field9386;

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(II)I",
      line = 3
   )
   public static final int method4654(int arg0, int arg1) {
      try {
         ++field9386;
         if (arg0 < 20) {
            method4655(true);
         }

         return 255 & arg1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9388[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Z)V",
      line = 18
   )
   public static void method4655(boolean arg0) {
      try {
         field9385 = null;
         if (arg0) {
            method4654(-39, -13);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9388[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "<init>",
      descriptor = "(II[I[I)V",
      line = 33
   )
   public class645(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field9387 = arg3;
         this.field9384 = arg2;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9388[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9388[1] : field9388[2]) + ',' + (arg3 != null ? field9388[1] : field9388[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4657(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
