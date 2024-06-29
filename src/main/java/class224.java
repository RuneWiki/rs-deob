import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class224 extends class89 {

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
    private int field3798 = -1;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "Z")
    public static boolean field3782 = false;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "[Lda;")
    public static class275[] field3797 = new class275[1000];

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Lda;")
    private static class275 field3786 = class255.method1672(109, "slide:");

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lda;")
    public static class275 field3785 = field3786;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "Lda;")
    public static class275 field3781 = field3786;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    private int field3791;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "I")
    private int field3801;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Lma;")
    public static class105 field3778;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "[I")
    private int[] field3784;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "[I")
    public static int[] field3794;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field3795;
        if (~arg2 == -1) {
            this.field3798 = arg1.method608(28);
        }
        if (arg0 != -20503) {
            method1450(32, -116, 66, -34, -91);
        }
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "(I)V")
    public static final void method1449(int arg0) {
        class149.field2597.method526((byte) -40, arg0);
        ++class91.field1541;
        class149.field2597.method600(class256.field4512, (byte) 69);
        ++field3790;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)I")
    public static final int method1450(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 34 % ((arg0 - -82) / 34);
        ++field3788;
        int var6 = -class223.field3760[arg1 * 1024 / arg4] + 65536 >> 1;
        return ((65536 - var6) * arg2 >> 16) + (arg3 * var6 >> 16);
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "(I)V")
    public static void method1451(int arg0) {
        field3786 = null;
        field3781 = null;
        field3794 = null;
        field3797 = null;
        if (arg0 == 64) {
            field3785 = null;
            field3778 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field3796;
        super.method55(arg0);
        this.field3784 = null;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)Z")
    private final boolean method1452(byte arg0) {
        int var2 = 115 % ((arg0 - 18) / 56);
        ++field3793;
        if (this.field3784 != null) {
            return true;
        } else if (this.field3798 >= 0) {
            int var3 = class16.field242;
            int var4 = class65.field1070;
            int var5 = class116.field2068.method79(this.field3798, 13335) ? 64 : 128;
            this.field3784 = class116.field2068.method76(this.field3798, -25649);
            this.field3801 = var5;
            this.field3791 = var5;
            class66.method449(var4, var3, (byte) -126);
            return this.field3784 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lma;Lma;ILma;Lma;)V")
    public static final void method1453(class105 arg0, class105 arg1, int arg2, class105 arg3, class105 arg4) {
        class6.field85 = arg1;
        class56.field947 = arg3;
        ++field3792;
        class96.field1638 = arg0;
        class144.field2530 = arg4;
        class173.field3005 = new class229[class96.field1638.method773(true)][];
        if (arg2 == -20451) {
            class52.field867 = new boolean[class96.field1638.method773(true)];
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    public static final void method1454(byte arg0) {
        if (arg0 == 23) {
            ++field3780;
            if (~class166.field2881 != 0) {
                class145.method1034((byte) -99, class166.field2881);
            }
            for (int var1 = 0; var1 < class123.field2203; ++var1) {
                if (class200.field3418[var1]) {
                    class100.field1691[var1] = true;
                }
                class65.field1065[var1] = class200.field3418[var1];
                class200.field3418[var1] = false;
            }
            class255.field4501 = null;
            class174.field3020 = -1;
            class271.field4710 = -1;
            class5.field71 = class35.field576;
            if (~class166.field2881 != 0) {
                class123.field2203 = 0;
                class82.method536(0, class166.field2881, class212.field3587, class249.field4391, 0, -1, (byte) -116, 0, 0);
            }
            class47.method293();
            class105.field1829 = 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field3799;
        if (!arg0) {
            field3787 = -52;
        }
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007 && this.method1452((byte) -77)) {
            int var4 = this.field3801 * (class16.field242 == this.field3791 ? arg1 : this.field3791 * arg1 / class16.field242);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class65.field1070 == this.field3801) {
                for (int var8 = 0; var8 < class65.field1070; ++var8) {
                    int var9 = this.field3784[var4++];
                    var7[var8] = class19.method98(4080, var9 << 4);
                    var6[var8] = class19.method98(var9 >> 4, 4080);
                    var5[var8] = class19.method98(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class65.field1070; ++var10) {
                    int var11 = this.field3801 * var10 / class65.field1070;
                    int var12 = this.field3784[var4 + var11];
                    var7[var10] = class19.method98(255, var12) << 4;
                    var6[var10] = class19.method98(65280, var12) >> 4;
                    var5[var10] = class19.method98(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class224() {
        super(0, false);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)I")
    public final int method651(byte arg0) {
        if (arg0 != 71) {
            return -95;
        } else {
            ++field3783;
            return this.field3798;
        }
    }
}
