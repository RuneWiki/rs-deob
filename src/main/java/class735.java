import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class735 extends class673 {
   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10731 = new String[]{method5324(method5323("}\u0011HYY")), method5324(method5323("}\u0011H\\Y")), method5324(method5323("}\u0011H^Y")), method5324(method5323("i\u0005\nq")), method5324(method5323("|^H3\f")), method5324(method5323("}\u0011H_Y")), method5324(method5323("}\u0011HXY"))};
   @OriginalMember(
      owner = "client!za",
      name = "r",
      descriptor = "Laka;"
   )
   public static class418 field10724 = new class418(142, 1);
   @OriginalMember(
      owner = "client!za",
      name = "q",
      descriptor = "Lsp;"
   )
   public static class774 field10729 = new class774();
   @OriginalMember(
      owner = "client!za",
      name = "o",
      descriptor = "I"
   )
   public static int field10725;
   @OriginalMember(
      owner = "client!za",
      name = "l",
      descriptor = "I"
   )
   public static int field10726;
   @OriginalMember(
      owner = "client!za",
      name = "n",
      descriptor = "I"
   )
   public static int field10728;
   @OriginalMember(
      owner = "client!za",
      name = "p",
      descriptor = "I"
   )
   public static int field10730;
   @OriginalMember(
      owner = "client!za",
      name = "m",
      descriptor = "J"
   )
   public static long field10727;

   @OriginalMember(
      owner = "client!za",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method5318(int arg0, int arg1, int arg2) {
      try {
         ++field10730;
         class487 var3 = class2.method12((long)arg0, 6, (byte)43);
         var3.method3694(-21792);
         int var4 = 125 % ((arg1 - 53) / 63);
         var3.field6794 = arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10731[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5319(int arg0) {
      try {
         if (arg0 != 657) {
            method5319(-51);
         }

         field10729 = null;
         field10724 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10731[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method5320(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field1481;

      try {
         ++field10726;
         if (arg2 > -88) {
            field10724 = null;
         }

         int var4 = 0;
         if (var3) {
            var4 = var4 << 1 | 1 & arg0;
            arg0 >>>= 1;
            --arg1;
         }

         while(true) {
            while(~arg1 < -1) {
               var4 = var4 << 1 | 1 & arg0;
               arg0 >>>= 1;
               --arg1;
            }

            if (!var3) {
               return var4;
            }

            arg0 = var4;
            --arg1;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10731[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5321(int arg0, int arg1, int arg2) {
      try {
         ++field10728;
         if (arg2 <= 125) {
            method5321(-35, 19, 122);
         }

         return ~(arg1 & 34) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10731[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V"
   )
   public static final void method5322(String arg0, int arg1, String arg2, boolean arg3, int arg4) {
      try {
         ++field10725;
         class702 var5 = class21.method162((byte)27);
         var5.field10264.method593(class561.field8222.field69, 867770704);
         var5.field10264.method611(0, -1344798296);
         int var6 = var5.field10264.field864;
         var5.field10264.method611(657, arg4 + -1344779934);
         int[] var7 = class774.method5587(-11, var5);
         int var8 = var5.field10264.field864;
         var5.field10264.method595(-15010, arg0);
         var5.field10264.method611(class311.field4331, arg4 + -1344779934);
         var5.field10264.method595(arg4 + 3352, arg2);
         var5.field10264.method596((byte)-46, class390.field5408);
         if (arg4 != -18362) {
            method5321(24, -82, 28);
         }

         var5.field10264.method593(class782.field11389, 867770704);
         var5.field10264.method593(class688.field10127.field6966, 867770704);
         class541.method4092(arg4 ^ 18361, var5.field10264);
         String var9 = class539.field7894;
         var5.field10264.method593(var9 != null ? 1 : 0, 867770704);
         if (var9 != null) {
            var5.field10264.method595(arg4 ^ 32024, var9);
         }

         var5.field10264.method593(arg1, arg4 ^ -867788522);
         var5.field10264.method593(arg3 ? 1 : 0, 867770704);
         var5.field10264.field864 += 7;
         var5.field10264.method646(var7, (byte)-111, var8, var5.field10264.field864);
         var5.field10264.method615(123, var5.field10264.field864 - var6);
         class387.field5363.method4423(var5, (byte)119);
         class337.field4609 = -3;
         client.field1476 = 0;
         class795.field11627 = 0;
         class571.field8393 = 1;
         if (~arg1 > -14) {
            class726.field10603 = true;
            class565.method4245(-12121);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field10731[5] + (arg0 != null ? field10731[4] : field10731[3]) + ',' + arg1 + ',' + (arg2 != null ? field10731[4] : field10731[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!za",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
