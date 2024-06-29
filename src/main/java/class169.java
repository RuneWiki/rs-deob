import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class169 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[S")
    public short[] field3142;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[B")
    public byte[] field3131;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
    public int[] field3135;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[S")
    public short[] field3132;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[Lli;")
    public class185[] field3136;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lli;")
    public static class185 field3128 = class245.method1649(")2", -71);

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "[J")
    public static long[] field3140 = new long[1000];

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "F")
    public static float field3129;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1210(int arg0) {
        if (arg0 != -1) {
            method1210(56);
        }
        field3128 = null;
        field3140 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z")
    public final boolean method1211(int arg0, int arg1) {
        if (arg0 != 8) {
            field3129 = -0.80358934F;
        }
        field3137++;
        return (this.field3131[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)I")
    public final int method1212(int arg0, byte arg1) {
        if (arg1 != 17) {
            this.field3136 = null;
        }
        field3130++;
        return this.field3131[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Z")
    public final boolean method1213(byte arg0, int arg1) {
        if (arg0 <= 108) {
            return false;
        } else {
            field3139++;
            return (this.field3131[arg1] & 0x10) == 0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)Z")
    public final boolean method1214(int arg0, int arg1) {
        field3141++;
        if (arg0 != -12648) {
            field3128 = null;
        }
        return (this.field3131[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
    public class169(int arg0) {
        this.field3133 = arg0;
        this.field3142 = new short[this.field3133];
        this.field3131 = new byte[this.field3133];
        this.field3135 = new int[this.field3133];
        this.field3132 = new short[this.field3133];
        this.field3136 = new class185[this.field3133];
    }
}
