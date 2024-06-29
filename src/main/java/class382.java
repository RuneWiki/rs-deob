import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class382 {

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "Lwj;")
    private class415 field5540;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public int field5549;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    private int field5547;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public int field5548;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "Luia;")
    public static class382 field5542 = new class382(0, 3, class415.field5990);

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "Luia;")
    public static class382 field5546 = new class382(1, 3, class415.field5990);

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "Luia;")
    public static class382 field5550 = new class382(2, 4, class415.field5986);

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "Luia;")
    public static class382 field5551 = new class382(3, 1, class415.field5990);

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "Luia;")
    public static class382 field5552 = new class382(4, 2, class415.field5990);

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "Luia;")
    public static class382 field5553 = new class382(5, 3, class415.field5990);

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "Luia;")
    public static class382 field5554 = new class382(6, 4, class415.field5990);

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "I")
    public static int field5555 = class436.method2617(16, 4);

    @OriginalMember(owner = "client!uia", name = "u", descriptor = "I")
    public static int field5558 = 0;

    @OriginalMember(owner = "client!uia", name = "v", descriptor = "I")
    public static int field5559 = -1;

    @OriginalMember(owner = "client!uia", name = "w", descriptor = "I")
    public static int field5560 = 0;

    @OriginalMember(owner = "client!uia", name = "t", descriptor = "Ljb;")
    public static class519 field5557 = new class519(88, 3);

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!uia", name = "s", descriptor = "Luq;")
    public static class172 field5556;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)I", line = 6)
    public static final int method2371(int arg0, int arg1) {
        field5541++;
        if (arg0 != -16) {
            method2374(-2);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "([BI)[B", line = 18)
    public static final byte[] method2372(byte[] arg0, int arg1) {
        field5543++;
        if (arg1 > -31) {
            field5552 = null;
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class421.method2534(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lha;B)V", line = 39)
    public static final void method2373(class66 arg0, byte arg1) {
        field5545++;
        int var2 = 0;
        int var3 = 0;
        if (class24.field246) {
            var2 = class186.method1252(0);
            var3 = class550.method3163(16383);
        }
        arg0.method453(var2, var3, class460.field6558 + var2, var3 + 350);
        arg0.method434(var2, var3, class460.field6558, 350, class98.field1419 << 24 | 0x332277, 1);
        class199.method1300(var3, class460.field6558 + var2, 8963, var2, var3 + 350);
        int var4 = 350 / class598.field8141;
        if (class559.field7666 > 0) {
            int var5 = 346 - class598.field8141 - 4;
            int var6 = var4 * var5 / (class559.field7666 + var4 - 1);
            int var7 = 4;
            if (class559.field7666 > 1) {
                var7 += (class559.field7666 - class507.field7106 - 1) * (var5 - var6) / (class559.field7666 - 1);
            }
            arg0.method434(class460.field6558 + var2 - 16, var3 + var7, 12, var6, class98.field1419 << 24 | 0x332277, 2);
            for (int var8 = class507.field7106; var8 < class507.field7106 + var4 && var8 < class559.field7666; var8++) {
                String[] var9 = class684.method3748(-2242, class614.field8305[var8], '\b');
                int var10 = (class460.field6558 - 16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = (var10 * var11) + 8;
                    arg0.method453(var2 + var12, var3, var2 - (-var12 - var10) - 8, var3 + 350);
                    class166.field2202.method568(-1, var2 + var12, var3 + 350 + -2 + -class355.field5157.field8782 - (class687.field9194 - -((-class507.field7106 + var8) * class598.field8141)), class328.method2126(var9[var11], false), -16777216, true);
                }
            }
        }
        class734.field9957.method560(var3 + 330, var2 - -class460.field6558 + -25, (byte) 125, -16777216, -1, "Build: 645");
        arg0.method453(var2, var3, class460.field6558 + var2, var3 + 350);
        arg0.method544(var2, class460.field6558, var3 + 350 - class687.field9194, -1, (byte) 127);
        class88.field1251.method568(-1, var2 + 10, var3 - class643.field8657.field8782 + 350 + -1, "--> " + class328.method2126(class753.field10200, false), -16777216, true);
        if (arg1 != -16) {
            method2372(null, -38);
        }
        if (!class95.field1347) {
            return;
        }
        int var13 = -1;
        if ((class572.field7788 % 30) > 15) {
            var13 = 16777215;
        }
        arg0.method457(class643.field8657.method3619((byte) -69, "--> " + class328.method2126(class753.field10200, false).substring(0, field5560)) + (var2 + 10), var13, 0, var3 + 350 - class643.field8657.field8782 - 11, 12);
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 123)
    public static void method2374(int arg0) {
        field5550 = null;
        field5554 = null;
        field5542 = null;
        field5553 = null;
        field5551 = null;
        if (arg0 != -17) {
            field5551 = null;
        }
        field5552 = null;
        field5546 = null;
        field5556 = null;
        field5557 = null;
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(II)Luia;", line = 142)
    public static final class382 method2375(int arg0, int arg1) {
        field5538++;
        if (arg0 == 0) {
            return field5542;
        } else if (arg0 == 1) {
            return field5546;
        } else if (arg0 == 2) {
            return field5550;
        } else if (arg0 == 3) {
            return field5551;
        } else if (arg0 == 4) {
            return field5552;
        } else if (arg0 == 5) {
            return field5553;
        } else if (arg0 == 6) {
            return field5554;
        } else {
            if (arg1 <= 70) {
                method2374(-63);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "toString", descriptor = "()Ljava/lang/String;", line = 222)
    public final String toString() {
        field5544++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(IILwj;)V", line = 235)
    private class382(int arg0, int arg1, class415 arg2) {
        this.field5540 = arg2;
        this.field5549 = arg0;
        this.field5547 = arg1;
        this.field5548 = this.field5540.field5982 * this.field5547;
        if (this.field5549 >= 16) {
            throw new RuntimeException();
        }
    }
}
