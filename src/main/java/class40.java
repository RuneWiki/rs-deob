import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 extends class34 {

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[Z")
    public boolean[] field673;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "[[I")
    public int[][] field682;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lcc;")
    private static class209 field671 = class95.method669(90, "skill: ");

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "Lcc;")
    public static class209 field683 = field671;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[S")
    public static short[] field680 = new short[500];

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field672 = 500;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "Lcc;")
    public static class209 field684 = class95.method669(103, " )2>");

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lsj;")
    public static class49 field681;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Lmb;")
    public static final class159 method298(int arg0) {
        field679++;
        class229.field4168 = arg0;
        return class277.method1877(arg0 ^ 0x68);
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
    public static void method299(int arg0) {
        if (arg0 != 2) {
            method301(46, -104, (byte) -60, (class42) null);
        }
        field683 = null;
        field684 = null;
        field681 = null;
        field680 = null;
        field671 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lcc;Z)I")
    public static final int method300(class209 arg0, boolean arg1) {
        field678++;
        int var2 = 0;
        if (!arg1) {
            field684 = null;
        }
        while (class48.field919.length > var2) {
            if (class48.field919[var2].method1483(arg0, (byte) -94)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBLji;)V")
    public static final void method301(int arg0, int arg1, byte arg2, class42 arg3) {
        if (arg2 != -5) {
            return;
        }
        if (arg3.field720 == 0) {
            arg3.field756 = arg3.field754;
        } else if (arg3.field720 == 1) {
            arg3.field756 = (arg0 - arg3.field758) / 2 + arg3.field754;
        } else if (arg3.field720 == 2) {
            arg3.field756 = arg0 - arg3.field758 - arg3.field754;
        } else if (arg3.field720 == 3) {
            arg3.field756 = arg3.field754 * arg0 >> 14;
        } else if (arg3.field720 == 4) {
            arg3.field756 = (arg3.field754 * arg0 >> 14) + (arg0 - arg3.field758) / 2;
        } else {
            arg3.field756 = arg0 - arg3.field758 - (arg3.field754 * arg0 >> 14);
        }
        if (arg3.field813 == 0) {
            arg3.field801 = arg3.field750;
        } else if (arg3.field813 == 1) {
            arg3.field801 = (arg1 - arg3.field789) / 2 + arg3.field750;
        } else if (arg3.field813 == 2) {
            arg3.field801 = arg1 - arg3.field789 - arg3.field750;
        } else if (arg3.field813 == 3) {
            arg3.field801 = arg3.field750 * arg1 >> 14;
        } else if (arg3.field813 == 4) {
            arg3.field801 = (arg3.field750 * arg1 >> 14) + (arg1 - arg3.field789) / 2;
        } else {
            arg3.field801 = arg1 - (arg3.field750 * arg1 >> 14) - arg3.field789;
        }
        field675++;
        if (!class70.field1332 || client.method1070(arg3) == 0 && arg3.field810 != 0) {
            return;
        }
        if (arg3.field756 < 0) {
            arg3.field756 = 0;
        } else if (arg0 < arg3.field758 + arg3.field756) {
            arg3.field756 = arg0 - arg3.field758;
        }
        if (arg3.field801 < 0) {
            arg3.field801 = 0;
        } else if ((arg3.field801 + arg3.field789) > arg1) {
            arg3.field801 = arg1 - arg3.field789;
            return;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[Lcc;)[Lcc;")
    public static final class209[] method302(byte arg0, class209[] arg1) {
        field686++;
        class209[] var2 = new class209[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class229.method1604(new class209[] { class66.method485(var3, (byte) 57), class59.field1193 }, (byte) 112);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class229.method1604(new class209[] { var2[var3], arg1[var3] }, (byte) 85);
            }
        }
        if (arg0 != -66) {
            field671 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
    public static final void method303(int arg0) {
        if (arg0 != 25857) {
            field672 = -115;
        }
        field674++;
        class154.field2805.method664(arg0 ^ 0xFFFF9AAE);
        class261.field4699.method664(115);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(I[B)V")
    public class40(int arg0, byte[] arg1) {
        this.field676 = arg0;
        class106 var3 = new class106(arg1);
        this.field677 = var3.method774((byte) 83);
        this.field673 = new boolean[this.field677];
        this.field682 = new int[this.field677][];
        this.field685 = new int[this.field677];
        for (int var4 = 0; var4 < this.field677; var4++) {
            this.field685[var4] = var3.method774((byte) 74);
        }
        for (int var5 = 0; var5 < this.field677; var5++) {
            this.field673[var5] = var3.method774((byte) 127) == 1;
        }
        for (int var6 = 0; var6 < this.field677; var6++) {
            this.field682[var6] = new int[var3.method774((byte) 119)];
        }
        for (int var7 = 0; var7 < this.field677; var7++) {
            for (int var8 = 0; var8 < this.field682[var7].length; var8++) {
                this.field682[var7][var8] = var3.method774((byte) 106);
            }
        }
    }
}
