import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class730 {

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field10130;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public int field10125;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    private int field10128;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field10120;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "B")
    public byte field10134;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field10124 = 0;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[[I")
    public static int[][] field10116 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "[I")
    public static int[] field10133 = new int[256];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public int field10113;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public int field10114;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public int field10115;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field10121;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field10126;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public int field10127;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public int field10129;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public int field10131;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public int field10132;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lcm;")
    public class730 field10122;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lfga;")
    public final class258 method4092(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field10118++;
            return class277.method1666(this.field10128, -11836);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method4093(byte arg0) {
        field10116 = null;
        if (arg0 != 49) {
            field10124 = -37;
        }
        field10133 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z")
    public static final boolean method4094(int arg0, int arg1, int arg2) {
        field10123++;
        if (arg2 <= 121) {
            field10116 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([SIZ)[S")
    public static final short[] method4095(short[] arg0, int arg1, boolean arg2) {
        field10119++;
        short[] var3 = new short[arg1];
        if (!arg2) {
            method4094(-90, -96, -88);
        }
        class335.method2022(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)Lcm;")
    public final class730 method4096(int arg0, int arg1, int arg2, int arg3) {
        field10117++;
        if (arg0 != 1) {
            this.method4096(85, -12, 8, -96);
        }
        return new class730(this.field10128, arg3, arg1, arg2, this.field10134);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIB)V")
    public class730(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field10130 = arg3;
        this.field10125 = arg2;
        this.field10128 = arg0;
        this.field10120 = arg1;
        this.field10134 = arg4;
    }
}
