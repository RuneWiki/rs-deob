import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class642 extends class213 {
   @OriginalMember(
      owner = "client!jaa",
      name = "v",
      descriptor = "I"
   )
   private int field9384 = -1;
   @OriginalMember(
      owner = "client!jaa",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9389 = new String[]{method4641(method4640("5Fbom")), method4641(method4640("$\t-oQf")), method4641(method4640(" \u001d -")), method4641(method4640("$\t-oSf")), method4641(method4640("$\t-oRf"))};
   @OriginalMember(
      owner = "client!jaa",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field9383 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!jaa",
      name = "B",
      descriptor = "Lll;"
   )
   public static class387 field9382 = new class387();
   @OriginalMember(
      owner = "client!jaa",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field9385 = new int[1000];
   @OriginalMember(
      owner = "client!jaa",
      name = "y",
      descriptor = "I"
   )
   public static int field9387 = 0;
   @OriginalMember(
      owner = "client!jaa",
      name = "x",
      descriptor = "Leg;"
   )
   public static class118 field9386 = new class118(110, 4);
   @OriginalMember(
      owner = "client!jaa",
      name = "t",
      descriptor = "I"
   )
   public static int field9380;
   @OriginalMember(
      owner = "client!jaa",
      name = "w",
      descriptor = "I"
   )
   public static int field9381;
   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "I"
   )
   public static int field9388;

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 6
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         this.field9384 = arg0.method1211(-26166);
         if (arg1 < -38) {
            ++field9381;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9389[3] + (arg0 != null ? field9389[0] : field9389[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 17
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         ++field9380;
         arg0.method3440(-19, this.field9384);
         if (!arg1) {
            field9383 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9389[1] + (arg0 != null ? field9389[0] : field9389[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(B)V",
      line = 30
   )
   public static void method4639(byte arg0) {
      try {
         field9383 = null;
         field9386 = null;
         field9382 = null;
         int var1 = 124 / ((-45 - arg0) / 34);
         field9385 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9389[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4640(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4641(char[] arg0) {
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
            var10005 = 104;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
