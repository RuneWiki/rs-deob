import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class529 extends class130 {

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public int field7157;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public int field7159;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public int field7153;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public int field7162;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public int field7154;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field7151 = 1338;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "[I")
    public static int[] field7160 = new int[1000];

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lwea;", line = 5)
    public class259 method235(int arg0) {
        if (arg0 <= 38) {
            this.field7162 = -23;
        }
        field7152++;
        return class531.field7170;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 16)
    public static void method2874(int arg0) {
        field7160 = null;
        if (arg0 < 61) {
            method2874(41);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZILpl;)Lul;", line = 30)
    public static final class428 method2875(boolean arg0, int arg1, class612 arg2) {
        field7161++;
        byte[] var3 = arg2.method3344(114, arg1);
        if (arg0) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return new class428(var3);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lct;Lrc;IIIIIIIIIIIII)V", line = 48)
    public class529(class414 arg0, class29 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7157 = arg9;
        this.field7159 = arg10;
        this.field7150 = arg12;
        this.field7153 = arg11;
        this.field7162 = arg14;
        this.field7154 = arg13;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 62)
    public static final void method2876(int arg0) {
        field7155++;
        if (arg0 != -1) {
            method2874(-97);
        }
        for (class62 var1 = (class62) class467.field5934.method237(109); var1 != null; var1 = (class62) class467.field5934.method245((byte) 67)) {
            if (var1.field838 == -1) {
                var1.field843 = 0;
                if (var1.field845 >= 0 && var1.field835 >= 0 && class431.field5395 > var1.field845 && class452.field5802 > var1.field835) {
                    class44.method270(var1, -123);
                }
            } else {
                var1.method1871(-77);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)I", line = 91)
    public static final int method2877(int arg0) {
        if (arg0 != 4929) {
            method2876(-18);
        }
        field7158++;
        return 46;
    }
}
