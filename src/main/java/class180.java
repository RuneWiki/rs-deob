import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class180 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lic;")
    public static class160 field2994 = new class160(64);

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field3001 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3000 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lhi;")
    public static class25 field2996;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLsb;)I")
    public static final int method1270(boolean arg0, class124 arg1) {
        field2997++;
        int var2 = 0;
        if (arg1.method899(class11.field159, -109)) {
            var2++;
        }
        if (arg1.method899(class262.field4161, -109)) {
            var2++;
        }
        if (arg0) {
            field3002 = -66;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2998++;
        for (int var5 = arg4; var5 < class258.field4114; var5++) {
            if ((class220.field3522[var5] + class164.field2670[var5]) > arg3 && arg0 + arg3 > class220.field3522[var5] && (class252.field4009[var5] + class287.field4594[var5]) > arg2 && (arg1 + arg2) > class252.field4009[var5]) {
                class229.field3659[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILci;JZ)V")
    public static final void method1272(int arg0, int arg1, int arg2, int arg3, class60 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class249 var8 = new class249();
        var8.field3973 = arg4;
        var8.field3975 = arg1 * 128 + 64;
        var8.field3977 = arg2 * 128 + 64;
        var8.field3978 = arg3;
        var8.field3979 = arg5;
        if (class26.field455[arg0][arg1][arg2] == null) {
            class26.field455[arg0][arg1][arg2] = new class129(arg0, arg1, arg2);
        }
        class26.field455[arg0][arg1][arg2].field2133 = var8;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method1273(int arg0) {
        if (arg0 <= 74) {
            field2994 = null;
        }
        field2994 = null;
        field2996 = null;
    }
}
