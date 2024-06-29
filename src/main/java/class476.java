import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class476 implements class227 {
   @OriginalMember(
      owner = "client!qd",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   private String field6585;
   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6590 = new String[]{method3478(method3477("D\u0007;%[")), method3478(method3477("D\u0007;'[")), method3478(method3477("D\u0007;&[")), method3478(method3477("NM;J\u000e")), method3478(method3477("D\u0007;X\u001a[\naZ[")), method3478(method3477("[\u0016y\b")), method3478(method3477("D\u0007; ["))};
   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "I"
   )
   public static int field6582;
   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "I"
   )
   public static int field6587;
   @OriginalMember(
      owner = "client!qd",
      name = "f",
      descriptor = "I"
   )
   public static int field6588;
   @OriginalMember(
      owner = "client!qd",
      name = "d",
      descriptor = "I"
   )
   public static int field6589;
   @OriginalMember(
      owner = "client!qd",
      name = "e",
      descriptor = "Lqh;"
   )
   public static class74 field6586;
   @OriginalMember(
      owner = "client!qd",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field6583;
   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "Z"
   )
   private boolean field6584;

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1010(boolean arg0) {
      try {
         ++field6587;
         int var2 = class648.method4669(this.field6585, arg0);
         if (~var2 <= -1 && ~var2 >= -101) {
            return var2;
         } else {
            this.field6584 = arg0;
            return 100;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6590[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(B)Lbf;"
   )
   public final class566 method1008(byte arg0) {
      try {
         ++field6589;
         int var2 = -16 / ((arg0 - -46) / 53);
         return class566.field7721;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6590[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class476(String arg0) {
      try {
         this.field6585 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6590[4] + (arg0 != null ? field6590[3] : field6590[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method3475(int arg0) {
      try {
         if (arg0 != -1) {
            this.field6584 = false;
         }

         ++field6582;
         return this.field6584;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6590[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3476(int arg0) {
      try {
         field6586 = null;
         if (arg0 != -1) {
            method3476(-106);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6590[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
