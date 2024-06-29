import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class548 extends class555 {
   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7495 = new String[]{method3963(method3962("o\u0007W,\u0016")), method3963(method3962("o\u0007W-\u0016")), method3963(method3962("o\u0007W*\u0016")), method3963(method3962("o\u0007W+\u0016")), method3963(method3962("o\u0007W.\u0016")), method3963(method3962("o\u0007W(\u0016")), method3963(method3962("o\u0007W/\u0016"))};
   @OriginalMember(
      owner = "client!hv",
      name = "o",
      descriptor = "Lgka;"
   )
   public static class394 field7489 = new class394("", 12);
   @OriginalMember(
      owner = "client!hv",
      name = "n",
      descriptor = "Ltga;"
   )
   public static class63 field7492 = new class63(1);
   @OriginalMember(
      owner = "client!hv",
      name = "h",
      descriptor = "[[I"
   )
   public static int[][] field7493 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!hv",
      name = "g",
      descriptor = "I"
   )
   public static int field7494 = -1;
   @OriginalMember(
      owner = "client!hv",
      name = "j",
      descriptor = "I"
   )
   public static int field7484;
   @OriginalMember(
      owner = "client!hv",
      name = "m",
      descriptor = "I"
   )
   public static int field7485;
   @OriginalMember(
      owner = "client!hv",
      name = "k",
      descriptor = "I"
   )
   public static int field7486;
   @OriginalMember(
      owner = "client!hv",
      name = "f",
      descriptor = "I"
   )
   public static int field7487;
   @OriginalMember(
      owner = "client!hv",
      name = "p",
      descriptor = "I"
   )
   public static int field7488;
   @OriginalMember(
      owner = "client!hv",
      name = "i",
      descriptor = "I"
   )
   public static int field7490;
   @OriginalMember(
      owner = "client!hv",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field7491;

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 <= 36) {
            field7492 = null;
         }

         ++field7486;
         if (super.field7633.method4414(0)) {
            return 3;
         } else {
            return super.field7633.method4418((byte)-123) == class551.field7585 ? 1 : 3;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7495[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         ++field7484;
         super.field7632 = arg0;
         int var3 = 37 / ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7495[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class548(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3959(byte arg0) {
      try {
         field7493 = null;
         field7491 = null;
         field7489 = null;
         field7492 = null;
         if (arg0 >= -115) {
            field7492 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7495[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method3960(byte arg0) {
      try {
         if (arg0 > -61) {
            field7494 = -14;
         }

         ++field7487;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7495[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class548(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            field7492 = null;
         }

         ++field7485;
         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7495[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3961(byte arg0) {
      try {
         ++field7490;
         if (super.field7633.method4414(0)) {
            return false;
         } else if (super.field7633.method4418((byte)-123) == class551.field7585) {
            return true;
         } else {
            return arg0 != -107 ? false : false;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7495[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         label31: {
            if (super.field7633.method4418((byte)-123) == class551.field7585) {
               if (!super.field7633.method4414(0)) {
                  break label31;
               }

               super.field7632 = 0;
               if (!client.field4273) {
                  break label31;
               }
            }

            super.field7632 = 1;
         }

         ++field7488;
         if (super.field7632 != 0 && ~super.field7632 != -2) {
            super.field7632 = this.method635(arg0 ^ -13810);
         }

         if (arg0 != -13712) {
            field7493 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7495[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3962(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3963(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
