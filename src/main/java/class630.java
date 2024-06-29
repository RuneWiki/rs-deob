import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class630 extends class213 {
   @OriginalMember(
      owner = "client!qs",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   private String field9243 = null;
   @OriginalMember(
      owner = "client!qs",
      name = "w",
      descriptor = "J"
   )
   private long field9242 = -1L;
   @OriginalMember(
      owner = "client!qs",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9248 = new String[]{method4567(method4566("zdyA")), method4567(method4566("o?;\u0003Q")), method4567(method4566("eb;n\u0004")), method4567(method4566("eb;i\u0004")), method4567(method4566("eb;l\u0004")), method4567(method4566("eb;o\u0004"))};
   @OriginalMember(
      owner = "client!qs",
      name = "u",
      descriptor = "Loi;"
   )
   public static class80 field9241 = new class80(128, 4);
   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "Lqd;"
   )
   public static class475 field9246 = new class475("", 13);
   @OriginalMember(
      owner = "client!qs",
      name = "y",
      descriptor = "I"
   )
   public static int field9244;
   @OriginalMember(
      owner = "client!qs",
      name = "t",
      descriptor = "I"
   )
   public static int field9245;
   @OriginalMember(
      owner = "client!qs",
      name = "v",
      descriptor = "I"
   )
   public static int field9247;

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Lqv;Z)V",
      line = 4
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field9246 = null;
         }

         arg0.method3422(0, this.field9243, this.field9242);
         ++field9245;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9248[4] + (arg0 != null ? field9248[1] : field9248[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Lwf;B)V",
      line = 15
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         ++field9247;
         if (arg1 > -38) {
            field9246 = null;
         }

         if (~arg0.method1143(-15465) != -256) {
            --arg0.field1856;
            this.field9242 = arg0.method1207(false);
         }

         this.field9243 = arg0.method1175(6781);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9248[2] + (arg0 != null ? field9248[1] : field9248[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(ZLjava/lang/String;)[B",
      line = 33
   )
   public static final byte[] method4564(boolean arg0, String arg1) {
      try {
         ++field9244;
         int var2 = arg1.length();
         if (~var2 == -1) {
            return new byte[0];
         } else {
            int var4;
            label52: {
               int var3 = -4 & var2 - -3;
               var4 = var3 / 4 * 3;
               if (~var2 >= ~(var3 - 2) || class668.method4875(-1, arg1.charAt(var3 + -2)) == -1) {
                  var4 -= 2;
                  if (!client.field4360) {
                     break label52;
                  }
               }

               if (~(var3 + -1) <= ~var2 || ~class668.method4875(-1, arg1.charAt(var3 - 1)) == 0) {
                  --var4;
               }
            }

            byte[] var5 = new byte[var4];
            if (arg0) {
               method4564(true, (String)null);
            }

            class158.method1325(arg1, var5, (byte)-47, 0);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9248[5] + arg0 + ',' + (arg1 != null ? field9248[1] : field9248[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Z)V",
      line = 84
   )
   public static void method4565(boolean arg0) {
      try {
         field9246 = null;
         if (arg0) {
            field9241 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9248[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4566(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4567(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
