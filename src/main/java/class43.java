import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 extends class78 {

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    private final int field810;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    private final int field809;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    private final int field806;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    private final int field813;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "[[I")
    public static int[][] field812 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Lqd;")
    public static class40 field820 = class147.method1106("Suche nach Updates )2 ", (byte) -74);

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "[Z")
    public static boolean[] field822 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Lij;")
    public static class77 field824;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "[I")
    public static int[] field807;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "[S")
    public static short[] field817;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILce;I)[Lda;", line = 5)
    public static final class114[] method391(int arg0, class239 arg1, int arg2) {
        field816++;
        if (class178.method1311(arg2, arg1, (byte) 114)) {
            int var3 = 122 % ((arg0 + 50) / 62);
            return class102.method768(15739);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIII)V", line = 24)
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field810 = arg0;
        this.field809 = arg3;
        this.field806 = arg2;
        this.field813 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V", line = 37)
    public final void method5(int arg0, int arg1, int arg2) {
        field808++;
        int var4 = this.field810 * arg0 >> 12;
        int var5 = this.field806 * arg0 >> 12;
        int var6 = this.field813 * arg1 >> 12;
        int var7 = this.field809 * arg1 >> 12;
        if (arg2 != -1) {
            this.method2(106, 37, -9);
        }
        class313.method2164((byte) 105, var6, var4, var7, this.field1321, var5);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 57)
    public static final void method392(int arg0) {
        field819++;
        if (!class274.field4549) {
            return;
        }
        class213 var1 = class211.method1483(class235.field3856, class83.field1440, -17970);
        if (var1 != null && var1.field3537 != null) {
            class109 var2 = new class109();
            var2.field1908 = var1.field3537;
            var2.field1910 = var1;
            class121.method912(var2, 119);
        }
        if (arg0 == -376) {
            class274.field4549 = false;
            class25.method188(0, var1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V", line = 95)
    public final void method3(int arg0, byte arg1, int arg2) {
        field815++;
        int var4 = this.field810 * arg2 >> 12;
        if (arg1 > -71) {
            field822 = (boolean[]) null;
        }
        int var5 = this.field813 * arg0 >> 12;
        int var6 = this.field806 * arg2 >> 12;
        int var7 = this.field809 * arg0 >> 12;
        class306.method2093(var4, this.field1317, this.field1321, 105, this.field1325, var5, var6, var7);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIII)V", line = 117)
    public static final void method393(byte arg0, int arg1, int arg2, int arg3) {
        field818++;
        class177 var4 = class177.method1310(48, 11, arg3);
        if (arg0 <= 0) {
            var4.method1302(-20040);
            var4.field2902 = arg1;
            var4.field2908 = arg2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 131)
    public static void method394(byte arg0) {
        field817 = null;
        field807 = null;
        field824 = null;
        if (arg0 != 19) {
            field807 = (int[]) null;
        }
        field822 = null;
        field812 = (int[][]) null;
        field820 = null;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V", line = 147)
    public final void method2(int arg0, int arg1, int arg2) {
        if (arg0 >= 33) {
            field811++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 171)
    public static final void method395(boolean arg0) {
        field823++;
        class19.field295.method1464(111, 0);
        if (!arg0) {
            return;
        }
        class280.field4724++;
        for (class297 var1 = (class297) class165.field2731.method1400(-1); var1 != null; var1 = (class297) class165.field2731.method1403(-90)) {
            if (var1.field4963 == 0) {
                class310.method2119(true, 1, var1);
            }
        }
        if (class41.field792 != null) {
            class25.method188(0, class41.field792);
            class41.field792 = null;
        }
    }
}
