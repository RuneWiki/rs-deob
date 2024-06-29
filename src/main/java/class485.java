import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class485 {

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lfc;")
    private class174 field6773 = new class174(64);

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Loi;")
    private class53 field6768;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lib;")
    public static class108[] field6769 = new class108[30];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ldu;")
    public static class242 field6765 = new class242(1, 3);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
    public final void method2791(int arg0, byte arg1) {
        class174 var3 = this.field6773;
        synchronized (this.field6773) {
            if (arg1 >= -18) {
                field6763 = -117;
            }
            this.field6773.method1096((byte) -19);
            this.field6773 = new class174(arg0);
        }
        field6761++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lqg;")
    public final class327 method2792(int arg0, int arg1) {
        field6766++;
        class174 var3 = this.field6773;
        class327 var4;
        synchronized (this.field6773) {
            var4 = (class327) this.field6773.method1088((long) arg1, (byte) 66);
            if (arg0 != 64) {
                method2795(-2, -70, 3, 0, 108);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field6768;
        byte[] var6;
        synchronized (this.field6768) {
            var6 = this.field6768.method426(class197.method1244(arg1, (byte) 126), (byte) 9, class145.method900(-90, arg1));
        }
        class327 var7 = new class327();
        if (var6 != null) {
            var7.method1970(new class403(var6), (byte) -99);
        }
        class174 var8 = this.field6773;
        synchronized (this.field6773) {
            this.field6773.method1097(19627, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZILjava/lang/String;II)V")
    public static final void method2793(int arg0, int arg1, int arg2, boolean arg3, int arg4, String arg5, int arg6, int arg7) {
        field6775++;
        class268 var8 = new class268();
        if (arg3) {
            method2799((byte) -60, (char) 65533, 72);
        }
        var8.field3916 = arg4;
        var8.field3908 = arg5;
        var8.field3907 = arg1;
        var8.field3906 = arg0;
        var8.field3911 = arg6;
        var8.field3912 = class390.field5481 + arg2;
        var8.field3915 = arg7;
        class239.field3494.method2753(4, var8);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
    public final void method2794(int arg0, int arg1) {
        class174 var3 = this.field6773;
        synchronized (this.field6773) {
            if (arg1 >= -74) {
                this.method2798(-112);
            }
            this.field6773.method1087(1, arg0);
        }
        field6764++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
    public static final void method2795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6762++;
        class45 var5 = class354.method2094(arg3, (byte) -68, 8);
        if (arg1 != -14571) {
            method2799((byte) -103, (char) 65417, 34);
        }
        var5.method260(9188);
        var5.field504 = arg0;
        var5.field510 = arg2;
        var5.field516 = arg4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg1;
            arg1 = var7;
        }
        int var8 = arg4 & 0x3;
        field6772++;
        if (arg0 != -1) {
            field6769 = null;
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg2 - arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)[Lmg;")
    public static final class103[] method2797(boolean arg0) {
        if (!arg0) {
            field6763 = 4;
        }
        field6771++;
        return new class103[] { class54.field694, class417.field5868, class437.field6135 };
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method2798(int arg0) {
        field6774++;
        class174 var2 = this.field6773;
        synchronized (this.field6773) {
            this.field6773.method1096((byte) -106);
        }
        if (arg0 != 3) {
            this.method2792(32, 75);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BCI)I")
    public static final int method2799(byte arg0, char arg1, int arg2) {
        field6770++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        int var4 = -121 % ((arg0 - 62) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method2800(int arg0) {
        field6765 = null;
        field6769 = null;
        if (arg0 != 1623) {
            method2799((byte) 12, (char) 65419, 100);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
    public final void method2801(boolean arg0) {
        class174 var2 = this.field6773;
        synchronized (this.field6773) {
            this.field6773.method1095(0);
        }
        if (arg0) {
            method2800(-20);
        }
        field6767++;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lle;ILoi;)V")
    public class485(class205 arg0, int arg1, class53 arg2) {
        this.field6768 = arg2;
        if (this.field6768 != null) {
            int var4 = this.field6768.method434(26154) - 1;
            this.field6768.method435(var4, 0);
        }
    }
}
