import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class256 {

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    private int field4541 = -1;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    private int field4547 = 0;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Lef;")
    private class175 field4555 = new class175();

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Z")
    public boolean field4558 = false;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    private int field4557;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "[[[I")
    private int[][][] field4553;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "[Ld;")
    private class50[] field4550;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "[I")
    public static int[] field4542 = new int[32768];

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field4536 = 0;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Z")
    public static boolean field4544 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lng;")
    public static class121 field4545;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lbg;")
    public static class168 field4537;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "[Lwa;")
    public static class226[] field4543;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1766(int arg0) {
        field4554++;
        if (this.field4557 != this.field4551) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -117 / (-arg0 / 40);
        while (var2 < this.field4551) {
            this.field4550[var2] = class175.field2943;
            var2++;
        }
        return this.field4553;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Lri;")
    public static final class35 method1767(int arg0, byte arg1) {
        field4549++;
        class35 var2 = (class35) class273.field4822.method991((long) arg0, -25858);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class3.field19.method826((byte) 35, class56.method374(arg0, (byte) 84), class201.method1411(255, arg0));
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method245(new class225(var3), arg1 + 160);
        }
        if (arg1 != -109) {
            method1767(-84, (byte) -29);
        }
        class273.field4822.method987(var4, (long) arg0, -2438);
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILe;)V")
    public static final void method1768(int arg0, int arg1, class191 arg2) {
        class166.field2809++;
        if (arg0 >= -18) {
            method1770(-120);
        }
        class53.field963.method1096(124, 0);
        class53.field963.method1604(9945, arg1);
        field4540++;
        class53.field963.method1606(49152, arg2.method1352(65));
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final void method1769(int arg0) {
        field4533++;
        for (int var2 = arg0; var2 < this.field4551; var2++) {
            this.field4553[var2][0] = null;
            this.field4553[var2][1] = null;
            this.field4553[var2][2] = null;
            this.field4553[var2] = null;
        }
        this.field4553 = null;
        this.field4550 = null;
        this.field4555.method1178(true);
        this.field4555 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public static void method1770(int arg0) {
        if (arg0 == -1) {
            field4537 = null;
            field4542 = null;
            field4545 = null;
            field4543 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)Z")
    public static final boolean method1771(int arg0) {
        field4552++;
        try {
            if (class273.field4825 == arg0) {
                if (class221.field3909 == null) {
                    class221.field3909 = class140.method926(class170.field2878, class207.field3690, class141.field2344);
                    if (class221.field3909 == null) {
                        return false;
                    }
                }
                if (class225.field4053 == null) {
                    class225.field4053 = new class161(class35.field647, class141.field2359);
                }
                if (class42.field733.method1528(class225.field4053, class225.field4030, (byte) 112, class221.field3909, 22050)) {
                    class42.field733.method1514((byte) -61);
                    class42.field733.method1522(-21293, class114.field1888);
                    class42.field733.method1527(class49.field884, -117, class221.field3909);
                    class221.field3909 = null;
                    class170.field2878 = null;
                    class225.field4053 = null;
                    class273.field4825 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class42.field733.method1539((byte) 119);
            class273.field4825 = 0;
            class225.field4053 = null;
            class221.field3909 = null;
            class170.field2878 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)I")
    public static final int method1772(int arg0) {
        if (arg0 != -9165) {
            field4543 = null;
        }
        field4546++;
        return 6;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method1773(byte arg0) {
        class129.field2143++;
        field4535++;
        class53.field963.method1096(61, 0);
        for (class267 var1 = (class267) class73.field1259.method609(false); var1 != null; var1 = (class267) class73.field1259.method610(70)) {
            if (var1.field4723 == 0) {
                class137.method913(15, var1, true);
            }
        }
        if (class32.field449 != null) {
            class184.method1238(class32.field449, (byte) -33);
            class32.field449 = null;
        }
        int var2 = -89 % ((27 - arg0) / 53);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lch;ZLch;)V")
    public static final void method1774(class167 arg0, boolean arg1, class167 arg2) {
        if (arg0.field2816 != null) {
            arg0.method1124(0);
        }
        if (arg1) {
            field4534 = -28;
        }
        arg0.field2822 = arg2.field2822;
        field4556++;
        arg0.field2816 = arg2;
        arg0.field2816.field2822 = arg0;
        arg0.field2822.field2816 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method1775(byte arg0, int arg1) {
        if (arg0 >= -97) {
            this.method1766(-31);
        }
        field4539++;
        if (this.field4557 == this.field4551) {
            this.field4558 = this.field4550[arg1] == null;
            this.field4550[arg1] = class175.field2943;
            return this.field4553[arg1];
        } else if (this.field4551 == 1) {
            this.field4558 = this.field4541 != arg1;
            this.field4541 = arg1;
            return this.field4553[0];
        } else {
            class50 var3 = this.field4550[arg1];
            if (var3 == null) {
                this.field4558 = true;
                if (this.field4547 >= this.field4551) {
                    class50 var4 = (class50) this.field4555.method1177(true);
                    var3 = new class50(arg1, var4.field902);
                    this.field4550[var4.field901] = null;
                    var4.method655(63);
                } else {
                    var3 = new class50(arg1, this.field4547);
                    this.field4547++;
                }
                this.field4550[arg1] = var3;
            } else {
                this.field4558 = false;
            }
            this.field4555.method1170(true, var3);
            return this.field4553[var3.field902];
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V")
    public class256(int arg0, int arg1, int arg2) {
        this.field4557 = arg1;
        this.field4551 = arg0;
        this.field4553 = new int[this.field4551][3][arg2];
        this.field4550 = new class50[this.field4557];
    }
}
