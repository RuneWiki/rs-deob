import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class104 extends class555 {
   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1329 = new String[]{method933(method932("\\Z#|m")), method933(method932("\\Z#{m")), method933(method932("\\Z#zm")), method933(method932("\\Z#~m")), method933(method932("\\Z#\u007fm")), method933(method932("\\Z#pm")), method933(method932("\\Z#ym")), method933(method932("\\Z#}m"))};
   @OriginalMember(
      owner = "client!ps",
      name = "k",
      descriptor = "Ltv;"
   )
   public static class590 field1322 = new class590(64);
   @OriginalMember(
      owner = "client!ps",
      name = "m",
      descriptor = "I"
   )
   public static int field1320;
   @OriginalMember(
      owner = "client!ps",
      name = "n",
      descriptor = "I"
   )
   public static int field1321;
   @OriginalMember(
      owner = "client!ps",
      name = "l",
      descriptor = "I"
   )
   public static int field1323;
   @OriginalMember(
      owner = "client!ps",
      name = "h",
      descriptor = "I"
   )
   public static int field1324;
   @OriginalMember(
      owner = "client!ps",
      name = "g",
      descriptor = "I"
   )
   public static int field1325;
   @OriginalMember(
      owner = "client!ps",
      name = "f",
      descriptor = "I"
   )
   public static int field1326;
   @OriginalMember(
      owner = "client!ps",
      name = "j",
      descriptor = "I"
   )
   public static int field1327;
   @OriginalMember(
      owner = "client!ps",
      name = "i",
      descriptor = "I"
   )
   public static int field1328;

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class104(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method928(byte arg0) {
      try {
         if (arg0 >= -61) {
            field1322 = null;
         }

         ++field1321;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1329[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class104(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (arg0 == -13712) {
            if (~super.field7632 != -1 && ~super.field7633.field8461.method1732((byte)-108) != -2) {
               super.field7632 = 0;
            }

            ++field1324;
            if (super.field7632 < 0 || super.field7632 > 1) {
               super.field7632 = this.method635(arg0 ^ -13810);
            }

         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1329[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field1325;
         if (arg0 != 0 && super.field7633.field8461.method1732((byte)-115) != 1) {
            if (arg1 <= 36) {
               method931(63, true, 84, 125, -73);
            }

            return 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1329[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            return -74;
         } else {
            ++field1320;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1329[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method929(int arg0) {
      try {
         int var1 = 62 % ((73 - arg0) / 53);
         field1322 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1329[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method930(byte arg0) {
      try {
         if (arg0 != -107) {
            this.method637(108);
         }

         ++field1323;
         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1329[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(IZIII)V"
   )
   public static final void method931(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      try {
         label20: {
            if (~arg0 < ~arg4) {
               class125.method1046(-23355, arg0, class17.field236[arg2], arg3, arg4);
               if (!client.field4273) {
                  break label20;
               }
            }

            class125.method1046(-23355, arg4, class17.field236[arg2], arg3, arg0);
         }

         if (!arg1) {
            field1328 = 30;
         }

         ++field1327;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1329[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         int var3 = 106 % ((arg1 - 12) / 47);
         ++field1326;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1329[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method932(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method933(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
