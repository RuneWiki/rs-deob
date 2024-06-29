import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class589 extends class67 {
   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8692 = new String[]{method4399(method4398("4\\>p7")), method4399(method4398(">\u0000>\u001db")), method4399(method4398("+[|_")), method4399(method4398("4\\>u7")), method4399(method4398("4\\>q7")), method4399(method4398("4\\>t7")), method4399(method4398("4\\>v7")), method4399(method4398("4\\>{7")), method4399(method4398("4\\>z7")), method4399(method4398("4\\>w7")), method4399(method4398("4\\>r7"))};
   @OriginalMember(
      owner = "client!qr",
      name = "u",
      descriptor = "I"
   )
   public static int field8679 = 16777215;
   @OriginalMember(
      owner = "client!qr",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field8686 = false;
   @OriginalMember(
      owner = "client!qr",
      name = "w",
      descriptor = "Luk;"
   )
   public static class498 field8684 = new class498(24, -1);
   @OriginalMember(
      owner = "client!qr",
      name = "l",
      descriptor = "I"
   )
   public static int field8690 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "q",
      descriptor = "[[I"
   )
   public static int[][] field8691 = new int[128][128];
   @OriginalMember(
      owner = "client!qr",
      name = "p",
      descriptor = "I"
   )
   public static int field8680;
   @OriginalMember(
      owner = "client!qr",
      name = "v",
      descriptor = "I"
   )
   public static int field8681;
   @OriginalMember(
      owner = "client!qr",
      name = "o",
      descriptor = "I"
   )
   public static int field8682;
   @OriginalMember(
      owner = "client!qr",
      name = "k",
      descriptor = "I"
   )
   public static int field8683;
   @OriginalMember(
      owner = "client!qr",
      name = "t",
      descriptor = "I"
   )
   public static int field8685;
   @OriginalMember(
      owner = "client!qr",
      name = "r",
      descriptor = "I"
   )
   public static int field8687;
   @OriginalMember(
      owner = "client!qr",
      name = "m",
      descriptor = "I"
   )
   public static int field8688;
   @OriginalMember(
      owner = "client!qr",
      name = "s",
      descriptor = "I"
   )
   public static int field8689;

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field8680;
         if (super.field881.method298(96)) {
            return 3;
         } else {
            if (arg1 > -74) {
               field8691 = null;
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8692[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4393(int arg0) {
      try {
         if (arg0 != 24) {
            method4395((byte)52);
         }

         field8684 = null;
         field8691 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8692[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method4394(int arg0) {
      try {
         ++field8685;
         if (arg0 != 3343) {
            return false;
         } else {
            return !super.field881.method298(96);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8692[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class589(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class589(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field8688;
         return arg0 != 0 ? 15 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8692[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field8681;
         super.field877 = arg0;
         if (!arg1) {
            this.method162(39);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8692[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 == -69) {
            if (super.field881.method298(96)) {
               super.field877 = 0;
            }

            ++field8683;
            if (~super.field877 != -2 && super.field877 != 0) {
               super.field877 = this.method162(arg0 + 69);
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8692[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4395(byte arg0) {
      try {
         ++field8682;
         class108.field1491.method2551(true);
         if (arg0 >= -97) {
            method4397((class365)null, 12, -81);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8692[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4396(int arg0) {
      try {
         ++field8687;
         if (arg0 != 480102311) {
            this.method162(-30);
         }

         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8692[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Lvca;II)V"
   )
   public static final void method4397(class365 arg0, int arg1, int arg2) {
      try {
         if (class253.field3817) {
            class253.field3817 = false;
            arg1 = 0;
         }

         ++field8689;
         if (arg2 != 7675) {
            field8690 = -7;
         }

         if (class332.field5022 == null || !class332.field5022.method2969(-1, arg0)) {
            class332.field5022 = arg0;
            class614.field8921 = class162.method1442(14080);
            class176.field2763 = arg1;
            class28.field341 = arg1;
            if (~class28.field341 != -1) {
               class605.field8837 = class645.field9313;
               class585.field8658 = class376.field5983;
               class119.field1632 = class354.field5400;
               class674.field10030 = class152.field2281;
               class799.field11638 = class607.field8855;
               class81.field1153 = class573.field8481;
               class246.field3728 = class487.field7399;
               class117.field1568 = class365.field5645;
               class474.field7213 = class751.field11147;
               class693.field10310 = class699.field10389;
               class360.field5563 = class786.field11528;
               if (class354.field5400 != null) {
                  if (class354.field5400.method3389(1)) {
                     class119.field1632 = class354.field5400.method3395((byte)-99);
                     class354.field5400 = class119.field1632;
                  }

                  if (class354.field5400 != null && class354.field5400 != class332.field5022.field5632) {
                     class354.field5400.method3397(class332.field5022.field5632, arg2 ^ -27881);
                     return;
                  }
               }
            } else {
               class690.method5082((byte)-83);
            }
         }

      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8692[3] + (arg0 != null ? field8692[1] : field8692[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4398(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4399(char[] arg0) {
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
            var10005 = 46;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
