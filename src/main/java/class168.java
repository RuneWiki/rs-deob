import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class168 extends class196 {

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    private int field2727 = 1024;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    private int field2729 = 3072;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    private int field2732 = 2048;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Lbg;")
    public static class217 field2733 = new class217(128);

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "Ldf;")
    public static class51 field2736 = class46.method233("Untersuchen", 100);

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Ldf;")
    public static class51 field2737 = class46.method233("null", 100);

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Lu;")
    public static class111 field2738;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field2730;
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 0, -126);
            for (int var5 = 0; ~class49.field767 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2732 >> 12) + this.field2727;
            }
        }
        if (arg1 != 10565) {
            this.field2727 = -100;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public static void method1169(int arg0) {
        field2737 = null;
        field2733 = null;
        if (arg0 != -28153) {
            method1170(-118, 78);
        }
        field2738 = null;
        field2736 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class168() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)Ldf;")
    public static final class51 method1170(int arg0, int arg1) {
        if (arg1 != -3889) {
            field2737 = null;
        }
        ++field2728;
        return ~class77.field1235[arg0].method293(false) < -1 ? class20.method104(-112, new class51[] { class129.field2166[arg0], class118.field1979, class77.field1235[arg0] }) : class129.field2166[arg0];
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        this.field2732 = -this.field2727 + this.field2729;
        ++field2734;
        int var2 = 13 % ((arg0 - 43) / 41);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 == 82) {
            ++field2735;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field3291 = ~arg1.method897(arg2 ^ 61) == -2;
                    }
                } else {
                    this.field2729 = arg1.method876(false);
                }
            } else {
                this.field2727 = arg1.method876(false);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        int[][] var3 = super.field3285.method1548(arg1, (byte) -31);
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(56, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class49.field767; ++var11) {
                var8[var11] = (var5[var11] * this.field2732 >> 12) + this.field2727;
                var9[var11] = this.field2727 - -(var6[var11] * this.field2732 >> 12);
                var10[var11] = (var7[var11] * this.field2732 >> 12) + this.field2727;
            }
        }
        if (arg0 != 11) {
            this.method73((byte) -46);
        }
        ++field2731;
        return var3;
    }
}
