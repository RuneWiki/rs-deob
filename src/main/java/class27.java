import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class47 {

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "[[I")
    public int[][] field658;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "[I")
    public int[] field668;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Loc;")
    private static class99 field659 = class48.method402((byte) -104, "shake:");

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field671 = -1;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Loc;")
    public static class99 field661 = field659;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Loc;")
    public static class99 field669 = class48.method402((byte) -104, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Loc;")
    public static class99 field664 = field659;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Loc;")
    public static class99 field674 = class48.method402((byte) -104, ")1");

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Lr;")
    public static class118 field665 = new class118(64);

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lr;")
    public static class118 field677 = new class118(100);

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Loc;")
    public static class99 field681 = class48.method402((byte) -104, "backhmid2");

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Loc;")
    public static class99 field682 = class48.method402((byte) -104, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field679 = -1;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "Z")
    public static boolean field684 = false;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Loc;")
    private static class99 field683 = class48.method402((byte) -104, "Connection lost");

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Loc;")
    public static class99 field680 = class48.method402((byte) -104, ":  ");

    @OriginalMember(owner = "client!de", name = "O", descriptor = "Loc;")
    public static class99 field678 = field683;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "[I")
    public static int[] field676;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIBI)V")
    public static final void method251(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field667++;
        class89.field2202[0].method216(arg5, arg1);
        class89.field2202[1].method216(arg5, arg1 + arg3 - 16);
        class96.method794(arg5, arg1 + 16, 16, arg3 - 32, class9.field219);
        int var6 = (arg3 - 32) * arg3 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg2 / (arg0 - arg3);
        class96.method794(arg5, arg1 + var7 + 16, 16, var6, class130.field3192);
        class96.method788(arg5, arg1 + var7 + 16, var6, class53.field1271);
        class96.method788(arg5 + 1, arg1 - -16 + var7, var6, class53.field1271);
        class96.method793(arg5, var7 + arg1 + 16, 16, class53.field1271);
        if (arg4 <= 61) {
            method251(-59, -4, -17, -103, (byte) -93, 89);
        }
        class96.method793(arg5, arg1 + var7 + 17, 16, class53.field1271);
        class96.method788(arg5 + 15, arg1 - (-var7 + -16), var6, class126.field3059);
        class96.method788(arg5 + 14, var7 + 17 + arg1, var6 - 1, class126.field3059);
        class96.method793(arg5, arg1 + var6 + var7 + 15, 16, class126.field3059);
        class96.method793(arg5 + 1, var6 + 14 + arg1 - -var7, 15, class126.field3059);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBILra;I)V")
    public static final void method252(int arg0, byte arg1, int arg2, class115 arg3, int arg4) {
        class20.field484.method874((byte) -115);
        class114.field2845.method216(0, 0);
        arg3.method989(class23.field544, 55, 28, 16777215, true);
        if (arg0 == 0) {
            arg3.method989(class49.field1194, 55, 41, 65280, true);
        }
        field663++;
        if (arg0 == 1) {
            arg3.method989(class49.field1178, 55, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg3.method989(class101.field2466, 55, 41, 16711680, true);
        }
        if (arg0 == 3) {
            arg3.method989(class3.field69, 55, 41, 65535, true);
        }
        arg3.method989(class14.field328, 184, 28, 16777215, true);
        if (arg2 == 0) {
            arg3.method989(class49.field1194, 184, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg3.method989(class49.field1178, 184, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg3.method989(class101.field2466, 184, 41, 16711680, true);
        }
        arg3.method989(class91.field2241, 324, 28, 16777215, true);
        if (arg4 == 0) {
            arg3.method989(class49.field1194, 324, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg3.method989(class49.field1178, 324, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg3.method989(class101.field2466, 324, 41, 16711680, true);
        }
        arg3.method987(class84.field2084, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        if (arg1 != -128) {
            return;
        }
        try {
            Graphics var5 = class5.field99.getGraphics();
            class20.field484.method109(0, 453, 0, var5);
        } catch (Exception var6) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Z")
    public static final boolean method253(int arg0, boolean arg1) {
        field672++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class141.field3486[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 16) {
            return true;
        } else {
            if (!arg1) {
                field682 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lse;III)V")
    public static final void method254(class126 arg0, int arg1, int arg2, int arg3) {
        field660++;
        if (arg0.field3132 == arg1 && arg1 != -1) {
            int var4 = class142.method1163(-125, arg1).field2015;
            if (var4 == 1) {
                arg0.field3081 = 0;
                arg0.field3128 = arg3;
                arg0.field3060 = 0;
                arg0.field3104 = 0;
            }
            if (var4 == 2) {
                arg0.field3060 = 0;
            }
        } else if (arg1 == -1 || arg0.field3132 == -1 || class142.method1163(-107, arg1).field2020 >= class142.method1163(arg2 + 29890, arg0.field3132).field2020) {
            arg0.field3128 = arg3;
            arg0.field3113 = arg0.field3070;
            arg0.field3081 = 0;
            arg0.field3104 = 0;
            arg0.field3060 = 0;
            arg0.field3132 = arg1;
        }
        if (arg2 != -30014) {
            field661 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBLpc;)[Ljc;")
    public static final class64[] method255(int arg0, int arg1, byte arg2, class105 arg3) {
        field666++;
        if (arg2 > -15) {
            field677 = null;
        }
        return class95.method782(arg0, (byte) -99, arg3, arg1) ? class142.method1161(0) : null;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
    public static final boolean method256(int arg0) {
        if (arg0 == 2000) {
            field670++;
            return class11.field259 == 0 ? class46.field1131.method1128(arg0 ^ 0x5E14) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method257(int arg0) {
        if (arg0 != -1) {
            field680 = null;
        }
        field661 = null;
        field678 = null;
        field683 = null;
        field676 = null;
        field677 = null;
        field669 = null;
        field674 = null;
        field680 = null;
        field664 = null;
        field659 = null;
        field682 = null;
        field681 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I[B)V")
    public class27(int arg0, byte[] arg1) {
        this.field675 = arg0;
        class57 var3 = new class57(arg1);
        this.field662 = var3.method510(-122);
        this.field658 = new int[this.field662][];
        this.field668 = new int[this.field662];
        for (int var4 = 0; var4 < this.field662; var4++) {
            this.field668[var4] = var3.method510(-122);
        }
        for (int var5 = 0; var5 < this.field662; var5++) {
            this.field658[var5] = new int[var3.method510(-112)];
        }
        for (int var6 = 0; var6 < this.field662; var6++) {
            for (int var7 = 0; var7 < this.field658[var6].length; var7++) {
                this.field658[var6][var7] = var3.method510(-109);
            }
        }
    }
}
