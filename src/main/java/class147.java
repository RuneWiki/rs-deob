import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class147 extends class496 {

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    private int field1896;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    private int field1898;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    private int field1888;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Lgu;")
    public static class126 field1903 = new class126();

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field1906 = 2;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method863(byte arg0, int arg1) {
        field1891++;
        if (arg0 != 96) {
            method863((byte) -95, -43);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method864(int arg0, byte arg1) {
        field1893++;
        class53.field639 = -1;
        class296.field4338 = arg0;
        int var2 = -71 % ((16 - arg1) / 50);
        class17.field147 = -1;
        class424.method2511(-1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z", line = 28)
    public final boolean method865(int arg0, int arg1, int arg2) {
        if (arg0 != 28638) {
            field1903 = null;
        }
        field1901++;
        return arg1 >= this.field1886 && arg1 <= this.field1895 && arg2 >= this.field1897 && arg2 <= this.field1892;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 50)
    public static void method866(byte arg0) {
        field1903 = null;
        if (arg0 < 7) {
            method864(-95, (byte) -37);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([IBII)V", line = 62)
    public final void method867(int[] arg0, byte arg1, int arg2, int arg3) {
        arg0[1] = this.field1888 + arg3 - this.field1886;
        arg0[2] = arg2 - (this.field1897 - this.field1902);
        field1889++;
        arg0[0] = this.field1896;
        int var5 = -21 / ((arg1 + 17) / 44);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIB)Z", line = 75)
    public final boolean method868(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -124) {
            return true;
        } else {
            field1899++;
            return this.field1896 == arg1 && arg2 >= this.field1888 && this.field1898 >= arg2 && arg0 >= this.field1902 && this.field1890 >= arg0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[IB)V", line = 92)
    public final void method869(int arg0, int arg1, int[] arg2, byte arg3) {
        arg2[2] = this.field1897 - (this.field1902 - arg1);
        if (arg3 == -74) {
            field1887++;
            arg2[1] = arg0 + this.field1886 - this.field1888;
            arg2[0] = 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)Z", line = 105)
    public final boolean method870(int arg0, int arg1, int arg2) {
        field1894++;
        if (arg2 != 2) {
            this.field1898 = -104;
        }
        return this.field1888 <= arg0 && this.field1898 >= arg0 && this.field1902 <= arg1 && this.field1890 >= arg1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V", line = 122)
    public static final void method871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1900++;
        int var8 = class406.method2430(class483.field7334, arg3, class202.field3021, 64);
        int var9 = class406.method2430(class483.field7334, arg6, class202.field3021, 64);
        int var10 = class406.method2430(class130.field1712, arg0, class401.field5755, 64);
        int var11 = class406.method2430(class130.field1712, arg5, class401.field5755, arg2 + 28917);
        int var12 = class406.method2430(class483.field7334, arg1 + arg3, class202.field3021, arg2 + 28917);
        int var13 = class406.method2430(class483.field7334, arg6 - arg1, class202.field3021, arg2 ^ 0xFFFF8F0B);
        for (int var14 = var8; var14 < var12; var14++) {
            class69.method418(arg4, class47.field558[var14], var11, (byte) 117, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class69.method418(arg4, class47.field558[var15], var11, (byte) 117, var10);
        }
        int var16 = class406.method2430(class130.field1712, arg0 + arg1, class401.field5755, 64);
        int var17 = class406.method2430(class130.field1712, arg5 - arg1, class401.field5755, arg2 + 28917);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class47.field558[var18];
            class69.method418(arg4, var19, var16, (byte) 117, var10);
            class69.method418(arg7, var19, var17, (byte) 117, var16);
            class69.method418(arg4, var19, var11, (byte) 117, var17);
        }
        if (arg2 != -28853) {
            method863((byte) -70, 41);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIII)V", line = 179)
    public class147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1902 = arg2;
        this.field1896 = arg0;
        this.field1895 = arg7;
        this.field1898 = arg3;
        this.field1892 = arg8;
        this.field1888 = arg1;
        this.field1897 = arg6;
        this.field1886 = arg5;
        this.field1890 = arg4;
    }
}
