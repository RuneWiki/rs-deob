import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class329 extends class314 implements class41 {

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lqd;")
    public class314 field4146;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "[J")
    public static long[] field4158 = new long[256];

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field4163;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field4162;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4158[var0] = var1;
        }
        field4163 = new String[200];
        field4164 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method182(int arg0) {
        field4161++;
        if (arg0 != -2286) {
            method1917((byte) -6);
        }
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I", line = 15)
    public final int method187(int arg0) {
        field4145++;
        if (arg0 != 21067) {
            field4163 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z", line = 29)
    public final boolean method194(byte arg0) {
        if (arg0 >= -72) {
            return true;
        } else {
            field4155++;
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V", line = 42)
    public static final void method1915(byte arg0, int arg1) {
        field4151++;
        if (!class407.field5817.field3627) {
            arg1 = -1;
        }
        if (class405.field5799 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class429 var2 = class72.field927.method1723(false, arg1);
            class311 var3 = var2.method2514((byte) -59);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class219.field2794.method2871(var3.method1820(), new Point(var2.field6084, var2.field6085), class8.field71, var3.method1814(), var3.method1813(), (byte) 118);
                class405.field5799 = arg1;
            }
        }
        int var4 = 92 % ((40 - arg0) / 56);
        if (arg1 == -1 && class405.field5799 != -1) {
            class219.field2794.method2871(-1, new Point(), class8.field71, null, -1, (byte) 53);
            class405.field5799 = -1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLya;)Llo;", line = 84)
    public final class531 method181(boolean arg0, class38 arg1) {
        if (!arg0) {
            field4163 = null;
        }
        field4150++;
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I", line = 96)
    public final int method178(boolean arg0) {
        if (arg0) {
            field4144++;
            return 0;
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILya;II)Z", line = 108)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        field4154++;
        if (arg0 < 66) {
            field4158 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 119)
    public final void method180(byte arg0) {
        field4152++;
        if (arg0 != -2) {
            method1917((byte) 67);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILya;)V", line = 129)
    public final void method184(int arg0, class38 arg1) {
        if (arg0 != -5534) {
            field4163 = null;
        }
        field4149++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILya;)Lt;", line = 141)
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        if (arg1 < 72) {
            this.method186(-115, null, -70, -59);
        }
        field4153++;
        return null;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I", line = 152)
    public final int method189(int arg0) {
        field4159++;
        return arg0 == 32725 ? 0 : -52;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lya;I)V", line = 164)
    public final void method192(class38 arg0, int arg1) {
        if (arg1 != 1) {
            this.method187(4);
        }
        field4162++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 174)
    public static final void method1916(boolean arg0, String arg1, int arg2) {
        field4148++;
        if (!arg0) {
            method1915((byte) 25, -36);
        }
        class153 var3 = class75.method656(3, 255, arg2);
        var3.method1003((byte) -21);
        var3.field1932 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 188)
    public final void method191(int arg0) {
        field4157++;
        if (arg0 != 27223) {
            this.method186(109, null, -103, 116);
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V", line = 202)
    public static void method1917(byte arg0) {
        field4163 = null;
        if (arg0 <= 63) {
            method1916(false, null, -23);
        }
        field4158 = null;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIILqd;)V", line = 214)
    public class329(int arg0, int arg1, int arg2, int arg3, int arg4, class314 arg5) {
        super(arg2, arg3, arg4, class279.method1658(arg1, arg0, -2));
        this.field4146 = arg5;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Z", line = 222)
    public static final boolean method1918(int arg0, int arg1) {
        field4147++;
        if (arg0 != -1) {
            field4164 = -4;
        }
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lgg;IZIIILya;)V", line = 233)
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = 89 / ((27 - arg5) / 40);
        field4160++;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILya;)V", line = 249)
    public final void method185(int arg0, class38 arg1) {
        field4156++;
        if (arg0 != 15397) {
            this.method187(102);
        }
    }
}
