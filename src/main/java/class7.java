import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 {

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "[Loa;")
    private class30[] field61;

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "[Z")
    public static boolean[] field65 = new boolean[112];

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lu;")
    public static class38 field59 = class28.method177("Loading )3)3)3", (byte) -84);

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lu;")
    public static class38 field66 = class28.method177("Next page", (byte) -84);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Lu;")
    private static class38 field64 = class28.method177("Guide", (byte) -84);

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "[[[[B")
    public static byte[][][][] field67 = new byte[5][][][];

    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "I")
    public static volatile int field71 = 0;

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "J")
    private long field68;

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "Loa;")
    private class30 field70;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "Lt;")
    public static class37 field69;

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "[I")
    public static int[] field62;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Loa;IJ)V", line = 5)
    public final void method34(class30 arg0, int arg1, long arg2) {
        if (arg0.field385 != null) {
            arg0.method186((byte) 124);
        }
        class30 var5 = this.field61[(int) (arg2 & (long) (this.field60 - 1))];
        if (arg1 != 0) {
            method35(32);
        }
        arg0.field375 = var5;
        arg0.field380 = arg2;
        arg0.field385 = var5.field385;
        arg0.field385.field375 = arg0;
        arg0.field375.field385 = arg0;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)[Lu;", line = 35)
    public static final class38[] method35(int arg0) {
        if (arg0 != 0) {
            field67 = null;
        }
        return new class38[] { mapview.field306, class19.field194, class38.field492, class3.field41, class25.field240, class27.field345, class23.field223, class26.field247, class3.field20, class17.field167, class3.field33, class24.field237, class17.field174, class33.field410, class16.field148, class28.field353, class28.field357, class22.field212, class26.field253, class24.field233, class11.field103, class22.field211, class29.field365, class20.field208, class34.field436, class31.field391, class11.field107, mapview.field295, class22.field218, class11.field105, class3.field25, class33.field407, class23.field219, class19.field200, class32.field398, class34.field416, class29.field371, class19.field199, class36.field471, class9.field88, class28.field360, class26.field252, class1.field11, class38.field488, class34.field428, class36.field468, class1.field9, class27.field344, class17.field166, class22.field215, class9.field85, class19.field198, class11.field104, class8.field77, class36.field469, field64, class26.field251, class30.field379, class16.field161, class32.field397, class36.field472, mapview.field268, class4.field48, class36.field467, class4.field48, class17.field165, class4.field48, class19.field197, class24.field228, class4.field48, class18.field180, class38.field495, class4.field48, class22.field210, class16.field149, class4.field48, class4.field48 };
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)Loa;", line = 56)
    public final class30 method36(byte arg0) {
        if (this.field70 == null) {
            return null;
        }
        class30 var2 = this.field61[(int) (this.field68 & (long) (this.field60 - 1))];
        while (this.field70 != var2) {
            if (this.field70.field380 == this.field68) {
                class30 var3 = this.field70;
                this.field70 = this.field70.field375;
                return var3;
            }
            this.field70 = this.field70.field375;
        }
        int var4 = 66 / ((-arg0 - 68) / 43);
        this.field70 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(JB)Loa;", line = 87)
    public final class30 method37(long arg0, byte arg1) {
        this.field68 = arg0;
        class30 var4 = this.field61[(int) (arg0 & (long) (this.field60 - 1))];
        for (this.field70 = var4.field375; this.field70 != var4; this.field70 = this.field70.field375) {
            if (this.field70.field380 == arg0) {
                class30 var5 = this.field70;
                this.field70 = this.field70.field375;
                return var5;
            }
        }
        if (arg1 >= -96) {
            this.method37(65L, (byte) 125);
        }
        this.field70 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)V", line = 118)
    public static void method38(byte arg0) {
        if (arg0 > -46) {
            return;
        }
        field62 = null;
        field67 = null;
        field65 = null;
        field66 = null;
        field59 = null;
        field69 = null;
        field64 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lb;BII)Z", line = 152)
    public static final boolean method39(class3 arg0, byte arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method15(arg2, (byte) -91, arg3);
        if (arg1 != -19) {
            method40(-6, true, 77);
        }
        if (var4 == null) {
            return false;
        } else {
            class23.method129(-83, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IZI)B", line = 180)
    public static final byte method40(int arg0, boolean arg1, int arg2) {
        int var3 = arg0 >> 6;
        if (arg1) {
            return -2;
        }
        int var4 = arg2 >> 6;
        if (class24.field236[var3][var4] == null) {
            return 0;
        } else if (class24.field236[var3][var4].field395 == null) {
            return class24.field236[var3][var4].field400;
        } else {
            return class24.field236[var3][var4].field395[(arg0 & 0xFC0) + arg2 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([Lu;B)Lu;", line = 200)
    public static final class38 method41(class38[] arg0, byte arg1) {
        if (arg1 != 56) {
            field67 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class4.method28(arg0, arg1 ^ 0x2, 0, arg0.length);
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(I)V", line = 224)
    public class7(int arg0) {
        this.field60 = arg0;
        this.field61 = new class30[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class30 var3 = this.field61[var2] = new class30();
            var3.field375 = var3;
            var3.field385 = var3;
        }
    }
}
