import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class284 extends class351 {

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private int field4047;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    private int field4041;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "[I")
    public static int[] field4045 = new int[32];

    @OriginalMember(owner = "client!in", name = "A", descriptor = "[I")
    public static int[] field4056 = new int[32];

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Lfh;")
    public static class140 field4046;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Lfh;")
    public static class140 field4050;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(JII[I)Ljava/lang/String;", line = 4)
    public static final String method1929(long arg0, int arg1, int arg2, int[] arg3) {
        if (arg1 != 1544261996) {
            method1930((byte) -122);
        }
        field4055++;
        if (class115.field1486 != null) {
            String var5 = class115.field1486.method548(arg0, arg3, (byte) 57, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 25)
    public static void method1930(byte arg0) {
        field4046 = null;
        field4050 = null;
        field4045 = null;
        field4056 = null;
        if (arg0 > -21) {
            field4050 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIZ)V", line = 39)
    public final void method1295(int arg0, int arg1, boolean arg2) {
        field4053++;
        int var4 = this.field4047 * arg0 >> 12;
        int var5 = this.field4041 * arg0 >> 12;
        int var6 = this.field4052 * arg1 >> 12;
        int var7 = this.field4048 * arg0 >> 12;
        int var8 = this.field4051 * arg1 >> 12;
        int var9 = this.field4043 * arg1 >> 12;
        if (!arg2) {
            method1929(61L, -28, -124, (int[]) null);
        }
        int var10 = this.field4042 * arg1 >> 12;
        int var11 = this.field4049 * arg0 >> 12;
        class199.method1464(var5, var6, this.field5486, var7, var11, var8, var10, var9, var4, -6);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V", line = 75)
    public final void method1297(int arg0, int arg1, int arg2) {
        field4044++;
        if (arg0 != 1380163464) {
            this.field4048 = -14;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 84)
    public class284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4052 = arg3;
        this.field4047 = arg0;
        this.field4051 = arg1;
        this.field4041 = arg2;
        this.field4048 = arg4;
        this.field4043 = arg5;
        this.field4049 = arg6;
        this.field4042 = arg7;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V", line = 100)
    public static final void method1931(boolean arg0, int arg1) {
        field4054++;
        class291.field4231.method2264((byte) -64, arg1);
        class345.field5360.method2264((byte) 33, arg1);
        class224.field3231.method2264((byte) -84, arg1);
        if (arg0) {
            field4046 = (class140) null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)V", line = 124)
    public final void method1294(int arg0, int arg1, byte arg2) {
        if (arg2 >= -108) {
            method1930((byte) 62);
        }
        field4057++;
    }
}
