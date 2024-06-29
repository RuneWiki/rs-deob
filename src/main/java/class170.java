import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class170 extends class356 {
   @OriginalMember(
      owner = "client!tba",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2651 = new String[]{method1537(method1536(")+*Zyu")), method1537(method1536(")+*Z~u")), method1537(method1536(")+*Zsu")), method1537(method1536("&geZE")), method1537(method1536("3<'\u0018")), method1537(method1536(")+*Zru")), method1537(method1536(")+*Zpu")), method1537(method1536(")+*Zqu"))};
   @OriginalMember(
      owner = "client!tba",
      name = "D",
      descriptor = "[Z"
   )
   public static boolean[] field2649 = new boolean[200];
   @OriginalMember(
      owner = "client!tba",
      name = "I",
      descriptor = "F"
   )
   public static float field2647;
   @OriginalMember(
      owner = "client!tba",
      name = "B",
      descriptor = "I"
   )
   public static int field2643;
   @OriginalMember(
      owner = "client!tba",
      name = "C",
      descriptor = "I"
   )
   public static int field2644;
   @OriginalMember(
      owner = "client!tba",
      name = "F",
      descriptor = "I"
   )
   public static int field2645;
   @OriginalMember(
      owner = "client!tba",
      name = "H",
      descriptor = "I"
   )
   public static int field2646;
   @OriginalMember(
      owner = "client!tba",
      name = "G",
      descriptor = "I"
   )
   public static int field2650;
   @OriginalMember(
      owner = "client!tba",
      name = "E",
      descriptor = "[B"
   )
   private byte[] field2648;

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1529(int arg0, int arg1, byte arg2) {
      try {
         ++field2646;
         int var4 = arg0 * 2;
         int var5 = 255 & arg2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field2648[var10001] = (byte)(var5 * 3 >> 5);
         if (arg1 < -87) {
            this.field2648[var8] = (byte)(var5 * 3 >> 5);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2651[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(JIII)V"
   )
   public static final void method1530(long arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2645;
         int var5 = 31 & (int)arg0 >> 14;
         int var6 = ((int)arg0 & 3573213) >> 20;
         int var7 = 121 % ((arg3 - 10) / 63);
         int var8 = (int)(arg0 >>> 32) & Integer.MAX_VALUE;
         if (var5 != 10 && ~var5 != -12 && var5 != 22) {
            class681.method4970(0, 0, var5, 0, true, arg2, var6, arg1, 0);
         } else {
            class670 var9;
            int var10;
            int var11;
            label31: {
               var9 = class634.field9256.method2559(var8, 0);
               if (var6 != 0 && ~var6 != -3) {
                  var10 = var9.field9830;
                  var11 = var9.field9807;
                  if (!client.field4564) {
                     break label31;
                  }
               }

               var10 = var9.field9807;
               var11 = var9.field9830;
            }

            int var12 = var9.field9796;
            if (var6 != 0) {
               var12 = (var12 >> 4 - var6) + (15 & var12 << var6);
            }

            class681.method4970(var11, 0, 0, var10, true, arg2, 0, arg1, var12);
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field2651[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIII)[B"
   )
   public final byte[] method1531(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2650;
         this.field2648 = new byte[arg0 * 2 * arg1 * arg2];
         int var5 = 120 / ((74 - arg3) / 32);
         this.method2345(arg1, false, arg0, arg2);
         return this.field2648;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2651[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1532(int arg0, int arg1) {
      try {
         class372.field5541 = arg0;
         class669.field9744 = arg1;
         class580.field8338 = -1;
         ++field2644;
         class265.field3776 = 3;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2651[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIZLjava/lang/String;)V"
   )
   public static final void method1533(int arg0, int arg1, boolean arg2, String arg3) {
      try {
         class528.method3955(-105);
         ++field2643;
         class478.method3618(-102);
         class450.method3389(-4925);
         class495.method3737(arg3, arg1, (byte)-85, arg2);
         class196.method1697((byte)120);
         class155.method1436(arg0 ^ -11506, class444.field6473);
         class259.method2080(12, class444.field6473);
         class420.method3195(class392.field5782, arg0 + -86, class444.field6473);
         class368.method2871((byte)-123);
         class238.method1947(false, class150.field2414);
         class585.method4337((byte)108);
         class416.method3174(false);
         if (~class376.field5588 == arg0) {
            class645.method4735(4, -128);
         } else if (class376.field5588 != 7) {
            if (~class376.field5588 == -11) {
               class645.method4735(11, -119);
            } else {
               if (~class376.field5588 == -2 || ~class376.field5588 == -3) {
                  class206.method1754(false);
               }

            }
         } else {
            class645.method4735(8, -119);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2651[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2651[3] : field2651[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "<init>",
      descriptor = "()V"
   )
   public class170() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1534(int arg0, int arg1, int arg2) {
      boolean var3 = class90.field1473[0][arg1][arg2] != null && class90.field1473[0][arg1][arg2].field8656 != null;

      for(int var4 = arg0; var4 >= 0; --var4) {
         if (class90.field1473[var4][arg1][arg2] == null) {
            class600 var5 = class90.field1473[var4][arg1][arg2] = new class600(var4);
            if (var3) {
               ++var5.field8664;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1535(boolean arg0) {
      try {
         field2649 = null;
         if (!arg0) {
            method1534(-23, 18, 126);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2651[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1536(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1537(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
