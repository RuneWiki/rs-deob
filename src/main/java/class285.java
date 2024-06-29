import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class285 extends class465 {
   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4009 = new String[]{method2177(method2176("\u000f)\rcMS")), method2177(method2176("\u000f)\rcNS")), method2177(method2176("\u000f)\rcIS")), method2177(method2176("\u000f)\rcHS")), method2177(method2176("\u000f)\rcJS"))};
   @OriginalMember(
      owner = "client!tja",
      name = "g",
      descriptor = "I"
   )
   public static int field4005 = 1409;
   @OriginalMember(
      owner = "client!tja",
      name = "k",
      descriptor = "I"
   )
   public static int field4002;
   @OriginalMember(
      owner = "client!tja",
      name = "l",
      descriptor = "I"
   )
   public static int field4003;
   @OriginalMember(
      owner = "client!tja",
      name = "i",
      descriptor = "I"
   )
   public static int field4004;
   @OriginalMember(
      owner = "client!tja",
      name = "f",
      descriptor = "I"
   )
   public static int field4006;
   @OriginalMember(
      owner = "client!tja",
      name = "h",
      descriptor = "I"
   )
   public static int field4007;
   @OriginalMember(
      owner = "client!tja",
      name = "j",
      descriptor = "I"
   )
   public static int field4008;

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         int var3 = 126 / ((-51 - arg1) / 60);
         ++field4003;
         return 3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4009[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (!arg0) {
            super.field6984 = this.method78(16726277);
            ++field4004;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4009[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class285(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tja",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         ++field4008;
         super.field6984 = arg1;
         if (arg0 != -14812) {
            field4005 = 65;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4009[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class285(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            return -89;
         } else {
            ++field4002;
            return super.field6980.method4681(-17520) == class382.field5860 && super.field6980.method4680(-17721) ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4009[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2175(int arg0) {
      try {
         ++field4007;
         if (arg0 <= 81) {
            field4005 = 29;
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4009[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2176(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2177(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
