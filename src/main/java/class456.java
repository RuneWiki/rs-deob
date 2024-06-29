import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class456 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "B")
    public byte field6987;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field6994;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field6986;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public int field6991;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field6989;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public int field6984;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lbg;")
    public static class310 field6985 = new class310(50, 8);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
    public static int[] field6992 = new int[256];

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lha;")
    public static class40 field6997;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "S")
    public static short field7001;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lhq;")
    public class104 field6993;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lgu;")
    public class393 field6996;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lvm;")
    public class464 field6990;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljj;")
    public class71 field6988;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method2703(int arg0) {
        field6997 = null;
        if (arg0 > 117) {
            field6992 = null;
            field6985 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method2704(int arg0, int arg1) {
        if (arg1 != -12) {
            method2703(17);
        }
        class164.field2559 = 1000 / arg0;
        field6995++;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(BIIIII)V")
    public class456(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6987 = arg0;
        this.field6994 = arg5;
        this.field6986 = arg1;
        this.field6991 = arg2;
        this.field6989 = arg4;
        this.field6984 = arg3;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6992[var0] = var1;
        }
        field6998 = 0;
        field6997 = new class40(1);
        field7000 = 2;
        field7001 = 205;
    }
}
