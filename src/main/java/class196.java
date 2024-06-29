import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class196 {

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "Lb;")
    private class60 field3114;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lqc;")
    private class4 field3106;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lme;")
    private class188 field3098;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3099 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Z")
    public static boolean field3108 = false;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field3111 = -1;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Llb;")
    public static class211 field3113;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lhb;")
    private class35 field3107;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Z")
    public static boolean field3112;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[Lrg;")
    private class95[] field3105;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(JLjava/lang/String;ILjava/lang/String;IIBS)V", line = 7)
    public static final void method1419(long arg0, String arg1, int arg2, String arg3, int arg4, int arg5, byte arg6, short arg7) {
        field3096++;
        if (class67.field982) {
            return;
        }
        if (class6.field62 < 500) {
            class27.field307[class6.field62] = arg1;
            class271.field4097[class6.field62] = arg3;
            class67.field994[class6.field62] = arg2 == -1 ? class323.field5016 : arg2;
            class326.field5068[class6.field62] = arg7;
            class86.field1267[class6.field62] = arg0;
            class207.field3264[class6.field62] = arg5;
            class281.field4347[class6.field62] = arg4;
            class6.field62++;
        }
        if (arg6 != -4) {
            method1420(false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 37)
    public static final void method1420(boolean arg0) {
        if (!arg0) {
            method1419(-119L, (String) null, 9, (String) null, 79, -85, (byte) -73, (short) -79);
        }
        field3103++;
        class243.field3660.method1428(10935);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lbm;IBLbm;)Lrg;", line = 50)
    public final class95 method1421(class137 arg0, int arg1, byte arg2, class137 arg3) {
        field3102++;
        return arg2 == -50 ? this.method1426(arg1, arg0, true, arg3, 8) : (class95) null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 63)
    public static final void method1422(int arg0, int arg1) {
        if (arg0 == 5) {
            class44.field683.method1429((byte) 127, arg1);
            field3117++;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)Z", line = 75)
    public final boolean method1423(int arg0) {
        field3097++;
        if (arg0 >= -30) {
            this.field3106 = (class4) null;
        }
        if (this.field3107 != null) {
            return true;
        }
        if (this.field3098 == null) {
            if (this.field3106.method50(1514)) {
                return false;
            }
            this.field3098 = this.field3106.method41(-6479, true, (byte) 0, 255, 255);
        }
        if (this.field3098.field5004) {
            return false;
        } else {
            this.field3107 = new class35(this.field3098.method54((byte) 33));
            this.field3105 = new class95[(this.field3107.field437.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 105)
    public static void method1424(int arg0) {
        if (arg0 != 4652) {
            method1424(-59);
        }
        field3113 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIILgd;IJ)Z", line = 118)
    public static final boolean method1425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class310 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class73.method605(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILbm;ZLbm;I)Lrg;", line = 131)
    private final class95 method1426(int arg0, class137 arg1, boolean arg2, class137 arg3, int arg4) {
        field3116++;
        if (this.field3107 == null) {
            throw new RuntimeException();
        }
        this.field3107.field455 = arg0 * arg4 + 5;
        if (this.field3107.field437.length <= this.field3107.field455) {
            throw new RuntimeException();
        } else if (this.field3105[arg0] == null) {
            int var6 = this.field3107.method299(-71);
            int var7 = this.field3107.method299(-70);
            class95 var8 = new class95(arg0, arg3, arg1, this.field3106, this.field3114, var6, var7, arg2);
            this.field3105[arg0] = var8;
            return var8;
        } else {
            return this.field3105[arg0];
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 182)
    public final void method1427(int arg0) {
        field3115++;
        if (this.field3105 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 != -6715) {
            return;
        }
        while (this.field3105.length > var2) {
            if (this.field3105[var2] != null) {
                this.field3105[var2].method746(arg0 ^ 0xFFFF891A);
            }
            var2++;
        }
        for (int var3 = 0; var3 < this.field3105.length; var3++) {
            if (this.field3105[var3] != null) {
                this.field3105[var3].method748((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lqc;Lb;)V", line = 218)
    public class196(class4 arg0, class60 arg1) {
        this.field3114 = arg1;
        this.field3106 = arg0;
        if (!this.field3106.method50(1514)) {
            this.field3098 = this.field3106.method41(-6479, true, (byte) 0, 255, 255);
        }
    }
}
