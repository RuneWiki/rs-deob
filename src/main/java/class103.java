import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class103 implements class146 {

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    private int field1897 = 128;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    private int field1875 = 50;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lke;")
    private class95 field1884;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lke;")
    private class95 field1877;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lua;")
    private class181 field1878;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lsg;")
    private static class169 field1890 = class165.method1060("cyan:", 1536);

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1886 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lsg;")
    public static class169 field1876 = field1890;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lsg;")
    public static class169 field1891 = field1890;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Lsg;")
    public static class169 field1901 = class165.method1060("Ung-Ultiges Anmelde)2Paket)3", 1536);

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Z")
    public final boolean method598(int arg0, int arg1) {
        field1896++;
        if (arg0 != 24370) {
            method604((byte) -74, 123);
        }
        return this.field1897 == 64 || this.method606(arg1, (byte) -112).field1096 == 64;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method599(int arg0) {
        field1876 = null;
        field1901 = null;
        field1891 = null;
        if (arg0 != 0) {
            method611(-49, (byte) 107);
        }
        field1890 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lqd;Lpg;IB)V")
    public static final void method600(class148 arg0, class142 arg1, int arg2, byte arg3) {
        byte[] var4 = null;
        field1893++;
        class22 var5 = class2.field28;
        synchronized (class2.field28) {
            int var6 = -73 / ((7 - arg3) / 53);
            for (class45 var7 = (class45) class2.field28.method145(0); var7 != null; var7 = (class45) class2.field28.method152((byte) -127)) {
                if ((long) arg2 == var7.field3543 && var7.field836 == arg1 && var7.field835 == 0) {
                    var4 = var7.field847;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = arg1.method942(false, arg2);
            arg0.method964(arg1, arg2, var8, true, 127);
        } else {
            arg0.method964(arg1, arg2, var4, true, 124);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)Z")
    public final boolean method601(int arg0, byte arg1) {
        if (arg1 <= 21) {
            this.method605(-109, 91);
        }
        field1887++;
        return this.method606(arg0, (byte) 32).field1088;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIF)[I")
    public final int[] method602(int arg0, int arg1, float arg2) {
        if (arg1 == 30862) {
            field1894++;
            class58 var4 = this.method606(arg0, (byte) 105);
            var4.field1080 = true;
            return var4.method365(this, this.field1897, arg2, this.field1884, (byte) 126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)I")
    public final int method603(int arg0, boolean arg1) {
        if (arg1) {
            field1899++;
            return this.method606(arg0, (byte) -90).field1071;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lsg;")
    public static final class169 method604(byte arg0, int arg1) {
        class169 var2 = new class169();
        field1898++;
        var2.field3248 = new byte[arg1];
        var2.field3253 = 0;
        int var3 = 37 % ((75 - arg0) / 34);
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public final boolean method605(int arg0, int arg1) {
        field1885++;
        return arg1 < 54 ? false : this.method606(arg0, (byte) 67).field1079;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(IB)Lgb;")
    private final class58 method606(int arg0, byte arg1) {
        field1881++;
        int var3 = 66 % ((-arg1 - 11) / 35);
        class58 var4 = (class58) this.field1878.method1206((long) arg0, -24742);
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1877.method552(arg0, 0, 0);
        if (var5 == null) {
            return class107.method626(99);
        } else {
            class127 var6 = new class127(var5);
            class58 var7 = new class58(var6);
            this.field1878.method1208((long) arg0, -35, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Z")
    public final boolean method607(int arg0, byte arg1) {
        if (arg1 != -81) {
            this.method606(110, (byte) -4);
        }
        field1879++;
        return this.method606(arg0, (byte) -103).method364(this.field1884, arg1 + 81, this);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)[I")
    public final int[] method608(int arg0, int arg1) {
        field1902++;
        class127 var3 = new class127(this.field1877.method552(arg0, 0, 0));
        class58 var4 = new class58(var3);
        if (arg1 != -29835) {
            this.field1877 = null;
        }
        return var4.method366(this.field1897, this, true, this.field1884);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(BI)V")
    public final void method609(byte arg0, int arg1) {
        field1892++;
        for (class58 var3 = (class58) this.field1878.method1207(arg0 + 201); var3 != null; var3 = (class58) this.field1878.method1209((byte) -105)) {
            if (var3.field1080) {
                var3.method363(arg1, -22826);
                var3.field1080 = false;
            }
        }
        if (arg0 != -95) {
            this.field1897 = -19;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public final void method610(boolean arg0) {
        if (arg0) {
            field1886 = 14;
        }
        field1882++;
        this.field1878 = new class181(this.field1875);
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(IB)Z")
    public static final boolean method611(int arg0, byte arg1) {
        field1883++;
        if (arg1 == -9) {
            return (-arg0 & arg0) == arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lke;Lke;II)V")
    public class103(class95 arg0, class95 arg1, int arg2, int arg3) {
        this.field1897 = arg3;
        this.field1884 = arg1;
        this.field1877 = arg0;
        this.field1875 = arg2;
        this.field1878 = new class181(this.field1875);
    }
}
