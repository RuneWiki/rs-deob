import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class76 extends class17 {

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    private int field992 = -1;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Lhm;")
    public static class150 field991 = null;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "[I")
    private int[] field994;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(I)V")
    public static void method589(int arg0) {
        field991 = null;
        if (arg0 != -3399) {
            field991 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public final void method84(int arg0) {
        super.method84(arg0);
        ++field1000;
        this.field994 = null;
    }

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "(I)V")
    public static final void method590(int arg0) {
        if (arg0 == 321) {
            ++field993;
            class225.field3233 = 0;
            int var1 = (class246.field3587.field1896 >> 7) - -class441.field6171;
            int var2 = (class246.field3587.field1899 >> 7) + class367.field5241;
            if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
                class225.field3233 = 1;
            }
            if (~var1 <= -3073 && ~var1 >= -3119 && ~var2 <= -9493 && ~var2 >= -9536) {
                class225.field3233 = 1;
            }
            if (~class225.field3233 == -2 && ~var1 <= -3140 && var1 <= 3199 && ~var2 <= -3009 && var2 <= 3062) {
                class225.field3233 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "(I)V")
    public static final void method591(int arg0) {
        class538.method3164((byte) -117, (long) class390.field5481, class385.field5414);
        ++field999;
        if (~class472.field6578 != arg0) {
            class211.method1334(class472.field6578, -1);
        }
        for (int var1 = 0; ~var1 > ~class449.field6257; ++var1) {
            if (class306.field4450[var1]) {
                class531.field7773[var1] = true;
            }
            class498.field7053[var1] = class306.field4450[var1];
            class306.field4450[var1] = false;
        }
        class323.field4722 = class390.field5481;
        if (class385.field5414.method317()) {
            class307.field4466 = true;
        }
        if (~class472.field6578 != 0) {
            class449.field6257 = 0;
            class110.method753(1);
        }
        class385.field5414.method295();
        class408.method2419(class385.field5414, (byte) -27);
        int var2 = class162.method1030(true);
        if (var2 == -1) {
            var2 = class432.field6097;
        }
        if (~var2 == 0) {
            var2 = class190.field2719;
        }
        class255.method1645(4096, var2);
        class288.field4213 = 0;
    }

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "(I)V")
    public static final void method592(int arg0) {
        class134.field1759.method294(class413.field5843, class28.field333, class369.field5273);
        ++field1001;
        int var1 = 38 % ((26 - arg0) / 39);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class76() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -25) {
            return null;
        } else {
            ++field990;
            int[][] var3 = super.field201.method1851(arg0, (byte) -56);
            if (super.field201.field4431) {
                int var4 = this.field989 * (~class178.field2556 != ~this.field995 ? this.field995 * arg0 / class178.field2556 : arg0);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class530.field7763 != this.field989) {
                    for (int var8 = 0; ~var8 > ~class530.field7763; ++var8) {
                        int var9 = this.field989 * var8 / class530.field7763;
                        int var10 = this.field994[var4 + var9];
                        var7[var8] = class239.method1507(var10, 255) << 4;
                        var6[var8] = class239.method1507(65280, var10) >> 4;
                        var5[var8] = class239.method1507(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; ~var11 > ~class530.field7763; ++var11) {
                        int var12 = this.field994[var4++];
                        var7[var11] = class239.method1507(var12 << 4, 4080);
                        var6[var11] = class239.method1507(var12 >> 4, 4080);
                        var5[var11] = class239.method1507(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V")
    public final void method90(int arg0, int arg1, int arg2) {
        super.method90(arg0, arg1, arg2);
        ++field998;
        if (this.field992 >= 0 && class387.field5431 != null) {
            int var4 = class387.field5431.method83(this.field992, 95).field3186 ? 64 : 128;
            this.field994 = class387.field5431.method81((byte) 106, var4, this.field992, 1.0F, false, var4);
            this.field989 = var4;
            this.field995 = var4;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 == 5159) {
            if (~arg1 == -1) {
                this.field992 = arg0.method2338(0);
            }
            ++field996;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
    public final int method86(byte arg0) {
        if (arg0 > -11) {
            return -71;
        } else {
            ++field997;
            return this.field992;
        }
    }
}
