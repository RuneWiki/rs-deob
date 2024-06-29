import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class256 extends class76 {

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    private int field4375 = 3072;

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
    private int field4383 = 2048;

    @OriginalMember(owner = "client!ui", name = "jb", descriptor = "I")
    private int field4386 = 1024;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "Lia;")
    public static class257 field4376 = class28.method234(-95, "Untersuchen");

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "Lia;")
    public static class257 field4380 = class28.method234(-69, "sl_stars");

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "Lia;")
    private static class257 field4384 = class28.method234(-87, "glow3:");

    @OriginalMember(owner = "client!ui", name = "nb", descriptor = "Lia;")
    public static class257 field4390 = field4384;

    @OriginalMember(owner = "client!ui", name = "mb", descriptor = "Lia;")
    public static class257 field4389 = field4384;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!ui", name = "lb", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ui", name = "kb", descriptor = "Lhc;")
    public static class116 field4387;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field4385;
        if (arg0 != -9351) {
            method1665((byte) -80, 90);
        }
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int[] var4 = this.method562(arg1, 0, (byte) -104);
            for (int var5 = 0; ~var5 > ~class96.field1807; ++var5) {
                var3[var5] = (var4[var5] * this.field4383 >> 12) + this.field4386;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class256() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static void method1664(byte arg0) {
        field4380 = null;
        field4389 = null;
        field4384 = null;
        field4376 = null;
        field4390 = null;
        field4387 = null;
        if (arg0 < 37) {
            field4380 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field4382;
        int[][] var3 = super.field1485.method649(arg0, true);
        if (arg1 <= 2) {
            field4384 = null;
        }
        if (super.field1485.field1692) {
            int[][] var4 = this.method565((byte) -20, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class96.field1807 > var11; ++var11) {
                var8[var11] = (var6[var11] * this.field4383 >> 12) + this.field4386;
                var9[var11] = (var5[var11] * this.field4383 >> 12) + this.field4386;
                var10[var11] = (var7[var11] * this.field4383 >> 12) + this.field4386;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field4379;
        if (arg1 > -86) {
            this.method157(2, (byte) 119);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1477 = arg0.method1051((byte) -38) == 1;
                }
            } else {
                this.field4375 = arg0.method1063(-17162);
            }
        } else {
            this.field4386 = arg0.method1063(-17162);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)I")
    public static final int method1665(byte arg0, int arg1) {
        int var2 = -48 % ((arg0 - 13) / 53);
        ++field4378;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I")
    public static final int method1666(int arg0, int arg1) {
        ++field4381;
        return arg1 != 2 ? -122 : arg0 & 255;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        ++field4377;
        if (arg0 != 111) {
            this.method157(51, (byte) -110);
        }
        this.field4383 = this.field4375 - this.field4386;
    }
}
