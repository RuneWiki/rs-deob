import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class291 extends class339 {

    @OriginalMember(owner = "client!co", name = "D", descriptor = "Leba;")
    public static class550 field3846 = new class550(70, 3);

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field3851 = 1406;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3850 = null;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "Lkaa;")
    public static class166 field3852;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "Ljava/lang/String;")
    public String field3843;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "[C")
    public char[] field3841;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "[C")
    public char[] field3844;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "[I")
    public int[] field3842;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "[I")
    public int[] field3849;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(CB)I")
    public final int method1721(char arg0, byte arg1) {
        field3845++;
        if (this.field3849 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3849.length; var3++) {
            if (this.field3844[var3] == arg0) {
                return this.field3849[var3];
            }
        }
        if (arg1 != -101) {
            this.method1727(-34, -66, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
    public final void method1722(byte arg0) {
        field3838++;
        if (arg0 >= -59) {
            this.method1727(-79, 72, null);
        }
        if (this.field3849 != null) {
            for (int var2 = 0; var2 < this.field3849.length; var2++) {
                this.field3849[var2] = class665.method3789(this.field3849[var2], 32768);
            }
        }
        if (this.field3842 != null) {
            for (int var3 = 0; var3 < this.field3842.length; var3++) {
                this.field3842[var3] = class665.method3789(this.field3842[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lio;I)V")
    public final void method1723(class157 arg0, int arg1) {
        field3839++;
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                if (arg1 < 71) {
                    field3851 = 14;
                    return;
                } else {
                    return;
                }
            }
            this.method1727(var3, 2285, arg0);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method1724(int arg0) {
        field3846 = null;
        field3850 = null;
        field3852 = null;
        if (arg0 > -68) {
            field3852 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(CI)Z")
    public static final boolean method1725(char arg0, int arg1) {
        field3837++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class114.method672(arg0, true)) {
            return true;
        } else {
            char[] var2 = class34.field485;
            if (arg1 < 47) {
                return false;
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class369.field4846;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(CI)I")
    public final int method1726(char arg0, int arg1) {
        field3847++;
        if (this.field3842 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != 0) {
            return -92;
        }
        while (this.field3842.length > var3) {
            if (this.field3841[var3] == arg0) {
                return this.field3842[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IILio;)V")
    private final void method1727(int arg0, int arg1, class157 arg2) {
        if (arg1 != 2285) {
            this.method1727(-13, 116, null);
        }
        if (arg0 == 1) {
            this.field3843 = arg2.method925(119);
        } else if (arg0 == 2) {
            int var7 = arg2.method930(255);
            this.field3842 = new int[var7];
            this.field3841 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3842[var8] = arg2.method963(class50.method268(arg1, -2196));
                byte var9 = arg2.method969(3);
                this.field3841[var8] = var9 == 0 ? 0 : class55.method322(var9, (byte) 63);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method930(255);
            this.field3849 = new int[var4];
            this.field3844 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3849[var5] = arg2.method963(-126);
                byte var6 = arg2.method969(3);
                this.field3844[var5] = var6 == 0 ? 0 : class55.method322(var6, (byte) 127);
            }
        }
        field3848++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
    public static final void method1728(boolean arg0) {
        field3840++;
        for (class464 var1 = (class464) class467.field6131.method2506(68); var1 != null; var1 = (class464) class467.field6131.method2505(-121)) {
            if (var1.field6083 == -1) {
                var1.field6071 = 0;
                if (var1.field6082 >= 0 && var1.field6080 >= 0 && class703.field9886 > var1.field6082 && var1.field6080 < class431.field5789) {
                    class407.method2310(var1, -10868);
                }
            } else {
                var1.method242(true);
            }
        }
        if (!arg0) {
            field3846 = null;
        }
    }
}
