import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class62 extends class124 {

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private final int field954;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    private final int field971;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    private final int field958;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field952 = 0;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field957 = 100;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "[B")
    private byte[] field953;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lme;I)I", line = 18)
    public static final int method508(class295 arg0, int arg1) {
        field967++;
        int var2 = arg1;
        if (arg0.method2034(class6.field60, (byte) 117)) {
            var2 = arg1 + 1;
        }
        if (arg0.method2034(class275.field4732, (byte) 123)) {
            var2++;
        }
        if (arg0.method2034(class43.field642, (byte) 88)) {
            var2++;
        }
        if (arg0.method2034(class227.field3665, (byte) 26)) {
            var2++;
        }
        if (arg0.method2034(class148.field2428, (byte) 77)) {
            var2++;
        }
        if (arg0.method2034(class113.field1832, (byte) 110)) {
            var2++;
        }
        if (arg0.method2034(class8.field104, (byte) 57)) {
            var2++;
        }
        if (arg0.method2034(class179.field2926, (byte) 11)) {
            var2++;
        }
        if (arg0.method2034(class285.field4896, (byte) 7)) {
            var2++;
        }
        if (arg0.method2034(class33.field471, (byte) 90)) {
            var2++;
        }
        if (arg0.method2034(class20.field259, (byte) 98)) {
            var2++;
        }
        if (arg0.method2034(class186.field3112, (byte) 61)) {
            var2++;
        }
        if (arg0.method2034(class295.field5040, (byte) 17)) {
            var2++;
        }
        if (arg0.method2034(class120.field1999, (byte) 46)) {
            var2++;
        }
        if (arg0.method2034(class98.field1575, (byte) 20)) {
            var2++;
        }
        if (arg0.method2034(class215.field3523, (byte) 92)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIFFF)V", line = 88)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field954 = (int) (arg6 * 4096.0F);
        this.field971 = (int) (arg7 * 4096.0F);
        this.field961 = this.field958 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLme;Lme;)V", line = 104)
    public static final void method509(byte arg0, class295 arg1, class295 arg2) {
        field951++;
        class178.field2923 = class161.method1147(1, class14.field198, 0, arg2, arg1);
        if (class55.field815) {
            class4.field44 = class1.method2((byte) -113, arg2, arg1, class14.field198, 0);
        } else {
            class4.field44 = (class118) class178.field2923;
        }
        class69.field1062 = class161.method1147(1, class37.field561, 0, arg2, arg1);
        class251.field4187 = class161.method1147(1, class157.field2570, 0, arg2, arg1);
        if (arg0 != 115) {
            method508((class295) null, 24);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 127)
    public final void method510(int arg0) {
        this.field970 = 0;
        this.field955 = 0;
        if (arg0 == 204) {
            field956++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 140)
    public final void method511(int arg0) {
        this.field961 = this.field958;
        this.field970 >>= 0x4;
        if (arg0 != 24170) {
            return;
        }
        if (this.field970 < 0) {
            this.field970 = 0;
        } else if (this.field970 > 255) {
            this.field970 = 255;
        }
        field969++;
        this.method512(this.field955++, (byte) this.field970);
        this.field970 = 0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V", line = 163)
    public void method512(int arg0, byte arg1) {
        field964++;
        this.field953[arg0] = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)V", line = 171)
    public final void method513(byte arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field968 = this.field954 - (arg1 >= 0 ? arg1 : -arg1);
            this.field968 = this.field968 * this.field968 >> 12;
            this.field963 = 4096;
            this.field970 = this.field968;
        } else {
            this.field963 = this.field971 * this.field968 >> 12;
            if (this.field963 < 0) {
                this.field963 = 0;
            } else if (this.field963 > 4096) {
                this.field963 = 4096;
            }
            this.field968 = this.field954 - (arg1 < 0 ? -arg1 : arg1);
            this.field968 = this.field968 * this.field968 >> 12;
            this.field968 = this.field968 * this.field963 >> 12;
            this.field970 += this.field968 * this.field961 >> 12;
            this.field961 = this.field961 * this.field958 >> 12;
        }
        if (arg0 <= -92) {
            field962++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 217)
    public static final void method514(byte arg0) {
        field959++;
        class206.field3362.method1482((byte) 30);
        class46.field755.method1482((byte) 30);
        class171.field2798.method1482((byte) 30);
        class12.field159.method1482(arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V", line = 228)
    public static final void method515(int arg0, boolean arg1) {
        field965++;
        for (int var2 = 0; var2 < class185.field3107; var2++) {
            class23 var3 = class23.field311[class232.field3816[var2]];
            long var4 = (long) class232.field3816[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method149((byte) 104) && arg1 == var3.field314.field1936 && var3.field314.method885(true)) {
                int var6 = var3.field1774 >> 7;
                int var7 = var3.field1769 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method776(true) == 1 && (var3.field1774 & 0x7F) == 64 && (var3.field1769 & 0x7F) == 64) {
                        if (class310.field5253[var6][var7] == class178.field2914) {
                            continue;
                        }
                        class310.field5253[var6][var7] = class178.field2914;
                    }
                    if (!var3.field314.field1956) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1753 = class73.method589(class247.field4119, true, var3.field1774, var3.field1769);
                    class262.method1807(class247.field4119, var3.field1774, var3.field1769, var3.field1753, (var3.method776(true) - 1) * 64 + 60, var3, var3.field1765, var4, var3.field1731);
                }
            }
        }
        if (arg0 != -1270966393) {
            field966 = 13;
        }
    }
}
