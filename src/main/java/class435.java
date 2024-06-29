import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class435 {
   @OriginalMember(
      owner = "client!uw",
      name = "h",
      descriptor = "I"
   )
   private int field6289;
   @OriginalMember(
      owner = "client!uw",
      name = "j",
      descriptor = "I"
   )
   public int field6288;
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6293 = new String[]{method3275(method3274("B+_L'")), method3275(method3274("B+_O'")), method3275(method3274("Lr_ r")), method3275(method3274("Y)\u001db")), method3275(method3274("B+_M'")), method3275(method3274("B+_z`d(\u0003gaPt")), method3275(method3274("B+_J'")), method3275(method3274("B+_2fY5\u00050'"))};
   @OriginalMember(
      owner = "client!uw",
      name = "e",
      descriptor = "[J"
   )
   public static long[] field6283 = new long[11];
   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "[[J"
   )
   public static long[][] field6285 = new long[8][256];
   @OriginalMember(
      owner = "client!uw",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field6291;
   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "I"
   )
   public static int field6284;
   @OriginalMember(
      owner = "client!uw",
      name = "g",
      descriptor = "I"
   )
   public static int field6286;
   @OriginalMember(
      owner = "client!uw",
      name = "f",
      descriptor = "I"
   )
   public static int field6287;
   @OriginalMember(
      owner = "client!uw",
      name = "i",
      descriptor = "I"
   )
   public static int field6290;
   @OriginalMember(
      owner = "client!uw",
      name = "d",
      descriptor = "I"
   )
   public static int field6292;

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3270(int arg0) {
      try {
         if (arg0 != -3177) {
            this.field6288 = 85;
         }

         ++field6284;
         return this.field6289;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6293[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3271(byte arg0) {
      try {
         if (arg0 < 63) {
            method3273(-65, (byte[][])null, (class363)null);
         }

         field6291 = null;
         field6283 = null;
         field6285 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6293[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6287;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6293[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3272(byte arg0) throws class328 {
      try {
         label20: {
            if (~class402.field5939 == -2) {
               class393.field5787.method393(class601.field8673, class490.field7149);
               if (!client.field4564) {
                  break label20;
               }
            }

            class393.field5787.method393(0, 0);
         }

         ++field6286;
         if (arg0 != -64) {
            field6285 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6293[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I[[BLgha;)V"
   )
   public static final void method3273(int param0, byte[][] param1, class363 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uw",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class435(int arg0, int arg1) {
      try {
         this.field6289 = arg0;
         this.field6288 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6293[7] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         char var3 = method3275(method3274("᠔운蟉Ł㚩틂礳鄣悲鮁ꌻ筩ᶑퟌ⹄﹠ᔫ㞔鿾䫕壾⥖뇑残뵒Ⴣ쭢Ԗ\ue429䆄Ꝋ閄ﮟ籨\udd18䞩쩱뽶굔茼挵ꨭ졨䧗\uf2ec宿驺㋁\ue901햏뻺㐔＋遑\u2067᪙됈鍓擿猝䀿쎰\udbd0贳霏켜盞홪떡機䗄コ㼤ꋤ斵⿷\ude40ﴼ鉻څ닑ใ报ꢘ流╮萮㤽并㢃톒\ue23d덐鰐䏈ﰳ凅浼𣏕縫㮜칍輿럥㲎铀륏Ⲣ\ue760쐌噳翵⫊셝\udc04鵛ㄨ\uf637겇ᓮᘍ楕烇탣챍颓⠀\uf8f7")).charAt(var0 / 2);
         long var4 = (long)((var0 & 1) != 0 ? 255 & var3 : var3 >>> 8);
         long var6 = var4 << 1;
         if (var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 << 1;
         if (var8 >= 256L) {
            var8 ^= 285L;
         }

         long var10 = var8 ^ var4;
         long var12 = var8 << 1;
         if (var12 >= 256L) {
            var12 ^= 285L;
         }

         long var14 = var12 ^ var4;
         field6285[0][var0] = class174.method1550(var14, class174.method1550(class174.method1550(class174.method1550(class174.method1550(class174.method1550(class174.method1550(var4 << 56, var4 << 48), var8 << 40), var4 << 32), var12 << 24), var10 << 16), var6 << 8));

         for(int var16 = 1; var16 < 8; ++var16) {
            field6285[var16][var0] = class174.method1550(field6285[var16 + -1][var0] << 56, field6285[var16 - 1][var0] >>> 8);
         }
      }

      field6283[0] = 0L;

      for(int var1 = 1; ~var1 >= -11; ++var1) {
         int var2 = (var1 + -1) * 8;
         field6283[var1] = class707.method5129(class490.method3701(255L, field6285[7][var2 + 7]), class707.method5129(class707.method5129(class707.method5129(class490.method3701(field6285[4][var2 + 4], 4278190080L), class707.method5129(class707.method5129(class490.method3701(280375465082880L, field6285[2][var2 + 2]), class707.method5129(class490.method3701(field6285[0][var2], -72057594037927936L), class490.method3701(71776119061217280L, field6285[1][var2 + 1]))), class490.method3701(1095216660480L, field6285[3][var2 + 3]))), class490.method3701(field6285[5][var2 - -5], 16711680L)), class490.method3701(65280L, field6285[6][var2 - -6])));
      }

      field6291 = new class435(30, 7);
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3274(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3275(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
