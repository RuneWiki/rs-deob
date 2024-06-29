import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class371 extends class496 {

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "[Ltk;")
    public class371[] field5372;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
    public boolean field5360;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "[I")
    public static int[] field5355 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "S")
    public static short field5375 = 32767;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field5365 = 0;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "[I")
    public static int[] field5371 = new int[13];

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public int field5363;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Lrm;")
    public static class104 field5359;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "Lpj;")
    public class220 field5378;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Llu;")
    public class515 field5364;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Ldda;")
    public static class597 field5368;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
    public int method1481(byte arg0) {
        if (arg0 == 28) {
            field5357++;
            return -1;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lwca;I)V")
    public static final void method2259(class311 arg0, int arg1) {
        if (arg0.field4655 == 5 && arg0.field4661 != -1) {
            class35.method182(arg0, class379.field5558, ~arg1);
        }
        field5377++;
        if (arg1 != -1) {
            field5365 = -57;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)[I")
    public final int[] method2260(byte arg0, int arg1, int arg2) {
        field5376++;
        if (arg0 >= -24) {
            field5355 = null;
        }
        return this.field5372[arg2].field5360 ? this.field5372[arg2].method79((byte) -110, arg1) : this.field5372[arg2].method78((byte) 36, arg1)[0];
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLps;)V")
    public void method81(int arg0, byte arg1, class428 arg2) {
        field5358++;
        int var4 = -56 / ((arg1 + 15) / 39);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public void method212(int arg0) {
        field5369++;
        if (arg0 != -19103) {
            this.method2263((byte) 62, 14, 61);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2261(int arg0, int arg1, byte arg2) {
        if (arg2 > -32) {
            field5371 = null;
        }
        field5379++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)[[I")
    public int[][] method78(byte arg0, int arg1) {
        field5367++;
        if (arg0 != 36) {
            method2262(-9);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static void method2262(int arg0) {
        field5355 = null;
        field5368 = null;
        field5371 = null;
        field5359 = null;
        if (arg0 < 31) {
            field5371 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(BI)[I")
    public int[] method79(byte arg0, int arg1) {
        field5373++;
        if (arg0 < -80) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
    public void method1478(int arg0, int arg1, int arg2) {
        field5366++;
        int var4 = this.field5363 == 255 ? arg2 : this.field5363;
        if (this.field5360) {
            this.field5378 = new class220(var4, arg2, arg0);
        } else {
            this.field5364 = new class515(var4, arg2, arg0);
        }
        int var5 = 123 % ((arg1 + 63) / 59);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(BII)[[I")
    public final int[][] method2263(byte arg0, int arg1, int arg2) {
        if (arg0 > -1) {
            this.field5363 = 116;
        }
        field5362++;
        if (this.field5372[arg1].field5360) {
            int[] var4 = this.field5372[arg1].method79((byte) -110, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5372[arg1].method78((byte) 36, arg2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static final void method2264(boolean arg0) {
        class157.field2004 = new class622(8);
        field5356++;
        class269.field3989 = 0;
        for (class96 var1 = (class96) class585.field8699.method772(0); var1 != null; var1 = (class96) class585.field8699.method775(2)) {
            var1.method555();
        }
        if (arg0) {
            method2265(28, 90, true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    public void method1480(int arg0) {
        if (this.field5360) {
            this.field5378.method1447((byte) 12);
            this.field5378 = null;
        } else {
            this.field5364.method3060(true);
            this.field5364 = null;
        }
        field5380++;
        if (arg0 < 48) {
            this.field5360 = false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIZ)V")
    public static final void method2265(int arg0, int arg1, boolean arg2) {
        field5374++;
        class621 var3 = class442.method2691(arg1, 5, arg2);
        var3.method3592((byte) 120);
        var3.field9068 = arg0;
        if (!arg2) {
            method2264(false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)I")
    public int method2093(boolean arg0) {
        if (arg0) {
            field5375 = -77;
        }
        field5361++;
        return -1;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IZ)V")
    public class371(int arg0, boolean arg1) {
        this.field5372 = new class371[arg0];
        this.field5360 = arg1;
    }
}
