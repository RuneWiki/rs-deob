import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class515 extends class529 {
   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7540 = new String[]{method3817(method3816("a[[y(!")), method3817(method3816("a[[y!!")), method3817(method3816("r\u0016\u0014y\u0014")), method3817(method3816("a[[y+!")), method3817(method3816("gMV;")), method3817(method3816("a[[y.!")), method3817(method3816("U\u0017\u0014mE)g\u0017|2TFz")), method3817(method3816("yYO$\f")), method3817(method3816("YYO$\u0000g_\u001a1\u0006{\u0018")), method3817(method3816("a[[y*!")), method3817(method3816(")K_4\u0006g\\IyG'")), method3817(method3816("a[[y-!")), method3817(method3816("a[[y/!")), method3817(method3816("a[[y,!"))};
   @OriginalMember(
      owner = "client!hca",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field7538 = false;
   @OriginalMember(
      owner = "client!hca",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field7535 = false;
   @OriginalMember(
      owner = "client!hca",
      name = "d",
      descriptor = "I"
   )
   public static int field7530;
   @OriginalMember(
      owner = "client!hca",
      name = "k",
      descriptor = "I"
   )
   public static int field7531;
   @OriginalMember(
      owner = "client!hca",
      name = "e",
      descriptor = "I"
   )
   public static int field7532;
   @OriginalMember(
      owner = "client!hca",
      name = "f",
      descriptor = "I"
   )
   public static int field7533;
   @OriginalMember(
      owner = "client!hca",
      name = "m",
      descriptor = "I"
   )
   public static int field7534;
   @OriginalMember(
      owner = "client!hca",
      name = "j",
      descriptor = "I"
   )
   public static int field7536;
   @OriginalMember(
      owner = "client!hca",
      name = "h",
      descriptor = "I"
   )
   public static int field7539;
   @OriginalMember(
      owner = "client!hca",
      name = "g",
      descriptor = "Lat;"
   )
   public static class396 field7537;

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3813(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         ++field7534;
         if (arg0 < 12) {
            field7537 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7540[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(ILbca;I)V"
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         super.field7700.method4818((byte)28, arg1);
         if (arg2 == -1) {
            ++field7530;
            super.field7700.method4796(false, arg0);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7540[3] + arg0 + ',' + (arg1 != null ? field7540[2] : field7540[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3814(int arg0) {
      try {
         if (arg0 == 10) {
            field7537 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7540[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method874(int arg0) {
      try {
         ++field7531;
         super.field7700.method4821((byte)5, false);
         if (arg0 != 1) {
            method3815(108, 34);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7540[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method878(int arg0, boolean arg1) {
      try {
         ++field7533;
         super.field7700.method4821((byte)5, true);
         if (arg0 != 0) {
            this.method878(-112, true);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7540[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "<init>",
      descriptor = "(Lck;)V"
   )
   public class515(class667 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hca",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method873(int arg0) {
      try {
         ++field7532;
         if (arg0 != 0) {
            field7538 = false;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7540[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method871(int arg0, int arg1, int arg2) {
      try {
         ++field7539;
         int var4 = -79 / ((75 - arg1) / 37);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7540[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3815(int arg0, int arg1) {
      return class173.field2163 != null ? class173.field2163[arg0][arg1] & 16777215 : 0;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3816(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3817(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
