import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class485 extends class465 {
   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7188 = new String[]{method3601(method3600("awaNO")), method3601(method3600("awaJO")), method3601(method3600("awaOO")), method3601(method3600("awaMO")), method3601(method3600("awaIO")), method3601(method3600("awaKO")), method3601(method3600("awaLO"))};
   @OriginalMember(
      owner = "client!nq",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field7180 = true;
   @OriginalMember(
      owner = "client!nq",
      name = "m",
      descriptor = "I"
   )
   public static int field7181;
   @OriginalMember(
      owner = "client!nq",
      name = "g",
      descriptor = "I"
   )
   public static int field7182;
   @OriginalMember(
      owner = "client!nq",
      name = "f",
      descriptor = "I"
   )
   public static int field7183;
   @OriginalMember(
      owner = "client!nq",
      name = "l",
      descriptor = "I"
   )
   public static int field7184;
   @OriginalMember(
      owner = "client!nq",
      name = "i",
      descriptor = "I"
   )
   public static int field7185;
   @OriginalMember(
      owner = "client!nq",
      name = "j",
      descriptor = "I"
   )
   public static int field7186;
   @OriginalMember(
      owner = "client!nq",
      name = "k",
      descriptor = "I"
   )
   public static int field7187;

   @OriginalMember(
      owner = "client!nq",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 4
   )
   public class485(class648 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 10
   )
   public static final void method3597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field7181;
         if (~class261.field3566.field9430.method1271(93) != -1 && ~arg5 != -1 && class130.field1612 < 50 && ~arg2 != 0) {
            class321.field4575[class130.field1612++] = new class581((byte)1, arg2, arg5, arg3, arg0, 0, arg4, (class616)null);
         }

         if (arg1 != 9026) {
            method3597(-38, -115, 69, -100, -115, -53);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7188[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(I)I",
      line = 27
   )
   public final int method3598(int arg0) {
      try {
         ++field7182;
         if (arg0 <= 81) {
            this.method78(-20);
         }

         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7188[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(I)I",
      line = 39
   )
   public final int method78(int arg0) {
      try {
         ++field7185;
         if (arg0 != 16726277) {
            return -85;
         } else if (!super.field6980.method4680(-17721)) {
            return super.field6980.field9464.method4223((byte)-106) && class506.method3756(super.field6980.field9464.method4225(arg0 + -16726185), (byte)-128) ? 1 : 0;
         } else {
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7188[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 60
   )
   public class485(int arg0, class648 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Z)V",
      line = 68
   )
   public final void method69(boolean arg0) {
      try {
         ++field7184;
         if (super.field6980.method4680(-17721)) {
            super.field6984 = 2;
         }

         if (arg0) {
            field7180 = false;
         }

         if (super.field6984 < 0 || ~super.field6984 < -3) {
            super.field6984 = this.method78(16726277);
         }

      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7188[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(IB)I",
      line = 86
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field7186;
         if (super.field6980.method4680(-17721)) {
            return 3;
         } else {
            int var3 = 1 / ((-51 - arg1) / 60);
            return 1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7188[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "(Z)Z",
      line = 99
   )
   public final boolean method3599(boolean arg0) {
      try {
         ++field7183;
         if (arg0) {
            this.method78(37);
         }

         return !super.field6980.method4680(-17721);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7188[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(II)V",
      line = 116
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            this.method3598(60);
         }

         ++field7187;
         super.field6984 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7188[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3600(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3601(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
