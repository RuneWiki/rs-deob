import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class264 {
   @OriginalMember(
      owner = "client!ro",
      name = "Q",
      descriptor = "I"
   )
   private int field4 = 4;
   @OriginalMember(
      owner = "client!ro",
      name = "G",
      descriptor = "I"
   )
   private int field11 = 4;
   @OriginalMember(
      owner = "client!ro",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field12 = new String[]{method9(method8("b]^\u001d")), method9(method8("~G\u001c0;")), method9(method8("w\u0006\u001c_n")), method9(method8("~G\u001c2;")), method9(method8("~G\u001c5;")), method9(method8("~G\u001c3;")), method9(method8("~G\u001c6;"))};
   @OriginalMember(
      owner = "client!ro",
      name = "N",
      descriptor = "Ler;"
   )
   public static class117 field1 = null;
   @OriginalMember(
      owner = "client!ro",
      name = "L",
      descriptor = "I"
   )
   public static int field9 = 2;
   @OriginalMember(
      owner = "client!ro",
      name = "P",
      descriptor = "I"
   )
   public static int field10 = 0;
   @OriginalMember(
      owner = "client!ro",
      name = "R",
      descriptor = "I"
   )
   public static int field2;
   @OriginalMember(
      owner = "client!ro",
      name = "I",
      descriptor = "I"
   )
   public static int field3;
   @OriginalMember(
      owner = "client!ro",
      name = "K",
      descriptor = "I"
   )
   public static int field6;
   @OriginalMember(
      owner = "client!ro",
      name = "O",
      descriptor = "I"
   )
   public static int field7;
   @OriginalMember(
      owner = "client!ro",
      name = "M",
      descriptor = "I"
   )
   public static int field8;
   @OriginalMember(
      owner = "client!ro",
      name = "H",
      descriptor = "Lha;"
   )
   public static class66 field5;

   @OriginalMember(
      owner = "client!ro",
      name = "<init>",
      descriptor = "()V",
      line = 4
   )
   public class2() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 8
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label37: {
            label36: {
               ++field3;
               if (~arg0 != -1) {
                  if (~arg0 != -2) {
                     break label37;
                  }

                  if (!var4) {
                     break label36;
                  }
               }

               this.field4 = arg1.method1143(-15465);
               if (!var4) {
                  break label37;
               }
            }

            this.field11 = arg1.method1143(-15465);
         }

         if (arg2 <= 49) {
            this.field11 = -127;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field12[1] + arg0 + ',' + (arg1 != null ? field12[2] : field12[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(IB)[[I",
      line = 45
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828) {
            int var5;
            int[][] var8;
            label42: {
               var5 = class430.field6152 / this.field4;
               int var6 = class20.field234 / this.field11;
               if (var6 > 0) {
                  int var7 = arg0 % var6;
                  var8 = this.method2015(0, (byte)76, class20.field234 * var7 / var6);
                  if (!var3) {
                     break label42;
                  }
               }

               var8 = this.method2015(0, (byte)76, 0);
            }

            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            int var15 = 0;
            if (var3 || ~var15 > ~class430.field6152) {
               do {
                  int var17;
                  if (var5 > 0) {
                     int var16 = var15 % var5;
                     var17 = class430.field6152 * var16 / var5;
                     if (var3) {
                        var17 = 0;
                     }
                  } else {
                     var17 = 0;
                  }

                  var12[var15] = var9[var17];
                  var13[var15] = var10[var17];
                  var14[var15] = var11[var17];
                  ++var15;
               } while(~var15 > ~class430.field6152);
            }
         }

         if (arg1 > -117) {
            field1 = null;
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field12[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "d",
      descriptor = "(I)V",
      line = 114
   )
   public static void method5(int arg0) {
      try {
         field5 = null;
         field1 = null;
         if (arg0 != 0) {
            method7(-24, -81);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field12[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "a",
      descriptor = "(II)[I",
      line = 130
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field2;
         int var4 = 14 / ((24 - arg1) / 44);
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6;
            int[] var9;
            label40: {
               var6 = class430.field6152 / this.field4;
               int var7 = class20.field234 / this.field11;
               if (var7 > 0) {
                  int var8 = arg0 % var7;
                  var9 = this.method2019(0, -27804, class20.field234 * var8 / var7);
                  if (!var3) {
                     break label40;
                  }
               }

               var9 = this.method2019(0, -27804, 0);
            }

            int var10 = 0;
            if (var3 || class430.field6152 > var10) {
               do {
                  if (var6 <= 0) {
                     var5[var10] = var9[0];
                     if (!var3) {
                        ++var10;
                        continue;
                     }
                  }

                  int var11 = var10 % var6;
                  var5[var10] = var9[class430.field6152 * var11 / var6];
                  ++var10;
               } while(class430.field6152 > var10);
            }
         }

         return var5;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field12[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "b",
      descriptor = "(II)Z",
      line = 189
   )
   public static final boolean method7(int arg0, int arg1) {
      try {
         ++field7;
         if (arg1 != 27382) {
            method7(103, 85);
         }

         return arg0 == 3 || arg0 == 7 || ~arg0 == -10 || ~arg0 == -12;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field12[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method8(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ro",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method9(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
