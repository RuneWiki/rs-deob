import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class10 extends class198 {

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Lwa;")
    public static class281 field125 = new class281();

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "[I")
    public static int[] field128 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "Lfa;")
    public static class273 field135;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "[I")
    public static int[] field126;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "[S")
    public static short[] field127;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lfa;B)I")
    public static final int method51(class273 arg0, byte arg1) {
        int var2 = 0;
        if (arg0.method1874(class124.field1903, 3883)) {
            ++var2;
        }
        int var3 = -18 % ((arg1 - -66) / 57);
        ++field132;
        if (arg0.method1874(class103.field1554, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class135.field2110, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class197.field3129, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class115.field1743, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class48.field668, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class29.field368, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class304.field4967, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class85.field1344, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class260.field4265, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class165.field2602, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class57.field778, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class107.field1651, 3883)) {
            ++var2;
        }
        if (arg0.method1874(class84.field1323, 3883)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field133;
        int var4 = 121 % ((arg0 - 60) / 61);
        if (~arg2 == -1) {
            this.field131 = (arg1.method1420((byte) 0) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)I")
    public static int method53(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field124;
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                class158.method1050(var3, 0, class42.field590, this.field131);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method54(String arg0, int arg1, int arg2) {
        class36 var3 = class161.method1067(3, arg1, (byte) 81);
        ++field129;
        var3.method219(arg2 ^ 31150);
        if (arg2 == -31105) {
            var3.field459 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
    public static void method55(byte arg0) {
        field127 = null;
        field125 = null;
        field126 = null;
        if (arg0 <= 79) {
            method56(-77, -100, 120, false, (byte) -117);
        }
        field128 = null;
        field135 = null;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class10() {
        this(4096);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZB)V")
    public static final void method56(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        ++field130;
        if (class235.method1632(112, arg0)) {
            class102.method665(class283.field4741[arg0], -1, (byte) 100, arg1, arg3, arg2);
            if (arg4 >= -112) {
                field125 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        super(0, true);
        this.field131 = 4096;
        this.field131 = arg0;
    }
}
