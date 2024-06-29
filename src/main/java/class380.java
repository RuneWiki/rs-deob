import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class380 {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lml;")
    private class263 field5660;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lik;")
    private class138 field5665;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lwd;")
    private class178 field5662;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5663 = 0;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lao;")
    public static class188 field5664 = new class188(14, 10);

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lao;")
    public static class188 field5669 = new class188(90, 12);

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "[[S")
    public static short[][] field5671 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lti;")
    private class303 field5658;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lhh;")
    public static class84 field5670;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[Lnr;")
    private class40[] field5659;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method2407(byte arg0) {
        if (arg0 != -40) {
            this.field5659 = null;
        }
        field5668++;
        if (this.field5658 != null) {
            return true;
        }
        if (this.field5662 == null) {
            if (this.field5660.method1675((byte) 121)) {
                return false;
            }
            this.field5662 = this.field5660.method1685(255, (byte) -25, (byte) 0, true, 255);
        }
        if (this.field5662.field6915) {
            return false;
        } else {
            this.field5658 = new class303(this.field5662.method1266(100));
            this.field5659 = new class40[(this.field5658.field4326.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILkn;Lkn;)Lnr;", line = 33)
    public final class40 method2408(byte arg0, int arg1, class518 arg2, class518 arg3) {
        int var5 = -41 / ((arg0 - 37) / 53);
        field5657++;
        return this.method2411(arg3, arg2, 8, true, arg1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 46)
    public static void method2409(int arg0) {
        field5671 = null;
        field5670 = null;
        field5669 = null;
        if (arg0 != -14002) {
            method2409(125);
        }
        field5664 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIILea;Ltn;JI)V", line = 64)
    public static final void method2410(int arg0, int arg1, int arg2, int arg3, int arg4, class381 arg5, class58 arg6, long arg7, int arg8) {
        field5666++;
        if (arg1 != 256) {
            method2410(-1, 13, -43, 116, -14, null, null, 39L, 70);
        }
        int var10 = arg0 * arg0 + arg8 * arg8;
        if ((long) var10 > arg7) {
            return;
        }
        int var11 = Math.min(arg6.field925 / 2, arg6.field896 / 2);
        if (var11 * var11 >= var10) {
            class271.method1739(arg4, class436.field6341[arg2], (byte) 70, arg8, arg3, arg6, arg0, arg5);
            return;
        }
        var11 -= 10;
        int var12;
        if (class403.field5944 == 4) {
            var12 = (int) class66.field1161 & 0x3FFF;
        } else {
            var12 = (int) class66.field1161 + class8.field114 & 0x3FFF;
        }
        int var13 = class324.field4966[var12];
        int var14 = class324.field4974[var12];
        if (class403.field5944 != 4) {
            var14 = var14 * 256 / (class43.field662 + 256);
            var13 = var13 * 256 / (class43.field662 + 256);
        }
        int var15 = arg0 * var14 + arg8 * var13 >> 15;
        int var16 = arg8 * var14 - (arg0 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var11);
        class86.field1431[arg2].method3130((float) arg6.field925 / 2.0F + (float) arg4 + (float) var19, (float) arg6.field896 / 2.0F + (float) arg3 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lkn;Lkn;IZI)Lnr;", line = 119)
    private final class40 method2411(class518 arg0, class518 arg1, int arg2, boolean arg3, int arg4) {
        field5661++;
        if (this.field5658 == null) {
            throw new RuntimeException();
        }
        this.field5658.field4333 = arg2 * arg4 + 5;
        if (this.field5658.field4326.length <= this.field5658.field4333) {
            throw new RuntimeException();
        } else if (this.field5659[arg4] == null) {
            int var6 = this.field5658.method1870(arg2 - 1945262520);
            int var7 = this.field5658.method1870(-1945262512);
            class40 var8 = new class40(arg4, arg0, arg1, this.field5660, this.field5665, var6, var7, arg3);
            this.field5659[arg4] = var8;
            return var8;
        } else {
            return this.field5659[arg4];
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lml;Lik;)V", line = 155)
    public class380(class263 arg0, class138 arg1) {
        this.field5660 = arg0;
        this.field5665 = arg1;
        if (!this.field5660.method1675((byte) -108)) {
            this.field5662 = this.field5660.method1685(255, (byte) -25, (byte) 0, true, 255);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 167)
    public final void method2412(int arg0) {
        field5667++;
        if (this.field5659 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5659.length; var2++) {
            if (this.field5659[var2] != null) {
                this.field5659[var2].method311(false);
            }
        }
        for (int var3 = 0; var3 < this.field5659.length; var3++) {
            if (this.field5659[var3] != null) {
                this.field5659[var3].method305(true);
            }
        }
        int var4 = -52 / ((arg0 + 11) / 43);
    }
}
