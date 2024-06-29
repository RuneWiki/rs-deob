import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class452 extends class22 {
   @OriginalMember(
      owner = "client!ss",
      name = "s",
      descriptor = "Z"
   )
   public boolean field6619 = false;
   @OriginalMember(
      owner = "client!ss",
      name = "k",
      descriptor = "Z"
   )
   public boolean field6624 = true;
   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6626 = method3410(method3409("\"k1P_"));
   @OriginalMember(
      owner = "client!ss",
      name = "r",
      descriptor = "I"
   )
   public static int field6611 = 2;
   @OriginalMember(
      owner = "client!ss",
      name = "v",
      descriptor = "I"
   )
   public static int field6610;
   @OriginalMember(
      owner = "client!ss",
      name = "j",
      descriptor = "I"
   )
   public int field6612;
   @OriginalMember(
      owner = "client!ss",
      name = "p",
      descriptor = "I"
   )
   public int field6613;
   @OriginalMember(
      owner = "client!ss",
      name = "m",
      descriptor = "I"
   )
   public int field6614;
   @OriginalMember(
      owner = "client!ss",
      name = "y",
      descriptor = "I"
   )
   public int field6615;
   @OriginalMember(
      owner = "client!ss",
      name = "x",
      descriptor = "I"
   )
   public int field6616;
   @OriginalMember(
      owner = "client!ss",
      name = "u",
      descriptor = "I"
   )
   public int field6617;
   @OriginalMember(
      owner = "client!ss",
      name = "w",
      descriptor = "I"
   )
   public int field6618;
   @OriginalMember(
      owner = "client!ss",
      name = "q",
      descriptor = "I"
   )
   public static int field6620;
   @OriginalMember(
      owner = "client!ss",
      name = "t",
      descriptor = "I"
   )
   public int field6622;
   @OriginalMember(
      owner = "client!ss",
      name = "o",
      descriptor = "I"
   )
   public int field6623;
   @OriginalMember(
      owner = "client!ss",
      name = "l",
      descriptor = "I"
   )
   public int field6625;
   @OriginalMember(
      owner = "client!ss",
      name = "n",
      descriptor = "Lwk;"
   )
   public class152 field6621;

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3408(int arg0) {
      try {
         ++field6620;
         class510.field7454.method5552(1, 90, class510.field7454.field11187);
         class510.field7454.method5552(arg0, 20, class510.field7454.field11159);
         class510.field7454.method5552(1, -102, class510.field7454.field11186);
         class510.field7454.method5552(1, -103, class510.field7454.field11165);
         class510.field7454.method5552(1, arg0 + -118, class510.field7454.field11188);
         class510.field7454.method5552(1, arg0 ^ 41, class510.field7454.field11175);
         class510.field7454.method5552(0, -107, class510.field7454.field11162);
         class510.field7454.method5552(0, -115, class510.field7454.field11179);
         class510.field7454.method5552(0, 38, class510.field7454.field11148);
         class510.field7454.method5552(0, 94, class510.field7454.field11143);
         class510.field7454.method5552(0, 72, class510.field7454.field11166);
         class510.field7454.method5552(0, arg0 ^ -111, class510.field7454.field11139);
         class510.field7454.method5552(0, 81, class510.field7454.field11150);
         class510.field7454.method5552(0, -107, class510.field7454.field11181);
         class510.field7454.method5552(0, 39, class510.field7454.field11173);
         class510.field7454.method5552(0, arg0 ^ 47, class510.field7454.field11149);
         class510.field7454.method5552(0, arg0 + 15, class510.field7454.field11189);
         class510.field7454.method5552(0, 55, class510.field7454.field11163);
         class510.field7454.method5552(0, 56, class510.field7454.field11138);
         class468.method3504(false);
         class510.field7454.method5552(2, -120, class510.field7454.field11168);
         class510.field7454.method5552(2, arg0 ^ -119, class510.field7454.field11184);
         class416.method3174(false);
         class681.method4967(-1);
         class26.field391 = true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6626 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3409(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3410(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
