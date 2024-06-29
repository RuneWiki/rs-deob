import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class127 {
   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1638 = new String[]{method1093(method1092("\n\f:'l")), method1093(method1092("\n\f:\"l")), method1093(method1092("\n\f:&l")), method1093(method1092("\n\f:!l")), method1093(method1092("\n\f: l"))};
   @OriginalMember(
      owner = "client!ht",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field1636 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "I"
   )
   public static int field1632;
   @OriginalMember(
      owner = "client!ht",
      name = "f",
      descriptor = "I"
   )
   public static int field1633;
   @OriginalMember(
      owner = "client!ht",
      name = "b",
      descriptor = "I"
   )
   public static int field1634;
   @OriginalMember(
      owner = "client!ht",
      name = "e",
      descriptor = "I"
   )
   public static int field1635;
   @OriginalMember(
      owner = "client!ht",
      name = "c",
      descriptor = "[Lnl;"
   )
   public static class713[] field1637;

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1087(int arg0, int arg1) {
      try {
         class364.field5052 = arg1;
         if (arg0 == 2) {
            ++field1632;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1638[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1088(int arg0) {
      try {
         int var1 = 9 % ((arg0 - 5) / 41);
         field1636 = null;
         field1637 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1638[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method1089(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field1635;
         class487 var5 = class2.method12((long)arg4, 10, (byte)43);
         var5.method3694(-21792);
         int var6 = -81 / ((arg2 - 20) / 42);
         var5.field6794 = arg0;
         var5.field6797 = arg3;
         var5.field6791 = arg1;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1638[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1090(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field1633;
         if (class535.field7840 == null) {
            class535.field7840 = new int[65536];
            if (!var1) {
               double var2 = 0.7D + -0.015D + 0.03D * Math.random();
               int var4 = 0;
               if (arg0 != 3) {
                  method1088(-128);
                  if (!var1 && var4 >= 65536) {
                     return;
                  }
               } else if (var4 >= 65536) {
                  return;
               }

               do {
                  double var5 = (double)(var4 >> 10 & 63) / 64.0D + 0.0078125D;
                  double var7 = (double)(7 & var4 >> 7) / 8.0D + 0.0625D;
                  double var9 = (double)(127 & var4) / 128.0D;
                  double var11 = var9;
                  double var13 = var9;
                  double var15 = var9;
                  if (var7 != 0.0D) {
                     label133: {
                        double var17;
                        label116: {
                           if (var9 < 0.5D) {
                              var17 = (var7 + 1.0D) * var9;
                              if (!var1) {
                                 break label116;
                              }
                           }

                           var17 = var7 + var9 - var7 * var9;
                        }

                        double var19 = var9 * 2.0D - var17;
                        double var21 = var5 + 0.3333333333333333D;
                        if (var21 > 1.0D) {
                           --var21;
                        }

                        double var25;
                        label110: {
                           var25 = var5 + -0.3333333333333333D;
                           if (!(var5 * 6.0D < 1.0D)) {
                              if (var5 * 2.0D < 1.0D) {
                                 var13 = var17;
                                 if (!var1) {
                                    break label110;
                                 }
                              }

                              if (!(var5 * 3.0D < 2.0D)) {
                                 var13 = var19;
                                 if (!var1) {
                                    break label110;
                                 }
                              }

                              var13 = (-var19 + var17) * (-var5 + 0.6666666666666666D) * 6.0D + var19;
                              if (!var1) {
                                 break label110;
                              }
                           }

                           var13 = (-var19 + var17) * 6.0D * var5 + var19;
                        }

                        if (var25 < 0.0D) {
                           ++var25;
                        }

                        label98: {
                           if (!(var21 * 6.0D < 1.0D)) {
                              if (var21 * 2.0D < 1.0D) {
                                 var11 = var17;
                                 if (!var1) {
                                    break label98;
                                 }
                              }

                              if (!(var21 * 3.0D < 2.0D)) {
                                 var11 = var19;
                                 if (!var1) {
                                    break label98;
                                 }
                              }

                              var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                              if (!var1) {
                                 break label98;
                              }
                           }

                           var11 = (-var19 + var17) * 6.0D * var21 + var19;
                        }

                        if (var25 * 6.0D < 1.0D) {
                           var15 = (var17 - var19) * 6.0D * var25 + var19;
                           if (!var1) {
                              break label133;
                           }
                        }

                        if (!(var25 * 2.0D < 1.0D)) {
                           label82: {
                              if (!(var25 * 3.0D < 2.0D)) {
                                 var15 = var19;
                                 if (!var1) {
                                    break label82;
                                 }
                              }

                              var15 = (-var19 + var17) * (-var25 + 0.6666666666666666D) * 6.0D + var19;
                              if (var1) {
                                 var15 = var17;
                              }
                           }
                        } else {
                           var15 = var17;
                        }
                     }
                  }

                  double var27 = Math.pow(var11, var2);
                  double var29 = Math.pow(var13, var2);
                  double var31 = Math.pow(var15, var2);
                  int var33 = (int)(var27 * 256.0D);
                  int var34 = (int)(var29 * 256.0D);
                  int var35 = (int)(var31 * 256.0D);
                  int var36 = (var33 << 16) + (var34 << 8) - -var35;
                  class535.field7840[var4] = var36;
                  ++var4;
               } while(var4 < 65536);

               return;
            }
         }

      } catch (RuntimeException var38) {
         throw class93.method866(var38, field1638[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method1091(int arg0) {
      try {
         ++field1634;
         return arg0 != -12060 ? -106 : class588.field8671;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1638[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1092(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ht",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1093(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
