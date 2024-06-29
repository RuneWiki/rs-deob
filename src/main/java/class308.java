import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class308 extends class392 {

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field4392 = 0;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "J")
    public static long field4390;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)V", line = 3)
    public final void method291(boolean arg0) {
        if (!arg0) {
            ++field4395;
            if (~super.field5452 != -2 && ~super.field5452 != -1) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)V", line = 17)
    public final void method286(byte arg0, int arg1) {
        ++field4394;
        super.field5452 = arg1;
        int var3 = 110 % ((-80 - arg0) / 38);
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(ILw;)V", line = 31)
    public class308(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Luf;BI)Ljava/lang/String;", line = 35)
    public static final String method1894(class519 arg0, byte arg1, int arg2) {
        ++field4389;
        if (!client.method885(arg0).method1248(arg2, true) && arg0.field7139 == null) {
            return null;
        } else {
            if (arg1 != -3) {
                field4392 = -98;
            }
            if (arg0.field7178 != null && ~arg0.field7178.length < ~arg2 && arg0.field7178[arg2] != null && ~arg0.field7178[arg2].trim().length() != -1) {
                return arg0.field7178[arg2];
            } else {
                return class346.field4929 ? "Hidden-" + arg2 : null;
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)I", line = 66)
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method1896(98);
        }
        ++field4397;
        return 1;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lw;)V", line = 77)
    public class308(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIII)V", line = 81)
    public static final void method1895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4391;
        int var6 = class645.method3656(class698.field9801, class515.field7102, arg1, 26289);
        if (arg5 > 60) {
            int var7 = class645.method3656(class698.field9801, class515.field7102, arg3, 26289);
            int var8 = class645.method3656(class435.field6058, class742.field10301, arg0, 26289);
            int var9 = class645.method3656(class435.field6058, class742.field10301, arg2, 26289);
            for (int var10 = var6; var10 <= var7; ++var10) {
                class379.method2284(var8, var9, class74.field1144[var10], arg4, 2);
            }
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)I", line = 112)
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            method1895(-60, 81, -117, -18, 20, 76);
        }
        ++field4398;
        return 1;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I", line = 123)
    public final int method1896(int arg0) {
        if (arg0 != 17539) {
            field4390 = 97L;
        }
        ++field4393;
        return super.field5452;
    }
}
