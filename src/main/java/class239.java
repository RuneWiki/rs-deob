import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class239 extends class179 {

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    private int field4073 = 2048;

    @OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
    private int field4079 = 1024;

    @OriginalMember(owner = "client!wm", name = "Y", descriptor = "I")
    private int field4078 = 3072;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "Lke;")
    public static class256 field4072 = class316.method2202("<col=40ff00>", 27626);

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "Lke;")
    public static class256 field4074 = class316.method2202(")4p=", 27626);

    @OriginalMember(owner = "client!wm", name = "ab", descriptor = "Lke;")
    public static class256 field4080 = class316.method2202(":clanreq:", 27626);

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!wm", name = "cb", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!wm", name = "db", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!wm", name = "bb", descriptor = "Lng;")
    public static class138 field4081;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            this.method55(55, -52);
        }
        int[] var3 = this.field3157.method1258(-115, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) 121);
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                var3[var5] = (var4[var5] * this.field4073 >> 12) + this.field4079;
            }
        }
        field4076++;
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILra;I)V", line = 43)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 <= 108) {
            return;
        }
        field4070++;
        if (arg2 == 0) {
            this.field4079 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field4078 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field3153 = arg1.method357(false) == 1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)V", line = 87)
    public static void method1607(int arg0) {
        if (arg0 != 0) {
            field4081 = (class138) null;
        }
        field4074 = null;
        field4072 = null;
        field4080 = null;
        field4081 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)[[I", line = 106)
    public final int[][] method55(int arg0, int arg1) {
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, arg0 + 83, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class161.field2858; var11++) {
                var8[var11] = (var5[var11] * this.field4073 >> 12) + this.field4079;
                var10[var11] = (var6[var11] * this.field4073 >> 12) + this.field4079;
                var9[var11] = this.field4079 + (var7[var11] * this.field4073 >> 12);
            }
        }
        field4077++;
        if (arg0 != 75) {
            field4072 = (class256) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIIII)V", line = 150)
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4082++;
        if (arg1 != 3072) {
            field4081 = (class138) null;
        }
        class32 var10 = null;
        for (class32 var11 = (class32) class124.field2196.method1270((byte) -121); var11 != null; var11 = (class32) class124.field2196.method1277(1)) {
            if (var11.field526 == arg2 && var11.field525 == arg7 && var11.field514 == arg5 && var11.field517 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class32();
            var10.field525 = arg7;
            var10.field526 = arg2;
            var10.field517 = arg6;
            var10.field514 = arg5;
            class152.method1140((byte) -127, var10);
            class124.field2196.method1269(false, var10);
        }
        var10.field512 = arg9;
        var10.field518 = arg3;
        var10.field524 = arg4;
        var10.field511 = arg0;
        var10.field520 = arg8;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 191)
    public class239() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 200)
    public final void method418(byte arg0) {
        this.field4073 = this.field4078 - this.field4079;
        if (arg0 != -110) {
            method1607(114);
        }
        field4084++;
    }
}
