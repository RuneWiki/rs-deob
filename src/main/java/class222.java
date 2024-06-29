import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class222 {
   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2771 = new String[]{method1695(method1694("m#\u001e5\u0018")), method1695(method1694("m#\u001e4\u0018")), method1695(method1694("m#\u001e2\u0018"))};
   @OriginalMember(
      owner = "client!su",
      name = "d",
      descriptor = "I"
   )
   public static int field2766;
   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "I"
   )
   public static int field2767;
   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "I"
   )
   public static int field2769;
   @OriginalMember(
      owner = "client!su",
      name = "e",
      descriptor = "I"
   )
   public static int field2770;
   @OriginalMember(
      owner = "client!su",
      name = "c",
      descriptor = "Lgca;"
   )
   public static class263 field2768;

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1690(int arg0, int arg1, int arg2) {
      try {
         ++field2770;
         int var3 = -65 % ((5 - arg0) / 48);
         return (arg2 & 24) != 0 | (544 & arg2) == 544;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2771[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(IIILbs;Lbs;)V"
   )
   public static final void method1691(int arg0, int arg1, int arg2, class718 arg3, class718 arg4) {
      class225 var5 = class12.method96(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field2831 = arg3;
         var5.field2830 = arg4;
         int var6 = class93.field1241 == class73.field900 ? 1 : 0;
         if (arg3.method780(96)) {
            if (arg3.method775(0)) {
               arg3.field1004 = class735.field10736[var6];
               class735.field10736[var6] = arg3;
            } else {
               arg3.field1004 = class8.field111[var6];
               class8.field111[var6] = arg3;
               class591.field8180 = true;
            }
         } else {
            arg3.field1004 = class234.field2900[var6];
            class234.field2900[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method780(124)) {
               if (arg4.method775(0)) {
                  arg4.field1004 = class735.field10736[var6];
                  class735.field10736[var6] = arg4;
                  return;
               }

               arg4.field1004 = class8.field111[var6];
               class8.field111[var6] = arg4;
               class591.field8180 = true;
               return;
            }

            arg4.field1004 = class234.field2900[var6];
            class234.field2900[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1692(int arg0) {
      try {
         field2768 = null;
         int var1 = 36 % ((25 - arg0) / 56);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2771[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4273;

      try {
         ++field2766;
         class418.method3161(arg2, (byte)48);
         int var8 = 0;
         int var9 = arg2 - arg5;
         if (var9 < 0) {
            var9 = 0;
         }

         int var10 = arg2;
         int var11 = -arg2;
         int var12 = var9;
         if (arg3 != 2) {
            field2768 = null;
         }

         int var13 = -var9;
         byte var14 = -1;
         if (~arg4 <= ~class478.field6604 && class313.field4171 >= arg4) {
            int[] var15 = class17.field236[arg4];
            int var16 = class138.method1159(-arg2 + arg1, class663.field9442, (byte)-44, class265.field3451);
            int var17 = class138.method1159(arg1 + arg2, class663.field9442, (byte)-44, class265.field3451);
            int var18 = class138.method1159(-var9 + arg1, class663.field9442, (byte)-44, class265.field3451);
            int var19 = class138.method1159(arg1 + var9, class663.field9442, (byte)-44, class265.field3451);
            class125.method1046(arg3 + -23357, var18, var15, arg0, var16);
            class125.method1046(-23355, var19, var15, arg6, var18);
            class125.method1046(arg3 ^ -23353, var17, var15, arg0, var19);
         }

         byte var20 = -1;
         int var45;
         int var46;
         if (var7) {
            var46 = var20 + 2;
            var45 = var14 + 2;
            var13 += var46;
            var11 += var45;
            if (~var13 <= -1 && var9 >= 1) {
               var12 = var9 - 1;
               class202.field2481[var12] = var8;
               var13 -= var12 << 1;
            }
         } else {
            if (arg2 <= var8) {
               return;
            }

            var46 = var20 + 2;
            var45 = var14 + 2;
            var13 += var46;
            var11 += var45;
            if (~var13 <= -1 && var9 >= 1) {
               var12 = var9 - 1;
               class202.field2481[var12] = var8;
               var13 -= var12 << 1;
            }
         }

         while(true) {
            while(true) {
               ++var8;
               if (var11 >= 0) {
                  --var10;
                  var11 -= var10 << 1;
                  int var21 = arg4 - var10;
                  int var22 = arg4 + var10;
                  if (~class478.field6604 >= ~var22 && ~class313.field4171 <= ~var21) {
                     label180: {
                        if (~var9 >= ~var10) {
                           int var23 = class138.method1159(arg1 - -var8, class663.field9442, (byte)-44, class265.field3451);
                           int var24 = class138.method1159(-var8 + arg1, class663.field9442, (byte)-44, class265.field3451);
                           if (~class313.field4171 <= ~var22) {
                              class125.method1046(-23355, var23, class17.field236[var22], arg0, var24);
                           }

                           if (var21 < class478.field6604) {
                              break label180;
                           }

                           class125.method1046(-23355, var23, class17.field236[var21], arg0, var24);
                           if (!var7) {
                              break label180;
                           }
                        }

                        int var25 = class202.field2481[var10];
                        int var26 = class138.method1159(arg1 - -var8, class663.field9442, (byte)-44, class265.field3451);
                        int var27 = class138.method1159(arg1 - var8, class663.field9442, (byte)-44, class265.field3451);
                        int var28 = class138.method1159(arg1 + var25, class663.field9442, (byte)-44, class265.field3451);
                        int var29 = class138.method1159(-var25 + arg1, class663.field9442, (byte)-44, class265.field3451);
                        if (var22 <= class313.field4171) {
                           int[] var30 = class17.field236[var22];
                           class125.method1046(-23355, var29, var30, arg0, var27);
                           class125.method1046(arg3 + -23357, var28, var30, arg6, var29);
                           class125.method1046(-23355, var26, var30, arg0, var28);
                        }

                        if (~class478.field6604 >= ~var21) {
                           int[] var31 = class17.field236[var21];
                           class125.method1046(-23355, var29, var31, arg0, var27);
                           class125.method1046(-23355, var28, var31, arg6, var29);
                           class125.method1046(-23355, var26, var31, arg0, var28);
                        }
                     }
                  }
               }

               int var32 = arg4 - var8;
               int var33 = arg4 + var8;
               if (~var33 <= ~class478.field6604) {
                  int var10001 = class313.field4171;
                  if (var7) {
                     if (var32 <= var10001 && var12 >= 1) {
                        --var12;
                        class202.field2481[var12] = var8;
                        var13 -= var12 << 1;
                     }
                     continue;
                  }

                  if (var32 <= var10001) {
                     int var34 = arg1 + var10;
                     int var35 = -var10 + arg1;
                     if (~var34 <= ~class265.field3451 && var35 <= class663.field9442) {
                        int var36 = class138.method1159(var34, class663.field9442, (byte)-44, class265.field3451);
                        int var37 = class138.method1159(var35, class663.field9442, (byte)-44, class265.field3451);
                        int var38;
                        int var39;
                        int var40;
                        int[] var41;
                        int[] var42;
                        if (var8 >= var9) {
                           if (~var33 >= ~class313.field4171) {
                              class125.method1046(-23355, var36, class17.field236[var33], arg0, var37);
                           }

                           if (~class478.field6604 >= ~var32) {
                              class125.method1046(-23355, var36, class17.field236[var32], arg0, var37);
                              if (var7) {
                                 var38 = var12 < var8 ? class202.field2481[var8] : var12;
                                 var39 = class138.method1159(arg1 + var38, class663.field9442, (byte)-44, class265.field3451);
                                 var40 = class138.method1159(-var38 + arg1, class663.field9442, (byte)-44, class265.field3451);
                                 if (var33 <= class313.field4171) {
                                    var41 = class17.field236[var33];
                                    class125.method1046(-23355, var40, var41, arg0, var37);
                                    class125.method1046(-23355, var39, var41, arg6, var40);
                                    class125.method1046(-23355, var36, var41, arg0, var39);
                                 }

                                 if (class478.field6604 <= var32) {
                                    var42 = class17.field236[var32];
                                    class125.method1046(-23355, var40, var42, arg0, var37);
                                    class125.method1046(arg3 ^ -23353, var39, var42, arg6, var40);
                                    class125.method1046(-23355, var36, var42, arg0, var39);
                                 }
                              }
                           }
                        } else {
                           var38 = var12 < var8 ? class202.field2481[var8] : var12;
                           var39 = class138.method1159(arg1 + var38, class663.field9442, (byte)-44, class265.field3451);
                           var40 = class138.method1159(-var38 + arg1, class663.field9442, (byte)-44, class265.field3451);
                           if (var33 <= class313.field4171) {
                              var41 = class17.field236[var33];
                              class125.method1046(-23355, var40, var41, arg0, var37);
                              class125.method1046(-23355, var39, var41, arg6, var40);
                              class125.method1046(-23355, var36, var41, arg0, var39);
                           }

                           if (class478.field6604 <= var32) {
                              var42 = class17.field236[var32];
                              class125.method1046(-23355, var40, var42, arg0, var37);
                              class125.method1046(arg3 ^ -23353, var39, var42, arg6, var40);
                              class125.method1046(-23355, var36, var42, arg0, var39);
                           }
                        }
                     }
                  }
               }

               if (var10 <= var8) {
                  return;
               }

               var46 += 2;
               var45 += 2;
               var13 += var46;
               var11 += var45;
               if (~var13 <= -1 && var12 >= 1) {
                  --var12;
                  class202.field2481[var12] = var8;
                  var13 -= var12 << 1;
               }
            }
         }
      } catch (RuntimeException var44) {
         throw class534.method3846(var44, field2771[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1694(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1695(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
