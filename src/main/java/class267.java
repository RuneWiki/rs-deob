import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class267 extends class50 {

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "[J")
    private long[] field4633 = new long[10];

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    private int field4629 = 1;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    private int field4638 = 256;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    private int field4630 = 0;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "J")
    private long field4632 = class71.method470(true);

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lmh;")
    public static class128 field4628 = class22.method156(122, "(U");

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "[I")
    public static int[] field4635 = new int[500];

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lmh;")
    public static class128 field4624 = class22.method156(127, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    private int field4636;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[[[I")
    public static int[][][] field4626;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILcg;ILcf;Lld;III)V", line = 10)
    public static final void method1864(int arg0, class38 arg1, int arg2, class123 arg3, class115 arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 0) {
            field4624 = (class128) null;
        }
        field4625++;
        class3 var8 = new class3();
        var8.field65 = arg6;
        var8.field40 = arg0 * 128;
        var8.field67 = arg7 * 128;
        if (arg1 != null) {
            var8.field44 = arg1.field788;
            var8.field70 = arg1.field756 * 128;
            var8.field48 = arg1.field779;
            var8.field46 = arg1.field774;
            int var9 = arg1.field758;
            int var10 = arg1.field778;
            var8.field41 = arg1;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg1.field758;
                var9 = arg1.field778;
            }
            var8.field59 = (arg0 + var9) * 128;
            var8.field63 = (arg7 + var10) * 128;
            var8.field62 = arg1.field781;
            if (arg1.field817 != null) {
                var8.field45 = true;
                var8.method16(26972);
            }
            if (var8.field62 != null) {
                var8.field55 = var8.field48 + ((int) (Math.random() * (double) (var8.field44 - var8.field48)));
            }
            class232.field4006.method2029((byte) -34, var8);
        } else if (arg4 != null) {
            var8.field51 = arg4;
            class208 var11 = arg4.field1934;
            if (var11.field3655 != null) {
                var8.field45 = true;
                var11 = var11.method1429((byte) -96);
            }
            if (var11 != null) {
                var8.field63 = (var11.field3706 + arg7) * 128;
                var8.field59 = (var11.field3706 + arg0) * 128;
                var8.field46 = class32.method233(arg4, -112);
                var8.field70 = var11.field3675 * 128;
            }
            class63.field1195.method2029((byte) -34, var8);
        } else if (arg3 != null) {
            var8.field42 = arg3;
            var8.field59 = (arg3.method118(-1) + arg0) * 128;
            var8.field63 = (arg3.method118(-1) + arg7) * 128;
            var8.field46 = class7.method45(arg3, -115);
            var8.field70 = arg3.field2068 * 128;
            class203.field3585.method730(var8, arg3.field2079.method819((byte) 105), (byte) -110);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V", line = 102)
    public static void method1865(byte arg0) {
        field4624 = null;
        field4635 = null;
        int var1 = -62 / ((-arg0 - 74) / 40);
        field4626 = (int[][][]) null;
        field4628 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)I", line = 121)
    public final int method338(int arg0, int arg1, int arg2) {
        field4631++;
        int var4 = this.field4638;
        this.field4638 = 300;
        int var5 = this.field4629;
        this.field4629 = 1;
        this.field4632 = class71.method470(true);
        if (this.field4633[this.field4636] == 0L) {
            this.field4638 = var4;
            this.field4629 = var5;
        } else if (this.field4632 > this.field4633[this.field4636]) {
            this.field4638 = (int) ((long) (arg0 * 2560) / (this.field4632 - this.field4633[this.field4636]));
        }
        if (this.field4638 < 25) {
            this.field4638 = 25;
        }
        if (this.field4638 > 256) {
            this.field4638 = 256;
            this.field4629 = (int) ((long) arg0 - ((this.field4632 - this.field4633[this.field4636]) / 10L));
        }
        if (this.field4629 > arg0) {
            this.field4629 = arg0;
        }
        this.field4633[this.field4636] = this.field4632;
        this.field4636 = (this.field4636 + 1) % 10;
        if (this.field4629 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4633[var6] != 0L) {
                    this.field4633[var6] += (long) this.field4629;
                }
            }
        }
        if (arg1 != -3) {
            return -126;
        }
        if (this.field4629 < arg2) {
            this.field4629 = arg2;
        }
        class177.method1213(arg1 + 3, (long) this.field4629);
        int var7 = 0;
        while (this.field4630 < 256) {
            var7++;
            this.field4630 += this.field4638;
        }
        this.field4630 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 203)
    public static final int method1866(int arg0, int arg1) {
        field4637++;
        if (arg0 <= 31) {
            field4626 = (int[][][]) ((int[][][]) null);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 255)
    public class267() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4633[var1] = this.field4632;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 232)
    public final void method343(byte arg0) {
        if (arg0 <= -29) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field4633[var2] = 0L;
            }
            field4634++;
        }
    }
}
