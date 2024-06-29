import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class704 extends class302 {
   @OriginalMember(
      owner = "client!ee",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10552 = new String[]{method5125(method5124("\u0013\u0002,W0")), method5125(method5124("\u0013\u0002,C0")), method5125(method5124("\u0013\u0002,G0")), method5125(method5124("\u0018\u0012nj")), method5125(method5124("\u0013\u0002,E0")), method5125(method5124("\rI,(e")), method5125(method5124("\u0013\u0002,A0"))};
   @OriginalMember(
      owner = "client!ee",
      name = "O",
      descriptor = "S"
   )
   public static short field10547 = 1;
   @OriginalMember(
      owner = "client!ee",
      name = "H",
      descriptor = "Lsda;"
   )
   public static class269 field10546 = new class269(65, -1);
   @OriginalMember(
      owner = "client!ee",
      name = "M",
      descriptor = "I"
   )
   public static int field10544;
   @OriginalMember(
      owner = "client!ee",
      name = "N",
      descriptor = "I"
   )
   public static int field10545;
   @OriginalMember(
      owner = "client!ee",
      name = "L",
      descriptor = "I"
   )
   public static int field10548;
   @OriginalMember(
      owner = "client!ee",
      name = "J",
      descriptor = "I"
   )
   public static int field10550;
   @OriginalMember(
      owner = "client!ee",
      name = "I",
      descriptor = "J"
   )
   public static long field10549;
   @OriginalMember(
      owner = "client!ee",
      name = "K",
      descriptor = "Ld;"
   )
   public static class160 field10551;

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "([[[Lqr;ZZIII)Z"
   )
   public static final boolean method5120(class72[][][] param0, boolean param1, boolean param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(BII)I"
   )
   private final int method5121(byte arg0, int arg1, int arg2) {
      try {
         ++field10545;
         int var4 = 59 / ((-56 - arg0) / 47);
         int var5 = arg1 * 57 + arg2;
         int var6 = var5 ^ var5 << 1;
         return -(((var6 * 15731 * var6 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10552[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5122(byte arg0) {
      try {
         if (arg0 >= 27) {
            field10546 = null;
            field10551 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10552[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "<init>",
      descriptor = "()V"
   )
   public class704() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field10548;
         if (arg1 >= -37) {
            return null;
         } else {
            int[] var4 = super.field4298.method3175(arg0, (byte)-127);
            if (super.field4298.field6356) {
               int var5 = class23.field241[arg0];
               int var6 = 0;
               if (var3 != 0 || ~var6 > ~class344.field5238) {
                  do {
                     var4[var6] = this.method5121((byte)-126, var5, class757.field11167[var6]) % 4096;
                     ++var6;
                  } while(~var6 > ~class344.field5238);
               }
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10552[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method5123(boolean arg0) {
      try {
         ++field10550;
         if (arg0) {
            method5123(true);
         }

         class382.field5863 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10552[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5124(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5125(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
