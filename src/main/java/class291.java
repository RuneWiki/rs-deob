import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class291 extends class454 {
   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4016 = new String[]{method2351(method2350("KYq0J")), method2351(method2350("KYq6J")), method2351(method2350("KYq2J")), method2351(method2350("KYq7J")), method2351(method2350("KYq4J")), method2351(method2350("KYq3J"))};
   @OriginalMember(
      owner = "client!rk",
      name = "j",
      descriptor = "I"
   )
   public static int field4009 = 0;
   @OriginalMember(
      owner = "client!rk",
      name = "m",
      descriptor = "I"
   )
   public static int field4010;
   @OriginalMember(
      owner = "client!rk",
      name = "n",
      descriptor = "I"
   )
   public static int field4011;
   @OriginalMember(
      owner = "client!rk",
      name = "o",
      descriptor = "I"
   )
   public static int field4012;
   @OriginalMember(
      owner = "client!rk",
      name = "k",
      descriptor = "I"
   )
   public static int field4013;
   @OriginalMember(
      owner = "client!rk",
      name = "l",
      descriptor = "I"
   )
   public static int field4014;
   @OriginalMember(
      owner = "client!rk",
      name = "i",
      descriptor = "I"
   )
   public static int field4015;

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            field4009 = -102;
         }

         ++field4010;
         return 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4016[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field4014;
         super.field6263 = arg1;
         if (arg0 > -46) {
            field4009 = -65;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4016[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method20((byte)-15, 31);
         }

         ++field4012;
         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4016[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2348(int arg0) {
      try {
         if (arg0 != -18033) {
            field4009 = -17;
         }

         ++field4011;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4016[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(BI)I"
   )
   public static final int method2349(byte arg0, int arg1) {
      try {
         ++field4013;
         int var2 = 0;
         if (arg1 < 0 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
         }

         if (arg1 >= 256) {
            arg1 >>>= 8;
            var2 += 8;
         }

         if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
         }

         if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
         }

         if (arg0 < 95) {
            field4009 = 8;
         }

         if (~arg1 <= -2) {
            ++var2;
            arg1 >>>= 1;
         }

         return arg1 + var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4016[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class291(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class291(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (!arg0) {
            this.method23(73);
         }

         ++field4015;
         if (super.field6259.method5439(28852) == class776.field11312) {
            super.field6263 = 2;
         }

         if (~super.field6263 > -1 || ~super.field6263 < -3) {
            super.field6263 = this.method23(1);
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4016[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2350(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2351(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
