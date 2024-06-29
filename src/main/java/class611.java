import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class611 extends class750 {
   @OriginalMember(
      owner = "client!id",
      name = "y",
      descriptor = "B"
   )
   public byte field8950 = 5;
   @OriginalMember(
      owner = "client!id",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8962 = new String[]{method4455(method4454("@\f\u0019m")), method4455(method4454("UW[/v")), method4455(method4454("G\u001d[B#")), method4455(method4454("G\u001d[C#")), method4455(method4454("G\u001d[E#"))};
   @OriginalMember(
      owner = "client!id",
      name = "m",
      descriptor = "I"
   )
   public static int field8951 = 0;
   @OriginalMember(
      owner = "client!id",
      name = "w",
      descriptor = "Lsda;"
   )
   public static class269 field8959 = new class269(49, 7);
   @OriginalMember(
      owner = "client!id",
      name = "q",
      descriptor = "I"
   )
   public int field8948;
   @OriginalMember(
      owner = "client!id",
      name = "p",
      descriptor = "I"
   )
   public static int field8949;
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "I"
   )
   public int field8952;
   @OriginalMember(
      owner = "client!id",
      name = "r",
      descriptor = "I"
   )
   public int field8953;
   @OriginalMember(
      owner = "client!id",
      name = "v",
      descriptor = "I"
   )
   public int field8954;
   @OriginalMember(
      owner = "client!id",
      name = "x",
      descriptor = "I"
   )
   public static int field8955;
   @OriginalMember(
      owner = "client!id",
      name = "o",
      descriptor = "I"
   )
   public int field8956;
   @OriginalMember(
      owner = "client!id",
      name = "n",
      descriptor = "I"
   )
   public static int field8958;
   @OriginalMember(
      owner = "client!id",
      name = "u",
      descriptor = "I"
   )
   public int field8960;
   @OriginalMember(
      owner = "client!id",
      name = "t",
      descriptor = "Lat;"
   )
   public static class396 field8961;
   @OriginalMember(
      owner = "client!id",
      name = "s",
      descriptor = "Z"
   )
   public boolean field8957;

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(ILeaa;[ILeaa;)V",
      line = 16
   )
   public static final void method4451(int arg0, class526 arg1, int[] arg2, class526 arg3) {
      try {
         class54.field620 = arg3;
         class97.field1198 = arg1;
         ++field8958;
         if (arg2 != null) {
            class442.field6740 = arg2;
         }

         if (arg0 != 49) {
            method4453(false, -43, (class66)null, -33);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8962[2] + arg0 + ',' + (arg1 != null ? field8962[1] : field8962[0]) + ',' + (arg2 != null ? field8962[1] : field8962[0]) + ',' + (arg3 != null ? field8962[1] : field8962[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(I)V",
      line = 41
   )
   public static void method4452(int arg0) {
      try {
         if (arg0 > 9) {
            field8961 = null;
            field8959 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8962[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(ZILha;I)Lda;",
      line = 60
   )
   public static final class67 method4453(boolean arg0, int arg1, class66 arg2, int arg3) {
      try {
         ++field8949;
         class407 var4 = class204.method1563(arg0, -106, arg3, arg2);
         if (arg1 != -23653) {
            return null;
         } else {
            return var4 == null ? null : var4.field6220;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8962[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8962[1] : field8962[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4454(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4455(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
