import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class160 extends class228 {

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    private int field2844 = 0;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
    private int field2841 = 10;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    private int field2849 = 2048;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field2839 = 255;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "Loa;")
    public static class99 field2842 = class221.method1463(2844, ")3");

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2843 = 128;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Loa;")
    public static class99 field2835 = class221.method1463(2844, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "[J")
    public static long[] field2846 = new long[100];

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "Lpi;")
    public static class139 field2837;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[I")
    private int[] field2834;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[I")
    private int[] field2840;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class160() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (arg0 != -8) {
            method1086((class203) null, (byte) 46);
        }
        this.method1085(119);
        ++field2836;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    private final void method1085(int arg0) {
        this.field2840 = new int[this.field2841 + 1];
        ++field2845;
        this.field2834 = new int[this.field2841 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field2841;
        int var4 = this.field2849 * var3 >> 12;
        for (int var5 = 0; this.field2841 > var5; ++var5) {
            this.field2840[var5] = var2;
            this.field2834[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 < 109) {
            this.field2844 = 85;
        }
        this.field2840[this.field2841] = 4096;
        this.field2834[this.field2841] = 4096 - -this.field2834[0];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field2838;
        int[] var3 = super.field3952.method1262(arg0, arg1 ^ -7495);
        if (arg1 != -3) {
            return null;
        } else {
            if (super.field3952.field3276) {
                int var4 = class54.field879[arg0];
                if (this.field2844 != 0) {
                    for (int var5 = 0; ~class234.field4046 < ~var5; ++var5) {
                        int var6 = 0;
                        int var7 = class281.field4923[var5];
                        int var8 = this.field2844;
                        if (var8 != 1) {
                            if (var8 != 2) {
                                if (~var8 == -4) {
                                    var6 = (-var4 + var7 >> 1) + 2048;
                                }
                            } else {
                                var6 = 2048 - -(var7 + -4096 + var4 >> 1);
                            }
                        } else {
                            var6 = var7;
                        }
                        short var9 = 0;
                        for (int var10 = 0; this.field2841 > var10; ++var10) {
                            if (var6 >= this.field2840[var10] && var6 < this.field2840[var10 + 1]) {
                                if (var6 < this.field2834[var10]) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var9;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field2841 > var12; ++var12) {
                        if (~this.field2840[var12] >= ~var4 && var4 < this.field2840[var12 + 1]) {
                            if (this.field2834[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class241.method1569(var3, 0, class234.field4046, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lel;B)V")
    public static final void method1086(class203 arg0, byte arg1) {
        ++field2847;
        arg0.field3540 = false;
        if (arg0.field3539 != null) {
            arg0.field3539.field2034 = 0;
        }
        for (class203 var2 = arg0.method154(); var2 != null; var2 = arg0.method140()) {
            method1086(var2, (byte) -40);
        }
        if (arg1 > -37) {
            field2835 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            this.field2840 = null;
        }
        ++field2833;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2844 = arg1.method1693((byte) 89);
                }
            } else {
                this.field2849 = arg1.method1740((byte) 118);
            }
        } else {
            this.field2841 = arg1.method1693((byte) -89);
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static void method1087(int arg0) {
        field2842 = null;
        field2837 = null;
        if (arg0 >= -12) {
            method1086((class203) null, (byte) -65);
        }
        field2846 = null;
        field2835 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
    public static final void method1088(int arg0, boolean arg1) {
        ++field2848;
        if (~arg0 <= -1 && ~class218.field3796.length < ~arg0) {
            class218.field3796[arg0] = !class218.field3796[arg0];
            if (arg1) {
                method1086((class203) null, (byte) 27);
            }
        }
    }
}
