import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class639 extends class791 {
   @OriginalMember(
      owner = "client!ie",
      name = "q",
      descriptor = "I"
   )
   public int field9019 = -1;
   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9025 = new String[]{method4661(method4660("ym9\u0001v")), method4661(method4660("ym9\u0002v")), method4661(method4660("ym9\u0000v")), method4661(method4660("ym9\u0007v"))};
   @OriginalMember(
      owner = "client!ie",
      name = "o",
      descriptor = "Lhha;"
   )
   public static class724 field9016 = new class724(31, 6);
   @OriginalMember(
      owner = "client!ie",
      name = "u",
      descriptor = "Lbga;"
   )
   public static class398 field9022 = new class398(16);
   @OriginalMember(
      owner = "client!ie",
      name = "p",
      descriptor = "I"
   )
   public static int field9017;
   @OriginalMember(
      owner = "client!ie",
      name = "m",
      descriptor = "I"
   )
   public static int field9020;
   @OriginalMember(
      owner = "client!ie",
      name = "s",
      descriptor = "I"
   )
   public static int field9021;
   @OriginalMember(
      owner = "client!ie",
      name = "n",
      descriptor = "I"
   )
   public int field9023;
   @OriginalMember(
      owner = "client!ie",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public String field9018;
   @OriginalMember(
      owner = "client!ie",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public String field9024;

   @OriginalMember(
      owner = "client!ie",
      name = "e",
      descriptor = "(I)Luea;"
   )
   public final class183 method4656(int arg0) {
      try {
         if (arg0 != 16) {
            return null;
         } else {
            ++field9021;
            return class592.field8363[super.field11519];
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9025[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method4657(int arg0) {
      try {
         class380.method2967(0);
         if (arg0 > 89) {
            ++field9017;
            class563.field8012 = false;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9025[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4658(boolean arg0) {
      try {
         class763.field10886 = null;
         ++field9020;
         class242.field3714 = null;
         class259.field3971 = null;
         class437.field6409 = null;
         class643.field9041 = null;
         class175.field2604 = null;
         class563.field8020 = null;
         class261.field4011 = null;
         class33.field473 = null;
         if (arg0) {
            class510.field7243 = null;
            class249.field3812 = null;
            class622.field8894 = null;
            class347.field5110 = null;
            class232.field3601 = null;
            class666.field9376 = null;
            class157.field2388 = null;
            class666.field9377 = null;
            class31.field440 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9025[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4659(int arg0) {
      try {
         field9016 = null;
         field9022 = null;
         if (arg0 != 6) {
            method4657(3);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9025[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4660(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4661(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
