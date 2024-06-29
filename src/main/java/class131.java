import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class131 extends class264 {
   @OriginalMember(
      owner = "client!co",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1679 = new String[]{method1041(method1040("m/J3J")), method1041(method1040("`5\b\u001e")), method1041(method1040("unJ\\\u001f")), method1041(method1040("m/J6J")), method1041(method1040("m/J5J")), method1041(method1040("m/J7J")), method1041(method1040("m/J0J")), method1041(method1040("m/J1J"))};
   @OriginalMember(
      owner = "client!co",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field1672 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   @OriginalMember(
      owner = "client!co",
      name = "F",
      descriptor = "Lqd;"
   )
   public static class475 field1667 = new class475("", 19);
   @OriginalMember(
      owner = "client!co",
      name = "P",
      descriptor = "Llg;"
   )
   public static class437 field1676 = new class437();
   @OriginalMember(
      owner = "client!co",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field1677 = false;
   @OriginalMember(
      owner = "client!co",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field1678 = new int[3];
   @OriginalMember(
      owner = "client!co",
      name = "O",
      descriptor = "I"
   )
   public static int field1668;
   @OriginalMember(
      owner = "client!co",
      name = "Q",
      descriptor = "I"
   )
   public static int field1670;
   @OriginalMember(
      owner = "client!co",
      name = "L",
      descriptor = "I"
   )
   public static int field1671;
   @OriginalMember(
      owner = "client!co",
      name = "I",
      descriptor = "I"
   )
   public static int field1673;
   @OriginalMember(
      owner = "client!co",
      name = "M",
      descriptor = "I"
   )
   public static int field1674;
   @OriginalMember(
      owner = "client!co",
      name = "G",
      descriptor = "I"
   )
   public static int field1675;
   @OriginalMember(
      owner = "client!co",
      name = "H",
      descriptor = "[Lqg;"
   )
   private class490[] field1669;

   @OriginalMember(
      owner = "client!co",
      name = "<init>",
      descriptor = "()V"
   )
   public class131() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1671;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828) {
            int var5 = class430.field6152;
            int var6 = class20.field234;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field3634.method4364(111);
            this.method1039(var7, -64);
            int var9 = 0;
            if (var3 || ~var9 > ~class20.field234) {
               do {
                  int[] var10 = var7[var9];
                  int[][] var11 = var8[var9];
                  int[] var12 = var11[0];
                  int[] var13 = var11[1];
                  int[] var14 = var11[2];
                  int var15 = 0;
                  if (var3 || var15 < class430.field6152) {
                     do {
                        int var16 = var10[var15];
                        var14[var15] = class556.method3988(255, var16) << 4;
                        var13[var15] = class556.method3988(4080, var16 >> 4);
                        var12[var15] = class556.method3988(var16 >> 12, 4080);
                        ++var15;
                     } while(var15 < class430.field6152);
                  }

                  ++var9;
               } while(~var9 > ~class20.field234);
            }
         }

         return arg1 > -117 ? null : var4;
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field1679[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field1674;
         if (arg2 >= 49) {
            if (~arg0 != -1) {
               if (arg0 == 1) {
                  super.field3637 = ~arg1.method1143(-15465) == -2;
                  return;
               }
            } else {
               this.field1669 = new class490[arg1.method1143(-15465)];
               int var5 = 0;
               if (var4 || this.field1669.length > var5) {
                  do {
                     label92: {
                        int var6 = arg1.method1143(-15465);
                        if (~var6 != -1) {
                           if (var6 == 1) {
                              break label92;
                           }

                           if (~var6 == -3) {
                              this.field1669[var5] = class555.method3976((byte)-115, arg1);
                              if (var4) {
                                 this.field1669[var5] = class397.method3002(arg1, -58);
                                 ++var5;
                              } else {
                                 ++var5;
                              }
                              continue;
                           }

                           if (~var6 != -4) {
                              ++var5;
                              continue;
                           }

                           if (!var4) {
                              this.field1669[var5] = class397.method3002(arg1, -58);
                              ++var5;
                              continue;
                           }
                        }

                        this.field1669[var5] = class710.method5165((byte)95, arg1);
                        if (!var4) {
                           ++var5;
                           continue;
                        }
                     }

                     this.field1669[var5] = class663.method4842((byte)-70, arg1);
                     if (var4) {
                        this.field1669[var5] = class555.method3976((byte)-115, arg1);
                        if (var4) {
                           this.field1669[var5] = class397.method3002(arg1, -58);
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        ++var5;
                     }
                  } while(this.field1669.length > var5);
               }
            }

         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1679[0] + arg0 + ',' + (arg1 != null ? field1679[2] : field1679[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1037(int arg0) {
      try {
         field1676 = null;
         field1667 = null;
         field1672 = null;
         if (arg0 == 1) {
            field1678 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1679[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      try {
         ++field1673;
         int var3 = -125 / ((24 - arg1) / 44);
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            this.method1039(super.field3641.method3078(false), -27);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1679[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "(Ljava/lang/String;BIZLjava/lang/String;)V"
   )
   public static final void method1038(String arg0, byte arg1, int arg2, boolean arg3, String arg4) {
      try {
         ++field1668;
         class447 var5 = class319.method2367((byte)50);
         var5.field6359.method1186(class555.field7960.field4260, 0);
         var5.field6359.method1185(0, true);
         int var6 = var5.field6359.field1856;
         var5.field6359.method1185(655, true);
         int[] var7 = class613.method4458(var5, 17876);
         int var8 = var5.field6359.field1856;
         var5.field6359.method1195((byte)55, arg0);
         var5.field6359.method1185(class564.field8049, true);
         var5.field6359.method1195((byte)41, arg4);
         var5.field6359.method1169(11065, class428.field6133);
         var5.field6359.method1186(class608.field8920, 0);
         var5.field6359.method1186(class134.field1715.field10710, 0);
         class550.method3942(0, var5.field6359);
         String var9 = class58.field715;
         var5.field6359.method1186(var9 != null ? 1 : 0, 0);
         if (var9 != null) {
            var5.field6359.method1195((byte)55, var9);
         }

         var5.field6359.method1186(arg2, 0);
         var5.field6359.method1186(arg3 ? 1 : 0, 0);
         var5.field6359.field1856 += 7;
         var5.field6359.method1158(var5.field6359.field1856, var7, -126, var8);
         var5.field6359.method1161(-639922104, -var6 + var5.field6359.field1856);
         class430.field6143.method55(13256, var5);
         class596.field8763 = -3;
         int var10 = 122 / ((arg1 - -1) / 40);
         class80.field1040 = 0;
         class444.field6324 = 1;
         class167.field2343 = 0;
         if (~arg2 > -14) {
            class247.field3408 = true;
            class377.method2857(-90);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1679[7] + (arg0 != null ? field1679[2] : field1679[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1679[2] : field1679[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "a",
      descriptor = "([[II)V"
   )
   private final void method1039(int[][] arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1675;
         int var4 = class430.field6152;
         int var5 = -101 % ((arg1 - 39) / 54);
         int var6 = class20.field234;
         class550.method3943((byte)-23, arg0);
         class157.method1317(class220.field3144, 0, 0, 0, class78.field967);
         if (this.field1669 != null) {
            int var7 = 0;
            if (var3 || var7 < this.field1669.length) {
               do {
                  class490 var8 = this.field1669[var7];
                  int var9 = var8.field7015;
                  int var10 = var8.field7012;
                  if (var9 >= 0) {
                     if (var10 >= 0) {
                        var8.method1644((byte)117, var4, var6);
                        if (!var3) {
                           ++var7;
                           continue;
                        }
                     }

                     var8.method1646(30078, var4, var6);
                     if (var3) {
                        if (~var10 <= -1) {
                           var8.method1645(var6, var4, 118);
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }
                  } else {
                     if (~var10 <= -1) {
                        var8.method1645(var6, var4, 118);
                     }

                     ++var7;
                  }
               } while(var7 < this.field1669.length);

            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1679[5] + (arg0 != null ? field1679[2] : field1679[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1040(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1041(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
