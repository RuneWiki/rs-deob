import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class527 extends class555 {
   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7214 = new String[]{method3805(method3804("s@\u0000a\u0002")), method3805(method3804("s@\u0000n\u0002")), method3805(method3804("s@\u0000`\u0002")), method3805(method3804("s@\u0000c\u0002")), method3805(method3804("s@\u0000b\u0002")), method3805(method3804("s@\u0000e\u0002")), method3805(method3804("s@\u0000d\u0002")), method3805(method3804("s@\u0000g\u0002"))};
   @OriginalMember(
      owner = "client!pi",
      name = "n",
      descriptor = "I"
   )
   public static int field7209 = -1;
   @OriginalMember(
      owner = "client!pi",
      name = "g",
      descriptor = "D"
   )
   public static double field7207;
   @OriginalMember(
      owner = "client!pi",
      name = "k",
      descriptor = "I"
   )
   public static int field7204;
   @OriginalMember(
      owner = "client!pi",
      name = "o",
      descriptor = "I"
   )
   public static int field7206;
   @OriginalMember(
      owner = "client!pi",
      name = "i",
      descriptor = "I"
   )
   public static int field7208;
   @OriginalMember(
      owner = "client!pi",
      name = "l",
      descriptor = "I"
   )
   public static int field7210;
   @OriginalMember(
      owner = "client!pi",
      name = "f",
      descriptor = "I"
   )
   public static int field7211;
   @OriginalMember(
      owner = "client!pi",
      name = "h",
      descriptor = "I"
   )
   public static int field7212;
   @OriginalMember(
      owner = "client!pi",
      name = "j",
      descriptor = "I"
   )
   public static int field7213;
   @OriginalMember(
      owner = "client!pi",
      name = "m",
      descriptor = "[[B"
   )
   public static byte[][] field7205;

   @OriginalMember(
      owner = "client!pi",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class527(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field7206;
         if (arg0 < 124) {
            return -117;
         } else if (!super.field7633.method4414(0)) {
            return super.field7633.field8451.method2771(3) && class363.method2819(super.field7633.field8451.method2770((byte)-100), -5271) ? 1 : 0;
         } else {
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7214[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method3800(byte arg0) {
      try {
         ++field7212;
         if (arg0 >= -61) {
            method3801(126, 101, 14);
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7214[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class527(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pi",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            this.method638(120, (byte)7);
         }

         ++field7210;
         return super.field7633.method4414(0) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7214[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3801(int arg0, int arg1, int arg2) {
      try {
         ++field7208;
         if (arg2 != 1523) {
            field7205 = null;
         }

         return (540800 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7214[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field7213;
         int var3 = -103 % ((arg1 - 12) / 47);
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7214[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3802(int arg0) {
      try {
         if (arg0 == 2) {
            field7205 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7214[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method3803(byte arg0) {
      try {
         ++field7211;
         if (arg0 != -107) {
            this.method638(124, (byte)57);
         }

         return !super.field7633.method4414(arg0 ^ -107);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7214[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 != -13712) {
            method3801(-50, 79, -8);
         }

         ++field7204;
         if (super.field7633.method4414(0)) {
            super.field7632 = 2;
         }

         if (~super.field7632 > -1 || ~super.field7632 < -3) {
            super.field7632 = this.method635(127);
         }

      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7214[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3804(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3805(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
