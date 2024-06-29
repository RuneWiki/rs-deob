import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class601 extends class656 {

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "[Lgl;")
    public class601[] field7893;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "Z")
    public boolean field7897;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "[S")
    public static short[] field7894 = new short[256];

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field7899 = 0;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "[I")
    public static int[] field7896 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public int field7898;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "Lnr;")
    public class58 field7902;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "Lwaa;")
    public class704 field7890;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 5)
    public void method108(int arg0) {
        if (arg0 != 8351) {
            this.method5((byte) -4, -54);
        }
        field7892++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)[I", line = 16)
    public int[] method5(byte arg0, int arg1) {
        field7888++;
        if (arg0 != -40) {
            this.method1986(true);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BII)[I", line = 27)
    public final int[] method3266(byte arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            this.method2401(121);
        }
        field7884++;
        return this.field7893[arg2].field7897 ? this.field7893[arg2].method5((byte) -40, arg1) : this.field7893[arg2].method7(arg1, true)[0];
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 48)
    public static void method3267(int arg0) {
        field7894 = null;
        if (arg0 != -11148) {
            method3267(-62);
        }
        field7896 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)[[I", line = 64)
    public final int[][] method3268(int arg0, int arg1, int arg2) {
        field7901++;
        if (arg2 != 65535) {
            this.field7890 = null;
        }
        if (this.field7893[arg1].field7897) {
            int[] var4 = this.field7893[arg1].method5((byte) -40, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field7893[arg1].method7(arg0, true);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)V", line = 96)
    public void method2403(int arg0, byte arg1, int arg2) {
        field7887++;
        int var4 = this.field7898 == 255 ? arg2 : this.field7898;
        if (this.field7897) {
            this.field7902 = new class58(var4, arg2, arg0);
        } else {
            this.field7890 = new class704(var4, arg2, arg0);
        }
        int var5 = 115 / ((47 - arg1) / 38);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lee;BI)V", line = 120)
    public void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 == -61) {
            field7885++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIB)Z", line = 134)
    public static final boolean method3269(int arg0, int arg1, byte arg2) {
        field7889++;
        if (arg2 != 8) {
            field7894 = null;
        }
        return (class435.method2501(arg0, arg1, 33) | class614.method3342(arg0, arg1, arg2 ^ 0xEFC) | class481.method2708(arg1, arg0, 106)) & class495.method2794(102, arg1, arg0);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IZ)[[I", line = 150)
    public int[][] method7(int arg0, boolean arg1) {
        field7900++;
        if (!arg1) {
            field7894 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I", line = 164)
    public int method2401(int arg0) {
        field7883++;
        return arg0 <= 85 ? 97 : -1;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Z)V", line = 191)
    public void method1986(boolean arg0) {
        field7886++;
        if (!arg0) {
            this.method3268(-76, -69, -123);
        }
        if (this.field7897) {
            this.field7902.method384((byte) 125);
            this.field7902 = null;
        } else {
            this.field7890.method3961(-6948);
            this.field7890 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IZ)V", line = 216)
    public class601(int arg0, boolean arg1) {
        this.field7893 = new class601[arg0];
        this.field7897 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I", line = 241)
    public int method1984(int arg0) {
        field7895++;
        if (arg0 != -1) {
            field7899 = -58;
        }
        return -1;
    }
}
