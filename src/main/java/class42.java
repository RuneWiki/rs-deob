import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class42 {
   @OriginalMember(
      owner = "client!gk",
      name = "f",
      descriptor = "I"
   )
   private int field557;
   @OriginalMember(
      owner = "client!gk",
      name = "c",
      descriptor = "I"
   )
   public int field554;
   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "Lpc;"
   )
   private class650 field551;
   @OriginalMember(
      owner = "client!gk",
      name = "l",
      descriptor = "I"
   )
   public int field556;
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field569 = new String[]{method307(method306("'L\u0014\u001e\\\u0013SH\u0003]'\u000f")), method307(method306("'L\u0014+\u001b")), method307(method306("'L\u0014(\u001b")), method307(method306("'L\u0014VZ.NNT\u001b")), method307(method306(".RV\u0006")), method307(method306(";\t\u0014DN"))};
   @OriginalMember(
      owner = "client!gk",
      name = "k",
      descriptor = "Lgk;"
   )
   public static class42 field552 = new class42(0, 3, class650.field9375);
   @OriginalMember(
      owner = "client!gk",
      name = "i",
      descriptor = "Lgk;"
   )
   public static class42 field555 = new class42(1, 3, class650.field9375);
   @OriginalMember(
      owner = "client!gk",
      name = "q",
      descriptor = "Lgk;"
   )
   public static class42 field558 = new class42(2, 4, class650.field9371);
   @OriginalMember(
      owner = "client!gk",
      name = "h",
      descriptor = "Lgk;"
   )
   public static class42 field559 = new class42(3, 1, class650.field9375);
   @OriginalMember(
      owner = "client!gk",
      name = "j",
      descriptor = "Lgk;"
   )
   public static class42 field560 = new class42(4, 2, class650.field9375);
   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "Lgk;"
   )
   public static class42 field561 = new class42(5, 3, class650.field9375);
   @OriginalMember(
      owner = "client!gk",
      name = "r",
      descriptor = "Lgk;"
   )
   public static class42 field562 = new class42(6, 4, class650.field9375);
   @OriginalMember(
      owner = "client!gk",
      name = "o",
      descriptor = "I"
   )
   public static int field563 = class277.method2331(16, (byte)124);
   @OriginalMember(
      owner = "client!gk",
      name = "n",
      descriptor = "I"
   )
   public static int field565 = 0;
   @OriginalMember(
      owner = "client!gk",
      name = "e",
      descriptor = "Luk;"
   )
   public static class498 field566 = new class498(95, 10);
   @OriginalMember(
      owner = "client!gk",
      name = "p",
      descriptor = "I"
   )
   public static int field568 = 2;
   @OriginalMember(
      owner = "client!gk",
      name = "d",
      descriptor = "I"
   )
   public static int field550;
   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "I"
   )
   public static int field553;
   @OriginalMember(
      owner = "client!gk",
      name = "m",
      descriptor = "I"
   )
   public static int field564;
   @OriginalMember(
      owner = "client!gk",
      name = "s",
      descriptor = "I"
   )
   public static int field567;

   @OriginalMember(
      owner = "client!gk",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field550;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field569[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method304(byte arg0) {
      try {
         field558 = null;
         field566 = null;
         field552 = null;
         if (arg0 != -79) {
            field559 = null;
         }

         field555 = null;
         field561 = null;
         field559 = null;
         field562 = null;
         field560 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field569[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(II)Lgk;"
   )
   public static final class42 method305(int arg0, int arg1) {
      try {
         if (arg1 <= 9) {
            field567 = -84;
         }

         ++field553;
         if (~arg0 != -1) {
            if (arg0 == 1) {
               return field555;
            }

            if (arg0 == 2) {
               return field558;
            }

            if (arg0 == 3) {
               return field559;
            }

            if (arg0 == 4) {
               return field560;
            }

            if (~arg0 == -6) {
               return field561;
            }

            if (~arg0 != -7) {
               return null;
            }

            if (!client.field1786) {
               return field562;
            }
         }

         return field552;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field569[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "<init>",
      descriptor = "(IILpc;)V"
   )
   private class42(int arg0, int arg1, class650 arg2) {
      try {
         this.field557 = arg1;
         this.field554 = arg0;
         this.field551 = arg2;
         this.field556 = this.field551.field9366 * this.field557;
         if (this.field554 >= 16) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field569[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field569[5] : field569[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
