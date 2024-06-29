import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class589 implements class160 {

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "Lcga;")
    private class86 field8131;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Lfda;")
    private class540 field8126;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field8123 = 0;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III[BII)V", line = 5)
    public static final void method3257(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field8122++;
        if (arg4 != 15609 || arg0 >= arg2) {
            return;
        }
        int var6 = arg0 + arg5;
        int var7 = arg2 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Z", line = 35)
    public final boolean method404(boolean arg0) {
        if (arg0) {
            this.method3259(null, -86, null, (byte) 114, -26, -92);
        }
        field8127++;
        return this.field8131.method474(arg0);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V", line = 51)
    public final void method402(int arg0) {
        if (arg0 <= 119) {
            field8123 = 1;
        }
        field8128++;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BC)I", line = 61)
    public static final int method3258(byte arg0, char arg1) {
        field8125++;
        if (arg1 >= '\u0000' && class417.field5485.length > arg1) {
            return class417.field5485[arg1];
        } else {
            if (arg0 >= -88) {
                method3257(87, -69, -64, null, 27, -113);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lla;ILjava/lang/String;BII)I", line = 83)
    private final int method3259(class409 arg0, int arg1, String arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            this.method374(false, (byte) -25);
        }
        field8130++;
        return arg0.method2332(this.field8126.field7397 - (arg4 * 2), arg1 + arg4, null, 0, arg2, null, 0, 0, 0, this.field8126.field7400 - (arg4 * 2), 0, this.field8126.field7396, null, arg4 + arg5, this.field8126.field7395, 0);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZB)V", line = 95)
    public final void method374(boolean arg0, byte arg1) {
        field8124++;
        if (arg1 > -85) {
            method3258((byte) -36, 't');
        }
        class316 var3 = this.field8131.method470(0, this.field8126.field7399);
        if (var3 == null) {
            return;
        }
        int var4 = this.field8126.field7404.method3139((byte) -116, this.field8126.field7397, class666.field9479) + this.field8126.field7398;
        int var5 = this.field8126.field7406.method1697(-83, this.field8126.field7400, class399.field5293) + this.field8126.field7394;
        if (this.field8126.field7403) {
            class146.field1963.method1121(var4, var5, this.field8126.field7397, this.field8126.field7400, this.field8126.field7408, 0);
        }
        int var6 = var5 + this.method3259(class622.field8625, var5, var3.field4234, (byte) 1, 5, var4) * 12;
        int var9 = var6 + 8;
        if (this.field8126.field7403) {
            class146.field1963.method1101(var4, var9, this.field8126.field7397 + var4 - 1, var9, this.field8126.field7408, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3259(class622.field8625, var6, var3.field4230, (byte) 1, 5, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3259(class622.field8625, var10, var3.field4231, (byte) 1, 5, var4) * 12;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lcga;Lfda;)V", line = 127)
    public class589(class86 arg0, class540 arg1) {
        this.field8131 = arg0;
        this.field8126 = arg1;
    }
}
