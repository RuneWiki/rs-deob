import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class128 extends class629 {
   @OriginalMember(
      owner = "client!oda",
      name = "G",
      descriptor = "I"
   )
   private int field2147 = 585;
   @OriginalMember(
      owner = "client!oda",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2152 = new String[]{method1243(method1242("3\u0011?X\u001ct")), method1243(method1242("3\u0011?X\u001bt")), method1243(method1242("'[pX+")), method1243(method1242("2\u00002\u001a")), method1243(method1242("3\u0011?X\u0013t")), method1243(method1242("3\u0011?X\u0018t"))};
   @OriginalMember(
      owner = "client!oda",
      name = "O",
      descriptor = "[I"
   )
   public static int[] field2142 = new int[4096];
   @OriginalMember(
      owner = "client!oda",
      name = "K",
      descriptor = "Lca;"
   )
   public static class320 field2145 = null;
   @OriginalMember(
      owner = "client!oda",
      name = "L",
      descriptor = "I"
   )
   public static int field2146 = 0;
   @OriginalMember(
      owner = "client!oda",
      name = "D",
      descriptor = "[C"
   )
   public static char[] field2143 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @OriginalMember(
      owner = "client!oda",
      name = "N",
      descriptor = "Lgh;"
   )
   public static class572 field2144 = new class572(79, 0);
   @OriginalMember(
      owner = "client!oda",
      name = "I",
      descriptor = "I"
   )
   public static int field2140;
   @OriginalMember(
      owner = "client!oda",
      name = "F",
      descriptor = "I"
   )
   public static int field2148;
   @OriginalMember(
      owner = "client!oda",
      name = "E",
      descriptor = "I"
   )
   public static int field2149;
   @OriginalMember(
      owner = "client!oda",
      name = "H",
      descriptor = "I"
   )
   public static int field2150;
   @OriginalMember(
      owner = "client!oda",
      name = "M",
      descriptor = "Lac;"
   )
   public static class564 field2151;
   @OriginalMember(
      owner = "client!oda",
      name = "J",
      descriptor = "[Llja;"
   )
   public static class743[] field2141;

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field2150;
         if (arg2 == 0) {
            this.field2147 = arg0.method3565(true);
         }

         if (arg1 != 0) {
            this.field2147 = 66;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2152[4] + (arg0 != null ? field2152[2] : field2152[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1240(int arg0) {
      try {
         field2151 = null;
         field2142 = null;
         field2141 = null;
         if (arg0 <= 2) {
            field2145 = null;
         }

         field2143 = null;
         field2144 = null;
         field2145 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2152[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "<init>",
      descriptor = "()V"
   )
   public class128() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Lhw;IIIZILpo;)V"
   )
   public static final void method1241(class141 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class582 arg6) {
      try {
         class126.method1225(arg5, arg4, arg2, arg1 ^ -5481, arg0, arg3);
         if (arg1 != 2048) {
            field2143 = null;
         }

         ++field2149;
         class548.field7918 = arg6;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2152[1] + (arg0 != null ? field2152[2] : field2152[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field2152[2] : field2152[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 2048) {
            field2144 = null;
         }

         ++field2140;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int var5 = class442.field6448[arg0];
            int var6 = 0;
            if (var3 || var6 < class66.field1214) {
               do {
                  label112: {
                     int var7 = class429.field6201[var6];
                     if (~var7 < ~this.field2147 && var7 < 4096 - this.field2147 && ~(-this.field2147 + 2048) > ~var5 && this.field2147 + 2048 > var5) {
                        int var8 = 2048 - var7;
                        int var9 = ~var8 <= -1 ? var8 : -var8;
                        int var10 = var9 << 12;
                        int var11 = var10 / (-this.field2147 + 2048);
                        var4[var6] = 4096 - var11;
                        if (!var3) {
                           break label112;
                        }
                     }

                     if (~var7 < ~(-this.field2147 + 2048) && ~var7 > ~(this.field2147 + 2048)) {
                        int var12 = var5 + -2048;
                        int var13 = var12 >= 0 ? var12 : -var12;
                        int var14 = var13 - this.field2147;
                        int var15 = var14 << 12;
                        var4[var6] = var15 / (-this.field2147 + 2048);
                        if (!var3) {
                           break label112;
                        }
                     }

                     if (~this.field2147 < ~var5 || ~(-this.field2147 + 4096) > ~var5) {
                        int var16 = var7 + -2048;
                        int var17 = ~var16 <= -1 ? var16 : -var16;
                        int var18 = var17 - this.field2147;
                        int var19 = var18 << 12;
                        var4[var6] = var19 / (-this.field2147 + 2048);
                        if (!var3) {
                           break label112;
                        }
                     }

                     if (~var7 > ~this.field2147 || ~var7 < ~(-this.field2147 + 4096)) {
                        int var20 = 2048 - var5;
                        int var21 = ~var20 > -1 ? -var20 : var20;
                        int var22 = var21 << 12;
                        int var23 = var22 / (-this.field2147 + 2048);
                        var4[var6] = -var23 + 4096;
                        if (!var3) {
                           break label112;
                        }
                     }

                     var4[var6] = 0;
                  }

                  ++var6;
               } while(var6 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field2152[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
