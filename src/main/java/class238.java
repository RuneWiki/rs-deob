import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class238 extends class248 {

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    private final int field4143;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private final int field4149;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    private final int field4140;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private final int field4144;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Ldf;")
    public static class51 field4145 = class46.method233("b12_full", 100);

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4141 = 0;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Ldf;")
    public static class51 field4148 = class46.method233(")3", 100);

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4142;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        int var4 = 63 / ((arg1 - 20) / 59);
        ++field4151;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)V")
    public final void method153(int arg0, byte arg1, int arg2) {
        ++field4152;
        int var4 = this.field4140 * arg2 >> 12;
        int var5 = this.field4149 * arg0 >> 12;
        int var6 = this.field4144 * arg0 >> 12;
        int var7 = this.field4143 * arg2 >> 12;
        if (arg1 != 98) {
            field4145 = null;
        }
        class6.method30(super.field4368, var4, var7, var5, var6, 0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1644(int arg0) {
        field4145 = null;
        field4142 = null;
        field4148 = null;
        if (arg0 != -8701) {
            method1645(true, 114);
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V")
    public class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4143 = arg2;
        this.field4149 = arg3;
        this.field4140 = arg0;
        this.field4144 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)I")
    public static final int method1645(boolean arg0, int arg1) {
        ++field4147;
        if (!arg0) {
            method1646((byte) -44, -109);
        }
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        int var4 = 8 % ((arg2 - 66) / 40);
        ++field4146;
        int var5 = this.field4140 * arg1 >> 12;
        int var6 = this.field4144 * arg0 >> 12;
        int var7 = this.field4143 * arg1 >> 12;
        int var8 = this.field4149 * arg0 >> 12;
        class30.method151(var8, var6, var5, false, super.field4365, super.field4368, super.field4372, var7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
    public static final void method1646(byte arg0, int arg1) {
        class244 var2 = class42.field664;
        synchronized (class42.field664) {
            class84.field1402 = arg1;
        }
        ++field4150;
        int var3 = -52 / ((-26 - arg0) / 39);
    }
}
