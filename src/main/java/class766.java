import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class766 {
   @OriginalMember(
      owner = "client!pg",
      name = "l",
      descriptor = "I"
   )
   public int field11045 = 0;
   @OriginalMember(
      owner = "client!pg",
      name = "j",
      descriptor = "I"
   )
   public int field11058 = 0;
   @OriginalMember(
      owner = "client!pg",
      name = "h",
      descriptor = "Ltv;"
   )
   private class590 field11050 = new class590(64);
   @OriginalMember(
      owner = "client!pg",
      name = "p",
      descriptor = "Lav;"
   )
   private class669 field11062 = null;
   @OriginalMember(
      owner = "client!pg",
      name = "m",
      descriptor = "Lqh;"
   )
   private class74 field11060;
   @OriginalMember(
      owner = "client!pg",
      name = "c",
      descriptor = "Lqh;"
   )
   private class74 field11055;
   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11063 = new String[]{method5498(method5497("!*(\u0004")), method5498(method5497("4qjFI")), method5498(method5497("?8jT]!60V\u001c")), method5498(method5497("?8j+\u001c")), method5498(method5497("?8j,\u001c")), method5498(method5497("?8j)\u001c")), method5498(method5497("?8j*\u001c"))};
   @OriginalMember(
      owner = "client!pg",
      name = "o",
      descriptor = "I"
   )
   public static int field11046 = -1;
   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field11047 = false;
   @OriginalMember(
      owner = "client!pg",
      name = "e",
      descriptor = "I"
   )
   public static int field11053 = 0;
   @OriginalMember(
      owner = "client!pg",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field11051 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!pg",
      name = "b",
      descriptor = "I"
   )
   public static int field11059 = 0;
   @OriginalMember(
      owner = "client!pg",
      name = "f",
      descriptor = "I"
   )
   public static int field11061 = 0;
   @OriginalMember(
      owner = "client!pg",
      name = "k",
      descriptor = "F"
   )
   public static float field11057;
   @OriginalMember(
      owner = "client!pg",
      name = "g",
      descriptor = "I"
   )
   public static int field11048;
   @OriginalMember(
      owner = "client!pg",
      name = "q",
      descriptor = "I"
   )
   public static int field11049;
   @OriginalMember(
      owner = "client!pg",
      name = "d",
      descriptor = "I"
   )
   public static int field11052;
   @OriginalMember(
      owner = "client!pg",
      name = "i",
      descriptor = "I"
   )
   public static int field11054;
   @OriginalMember(
      owner = "client!pg",
      name = "n",
      descriptor = "I"
   )
   public static int field11056;

   @OriginalMember(
      owner = "client!pg",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5493(byte arg0) {
      try {
         ++field11048;
         class347.field4965.method3635((byte)-81);
         class221.field2760.method3753((byte)-59);
         class261.field3341.method2420(-80);
         class472.field6533.method3588((byte)120);
         class742.field10813.method2434(1134059266);
         class645.field9054.method476((byte)52);
         if (arg0 <= 55) {
            field11059 = -116;
         }

         class392.field5479.method1476(2);
         class516.field7085.method1483((byte)-84);
         class402.field5645.method2783((byte)85);
         class517.field7093.method3273(-22540);
         class427.field5966.method3289(118);
         class437.field6062.method2891(54);
         class581.field7984.method3693((byte)-75);
         class599.field8358.method2382((byte)41);
         class25.field315.method5231(8);
         class716.field10503.method2231(-16777216);
         class717.field10511.method5458((byte)118);
         class371.field5238.method1965(0);
         class212.field2634.method3321((byte)3);
         class757.field10971.method5135((byte)81);
         class694.field10144.method3218(67);
         class24.field302.method3899((byte)-15);
         class477.field6598.method1530((byte)106);
         class396.method3014((byte)-122);
         class450.method3335((byte)63);
         class679.method4968(-119);
         class663.method4801(true);
         class22.method186(true);
         class412.field5799.method4244(true);
         class670.field9690.method4244(true);
         class661.field9435.method4244(true);
         class679.field9963.method4244(true);
         class16.field225.method4244(true);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11063[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(IJ[ILdd;)Ljava/lang/String;"
   )
   public final String method5494(int arg0, long arg1, int[] arg2, class735 arg3) {
      try {
         int var6 = -111 % ((59 - arg0) / 47);
         ++field11054;
         if (this.field11062 != null) {
            String var7 = this.field11062.method4832(arg2, (byte)115, arg3, arg1);
            if (var7 != null) {
               return var7;
            }
         }

         return Long.toString(arg1);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field11063[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11063[1] : field11063[0]) + ',' + (arg3 != null ? field11063[1] : field11063[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(IZ)Ldt;"
   )
   public final class253 method5495(int arg0, boolean arg1) {
      try {
         ++field11049;
         class253 var3 = (class253)this.field11050.method4239((long)arg0, 0);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label29: {
               if (arg0 < 32768) {
                  var4 = this.field11055.method732(arg0, 1, (byte)113);
                  if (!client.field4273) {
                     break label29;
                  }
               }

               var4 = this.field11060.method732(arg0 & 32767, 1, (byte)90);
            }

            class253 var5 = new class253();
            var5.field3216 = this;
            if (arg1) {
               return null;
            } else {
               if (var4 != null) {
                  var5.method1921(new class594(var4), -1);
               }

               if (arg0 >= 32768) {
                  var5.method1925((byte)96);
               }

               this.field11050.method4238(47, var5, (long)arg0);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field11063[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5496(byte arg0) {
      try {
         field11051 = null;
         if (arg0 != 109) {
            field11056 = 125;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11063[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "<init>",
      descriptor = "(ILqh;Lqh;Lav;)V"
   )
   public class766(int arg0, class74 arg1, class74 arg2, class669 arg3) {
      try {
         this.field11060 = arg2;
         this.field11062 = arg3;
         this.field11055 = arg1;
         if (this.field11055 != null) {
            this.field11058 = this.field11055.method727(1, -32767);
         }

         if (this.field11060 != null) {
            this.field11045 = this.field11060.method727(1, -32767);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11063[2] + arg0 + ',' + (arg1 != null ? field11063[1] : field11063[0]) + ',' + (arg2 != null ? field11063[1] : field11063[0]) + ',' + (arg3 != null ? field11063[1] : field11063[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5497(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5498(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
