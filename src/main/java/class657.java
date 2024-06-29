import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class657 {
   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9596 = new String[]{method4832(method4831("OH!CI")), method4832(method4831("OH!OI")), method4832(method4831("OH!@I")), method4832(method4831("OH!AI")), method4832(method4831("OH!NI"))};
   @OriginalMember(
      owner = "client!am",
      name = "k",
      descriptor = "I"
   )
   public static int field9584 = 0;
   @OriginalMember(
      owner = "client!am",
      name = "j",
      descriptor = "I"
   )
   public static int field9590 = 0;
   @OriginalMember(
      owner = "client!am",
      name = "l",
      descriptor = "Leb;"
   )
   public static class650 field9586 = new class650(12, 4);
   @OriginalMember(
      owner = "client!am",
      name = "i",
      descriptor = "Lgh;"
   )
   public static class572 field9593 = new class572(112, 9);
   @OriginalMember(
      owner = "client!am",
      name = "c",
      descriptor = "I"
   )
   public static int field9583;
   @OriginalMember(
      owner = "client!am",
      name = "g",
      descriptor = "I"
   )
   public int field9585;
   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "I"
   )
   public int field9587;
   @OriginalMember(
      owner = "client!am",
      name = "e",
      descriptor = "I"
   )
   public static int field9588;
   @OriginalMember(
      owner = "client!am",
      name = "h",
      descriptor = "I"
   )
   public int field9589;
   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "I"
   )
   public static int field9591;
   @OriginalMember(
      owner = "client!am",
      name = "f",
      descriptor = "I"
   )
   public static int field9592;
   @OriginalMember(
      owner = "client!am",
      name = "d",
      descriptor = "I"
   )
   public static int field9594;
   @OriginalMember(
      owner = "client!am",
      name = "m",
      descriptor = "Lpo;"
   )
   public static class582 field9595;

   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4826(int arg0) {
      try {
         field9586 = null;
         field9593 = null;
         field9595 = null;
         if (arg0 != 64) {
            field9586 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9596[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4827(byte arg0) {
      try {
         if (arg0 != -26) {
            this.field9587 = -33;
         }

         ++field9592;
         return ~(this.field9587 & 2) != -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9596[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4828(boolean arg0) {
      try {
         if (arg0) {
            this.method4827((byte)-101);
         }

         ++field9591;
         return (4 & this.field9587) != 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9596[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4829(byte arg0) {
      try {
         ++field9583;
         if (arg0 < 101) {
            return true;
         } else {
            return (this.field9587 & 1) != 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9596[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4830(int arg0) {
      try {
         if (arg0 != 8) {
            return true;
         } else {
            ++field9588;
            return ~(this.field9587 & 8) != -1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9596[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4831(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4832(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
