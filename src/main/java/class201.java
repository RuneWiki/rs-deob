import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class201 extends class70 {
   @OriginalMember(
      owner = "client!cba",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3083 = new String[]{method1764(method1763("\u0019+'&NR")), method1764(method1763("\u0001gh&r")), method1764(method1763("\u0019+'&GR")), method1764(method1763("\u0014<*d")), method1764(method1763("\u0019+'&ER")), method1764(method1763("\u0019+'&LR"))};
   @OriginalMember(
      owner = "client!cba",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field3082 = new int[1000];
   @OriginalMember(
      owner = "client!cba",
      name = "L",
      descriptor = "F"
   )
   public static float field3080;
   @OriginalMember(
      owner = "client!cba",
      name = "J",
      descriptor = "I"
   )
   public static int field3077;
   @OriginalMember(
      owner = "client!cba",
      name = "I",
      descriptor = "I"
   )
   public static int field3078;
   @OriginalMember(
      owner = "client!cba",
      name = "K",
      descriptor = "I"
   )
   public static int field3079;
   @OriginalMember(
      owner = "client!cba",
      name = "H",
      descriptor = "Lrr;"
   )
   public static class678 field3081;

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(II)[[I",
      line = 5
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 != 32) {
            field3080 = -0.6966283F;
         }

         ++field3077;
         int[][] var4 = super.field918.method3276((byte)115, arg1);
         if (super.field918.field6361) {
            int[][] var5 = this.method539(true, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~class678.field10127 < ~var12) {
               do {
                  var9[var12] = -var6[var12] + 4096;
                  var10[var12] = -var7[var12] + 4096;
                  var11[var12] = 4096 - var8[var12];
                  ++var12;
               } while(~class678.field10127 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field3083[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(IILica;)V",
      line = 54
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         if (~arg1 == arg0) {
            super.field933 = arg2.method2855(-31007) == 1;
         }

         ++field3079;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3083[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3083[1] : field3083[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "<init>",
      descriptor = "()V",
      line = 65
   )
   public class201() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cba",
      name = "g",
      descriptor = "(I)V",
      line = 68
   )
   public static void method1762(int arg0) {
      try {
         if (arg0 != 2) {
            method1762(-61);
         }

         field3082 = null;
         field3081 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3083[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(BI)[I",
      line = 81
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field3078;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            field3080 = -0.9979029F;
         }

         if (super.field923.field7284) {
            int[] var5 = this.method545(0, arg1, (byte)-105);
            int var6 = 0;
            if (var3 || ~class678.field10127 < ~var6) {
               do {
                  var4[var6] = 4096 - var5[var6];
                  ++var6;
               } while(~class678.field10127 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3083[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1763(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1764(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
