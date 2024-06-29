import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends class302 {
   @OriginalMember(
      owner = "client!rk",
      name = "M",
      descriptor = "I"
   )
   private int field385 = -1;
   @OriginalMember(
      owner = "client!rk",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field387 = new String[]{method247(method246("\u000b\u0004*w=")), method247(method246("\u000b\u0004*q=")), method247(method246("\u000b\u0004*|=")), method247(method246("\u0002A*\u0010h")), method247(method246("\u000b\u0004*x=")), method247(method246("\u0017\u001ahR")), method247(method246("\u000b\u0004*u="))};
   @OriginalMember(
      owner = "client!rk",
      name = "P",
      descriptor = "I"
   )
   private int field378;
   @OriginalMember(
      owner = "client!rk",
      name = "L",
      descriptor = "I"
   )
   public static int field379;
   @OriginalMember(
      owner = "client!rk",
      name = "H",
      descriptor = "I"
   )
   public static int field380;
   @OriginalMember(
      owner = "client!rk",
      name = "I",
      descriptor = "I"
   )
   public static int field381;
   @OriginalMember(
      owner = "client!rk",
      name = "N",
      descriptor = "I"
   )
   public static int field382;
   @OriginalMember(
      owner = "client!rk",
      name = "K",
      descriptor = "I"
   )
   public static int field383;
   @OriginalMember(
      owner = "client!rk",
      name = "J",
      descriptor = "I"
   )
   private int field386;
   @OriginalMember(
      owner = "client!rk",
      name = "O",
      descriptor = "[I"
   )
   private int[] field384;

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method241(boolean arg0) {
      try {
         ++field381;
         super.method241(arg0);
         this.field384 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field387[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method242(int arg0, int arg1, boolean arg2) {
      try {
         ++field382;
         super.method242(arg0, arg1, arg2);
         if (~this.field385 <= -1 && class704.field10551 != null) {
            int var4 = class704.field10551.method1159(this.field385, 123).field4646 ? 64 : 128;
            this.field384 = class704.field10551.method1166((byte)89, 1.0F, var4, var4, false, this.field385);
            this.field378 = var4;
            this.field386 = var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field387[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method243(int arg0) {
      try {
         ++field380;
         if (arg0 != -1) {
            this.field385 = 118;
         }

         return this.field385;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field387[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         if (arg1 != 0) {
            this.method242(15, -128, true);
         }

         if (~arg0 == -1) {
            this.field385 = arg2.method1038((byte)-119);
         }

         ++field383;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field387[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field387[3] : field387[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field379;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            int var5 = (~class501.field7439 == ~this.field378 ? arg1 : this.field378 * arg1 / class501.field7439) * this.field386;
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class344.field5238 == ~this.field386) {
               int var9 = 0;
               if (var3 != 0 || var9 < class344.field5238) {
                  do {
                     int var10 = this.field384[var5++];
                     var8[var9] = class153.method1262(var10 << 4, 4080);
                     var7[var9] = class153.method1262(var10 >> 4, 4080);
                     var6[var9] = class153.method1262(4080, var10 >> 12);
                     ++var9;
                  } while(var9 < class344.field5238);
               }

               if (var3 == 0) {
                  return arg0 != -90 ? null : var4;
               }
            }

            int var11 = 0;
            if (var3 != 0 || class344.field5238 > var11) {
               do {
                  int var12 = this.field386 * var11 / class344.field5238;
                  int var13 = this.field384[var5 + var12];
                  var8[var11] = class153.method1262(4080, var13 << 4);
                  var7[var11] = class153.method1262(var13, 65280) >> 4;
                  var6[var11] = class153.method1262(16711680, var13) >> 12;
                  ++var11;
               } while(class344.field5238 > var11);
            }
         }

         return arg0 != -90 ? null : var4;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field387[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "()V"
   )
   public class35() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method246(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method247(char[] arg0) {
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
            var10005 = 111;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
