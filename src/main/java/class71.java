import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class71 extends class118 {

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static volatile int field1201 = -1;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lqd;")
    public static class173 field1202 = new class173(50);

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method486(int arg0) {
        field1202 = null;
        if (arg0 != 50) {
            field1206 = 86;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method487(int arg0, int arg1) {
        if (arg0 != 1000000) {
            field1207 = -124;
        }
        ++field1203;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else {
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class88.field1444 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class291.field4676 + "</col>";
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        int var4 = this.field1195 * arg0 >> 12;
        int var5 = this.field1198 * arg0 >> 12;
        int var6 = this.field1205 * arg1 >> 12;
        if (arg2 != -6211) {
            method487(-36, -87);
        }
        int var7 = this.field1193 * arg1 >> 12;
        class285.method1901(super.field1900, -52, var6, var7, var5, var4);
        ++field1197;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public final void method1(int arg0, int arg1, int arg2) {
        ++field1196;
        if (arg1 <= -40) {
            int var4 = this.field1198 * arg0 >> 12;
            int var5 = this.field1195 * arg0 >> 12;
            int var6 = this.field1205 * arg2 >> 12;
            int var7 = this.field1193 * arg2 >> 12;
            class199.method1389(var6, var7, var5, super.field1899, (byte) 123, super.field1900, super.field1898, var4);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(III)V")
    public final void method4(int arg0, int arg1, int arg2) {
        if (arg0 == 1207757217) {
            ++field1199;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V")
    public static final void method488(int arg0, boolean arg1) {
        ++field1204;
        class175 var2 = class182.method1317(3, arg0, arg1);
        var2.method1278((byte) -95);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V")
    public class71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1205 = arg1;
        this.field1198 = arg2;
        this.field1195 = arg0;
        this.field1193 = arg3;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method489(int arg0) {
        class243.field3871.method1255(arg0 ^ -100059);
        class94.field1519.method1255(arg0 + -100069);
        ++field1194;
        if (arg0 != 100000) {
            field1206 = -64;
        }
    }
}
