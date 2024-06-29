import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class57 {
   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1129 = new String[]{method652(method651(".\u001aJ0X")), method652(method651(".\u001aJ5X")), method652(method651("1YJ_\r")), method652(method651("$\u0002\b\u001d")), method652(method651(".\u001aJ2X")), method652(method651(".\u001aJ3X"))};
   @OriginalMember(
      owner = "client!dm",
      name = "d",
      descriptor = "I"
   )
   public static int field1125 = 0;
   @OriginalMember(
      owner = "client!dm",
      name = "g",
      descriptor = "I"
   )
   public static int field1122;
   @OriginalMember(
      owner = "client!dm",
      name = "f",
      descriptor = "I"
   )
   public static int field1123;
   @OriginalMember(
      owner = "client!dm",
      name = "c",
      descriptor = "I"
   )
   public static int field1124;
   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "I"
   )
   public static int field1127;
   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "I"
   )
   public static int field1128;
   @OriginalMember(
      owner = "client!dm",
      name = "e",
      descriptor = "Lkaa;"
   )
   public static class51 field1126;

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method647(int arg0, int arg1, int arg2) {
      try {
         ++field1128;
         if (arg1 <= 88) {
            method650(94);
         }

         return (arg2 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1129[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ZILlja;)Z"
   )
   public static final boolean method648(boolean arg0, int arg1, class743 arg2) {
      try {
         ++field1123;
         class333.field4770.method1001(arg2.field10702[arg1], arg2.field10705[arg1], arg2.field10704[arg1], class320.field4609);
         int var3 = class320.field4609[2];
         if (~var3 > -51) {
            return false;
         } else {
            arg2.field10709[arg1] = (short)(class320.field4609[0] * class405.field5980 / var3 + class697.field10211);
            if (arg0) {
               field1127 = 33;
            }

            arg2.field10707[arg1] = (short)(class320.field4609[1] * class276.field3902 / var3 + class484.field7036);
            arg2.field10697[arg1] = (short)var3;
            return true;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1129[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1129[2] : field1129[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method649(int arg0) {
      try {
         int var1 = -28 % ((arg0 - 16) / 60);
         field1126 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1129[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(I)J"
   )
   public static final synchronized long method650(int arg0) {
      try {
         ++field1122;
         long var1 = System.currentTimeMillis();
         if (class327.field4686 > var1) {
            class747.field10775 += -var1 + class327.field4686;
         }

         class327.field4686 = var1;
         return arg0 < 90 ? -25L : var1 - -class747.field10775;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1129[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method651(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method652(char[] arg0) {
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
            var10005 = 119;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
