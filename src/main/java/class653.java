import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class653 extends class347 {
   @OriginalMember(
      owner = "client!go",
      name = "k",
      descriptor = "I"
   )
   public int field9509;
   @OriginalMember(
      owner = "client!go",
      name = "j",
      descriptor = "I"
   )
   public int field9511;
   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9514 = new String[]{method4709(method4708(":8GtY")), method4709(method4708(":8GvY")), method4709(method4708(":8GpY")), method4709(method4708("3\"\u0005Y")), method4709(method4708("&yG\u001b\f")), method4709(method4708(":8GwY")), method4709(method4708(":8G\t\u00183>\u001d\u000bY")), method4709(method4708(":8GqY"))};
   @OriginalMember(
      owner = "client!go",
      name = "o",
      descriptor = "I"
   )
   public static int field9507 = 0;
   @OriginalMember(
      owner = "client!go",
      name = "l",
      descriptor = "I"
   )
   public static int field9512 = 0;
   @OriginalMember(
      owner = "client!go",
      name = "m",
      descriptor = "I"
   )
   public static int field9505;
   @OriginalMember(
      owner = "client!go",
      name = "n",
      descriptor = "I"
   )
   public static int field9506;
   @OriginalMember(
      owner = "client!go",
      name = "p",
      descriptor = "I"
   )
   public static int field9508;
   @OriginalMember(
      owner = "client!go",
      name = "q",
      descriptor = "I"
   )
   public static int field9510;
   @OriginalMember(
      owner = "client!go",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9513;

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "([FIIF[FIIIIZI)V",
      line = 3
   )
   public static final void method4703(float[] arg0, int arg1, int arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      int var11 = client.field4530;

      try {
         float var16;
         float var17;
         label42: {
            int var22 = arg5 - arg1;
            int var24 = arg8 - arg7;
            int var23 = arg6 - arg10;
            ++field9510;
            float var12 = arg4[2] * (float)var23 + arg4[0] * (float)var22 + arg4[1] * (float)var24;
            float var13 = arg4[5] * (float)var23 + arg4[4] * (float)var24 + arg4[3] * (float)var22;
            float var14 = arg4[8] * (float)var23 + arg4[7] * (float)var24 + arg4[6] * (float)var22;
            float var15 = (float)Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
            var16 = 0.5F + (float)Math.atan2((double)var12, (double)var14) / 6.2831855F;
            var17 = 0.5F + (float)Math.asin((double)(var13 / var15)) / 3.1415927F + arg3;
            if (arg2 != 1) {
               if (arg2 == 2) {
                  var16 = -var16;
                  var17 = -var17;
                  if (var11 == 0) {
                     break label42;
                  }
               }

               if (arg2 != 3) {
                  break label42;
               }

               float var18 = var16;
               var16 = var17;
               var17 = -var18;
               if (var11 == 0) {
                  break label42;
               }
            }

            float var19 = var16;
            var16 = -var17;
            var17 = var19;
         }

         if (arg9) {
            field9513 = null;
         }

         arg0[1] = var17;
         arg0[0] = var16;
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field9514[7] + (arg0 != null ? field9514[4] : field9514[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9514[4] : field9514[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "b",
      descriptor = "(I)V",
      line = 56
   )
   public static void method4704(int arg0) {
      try {
         if (arg0 >= -51) {
            method4704(10);
         }

         field9513 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9514[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(Lha;Lhv;B)V",
      line = 66
   )
   public static final void method4705(class66 arg0, class544 arg1, byte arg2) {
      try {
         if (arg2 == 71) {
            ++field9506;
            boolean var3 = class54.field616.method1687(arg1.field8004, arg1.field7996, -18458, arg1.field7978 ? class693.field10418.field10329 : null, arg1.field7931, arg0, arg1.field7969, -16777216 | arg1.field7987) == null;
            if (var3) {
               class645.field9385.method4060(23, new class310(arg1.field7969, arg1.field7931, arg1.field8004, -16777216 | arg1.field7987, arg1.field7996, arg1.field7978));
               class140.method1188(arg1, (byte)-122);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9514[5] + (arg0 != null ? field9514[4] : field9514[3]) + ',' + (arg1 != null ? field9514[4] : field9514[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "b",
      descriptor = "(III)Z",
      line = 87
   )
   public static final boolean method4706(int arg0, int arg1, int arg2) {
      try {
         ++field9508;
         if (arg2 != 2497) {
            method4705((class66)null, (class544)null, (byte)77);
         }

         return class499.method3726(arg1, -1, arg0) & class545.method4042(arg1, -32050, arg0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9514[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "<init>",
      descriptor = "(II)V",
      line = 105
   )
   public class653(int arg0, int arg1) {
      try {
         this.field9509 = arg0;
         this.field9511 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9514[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(I)Lad;",
      line = 118
   )
   public static final class446 method4707(int arg0) {
      try {
         ++field9505;
         if (class329.field4676 != null && class126.field1522 != null) {
            class126.field1522.method1195(class329.field4676, (byte)36);
            if (arg0 >= -26) {
               return null;
            } else {
               class446 var1 = (class446)class126.field1522.method1194(108);
               if (var1 == null) {
                  return null;
               } else {
                  class426 var2 = class329.field4666.method3293(27767, var1.field6786);
                  return var2 != null && var2.field6508 && var2.method3244(13923, class329.field4668) ? var1 : class120.method1004(7190);
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9514[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
