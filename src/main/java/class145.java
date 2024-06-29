import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class145 extends class329 {

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "Z")
    public boolean field1864;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    public int field1868;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!bfa", name = "k", descriptor = "Ljava/lang/String;")
    public String field1862;

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "Ljava/lang/String;")
    public String field1867;

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "Z")
    public boolean field1877;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "J")
    public long field1865;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lbaa;")
    public static class593 field1863 = new class593(2, 4, 4, 0);

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "J")
    public static long field1880 = 0L;

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field1881 = 0;

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "F")
    public static float field1874;

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!bfa", name = "x", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
    public static final void method840(byte arg0) {
        class139[] var1 = class588.field8267;
        synchronized (class588.field8267) {
            int var2 = 0;
            while (true) {
                if (var2 >= class588.field8267.length) {
                    break;
                }
                class588.field8267[var2] = new class139();
                class300.field3690[var2] = 0;
                var2++;
            }
        }
        if (arg0 != -103) {
            field1863 = null;
        }
        field1872++;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILni;IIIII)V")
    public static final void method841(int arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 4) {
            field1878 = 74;
        }
        class281.method1593(arg0, arg1.field6464, 0, -121, arg6, arg5, arg1.field6470, arg2, arg3, arg1.field6461);
        field1875++;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)V")
    public static void method842(byte arg0) {
        if (arg0 == 29) {
            field1863 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIJZI)Ljava/lang/String;")
    public static final String method843(int arg0, int arg1, long arg2, boolean arg3, int arg4) {
        field1871++;
        if (arg1 != 7110) {
            return null;
        }
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class145(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1869 = arg6;
        this.field1864 = arg9;
        this.field1868 = arg7;
        this.field1866 = arg4;
        this.field1862 = arg0;
        this.field1870 = arg2;
        this.field1873 = arg3;
        this.field1867 = arg1;
        this.field1877 = arg8;
        this.field1865 = arg5;
    }
}
