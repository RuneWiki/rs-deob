import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class231 extends class225 {

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    private final int field3828;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    private final int field3835;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    private final int field3842;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    private final int field3830;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "[I")
    public static int[] field3837 = new int[32];

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Lma;")
    public static class5 field3838;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "Lma;")
    public static class5 field3841;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "[Lqc;")
    public static class301[] field3844;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIB)V", line = 9)
    public final void method397(int arg0, int arg1, byte arg2) {
        field3831++;
        if (arg2 >= -104) {
            this.method397(-21, -108, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIB)V", line = 22)
    public final void method393(int arg0, int arg1, byte arg2) {
        if (arg2 != -3) {
            return;
        }
        int var4 = this.field3842 * arg1 >> 12;
        int var5 = this.field3830 * arg0 >> 12;
        field3833++;
        int var6 = this.field3835 * arg0 >> 12;
        int var7 = this.field3828 * arg1 >> 12;
        class126.method839(var7, var4, var5, this.field3704, false, var6);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1644(byte arg0) {
        field3832++;
        if (class74.field1168 > 0) {
            class150.method941((byte) -7);
            return;
        }
        class197.field3139 = class47.field725;
        class47.field725 = null;
        class112.method741(40, 5);
        if (arg0 <= 114) {
            method1646(-64);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)I", line = 79)
    public static final int method1645(byte arg0) {
        if (arg0 > -25) {
            method1644((byte) -110);
        }
        field3834++;
        if ((double) class168.field2557 == 3.0D) {
            return 37;
        } else if ((double) class168.field2557 == 4.0D) {
            return 50;
        } else if ((double) class168.field2557 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIII)V", line = 100)
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3828 = arg1;
        this.field3835 = arg2;
        this.field3842 = arg3;
        this.field3830 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 112)
    public static void method1646(int arg0) {
        field3837 = null;
        field3838 = null;
        if (arg0 == -28543) {
            field3844 = null;
            field3841 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIB)V", line = 125)
    public final void method395(int arg0, int arg1, byte arg2) {
        field3829++;
        int var4 = this.field3830 * arg0 >> 12;
        if (arg2 != 29) {
            field3838 = (class5) null;
        }
        int var5 = this.field3835 * arg0 >> 12;
        int var6 = this.field3842 * arg1 >> 12;
        int var7 = this.field3828 * arg1 >> 12;
        class177.method1156(var4, var6, this.field3704, 40, this.field3706, var5, var7, this.field3705);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3837[var1] = var0 - 1;
            var0 += var0;
        }
        field3838 = class12.method119("Hierhin gehen", (byte) 71);
        field3841 = class12.method119("event_opbase", (byte) 108);
        field3840 = -1;
        field3843 = 0;
    }
}
