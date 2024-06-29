import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class592 extends class82 {
   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8739 = new String[]{method4413(method4412("!#)'x|")), method4413(method4412("!#)'{|"))};
   @OriginalMember(
      owner = "client!uia",
      name = "j",
      descriptor = "I"
   )
   public static int field8733;
   @OriginalMember(
      owner = "client!uia",
      name = "g",
      descriptor = "I"
   )
   public int field8735;
   @OriginalMember(
      owner = "client!uia",
      name = "i",
      descriptor = "I"
   )
   public int field8736;
   @OriginalMember(
      owner = "client!uia",
      name = "k",
      descriptor = "I"
   )
   public int field8737;
   @OriginalMember(
      owner = "client!uia",
      name = "h",
      descriptor = "I"
   )
   public int field8738;
   @OriginalMember(
      owner = "client!uia",
      name = "m",
      descriptor = "Lww;"
   )
   public static class339 field8734;
   @OriginalMember(
      owner = "client!uia",
      name = "l",
      descriptor = "Lkw;"
   )
   public class9 field8732;

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4410(boolean arg0) {
      try {
         field8734 = null;
         if (arg0) {
            method4411(82);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8739[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4411(int arg0) {
      boolean var1 = client.field1481;

      try {
         label43: {
            ++field8733;
            if (class772.method5574(class157.field2022, 5) || class385.method3048(class157.field2022, (byte)117)) {
               class595.method4430(true, class168.field2195 >> 12, class160.field2051 >> 12, 5000);
               if (!var1) {
                  break label43;
               }
            }

            int var2 = class204.field2593.field210[0] >> 3;
            int var3 = class204.field2593.field205[0] >> 3;
            if (var2 >= 0 && class273.field3491 >> 3 > var2 && ~var3 <= -1 && ~var3 > ~(class211.field2689 >> 3)) {
               class595.method4430(true, var3, var2, 5000);
               if (!var1) {
                  break label43;
               }
            }

            class595.method4430(true, class211.field2689 >> 4, class273.field3491 >> 4, 0);
         }

         class409.method3212(-29164);
         class526.method3932((byte)-74);
         class523.method3919(-31851);
         class84.method804((byte)-88);
         int var4 = 87 % ((38 - arg0) / 40);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8739[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4412(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4413(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
