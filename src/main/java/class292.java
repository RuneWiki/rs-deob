import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class292 {
   @OriginalMember(
      owner = "client!gf",
      name = "c",
      descriptor = "I"
   )
   public int field3850;
   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3854 = new String[]{method2197(method2196("7\u0013U\u0002(\u0003\u0001\t\u001f)7]")), method2197(method2196("7\u0013UJ.>\u001c\u000fHo")), method2197(method2196("7\u0013U4o")), method2197(method2196("7\u0013U7o"))};
   @OriginalMember(
      owner = "client!gf",
      name = "e",
      descriptor = "I"
   )
   public static int field3849;
   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "I"
   )
   public static int field3852;
   @OriginalMember(
      owner = "client!gf",
      name = "f",
      descriptor = "I"
   )
   public static int field3853;
   @OriginalMember(
      owner = "client!gf",
      name = "d",
      descriptor = "Lha;"
   )
   public static class65 field3851;
   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field3848;

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2194(int arg0) {
      try {
         if (arg0 != -32140) {
            method2195(true, 110);
         }

         field3851 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3854[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3852;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3854[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public static final boolean method2195(boolean arg0, int arg1) {
      try {
         ++field3849;
         boolean var2 = class338.field4832.method583();
         if (arg1 >= -61) {
            return true;
         } else if (arg0 == var2) {
            return true;
         } else {
            label33: {
               if (!arg0) {
                  class338.field4832.method579();
                  if (!client.field4273) {
                     break label33;
                  }
               }

               if (!class338.field4832.method551()) {
                  arg0 = false;
               }
            }

            if (arg0 != var2) {
               class674.field9907.method4407(class674.field9907.field8469, -2160, !arg0 ? 0 : 1);
               class647.method4661((byte)104);
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3854[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class292(int arg0, int arg1) {
      try {
         this.field3850 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3854[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2197(char[] arg0) {
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
            var10005 = 117;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
