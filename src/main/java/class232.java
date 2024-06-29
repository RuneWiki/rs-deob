import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class232 extends class24 {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    private final int field4056;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    private final int field4061;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    private final int field4071;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    private final int field4063;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    private final int field4065;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    private final int field4068;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    private final int field4075;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    private final int field4059;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "[I")
    public static int[] field4057 = new int[50];

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lud;")
    public static class279 field4064 = class130.method1024(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 255);

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field4070 = 0;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lud;")
    private static class279 field4072 = class130.method1024(" more options", 255);

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lud;")
    public static class279 field4066 = field4072;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Lud;")
    public static class279 field4073 = class130.method1024("rot:", 255);

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field4074 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "[[[I")
    public static int[][][] field4067;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I", line = 5)
    public static final int method1676(byte arg0) {
        field4069++;
        if (arg0 > -104) {
            method1677(-119);
        }
        class139.field2512 = 0;
        return class83.method725(-59);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZI)V", line = 25)
    public final void method214(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field4074 = 46;
        }
        field4054++;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V", line = 48)
    public final void method217(int arg0, int arg1, int arg2) {
        field4055++;
        if (arg1 != 13217) {
            method1676((byte) 33);
        }
        int var4 = this.field4068 * arg0 >> 12;
        int var5 = this.field4063 * arg2 >> 12;
        int var6 = this.field4061 * arg2 >> 12;
        int var7 = this.field4075 * arg0 >> 12;
        int var8 = this.field4056 * arg2 >> 12;
        int var9 = this.field4065 * arg0 >> 12;
        int var10 = this.field4071 * arg0 >> 12;
        int var11 = this.field4059 * arg2 >> 12;
        class154.method1214(var5, var8, var9, var10, var11, var4, var7, this.field614, var6, 0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 76)
    public final void method216(int arg0, int arg1, int arg2) {
        int var4 = -11 / ((arg0 + 72) / 34);
        field4058++;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 88)
    public static void method1677(int arg0) {
        if (arg0 != -17026) {
            field4073 = (class279) null;
        }
        field4073 = null;
        field4072 = null;
        field4066 = null;
        field4067 = (int[][][]) null;
        field4057 = null;
        field4064 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 108)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4056 = arg4;
        this.field4061 = arg2;
        this.field4071 = arg7;
        this.field4063 = arg0;
        this.field4065 = arg5;
        this.field4068 = arg1;
        this.field4075 = arg3;
        this.field4059 = arg6;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 142)
    public static final void method1678(int arg0) {
        class98.field1845.method1338((byte) -120);
        if (arg0 < -65) {
            field4060++;
            class248.field4407.method1338((byte) -125);
        }
    }
}
