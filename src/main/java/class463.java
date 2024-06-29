import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class463 extends class55 {
   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6654 = new String[]{method3365(method3364("7~~<=")), method3365(method3364("7~~?=")), method3365(method3364("7~~>=")), method3365(method3364("7~~9=")), method3365(method3364("7~~;=")), method3365(method3364("7~~8=")), method3365(method3364("7~~2=")), method3365(method3364("7~~=="))};
   @OriginalMember(
      owner = "client!rp",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field6644 = new int[3];
   @OriginalMember(
      owner = "client!rp",
      name = "h",
      descriptor = "I"
   )
   public static int field6645;
   @OriginalMember(
      owner = "client!rp",
      name = "n",
      descriptor = "I"
   )
   public static int field6646;
   @OriginalMember(
      owner = "client!rp",
      name = "i",
      descriptor = "I"
   )
   public static int field6647;
   @OriginalMember(
      owner = "client!rp",
      name = "j",
      descriptor = "I"
   )
   public static int field6648;
   @OriginalMember(
      owner = "client!rp",
      name = "m",
      descriptor = "I"
   )
   public static int field6649;
   @OriginalMember(
      owner = "client!rp",
      name = "f",
      descriptor = "I"
   )
   public static int field6650;
   @OriginalMember(
      owner = "client!rp",
      name = "g",
      descriptor = "I"
   )
   public static int field6652;
   @OriginalMember(
      owner = "client!rp",
      name = "e",
      descriptor = "I"
   )
   public static int field6653;
   @OriginalMember(
      owner = "client!rp",
      name = "l",
      descriptor = "Lbg;"
   )
   public static class492 field6651;

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field6649;
         if (super.field683.field6442.method1033((byte)45) && super.field680 == 2) {
            super.field680 = 1;
         }

         if (arg0 > super.field680 || ~super.field680 < -3) {
            super.field680 = this.method101(-125);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6654[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3360(int arg0) {
      try {
         ++field6648;
         int var2 = -30 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6654[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3361(int arg0, int arg1) {
      try {
         ++field6646;
         int var2 = -41 / ((arg0 - 14) / 60);
         return arg1 >>> 7;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6654[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3362(byte arg0) {
      try {
         if (arg0 <= 108) {
            field6651 = null;
         }

         field6651 = null;
         field6644 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6654[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method96(-110, (byte)-64);
         }

         ++field6653;
         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6654[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method3363(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field6645;
         int var7 = arg1 * class300.field4107.field6433.method4286(-92) >> 8;
         if (arg2 != -125) {
            method3363(-67, 53, (byte)17, -104);
         }

         if (var7 != 0 && arg0 != -1) {
            if (!class759.field11229 && class497.field7205 != -1 && class617.method4482(0) && !class157.method1316(-1222)) {
               class681.field10032 = class446.method3276(16777215);
               class582 var4 = class521.method3783(9, class681.field10032);
               class377.method2860(arg2 + 242, var4, true);
            }

            class192.method1515(0, arg0, (byte)-48, false, class598.field8789, var7);
            class167.method1374((byte)-13, 255, -1);
            class759.field11229 = true;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6654[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class463(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field6647;
         super.field680 = arg0;
         int var3 = 7 % ((arg1 - 47) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6654[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field6652;
         if (arg0 > -116) {
            this.method3360(-75);
         }

         return 2;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6654[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class463(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3364(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3365(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
