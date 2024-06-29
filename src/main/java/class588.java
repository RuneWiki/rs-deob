import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class588 extends class557 {
   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8264 = new String[]{method4320(method4319("\t;\u0017]M")), method4320(method4319("\t;\u0017YM")), method4320(method4319("\t;\u0017_M")), method4320(method4319("\t;\u0017SM")), method4320(method4319("\t;\u0017XM")), method4320(method4319("\t;\u0017ZM")), method4320(method4319("\t;\u0017QM")), method4320(method4319("\t;\u0017^M")), method4320(method4319("\t;\u0017\\M"))};
   @OriginalMember(
      owner = "client!jp",
      name = "r",
      descriptor = "I"
   )
   public static int field8253 = 0;
   @OriginalMember(
      owner = "client!jp",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field8259 = new int[3];
   @OriginalMember(
      owner = "client!jp",
      name = "h",
      descriptor = "Liw;"
   )
   public static class107 field8263 = new class107(8);
   @OriginalMember(
      owner = "client!jp",
      name = "k",
      descriptor = "I"
   )
   public static int field8252;
   @OriginalMember(
      owner = "client!jp",
      name = "s",
      descriptor = "I"
   )
   public static int field8254;
   @OriginalMember(
      owner = "client!jp",
      name = "j",
      descriptor = "I"
   )
   public static int field8255;
   @OriginalMember(
      owner = "client!jp",
      name = "o",
      descriptor = "I"
   )
   public static int field8256;
   @OriginalMember(
      owner = "client!jp",
      name = "p",
      descriptor = "I"
   )
   public static int field8257;
   @OriginalMember(
      owner = "client!jp",
      name = "n",
      descriptor = "I"
   )
   public static int field8258;
   @OriginalMember(
      owner = "client!jp",
      name = "m",
      descriptor = "I"
   )
   public static int field8260;
   @OriginalMember(
      owner = "client!jp",
      name = "i",
      descriptor = "I"
   )
   public static int field8261;
   @OriginalMember(
      owner = "client!jp",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field8262;

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(IIIIZ)V"
   )
   public static final void method4314(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field8257;
         if (class132.method1345(-113, arg1)) {
            class164.method1541(class315.field4719[arg1], true, arg0, -1, arg2, arg4);
            if (arg3 > -22) {
               method4314(66, -89, -29, 109, true);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8264[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method4315(int arg0) {
      try {
         ++field8258;
         if (arg0 >= -52) {
            field8262 = null;
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8264[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            field8262 = null;
         }

         ++field8254;
         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8264[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4316(int arg0) {
      try {
         field8259 = null;
         if (arg0 != 11010) {
            method4318(7, 75, -103, -62);
         }

         field8262 = null;
         field8263 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8264[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class588(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4317(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 != -22) {
            field8263 = null;
         }

         if (super.field7905 != 1 && ~super.field7905 != -1) {
            super.field7905 = this.method97(arg0 + 22);
         }

         ++field8256;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8264[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class588(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field8261;
         if (arg1) {
            super.field7905 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8264[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            field8262 = null;
         }

         ++field8255;
         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8264[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method4318(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8252;
         if (class56.field805 != arg0 || ~class434.field6363 != ~arg1 || ~class265.field4047 != ~arg3) {
            class56.field805 = arg0;
            class265.field4047 = arg3;
            class434.field6363 = arg1;
            class248.field3804 = true;
            double var4 = -((double)(arg0 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double)(arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class417.field6106 = var12;
            class540.field7578 = -var10 * var12;
            class84.field1298 = var10 * var14;
            class490.field7008 = var8 * var12;
            class355.field5248 = -var8 * var14;
            class228.field3541 = 0.0D;
            class565.field8035 = var14;
            class86.field1311 = var10;
            if (arg2 != -14411) {
               method4316(-22);
            }

            class731.field10401 = var8;
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field8264[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
