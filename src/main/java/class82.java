import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 extends class264 {
   @OriginalMember(
      owner = "client!gea",
      name = "I",
      descriptor = "I"
   )
   private int field1072 = 1024;
   @OriginalMember(
      owner = "client!gea",
      name = "G",
      descriptor = "I"
   )
   private int field1071 = 2048;
   @OriginalMember(
      owner = "client!gea",
      name = "N",
      descriptor = "I"
   )
   private int field1073 = 3072;
   @OriginalMember(
      owner = "client!gea",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1076 = new String[]{method742(method741("\u001e\\b@fQ")), method742(method741("\u0002\u0017-@\\")), method742(method741("\u0017Lo\u0002")), method742(method741("\u001e\\b@`Q")), method742(method741("\u001e\\b@bQ")), method742(method741("\u001e\\b@jQ")), method742(method741("\u001e\\b@cQ"))};
   @OriginalMember(
      owner = "client!gea",
      name = "M",
      descriptor = "I"
   )
   public static int field1067;
   @OriginalMember(
      owner = "client!gea",
      name = "L",
      descriptor = "I"
   )
   public static int field1068;
   @OriginalMember(
      owner = "client!gea",
      name = "F",
      descriptor = "I"
   )
   public static int field1069;
   @OriginalMember(
      owner = "client!gea",
      name = "H",
      descriptor = "I"
   )
   public static int field1074;
   @OriginalMember(
      owner = "client!gea",
      name = "J",
      descriptor = "I"
   )
   public static int field1075;
   @OriginalMember(
      owner = "client!gea",
      name = "K",
      descriptor = "Lbg;"
   )
   public static class492 field1070;

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 3
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         ++field1075;
         if (arg2 < 49) {
            this.method413(-4);
         }

         if (~arg0 != -1) {
            if (arg0 == 1) {
               this.field1073 = arg1.method1211(-26166);
               return;
            }

            if (~arg0 != -3) {
               return;
            }

            if (!client.field4360) {
               super.field3637 = ~arg1.method1143(-15465) == -2;
               return;
            }
         }

         this.field1072 = arg1.method1211(-26166);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1076[3] + arg0 + ',' + (arg1 != null ? field1076[1] : field1076[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(I)V",
      line = 47
   )
   public final void method413(int arg0) {
      try {
         if (arg0 > 49) {
            this.field1071 = -this.field1072 + this.field1073;
            ++field1074;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1076[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(IB)[[I",
      line = 58
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1069;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            method740((byte)90);
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
            if (var3 || ~class430.field6152 < ~var12) {
               do {
                  var9[var12] = (var6[var12] * this.field1071 >> 12) + this.field1072;
                  var10[var12] = (var7[var12] * this.field1071 >> 12) + this.field1072;
                  var11[var12] = (var8[var12] * this.field1071 >> 12) + this.field1072;
                  ++var12;
               } while(~class430.field6152 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field1076[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(II)[I",
      line = 104
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1068;
         int var4 = -82 / ((24 - arg1) / 44);
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, arg0);
            int var7 = 0;
            if (var3 || var7 < class430.field6152) {
               do {
                  var5[var7] = (var6[var7] * this.field1071 >> 12) + this.field1072;
                  ++var7;
               } while(var7 < class430.field6152);
            }
         }

         return var5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1076[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "<init>",
      descriptor = "()V",
      line = 141
   )
   public class82() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "(B)V",
      line = 145
   )
   public static void method740(byte arg0) {
      try {
         if (arg0 < -89) {
            field1070 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1076[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method741(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method742(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
