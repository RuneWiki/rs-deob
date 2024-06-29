import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 extends class273 {

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    private int field249 = 1;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    private int field250 = 1;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    private int field246 = 204;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "Ljd;")
    public static class86 field247 = class122.method868("<col=c0ff00>", true);

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "[[S")
    public static short[][] field257 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field253;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field246 = arg1.method1410(-99);
                }
            } else {
                this.field249 = arg1.method1408((byte) -122);
            }
        } else {
            this.field250 = arg1.method1408((byte) -20);
        }
        if (arg2 >= -16) {
            method51(-54);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static void method50(int arg0) {
        field257 = null;
        if (arg0 == 918) {
            field247 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
    public static final void method51(int arg0) {
        ++field255;
        if (arg0 != 21966) {
            method50(96);
        }
        if (class76.field1517 != null) {
            class76.field1517.method358(-15924);
        }
        if (class25.field601 != null) {
            class25.field601.method358(-15924);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field251;
        if (arg0 != -7420) {
            return null;
        } else {
            int[] var3 = super.field4800.method1224(arg1, 0);
            if (super.field4800.field3160) {
                for (int var4 = 0; ~class176.field3200 < ~var4; ++var4) {
                    int var5 = class114.field2184[var4];
                    int var6 = class143.field2711[arg1];
                    int var7 = this.field250 * var5 >> 12;
                    int var8 = this.field249 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field250) * this.field250;
                    int var10 = var6 % (4096 / this.field249) * this.field249;
                    if (this.field246 > var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field246 < ~var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field246 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lbj;I)V")
    public static final void method52(class151 arg0, int arg1) {
        class9.field284 = arg0;
        if (arg1 != -11339) {
            method50(77);
        }
        ++field256;
        client.field2853 = class9.field284.method1075(4, -127);
    }
}
