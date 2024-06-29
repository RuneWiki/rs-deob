import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class236 extends class300 implements class544 {

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    private int field3048;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    private int field3047;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "[I")
    public static int[] field3050;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)Z", line = 5)
    public static final boolean method1422(int arg0, int arg1, int arg2) {
        ++field3053;
        if (arg1 != -456) {
            field3050 = null;
        }
        return (arg2 & 2048) != 0 | class92.method680(arg0, arg2, 42) || class273.method1626((byte) -66, arg2, arg0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lba;ZIILqt;I)V", line = 21)
    public static final void method1423(class359 arg0, boolean arg1, int arg2, int arg3, class595 arg4, int arg5) {
        if (!arg1) {
            ++field3052;
            if (arg0 != null) {
                arg4.method3291(arg0.method2085(), arg3, arg0.method2068(), (byte) -83, arg2, arg5, arg0.method2054(), arg0.method2084(), arg0.method2071(), arg0.method2089(), arg0.method2061());
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 40)
    public static void method1424(int arg0) {
        field3050 = null;
        if (arg0 != 30031) {
            field3050 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lel;Lnh;III[B)V", line = 51)
    public class236(class513 arg0, class699 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class100.field1288, arg2 * arg3 * arg4, false);
        this.field3048 = arg2;
        this.field3047 = arg3;
        this.field3049 = arg4;
        super.field3828.method1349(this, false);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3816, 0, this.method1787(127), this.field3048, this.field3047, this.field3049, 0, class237.method1429(super.field3827, 1002608112), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(III)Z", line = 65)
    public static final boolean method1425(int arg0, int arg1, int arg2) {
        if (arg1 != 32879) {
            method1425(-109, 88, -5);
        }
        ++field3054;
        return (arg0 & 1408) != 0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 78)
    public static final void method1426(byte arg0) {
        for (class341 var1 = (class341) class163.field1920.method1720(true); var1 != null; var1 = (class341) class163.field1920.method1720(true)) {
            class234.method1414(20, var1);
        }
        ++field3051;
        int var2;
        int var3;
        if (!class611.field8310.method2744(class628.field8526, 4)) {
            var2 = class518.field6552;
            var3 = class518.field6552;
        } else {
            var3 = 0;
            var2 = 3;
        }
        client.method1696();
        int var4 = 7 / ((6 - arg0) / 50);
        for (int var5 = var3; var5 <= var2; ++var5) {
            client.method1706();
            client.method1691(var5);
            client.method1699(var5);
        }
        client.method1690();
        client.method1692();
    }
}
