import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class300 extends RuntimeException {
   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "Ljava/lang/Throwable;"
   )
   public Throwable field4489;
   @OriginalMember(
      owner = "client!cp",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field4486;
   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4491 = new String[]{method2493(method2492("gs\u00007[")), method2493(method2492("\u007f-\u0000Z\u000e")), method2493(method2492("r(Bu")), method2493(method2492("\u007f-\u0000[\u000e"))};
   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "I"
   )
   public static int field4485;
   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "I"
   )
   public static int field4487;
   @OriginalMember(
      owner = "client!cp",
      name = "e",
      descriptor = "I"
   )
   public static int field4490;
   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "Lph;"
   )
   public static class214 field4488;

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(ZI[Ljava/awt/Rectangle;)V"
   )
   public static final void method2489(boolean arg0, int arg1, Rectangle[] arg2) throws class37 {
      try {
         ++field4487;
         if (!arg0) {
            if (class217.field3113 != 1) {
               class712.field10231.method206(arg2, arg1, 0, 0);
            } else {
               class712.field10231.method206(arg2, arg1, class235.field3639, class519.field7320);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4491[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4491[0] : field4491[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2490(int arg0) {
      if (arg0 < 67) {
         method2490(-107);
      }

      field4488 = null;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2491(int arg0) {
      try {
         ++field4490;
         int var1 = 0;
         if (arg0 == -601) {
            if (class476.field6870 != null) {
               var1 = class476.field6870.field9108.method3550(-59);
            }

            if (var1 == 2) {
               int var2 = ~class91.field1368 < -801 ? 800 : class91.field1368;
               int var3 = ~class223.field3171 >= -601 ? class223.field3171 : 600;
               class245.field3760 = (-var2 + class91.field1368) / 2;
               class557.field7909 = var2;
               class140.field2243 = var3;
               class541.field7634 = 0;
            } else if (~var1 != -2) {
               class245.field3760 = 0;
               class541.field7634 = 0;
               class557.field7909 = class91.field1368;
               class140.field2243 = class223.field3171;
            } else {
               int var4 = ~class91.field1368 >= -1025 ? class91.field1368 : 1024;
               class557.field7909 = var4;
               int var5 = ~class223.field3171 >= -769 ? class223.field3171 : 768;
               class245.field3760 = (-var4 + class91.field1368) / 2;
               class541.field7634 = 0;
               class140.field2243 = var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4491[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V"
   )
   public class300(Throwable arg0, String arg1) {
      this.field4489 = arg0;
      this.field4486 = arg1;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
