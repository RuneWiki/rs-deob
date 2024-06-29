import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class158 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Lnv;")
    private class439 field1963;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "J")
    public long field1967;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1968;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1969;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1114(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIII)V", line = 3)
    public static final void method1109(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1960++;
        int var5 = class300.field3599;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class247.field2910 = arg0;
            class446.field5979 = arg2;
            class300.field3599 = 2;
            class581.field7918 = arg3;
            class582.field7956 = arg4;
        } else if (var5 == 2) {
            if (arg2 > class446.field5979) {
                class446.field5979 = arg2;
            }
            if (class582.field7956 > arg4) {
                class582.field7956 = arg4;
            }
            if (arg0 > class247.field2910) {
                class247.field2910 = arg0;
            }
            if (class581.field7918 > arg3) {
                class581.field7918 = arg3;
            }
        } else if (arg1) {
            field1964 = 14;
        }
    }

    @OriginalMember(owner = "client!pj", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() throws Throwable {
        field1968++;
        this.field1963.method2588(4654, this.field1967);
        super.finalize();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V", line = 74)
    public static final void method1110(byte arg0, int arg1) {
        field1965++;
        class778.field10744.method1694(arg1, -60);
        if (arg0 != 83) {
            method1113(24, (byte) -22, null, null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILbt;Z)Lbq;", line = 86)
    public static final class307 method1111(int arg0, int arg1, class48 arg2, boolean arg3) {
        field1961++;
        byte[] var4 = arg2.method437(arg0, (byte) 118, arg1);
        if (!arg3) {
            field1964 = -12;
        }
        return var4 == null ? null : new class307(var4);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLjv;)V", line = 105)
    public static final void method1112(byte arg0, class88 arg1) {
        if (arg0 != -74) {
            field1964 = 105;
        }
        field1962++;
        if (class107.field1351 == null) {
            return;
        }
        class238 var2 = null;
        if (arg1.field1175 == 0) {
            var2 = (class238) class253.method1504(arg1.field1182, arg1.field1176, arg1.field1179);
        }
        if (arg1.field1175 == 1) {
            var2 = (class238) class714.method4042(arg1.field1182, arg1.field1176, arg1.field1179);
        }
        if (arg1.field1175 == 2) {
            var2 = (class238) class764.method4234(arg1.field1182, arg1.field1176, arg1.field1179, field1969 == null ? (field1969 = method1114("qb")) : field1969);
        }
        if (arg1.field1175 == 3) {
            var2 = (class238) class662.method3720(arg1.field1182, arg1.field1176, arg1.field1179);
        }
        if (var2 == null) {
            arg1.field1171 = -1;
            arg1.field1169 = 0;
            arg1.field1177 = 0;
        } else {
            arg1.field1171 = var2.method927(-24482);
            arg1.field1169 = var2.method929((byte) -45);
            arg1.field1177 = var2.method928(13272);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLlc;Ljava/lang/String;)Lpga;", line = 151)
    public static final class561 method1113(int arg0, byte arg1, class675 arg2, String arg3) {
        if (arg1 >= -49) {
            field1964 = 18;
        }
        field1966++;
        return class627.method3554(true, arg2, "openjs", arg0, arg3);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lnv;JI)V", line = 162)
    public class158(class439 arg0, long arg1, int arg2) {
        this.field1963 = arg0;
        this.field1967 = arg1;
    }
}
