import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 extends class82 {

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "[I")
    public static int[] field1461 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "La;")
    public static class1 field1456 = class113.method934(-11538, "p11_full");

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!jc", name = "sb", descriptor = "[I")
    public static int[] field1468 = new int[128];

    @OriginalMember(owner = "client!jc", name = "ob", descriptor = "La;")
    public static class1 field1464 = class113.method934(-11538, "overlay_multiway");

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "[[[I")
    public static int[][][] field1454 = new int[4][105][105];

    @OriginalMember(owner = "client!jc", name = "tb", descriptor = "La;")
    public static class1 field1469 = class113.method934(-11538, "hitmarks");

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "La;")
    private static class1 field1458 = class113.method934(-11538, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "La;")
    public static class1 field1452 = field1458;

    @OriginalMember(owner = "client!jc", name = "xb", descriptor = "I")
    public static int field1473 = 0;

    @OriginalMember(owner = "client!jc", name = "zb", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!jc", name = "Ab", descriptor = "La;")
    private static class1 field1476 = class113.method934(-11538, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!jc", name = "qb", descriptor = "La;")
    public static class1 field1466 = field1476;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!jc", name = "pb", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!jc", name = "rb", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!jc", name = "ub", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!jc", name = "yb", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!jc", name = "vb", descriptor = "Lqd;")
    public static class100 field1471;

    @OriginalMember(owner = "client!jc", name = "wb", descriptor = "Lsa;")
    public class109 field1472;

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "Lu;")
    public class120 field1459;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Lvc;")
    public static class129 field1453;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "Le;")
    public static class25 field1460;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "[B")
    public byte[] field1457;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 12)
    public static final void method545(int arg0) {
        field1463++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class6.field230[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class6.field230[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = var12 + (var4 << 7);
                class116.field2914[var13] = (class6.field230[var13 - 1] + class6.field230[var13 + 1] + class6.field230[var13 + -128] + class6.field230[var13 + 128]) / 4;
            }
        }
        class43.field1145 += 128;
        if (class43.field1145 > class102.field2573.length) {
            class43.field1145 -= class102.field2573.length;
            int var5 = (int) (Math.random() * 12.0D);
            class127.method1013(-4487, class45.field1179[var5]);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class116.field2914[var10 + 128] - class102.field2573[var10 + class43.field1145 & class102.field2573.length + -1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class6.field230[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class31.field848[var7] = class31.field848[var7 + 1];
        }
        class31.field848[var1 - arg0] = (int) (Math.sin((double) class82.field2066 / 14.0D) * 16.0D + Math.sin((double) class82.field2066 / 15.0D) * 14.0D + Math.sin((double) class82.field2066 / 16.0D) * 12.0D);
        if (class46.field1211 > 0) {
            class46.field1211 -= 4;
        }
        if (class95.field2383 > 0) {
            class95.field2383 -= 4;
        }
        if (class46.field1211 != 0 || class95.field2383 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 0) {
            class46.field1211 = 1024;
        }
        if (var8 == 1) {
            class95.field2383 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 132)
    public static void method546(byte arg0) {
        field1466 = null;
        field1454 = null;
        field1469 = null;
        field1476 = null;
        field1471 = null;
        field1458 = null;
        field1464 = null;
        field1453 = null;
        field1452 = null;
        field1456 = null;
        field1461 = null;
        field1460 = null;
        if (arg0 < 23) {
            method547(-95, -33L);
        }
        field1468 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V", line = 163)
    public static final void method547(int arg0, long arg1) {
        field1455++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = arg0; var3 < class85.field2149; var3++) {
            if (class106.field2686[var3] == arg1) {
                class39.field1056 = true;
                client.field594++;
                class85.field2149--;
                for (int var4 = var3; var4 < class85.field2149; var4++) {
                    class106.field2686[var4] = class106.field2686[var4 + 1];
                }
                class70.field1729.method416(11453, 28);
                class70.field1729.method158(arg1, false);
                return;
            }
        }
    }
}
