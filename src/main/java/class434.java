import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class434 extends class264 {
   @OriginalMember(
      owner = "client!rm",
      name = "K",
      descriptor = "I"
   )
   private int field6215 = 4096;
   @OriginalMember(
      owner = "client!rm",
      name = "H",
      descriptor = "I"
   )
   private int field6214 = 4096;
   @OriginalMember(
      owner = "client!rm",
      name = "I",
      descriptor = "I"
   )
   private int field6218 = 4096;
   @OriginalMember(
      owner = "client!rm",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6223 = new String[]{method3210(method3209("\u001eny\u001f6")), method3210(method3209("\u001eny\u001c6")), method3210(method3209("\u001eny\u001e6")), method3210(method3209("\u0002v;7")), method3210(method3209("\u001eny\u001a6")), method3210(method3209("\u0017-yuc")), method3210(method3209("\u001eny\u001d6"))};
   @OriginalMember(
      owner = "client!rm",
      name = "L",
      descriptor = "I"
   )
   public static int field6216 = 0;
   @OriginalMember(
      owner = "client!rm",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field6222 = new int[]{28, 35, 40, 44};
   @OriginalMember(
      owner = "client!rm",
      name = "G",
      descriptor = "I"
   )
   public static int field6217;
   @OriginalMember(
      owner = "client!rm",
      name = "J",
      descriptor = "I"
   )
   public static int field6219;
   @OriginalMember(
      owner = "client!rm",
      name = "F",
      descriptor = "I"
   )
   public static int field6220;
   @OriginalMember(
      owner = "client!rm",
      name = "N",
      descriptor = "I"
   )
   public static int field6221;

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(CII)C"
   )
   public static final char method3205(char arg0, int arg1, int arg2) {
      try {
         ++field6220;
         if (~arg0 <= -193 && arg0 <= 255) {
            if (arg0 >= 192 && arg0 <= 198) {
               return 'A';
            }

            if (arg0 == 199) {
               return 'C';
            }

            if (~arg0 <= -201 && arg0 <= 203) {
               return 'E';
            }

            if (~arg0 <= -205 && ~arg0 >= -208) {
               return 'I';
            }

            if (arg0 >= 210 && arg0 <= 214) {
               return 'O';
            }

            if (arg0 >= 217 && arg0 <= 220) {
               return 'U';
            }

            if (arg0 == 221) {
               return 'Y';
            }

            if (~arg0 == -224) {
               return 's';
            }

            if (~arg0 <= -225 && arg0 <= 230) {
               return 'a';
            }

            if (~arg0 == -232) {
               return 'c';
            }

            if (arg0 >= 232 && ~arg0 >= -236) {
               return 'e';
            }

            if (~arg0 <= -237 && ~arg0 >= -240) {
               return 'i';
            }

            if (arg0 >= 242 && arg0 <= 246) {
               return 'o';
            }

            if (arg0 >= 249 && ~arg0 >= -253) {
               return 'u';
            }

            if (arg0 == 253 || ~arg0 == -256) {
               return 'y';
            }
         }

         if (~arg0 == -339) {
            return 'O';
         } else if (~arg0 == -340) {
            return 'o';
         } else if (arg2 != 79) {
            return '\u0000';
         } else if (arg0 == 376) {
            return 'Y';
         } else {
            return arg0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6223[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg2 >= 49) {
            label45: {
               label44: {
                  label43: {
                     if (arg0 != 0) {
                        if (~arg0 == -2) {
                           break label43;
                        }

                        if (arg0 != 2) {
                           break label45;
                        }

                        if (!var4) {
                           break label44;
                        }
                     }

                     this.field6214 = arg1.method1211(-26166);
                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field6218 = arg1.method1211(-26166);
                  if (!var4) {
                     break label45;
                  }
               }

               this.field6215 = arg1.method1211(-26166);
            }

            ++field6221;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6223[4] + arg0 + ',' + (arg1 != null ? field6223[5] : field6223[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3206(byte arg0) {
      try {
         field6222 = null;
         if (arg0 != -53) {
            method3208((class731[])null, 45, 7);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6223[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "()V"
   )
   public class434() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method3207(byte arg0) {
      try {
         if (arg0 != -63) {
            method3206((byte)-57);
         }

         ++field6219;
         if (class212.field3033 == null) {
            class312 var1 = new class312();
            byte[] var2 = var1.method2307(16, -106, 128, 128);
            class212.field3033 = class133.method1053(var2, false, (byte)92);
         }

         if (class754.field11177 == null) {
            class48 var3 = new class48();
            byte[] var4 = var3.method398(-4097, 128, 16, 128);
            class754.field11177 = class133.method1053(var4, false, (byte)92);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6223[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "([Lgn;II)V"
   )
   public static final void method3208(class731[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class731 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field10707;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field10707 < (var7 & 1) + var6) {
               class731 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method3208(arg0, arg1, var4 - 1);
         method3208(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field6217;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 > -117) {
            field6216 = 14;
         }

         if (super.field3634.field8828) {
            int[][] var5 = this.method2015(0, (byte)76, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class430.field6152) {
               do {
                  int var13 = var6[var12];
                  int var14 = var8[var12];
                  int var15 = var7[var12];
                  if (var13 == var14 && var14 == var15) {
                     var9[var12] = this.field6214 * var13 >> 12;
                     var10[var12] = this.field6218 * var14 >> 12;
                     var11[var12] = this.field6215 * var15 >> 12;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field6214;
                  var10[var12] = this.field6218;
                  var11[var12] = this.field6215;
                  ++var12;
               } while(var12 < class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field6223[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3209(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3210(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
