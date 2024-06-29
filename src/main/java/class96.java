import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class96 extends class264 {
   @OriginalMember(
      owner = "client!iia",
      name = "M",
      descriptor = "I"
   )
   private int field1231 = 4096;
   @OriginalMember(
      owner = "client!iia",
      name = "I",
      descriptor = "I"
   )
   private int field1232 = 4096;
   @OriginalMember(
      owner = "client!iia",
      name = "P",
      descriptor = "[I"
   )
   private int[] field1237 = new int[3];
   @OriginalMember(
      owner = "client!iia",
      name = "L",
      descriptor = "I"
   )
   private int field1240 = 409;
   @OriginalMember(
      owner = "client!iia",
      name = "F",
      descriptor = "I"
   )
   private int field1241 = 4096;
   @OriginalMember(
      owner = "client!iia",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1243 = new String[]{method821(method820(" 'G\u0003\u0001a")), method821(method820("2`\b\u0003=")), method821(method820("';JA")), method821(method820(" 'G\u0003\u0007a")), method821(method820(" 'G\u0003\u0004a")), method821(method820(" 'G\u0003\u0003a"))};
   @OriginalMember(
      owner = "client!iia",
      name = "J",
      descriptor = "Z"
   )
   public static boolean field1235 = false;
   @OriginalMember(
      owner = "client!iia",
      name = "N",
      descriptor = "I"
   )
   public static int field1234 = 0;
   @OriginalMember(
      owner = "client!iia",
      name = "O",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1242 = "";
   @OriginalMember(
      owner = "client!iia",
      name = "K",
      descriptor = "Lll;"
   )
   public static class387 field1233 = new class387();
   @OriginalMember(
      owner = "client!iia",
      name = "G",
      descriptor = "I"
   )
   public static int field1236;
   @OriginalMember(
      owner = "client!iia",
      name = "H",
      descriptor = "I"
   )
   public static int field1238;
   @OriginalMember(
      owner = "client!iia",
      name = "Q",
      descriptor = "I"
   )
   public static int field1239;

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1239;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            field1234 = -114;
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
                  int var14 = -this.field1237[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }

                  if (var14 > this.field1240) {
                     var9[var12] = var13;
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  int var15 = var7[var12];
                  int var16 = var15 - this.field1237[1];
                  if (~var16 > -1) {
                     var16 = -var16;
                  }

                  if (~var16 < ~this.field1240) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  int var17 = var8[var12];
                  int var18 = -this.field1237[2] + var17;
                  if (var18 < 0) {
                     var18 = -var18;
                  }

                  if (var18 > this.field1240) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var17;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field1232 * var13 >> 12;
                  var10[var12] = this.field1241 * var15 >> 12;
                  var11[var12] = this.field1231 * var17 >> 12;
                  ++var12;
               } while(var12 < class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field1243[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "<init>",
      descriptor = "()V"
   )
   public class96() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        if (~arg0 != -1) {
                           if (~arg0 == -2) {
                              break label60;
                           }

                           if (arg0 == 2) {
                              break label61;
                           }

                           if (arg0 == 3) {
                              break label62;
                           }

                           if (~arg0 != -5) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field1240 = arg1.method1211(-26166);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field1231 = arg1.method1211(-26166);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field1241 = arg1.method1211(-26166);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field1232 = arg1.method1211(-26166);
               if (!var4) {
                  break label64;
               }
            }

            int var6 = arg1.method1166((byte)-91);
            this.field1237[0] = class556.method3988(var6 << 4, 267386880);
            this.field1237[1] = class556.method3988(4080, var6 >> 4);
            this.field1237[2] = class556.method3988(255, var6) >> 12;
         }

         if (arg2 <= 49) {
            this.method3(-4, (class147)null, -10);
         }

         ++field1236;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1243[0] + arg0 + ',' + (arg1 != null ? field1243[1] : field1243[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method818(byte arg0) {
      try {
         field1233 = null;
         if (arg0 == -72) {
            field1242 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1243[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method819(int arg0, int arg1, int arg2) {
      try {
         ++field1238;
         if (arg1 != -1930109569) {
            return 10;
         } else {
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg0 + -var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1243[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method820(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method821(char[] arg0) {
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
            var10005 = 78;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
