import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class153 extends class498 {

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Ltf;")
    public static class264 field2208 = new class264(12, 19);

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Leca;")
    public static class704 field2209 = new class704();

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Z")
    public static volatile boolean field2211 = false;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "[[[Lbt;")
    public static class40[][][] field2210;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIF)V")
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BF)V")
    public final void method771(byte arg0, float arg1) {
        int var3 = -49 % ((arg0 - -46) / 52);
        ++field2206;
        super.field7057 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
    public final void method772(int arg0, int arg1, int arg2, int arg3) {
        super.field7049 = arg2;
        ++field2204;
        super.field7064 = arg1;
        if (arg3 < 36) {
            field2209 = null;
        }
        super.field7059 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method1073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2205;
        int var7 = arg1 + arg4;
        if (arg0 != 1021) {
            return false;
        } else {
            int var8 = arg2 + arg3;
            int var9 = arg6 - -arg5;
            if (!class360.method2199(var8, arg6, arg4, var8, var9, var9, var7, arg4, 119, var8)) {
                return false;
            } else if (!class360.method2199(var8, arg6, var7, var8, arg6, var9, var7, arg4, 118, var8)) {
                return false;
            } else {
                if (~class55.field1071 < ~arg4) {
                    if (!class360.method2199(var8, var9, arg4, var8, arg6, var9, arg4, arg4, arg0 + -914, arg2)) {
                        return false;
                    }
                    if (!class360.method2199(arg2, var9, arg4, var8, arg6, arg6, arg4, arg4, 98, arg2)) {
                        return false;
                    }
                } else {
                    if (!class360.method2199(var8, var9, var7, var8, arg6, var9, var7, var7, 113, arg2)) {
                        return false;
                    }
                    if (!class360.method2199(arg2, var9, var7, var8, arg6, arg6, var7, var7, 121, arg2)) {
                        return false;
                    }
                }
                if (arg6 < class628.field8790) {
                    if (!class360.method2199(var8, arg6, arg4, var8, arg6, arg6, var7, arg4, arg0 ^ 901, arg2)) {
                        return false;
                    }
                    if (!class360.method2199(arg2, arg6, var7, var8, arg6, arg6, var7, arg4, 104, arg2)) {
                        return false;
                    }
                } else {
                    if (!class360.method2199(var8, var9, arg4, var8, var9, var9, var7, arg4, 112, arg2)) {
                        return false;
                    }
                    if (!class360.method2199(arg2, var9, var7, var8, var9, var9, var7, arg4, 124, arg2)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1074(byte[] arg0, int arg1) {
        ++field2207;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            if (arg1 > -77) {
                field2208 = null;
            }
            class476.method2792(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public static void method1075(int arg0) {
        if (arg0 == 31376) {
            field2208 = null;
            field2209 = null;
            field2210 = null;
        }
    }
}
