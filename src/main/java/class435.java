import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class435 extends class213 {
   @OriginalMember(
      owner = "client!fr",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6234 = new String[]{method3214(method3213("eq&\tf")), method3214(method3213("eq&\u000ff")), method3214(method3213("mvd'")), method3214(method3213("x-&e3")), method3214(method3213("eq&\bf")), method3214(method3213("eq&\nf"))};
   @OriginalMember(
      owner = "client!fr",
      name = "C",
      descriptor = "Lek;"
   )
   public static class536 field6228 = new class536(17, 3);
   @OriginalMember(
      owner = "client!fr",
      name = "y",
      descriptor = "Lkda;"
   )
   public static class412 field6230 = new class412(method3214(method3213("OJ^\u000e")), "", "", 0);
   @OriginalMember(
      owner = "client!fr",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field6231 = false;
   @OriginalMember(
      owner = "client!fr",
      name = "v",
      descriptor = "S"
   )
   public static short field6232 = 320;
   @OriginalMember(
      owner = "client!fr",
      name = "B",
      descriptor = "Lns;"
   )
   public static class427 field6233 = new class427();
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "I"
   )
   private int field6224;
   @OriginalMember(
      owner = "client!fr",
      name = "x",
      descriptor = "I"
   )
   public static int field6226;
   @OriginalMember(
      owner = "client!fr",
      name = "u",
      descriptor = "I"
   )
   public static int field6227;
   @OriginalMember(
      owner = "client!fr",
      name = "t",
      descriptor = "I"
   )
   public static int field6229;
   @OriginalMember(
      owner = "client!fr",
      name = "A",
      descriptor = "J"
   )
   private long field6225;

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 3
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         if (arg1 <= -38) {
            this.field6224 = arg0.method1164(19693);
            ++field6227;
            this.field6225 = arg0.method1207(false);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6234[4] + (arg0 != null ? field6234[3] : field6234[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(II)Lsia;",
      line = 16
   )
   public static final class768 method3211(int arg0, int arg1) {
      try {
         ++field6226;
         if (arg1 != 5192) {
            method3212(38);
         }

         return new class768(arg0, false);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6234[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "(I)V",
      line = 32
   )
   public static void method3212(int arg0) {
      try {
         field6230 = null;
         field6233 = null;
         field6228 = null;
         if (arg0 != 0) {
            field6233 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6234[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 44
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         ++field6229;
         arg0.method3426(this.field6225, this.field6224, 121);
         if (!arg1) {
            field6231 = true;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6234[5] + (arg0 != null ? field6234[3] : field6234[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3213(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3214(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
