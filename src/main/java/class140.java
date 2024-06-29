import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class140 extends class19 {

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    private int field2315 = -32768;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Z")
    public static boolean field2314 = true;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public int field2313;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Lkl;")
    public static class68 field2320;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[B)[B", line = 10)
    public static final byte[] method911(int arg0, byte[] arg1) {
        if (arg0 != 1000000) {
            return (byte[]) null;
        }
        int var2 = arg1.length;
        field2324++;
        byte[] var3 = new byte[var2];
        class129.method851(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V", line = 28)
    public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2316++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 38)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class275 arg10) {
        class309 var13 = class95.method636(22111, this.field2313).method2327(0, 5, (class260) null, 0, this.field2323, -1, (class230) null);
        field2321++;
        if (var13 != null) {
            var13.method26(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2315 = var13.method39();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method912(int arg0, byte arg1) {
        field2317++;
        if (arg0 >= 0 && arg0 < class18.field326.length) {
            class18.field326[arg0] = !class18.field326[arg0];
            if (arg1 != -34) {
                field2314 = true;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()I", line = 69)
    public final int method39() {
        field2318++;
        return this.field2315;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 90)
    public static void method913(int arg0) {
        field2320 = null;
        if (arg0 > -51) {
            method913(-98);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)Ljava/lang/String;", line = 104)
    public static final String method914(int arg0, byte arg1) {
        field2322++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg1 == -26) {
            return arg0 >= 10000000 ? "<col=00ff80>" + arg0 / 1000000 + class31.field645 + "</col>" : "<col=ffffff>" + arg0 / 1000 + class119.field2077 + "</col>";
        } else {
            return (String) null;
        }
    }
}
