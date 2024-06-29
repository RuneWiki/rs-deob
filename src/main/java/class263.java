import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class263 extends class124 {

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    private int field4652 = 2048;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    private int field4658 = 10;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    private int field4656 = 0;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "Le;")
    public static class191 field4650 = class54.method368("(Udns", 2047);

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "Le;")
    private static class191 field4654 = class54.method368("World", 2047);

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field4657 = -1;

    @OriginalMember(owner = "client!ki", name = "kb", descriptor = "[Le;")
    public static class191[] field4671 = new class191[100];

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "[S")
    public static short[] field4665 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field4662 = 0;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "Le;")
    public static class191 field4664 = field4654;

    @OriginalMember(owner = "client!ki", name = "lb", descriptor = "I")
    public static int field4672 = 0;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field4663 = 0;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ki", name = "gb", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ki", name = "hb", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ki", name = "jb", descriptor = "Lbd;")
    public static class24 field4670;

    @OriginalMember(owner = "client!ki", name = "ib", descriptor = "[I")
    private int[] field4669;

    @OriginalMember(owner = "client!ki", name = "mb", descriptor = "[I")
    private int[] field4673;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjb;)V")
    public static final void method1804(int arg0, class176 arg1) {
        int var2 = -class135.field2267 + arg1.field2984;
        ++field4653;
        int var3 = arg1.field2975 * 128 - -(64 * arg1.method490((byte) -4));
        int var4 = arg1.field2982 * 128 - -(arg1.method490((byte) -4) * 64);
        arg1.field2972 += (var4 - arg1.field2972) / var2;
        arg1.field3003 += (-arg1.field3003 + var3) / var2;
        arg1.field3008 = 0;
        if (arg1.field2954 == arg0) {
            arg1.field2964 = 1024;
        }
        if (arg1.field2954 == 1) {
            arg1.field2964 = 1536;
        }
        if (~arg1.field2954 == -3) {
            arg1.field2964 = 0;
        }
        if (~arg1.field2954 == -4) {
            arg1.field2964 = 512;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lng;III)[Lwa;")
    public static final class226[] method1805(class121 arg0, int arg1, int arg2, int arg3) {
        ++field4661;
        if (arg2 != 0) {
            return null;
        } else {
            return !class121.method796(true, arg3, arg1, arg0) ? null : class225.method1559(true);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            method1807(-34);
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field4659;
        if (super.field2064.field1035) {
            int var4 = class236.field4202[arg1];
            if (~this.field4656 != -1) {
                for (int var5 = 0; var5 < class64.field1132; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class257.field4559[var5];
                    int var9 = this.field4656;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var4 + var8 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field4658; ++var10) {
                        if (~var6 <= ~this.field4669[var10] && var6 < this.field4669[var10 + 1]) {
                            if (~var6 > ~this.field4673[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field4658; ++var12) {
                    if (var4 >= this.field4669[var12] && ~var4 > ~this.field4669[var12 - -1]) {
                        if (~this.field4673[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class58.method389(var3, 0, class64.field1132, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "(I)V")
    public static final void method1806(int arg0) {
        if (arg0 != 4096) {
            field4667 = 125;
        }
        ++field4666;
        if (class229.field4119 != null) {
            class159 var1 = class229.field4119;
            synchronized (class229.field4119) {
                class229.field4119 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4670 = null;
        field4654 = null;
        field4650 = null;
        field4665 = null;
        if (arg0 == -12863) {
            field4671 = null;
            field4664 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field4651;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4656 = arg1.method1580(-51);
                }
            } else {
                this.field4652 = arg1.method1593(true);
            }
        } else {
            this.field4658 = arg1.method1580(-23);
        }
        if (!arg2) {
            method1804(-88, (class176) null);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class263() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    private final void method1808(byte arg0) {
        this.field4669 = new int[this.field4658 + 1];
        this.field4673 = new int[this.field4658 + 1];
        ++field4660;
        if (arg0 != -128) {
            method1805((class121) null, 31, 119, 72);
        }
        int var2 = 0;
        int var3 = 4096 / this.field4658;
        int var4 = this.field4652 * var3 >> 12;
        for (int var5 = 0; this.field4658 > var5; ++var5) {
            this.field4669[var5] = var2;
            this.field4673[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4669[this.field4658] = 4096;
        this.field4673[this.field4658] = 4096 - -this.field4673[0];
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        this.method1808((byte) -128);
        ++field4668;
        if (arg0 != -1) {
            field4657 = -116;
        }
    }
}
