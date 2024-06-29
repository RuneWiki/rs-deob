import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class317 {

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lna;")
    public static class26 field5433 = class69.method505("::wm1", (byte) -119);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lna;")
    public static class26 field5425 = class69.method505("::qa_op_test", (byte) -124);

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lna;")
    public static class26 field5434 = class69.method505("cyan:", (byte) -120);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lqf;")
    public static class148 field5431;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIII)V", line = 9)
    public static final void method2197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 0) {
            field5433 = (class26) null;
        }
        if (arg5 >= class225.field3572 && arg5 <= class27.field454 && arg0 >= class225.field3572 && arg0 <= class27.field454 && arg6 >= class225.field3572 && class27.field454 >= arg6 && class225.field3572 <= arg1 && arg1 <= class27.field454 && class80.field1259 <= arg4 && arg4 <= class117.field1840 && arg7 >= class80.field1259 && class117.field1840 >= arg7 && arg2 >= class80.field1259 && class117.field1840 >= arg2 && arg3 >= class80.field1259 && arg3 <= class117.field1840) {
            class265.method1865(3, arg2, arg8, arg7, arg6, arg1, arg3, arg4, arg0, arg5);
        } else {
            class313.method2173(arg5, arg0, arg7, 3, arg8, arg3, arg2, arg1, arg6, arg4);
        }
        field5424++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lna;", line = 33)
    public static final class26 method2198(int arg0, int arg1) {
        if (arg1 != 0) {
            method2205(-41);
        }
        field5426++;
        return class236.method1587(new class26[] { class149.method1019((byte) 9, arg0 >> 24 & 0xFF), class252.field4145, class149.method1019((byte) 9, (arg0 & 0xFF042F) >> 16), class252.field4145, class149.method1019((byte) 9, arg0 >> 8 & 0xFF), class252.field4145, class149.method1019((byte) 9, arg0 & 0xFF) }, (byte) -110);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 44)
    public static final void method2199(int arg0) {
        class241.field3929.method1986((byte) -108);
        if (arg0 == -15447) {
            field5430++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B[B)[B", line = 55)
    public static final byte[] method2200(byte arg0, byte[] arg1) {
        field5437++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 > -30) {
            field5431 = (class148) null;
        }
        byte[] var2 = new byte[arg1.length];
        class75.method536(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lve;B)V", line = 73)
    public static final void method2201(class266 arg0, byte arg1) {
        field5427++;
        if (class272.field4556) {
            return;
        }
        if (class255.field4184) {
            class326.method2276();
        } else {
            class34.method283();
        }
        class308.field5308 = class36.method304(117, arg0, class307.field5293);
        int var2 = class141.field2153;
        int var3 = var2 * 956 / 503;
        class308.field5308.method878((class38.field622 - var3) / 2, 0, var3, var2);
        class249.field4059 = class120.method826(class232.field3674, arg0, true);
        class249.field4059.method113(class38.field622 / 2 - (class249.field4059.field2341 / 2), 18);
        class272.field4556 = true;
        if (arg1 > -50) {
            method2199(-27);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V", line = 105)
    public static final void method2202(int arg0, int arg1) {
        field5432++;
        class120 var2 = class293.method2059(4, 5, arg0);
        var2.method823(true);
        if (arg1 != -903) {
            field5433 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V", line = 119)
    public static final void method2203(int arg0, int[] arg1, Object[] arg2) {
        class39.method319(arg2, arg1.length - 1, arg1, 74, 0);
        field5428++;
        int var3 = 113 % ((76 - arg0) / 45);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 131)
    public static final void method2204(int arg0) {
        class32.field540.method1987(3);
        if (arg0 == 16712751) {
            field5435++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 156)
    public static void method2205(int arg0) {
        field5431 = null;
        field5433 = null;
        field5425 = null;
        if (arg0 != 13123) {
            field5433 = (class26) null;
        }
        field5434 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILve;Lve;Z)V", line = 174)
    public static final void method2206(int arg0, class266 arg1, class266 arg2, boolean arg3) {
        class42.field693 = arg3;
        class299.field5151 = arg2;
        if (arg0 != 2) {
            method2203(22, (int[]) null, (Object[]) null);
        }
        class123.field1918 = arg1;
        field5429++;
    }
}
