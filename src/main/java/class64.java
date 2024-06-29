import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class64 extends class28 {

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    private int field1325 = 0;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    private int field1332 = -1;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "[I")
    public static int[] field1322 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Lqe;")
    public static class179 field1328 = class206.method1380("mapfunction", (byte) -128);

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lqe;")
    public static class179 field1330 = class206.method1380("Benutzen Sie bitte eine andere Welt)3", (byte) -11);

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Lfj;")
    public static class65 field1327;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1326++;
        if (class152.method976(arg6, arg3)) {
            class92.method602(100, arg1, arg4, class199.field3710[arg3], -1, arg7, arg0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
    public static final int method419(int arg0, int arg1) {
        int var2 = -79 / ((arg0 - 53) / 43);
        field1329++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
    private final void method420(int arg0, int arg1) {
        field1333++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        double var11 = var7;
        double var13 = 0.0D;
        if (var7 > var3) {
            var9 = var3;
        }
        double var15 = 0.0D;
        if (var7 < var3) {
            var11 = var3;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        if (arg1 <= 44) {
            this.method421(110, null, (byte) 124);
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field1334 = (int) (var17 * 256.0D);
        if (this.field1334 < 0) {
            this.field1334 = 0;
        } else if (this.field1334 > 255) {
            this.field1334 = 255;
        }
        if (var9 != var11) {
            if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11);
            } else if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field1324 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1324 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1324 < 1) {
            this.field1324 = 1;
        }
        this.field1335 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field1335 < 0) {
            this.field1335 = 0;
        } else if (this.field1335 > 255) {
            this.field1335 = 255;
        }
        this.field1323 = (int) ((double) this.field1324 * var19);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILra;B)V")
    public final void method421(int arg0, class185 arg1, byte arg2) {
        if (arg2 >= -80) {
            return;
        }
        field1331++;
        while (true) {
            int var4 = arg1.method1243(3);
            if (var4 == 0) {
                return;
            }
            this.method423(arg1, -71, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ID)V")
    public static final void method422(int arg0, double arg1) {
        if (class2.field25 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class215.field3986[var3] = var4 > 255 ? 255 : var4;
            }
            class2.field25 = arg1;
        }
        if (arg0 != -1) {
            field1322 = null;
        }
        field1320++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lra;III)V")
    private final void method423(class185 arg0, int arg1, int arg2, int arg3) {
        int var5 = 121 % ((arg1 - 51) / 58);
        if (arg3 == 1) {
            this.field1325 = arg0.method1244(-27523);
            this.method420(this.field1325, 56);
        } else if (arg3 == 2) {
            this.field1332 = arg0.method1252(2);
            if (this.field1332 == 65535) {
                this.field1332 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method1252(2);
        }
        field1319++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public static void method424(boolean arg0) {
        field1322 = null;
        field1327 = null;
        field1328 = null;
        if (arg0) {
            field1330 = null;
        }
        field1330 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(JB)V")
    public static final void method425(long arg0, byte arg1) {
        field1321++;
        if (arg0 == 0L) {
            return;
        }
        if (class98.field1840 >= 100) {
            class189.method1276(0, (byte) 1, class192.field3582, class207.field3868);
            return;
        }
        class179 var3 = class12.method82(4, arg0).method1140((byte) 32);
        for (int var4 = 0; var4 < class98.field1840; var4++) {
            if (class237.field4358[var4] == arg0) {
                class189.method1276(0, (byte) 1, class78.method502((byte) -100, new class179[] { var3, class191.field3572 }), class207.field3868);
                return;
            }
        }
        for (int var5 = 0; var5 < class202.field3741; var5++) {
            if (class160.field2908[var5] == arg0) {
                class189.method1276(0, (byte) 1, class78.method502((byte) -89, new class179[] { class173.field3103, var3, class125.field2302 }), class207.field3868);
                return;
            }
        }
        if (arg1 != 12) {
            field1330 = null;
        }
        if (var3.method1142(class61.field1298.field2168, (byte) -110)) {
            class189.method1276(0, (byte) 1, class237.field4357, class207.field3868);
            return;
        }
        class237.field4358[class98.field1840] = arg0;
        class66.field1344[class98.field1840++] = class12.method82(4, arg0);
        class43.field936 = class32.field693;
        class81.field1564.method70((byte) -62, 223);
        class99.field1848++;
        class81.field1564.method1232(arg0, (byte) 124);
    }
}
