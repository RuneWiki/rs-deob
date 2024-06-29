import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class169 extends class70 {
   @OriginalMember(
      owner = "client!wu",
      name = "N",
      descriptor = "Z"
   )
   private boolean field2204 = true;
   @OriginalMember(
      owner = "client!wu",
      name = "L",
      descriptor = "Z"
   )
   private boolean field2206 = true;
   @OriginalMember(
      owner = "client!wu",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2210 = new String[]{method1469(method1468("bW\u0012U\n")), method1469(method1468("{WPv")), method1469(method1468("bW\u0012Y\n")), method1469(method1468("n\f\u00124_")), method1469(method1468("bW\u0012^\n")), method1469(method1468("bW\u0012X\n"))};
   @OriginalMember(
      owner = "client!wu",
      name = "I",
      descriptor = "I"
   )
   public static int field2203;
   @OriginalMember(
      owner = "client!wu",
      name = "K",
      descriptor = "I"
   )
   public static int field2205;
   @OriginalMember(
      owner = "client!wu",
      name = "M",
      descriptor = "I"
   )
   public static int field2207;
   @OriginalMember(
      owner = "client!wu",
      name = "O",
      descriptor = "I"
   )
   public static int field2208;
   @OriginalMember(
      owner = "client!wu",
      name = "J",
      descriptor = "Lhd;"
   )
   public static class347 field2209;

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1467(byte arg0) {
      try {
         if (arg0 > 83) {
            field2209 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2210[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2207;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            label58: {
               int[] var5 = this.method690(-46, 0, !this.field2204 ? arg1 : class623.field9205 - arg1);
               if (this.field2206) {
                  int var6 = 0;
                  if (var3) {
                     var4[var6] = var5[-var6 + class174.field2249];
                     ++var6;
                  }

                  while(true) {
                     while(var6 < class262.field3328) {
                        var4[var6] = var5[-var6 + class174.field2249];
                        ++var6;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label58;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               class349.method2759(var5, 0, var4, 0, class262.field3328);
            }
         }

         if (arg0 != -63) {
            field2203 = -42;
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2210[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label67: {
            label68: {
               label69: {
                  ++field2205;
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label69;
                     }

                     if (~arg2 != -3) {
                        break label67;
                     }

                     if (!var4) {
                        break label68;
                     }
                  }

                  this.field2206 = ~arg1.method640(255) == -2;
                  if (!var4) {
                     break label67;
                  }
               }

               this.field2204 = ~arg1.method640(255) == -2;
               if (!var4) {
                  break label67;
               }
            }

            super.field930 = ~arg1.method640(255) == -2;
         }

         if (arg0 >= -34) {
            this.method550(-60, (class66)null, -2);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2210[2] + arg0 + ',' + (arg1 != null ? field2210[3] : field2210[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2208;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (super.field926.field5048) {
            int[][] var5 = this.method696(this.field2204 ? -arg1 + class623.field9205 : arg1, 0, arg0 + 39519);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field2206) {
               int var12 = 0;
               if (var3) {
                  var9[var12] = var6[var12];
                  var10[var12] = var7[var12];
                  var11[var12] = var8[var12];
                  ++var12;
               }

               while(true) {
                  while(var12 < class262.field3328) {
                     var9[var12] = var6[var12];
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     ++var12;
                  }

                  if (!var3) {
                     if (!var3) {
                        return arg0 != -6752 ? null : var4;
                     }
                     break;
                  }

                  ++var12;
               }
            }

            int var13 = 0;
            if (var3 || ~class262.field3328 < ~var13) {
               do {
                  var9[var13] = var6[-var13 + class174.field2249];
                  var10[var13] = var7[-var13 + class174.field2249];
                  var11[var13] = var8[class174.field2249 - var13];
                  ++var13;
               } while(~class262.field3328 < ~var13);
            }
         }

         return arg0 != -6752 ? null : var4;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field2210[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "()V"
   )
   public class169() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
