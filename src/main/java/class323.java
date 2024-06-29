import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class323 {
   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4428 = new String[]{method2540(method2539("\u0011-[TM")), method2540(method2539("\u0011-[VM")), method2540(method2539("\u0011-[WM")), method2540(method2539("\u001e5\u0019~")), method2540(method2539("\u000bn[<\u0018")), method2540(method2539("\u0011-[UM"))};
   @OriginalMember(
      owner = "client!am",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4425 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   @OriginalMember(
      owner = "client!am",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field4420 = true;
   @OriginalMember(
      owner = "client!am",
      name = "g",
      descriptor = "I"
   )
   public static int field4426 = 2;
   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "[[I"
   )
   public static int[][] field4427 = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   @OriginalMember(
      owner = "client!am",
      name = "j",
      descriptor = "I"
   )
   public static int field4418;
   @OriginalMember(
      owner = "client!am",
      name = "c",
      descriptor = "I"
   )
   public static int field4421;
   @OriginalMember(
      owner = "client!am",
      name = "h",
      descriptor = "I"
   )
   public static int field4423;
   @OriginalMember(
      owner = "client!am",
      name = "f",
      descriptor = "I"
   )
   public static int field4424;
   @OriginalMember(
      owner = "client!am",
      name = "e",
      descriptor = "Lww;"
   )
   public static class339 field4419;
   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "Lww;"
   )
   public static class339 field4422;

   @OriginalMember(
      owner = "client!am",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method2531(int arg0);

   @OriginalMember(
      owner = "client!am",
      name = "c",
      descriptor = "(I)Ldk;"
   )
   public abstract class715 method2532(int arg0);

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2533(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         label32: {
            if (class774.field11272 == 1) {
               class437.method3375(class94.field1273, arg1, 1, arg2);
               if (!var3) {
                  break label32;
               }
            }

            if (class774.field11272 == 2) {
               label27: {
                  if (class28.field416) {
                     class500.method3788(arg0 ^ 23327, class356.method2825(0) + arg2, class465.method3538(-26506) + arg1);
                     if (!var3) {
                        break label27;
                     }
                  }

                  class500.method3788(56, arg2, arg1);
               }
            }
         }

         ++field4418;
         class774.field11272 = 0;
         class94.field1273 = null;
         if (arg0 != 23324) {
            field4420 = false;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4428[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2534(int arg0) {
      try {
         field4422 = null;
         field4427 = null;
         field4425 = null;
         if (arg0 != -12007) {
            field4425 = null;
         }

         field4419 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4428[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method2535(byte arg0, String arg1) {
      try {
         ++field4421;
         if (class427.field5811 != null) {
            ++class764.field11183;
            class594 var2 = class145.method1177((byte)98);
            class702 var3 = class19.method142(var2.field8765, class193.field2442, (byte)-89);
            var3.field10264.method593(class398.method3129(12, arg1), 867770704);
            var3.field10264.method595(-15010, arg1);
            if (arg0 >= 81) {
               var2.method4423(var3, (byte)125);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4428[5] + arg0 + ',' + (arg1 != null ? field4428[4] : field4428[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method2536(int arg0);

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         ++field4424;
         int var9 = arg4 + arg5;
         int var10 = -arg5 + arg0;
         if (arg3 == -6279) {
            int var11 = arg4;
            if (var8) {
               class385.method3045(arg2, arg6, class237.field3001[arg4], arg7, (byte)-92);
               var11 = arg4 + 1;
            }

            while(true) {
               while(~var11 > ~var9) {
                  class385.method3045(arg2, arg6, class237.field3001[var11], arg7, (byte)-92);
                  ++var11;
               }

               int var12 = arg0;
               if (!var8) {
                  if (var8) {
                     class385.method3045(arg2, arg6, class237.field3001[arg0], arg7, (byte)-116);
                     var12 = arg0 - 1;
                  }

                  while(true) {
                     while(var12 > var10) {
                        class385.method3045(arg2, arg6, class237.field3001[var12], arg7, (byte)-116);
                        --var12;
                     }

                     int var13 = arg5 + arg7;
                     int var14 = -arg5 + arg6;
                     int var15 = var9;
                     if (!var8) {
                        if (!var8 && ~var9 < ~var10) {
                           return;
                        }

                        do {
                           int[] var16 = class237.field3001[var15];
                           class385.method3045(arg2, var13, var16, arg7, (byte)-123);
                           class385.method3045(arg1, var14, var16, var13, (byte)-127);
                           class385.method3045(arg2, arg6, var16, var14, (byte)-76);
                           ++var15;
                        } while(~var15 >= ~var10);

                        return;
                     }

                     --var12;
                  }
               }

               ++var11;
            }
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field4428[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(ZI)Z"
   )
   public abstract boolean method2538(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2539(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2540(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
