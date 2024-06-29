import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class120 {
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1462 = new String[]{method1006(method1005(">8lU\u001a")), method1006(method1005("yg|7")), method1006(method1005(">8lV\u001a"))};
   @OriginalMember(
      owner = "client!jr",
      name = "d",
      descriptor = "I"
   )
   public static int field1458 = 0;
   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "I"
   )
   public static int field1461 = 0;
   @OriginalMember(
      owner = "client!jr",
      name = "e",
      descriptor = "I"
   )
   public static int field1457;
   @OriginalMember(
      owner = "client!jr",
      name = "c",
      descriptor = "I"
   )
   public static int field1459;
   @OriginalMember(
      owner = "client!jr",
      name = "b",
      descriptor = "J"
   )
   public static long field1460;

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(Ldfa;B)Ldfa;"
   )
   public abstract class175 method1002(class175 arg0, byte arg1);

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method1003(boolean arg0, int arg1) {
      try {
         ++field1459;
         if (class763.field11211.length() != 0) {
            class335.method2539((byte)-110, field1462[1] + class763.field11211);
            class271.method2095(false, -71, class763.field11211, arg0);
            class763.field11211 = "";
            if (arg1 != -21093) {
               field1458 = -39;
            }

            class188.field2348 = 0;
            class374.field5672 = 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1462[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(I)Lad;"
   )
   public static final class446 method1004(int arg0) {
      int var1 = client.field4530;

      try {
         ++field1457;
         if (class329.field4676 != null && class126.field1522 != null) {
            class446 var2 = (class446)class126.field1522.method1198((byte)87);
            if (arg0 != 7190) {
               method1004(93);
               if (var1 == 0 && var2 == null) {
                  return null;
               }
            } else if (var2 == null) {
               return null;
            }

            do {
               class426 var3 = class329.field4666.method3293(27767, var2.field6786);
               if (var3 != null && var3.field6508 && var3.method3244(arg0 + 6733, class329.field4668)) {
                  return var2;
               }

               var2 = (class446)class126.field1522.method1198((byte)124);
            } while(var2 != null);

            return null;
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1462[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1005(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1006(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
