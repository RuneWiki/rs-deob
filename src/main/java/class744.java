import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class744 {
   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "I"
   )
   private int field10714;
   @OriginalMember(
      owner = "client!pca",
      name = "e",
      descriptor = "I"
   )
   private int field10719;
   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "I"
   )
   private int field10717;
   @OriginalMember(
      owner = "client!pca",
      name = "h",
      descriptor = "I"
   )
   private int field10716;
   @OriginalMember(
      owner = "client!pca",
      name = "j",
      descriptor = "I"
   )
   public int field10726;
   @OriginalMember(
      owner = "client!pca",
      name = "p",
      descriptor = "I"
   )
   public int field10713;
   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "I"
   )
   public int field10730;
   @OriginalMember(
      owner = "client!pca",
      name = "r",
      descriptor = "I"
   )
   public int field10727;
   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "I"
   )
   public int field10723;
   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "I"
   )
   public int field10724;
   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10731 = new String[]{method5402(method5401("VGHZ\u001e\u000e")), method5402(method5401("VGHZ\u0018\u000e")), method5402(method5401("VGHZ`OJ@\u0000b\u000e")), method5402(method5401("VGHZ\u001d\u000e")), method5402(method5401("HQE\u0018")), method5402(method5401("]\n\u0007Z!")), method5402(method5401("VGHZ\u001f\u000e")), method5402(method5401("VGHZ\u0019\u000e"))};
   @OriginalMember(
      owner = "client!pca",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field10718 = false;
   @OriginalMember(
      owner = "client!pca",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field10729 = false;
   @OriginalMember(
      owner = "client!pca",
      name = "k",
      descriptor = "I"
   )
   public static int field10715;
   @OriginalMember(
      owner = "client!pca",
      name = "m",
      descriptor = "I"
   )
   public static int field10720;
   @OriginalMember(
      owner = "client!pca",
      name = "g",
      descriptor = "I"
   )
   public static int field10721;
   @OriginalMember(
      owner = "client!pca",
      name = "o",
      descriptor = "I"
   )
   public static int field10722;
   @OriginalMember(
      owner = "client!pca",
      name = "l",
      descriptor = "I"
   )
   public static int field10725;
   @OriginalMember(
      owner = "client!pca",
      name = "i",
      descriptor = "I"
   )
   public static int field10728;

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5396(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         ++field10722;
         if (!arg0) {
            int var2 = 0;
            if (var1 || ~class16.field293 < ~var2) {
               do {
                  int var3 = class577.field8316[var2];
                  class272 var4 = (class272)class78.field1344.method1572((long)var3, -16289);
                  if (var4 != null) {
                     class451 var5 = var4.field3851;
                     class183.method1613(var5, (byte)-3, var5.field6586.field239);
                  }

                  ++var2;
               } while(~class16.field293 < ~var2);

            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10731[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIIIIIIIIII)V"
   )
   public final void method5397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      try {
         this.field10719 = arg4;
         ++field10721;
         this.field10714 = arg7;
         this.field10716 = arg5;
         this.field10717 = arg8 * arg8;
         this.field10726 = this.field10719 - -arg1;
         if (arg9 <= 25) {
            this.method5399(-16, -118, -106, -22);
         }

         this.field10724 = this.field10716 + arg6;
         this.field10713 = this.field10716 + arg3;
         this.field10723 = this.field10714 + arg2;
         this.field10727 = this.field10719 + arg10;
         this.field10730 = this.field10714 + arg0;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10731[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Luda;B)Lij;"
   )
   public static final class441 method5398(class473 arg0, byte arg1) {
      try {
         if (arg1 > -69) {
            field10729 = false;
         }

         ++field10715;
         return new class441(arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3538(-128), arg0.method3577(-2), arg0.method3577(-2), arg0.method3564((byte)-116));
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10731[6] + (arg0 != null ? field10731[5] : field10731[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method5399(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10728;
         if (this.field10713 <= arg3 && ~arg3 >= ~this.field10724) {
            if (this.field10730 <= arg0 && arg0 <= this.field10723) {
               if (~arg2 <= ~this.field10726 && ~arg2 >= ~this.field10727) {
                  if (arg1 != -7601) {
                     this.field10723 = -2;
                  }

                  int var5 = arg3 - this.field10716;
                  int var6 = -this.field10719 + arg2;
                  return this.field10717 > var5 * var5 + var6 * var6;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10731[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5400(byte arg0) {
      try {
         if (arg0 == 119) {
            if (class600.field8650 != null) {
               class600.field8650.method1559(arg0 ^ -33);
            }

            ++field10725;
            if (class39.field934 != null) {
               class39.field934.method1559(-95);
            }
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10731[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         this.field10714 = arg1;
         this.field10719 = arg2;
         this.field10717 = arg3 * arg3;
         this.field10716 = arg0;
         this.field10726 = this.field10719 + arg8;
         this.field10713 = this.field10716 + arg4;
         this.field10730 = this.field10714 + arg6;
         this.field10727 = this.field10719 + arg9;
         this.field10723 = this.field10714 + arg7;
         this.field10724 = this.field10716 + arg5;
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10731[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5401(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5402(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
