import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class281 implements class683 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Lsga;")
    private class583 field3559 = new class583(128);

    @OriginalMember(owner = "client!js", name = "g", descriptor = "[I")
    public int[] field3563 = new int[class348.field4512.field1861];

    @OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
    private int[] field3561 = new int[class348.field4512.field1861];

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static final void method1678(byte arg0) {
        field3565++;
        class643.field8880 = -1;
        class202.field2576 = 1;
        long var1 = 0L;
        if (class224.field2948 == null) {
            class600.method3307(114, 35);
            return;
        }
        class179 var3 = new class179(class149.method932(class340.method1991((byte) -34, class224.field2948), 5518));
        long var4 = var3.method1093(215350688);
        class5.field60 = var3.method1093(215350688);
        if (arg0 <= -122) {
            class406.method2407(-1591, class541.method3079(0, var4), true, "");
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
    public final void method1679(int arg0, int arg1, int arg2) {
        field3558++;
        class748 var4 = class197.field2537.method2539(29581, arg0);
        int var5 = var4.field10472;
        int var6 = var4.field10473;
        int var7 = var4.field10470;
        int var8 = class516.field7275[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        if (arg2 == 4733) {
            int var9 = var8 << var6;
            this.method1685((byte) 34, var9 & arg1 << var6 | this.field3561[var5] & ~var9, var5);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public final void method1680(int arg0) {
        for (int var2 = 0; var2 < class348.field4512.field1861; var2++) {
            class498 var3 = class348.field4512.method951(44, var2);
            if (var3 != null && var3.field7041 == 0) {
                this.field3561[var2] = 0;
                this.field3563[var2] = 0;
            }
        }
        if (arg0 >= -71) {
            this.field3563 = null;
        }
        field3567++;
        this.field3559 = new class583(128);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)I")
    public final int method1681(int arg0, int arg1) {
        field3566++;
        class748 var3 = class197.field2537.method2539(29581, arg1);
        int var4 = var3.field10472;
        if (arg0 == 0) {
            int var5 = var3.field10473;
            int var6 = var3.field10470;
            int var7 = class516.field7275[var6 - var5];
            return this.field3563[var4] >> var5 & var7;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)I")
    public final int method1682(int arg0, boolean arg1) {
        field3564++;
        long var3 = class97.method654((byte) 95);
        for (class188 var5 = arg1 ? (class188) this.field3559.method3245(false) : (class188) this.field3559.method3252(arg0 ^ 0x328A); var5 != null; var5 = (class188) this.field3559.method3252(12938)) {
            if (var3 > (var5.field2467 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field2467 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field8746;
                    this.field3563[var6] = this.field3561[var6];
                    var5.method3426((byte) -50);
                    return var6;
                }
                var5.method3426((byte) -81);
            }
        }
        if (arg0 != 0) {
            this.method1685((byte) 26, 49, 91);
        }
        return -1;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZII)V")
    public final void method1683(boolean arg0, int arg1, int arg2) {
        field3562++;
        if (!arg0) {
            this.method1682(-118, false);
        }
        class748 var4 = class197.field2537.method2539(29581, arg2);
        int var5 = var4.field10472;
        int var6 = var4.field10473;
        int var7 = var4.field10470;
        int var8 = class516.field7275[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1686(0, arg1 << var6 & var9 | this.field3563[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lkba;I)V")
    public static final void method1684(class24 arg0, int arg1) {
        field3568++;
        boolean var2 = false;
        if (class266.field3368 == arg0.field355 || arg0.field376 == -1 || arg0.field364 != 0) {
            var2 = true;
        } else {
            class747 var3 = class646.field8903.method643(arg0.field376, -120);
            if (var3.field10436 || var3.field10453[arg0.field388] < arg0.field326 + 1) {
                var2 = true;
            }
        }
        int var4 = 30 / ((-arg1 - 39) / 43);
        if (var2) {
            int var5 = arg0.field355 - arg0.field339;
            int var6 = class266.field3368 - arg0.field339;
            int var7 = arg0.field406 * 512 + (arg0.method253((byte) -27) * 256);
            int var8 = arg0.field366 * 512 + arg0.method253((byte) -27) * 256;
            int var9 = arg0.field342 * 512 + arg0.method253((byte) -27) * 256;
            int var10 = arg0.field341 * 512 + arg0.method253((byte) -27) * 256;
            arg0.field5784 = ((var5 - var6) * var8 + var6 * var10) / var5;
            arg0.field5790 = ((var5 - var6) * var7 + var6 * var9) / var5;
        }
        arg0.field431 = 0;
        if (arg0.field330 == 0) {
            arg0.method270(31, 8192, false);
        }
        if (arg0.field330 == 1) {
            arg0.method270(71, 12288, false);
        }
        if (arg0.field330 == 2) {
            arg0.method270(60, 0, false);
        }
        if (arg0.field330 == 3) {
            arg0.method270(79, 4096, false);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BII)V")
    public final void method1685(byte arg0, int arg1, int arg2) {
        this.field3561[arg2] = arg1;
        field3569++;
        int var4 = -25 % ((arg0 + 55) / 42);
        class188 var5 = (class188) this.field3559.method3248((long) arg2, 0);
        if (var5 == null) {
            class188 var6 = new class188(4611686018427387905L);
            this.field3559.method3249((long) arg2, var6, (byte) -98);
        } else if (var5.field2467 != 4611686018427387905L) {
            var5.field2467 = class97.method654((byte) 119) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(III)V")
    public final void method1686(int arg0, int arg1, int arg2) {
        this.field3563[arg2] = arg1;
        field3557++;
        class188 var4 = (class188) this.field3559.method3248((long) arg2, arg0);
        if (var4 == null) {
            class188 var5 = new class188(class97.method654((byte) 65) + 500L);
            this.field3559.method3249((long) arg2, var5, (byte) -124);
        } else {
            var4.field2467 = class97.method654((byte) 127) + 500L;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
    public final int method1687(int arg0, int arg1) {
        field3560++;
        return arg0 == 2 ? this.field3563[arg1] : -58;
    }
}
