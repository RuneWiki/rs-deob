import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class368 extends class302 {
   @OriginalMember(
      owner = "client!ak",
      name = "Z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5550 = new String[]{method2862(method2861("g\"6\u0002\u0011")), method2862(method2861("g\"6\u0000\u0011")), method2862(method2861("g\"6\u0003\u0011")), method2862(method2861("g\"6mPh lo\u0011")), method2862(method2861("g\"6\u0013\u0011")), method2862(method2861("h<t=")), method2862(method2861("}g6\u007fD")), method2862(method2861("g\"6\u0017\u0011")), method2862(method2861("g\"6\u0012\u0011")), method2862(method2861("g\"6\u0016\u0011")), method2862(method2861("g\"6\u0014\u0011"))};
   @OriginalMember(
      owner = "client!ak",
      name = "W",
      descriptor = "[S"
   )
   private static short[] field5535 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!ak",
      name = "R",
      descriptor = "[S"
   )
   private static short[] field5542 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!ak",
      name = "X",
      descriptor = "[I"
   )
   public static int[] field5543 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   @OriginalMember(
      owner = "client!ak",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field5539 = new int[5];
   @OriginalMember(
      owner = "client!ak",
      name = "L",
      descriptor = "[S"
   )
   private static short[] field5544 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!ak",
      name = "T",
      descriptor = "[S"
   )
   private static short[] field5541 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!ak",
      name = "Q",
      descriptor = "[[S"
   )
   public static short[][] field5548 = new short[][]{field5544, field5535, field5542, field5541};
   @OriginalMember(
      owner = "client!ak",
      name = "N",
      descriptor = "I"
   )
   public static int field5532;
   @OriginalMember(
      owner = "client!ak",
      name = "J",
      descriptor = "I"
   )
   public static int field5533;
   @OriginalMember(
      owner = "client!ak",
      name = "O",
      descriptor = "I"
   )
   private int field5534;
   @OriginalMember(
      owner = "client!ak",
      name = "Y",
      descriptor = "I"
   )
   public static int field5536;
   @OriginalMember(
      owner = "client!ak",
      name = "I",
      descriptor = "I"
   )
   public static int field5537;
   @OriginalMember(
      owner = "client!ak",
      name = "K",
      descriptor = "I"
   )
   private int field5538;
   @OriginalMember(
      owner = "client!ak",
      name = "P",
      descriptor = "I"
   )
   public static int field5545;
   @OriginalMember(
      owner = "client!ak",
      name = "V",
      descriptor = "I"
   )
   public static int field5546;
   @OriginalMember(
      owner = "client!ak",
      name = "U",
      descriptor = "I"
   )
   private int field5547;
   @OriginalMember(
      owner = "client!ak",
      name = "S",
      descriptor = "I"
   )
   public static int field5549;
   @OriginalMember(
      owner = "client!ak",
      name = "M",
      descriptor = "[Lida;"
   )
   public static class246[] field5540;

   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2855(boolean arg0) {
      try {
         field5544 = null;
         field5542 = null;
         field5541 = null;
         if (!arg0) {
            field5535 = null;
            field5539 = null;
            field5540 = null;
            field5543 = null;
            field5548 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5550[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method2856(int arg0, int arg1) {
      try {
         this.field5538 = 4080 & arg1 << 4;
         this.field5534 = (65280 & arg1) >> 4;
         ++field5533;
         this.field5547 = 4080 & arg1 >> 12;
         if (arg0 > -78) {
            this.field5534 = 56;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5550[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field5537;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 != 0 || ~var8 > ~class344.field5238) {
               do {
                  var5[var8] = this.field5547;
                  var6[var8] = this.field5534;
                  var7[var8] = this.field5538;
                  ++var8;
               } while(~var8 > ~class344.field5238);
            }
         }

         if (arg0 != -90) {
            method2855(false);
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5550[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method2857(byte arg0) {
      try {
         ++field5549;
         int var1 = -93 / ((31 - arg0) / 59);
         class497.field7359 = true;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5550[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method2858(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field5546;
         if (class377.field5711 == null) {
            return 0;
         } else {
            int var4 = arg2 >> 9;
            int var5 = arg0 >> 9;
            if (var4 >= 0 && ~var5 <= -1 && ~var4 >= ~(class323.field4603 + -1) && var5 <= class178.field2197 + -1) {
               if (arg1 != -11) {
                  method2859(90, (byte)-82, -25);
               }

               int var6 = arg3;
               if (~arg3 > -4 && ~(class65.field797[1][var4][var5] & 2) != -1) {
                  var6 = arg3 + 1;
               }

               return class377.field5711[var6].method2236((byte)122, arg2, arg0);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5550[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "<init>",
      descriptor = "()V"
   )
   public class368() {
      this(0);
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field5532;
         if (arg1 != 0) {
            this.method2856(-46, 65);
         }

         if (~arg0 == -1) {
            this.method2856(-117, arg2.method1077(arg1 ^ -33));
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5550[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5550[6] : field5550[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method2859(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -62) {
            return true;
         } else {
            ++field5536;
            return (55 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5550[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class368(int arg0) {
      super(0, false);

      try {
         this.method2856(-128, arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5550[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method2860(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 20428) {
            return false;
         } else {
            ++field5545;
            return (class177.method1399(13370, arg0, arg1) | class597.method4372(arg0, arg1, (byte)-44) | class209.method1592(arg1, arg0, (byte)107)) & class183.method1434(arg0, 127, arg1);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5550[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2861(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2862(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
