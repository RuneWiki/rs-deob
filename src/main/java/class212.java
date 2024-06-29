import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class212 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public int field2801 = 128;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field2796 = 128;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field2807;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field2808;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field2809;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[Liea;")
    public static class481[] field2797;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1367(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1360(int arg0, int arg1, int arg2) {
        if (arg0 != 6410) {
            method1364(null, 94, 53);
        }
        field2799++;
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 14)
    public static void method1361(byte arg0) {
        field2797 = null;
        int var1 = -68 / ((48 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 24)
    public static final int method1362(int arg0, int arg1) {
        field2803++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg0 == arg1 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILik;)V", line = 63)
    public final void method1363(int arg0, class212 arg1) {
        this.field2801 = arg1.field2801;
        field2804++;
        if (arg0 != -31558) {
            this.field2802 = -82;
        }
        this.field2795 = arg1.field2795;
        this.field2806 = arg1.field2806;
        this.field2798 = arg1.field2798;
        this.field2796 = arg1.field2796;
        this.field2802 = arg1.field2802;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Lrba;II)V", line = 81)
    public static final void method1364(class435[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class435 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field5798;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field5798 < (var7 & 0x1) + var6) {
                class435 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1364(arg0, arg1, var4 - 1);
        method1364(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V", line = 162)
    public class212(int arg0) {
        this.field2795 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIII)V", line = 180)
    private class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2801 = arg1;
        this.field2796 = arg2;
        this.field2806 = arg4;
        this.field2798 = arg3;
        this.field2795 = arg0;
        this.field2802 = arg5;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I", line = 123)
    public static final int method1365(int arg0) {
        field2805++;
        int var1 = 0;
        if (arg0 != 34846) {
            method1361((byte) 96);
        }
        Field[] var2 = (field2808 == null ? (field2808 = method1367("wo")) : field2808).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field2809 == null ? (field2809 = method1367("rq")) : field2809).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Lik;", line = 170)
    public final class212 method1366(int arg0) {
        field2807++;
        if (arg0 != -6410) {
            method1362(-68, 46);
        }
        return new class212(this.field2795, this.field2801, this.field2796, this.field2798, this.field2806, this.field2802);
    }
}
