import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class599 extends class70 {
   @OriginalMember(
      owner = "client!in",
      name = "G",
      descriptor = "Z"
   )
   private boolean field8782 = true;
   @OriginalMember(
      owner = "client!in",
      name = "L",
      descriptor = "Z"
   )
   private boolean field8785 = true;
   @OriginalMember(
      owner = "client!in",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8788 = new String[]{method4439(method4438("dY\u001c`&")), method4439(method4438("dY\u001ci&")), method4439(method4438("dY\u001ch&")), method4439(method4438("cB^O")), method4439(method4438("v\u0019\u001c\rs")), method4439(method4438("dY\u001ck&"))};
   @OriginalMember(
      owner = "client!in",
      name = "J",
      descriptor = "I"
   )
   public static int field8780 = -1;
   @OriginalMember(
      owner = "client!in",
      name = "H",
      descriptor = "F"
   )
   public static float field8786;
   @OriginalMember(
      owner = "client!in",
      name = "I",
      descriptor = "I"
   )
   public static int field8779;
   @OriginalMember(
      owner = "client!in",
      name = "N",
      descriptor = "I"
   )
   public static int field8781;
   @OriginalMember(
      owner = "client!in",
      name = "M",
      descriptor = "I"
   )
   public static int field8783;
   @OriginalMember(
      owner = "client!in",
      name = "F",
      descriptor = "I"
   )
   public static int field8784;
   @OriginalMember(
      owner = "client!in",
      name = "K",
      descriptor = "I"
   )
   public static int field8787;

   @OriginalMember(
      owner = "client!in",
      name = "g",
      descriptor = "(I)Lrf;"
   )
   public static final class780 method4437(int arg0) {
      try {
         ++field8784;
         int var1 = -29 / ((-30 - arg0) / 34);
         return class395.method3187(1, 2075);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8788[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "<init>",
      descriptor = "()V"
   )
   public class599() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg0 != -1) {
            this.method274(68, -99, (class354)null);
         }

         label67: {
            label68: {
               label69: {
                  if (arg1 != 0) {
                     if (arg1 == 1) {
                        break label69;
                     }

                     if (~arg1 != -3) {
                        break label67;
                     }

                     if (!var4) {
                        break label68;
                     }
                  }

                  this.field8782 = arg2.method2855(arg0 + -31006) == 1;
                  if (!var4) {
                     break label67;
                  }
               }

               this.field8785 = ~arg2.method2855(-31007) == -2;
               if (!var4) {
                  break label67;
               }
            }

            super.field933 = arg2.method2855(-31007) == 1;
         }

         ++field8779;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8788[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8788[4] : field8788[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 32) {
            return null;
         } else {
            ++field8783;
            int[][] var4 = super.field918.method3276((byte)96, arg1);
            if (super.field918.field6361) {
               int[][] var5 = this.method539(true, this.field8785 ? class578.field8547 - arg1 : arg1, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               if (this.field8782) {
                  int var12 = 0;
                  if (var3) {
                     var9[var12] = var6[-var12 + class50.field637];
                     var10[var12] = var7[-var12 + class50.field637];
                     var11[var12] = var8[-var12 + class50.field637];
                     ++var12;
                  }

                  while(true) {
                     while(~var12 > ~class678.field10127) {
                        var9[var12] = var6[-var12 + class50.field637];
                        var10[var12] = var7[-var12 + class50.field637];
                        var11[var12] = var8[-var12 + class50.field637];
                        ++var12;
                     }

                     if (!var3) {
                        if (!var3) {
                           return var4;
                        }
                        break;
                     }

                     ++var12;
                  }
               }

               int var13 = 0;
               if (var3 || class678.field10127 > var13) {
                  do {
                     var9[var13] = var6[var13];
                     var10[var13] = var7[var13];
                     var11[var13] = var8[var13];
                     ++var13;
                  } while(class678.field10127 > var13);
               }
            }

            return var4;
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8788[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8787;
         if (arg0 != 87) {
            method4437(-104);
         }

         int[] var4 = super.field923.method3718(arg0 + -89, arg1);
         if (super.field923.field7284) {
            int[] var5 = this.method545(0, !this.field8785 ? arg1 : -arg1 + class578.field8547, (byte)-127);
            if (this.field8782) {
               int var6 = 0;
               if (var3) {
                  var4[var6] = var5[-var6 + class50.field637];
                  ++var6;
               }

               while(true) {
                  while(var6 < class678.field10127) {
                     var4[var6] = var5[-var6 + class50.field637];
                     ++var6;
                  }

                  if (!var3) {
                     if (!var3) {
                        return var4;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            class107.method1029(var5, 0, var4, 0, class678.field10127);
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8788[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4438(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4439(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
