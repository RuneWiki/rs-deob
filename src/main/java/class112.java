import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class112 extends class84 {

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1610 = "Starting 3d Library";

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1618 = "wave:";

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field1613 = -1;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Lek;")
    public static class167 field1616;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public static final void method817(byte arg0) {
        ++field1612;
        try {
            if (~class145.field2379 == -2) {
                int var1 = class254.field4191.method1709((byte) -85);
                if (var1 > 0 && class254.field4191.method1708(-1)) {
                    int var2 = var1 - class191.field3086;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class254.field4191.method1714(var2, (byte) -82);
                    return;
                }
                class254.field4191.method1738(-128);
                class254.field4191.method1699(false);
                class46.field661 = null;
                class67.field994 = null;
                if (class225.field3618 == null) {
                    class145.field2379 = 0;
                } else {
                    class145.field2379 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class254.field4191.method1738(-120);
            class46.field661 = null;
            class225.field3618 = null;
            class67.field994 = null;
            class145.field2379 = 0;
        }
        if (arg0 != -48) {
            method820(true, (class131) null, -77);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    public static void method818(boolean arg0) {
        field1618 = null;
        if (arg0) {
            field1610 = null;
        }
        field1616 = null;
        field1610 = null;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        ++field1620;
        if (arg0 >= -125) {
            field1619 = 40;
        }
        if (super.field1228.field3651) {
            int[][] var4 = this.method611(0, (byte) -113, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; ~var8 > ~class20.field221; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IBI)V")
    public static final void method819(int arg0, byte arg1, int arg2) {
        class201 var3 = class94.method738(-106, arg0, 6);
        if (arg1 >= 83) {
            var3.method1477(0);
            ++field1615;
            var3.field3226 = arg2;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLqi;I)Ljava/lang/String;")
    public static final String method820(boolean arg0, class131 arg1, int arg2) {
        ++field1617;
        if (!client.method1168(arg1).method532(arg2, (byte) -29) && arg1.field2141 == null) {
            return null;
        } else if (arg1.field2053 != null && arg2 < arg1.field2053.length && arg1.field2053[arg2] != null && ~arg1.field2053[arg2].trim().length() != -1) {
            if (arg0) {
                method821(85);
            }
            return arg1.field2053[arg2];
        } else {
            return class36.field447 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
    public static final void method821(int arg0) {
        int var1 = -1;
        if (arg0 <= 28) {
            field1618 = null;
        }
        while (~var1 > ~class121.field1772) {
            int var2;
            if (~var1 != 0) {
                var2 = class207.field3326[var1];
            } else {
                var2 = 2047;
            }
            class29 var3 = class92.field1374[var2];
            if (var3 != null) {
                class110.method813(-6569, var3, var3.method205(85));
            }
            ++var1;
        }
        ++field1621;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1611;
        class111 var13 = new class111();
        var13.field1593 = arg5;
        var13.field1604 = arg4;
        var13.field1592 = arg0;
        var13.field1609 = arg11;
        var13.field1595 = arg2;
        var13.field1598 = arg3;
        var13.field1596 = arg10;
        var13.field1601 = arg1;
        var13.field1607 = arg6;
        var13.field1602 = arg8;
        var13.field1597 = arg7;
        if (arg9 != 10413) {
            field1613 = 21;
        }
        var13.field1600 = arg12;
        class283.field4507.method1385(var13, true);
    }
}
