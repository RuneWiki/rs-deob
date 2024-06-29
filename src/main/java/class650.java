import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class650 extends class69 {

    @OriginalMember(owner = "client!paa", name = "A", descriptor = "I")
    private int field9088;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public int field9078;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public int field9075;

    @OriginalMember(owner = "client!paa", name = "y", descriptor = "I")
    private int field9086;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
    public int field9083;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    private int field9071;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    private int field9074;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
    private int field9080;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "Lqk;")
    public static class1 field9079 = new class1(57, 8);

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "[I")
    public static int[] field9085 = new int[25];

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!paa", name = "z", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!paa", name = "C", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!paa", name = "B", descriptor = "Lvi;")
    public static class301 field9089;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIB)Z")
    public final boolean method3720(int arg0, int arg1, byte arg2) {
        field9090++;
        if (arg2 != -93) {
            this.field9074 = 74;
        }
        return arg1 >= this.field9080 && this.field9071 >= arg1 && this.field9088 <= arg0 && this.field9086 >= arg0;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static final void method3721(int arg0) {
        field9077++;
        try {
            if (class20.field171 == 1) {
                int var1 = class493.field6796.method603((byte) 104);
                if (var1 > 0 && class493.field6796.method593(arg0 + 13)) {
                    int var2 = var1 - class565.field7982;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class493.field6796.method584((byte) 95, var2);
                    return;
                }
                class493.field6796.method621(-107);
                class493.field6796.method616(544603655);
                if (class164.field2097 == null) {
                    class20.field171 = 0;
                } else {
                    class20.field171 = 2;
                }
                class395.field5616 = null;
                class212.field2928 = null;
            }
            if (class20.field171 == 3) {
                int var3 = class493.field6796.method603((byte) 123);
                if (class354.field5120 > var3 && class493.field6796.method593(-91)) {
                    int var4 = class153.field2004 + var3;
                    if (var4 > class354.field5120) {
                        var4 = class354.field5120;
                    }
                    class493.field6796.method584((byte) 116, var4);
                    return;
                }
                class153.field2004 = 0;
                class20.field171 = 0;
            }
            if (arg0 != 0) {
                method3721(62);
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class493.field6796.method621(-108);
            class164.field2097 = null;
            class20.field171 = 0;
            class395.field5616 = null;
            class212.field2928 = null;
            class574.field8079 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIII)V")
    public static final void method3722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9073++;
        if (arg0 == arg4) {
            class517.method3081(arg3, arg4, arg5, arg1, (byte) -107);
        } else if (arg2 == 8865) {
            if ((arg1 - arg4) >= class177.field2236 && (arg1 + arg4) <= class627.field8783 && class727.field10060 <= (arg3 - arg0) && arg0 + arg3 <= class474.field6576) {
                class368.method2294(arg3, arg1, arg4, arg0, arg5, -109);
            } else {
                class156.method1009(arg0, arg5, 121, arg3, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)Z")
    public final boolean method3723(int arg0, int arg1, int arg2) {
        field9084++;
        if (arg1 <= 68) {
            this.field9074 = -47;
        }
        return arg0 >= this.field9083 && this.field9075 >= arg0 && this.field9078 <= arg2 && this.field9076 >= arg2;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIII)Z")
    public final boolean method3724(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 43) {
            return false;
        } else {
            field9072++;
            return this.field9074 == arg0 && arg2 >= this.field9080 && arg2 <= this.field9071 && this.field9088 <= arg1 && this.field9086 >= arg1;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "([IIIZ)V")
    public final void method3725(int[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field9081++;
            arg0[1] = this.field9080 + arg1 - this.field9083;
            arg0[2] = arg2 - (this.field9078 - this.field9088);
            arg0[0] = this.field9074;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
    public static void method3726(int arg0) {
        field9079 = null;
        field9089 = null;
        field9085 = null;
        if (arg0 > -87) {
            field9085 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9088 = arg2;
        this.field9078 = arg6;
        this.field9075 = arg7;
        this.field9086 = arg4;
        this.field9076 = arg8;
        this.field9083 = arg5;
        this.field9071 = arg3;
        this.field9074 = arg0;
        this.field9080 = arg1;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "([IIBI)V")
    public final void method3727(int[] arg0, int arg1, byte arg2, int arg3) {
        field9082++;
        arg0[0] = 0;
        if (arg2 > -89) {
            method3726(101);
        }
        arg0[1] = this.field9083 + arg1 - this.field9080;
        arg0[2] = this.field9078 + arg3 - this.field9088;
    }
}
