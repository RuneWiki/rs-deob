import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    private int[] field1532;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lo;")
    public static class84 field1525 = class15.method124("Starting game engine)3)3)3", 255);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lo;")
    public static class84 field1524 = class15.method124("", 255);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lo;")
    public static class84 field1535 = class15.method124("glow2:", 255);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lo;")
    public static class84 field1526 = field1524;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lo;")
    public static class84 field1523 = field1524;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lo;")
    public static class84 field1528 = field1524;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field1533 = -1;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lo;")
    public static class84 field1529 = class15.method124("Use @lre@", 255);

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lo;")
    public static class84 field1541 = field1524;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lo;")
    public static class84 field1539 = field1524;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lo;")
    public static class84 field1540 = field1524;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lqc;")
    public static class97 field1538 = new class97(64);

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field1542 = 0;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Z")
    public static boolean field1543 = false;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "[[[B")
    public static byte[][][] field1544 = new byte[4][104][104];

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    public static class89 field1527;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lp;")
    public static class89 field1536;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Lp;")
    public static class89 field1545;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lqd;")
    public static class98 field1534;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I", line = 28)
    public final int method550(int arg0, int arg1) {
        if (arg0 > -21) {
            field1535 = null;
        }
        field1537++;
        int var3 = this.field1532.length - 2;
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field1532[var4];
            if (arg1 == var5) {
                return this.field1532[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 62)
    public static final void method551(int arg0) {
        if (class82.field1764 != null) {
            class82.field1764.method395(-9098);
        }
        class82.field1764 = null;
        class57.method464(33554431);
        field1531++;
        class112.field2427.method800();
        if (arg0 >= -43) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class93.field2034[var1].method301(true);
        }
        System.gc();
        class113.method869(10, -39);
        class25.field422 = 0;
        class103.field2174 = -1;
        class8.method63(10, false);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILke;)V", line = 91)
    public static final void method552(int arg0, class65 arg1) {
        field1530++;
        if (arg1.field1392 == arg0) {
            return;
        }
        if (arg1.field1442 != -1 && arg1.field1442 < 32768) {
            class115 var2 = class3.field30[arg1.field1442];
            if (var2 != null) {
                int var3 = arg1.field1391 - var2.field1391;
                int var4 = arg1.field1380 - var2.field1380;
                if (var4 != 0 || var3 != 0) {
                    arg1.field1390 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1442 >= 32768) {
            int var5 = arg1.field1442 - 32768;
            if (class101.field2142 == var5) {
                var5 = 2047;
            }
            class63 var6 = class119.field2643[var5];
            if (var6 != null) {
                int var7 = arg1.field1380 - var6.field1380;
                int var8 = arg1.field1391 - var6.field1391;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1390 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1387 != 0 || arg1.field1406 != 0) && (arg1.field1425 == 0 || arg1.field1389 > 0)) {
            int var9 = arg1.field1391 - (arg1.field1406 - class36.field714 - class36.field714) * 64;
            int var10 = arg1.field1380 - (arg1.field1387 - class106.field2242 - class106.field2242) * 64;
            if (var10 != 0 || var9 != 0) {
                arg1.field1390 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 0x7FF;
            }
            arg1.field1387 = 0;
            arg1.field1406 = 0;
        }
        int var11 = arg1.field1390 - arg1.field1421 & 0x7FF;
        if (var11 == 0) {
            return;
        }
        if (var11 < arg1.field1392 || var11 > 2048 - arg1.field1392) {
            arg1.field1421 = arg1.field1390;
        } else if (var11 > 1024) {
            arg1.field1421 -= arg1.field1392;
        } else {
            arg1.field1421 += arg1.field1392;
        }
        arg1.field1421 &= 0x7FF;
        if (arg1.field1434 != arg1.field1399 || arg1.field1421 == arg1.field1390) {
            return;
        }
        if (arg1.field1381 == -1) {
            arg1.field1434 = arg1.field1373;
            return;
        }
        arg1.field1434 = arg1.field1381;
        return;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 188)
    public static void method553(boolean arg0) {
        field1527 = null;
        field1529 = null;
        field1523 = null;
        field1525 = null;
        field1540 = null;
        field1539 = null;
        field1524 = null;
        field1544 = null;
        field1526 = null;
        field1528 = null;
        field1538 = null;
        field1535 = null;
        field1536 = null;
        field1534 = null;
        field1545 = null;
        field1541 = null;
        if (!arg0) {
            field1538 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([I)V", line = 216)
    public class73(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1532 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1532[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1532[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1532[var5 + var5] = arg0[var4];
            this.field1532[var5 + var5 + 1] = var4++;
        }
    }
}
