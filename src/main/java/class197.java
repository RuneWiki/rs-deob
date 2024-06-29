import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class197 extends class629 {
   @OriginalMember(
      owner = "client!ov",
      name = "L",
      descriptor = "I"
   )
   private int field2969 = 4096;
   @OriginalMember(
      owner = "client!ov",
      name = "G",
      descriptor = "I"
   )
   private int field2971 = 4096;
   @OriginalMember(
      owner = "client!ov",
      name = "K",
      descriptor = "[I"
   )
   private int[] field2973 = new int[3];
   @OriginalMember(
      owner = "client!ov",
      name = "J",
      descriptor = "I"
   )
   private int field2968 = 4096;
   @OriginalMember(
      owner = "client!ov",
      name = "M",
      descriptor = "I"
   )
   private int field2977 = 409;
   @OriginalMember(
      owner = "client!ov",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2979 = new String[]{method1705(method1704("v\u0002Bbx")), method1705(method1704("w\u0001\u0000^")), method1705(method1704("v\u0002B}x")), method1705(method1704("bZB\u001c-")), method1705(method1704("v\u0002B|x")), method1705(method1704("v\u0002Bwx")), method1705(method1704("v\u0002B\u007fx")), method1705(method1704("v\u0002B~x"))};
   @OriginalMember(
      owner = "client!ov",
      name = "H",
      descriptor = "Lgh;"
   )
   public static class572 field2976 = new class572(74, -2);
   @OriginalMember(
      owner = "client!ov",
      name = "D",
      descriptor = "I"
   )
   public static int field2970;
   @OriginalMember(
      owner = "client!ov",
      name = "E",
      descriptor = "I"
   )
   public static int field2972;
   @OriginalMember(
      owner = "client!ov",
      name = "I",
      descriptor = "I"
   )
   public static int field2974;
   @OriginalMember(
      owner = "client!ov",
      name = "F",
      descriptor = "I"
   )
   public static int field2975;
   @OriginalMember(
      owner = "client!ov",
      name = "N",
      descriptor = "I"
   )
   public static int field2978;

   @OriginalMember(
      owner = "client!ov",
      name = "<init>",
      descriptor = "()V"
   )
   public class197() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(ZLpg;)Z"
   )
   public static final boolean method1700(boolean arg0, class762 arg1) {
      try {
         if (arg0) {
            method1702(true);
         }

         ++field2972;
         return class124.field2023 == arg1 || class211.field3152 == arg1 || class392.field5784 == arg1 || class538.field7841 == arg1 || class93.field1516 == arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2979[2] + arg0 + ',' + (arg1 != null ? field2979[3] : field2979[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method1701(int arg0, boolean arg1) {
      try {
         if (arg0 != -1) {
            method1701(107, false);
         }

         ++field2970;
         int var2 = class402.field5939;
         if (~var2 != -1) {
            if (~var2 == -2) {
               return class490.field7149;
            }

            if (var2 != 2) {
               return 0;
            }

            if (!client.field4564) {
               return 0;
            }
         }

         return !arg1 ? class490.field7149 : 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2979[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        ++field2974;
                        if (~arg2 != -1) {
                           if (arg2 == 1) {
                              break label60;
                           }

                           if (~arg2 == -3) {
                              break label61;
                           }

                           if (arg2 == 3) {
                              break label62;
                           }

                           if (arg2 != 4) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field2977 = arg0.method3565(true);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field2968 = arg0.method3565(true);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field2971 = arg0.method3565(true);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field2969 = arg0.method3565(true);
               if (!var4) {
                  break label64;
               }
            }

            int var6 = arg0.method3577(-2);
            this.field2973[1] = class66.method706(4080, var6 >> 4);
            this.field2973[0] = class66.method706(267386880, var6 << 4);
            this.field2973[2] = class66.method706(var6 >> 12, 0);
         }

         if (arg1 != 0) {
            this.method243(-122, -103);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2979[5] + (arg0 != null ? field2979[3] : field2979[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1702(boolean arg0) {
      try {
         if (arg0) {
            field2976 = null;
         }

         field2976 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2979[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2978;
         int[][] var4 = super.field9169.method785((byte)72, arg0);
         if (arg1 != 0) {
            this.method243(-68, 84);
         }

         if (super.field9169.field1332) {
            int[][] var5 = this.method4621(arg1 ^ -20, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || class66.field1214 > var12) {
               do {
                  int var13 = var6[var12];
                  int var14 = -this.field2973[0] + var13;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }

                  if (this.field2977 < var14) {
                     var9[var12] = var13;
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  int var15 = var7[var12];
                  int var16 = -this.field2973[1] + var15;
                  if (var16 < 0) {
                     var16 = -var16;
                  }

                  if (var16 > this.field2977) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  int var17 = var8[var12];
                  int var18 = -this.field2973[2] + var17;
                  if (~var18 > -1) {
                     var18 = -var18;
                  }

                  if (~var18 < ~this.field2977) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var17;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field2969 * var13 >> 12;
                  var10[var12] = this.field2971 * var15 >> 12;
                  var11[var12] = this.field2968 * var17 >> 12;
                  ++var12;
               } while(class66.field1214 > var12);
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field2979[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "b",
      descriptor = "(IZ)V"
   )
   public static final void method1703(int arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         ++field2975;
         if (class28.method199(0, arg0)) {
            if (arg1) {
               class303[] var3 = class253.field3608[arg0];
               int var4 = 0;
               if (var2 || ~var4 > ~var3.length) {
                  do {
                     class303 var5 = var3[var4];
                     if (var5 != null) {
                        var5.field4334 = 0;
                        var5.field4272 = 0;
                        var5.field4366 = 1;
                     }

                     ++var4;
                  } while(~var4 > ~var3.length);

               }
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2979[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1704(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ov",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1705(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
