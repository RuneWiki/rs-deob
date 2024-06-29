import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class770 extends class629 {
   @OriginalMember(
      owner = "client!kn",
      name = "J",
      descriptor = "I"
   )
   private int field11212 = 32768;
   @OriginalMember(
      owner = "client!kn",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11215 = new String[]{method5570(method5569("\u0016\bh7\u0003")), method5570(method5569("\u0016\bh1\u0003")), method5570(method5569("\u0013\u0013*\u0011")), method5570(method5569("\u0006HhSV")), method5570(method5569("\u0016\bh0\u0003")), method5570(method5569("\u0016\bh4\u0003")), method5570(method5569("\u0016\bh8\u0003"))};
   @OriginalMember(
      owner = "client!kn",
      name = "F",
      descriptor = "I"
   )
   public static int field11213 = -1;
   @OriginalMember(
      owner = "client!kn",
      name = "G",
      descriptor = "I"
   )
   public static int field11208;
   @OriginalMember(
      owner = "client!kn",
      name = "D",
      descriptor = "I"
   )
   public static int field11209;
   @OriginalMember(
      owner = "client!kn",
      name = "I",
      descriptor = "I"
   )
   public static int field11210;
   @OriginalMember(
      owner = "client!kn",
      name = "H",
      descriptor = "I"
   )
   public static int field11211;
   @OriginalMember(
      owner = "client!kn",
      name = "E",
      descriptor = "I"
   )
   public static int field11214;

   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public final void method901(int arg0) {
      try {
         ++field11210;
         if (arg0 != 245880940) {
            field11213 = -7;
         }

         class375.method2933(256);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11215[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(II)[[I",
      line = 15
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field11208;
         int[][] var4 = super.field9169.method785((byte)45, arg0);
         if (super.field9169.field1332) {
            int[] var5 = this.method4622((byte)115, 1, arg0);
            int[] var6 = this.method4622((byte)119, 2, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int var10 = 0;
            if (var3 || ~class66.field1214 < ~var10) {
               do {
                  int var11 = var5[var10] * 255 >> 12 & 255;
                  int var12 = var6[var10] * this.field11212 >> 12;
                  int var13 = class549.field7922[var11] * var12 >> 12;
                  int var14 = class320.field4618[var11] * var12 >> 12;
                  int var15 = class704.field10259 & var10 - -(var13 >> 12);
                  int var16 = (var14 >> 12) + arg0 & class37.field902;
                  int[][] var17 = this.method4621(52, 0, var16);
                  var7[var10] = var17[0][var15];
                  var8[var10] = var17[1][var15];
                  var9[var10] = var17[2][var15];
                  ++var10;
               } while(~class66.field1214 < ~var10);
            }
         }

         if (arg1 != 0) {
            this.method243(-22, -13);
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field11215[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 73
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label48: {
            label42: {
               if (arg2 != 0) {
                  if (~arg2 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field11212 = arg0.method3565(true) << 4;
               if (!var4) {
                  break label48;
               }
            }

            super.field9166 = ~arg0.method3564((byte)-91) == -2;
         }

         ++field11211;
         if (arg1 != 0) {
            field11213 = -104;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field11215[6] + (arg0 != null ? field11215[3] : field11215[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "a",
      descriptor = "(ILkk;)I",
      line = 111
   )
   public static final int method5568(int arg0, class200 arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != 8564) {
            field11213 = -122;
         }

         ++field11209;
         int var3 = arg1.method1714((byte)-34, 2);
         int var4;
         if (var3 == 0) {
            var4 = 0;
            if (!var2) {
               return var4;
            }
         }

         if (~var3 == -2) {
            var4 = arg1.method1714((byte)-34, 5);
            if (!var2) {
               return var4;
            }
         }

         if (~var3 != -3) {
            var4 = arg1.method1714((byte)-34, 11);
            if (!var2) {
               return var4;
            }
         }

         var4 = arg1.method1714((byte)-34, 8);
         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11215[4] + arg0 + ',' + (arg1 != null ? field11215[3] : field11215[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "b",
      descriptor = "(II)[I",
      line = 138
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field11214;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int[] var5 = this.method4622((byte)122, 1, arg0);
            int[] var6 = this.method4622((byte)125, 2, arg0);
            int var7 = 0;
            if (var3 || class66.field1214 > var7) {
               do {
                  int var8 = (var5[var7] & 4081) >> 4;
                  int var9 = var6[var7] * this.field11212 >> 12;
                  int var10 = class549.field7922[var8] * var9 >> 12;
                  int var11 = class320.field4618[var8] * var9 >> 12;
                  int var12 = (var10 >> 12) + var7 & class704.field10259;
                  int var13 = class37.field902 & arg0 - -(var11 >> 12);
                  int[] var14 = this.method4622((byte)116, 0, var13);
                  var4[var7] = var14[var12];
                  ++var7;
               } while(class66.field1214 > var7);
            }
         }

         return arg1 != 2048 ? null : var4;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field11215[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kn",
      name = "<init>",
      descriptor = "()V",
      line = 192
   )
   public class770() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5569(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5570(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
