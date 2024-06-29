import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class320 extends class465 {
   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4574 = new String[]{method2429(method2428("z5mg`")), method2429(method2428("z5m``")), method2429(method2428("z5mb`")), method2429(method2428("z5mc`")), method2429(method2428("z5me`")), method2429(method2428("z5md`"))};
   @OriginalMember(
      owner = "client!ca",
      name = "i",
      descriptor = "I"
   )
   public static int field4568;
   @OriginalMember(
      owner = "client!ca",
      name = "f",
      descriptor = "I"
   )
   public static int field4569;
   @OriginalMember(
      owner = "client!ca",
      name = "k",
      descriptor = "I"
   )
   public static int field4570;
   @OriginalMember(
      owner = "client!ca",
      name = "j",
      descriptor = "I"
   )
   public static int field4572;
   @OriginalMember(
      owner = "client!ca",
      name = "g",
      descriptor = "I"
   )
   public static int field4573;
   @OriginalMember(
      owner = "client!ca",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field4571;

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public final void method69(boolean arg0) {
      try {
         if (!arg0) {
            ++field4572;
            if (~super.field6984 > -1 || ~super.field6984 < -5) {
               super.field6984 = this.method78(16726277);
            }

         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4574[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(IB)I",
      line = 17
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 93 % ((arg1 - -51) / 60);
         ++field4569;
         return 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4574[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 27
   )
   public class320(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(I)I",
      line = 30
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            return -119;
         } else {
            ++field4573;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4574[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(II)V",
      line = 44
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            this.method2426(-27);
         }

         super.field6984 = arg1;
         ++field4570;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4574[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "(I)I",
      line = 58
   )
   public final int method2426(int arg0) {
      try {
         if (arg0 <= 81) {
            this.method2426(-4);
         }

         ++field4568;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4574[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 70
   )
   public class320(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(I)V",
      line = 73
   )
   public static void method2427(int arg0) {
      try {
         field4571 = null;
         int var1 = -98 / ((arg0 - 24) / 61);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4574[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2428(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2429(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
