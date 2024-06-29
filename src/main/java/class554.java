import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class554 extends class264 {
   @OriginalMember(
      owner = "client!hr",
      name = "H",
      descriptor = "I"
   )
   private int field7933 = 585;
   @OriginalMember(
      owner = "client!hr",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7937 = new String[]{method3974(method3973("fVM3=")), method3974(method3973("s\r\u000fq")), method3974(method3973("u\nM\\h")), method3974(method3973("u\nM^h")), method3974(method3973("u\nM_h"))};
   @OriginalMember(
      owner = "client!hr",
      name = "I",
      descriptor = "D"
   )
   public static double field7936;
   @OriginalMember(
      owner = "client!hr",
      name = "F",
      descriptor = "I"
   )
   public static int field7932;
   @OriginalMember(
      owner = "client!hr",
      name = "J",
      descriptor = "I"
   )
   public static int field7934;
   @OriginalMember(
      owner = "client!hr",
      name = "G",
      descriptor = "I"
   )
   public static int field7935;

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         ++field7932;
         if (arg0 == 0) {
            this.field7933 = arg1.method1211(-26166);
         }

         if (arg2 < 49) {
            this.field7933 = 118;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7937[2] + arg0 + ',' + (arg1 != null ? field7937[0] : field7937[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = -63 / ((24 - arg1) / 44);
         ++field7935;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = class666.field9668[arg0];
            int var7 = 0;
            if (var3 || ~class430.field6152 < ~var7) {
               do {
                  int var8 = class258.field3496[var7];
                  if (var8 > this.field7933 && ~var8 > ~(-this.field7933 + 4096) && ~var6 < ~(-this.field7933 + 2048) && ~(this.field7933 + 2048) < ~var6) {
                     int var9 = 2048 - var8;
                     int var10 = ~var9 <= -1 ? var9 : -var9;
                     int var11 = var10 << 12;
                     int var12 = var11 / (-this.field7933 + 2048);
                     var5[var7] = -var12 + 4096;
                     if (!var3) {
                        ++var7;
                        continue;
                     }
                  }

                  if (-this.field7933 + 2048 < var8 && ~var8 > ~(this.field7933 + 2048)) {
                     int var13 = var6 + -2048;
                     int var14 = ~var13 > -1 ? -var13 : var13;
                     int var15 = var14 - this.field7933;
                     int var16 = var15 << 12;
                     var5[var7] = var16 / (-this.field7933 + 2048);
                     if (!var3) {
                        ++var7;
                        continue;
                     }
                  }

                  label100: {
                     int var10000;
                     int var17;
                     if (~this.field7933 >= ~var6) {
                        if (~var6 >= ~(-this.field7933 + 4096)) {
                           break label100;
                        }

                        var17 = var8 + -2048;
                        var10000 = ~var17 <= -1 ? var17 : -var17;
                     } else {
                        var17 = var8 + -2048;
                        var10000 = ~var17 <= -1 ? var17 : -var17;
                     }

                     int var18 = var10000;
                     int var19 = var18 - this.field7933;
                     int var20 = var19 << 12;
                     var5[var7] = var20 / (-this.field7933 + 2048);
                     if (!var3) {
                        ++var7;
                        continue;
                     }
                  }

                  if (~var8 <= ~this.field7933 && var8 <= 4096 - this.field7933) {
                     var5[var7] = 0;
                     ++var7;
                  } else {
                     int var21 = -var6 + 2048;
                     int var22 = ~var21 <= -1 ? var21 : -var21;
                     int var23 = var22 << 12;
                     int var24 = var23 / (-this.field7933 + 2048);
                     var5[var7] = -var24 + 4096;
                     if (var3) {
                        var5[var7] = 0;
                        ++var7;
                     } else {
                        ++var7;
                     }
                  }
               } while(~class430.field6152 < ~var7);
            }
         }

         return var5;
      } catch (RuntimeException var26) {
         throw class237.method1823(var26, field7937[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(BLwf;)Lae;"
   )
   public static final class264 method3972(byte arg0, class147 arg1) {
      boolean var2 = client.field4360;

      try {
         arg1.method1143(-15465);
         ++field7934;
         int var3 = arg1.method1143(-15465);
         int var4 = -12 / ((arg0 - -12) / 45);
         class264 var5 = class486.method3524(-97, var3);
         var5.field3647 = arg1.method1143(-15465);
         int var6 = arg1.method1143(-15465);
         int var7 = 0;
         if (!var2 && var6 <= var7) {
            var5.method413(127);
            return var5;
         } else {
            do {
               int var8 = arg1.method1143(-15465);
               var5.method3(var8, arg1, 73);
               ++var7;
            } while(var6 > var7);

            var5.method413(127);
            return var5;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field7937[3] + arg0 + ',' + (arg1 != null ? field7937[0] : field7937[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "()V"
   )
   public class554() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3973(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3974(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
