import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class163 extends class46 {

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public int field2944 = 0;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lbg;")
    public static class19 field2946 = new class19();

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lmb;")
    public static class132 field2948 = class166.method1092("Ihr Spielkonto wird bereits benutzt)3", 124);

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Lmb;")
    private static class132 field2954 = class166.method1092("Loading title screen )2 ", 119);

    @OriginalMember(owner = "client!p", name = "J", descriptor = "Lmb;")
    public static class132 field2952 = field2954;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)I")
    public static final int method1052(int arg0, boolean arg1) {
        field2945++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        if (arg1) {
            field2950 = -32;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lkd;I)V")
    public final void method1053(class112 arg0, int arg1) {
        if (arg1 != 6034) {
            field2952 = null;
        }
        while (true) {
            int var3 = arg0.method716(-1308);
            if (var3 == 0) {
                field2953++;
                return;
            }
            this.method1056(arg0, (byte) -123, var3);
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
    public static void method1054(byte arg0) {
        field2954 = null;
        field2948 = null;
        field2946 = null;
        field2952 = null;
        if (arg0 != -27) {
            field2946 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method1055(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2951++;
        if (class137.method933(256, arg1)) {
            class127.field2352 = null;
            class203.method1283(arg4, (byte) -62, arg7, arg0, arg6, arg5, arg3, arg8, -1, class97.field1866[arg1]);
            if (class127.field2352 != null) {
                class203.method1283(arg4, (byte) -62, arg7, class241.field4323, class210.field3869, arg5, arg3, arg8, -1412584499, class127.field2352);
                class127.field2352 = null;
            }
            if (arg2) {
                method1055(14, 27, false, 43, -67, 125, 123, -52, 5);
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class196.field3636[var9] = true;
            }
        } else {
            class196.field3636[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lkd;BI)V")
    private final void method1056(class112 arg0, byte arg1, int arg2) {
        if (arg1 > -20) {
            method1055(-35, -78, false, -99, -21, 4, 38, 97, 122);
        }
        if (arg2 == 5) {
            this.field2944 = arg0.method739(-128);
        }
        field2947++;
    }
}
