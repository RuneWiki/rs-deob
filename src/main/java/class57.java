import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class57 {

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[Lce;")
    public class126[] field885;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[S")
    public short[] field877;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[S")
    public short[] field881;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[B")
    public byte[] field883;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[I")
    public int[] field878;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "Lce;")
    public static class126 field895 = class206.method1445(-7923, "Weiter");

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lce;")
    public static class126 field876 = class206.method1445(-7923, "Module texte charg-B");

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lvc;")
    public static class129 field890 = new class129();

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[S")
    public static short[] field896 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[Ljk;")
    public static class273[] field884;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)Z", line = 4)
    public final boolean method387(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field892++;
            return (this.field883[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Z", line = 26)
    public final boolean method388(byte arg0, int arg1) {
        field893++;
        if (arg0 >= -28) {
            this.field878 = (int[]) null;
        }
        return (this.field883[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V", line = 41)
    public static final void method389(int arg0, int arg1) {
        class100.field1624 = -1;
        class253.field4249 = arg0;
        class100.field1624 = -1;
        class245.method1686(false);
        if (arg1 <= -94) {
            field891++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)V", line = 58)
    public static final void method390(boolean arg0, int arg1) {
        if (!arg0) {
            class91.field1435 = arg1;
            field880++;
            class98.field1574 = 50;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V", line = 72)
    public class57(int arg0) {
        this.field887 = arg0;
        this.field885 = new class126[this.field887];
        this.field877 = new short[this.field887];
        this.field881 = new short[this.field887];
        this.field883 = new byte[this.field887];
        this.field878 = new int[this.field887];
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)Z", line = 87)
    public final boolean method391(int arg0, byte arg1) {
        field888++;
        if (arg1 >= -81) {
            this.method388((byte) -59, -65);
        }
        return (this.field883[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 98)
    public static void method392(int arg0) {
        field895 = null;
        field876 = null;
        field896 = null;
        if (arg0 != 4550) {
            method390(false, -74);
        }
        field884 = null;
        field890 = null;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 114)
    public static final void method393(int arg0) {
        if (arg0 != -31678) {
            return;
        }
        class28.method129(-17919);
        field879++;
        class93.method641(122);
        class227.method1545((byte) 93);
        class293.method1942((byte) -9);
        class142.method1036(arg0 + 31678);
        class226.method1540(-68);
        class163.method1197((byte) -84);
        class221.method1521(true);
        class39.method244((byte) 1);
        class25.method121((byte) -128);
        class266.method1802(-1);
        class172.method1251(arg0 + 31779);
        class253.method1712(false);
        if (class255.field4290 != 0) {
            for (int var1 = 0; var1 < class298.field4947.length; var1++) {
                class298.field4947[var1] = null;
            }
            class251.field4198 = 0;
        }
        class303.method2035((byte) 78);
        class157.method1146(-30533);
        class170.field3026.method1178(arg0 ^ 0x7BDC);
        if (!class56.field846) {
            ((class232) class236.field3987).method1578(7);
        }
        class170.field3028.method307(0);
        class167.field2971.method2189(true);
        class293.field4864.method2189(true);
        class12.field161.method2189(true);
        class273.field4598.method2189(true);
        class168.field3000.method2189(true);
        class4.field28.method2189(true);
        class309.field5239.method2189(true);
        class127.field2170.method2189(true);
        class228.field3840.method2189(true);
        class112.field1756.method2189(true);
        class70.field1148.method2189(true);
        class29.field401.method1178(-86);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ZI)I", line = 170)
    public final int method394(boolean arg0, int arg1) {
        field882++;
        return arg0 ? 62 : this.field883[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIZ)V", line = 181)
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field886++;
        if (arg5 == arg6) {
            class35.method194(arg6, arg0, arg1, arg4, (byte) 98, arg2, arg3);
            return;
        }
        if (arg7) {
            method390(true, 105);
        }
        if (arg3 - arg6 >= class321.field5489 && class52.field795 >= arg3 + arg6 && (arg0 - arg5) >= class197.field3372 && (arg0 + arg5) <= class194.field3302) {
            class192.method1366(arg5, arg1, arg2, arg3, arg4, arg6, arg0, 1);
        } else {
            class87.method613(arg3, arg4, arg0, arg1, arg2, (byte) 69, arg6, arg5);
        }
    }
}
