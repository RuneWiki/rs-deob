import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class169 extends class196 {

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    private int field2748 = -1;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "[Ldf;")
    public static class51[] field2740 = new class51[100];

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Z")
    public static boolean field2742 = false;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    public static int field2750 = 0;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "[I")
    public static int[] field2744 = new int[5];

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "Ldf;")
    public static class51 field2756 = class46.method233("<)4col>", 100);

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Ljf;")
    public static class60 field2752 = new class60();

    @OriginalMember(owner = "client!k", name = "kb", descriptor = "Ldf;")
    public static class51 field2759 = class46.method233("(Y", 100);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public int field2745;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "[I")
    public int[] field2743;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field2752 = null;
        field2756 = null;
        field2744 = null;
        field2759 = null;
        field2740 = null;
        if (arg0 != 5) {
            method1171(-50);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, false);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILlb;I)Ldf;")
    public static final class51 method1172(int arg0, class121 arg1, int arg2) {
        ++field2749;
        try {
            class51 var3 = new class51();
            var3.field855 = arg1.method877((byte) -74);
            if (var3.field855 > arg2) {
                var3.field855 = arg2;
            }
            var3.field813 = new byte[var3.field855];
            arg1.field2026 += class33.field476.method1429(var3.field855, arg1.field2026, arg0, arg1.field2014, var3.field813, (byte) -111);
            return var3;
        } catch (Exception var4) {
            return class161.field2648;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field2753;
        if (~arg0 == -1) {
            this.field2748 = arg1.method876(false);
        }
        if (arg2 != 82) {
            this.method44(-58, (class121) null, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(BI)[[I")
    public int[][] method46(byte arg0, int arg1) {
        if (arg0 != 11) {
            method1174(100, 31);
        }
        ++field2739;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -97);
        if (super.field3285.field3963 && this.method1175((byte) -18)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class234.field4079 == this.field2745 ? arg1 : this.field2745 * arg1 / class234.field4079) * this.field2751;
            if (class49.field767 == this.field2751) {
                for (int var8 = 0; ~class49.field767 < ~var8; ++var8) {
                    int var9 = this.field2743[var7++];
                    var6[var8] = class191.method1366(var9, 255) << 4;
                    var5[var8] = class191.method1366(var9, 65280) >> 4;
                    var4[var8] = class191.method1366(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class49.field767 > var10; ++var10) {
                    int var11 = this.field2751 * var10 / class49.field767;
                    int var12 = this.field2743[var7 - -var11];
                    var6[var10] = class191.method1366(var12, 255) << 4;
                    var5[var10] = class191.method1366(var12, 65280) >> 4;
                    var4[var10] = class191.method1366(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Llb;I)Lmk;")
    public static final class96 method1173(class121 arg0, int arg1) {
        ++field2746;
        if (arg1 != 0) {
            method1172(-122, (class121) null, -2);
        }
        return new class96(arg0.method884(14513), arg0.method884(14513), arg0.method884(arg1 + 14513), arg0.method884(14513), arg0.method891((byte) -113), arg0.method891((byte) -117), arg0.method897(111));
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(II)V")
    public static final void method1174(int arg0, int arg1) {
        class213.field3708.method1348(0, arg1);
        class63.field1024.method1348(0, arg1);
        if (arg0 == -724930652) {
            ++field2754;
            class233.field4069.method1348(0, arg1);
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)Z")
    public final boolean method1175(byte arg0) {
        ++field2741;
        if (this.field2743 != null) {
            return true;
        } else {
            if (arg0 > -16) {
                method1174(33, -51);
            }
            if (this.field2748 >= 0) {
                class254 var2 = class114.method835(class82.field1367, this.field2748, 0);
                var2.method1733();
                this.field2745 = var2.field2800;
                this.field2751 = var2.field2806;
                this.field2743 = var2.field4447;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)I")
    public final int method1176(int arg0) {
        ++field2755;
        return arg0 != 2 ? 40 : this.field2748;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
    public final void method1177(int arg0) {
        ++field2747;
        super.method1177(-128);
        this.field2743 = null;
        if (arg0 > -126) {
            this.method1177(4);
        }
    }
}
