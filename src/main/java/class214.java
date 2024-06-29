import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class214 extends class454 {
   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2728 = new String[]{method1754(method1753("+\t-l~")), method1754(method1753("+\t-m~")), method1754(method1753("+\t-i~")), method1754(method1753("+\t-h~")), method1754(method1753("+\t-`~")), method1754(method1753("+\t-k~")), method1754(method1753("+\t-j~")), method1754(method1753("+\t-o~")), method1754(method1753("+\t-f~"))};
   @OriginalMember(
      owner = "client!lw",
      name = "l",
      descriptor = "Lmu;"
   )
   public static class314 field2727 = new class314();
   @OriginalMember(
      owner = "client!lw",
      name = "p",
      descriptor = "I"
   )
   public static int field2717;
   @OriginalMember(
      owner = "client!lw",
      name = "i",
      descriptor = "I"
   )
   public static int field2718;
   @OriginalMember(
      owner = "client!lw",
      name = "k",
      descriptor = "I"
   )
   public static int field2719;
   @OriginalMember(
      owner = "client!lw",
      name = "q",
      descriptor = "I"
   )
   public static int field2721;
   @OriginalMember(
      owner = "client!lw",
      name = "r",
      descriptor = "I"
   )
   public static int field2722;
   @OriginalMember(
      owner = "client!lw",
      name = "n",
      descriptor = "I"
   )
   public static int field2723;
   @OriginalMember(
      owner = "client!lw",
      name = "s",
      descriptor = "I"
   )
   public static int field2724;
   @OriginalMember(
      owner = "client!lw",
      name = "m",
      descriptor = "I"
   )
   public static int field2725;
   @OriginalMember(
      owner = "client!lw",
      name = "j",
      descriptor = "I"
   )
   public static int field2726;
   @OriginalMember(
      owner = "client!lw",
      name = "o",
      descriptor = "Lu;"
   )
   public static class65 field2720;

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field2727 = null;
         }

         ++field2725;
         if (super.field6259.method5434((byte)-128)) {
            return 3;
         } else if (super.field6259.method5439(28852) == class450.field6103) {
            if (~arg0 == -1) {
               if (super.field6259.field10999.method3532(-18033) == 1) {
                  return 2;
               }

               if (super.field6259.field10973.method5420(-18033) == 1) {
                  return 2;
               }

               if (super.field6259.field11005.method5083(-18033) > 0) {
                  return 2;
               }
            }

            return 1;
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2728[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1748(int arg0, int arg1) {
      try {
         class491.field6864 = -1;
         class345.field4731 = arg1;
         class227.field2847 = -1;
         ++field2726;
         class541.method4094(true);
         int var2 = 36 % ((60 - arg0) / 49);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2728[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method1749(int arg0, boolean arg1, int arg2) {
      try {
         class623.method4613(class606.field8915.method4490(class782.field11389, -16777216), arg0, arg1, -2);
         if (arg2 < 48) {
            field2727 = null;
         }

         ++field2717;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2728[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method1750(boolean arg0) {
      try {
         ++field2724;
         if (super.field6259.method5434((byte)-122)) {
            return false;
         } else if (arg0) {
            return true;
         } else {
            return super.field6259.method5439(28852) == class450.field6103;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2728[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1751(boolean arg0) {
      try {
         if (arg0) {
            method1748(-17, -125);
         }

         field2720 = null;
         field2727 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2728[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class214(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class214(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 <= -46) {
            super.field6263 = arg1;
            ++field2721;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2728[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return -32;
         } else {
            ++field2719;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2728[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1752(int arg0) {
      try {
         ++field2718;
         return arg0 != -18033 ? -27 : super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2728[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         label30: {
            ++field2722;
            if (super.field6259.method5439(28852) != class450.field6103) {
               super.field6263 = 1;
               if (!client.field1481) {
                  break label30;
               }
            }

            if (super.field6259.method5434((byte)-120)) {
               super.field6263 = 0;
            }
         }

         if (!arg0) {
            field2720 = null;
         }

         if (~super.field6263 != -1 && super.field6263 != 1) {
            super.field6263 = this.method23(1);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2728[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1753(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1754(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
