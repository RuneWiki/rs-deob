import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class300 implements class272 {
   @OriginalMember(
      owner = "client!ot",
      name = "h",
      descriptor = "Lvd;"
   )
   private class512 field4705;
   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4711 = new String[]{method2516(method2515("%oxI\u001b")), method2516(method2515("$n:d")), method2516(method2515("15x&N")), method2516(method2515("%ox4Z$r\"6\u001b")), method2516(method2515("%oxL\u001b")), method2516(method2515("%oxK\u001b")), method2516(method2515("%oxM\u001b")), method2516(method2515("%oxJ\u001b"))};
   @OriginalMember(
      owner = "client!ot",
      name = "f",
      descriptor = "Lnaa;"
   )
   public static class113 field4709 = new class113(57, 8);
   @OriginalMember(
      owner = "client!ot",
      name = "d",
      descriptor = "I"
   )
   public static int field4703;
   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "I"
   )
   public static int field4704;
   @OriginalMember(
      owner = "client!ot",
      name = "b",
      descriptor = "I"
   )
   public static int field4706;
   @OriginalMember(
      owner = "client!ot",
      name = "c",
      descriptor = "I"
   )
   public static int field4708;
   @OriginalMember(
      owner = "client!ot",
      name = "g",
      descriptor = "I"
   )
   public static int field4710;
   @OriginalMember(
      owner = "client!ot",
      name = "e",
      descriptor = "Lnj;"
   )
   public static class31 field4707;

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(B)Z",
      line = 4
   )
   public final boolean method285(byte arg0) {
      try {
         ++field4704;
         return arg0 == 8;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4711[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(Lha;BIZ)Lda;",
      line = 15
   )
   public static final class288 method2513(class610 arg0, byte arg1, int arg2, boolean arg3) {
      try {
         if (arg1 < 80) {
            return null;
         } else {
            ++field4703;
            class564 var4 = class671.method4942((byte)122, arg0, arg2, arg3);
            return var4 == null ? null : var4.field8378;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4711[7] + (arg0 != null ? field4711[2] : field4711[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(ZZ)V",
      line = 34
   )
   public final void method284(boolean arg0, boolean arg1) {
      try {
         if (arg1) {
            class351.field5356.method631(0, 0, class316.field4878, class692.field10301, this.field4705.field7821, 0);
         }

         if (arg0) {
            field4707 = null;
         }

         ++field4708;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4711[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "c",
      descriptor = "(B)V",
      line = 51
   )
   public static void method2514(byte arg0) {
      try {
         field4709 = null;
         field4707 = null;
         int var1 = 89 / ((arg0 - -37) / 46);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4711[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "b",
      descriptor = "(B)V",
      line = 65
   )
   public final void method282(byte arg0) {
      try {
         if (arg0 > 98) {
            ++field4706;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4711[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "<init>",
      descriptor = "(Lvd;)V",
      line = 75
   )
   public class300(class512 arg0) {
      try {
         this.field4705 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4711[3] + (arg0 != null ? field4711[2] : field4711[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2515(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2516(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
