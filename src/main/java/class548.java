import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class548 extends class205 {

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lra;")
    public class758 field7821;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Lraa;")
    public static class353 field7823 = null;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lew;")
    public static class685 field7822 = new class685("", 13);

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "Lit;")
    public static class34 field7818;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Lpea;")
    public static class456 field7817;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
    public static final int method3203(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method3203(87, 20, 110);
        }
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        field7816++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)V")
    public static final void method3204(int arg0, byte[] arg1) {
        field7819++;
        if (arg0 != 5) {
            return;
        }
        class301 var2 = new class301(arg1);
        while (true) {
            int var3;
            label49: do {
                while (true) {
                    while (true) {
                        var3 = var2.method1987(-36);
                        if (var3 == 0) {
                            return;
                        }
                        if (var3 == 1) {
                            int[] var8 = class463.field6739 = new int[6];
                            var8[0] = var2.method1989((byte) -76);
                            var8[1] = var2.method1989((byte) -89);
                            var8[2] = var2.method1989((byte) -106);
                            var8[3] = var2.method1989((byte) -111);
                            var8[4] = var2.method1989((byte) -119);
                            var8[5] = var2.method1989((byte) -64);
                        } else {
                            if (var3 != 4) {
                                continue label49;
                            }
                            int var6 = var2.method1987(-8);
                            class398.field5918 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                class398.field5918[var7] = var2.method1989((byte) -89);
                                if (class398.field5918[var7] == 65535) {
                                    class398.field5918[var7] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var3 != 5);
            int var4 = var2.method1987(-23);
            class477.field6930 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                class477.field6930[var5] = var2.method1989((byte) -116);
                if (class477.field6930[var5] == 65535) {
                    class477.field6930[var5] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lra;)V")
    public class548(class758 arg0) {
        this.field7821 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method3205(int arg0) {
        field7822 = null;
        if (arg0 == 0) {
            field7817 = null;
            field7818 = null;
            field7823 = null;
        }
    }
}
