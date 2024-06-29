import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class171 extends class195 {

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    private int field2708 = -1;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "Lck;")
    public static class119 field2707 = class298.method1987((byte) 23, "Weiter");

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "Lvk;")
    public static class67 field2704 = new class67(200);

    @OriginalMember(owner = "client!rl", name = "jb", descriptor = "Lck;")
    public static class119 field2716 = class298.method1987((byte) 42, "::tele 0)1");

    @OriginalMember(owner = "client!rl", name = "lb", descriptor = "Lck;")
    public static class119 field2718 = class298.method1987((byte) 52, "labels)3dat");

    @OriginalMember(owner = "client!rl", name = "kb", descriptor = "Lck;")
    private static class119 field2717 = class298.method1987((byte) 6, "Loaded interfaces");

    @OriginalMember(owner = "client!rl", name = "ib", descriptor = "Lck;")
    public static class119 field2715 = field2717;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    private int field2706;

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    private int field2711;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!rl", name = "hb", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "[I")
    private int[] field2703;

    @OriginalMember(owner = "client!rl", name = "mb", descriptor = "[Lkc;")
    public static class38[] field2719;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "[S")
    public static short[] field2709;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Z", line = 5)
    private final boolean method1080(int arg0) {
        int var2 = -115 % ((arg0 - 33) / 40);
        field2714++;
        if (this.field2703 != null) {
            return true;
        } else if (this.field2708 >= 0) {
            int var3 = class227.field3621;
            int var4 = class157.field2504;
            int var5 = class109.field1664.method136(128, this.field2708) ? 64 : 128;
            this.field2703 = class109.field1664.method126(this.field2708, 0);
            this.field2706 = var5;
            this.field2711 = var5;
            class273.method1806(var4, (byte) 120, var3);
            return this.field2703 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 40)
    public final void method350(int arg0) {
        super.method350(23);
        if (arg0 <= 11) {
            this.method1080(-69);
        }
        this.field2703 = null;
        field2705++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[[I", line = 55)
    public final int[][] method9(byte arg0, int arg1) {
        field2701++;
        int[][] var3 = this.field3126.method603(arg1, -128);
        if (arg0 != 3) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field3126.field1372 && this.method1080(81)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (class227.field3621 == this.field2706 ? arg1 : this.field2706 * arg1 / class227.field3621) * this.field2711;
            int[] var7 = var3[1];
            if (class157.field2504 == this.field2711) {
                for (int var8 = 0; var8 < class157.field2504; var8++) {
                    int var9 = this.field2703[var6++];
                    var5[var8] = class19.method151(var9 << 4, 4080);
                    var7[var8] = class19.method151(65280, var9) >> 4;
                    var4[var8] = class19.method151(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class157.field2504; var10++) {
                    int var11 = this.field2711 * var10 / class157.field2504;
                    int var12 = this.field2703[var6 + var11];
                    var5[var10] = class19.method151(255, var12) << 4;
                    var7[var10] = class19.method151(var12, 65280) >> 4;
                    var4[var10] = class19.method151(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I", line = 128)
    public final int method1081(int arg0) {
        field2712++;
        return arg0 < 75 ? 114 : this.field2708;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lfj;II)V", line = 139)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2708 = arg0.method63((byte) 1);
        }
        field2710++;
        if (arg1 >= -117) {
            this.method1080(120);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[F)[F", line = 153)
    public static final float[] method1082(int arg0, float[] arg1) {
        field2713++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class213.method1344(arg1, 0, var2, 0, arg1.length);
            int var3 = -29 % ((arg0 + 67) / 47);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 175)
    public class171() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)Lml;", line = 185)
    public static final class134 method1083(int arg0, int arg1, int arg2) {
        class134 var3 = class20.method153(1, arg0);
        field2702++;
        if (arg1 == -1) {
            return var3;
        } else {
            if (arg2 <= 123) {
                field2719 = (class38[]) null;
            }
            return var3 == null || var3.field2061 == null || var3.field2061.length <= arg1 ? null : var3.field2061[arg1];
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V", line = 213)
    public static void method1084(byte arg0) {
        field2719 = null;
        field2718 = null;
        field2717 = null;
        field2707 = null;
        field2709 = null;
        field2704 = null;
        field2715 = null;
        if (arg0 != 25) {
            method1083(-83, 25, 91);
        }
        field2716 = null;
    }
}
