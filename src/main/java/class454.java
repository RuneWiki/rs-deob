import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class454 extends class264 {
   @OriginalMember(
      owner = "client!q",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6464 = new String[]{method3318(method3317("[\u0018>\u0004")), method3318(method3317("NC|Fr")), method3318(method3317("DC\u0013@")), method3318(method3317("DC\u0016@")), method3318(method3317("DC\u0011@")), method3318(method3317("DC\u0015@")), method3318(method3317("DC\u0010@"))};
   @OriginalMember(
      owner = "client!q",
      name = "F",
      descriptor = "I"
   )
   public static int field6459;
   @OriginalMember(
      owner = "client!q",
      name = "G",
      descriptor = "I"
   )
   public static int field6460;
   @OriginalMember(
      owner = "client!q",
      name = "J",
      descriptor = "I"
   )
   public static int field6461;
   @OriginalMember(
      owner = "client!q",
      name = "I",
      descriptor = "I"
   )
   public static int field6462;
   @OriginalMember(
      owner = "client!q",
      name = "H",
      descriptor = "I"
   )
   public static int field6463;

   @OriginalMember(
      owner = "client!q",
      name = "<init>",
      descriptor = "()V",
      line = 4
   )
   public class454() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 10
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         ++field6461;
         if (arg2 > 49) {
            if (arg0 == 0) {
               super.field3637 = arg1.method1143(-15465) == 1;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6464[2] + arg0 + ',' + (arg1 != null ? field6464[1] : field6464[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(IZ)V",
      line = 25
   )
   public static final void method3315(int arg0, boolean arg1) {
      try {
         ++field6463;
         if (class635.method4596(arg0, 28505)) {
            if (!arg1) {
               class594.method4315(class547.field7851[arg0], -32159, -1);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6464[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(Lkf;IIIIIZ)V",
      line = 40
   )
   public static final void method3316(class266 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      try {
         label27: {
            if (~arg2 < arg3) {
               class57.field705 = arg5;
               class265.field3656 = arg6;
               class80.field1029 = null;
               class672.field9747 = arg0;
               class397.field5738 = arg1;
               class4.field38 = 1;
               class282.field3915 = arg4;
               class648.field9463 = class270.field3737.method4238((byte)25) / arg2;
               if (~class648.field9463 <= -2) {
                  break label27;
               }

               class648.field9463 = 1;
               if (!client.field4360) {
                  break label27;
               }
            }

            class192.method1515(arg4, arg1, (byte)-48, arg6, arg0, arg5);
         }

         ++field6462;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6464[3] + (arg0 != null ? field6464[1] : field6464[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(IB)[[I",
      line = 68
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field6460;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            this.method6(11, 72);
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
                  var9[var12] = -var6[var12] + 4096;
                  var10[var12] = -var7[var12] + 4096;
                  var11[var12] = 4096 - var8[var12];
                  ++var12;
               } while(~class430.field6152 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field6464[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(II)[I",
      line = 115
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = 9 / ((24 - arg1) / 44);
         ++field6459;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, arg0);
            int var7 = 0;
            if (var3 || class430.field6152 > var7) {
               do {
                  var5[var7] = 4096 - var6[var7];
                  ++var7;
               } while(class430.field6152 > var7);
            }
         }

         return var5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field6464[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3317(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3318(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
