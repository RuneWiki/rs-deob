import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class580 extends class555 {
   @OriginalMember(
      owner = "client!eea",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8573 = new String[]{method4343(method4342("\";6\u0000So")), method4343(method4342("\";6\u0000Qo")), method4343(method4342("\";6\u0000Po"))};
   @OriginalMember(
      owner = "client!eea",
      name = "F",
      descriptor = "I"
   )
   public static int field8569 = 1400;
   @OriginalMember(
      owner = "client!eea",
      name = "E",
      descriptor = "B"
   )
   public byte field8571;
   @OriginalMember(
      owner = "client!eea",
      name = "H",
      descriptor = "I"
   )
   public static int field8567;
   @OriginalMember(
      owner = "client!eea",
      name = "I",
      descriptor = "I"
   )
   public static int field8568;
   @OriginalMember(
      owner = "client!eea",
      name = "D",
      descriptor = "I"
   )
   public int field8570;
   @OriginalMember(
      owner = "client!eea",
      name = "G",
      descriptor = "Ltia;"
   )
   public static class208 field8572;
   @OriginalMember(
      owner = "client!eea",
      name = "J",
      descriptor = "Lica;"
   )
   public class354 field8566;

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(B)V",
      line = 8
   )
   public static void method4341(byte arg0) {
      try {
         field8572 = null;
         if (arg0 < 90) {
            method4341((byte)3);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8573[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "b",
      descriptor = "(Z)I",
      line = 19
   )
   public final int method2754(boolean arg0) {
      try {
         ++field8568;
         if (this.field8566 == null) {
            return 0;
         } else {
            if (!arg0) {
               field8572 = null;
            }

            return this.field8566.field5436 * 100 / (this.field8566.field5428.length - this.field8571);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8573[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(Z)[B",
      line = 42
   )
   public final byte[] method2755(boolean arg0) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field8567;
            if (!super.field8287 && this.field8566.field5436 >= this.field8566.field5428.length + -this.field8571) {
               return this.field8566.field5428;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8573[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4342(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4343(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
