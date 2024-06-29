import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class63 extends class264 {

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    private int field1041 = 0;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    private int field1049 = 0;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    private int field1048 = -32768;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    private int field1055 = -1;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Z")
    public boolean field1056 = false;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lwg;")
    private class220 field1039;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[I")
    public static int[] field1046 = new int[32];

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "Z")
    public static boolean field1062;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Lpk;")
    public static class237 field1060;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Laa;")
    private class31 field1051;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "[[[B")
    public static byte[][][] field1059;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Lpb;")
    private final class2 method515(int arg0) {
        field1047++;
        class104 var2 = class296.method1957(this.field1044, true);
        class2 var3;
        if (this.field1056) {
            var3 = var2.method757(0, -1, (byte) -39, -1);
        } else {
            var3 = var2.method757(this.field1049, this.field1041, (byte) -102, this.field1055);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 1) {
                this.method19();
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public final void method516(int arg0, int arg1) {
        field1043++;
        if (this.field1056) {
            return;
        }
        this.field1049 += arg1;
        while (this.field1049 > this.field1039.field3422[this.field1041]) {
            this.field1049 -= this.field1039.field3422[this.field1041];
            this.field1041++;
            if (this.field1039.field3413.length <= this.field1041) {
                this.field1056 = true;
                break;
            }
        }
        if (arg0 != -3333) {
            method518(true);
        }
        if (!this.field1056) {
            class244.method1664(this.field1052, false, this.field1041, this.field1057, 8890, this.field1039);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method517(String arg0, byte arg1, String arg2, String arg3) {
        if (arg1 != -125) {
            return null;
        }
        for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, var4 + arg0.length())) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(arg2.length() + var4);
        }
        field1053++;
        return arg3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
        field1058++;
        class2 var13 = this.method515(1);
        if (var13 != null) {
            var13.method22(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1051);
            this.field1048 = var13.method19();
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()I")
    public final int method19() {
        field1050++;
        return this.field1048;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1045++;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIII)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1044 = arg0;
        this.field1057 = arg2;
        this.field1054 = arg5 + arg6;
        this.field1040 = arg4;
        this.field1042 = arg1;
        this.field1052 = arg3;
        int var8 = class296.method1957(this.field1044, true).field1516;
        if (var8 == -1) {
            this.field1056 = true;
        } else {
            this.field1056 = false;
            this.field1039 = class108.method781(var8, -1);
        }
        if (this.field1054 == arg6) {
            class244.method1664(this.field1052, false, this.field1041, this.field1057, 8890, this.field1039);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method518(boolean arg0) {
        field1059 = null;
        field1046 = null;
        if (!arg0) {
            field1061 = -128;
        }
        field1060 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1046[var1] = var0 - 1;
            var0 += var0;
        }
        field1061 = 0;
        field1062 = false;
    }
}
