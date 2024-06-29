import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class613 extends class345 {
   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8906 = new String[]{method4506(method4505("E\\\u00166\u0006")), method4506(method4505("E\\\u00165\u0006")), method4506(method4505("E\\\u00160\u0006")), method4506(method4505("E\\\u00163\u0006")), method4506(method4505("E\\\u00167\u0006")), method4506(method4505("E\\\u00164\u0006")), method4506(method4505("E\\\u00161\u0006")), method4506(method4505("E\\\u00169\u0006"))};
   @OriginalMember(
      owner = "client!ia",
      name = "l",
      descriptor = "I"
   )
   public static int field8899 = 0;
   @OriginalMember(
      owner = "client!ia",
      name = "k",
      descriptor = "Luw;"
   )
   public static class435 field8900 = new class435(87, -1);
   @OriginalMember(
      owner = "client!ia",
      name = "n",
      descriptor = "I"
   )
   public static int field8896;
   @OriginalMember(
      owner = "client!ia",
      name = "o",
      descriptor = "I"
   )
   public static int field8897;
   @OriginalMember(
      owner = "client!ia",
      name = "r",
      descriptor = "I"
   )
   public static int field8898;
   @OriginalMember(
      owner = "client!ia",
      name = "m",
      descriptor = "I"
   )
   public static int field8901;
   @OriginalMember(
      owner = "client!ia",
      name = "j",
      descriptor = "I"
   )
   public static int field8902;
   @OriginalMember(
      owner = "client!ia",
      name = "i",
      descriptor = "I"
   )
   public static int field8903;
   @OriginalMember(
      owner = "client!ia",
      name = "q",
      descriptor = "I"
   )
   public static int field8904;
   @OriginalMember(
      owner = "client!ia",
      name = "p",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field8905;

   @OriginalMember(
      owner = "client!ia",
      name = "c",
      descriptor = "(I)V",
      line = 3
   )
   public static void method4501(int arg0) {
      try {
         field8905 = null;
         if (arg0 != 1) {
            field8905 = null;
         }

         field8900 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8906[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(BI)I",
      line = 16
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 > -45) {
            method4501(109);
         }

         ++field8898;
         return !class696.method5063((byte)-35, super.field4914.field11145.method2098(false)) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8906[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(IFFFIFFF)F",
      line = 31
   )
   public static final float method4502(int arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6, float arg7) {
      boolean var8 = client.field4564;

      try {
         ++field8897;
         float var9 = 0.0F;
         float var10 = -arg5 + arg6;
         float var11 = arg2 - arg3;
         if (arg4 != 31447) {
            field8900 = null;
         }

         float var12 = arg7 - arg1;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         float var10000;
         if (var8) {
            var10000 = var9 * var10 + arg5;
         } else if (!(var9 < 1.1F)) {
            var10000 = -1.0F;
            if (!var8) {
               return -1.0F;
            }
         } else {
            var10000 = var9 * var10 + arg5;
         }

         while(true) {
            float var16 = var10000;
            float var17 = var9 * var11 + arg3;
            float var18 = var9 * var12 + arg1;
            int var19 = (int)var16 >> 9;
            int var20 = (int)var18 >> 9;
            if (~var19 < -1 && ~var20 < -1 && class209.field3112 > var19 && class1.field3 > var20) {
               int var21 = class304.field4398.field4090;
               if (~var21 > -4 && (2 & class608.field8732[1][var19][var20]) != 0) {
                  ++var21;
               }

               int var22 = class530.field7721[var21].method2287(-79, (int)var18, (int)var16);
               if ((float)var22 < var17) {
                  if (arg0 >= 2) {
                     return 0.1F * method4502(arg0 + -1, var15, var17, var14, arg4, var13, var16, var18) + var9 + -0.1F;
                  }

                  return var9;
               }
            }

            var13 = var16;
            var9 += 0.1F;
            var14 = var17;
            var15 = var18;
            if (!(var9 < 1.1F)) {
               var10000 = -1.0F;
               if (!var8) {
                  return -1.0F;
               }
            } else {
               var10000 = var9 * var10 + arg5;
            }
         }
      } catch (RuntimeException var24) {
         throw class608.method4462(var24, field8906[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(Z)I",
      line = 97
   )
   public final int method53(boolean arg0) {
      try {
         ++field8896;
         if (arg0) {
            this.method52((byte)-114, -89);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8906[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 110
   )
   public class613(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(I)V",
      line = 116
   )
   public final void method51(int arg0) {
      try {
         if (super.field4914.field11145.method2093((byte)-127) && !class696.method5063((byte)-35, super.field4914.field11145.method2098(false))) {
            super.field4913 = 0;
         }

         ++field8902;
         if (arg0 > super.field4913 || ~super.field4913 < -2) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8906[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(B)Z",
      line = 131
   )
   public final boolean method4503(byte arg0) {
      try {
         ++field8903;
         if (arg0 >= -127) {
            field8905 = null;
         }

         return class696.method5063((byte)-35, super.field4914.field11145.method2098(false));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8906[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "b",
      descriptor = "(Z)I",
      line = 146
   )
   public final int method4504(boolean arg0) {
      try {
         ++field8901;
         if (arg0) {
            field8900 = null;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8906[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 157
   )
   public class613(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ia",
      name = "a",
      descriptor = "(IB)V",
      line = 160
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field8904;
         if (arg1 > 99) {
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8906[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4505(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4506(char[] arg0) {
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
            var10005 = 61;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
