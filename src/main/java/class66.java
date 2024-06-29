import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Z")
    public boolean field1373 = true;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[Z")
    public static boolean[] field1375 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Llc;")
    public static class69 field1382 = class69.method470((byte) -121, "Drop @lre@");

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Llc;")
    public static class69 field1378 = class69.method470((byte) -107, "Loaded wordpack");

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Llc;")
    public static class69 field1385 = class69.method470((byte) -119, "Please remove ");

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Llc;")
    public static class69 field1386 = class69.method470((byte) -122, "flash3:");

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lda;ZII)V")
    public static final void method430(class20 arg0, boolean arg1, int arg2, int arg3) {
        field1379++;
        int var4 = arg2 * arg2 + arg3 * arg3;
        if (!arg1) {
            method431(-7);
        }
        if (var4 <= 4225 || var4 >= 90000) {
            class79.method563(10191, arg3, arg0, arg2);
            return;
        }
        int var5 = class17.field342 + class128.field2757 & 0x7FF;
        int var6 = class44.field915[var5];
        int var7 = var6 * 256 / (class70.field1558 + 256);
        int var8 = class44.field920[var5];
        int var9 = var8 * 256 / (class70.field1558 + 256);
        int var10 = arg2 * var7 + arg3 * var9 >> 16;
        int var11 = arg2 * var9 - arg3 * var7 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class46.field961.method135(var14 + 88, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method431(int arg0) {
        if (arg0 != 1) {
            field1385 = null;
        }
        field1380++;
        class3.field22.method175(20375);
        int var1 = class3.field22.method181(8, arg0 + 7);
        if (class62.field1284 > var1) {
            for (int var2 = var1; var2 < class62.field1284; var2++) {
                class91.field1982[class120.field2569++] = class70.field1569[var2];
            }
        }
        if (var1 > class62.field1284) {
            throw new RuntimeException("gnpov1");
        }
        class62.field1284 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class70.field1569[var3];
            class72 var5 = class112.field2434[var4];
            int var6 = class3.field22.method181(1, 8);
            if (var6 == 0) {
                class70.field1569[class62.field1284++] = var4;
                var5.field1088 = class62.field1282;
            } else {
                int var7 = class3.field22.method181(2, 8);
                if (var7 == 0) {
                    class70.field1569[class62.field1284++] = var4;
                    var5.field1088 = class62.field1282;
                    class108.field2410[class77.field1746++] = var4;
                } else if (var7 == 1) {
                    class70.field1569[class62.field1284++] = var4;
                    var5.field1088 = class62.field1282;
                    int var8 = class3.field22.method181(3, arg0 ^ 0x9);
                    var5.method324(false, var8, (byte) 85);
                    int var9 = class3.field22.method181(1, 8);
                    if (var9 == 1) {
                        class108.field2410[class77.field1746++] = var4;
                    }
                } else if (var7 == 2) {
                    class70.field1569[class62.field1284++] = var4;
                    var5.field1088 = class62.field1282;
                    int var10 = class3.field22.method181(3, 8);
                    var5.method324(true, var10, (byte) 84);
                    int var11 = class3.field22.method181(3, 8);
                    var5.method324(true, var11, (byte) 119);
                    int var12 = class3.field22.method181(1, arg0 ^ 0x9);
                    if (var12 == 1) {
                        class108.field2410[class77.field1746++] = var4;
                    }
                } else if (var7 == 3) {
                    class91.field1982[class120.field2569++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lkc;BIII)[B")
    public static final byte[] method432(class63 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1387++;
        long var5 = ((long) arg2 << 32) + (long) (arg3 << 16) + (long) (arg3 * 37 + arg4 & 0xFFFF);
        if (class103.field2240 != null) {
            class64 var7 = (class64) class103.field2240.method224(var5, (byte) -86);
            if (var7 != null) {
                return var7.field1340;
            }
        }
        byte[] var8 = arg0.method394(arg3, arg4, (byte) -41);
        if (var8 == null) {
            return null;
        } else {
            if (class103.field2240 != null) {
                class103.field2240.method221(new class64(var8), true, var5);
            }
            return arg1 > -116 ? null : var8;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Llc;")
    public static final class69 method433(int arg0, int arg1) {
        field1369++;
        if (arg1 < arg0) {
            return class106.method791(arg1, (byte) -70);
        } else if (arg1 < 10000000) {
            return class46.method305(20025, new class69[] { class106.method791(arg1 / 1000, (byte) -114), class4.field97 });
        } else {
            return class46.method305(20025, new class69[] { class106.method791(arg1 / 1000000, (byte) -46), class119.field2551 });
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1370 = arg0;
        this.field1374 = arg2;
        this.field1372 = arg4;
        this.field1376 = arg1;
        this.field1371 = arg3;
        this.field1373 = arg6;
        this.field1381 = arg5;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method434(int arg0) {
        field1382 = null;
        field1378 = null;
        field1375 = null;
        field1385 = null;
        field1386 = null;
        if (arg0 <= 4) {
            method430(null, false, 45, 28);
        }
    }
}
