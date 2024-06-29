import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class247 {

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lje;")
    private class83 field4014;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Lho;")
    private class290 field4016;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lvg;")
    private class286 field4010;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
    public static boolean field4003 = true;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "[I")
    public static int[] field4015 = new int[4096];

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lho;")
    public static class290 field4009;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Lpi;")
    private class336 field4004;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[Led;")
    private class321[] field4006;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIBI)V", line = 4)
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4008++;
        if (arg6 != -68) {
            method1731(-99, -9, 11, 79, -116, -106, (byte) -103, 89);
        }
        if (arg0 >= class170.field2944 && arg2 <= class310.field4916 && class90.field1428 <= arg1 && arg5 <= class135.field2358) {
            class17.method172(arg0, arg7, -74, arg4, arg5, arg1, arg2, arg3);
        } else {
            class255.method1778(arg4, arg1, arg2, arg7, 25, arg0, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BZILg;Lg;)Led;", line = 24)
    private final class321 method1732(byte arg0, boolean arg1, int arg2, class177 arg3, class177 arg4) {
        if (arg0 > -103) {
            this.method1734((byte) -43);
        }
        field4012++;
        if (this.field4004 == null) {
            throw new RuntimeException();
        }
        this.field4004.field5353 = arg2 * 8 + 5;
        if (this.field4004.field5353 >= this.field4004.field5342.length) {
            throw new RuntimeException();
        } else if (this.field4006[arg2] == null) {
            int var6 = this.field4004.method2338((byte) 62);
            int var7 = this.field4004.method2338((byte) 105);
            class321 var8 = new class321(arg2, arg3, arg4, this.field4016, this.field4014, var6, var7, arg1);
            this.field4006[arg2] = var8;
            return var8;
        } else {
            return this.field4006[arg2];
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIZB)V", line = 62)
    public static final void method1733(int arg0, int arg1, boolean arg2, byte arg3) {
        field4005++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class266.field4291 = arg0;
        int var4 = -11 / ((-arg3 - 17) / 61);
        class248.field4027 = arg1;
        class26.field360 = arg2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z", line = 93)
    public final boolean method1734(byte arg0) {
        field4018++;
        if (this.field4004 != null) {
            return true;
        }
        if (this.field4010 == null) {
            if (this.field4016.method1982(false)) {
                return false;
            }
            this.field4010 = this.field4016.method1977(255, true, (byte) 0, 255, arg0 + 107);
        }
        if (this.field4010.field3029) {
            return false;
        }
        this.field4004 = new class336(this.field4010.method4(arg0));
        if (arg0 != 0) {
            this.field4016 = (class290) null;
        }
        this.field4006 = new class321[(this.field4004.field5342.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 122)
    public final void method1735(byte arg0) {
        field4019++;
        if (this.field4006 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4006.length; var2++) {
            if (this.field4006[var2] != null) {
                this.field4006[var2].method2204(0);
            }
        }
        if (arg0 != 101) {
            this.method1738((class177) null, 11, (class177) null, 90);
        }
        for (int var3 = 0; var3 < this.field4006.length; var3++) {
            if (this.field4006[var3] != null) {
                this.field4006[var3].method2202(-128);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 158)
    public static final byte[] method1736(boolean arg0, Object arg1, int arg2) {
        field4007++;
        if (arg1 == null) {
            return null;
        }
        if (arg2 != 15997) {
            method1739(-4, -77, -92, 70, 38, -61, -58);
        }
        if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg1);
            return arg0 ? class253.method1762(var3, -5265) : var3;
        } else if (arg1 instanceof class210) {
            class210 var4 = (class210) arg1;
            return var4.method1355((byte) -98);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 197)
    public static void method1737(boolean arg0) {
        if (!arg0) {
            field4015 = null;
            field4009 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lg;ILg;I)Led;", line = 208)
    public final class321 method1738(class177 arg0, int arg1, class177 arg2, int arg3) {
        field4017++;
        int var5 = -72 / ((45 - arg1) / 62);
        return this.method1732((byte) -113, true, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lho;Lje;)V", line = 220)
    public class247(class290 arg0, class83 arg1) {
        this.field4014 = arg1;
        this.field4016 = arg0;
        if (!this.field4016.method1982(false)) {
            this.field4010 = this.field4016.method1977(255, true, (byte) 0, 255, 87);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)I", line = 234)
    public static final int method1739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        field4013++;
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg6;
        }
        if (arg4 != 5) {
            method1731(118, 104, -94, 13, 8, -108, (byte) -123, -32);
        }
        if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg6;
        } else {
            return 7 + 1 - arg0 - arg3;
        }
    }
}
