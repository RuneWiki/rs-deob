import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class488 {

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field6899 = 128;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public int field6910 = 128;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public int field6909;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public int field6905;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lgda;")
    public static class53 field6891 = new class53(40, -1);

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "Z")
    public static boolean field6911 = false;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public int field6895;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public int field6897;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public int field6900;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public int field6908;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Lfp;")
    public static class323 field6898;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "[[[J")
    public static long[][][] field6906;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 15)
    public static final String method2914(int arg0, int arg1, boolean arg2) {
        field6896++;
        if (arg2 && arg1 >= 0) {
            if (arg0 != -9165) {
                method2919(-110);
            }
            return class179.method1134(arg1, arg2, (byte) 41, 10);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)Lef;", line = 30)
    public static final class487 method2915(int arg0, boolean arg1) {
        field6892++;
        class487 var2 = (class487) class400.field5659.method4022((long) arg0, (byte) 93);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class711.field9887.method2100(arg0, (byte) 112, 0);
        if (!arg1) {
            field6891 = null;
        }
        class487 var4 = new class487();
        if (var3 != null) {
            var4.method2913(-31, new class675(var3));
        }
        var4.method2911((byte) 86);
        class400.field5659.method4018((byte) 126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I", line = 57)
    public static final int method2916(int arg0) {
        if (arg0 != 26908) {
            method2915(-55, true);
        }
        field6902++;
        int var1 = class577.field8147.method1671((byte) -110);
        if (class723.field10083.length - 1 > var1) {
            class577.field8147 = class723.field10083[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)Lkp;", line = 75)
    public final class488 method2917(boolean arg0) {
        if (arg0) {
            method2916(95);
        }
        field6907++;
        return new class488(this.field6909, this.field6899, this.field6910, this.field6903, this.field6905, this.field6901);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lkp;I)V", line = 89)
    public final void method2918(class488 arg0, int arg1) {
        this.field6901 = arg0.field6901;
        this.field6909 = arg0.field6909;
        field6894++;
        this.field6899 = arg0.field6899;
        this.field6905 = arg0.field6905;
        if (arg1 != -1) {
            this.field6901 = -59;
        }
        this.field6910 = arg0.field6910;
        this.field6903 = arg0.field6903;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I", line = 111)
    public static final int method2919(int arg0) {
        if (arg0 != 10) {
            field6911 = true;
        }
        field6912++;
        return 16;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(I)V", line = 166)
    public class488(int arg0) {
        this.field6909 = arg0;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIII)V", line = 173)
    private class488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6899 = arg1;
        this.field6905 = arg4;
        this.field6910 = arg2;
        this.field6901 = arg5;
        this.field6909 = arg0;
        this.field6903 = arg3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILeea;II)Lll;", line = 135)
    public static final class364 method2920(int arg0, int arg1, int arg2, class131 arg3, int arg4, int arg5) {
        if (arg0 != 3553) {
            return null;
        }
        field6893++;
        if (!arg3.field1869 && (!class253.method1681(arg1, (byte) 123) || !class253.method1681(arg4, (byte) 72))) {
            return arg3.field1906 ? new class364(arg3, 34037, arg2, arg5, arg1, arg4, true) : new class364(arg3, arg2, arg5, arg1, arg4, class123.method837(118, arg1), class123.method837(arg0 ^ 0xD9E, arg4), true);
        } else {
            return new class364(arg3, 3553, arg2, arg5, arg1, arg4, true);
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V", line = 154)
    public static void method2921(int arg0) {
        if (arg0 != 40) {
            method2914(-43, -99, false);
        }
        field6906 = null;
        field6891 = null;
        field6898 = null;
    }
}
