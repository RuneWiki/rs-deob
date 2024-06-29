import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class45 extends class629 {
   @OriginalMember(
      owner = "client!cja",
      name = "K",
      descriptor = "I"
   )
   private int field996 = 4;
   @OriginalMember(
      owner = "client!cja",
      name = "I",
      descriptor = "I"
   )
   private int field1002 = 4;
   @OriginalMember(
      owner = "client!cja",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1003 = new String[]{method566(method565("\f\u0006YV")), method566(method565("\u0001\u0019T\u00147J")), method566(method565("\u0019]\u001b\u0014\u0007")), method566(method565("\u0001\u0019T\u00144J")), method566(method565("\u0001\u0019T\u00140J")), method566(method565("\u0001\u0019T\u0014?J")), method566(method565("\u0001\u0019T\u00146J"))};
   @OriginalMember(
      owner = "client!cja",
      name = "H",
      descriptor = "[J"
   )
   public static long[] field999 = new long[32];
   @OriginalMember(
      owner = "client!cja",
      name = "D",
      descriptor = "I"
   )
   public static int field1001;
   @OriginalMember(
      owner = "client!cja",
      name = "F",
      descriptor = "I"
   )
   public static int field995;
   @OriginalMember(
      owner = "client!cja",
      name = "G",
      descriptor = "I"
   )
   public static int field997;
   @OriginalMember(
      owner = "client!cja",
      name = "J",
      descriptor = "I"
   )
   public static int field998;
   @OriginalMember(
      owner = "client!cja",
      name = "E",
      descriptor = "Lhw;"
   )
   public static class141 field1000;

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(BLuda;)Lfw;",
      line = 5
   )
   public static final class62 method563(byte arg0, class473 arg1) {
      try {
         ++field998;
         class790 var2 = class449.method3384(arg1, 43);
         if (arg0 != 28) {
            method564((byte)7);
         }

         int var3 = arg1.method3548((byte)-114);
         return new class62(var2.field11549, var2.field11547, var2.field11550, var2.field11546, var2.field11551, var3);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1003[1] + arg0 + ',' + (arg1 != null ? field1003[2] : field1003[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(II)[[I",
      line = 20
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 0) {
            this.field1002 = 102;
         }

         ++field995;
         int[][] var4 = super.field9169.method785((byte)102, arg0);
         if (super.field9169.field1332) {
            int var5;
            int[][] var7;
            label40: {
               var5 = class66.field1214 / this.field996;
               int var6 = class686.field10095 / this.field1002;
               if (var6 <= 0) {
                  var7 = this.method4621(-118, 0, 0);
                  if (!var3) {
                     break label40;
                  }
               }

               int var8 = arg0 % var6;
               var7 = this.method4621(arg1 + 75, 0, class686.field10095 * var8 / var6);
            }

            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            int var15 = 0;
            if (var3 || var15 < class66.field1214) {
               do {
                  int var16;
                  label33: {
                     if (var5 <= 0) {
                        var16 = 0;
                        if (!var3) {
                           break label33;
                        }
                     }

                     int var17 = var15 % var5;
                     var16 = class66.field1214 * var17 / var5;
                  }

                  var12[var15] = var9[var16];
                  var13[var15] = var10[var16];
                  var14[var15] = var11[var16];
                  ++var15;
               } while(var15 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field1003[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "<init>",
      descriptor = "()V",
      line = 95
   )
   public class45() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 98
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label37: {
            label36: {
               if (arg2 != 0) {
                  if (~arg2 != -2) {
                     break label37;
                  }

                  if (!var4) {
                     break label36;
                  }
               }

               this.field996 = arg0.method3564((byte)-46);
               if (!var4) {
                  break label37;
               }
            }

            this.field1002 = arg0.method3564((byte)-127);
         }

         if (arg1 != 0) {
            this.method241((class473)null, 96, 48);
         }

         ++field997;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1003[5] + (arg0 != null ? field1003[2] : field1003[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "(II)[I",
      line = 134
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1001;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            return null;
         } else {
            if (super.field9161.field7474) {
               int var5;
               int[] var8;
               label42: {
                  var5 = class66.field1214 / this.field996;
                  int var6 = class686.field10095 / this.field1002;
                  if (~var6 < -1) {
                     int var7 = arg0 % var6;
                     var8 = this.method4622((byte)116, 0, class686.field10095 * var7 / var6);
                     if (!var3) {
                        break label42;
                     }
                  }

                  var8 = this.method4622((byte)118, 0, 0);
               }

               int var9 = 0;
               if (var3 || class66.field1214 > var9) {
                  do {
                     if (var5 > 0) {
                        int var10 = var9 % var5;
                        var4[var9] = var8[class66.field1214 * var10 / var5];
                        if (!var3) {
                           ++var9;
                           continue;
                        }
                     }

                     var4[var9] = var8[0];
                     ++var9;
                  } while(class66.field1214 > var9);
               }
            }

            return var4;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field1003[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "(B)V",
      line = 187
   )
   public static void method564(byte arg0) {
      try {
         field1000 = null;
         field999 = null;
         int var1 = 104 / ((8 - arg0) / 57);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1003[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method566(char[] arg0) {
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
            var10005 = 115;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
