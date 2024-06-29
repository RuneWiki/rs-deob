import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class67 {

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "Lrd;")
    public static class114 field1388 = class84.method656("(Udns", (byte) 122);

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lmd;")
    public static class84 field1394 = new class84();

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "Lrd;")
    private static class114 field1407 = class84.method656("RuneScape has been updated(Q", (byte) 126);

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "Lrd;")
    private static class114 field1410 = class84.method656("Unexpected server response", (byte) 120);

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lrd;")
    public static class114 field1412 = class84.method656(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 120);

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Lrd;")
    public static class114 field1414 = class84.method656("Lade Titelbild )2 ", (byte) 114);

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lrd;")
    public static class114 field1415 = field1407;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lrd;")
    public static class114 field1411 = field1410;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lbd;")
    public class12 field1385;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "Lff;")
    public static class42 field1413;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Lac;")
    public class4 field1386;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lac;")
    public class4 field1390;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "[B")
    public static byte[] field1395;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "[I")
    public int[] field1405;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public final void method523(int arg0) {
        int var2 = this.field1396;
        if (arg0 != 17015) {
            this.field1404 = 112;
        }
        field1392++;
        class12 var3 = this.field1385.method91(-1);
        if (var3 == null) {
            this.field1396 = -1;
            this.field1403 = 0;
            this.field1405 = null;
            this.field1384 = 0;
            this.field1400 = 0;
        } else {
            this.field1400 = var3.field217;
            this.field1384 = var3.field210;
            this.field1403 = var3.field256 * 128;
            this.field1396 = var3.field263;
            this.field1405 = var3.field224;
        }
        if (this.field1396 != var2 && this.field1386 != null) {
            class29.field614.method894(this.field1386);
            this.field1386 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static void method524(int arg0) {
        field1412 = null;
        field1407 = null;
        field1410 = null;
        field1415 = null;
        field1388 = null;
        field1395 = null;
        if (arg0 != 15310) {
            field1407 = null;
        }
        field1414 = null;
        field1413 = null;
        field1394 = null;
        field1411 = null;
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
    public static final void method525(int arg0) {
        field1389++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class77.field1754[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 128.0D) + 128;
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (var14 << 7) + var15;
            class77.field1754[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class64.field1381[var13] = (class77.field1754[var13 - 128] + class77.field1754[var13 + 1] + class77.field1754[var13 + -1] + class77.field1754[var13 - -128]) / 4;
            }
        }
        class38.field800 += 128;
        if (class8.field123.length < class38.field800) {
            class38.field800 -= class8.field123.length;
            int var5 = (int) (Math.random() * 12.0D);
            class47.method346(class20.field358[var5], (byte) 36);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class64.field1381[var10 + 128] - class8.field123[class38.field800 + var10 & class8.field123.length + -1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class77.field1754[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class36.field772[var7] = class36.field772[var7 + 1];
        }
        class36.field772[var1 - 1] = (int) (Math.sin((double) class20.field370 / 14.0D) * 16.0D + Math.sin((double) class20.field370 / 15.0D) * 14.0D + Math.sin((double) class20.field370 / 16.0D) * 12.0D);
        if (class62.field1334 > 0) {
            class62.field1334 -= 4;
        }
        if (arg0 < class49.field1026) {
            class49.field1026 -= 4;
        }
        if (class62.field1334 != 0 || class49.field1026 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class49.field1026 = 1024;
        }
        if (var8 == 0) {
            class62.field1334 = 1024;
            return;
        }
    }
}
