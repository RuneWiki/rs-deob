import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class59 extends class65 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "Ltm;")
    public static class334 field923 = new class334(1, -1);

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lhba;")
    public static class187 field929;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lgh;B)V", line = 5)
    public static final void method577(class48 arg0, byte arg1) {
        field922++;
        arg0.field792 = null;
        int var2 = arg0.field795.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field795[var3].field5768 = false;
        }
        class564[] var4 = class472.field6858;
        synchronized (class472.field6858) {
            if (class472.field6858.length > var2 && class736.field10371[var2] < 200) {
                class472.field6858[var2].method3266(arg0, true);
                int var10002 = class736.field10371[var2]++;
            }
            if (arg1 >= -50) {
                field927 = -66;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 34)
    public static void method578(byte arg0) {
        field929 = null;
        field923 = null;
        if (arg0 >= -1) {
            field927 = -29;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)Z", line = 48)
    public final boolean method579(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 124 % ((4 - arg2) / 62);
        field914++;
        return this.field913 == arg0 && arg1 >= this.field921 && arg1 <= this.field924 && arg3 >= this.field917 && arg3 <= this.field912;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)Z", line = 62)
    public final boolean method580(int arg0, int arg1, byte arg2) {
        int var4 = -30 / ((67 - arg2) / 55);
        field909++;
        return arg0 >= this.field918 && this.field925 >= arg0 && this.field926 <= arg1 && this.field911 >= arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I", line = 84)
    public static final int method581(int arg0) {
        if (arg0 != -3497) {
            field923 = null;
        }
        field910++;
        return class554.field7897 == 1 ? class379.field5699 : class478.field6934;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z", line = 98)
    public final boolean method582(int arg0, int arg1, int arg2) {
        field916++;
        if (arg0 != 15218) {
            this.method580(15, -9, (byte) -77);
        }
        return this.field921 <= arg1 && arg1 <= this.field924 && arg2 >= this.field917 && arg2 <= this.field912;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II[IB)V", line = 116)
    public final void method583(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 != -88) {
            method578((byte) 120);
        }
        arg2[1] = this.field918 + arg1 - this.field921;
        arg2[0] = 0;
        field908++;
        arg2[2] = arg0 - (this.field917 - this.field926);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lla;ILla;Z)V", line = 129)
    public static final void method584(class422 arg0, int arg1, class422 arg2, boolean arg3) {
        field919++;
        class133.field2142 = arg2;
        if (arg3) {
            method578((byte) -94);
        }
        class553.field7880 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII[I)V", line = 146)
    public final void method585(byte arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = this.field917 + arg2 - this.field926;
        if (arg0 != 18) {
            this.field913 = 54;
        }
        field920++;
        arg3[0] = this.field913;
        arg3[1] = arg1 + this.field921 - this.field918;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIII)V", line = 159)
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field911 = arg8;
        this.field913 = arg0;
        this.field912 = arg4;
        this.field924 = arg3;
        this.field918 = arg5;
        this.field917 = arg2;
        this.field925 = arg7;
        this.field921 = arg1;
        this.field926 = arg6;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lha;I)V", line = 181)
    public static final void method586(class544 arg0, int arg1) {
        if (arg1 != 0) {
            method586(null, -14);
        }
        for (class627 var2 = (class627) class494.field7152.method3272(-120); var2 != null; var2 = (class627) class494.field7152.method3274(false)) {
            if (var2.field8800) {
                var2.method3553(arg0);
            }
        }
        field915++;
    }
}
