import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class92 {
   @OriginalMember(
      owner = "client!rf",
      name = "g",
      descriptor = "I"
   )
   public int field1198;
   @OriginalMember(
      owner = "client!rf",
      name = "d",
      descriptor = "[I"
   )
   public int[] field1200;
   @OriginalMember(
      owner = "client!rf",
      name = "b",
      descriptor = "[I"
   )
   public int[] field1196;
   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1201 = new String[]{method802(method801("\u001a*3/\u0016\u0006%i-W")), method802(method801("\u001a*3WW")), method802(method801("\u0013b3=\u0002")), method802(method801("\u001a*3RW")), method802(method801("\u00069q\u007f")), method802(method801("\u001a*3QW")), method802(method801("\u001a*3PW"))};
   @OriginalMember(
      owner = "client!rf",
      name = "c",
      descriptor = "I"
   )
   public static int field1194;
   @OriginalMember(
      owner = "client!rf",
      name = "e",
      descriptor = "I"
   )
   public static int field1195;
   @OriginalMember(
      owner = "client!rf",
      name = "f",
      descriptor = "I"
   )
   public static int field1197;
   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "I"
   )
   public static int field1199;

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(IZIIIIIIII)V"
   )
   public static final void method797(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4360;

      try {
         ++field1194;
         if (~arg9 <= -513 && arg5 >= 512 && ~arg9 >= ~((class644.field9403 + -2) * 512) && ~((class337.field4594 + -2) * 512) <= ~arg5) {
            if (!arg1) {
               int var11;
               label41: {
                  var11 = class102.method851(arg0, (byte)127, arg9, arg5) + -arg2;
                  if (class681.field10034) {
                     class670.method4882(true, -127);
                     if (!var10) {
                        break label41;
                     }
                  }

                  class89.field1160.method1215(arg3, 0, 0);
                  class383.field5543.method532(class89.field1160);
               }

               label36: {
                  if (class183.field2581) {
                     class383.field5543.method584(arg9, var11, arg5, class298.field4088, class131.field1678);
                     if (!var10) {
                        break label36;
                     }
                  }

                  class383.field5543.method599(arg9, var11, arg5, class131.field1678);
               }

               if (class681.field10034) {
                  class111.method901(64);
               } else {
                  class89.field1160.method1215(-arg3, 0, 0);
                  class383.field5543.method532(class89.field1160);
               }
            }
         } else {
            class131.field1678[0] = class131.field1678[1] = -1;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1201[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(I[FFFIIIIII[FI)V"
   )
   public static final void method798(int arg0, float[] arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10, int arg11) {
      boolean var12 = client.field4360;

      try {
         int var22 = arg4 - arg0;
         int var23 = arg7 - arg11;
         int var24 = arg8 - arg6;
         ++field1199;
         float var13 = arg10[2] * (float)var24 + arg10[0] * (float)var22 + arg10[1] * (float)var23;
         float var14 = arg10[5] * (float)var24 + arg10[3] * (float)var22 + arg10[4] * (float)var23;
         float var15 = arg10[arg9] * (float)var24 + arg10[7] * (float)var23 + arg10[6] * (float)var22;
         float var16 = (float)Math.atan2((double)var13, (double)var15) / 6.2831855F + 0.5F;
         if (arg2 != 1.0F) {
            var16 = arg2 * var16;
         }

         float var17;
         label47: {
            var17 = var14 + 0.5F + arg3;
            if (arg5 == 1) {
               float var18 = var16;
               var16 = -var17;
               var17 = var18;
               if (!var12) {
                  break label47;
               }
            }

            if (arg5 == 2) {
               var17 = -var17;
               var16 = -var16;
               if (!var12) {
                  break label47;
               }
            }

            if (arg5 == 3) {
               float var19 = var16;
               var16 = var17;
               var17 = -var19;
            }
         }

         arg1[0] = var16;
         arg1[1] = var17;
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field1201[3] + arg0 + ',' + (arg1 != null ? field1201[2] : field1201[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field1201[2] : field1201[4]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method799(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != 80) {
            return true;
         } else {
            ++field1195;
            return (1048832 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1201[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(B)Lrd;"
   )
   public static final class357 method800(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1197;
         if (class650.field9493 != null && class189.field2695 != null) {
            class357 var2 = (class357)class189.field2695.method2542((byte)-98);
            if (arg0 != 33) {
               method799((byte)52, 38, -4);
               if (!var1 && var2 == null) {
                  return null;
               }
            } else if (var2 == null) {
               return null;
            }

            do {
               class326 var3 = class650.field9488.method5666(var2.field4793, false);
               if (var3 != null && var3.field4437 && var3.method2418((byte)57, class650.field9489)) {
                  return var2;
               }

               var2 = (class357)class189.field2695.method2542((byte)-102);
            } while(var2 != null);

            return null;
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1201[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class92(int arg0) {
      try {
         this.field1198 = arg0;
         this.field1200 = new int[this.field1198];
         this.field1196 = new int[this.field1198];
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1201[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method801(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method802(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
