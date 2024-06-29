import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class154 extends class76 {

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lck;")
    private class733 field1957;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    private int field1961;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field1966;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lwm;")
    public static class30 field1959;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lmaa;")
    private class528 field1963;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lpu;")
    public static class772 field1962;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 3)
    public static final int method872(int arg0, int arg1) {
        int var2 = 52 / ((-arg0 - 54) / 48);
        field1964++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIZI)V", line = 16)
    public static final void method873(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1965++;
        if (!arg4) {
            method873(9, 40, 11, 56, true, 37);
        }
        if (class405.field5375 < arg1 || class80.field1131 > arg2) {
            return;
        }
        boolean var6;
        if (class498.field6390 > arg5) {
            var6 = false;
            arg5 = class498.field6390;
        } else if (arg5 > class30.field274) {
            arg5 = class30.field274;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class498.field6390 > arg3) {
            var7 = false;
            arg3 = class498.field6390;
        } else if (class30.field274 < arg3) {
            arg3 = class30.field274;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class80.field1131 > arg1) {
            arg1 = class80.field1131;
        } else {
            class54.method333(arg3, class207.field2840[arg1++], 7, arg5, arg0);
        }
        if (class405.field5375 >= arg2) {
            class54.method333(arg3, class207.field2840[arg2--], 7, arg5, arg0);
        } else {
            arg2 = class405.field5375;
        }
        if (var6 && var7) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                int[] var9 = class207.field2840[var8];
                var9[arg5] = var9[arg3] = arg0;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg1; var10 <= arg2; var10++) {
                class207.field2840[var10][arg5] = arg0;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg1; var11 <= arg2; var11++) {
                class207.field2840[var11][arg3] = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V", line = 127)
    public static void method874(byte arg0) {
        field1959 = null;
        field1962 = null;
        if (arg0 != -27) {
            method873(-4, -82, -54, -109, true, -62);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lmaa;", line = 138)
    public final class528 method94(byte arg0) {
        field1960++;
        if (this.field1963 == null) {
            class38.field423[2] = this.field1961;
            class38.field423[5] = this.field1967;
            class284 var2 = this.field1957.field7199;
            class38.field423[0] = this.field1955;
            class38.field423[3] = this.field1966;
            class38.field423[4] = this.field1958;
            class38.field423[1] = this.field1956;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1733(-1852, class38.field423[var5])) {
                    return null;
                }
                class191 var7 = var2.method1732((byte) 22, class38.field423[var5]);
                int var8 = var7.field2673 ? 64 : 128;
                if (var7.field2671 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class392.field5173[var6] = var2.method1737(class38.field423[var6], var4, 1.0F, false, var4, (byte) 45);
            }
            this.field1963 = new class528(this.field1957, 6407, var4, var3, class392.field5173);
        }
        int var9 = 110 / ((-arg0 - 22) / 63);
        return this.field1963;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lck;IIIIII)V", line = 204)
    public class154(class733 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1958 = arg5;
        this.field1957 = arg0;
        this.field1956 = arg2;
        this.field1955 = arg1;
        this.field1961 = arg3;
        this.field1966 = arg4;
        this.field1967 = arg6;
    }
}
