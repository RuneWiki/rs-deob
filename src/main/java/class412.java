import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class412 {
   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "I"
   )
   public int field5947;
   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5953 = new String[]{method3095(method3094("\"6&o\u007fa")), method3095(method3094("\"6&oH&\u000133U'5o")), method3095(method3094("\"6&oxa")), method3095(method3094("2|ioA")), method3095(method3094("''+-")), method3095(method3094("\"6&o\u0000 <.5\u0002a")), method3095(method3094("\"6&o~a")), method3095(method3094("\"6&o}a"))};
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field5948 = new int[3];
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5951 = new String[]{method3095(method3094("\u001a')")), method3095(method3094("\u0004=)")), method3095(method3094("\u001d'\"")), method3095(method3094("\u001e7#")), method3095(method3094("\u001d:2")), method3095(method3094("\u000f .")), method3095(method3094("\u001a33"))};
   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "I"
   )
   public static int field5946;
   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "I"
   )
   public static int field5949;
   @OriginalMember(
      owner = "client!kda",
      name = "e",
      descriptor = "I"
   )
   public static int field5950;
   @OriginalMember(
      owner = "client!kda",
      name = "c",
      descriptor = "I"
   )
   public static int field5952;

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(Z)I",
      line = 4
   )
   public static final int method3090(boolean arg0) {
      try {
         ++field5950;
         if ((double)class650.field9497 == 3.0D) {
            return 37;
         } else if ((double)class650.field9497 == 4.0D) {
            return 50;
         } else if ((double)class650.field9497 == 6.0D) {
            return 75;
         } else if (!arg0) {
            return 118;
         } else {
            return (double)class650.field9497 == 8.0D ? 100 : 200;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5953[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I)V",
      line = 28
   )
   public static void method3091(int arg0) {
      try {
         field5948 = null;
         if (arg0 <= -121) {
            field5951 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5953[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(IILwf;)V",
      line = 42
   )
   public static final void method3092(int arg0, int arg1, class147 arg2) {
      try {
         ++field5952;
         if (arg1 != 75) {
            method3092(27, 124, (class147)null);
         }

         if (class75.field918 != null) {
            try {
               class75.field918.method1686(true, 0L);
               class75.field918.method1685(24, arg2.field1889, (byte)49, arg0);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5953[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5953[3] : field5953[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      line = 69
   )
   public class412(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field5947 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5953[5] + (arg0 != null ? field5953[3] : field5953[4]) + ',' + (arg1 != null ? field5953[3] : field5953[4]) + ',' + (arg2 != null ? field5953[3] : field5953[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 89
   )
   public final String toString() {
      try {
         ++field5946;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5953[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(IIIILha;Z)V",
      line = 97
   )
   public static final void method3093(int arg0, int arg1, int arg2, int arg3, class66 arg4, boolean arg5) {
      boolean var6 = client.field4360;

      try {
         arg4.method592(arg2, arg0, arg2 - -arg3, arg0 + arg1);
         ++field5949;
         arg4.method533(-16777216, arg2, arg0, arg3, (byte)110, arg1);
         if (class116.field1452 >= 100) {
            int var8;
            int var9;
            label91: {
               float var7 = (float)class650.field9503 / (float)class650.field9524;
               var8 = arg3;
               var9 = arg1;
               if (!(var7 < 1.0F)) {
                  var8 = (int)((float)arg1 / var7);
                  if (!var6) {
                     break label91;
                  }
               }

               var9 = (int)((float)arg3 * var7);
            }

            int var25 = (-var8 + arg3) / 2 + arg2;
            int var24 = (-var9 + arg1) / 2 + arg0;
            if (class792.field11612 == null || arg3 != class792.field11612.method958() || class792.field11612.method963() != arg1) {
               class650.method4747(class650.field9513, class650.field9523 + class650.field9503, class650.field9524 + class650.field9513, class650.field9523, var25, var24, var25 + var8, var24 + var9);
               class650.method4746(arg4);
               class792.field11612 = arg4.method552(var25, var24, var8, var9, false);
            }

            class792.field11612.method3575(var25, var24);
            int var10 = class308.field4211 * var8 / class650.field9524;
            int var11 = class415.field5977 * var9 / class650.field9503;
            int var12 = var25 - -(class783.field11474 * var8 / class650.field9524);
            int var13 = var24 + var9 - (class163.field2312 * var9 / class650.field9503 - -var11);
            int var14 = -1996554240;
            if (class152.field2126 == class134.field1715) {
               var14 = -1996488705;
            }

            if (arg5) {
               field5948 = null;
            }

            arg4.method496(var12, var13, var10, var11, var14, 1);
            arg4.method608(var12, var13, var10, var11, var14, 0);
            if (~class592.field8717 < -1) {
               int var15;
               label58: {
                  if (~class697.field10218 >= -51) {
                     var15 = class697.field10218 * 5;
                     if (!var6) {
                        break label58;
                     }
                  }

                  var15 = 500 - class697.field10218 * 5;
               }

               class357 var16 = (class357)class650.field9493.method2933(2);
               if (var6 || var16 != null) {
                  do {
                     class326 var17 = class650.field9488.method5666(var16.field4793, false);
                     if (class218.method1718(var17, 131)) {
                        label101: {
                           if (class612.field8977 == var16.field4793) {
                              int var18 = var16.field4795 * var8 / class650.field9524 + var25;
                              int var19 = (-var16.field4801 + class650.field9503) * var9 / class650.field9503 + var24;
                              arg4.method533(var15 << 24 | 16776960, var18 + -2, var19 + -2, 4, (byte)32, 4);
                              if (!var6) {
                                 break label101;
                              }
                           }

                           if (class504.field7317 != -1 && ~class504.field7317 == ~var17.field4447) {
                              int var20 = var16.field4795 * var8 / class650.field9524 + var25;
                              int var21 = (-var16.field4801 + class650.field9503) * var9 / class650.field9503 + var24;
                              arg4.method533(var15 << 24 | 16776960, var20 + -2, var21 + -2, 4, (byte)87, 4);
                           }
                        }
                     }

                     var16 = (class357)class650.field9493.method2940(false);
                  } while(var16 != null);

               }
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field5953[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5953[3] : field5953[4]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
