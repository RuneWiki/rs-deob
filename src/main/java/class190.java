import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class190 extends class264 {

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    private int field2883 = -32768;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    public static boolean field2881 = false;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
    public static boolean field2887 = false;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lpk;")
    public static class237 field2885;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lji;")
    public static class256 field2876;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
        class2 var13 = class140.method951((byte) -94, this.field2878).method115(-1, 18, 0, 0, (class261) null, (class220) null, this.field2886);
        field2882++;
        if (var13 != null) {
            var13.method22(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2883 = var13.method19();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2884++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIII)I")
    public static final int method1269(boolean arg0, int arg1, int arg2, int arg3) {
        field2877++;
        if (arg0) {
            method1273(-19, 93, 10, -32, (class264) null, (class264) null, 9, -82, 11, -28, 9L);
        }
        if ((class247.field3844[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class247.field3844[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;I)I")
    public static final int method1270(byte arg0, String arg1, int arg2) {
        field2880++;
        int var3 = 33 % ((2 - arg0) / 55);
        return class42.method346(arg2, true, -14750, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field2885 = null;
        if (arg0 != 56) {
            method1272(-35, -73, 111);
        }
        field2876 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
    public final int method19() {
        field2879++;
        return this.field2883;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)Lhc;")
    public static final class128 method1272(int arg0, int arg1, int arg2) {
        class201 var3 = class3.field40[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3026; var4++) {
            class128 var5 = var3.field3037[var4];
            if ((var5.field1880 >> 29 & 0x3L) == 2L && var5.field1882 == arg1 && var5.field1870 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILbg;Lbg;IIIIJ)V")
    public static final void method1273(int arg0, int arg1, int arg2, int arg3, class264 arg4, class264 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class67 var12 = new class67();
        var12.field1110 = arg10;
        var12.field1107 = arg1 * 128 + 64;
        var12.field1113 = arg2 * 128 + 64;
        var12.field1117 = arg3;
        var12.field1112 = arg4;
        var12.field1102 = arg5;
        var12.field1098 = arg6;
        var12.field1106 = arg7;
        var12.field1111 = arg8;
        var12.field1101 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class3.field40[var13][arg1][arg2] == null) {
                class3.field40[var13][arg1][arg2] = new class201(var13, arg1, arg2);
            }
        }
        class3.field40[arg0][arg1][arg2].field3025 = var12;
    }
}
