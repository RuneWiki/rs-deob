import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class175 {
   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2414 = new String[]{method1416(method1415("gU#(Uib6tHhVj")), method1416(method1415("gU#(`."))};
   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "I"
   )
   public static int field2410 = 0;
   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field2411 = true;
   @OriginalMember(
      owner = "client!ada",
      name = "d",
      descriptor = "I"
   )
   public static int field2409;
   @OriginalMember(
      owner = "client!ada",
      name = "e",
      descriptor = "I"
   )
   public static int field2412;
   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "I"
   )
   public static int field2413;

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(III)I",
      line = 3
   )
   public final int method1414(int arg0, int arg1, int arg2) {
      try {
         ++field2413;
         int var4 = arg2 >= class692.field10185 ? arg2 : class692.field10185;
         if (class547.field7843 == this) {
            return 0;
         } else if (class311.field4273 == this) {
            return var4 - arg0;
         } else if (class66.field801 == this) {
            return (var4 - arg0) / 2;
         } else {
            int var5 = 12 / ((37 - arg1) / 45);
            return 0;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2414[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 30
   )
   public final String toString() {
      try {
         ++field2412;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2414[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1415(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1416(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
