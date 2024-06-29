import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class107 extends class414 {

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "Lui;")
    public static class375 field1512 = new class375("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
    public static int field1517 = -1;

    @OriginalMember(owner = "client!ev", name = "D", descriptor = "Lcm;")
    public static class449 field1520 = new class449(60, 0);

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "J")
    public long field1514;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "[[B")
    public static byte[][] field1508;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)I")
    public final int method712(int arg0) {
        if (arg0 <= 9) {
            field1517 = 122;
        }
        field1515++;
        return this.field1511;
    }

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "(I)V")
    public static void method713(int arg0) {
        field1512 = null;
        field1508 = null;
        field1520 = null;
        int var1 = -45 % ((arg0 + 38) / 60);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lo;)V")
    public static final void method714(class138 arg0) {
        if (class309.field4630 >= 65535) {
            return;
        }
        class471 var1 = arg0.field2020;
        class515.field7632[class309.field4630] = arg0;
        class473.field6909[class309.field4630] = false;
        class309.field4630++;
        int var2 = arg0.field2015;
        if (arg0.field2022) {
            var2 = 0;
        }
        int var3 = arg0.field2015;
        if (arg0.field2001) {
            var3 = class222.field3107 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2832(15) + class380.field5804 - var1.method2830(126) >> class386.field5882;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2832(15) + var1.method2830(124) - class380.field5804 >> class386.field5882;
            if (var7 >= class285.field4248) {
                var7 = class285.field4248 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field2010[var5++];
                int var10 = (var1.method2827(23087) + class380.field5804 - var1.method2830(127) >> class386.field5882) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class492.field7186) {
                    var11 = class492.field7186 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class467.field6805[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class467.field6805[var4][var12][var8] = var13 | (long) class309.field4630;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class467.field6805[var4][var12][var8] = var13 | (long) class309.field4630 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class467.field6805[var4][var12][var8] = var13 | (long) class309.field4630 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class467.field6805[var4][var12][var8] = var13 | (long) class309.field4630 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)I")
    public final int method715(byte arg0) {
        field1510++;
        int var2 = 100 % ((arg0 - 44) / 32);
        return this.field1509;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)J")
    public final long method716(int arg0) {
        int var2 = -41 / ((-arg0 - 58) / 33);
        field1516++;
        return this.field1514;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)I")
    public final int method717(int arg0) {
        if (arg0 != 18591) {
            field1512 = null;
        }
        field1518++;
        return this.field1521;
    }
}
