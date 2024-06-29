import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class374 {
   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5414 = new String[]{method2844(method2843("+Cd)y")), method2844(method2843(">\u0018&k")), method2844(method2843("\"\u000fdE,")), method2844(method2843("\"\u000fdF,"))};
   @OriginalMember(
      owner = "client!rb",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field5410 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "[Loe;"
   )
   public static class214[] field5412 = new class214[37];
   @OriginalMember(
      owner = "client!rb",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field5413 = new int[2];
   @OriginalMember(
      owner = "client!rb",
      name = "f",
      descriptor = "I"
   )
   public static int field5411 = -1;
   @OriginalMember(
      owner = "client!rb",
      name = "e",
      descriptor = "Lqd;"
   )
   public static class475 field5408 = new class475("", 18);
   @OriginalMember(
      owner = "client!rb",
      name = "b",
      descriptor = "I"
   )
   public static int field5409;

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z",
      line = 4
   )
   public static final boolean method2841(byte arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field5409;
         if (arg1 == null) {
            return false;
         } else {
            if (arg0 >= -94) {
               method2842(-66);
            }

            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class552.field7909[var3])) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class558.field8005[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               boolean var10000;
               if (class640.field9356 <= var3) {
                  var10000 = false;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = arg1.equalsIgnoreCase(class552.field7909[var3]);
               }

               if (var10000) {
                  return true;
               }

               if (arg1.equalsIgnoreCase(class558.field8005[var3])) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5414[2] + arg0 + ',' + (arg1 != null ? field5414[0] : field5414[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(I)V",
      line = 50
   )
   public static void method2842(int arg0) {
      try {
         if (arg0 != 2) {
            field5410 = null;
         }

         field5413 = null;
         field5412 = null;
         field5410 = null;
         field5408 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5414[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2843(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2844(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
