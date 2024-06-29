import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class572 {
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8134 = new String[]{method4095(method4094("\tN\u000f8RJ")), method4095(method4094("\tN\u000f8TJ")), method4095(method4094("\tN\u000f8WJ")), method4095(method4094("\tN\u000f8SJ"))};
   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field8132 = new class118(80, 2);
   @OriginalMember(
      owner = "client!kga",
      name = "d",
      descriptor = "I"
   )
   public static int field8130;
   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "I"
   )
   public static int field8131;
   @OriginalMember(
      owner = "client!kga",
      name = "c",
      descriptor = "I"
   )
   public static int field8133;

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method4089(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         if (arg1 <= 115) {
            field8132 = null;
         }

         ++field8131;
         int var5;
         if (~arg2 < ~arg0) {
            int var4 = arg0;
            arg0 = arg2;
            arg2 = var4;
            if (var3) {
               var5 = arg0 % var4;
               arg0 = var4;
               arg2 = var5;
            }
         }

         while(true) {
            int var10000;
            if (~arg2 == -1) {
               var10000 = arg0;
               if (!var3) {
                  return arg0;
               }
            } else {
               var10000 = arg0 % arg2;
            }

            var5 = var10000;
            arg0 = arg2;
            arg2 = var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8134[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4090(int arg0) {
      try {
         int var1 = -104 / ((arg0 - -53) / 40);
         field8132 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8134[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public static final boolean method4091(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field8130;
         if (~(2 & class613.field9016[0][arg1][arg3]) != -1) {
            return true;
         } else if ((class613.field9016[arg0][arg1][arg3] & 16) != 0) {
            return false;
         } else {
            if (arg4 >= -78) {
               field8132 = null;
            }

            return class618.method4489(arg1, -80, arg3, arg0) == arg2;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8134[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4092(int arg0, int arg1) {
      class517 var2 = class663.field9659[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class517 var4 = class663.field9659[var3][arg0][arg1] = class663.field9659[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class772 var5 = var4.field7468; var5 != null; var5 = var5.field11354) {
               class627 var6 = var5.field11352;
               if (var6.field9207 == arg0 && var6.field9208 == arg1) {
                  --var6.field10701;
               }
            }

            if (var4.field7464 != null) {
               --var4.field7464.field10701;
            }

            if (var4.field7476 != null) {
               --var4.field7476.field10701;
            }

            if (var4.field7469 != null) {
               --var4.field7469.field10701;
            }

            if (var4.field7474 != null) {
               --var4.field7474.field10701;
            }

            if (var4.field7475 != null) {
               --var4.field7475.field10701;
            }
         }
      }

      if (class663.field9659[0][arg0][arg1] == null) {
         class663.field9659[0][arg0][arg1] = new class517(0);
         class663.field9659[0][arg0][arg1].field7466 = 1;
      }

      class663.field9659[0][arg0][arg1].field7467 = var2;
      class663.field9659[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(II)S"
   )
   public static final short method4093(int arg0, int arg1) {
      try {
         ++field8133;
         int var2 = arg1 >> 10 & 63;
         if (arg0 > -15) {
            method4090(77);
         }

         int var3 = (899 & arg1) >> 3;
         int var4 = arg1 & 127;
         int var5 = ~var4 < -65 ? (-var4 + 127) * var3 >> 7 : var3 * var4 >> 7;
         int var6 = var4 + var5;
         int var7;
         if (~var6 == -1) {
            var7 = var5 << 1;
            if (!client.field4360) {
               return (short)(var6 | var2 << 10 | var7 >> 4 << 7);
            }
         }

         var7 = (var5 << 8) / var6;
         return (short)(var6 | var2 << 10 | var7 >> 4 << 7);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field8134[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
