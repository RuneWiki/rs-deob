import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 extends class506 implements class248 {

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "Lrl;")
    public class506 field697;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "[I")
    public static int[] field692 = new int[14];

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field696 = 0;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "Liv;")
    public static class64 field685 = new class64(91, -1);

    @OriginalMember(owner = "client!gp", name = "P", descriptor = "Lrn;")
    public static class174 field699 = new class174(52, 4);

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "Z")
    public static boolean field700 = false;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "Lho;")
    public static class101 field693;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        if (arg0) {
            field696 = 69;
        }
        field690++;
        return null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        if (arg1 <= -111) {
            field680++;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
    public static final void method379(int arg0, int arg1, int arg2) {
        boolean var3 = class380.field5761[0][arg1][arg2] != null && class380.field5761[0][arg1][arg2].field6389 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class380.field5761[var4][arg1][arg2] == null) {
                class429 var5 = class380.field5761[var4][arg1][arg2] = new class429(var4, arg1, arg2);
                if (var3) {
                    var5.field6368++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        field684++;
        if (arg0 != 131072) {
            method379(19, -84, 126);
        }
        return false;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBC)I")
    public static final int method380(int arg0, byte arg1, char arg2) {
        field686++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg1 <= 35) {
            method380(-109, (byte) 68, (char) 65461);
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIILrl;)V")
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, class506 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class184.method1288((byte) 13, arg1, arg0));
        this.field697 = arg5;
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)I")
    public final int method381(int arg0) {
        field688++;
        int var2 = -98 / ((arg0 + 32) / 55);
        return 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        int var3 = 22 / ((arg0 + 45) / 48);
        field694++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 != 17793) {
            this.method381(46);
        }
        field689++;
        return null;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        field691++;
        if (arg0 != 3765) {
            field685 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        if (arg0 == -69) {
            field687++;
            return 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)V")
    public static void method382(byte arg0) {
        if (arg0 <= 14) {
            method380(-12, (byte) 41, (char) 65446);
        }
        field692 = null;
        field699 = null;
        field685 = null;
        field693 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V")
    public static final void method383(int arg0, byte arg1) {
        field698++;
        if (arg1 != -37 || !class355.method2252(arg0, -104)) {
            return;
        }
        class350[] var2 = class22.field438[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class350 var4 = var2[var3];
            if (var4 != null) {
                var4.field5342 = 0;
                var4.field5323 = 1;
                var4.field5220 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        field695++;
        return arg0 <= 94;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        if (arg0 != -13300) {
            this.method17((byte) -81);
        }
        field683++;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        int var2 = -47 / ((-arg0 - 46) / 44);
        field681++;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = 101 / ((arg0 + 60) / 40);
        field682++;
        return 0;
    }
}
