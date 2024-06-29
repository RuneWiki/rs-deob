import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class154 extends class70 {
   @OriginalMember(
      owner = "client!lv",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2305 = new String[]{method1399(method1398("Z\u0011?\u0003H")), method1399(method1398("Z\u0011?\fH")), method1399(method1398("MI?h\u001d")), method1399(method1398("X\u0012}*")), method1399(method1398("Z\u0011?\u000eH")), method1399(method1398("Z\u0011?\u0007H")), method1399(method1398("Z\u0011?\u0002H")), method1399(method1398("Z\u0011?\u0005H"))};
   @OriginalMember(
      owner = "client!lv",
      name = "N",
      descriptor = "I"
   )
   public static int field2293 = 765;
   @OriginalMember(
      owner = "client!lv",
      name = "R",
      descriptor = "Llb;"
   )
   public static class246 field2299;
   @OriginalMember(
      owner = "client!lv",
      name = "O",
      descriptor = "Llb;"
   )
   public static class246 field2298 = field2299 = new class246(false);
   @OriginalMember(
      owner = "client!lv",
      name = "G",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field2303 = new Rectangle[100];
   @OriginalMember(
      owner = "client!lv",
      name = "P",
      descriptor = "I"
   )
   public static int field2304 = -50;
   @OriginalMember(
      owner = "client!lv",
      name = "J",
      descriptor = "Lhf;"
   )
   public static class588 field2302 = new class588();
   @OriginalMember(
      owner = "client!lv",
      name = "L",
      descriptor = "I"
   )
   public static int field2294;
   @OriginalMember(
      owner = "client!lv",
      name = "I",
      descriptor = "I"
   )
   public static int field2295;
   @OriginalMember(
      owner = "client!lv",
      name = "K",
      descriptor = "I"
   )
   public static int field2297;
   @OriginalMember(
      owner = "client!lv",
      name = "M",
      descriptor = "I"
   )
   public static int field2300;
   @OriginalMember(
      owner = "client!lv",
      name = "H",
      descriptor = "I"
   )
   public static int field2301;
   @OriginalMember(
      owner = "client!lv",
      name = "Q",
      descriptor = "Llaa;"
   )
   public static class541 field2296;

   @OriginalMember(
      owner = "client!lv",
      name = "c",
      descriptor = "(II)Liba;",
      line = 6
   )
   public static final class343 method1395(int arg0, int arg1) {
      try {
         ++field2301;
         if (arg1 != 1) {
            field2299 = null;
         }

         if (arg0 == 0) {
            if ((double)class60.field751 == 3.0D) {
               return class92.field1322;
            }

            if ((double)class60.field751 == 4.0D) {
               return class391.field6147;
            }

            if ((double)class60.field751 == 6.0D) {
               return class426.field6581;
            }

            if ((double)class60.field751 >= 8.0D) {
               return class722.field10804;
            }
         } else if (arg0 == 1) {
            if ((double)class60.field751 == 3.0D) {
               return class426.field6581;
            }

            if ((double)class60.field751 == 4.0D) {
               return class722.field10804;
            }

            if ((double)class60.field751 == 6.0D) {
               return class175.field2752;
            }

            if ((double)class60.field751 >= 8.0D) {
               return class706.field10632;
            }
         } else if (~arg0 == -3) {
            if ((double)class60.field751 == 3.0D) {
               return class175.field2752;
            }

            if ((double)class60.field751 == 4.0D) {
               return class706.field10632;
            }

            if ((double)class60.field751 == 6.0D) {
               return class68.field901;
            }

            if ((double)class60.field751 >= 8.0D) {
               return class471.field7160;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2305[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(BI)[I",
      line = 73
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2294;
         if (arg0 != 87) {
            field2303 = null;
         }

         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int[] var5 = this.method545(0, arg1, (byte)-99);
            int[] var6 = this.method545(1, arg1, (byte)-106);
            int[] var7 = this.method545(2, arg1, (byte)-43);
            int var8 = 0;
            if (var3 || ~class678.field10127 < ~var8) {
               do {
                  int var9 = var7[var8];
                  if (var9 == 4096) {
                     var4[var8] = var5[var8];
                     if (!var3) {
                        ++var8;
                        continue;
                     }
                  }

                  if (var9 != 0) {
                     var4[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                     if (var3) {
                        var4[var8] = var6[var8];
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var4[var8] = var6[var8];
                     ++var8;
                  }
               } while(~class678.field10127 < ~var8);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2305[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "<init>",
      descriptor = "()V",
      line = 125
   )
   public class154() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!lv",
      name = "b",
      descriptor = "(II)Z",
      line = 134
   )
   public static final boolean method1396(int arg0, int arg1) {
      try {
         ++field2295;
         if (arg0 != -26160) {
            field2298 = null;
         }

         return arg1 == 0 || ~arg1 == -2 || arg1 == 2;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2305[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(II)[[I",
      line = 147
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2300;
         int[][] var4 = super.field918.method3276((byte)111, arg1);
         if (arg0 != 32) {
            this.method8((byte)48, -52);
         }

         if (super.field918.field6361) {
            int[] var5 = this.method545(2, arg1, (byte)-128);
            int[][] var6 = this.method539(true, arg1, 0);
            int[][] var7 = this.method539(true, arg1, 1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            int var17 = 0;
            if (var3 || ~class678.field10127 < ~var17) {
               do {
                  int var18 = var5[var17];
                  if (~var18 == -4097) {
                     var8[var17] = var11[var17];
                     var9[var17] = var12[var17];
                     var10[var17] = var13[var17];
                     if (!var3) {
                        ++var17;
                        continue;
                     }
                  }

                  if (var18 != 0) {
                     int var19 = 4096 - var18;
                     var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                     var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                     var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                     if (var3) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                        ++var17;
                     } else {
                        ++var17;
                     }
                  } else {
                     var8[var17] = var14[var17];
                     var9[var17] = var15[var17];
                     var10[var17] = var16[var17];
                     ++var17;
                  }
               } while(~class678.field10127 < ~var17);
            }
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field2305[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "g",
      descriptor = "(I)V",
      line = 228
   )
   public static void method1397(int arg0) {
      try {
         field2298 = null;
         if (arg0 == 2) {
            field2296 = null;
            field2303 = null;
            field2299 = null;
            field2302 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2305[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "a",
      descriptor = "(IILica;)V",
      line = 242
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         if (arg1 == 0) {
            super.field933 = arg2.method2855(arg0 + -31006) == 1;
         }

         if (arg0 != -1) {
            field2303 = null;
         }

         ++field2297;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2305[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2305[2] : field2305[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1398(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1399(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
