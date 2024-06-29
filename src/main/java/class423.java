import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class423 extends class70 {
   @OriginalMember(
      owner = "client!ns",
      name = "C",
      descriptor = "Lmp;"
   )
   public class793 field6419;
   @OriginalMember(
      owner = "client!ns",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6425 = new String[]{method3218(method3217("\u0007&jNS")), method3218(method3217("\u0007&jLS")), method3218(method3217("\u0012{j)\u0006")), method3218(method3217("\u0007&j;\u0012\u0007<09S")), method3218(method3217("\u0007 (k")), method3218(method3217("\u0007&jMS"))};
   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "I"
   )
   public static int field6418 = 0;
   @OriginalMember(
      owner = "client!ns",
      name = "y",
      descriptor = "I"
   )
   public static int field6420;
   @OriginalMember(
      owner = "client!ns",
      name = "A",
      descriptor = "I"
   )
   public static int field6421;
   @OriginalMember(
      owner = "client!ns",
      name = "B",
      descriptor = "I"
   )
   public static int field6422;
   @OriginalMember(
      owner = "client!ns",
      name = "D",
      descriptor = "I"
   )
   public static int field6423;
   @OriginalMember(
      owner = "client!ns",
      name = "x",
      descriptor = "I"
   )
   public static int field6424;

   @OriginalMember(
      owner = "client!ns",
      name = "c",
      descriptor = "(III)Z",
      line = 7
   )
   public static final boolean method3214(int arg0, int arg1, int arg2) {
      try {
         ++field6421;
         if (arg0 != 32768) {
            field6418 = 54;
         }

         return ~(32768 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6425[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(Z)V",
      line = 18
   )
   public static final void method3215(boolean arg0) {
      try {
         class459.field6944.method654((0.7F + (float)class261.field3566.field9457.method1008(104) * 0.1F) * 1.1523438F);
         ++field6423;
         class459.field6944.method660(class695.field10438, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
         class459.field6944.method540(class429.field6549, -1, 0);
         if (arg0) {
            field6418 = 114;
         }

         class459.field6944.method583(class787.field11445);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6425[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "a",
      descriptor = "(Lbe;B)V",
      line = 34
   )
   public static final void method3216(class41 arg0, byte arg1) {
      try {
         ++field6422;
         if (arg1 >= 62) {
            arg0.field437 = null;
            if (class511.field7501 < 20) {
               class619.field9027.method100(arg0, 1);
               ++class511.field7501;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6425[5] + (arg0 != null ? field6425[2] : field6425[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 52
   )
   public class423(class793 arg0) {
      try {
         this.field6419 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6425[3] + (arg0 != null ? field6425[2] : field6425[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3217(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ns",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3218(char[] arg0) {
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
            var10005 = 85;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
