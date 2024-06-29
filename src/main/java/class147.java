import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class147 extends class256 {

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field2764 = 0;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lrk;")
    public static class257 field2762 = new class257();

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2766 = -1;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Ljd;")
    public static class86 field2765 = class122.method868(")2", true);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static volatile int field2767 = 0;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2760++;
        int var7 = class171.method1221(class56.field1143, class50.field1050, 21419, arg2);
        int var8 = class171.method1221(class56.field1143, class50.field1050, 21419, arg3);
        int var9 = class171.method1221(class129.field2473, class49.field1044, 21419, arg5);
        int var10 = class171.method1221(class129.field2473, class49.field1044, arg0 ^ 0xFFFFAC54, arg6);
        int var11 = class171.method1221(class56.field1143, class50.field1050, arg0 + 21420, arg2 + arg4);
        int var12 = class171.method1221(class56.field1143, class50.field1050, arg0 ^ 0xFFFFAC54, arg3 - arg4);
        for (int var13 = var7; var13 < var11; var13++) {
            class56.method412(arg1, (byte) -100, var10, class249.field4420[var13], var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class56.method412(arg1, (byte) -126, var10, class249.field4420[var14], var9);
        }
        if (arg0 != -1) {
            field2766 = 65;
        }
        int var15 = class171.method1221(class129.field2473, class49.field1044, 21419, arg5 + arg4);
        int var16 = class171.method1221(class129.field2473, class49.field1044, arg0 ^ 0xFFFFAC54, arg6 - arg4);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class249.field4420[var17];
            class56.method412(arg1, (byte) -116, var15, var18, var9);
            class56.method412(arg1, (byte) -121, var10, var18, var16);
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2765 = null;
        if (arg0 != -1) {
            method1056(99, -80, -13, 119, 59);
        }
        field2762 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILqk;)V")
    public final void method1054(int arg0, class200 arg1) {
        field2759++;
        while (true) {
            int var3 = arg1.method1408((byte) -65);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method1053(66);
                    return;
                }
            }
            this.method1055(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZILqk;)V")
    private final void method1055(boolean arg0, int arg1, class200 arg2) {
        field2768++;
        if (arg1 == 2) {
            this.field2764 = arg2.method1410(-64);
        }
        if (arg0) {
            method1052(19, 84, 28, -126, -11, 35, 26);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2761++;
        if (arg4 != -4756) {
            method1053(-42);
        }
        if (class49.field1044 <= arg3 - arg1 && arg1 + arg3 <= class129.field2473 && arg2 - arg1 >= class50.field1050 && class56.field1143 >= (arg1 + arg2)) {
            class186.method1283(arg2, arg1, arg0, (byte) -127, arg3);
        } else {
            class75.method542(-9, arg3, arg0, arg1, arg2);
        }
    }
}
