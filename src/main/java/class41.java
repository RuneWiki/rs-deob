import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class41 implements class678 {
   @OriginalMember(
      owner = "client!vd",
      name = "h",
      descriptor = "I"
   )
   public int field478;
   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field481 = new String[]{method312(method311("]\n2&\u0019")), method312(method311("]\n2[XE\u0007hY\u0019")), method312(method311("]\n2%\u0019")), method312(method311("]\n2$\u0019"))};
   @OriginalMember(
      owner = "client!vd",
      name = "g",
      descriptor = "Lnw;"
   )
   public static class616 field476 = new class616(7, -1);
   @OriginalMember(
      owner = "client!vd",
      name = "f",
      descriptor = "I"
   )
   public static int field474;
   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "I"
   )
   public static int field475;
   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "I"
   )
   public static int field477;
   @OriginalMember(
      owner = "client!vd",
      name = "d",
      descriptor = "I"
   )
   public static int field479;
   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "Lq;"
   )
   public static class454 field473;
   @OriginalMember(
      owner = "client!vd",
      name = "e",
      descriptor = "Lqh;"
   )
   public static class74 field480;

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method309(byte arg0) {
      boolean var1 = client.field4273;

      try {
         if (class82.field1037 != null) {
            class538[] var2 = class82.field1037;
            int var3 = 0;
            if (var1 || var3 < var2.length) {
               do {
                  class538 var4 = var2[var3];
                  var4.method3890(11541);
                  ++var3;
               } while(var3 < var2.length);
            }
         }

         if (arg0 != -26) {
            field480 = null;
         }

         ++field475;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field481[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         int var2 = 91 % ((arg0 - 1) / 55);
         ++field474;
         return class283.field3774;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field481[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method310(byte arg0) {
      try {
         field480 = null;
         if (arg0 != -23) {
            method310((byte)-97);
         }

         field473 = null;
         field476 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field481[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class41(int arg0) {
      try {
         this.field478 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field481[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method311(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method312(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
