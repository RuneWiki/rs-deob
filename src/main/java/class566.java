import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class566 extends class207 {
   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8438 = new String[]{method4183(method4182("CF\u001f\b$")), method4183(method4182("Y\u000b\u001feq")), method4183(method4182("LP]'")), method4183(method4182("CF\u001f\t$")), method4183(method4182("CF\u001f\n$"))};
   @OriginalMember(
      owner = "client!ac",
      name = "s",
      descriptor = "I"
   )
   public static int field8431;
   @OriginalMember(
      owner = "client!ac",
      name = "p",
      descriptor = "I"
   )
   public static int field8432;
   @OriginalMember(
      owner = "client!ac",
      name = "o",
      descriptor = "I"
   )
   public static int field8433;
   @OriginalMember(
      owner = "client!ac",
      name = "t",
      descriptor = "I"
   )
   public static int field8434;
   @OriginalMember(
      owner = "client!ac",
      name = "q",
      descriptor = "I"
   )
   private int field8435;
   @OriginalMember(
      owner = "client!ac",
      name = "n",
      descriptor = "I"
   )
   private int field8436;
   @OriginalMember(
      owner = "client!ac",
      name = "r",
      descriptor = "I"
   )
   public static int field8437;

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.method1823((byte)-107, this.field8436, this.field8435);
         ++field8437;
         if (!arg1) {
            method4181((class128)null, (byte)90);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8438[3] + (arg0 != null ? field8438[1] : field8438[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         this.field8435 = arg0.method1041(4758);
         ++field8434;
         this.field8436 = arg0.method1041(4758);
         if (!arg1) {
            this.field8435 = 99;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8438[4] + (arg0 != null ? field8438[1] : field8438[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Ljj;B)Lcaa;"
   )
   public static final class317 method4181(class128 arg0, byte arg1) {
      try {
         if (arg1 != 32) {
            return null;
         } else {
            ++field8431;
            int var2 = arg0.method1041(4758);
            return new class317(var2);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8438[0] + (arg0 != null ? field8438[1] : field8438[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4182(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4183(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 37;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
