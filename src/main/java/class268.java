import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class268 {
   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3751 = new String[]{method2076(method2075("[?&9\u0017")), method2076(method2075("[?&\fPx/z\u0011QLs")), method2076(method2075("[?&:\u0017"))};
   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "I"
   )
   public static int field3748;
   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "I"
   )
   public static int field3749;
   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "I"
   )
   public static int field3750;

   @OriginalMember(
      owner = "client!pd",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 3
   )
   public final String toString() {
      try {
         ++field3749;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3751[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(I)Ljava/lang/String;",
      line = 19
   )
   public static final String method2073(int arg0) {
      try {
         if (arg0 != -29867) {
            return null;
         } else {
            ++field3750;
            if (!class750.field11111 && class585.field8681 != null) {
               return (class585.field8681.field4318 == null || class585.field8681.field4318.length() == 0) && class585.field8681.field4320 != null && ~class585.field8681.field4320.length() < -1 ? class585.field8681.field4320 : class585.field8681.field4318;
            } else {
               return "";
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3751[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(I)Z",
      line = 42
   )
   public final boolean method2074(int arg0) {
      try {
         if (arg0 != 31348) {
            return false;
         } else {
            ++field3748;
            return class446.field6787 == this | class97.field1195 == this;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3751[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2075(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2076(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
