import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class428 {
   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "I"
   )
   private int field5972 = 0;
   @OriginalMember(
      owner = "client!oh",
      name = "d",
      descriptor = "Ldia;"
   )
   private class245 field5968;
   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5974 = new String[]{method3216(method3215("\u0006qd/.")), method3216(method3215("\u0006qd,.")), method3216(method3215("\u0006qd-.")), method3216(method3215("\u00127d@{")), method3216(method3215("\u0007l&\u0002")), method3216(method3215("\u0006qdRo\u0007p>P."))};
   @OriginalMember(
      owner = "client!oh",
      name = "c",
      descriptor = "I"
   )
   public static int field5969;
   @OriginalMember(
      owner = "client!oh",
      name = "e",
      descriptor = "I"
   )
   public static int field5970;
   @OriginalMember(
      owner = "client!oh",
      name = "f",
      descriptor = "I"
   )
   public static int field5971;
   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "Lmaa;"
   )
   private class500 field5973;

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method3212(byte arg0) {
      try {
         if (arg0 != 117) {
            this.method3213(49);
         }

         ++field5970;
         this.field5972 = 0;
         return this.method3213(19037);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5974[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(I)Lmaa;"
   )
   public final class500 method3213(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field5971;
         if (~this.field5972 < -1 && this.field5968.field3074[this.field5972 - 1] != this.field5973) {
            class500 var3 = this.field5973;
            this.field5973 = var3.field6867;
            return var3;
         } else if (arg0 != 19037) {
            return null;
         } else {
            while(~this.field5972 > ~this.field5968.field3066) {
               class500 var4 = this.field5968.field3074[this.field5972++].field6867;
               class500 var10000 = var4;

               while(var10000 != this.field5968.field3074[this.field5972 - 1]) {
                  this.field5973 = var4.field6867;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5974[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3214(int arg0) {
      try {
         class674.field9907.method4407(class674.field9907.field8444, -2160, 1);
         ++field5969;
         class674.field9907.method4407(class674.field9907.field8458, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8427, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8421, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8424, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8461, -2160, 1);
         class674.field9907.method4407(class674.field9907.field8423, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8445, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8443, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8448, -2160, arg0);
         class674.field9907.method4407(class674.field9907.field8447, arg0 + -2160, 0);
         class674.field9907.method4407(class674.field9907.field8457, arg0 ^ -2160, 0);
         class674.field9907.method4407(class674.field9907.field8450, arg0 + -2160, 0);
         class674.field9907.method4407(class674.field9907.field8436, arg0 + -2160, 0);
         class674.field9907.method4407(class674.field9907.field8468, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8429, -2160, 0);
         class674.field9907.method4407(class674.field9907.field8430, arg0 + -2160, 0);
         class674.field9907.method4407(class674.field9907.field8435, arg0 + -2160, 0);
         class674.field9907.method4407(class674.field9907.field8469, -2160, 0);
         class721.method5244(arg0 + 11336);
         class674.field9907.method4407(class674.field9907.field8437, arg0 + -2160, 2);
         class674.field9907.method4407(class674.field9907.field8440, arg0 + -2160, 2);
         class493.method3579((byte)46);
         class300.method2261(15966);
         class343.field4915 = true;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5974[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "<init>",
      descriptor = "()V"
   )
   public class428() {
   }

   @OriginalMember(
      owner = "client!oh",
      name = "<init>",
      descriptor = "(Ldia;)V"
   )
   public class428(class245 arg0) {
      try {
         this.field5968 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5974[5] + (arg0 != null ? field5974[3] : field5974[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3215(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3216(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
