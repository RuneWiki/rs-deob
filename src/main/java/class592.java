import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class592 {
   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8367 = new String[]{method4353(method4352("c=|It")), method4353(method4352("c=|Vt"))};
   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "Ldb;"
   )
   public static class685 field8362 = new class685(7, 8);
   @OriginalMember(
      owner = "client!es",
      name = "f",
      descriptor = "Lfm;"
   )
   public static class164 field8364 = new class164(84, -1);
   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "[J"
   )
   public static long[] field8365 = new long[11];
   @OriginalMember(
      owner = "client!es",
      name = "d",
      descriptor = "[[J"
   )
   public static long[][] field8366 = new long[8][256];
   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "I"
   )
   public static int field8361;
   @OriginalMember(
      owner = "client!es",
      name = "e",
      descriptor = "[Luea;"
   )
   public static class183[] field8363;

   @OriginalMember(
      owner = "client!es",
      name = "d",
      descriptor = "(I)I"
   )
   public abstract int method1549(int arg0);

   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method1548(int arg0);

   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "(B)I"
   )
   public abstract int method1560(byte arg0);

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method1558(int arg0);

   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method4350(int arg0) {
      try {
         ++field8361;
         if (arg0 != 8) {
            field8364 = null;
         }

         return this.method1558(108) || this.method1548(arg0 + 10027) || this.method1551(false);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8367[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "(B)Lsc;"
   )
   public abstract class143 method1554(byte arg0);

   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "(Z)V"
   )
   public abstract void method1552(boolean arg0);

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(Z)Z"
   )
   public abstract boolean method1551(boolean arg0);

   @OriginalMember(
      owner = "client!es",
      name = "d",
      descriptor = "(B)V"
   )
   public abstract void method1557(byte arg0);

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4351(byte arg0) {
      try {
         field8362 = null;
         field8364 = null;
         field8363 = null;
         if (arg0 != -88) {
            method4351((byte)76);
         }

         field8366 = null;
         field8365 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8367[0] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         char var3 = method4353(method4352("ᠥ욦蟪ŉ㛺틳礡鄀悺鯒ꌊ筻ᶲퟄ⸗﹑ᔹ㞷鿶䪆壏⥄뇲殃봁ჲ쭰Ե\ue421䇗Ꝼ閖﮼籠\udd4b䞘쩣뽕굜药挄\uaa3f졋䧟\uf2bf宎驨㋢\ue909헜뻋㐆Ｈ遙‴᪨됚鍰擷獎䀎쎢\udbf3贻靜켭盌홉떩樌䗵ァ㼇ꋬ旦⿆\ude52ﴟ鉳ۖ닠๑抆ꢐ蓮╟萼㤞幾㣐톣\ue22f덳鰘䎛ﰂ凗浟龎繸㮭칟輜럭㳝铱륝ⲁ\ue768쑟噂翧⫩셕\udc57鵪ㄺ\uf614겏ᒽᘼ楇烤탫찞颢⠒\uf8d4")).charAt(var0 / 2);
         long var4 = (long)((var0 & 1) == 0 ? var3 >>> 8 : 255 & var3);
         long var6 = var4 << 1;
         if (var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 << 1;
         if (var8 >= 256L) {
            var8 ^= 285L;
         }

         long var10 = var4 ^ var8;
         long var12 = var8 << 1;
         if (var12 >= 256L) {
            var12 ^= 285L;
         }

         long var14 = var4 ^ var12;
         field8366[0][var0] = class415.method3247(class415.method3247(class415.method3247(var10 << 16, class415.method3247(class415.method3247(var4 << 32, class415.method3247(var8 << 40, class415.method3247(var4 << 56, var4 << 48))), var12 << 24)), var6 << 8), var14);

         for(int var16 = 1; var16 < 8; ++var16) {
            field8366[var16][var0] = class415.method3247(field8366[var16 + -1][var0] << 56, field8366[var16 + -1][var0] >>> 8);
         }
      }

      field8365[0] = 0L;

      for(int var1 = 1; var1 <= 10; ++var1) {
         int var2 = var1 * 8 + -8;
         field8365[var1] = class482.method3683(class482.method3683(class747.method5378(field8366[6][var2 + 6], 65280L), class482.method3683(class482.method3683(class747.method5378(field8366[4][var2 + 4], 4278190080L), class482.method3683(class747.method5378(field8366[3][var2 + 3], 1095216660480L), class482.method3683(class747.method5378(field8366[2][var2 + 2], 280375465082880L), class482.method3683(class747.method5378(-72057594037927936L, field8366[0][var2]), class747.method5378(field8366[1][var2 - -1], 71776119061217280L))))), class747.method5378(field8366[5][var2 - -5], 16711680L))), class747.method5378(255L, field8366[7][var2 - -7]));
      }

   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4353(char[] arg0) {
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
            var10005 = 78;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
