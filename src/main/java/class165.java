import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class165 extends class305 {

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public int field2662 = 0;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "Z")
    public static boolean field2658 = false;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2657 = "Loaded wordpack";

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field2670 = 0;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Le;")
    public static class342 field2671 = new class342(64);

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "Lh;")
    public static class107 field2672;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "Luf;")
    public static class228 field2674;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Lbm;")
    public static class307 field2673;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BII)V", line = 7)
    public static final void method1050(byte arg0, int arg1, int arg2) {
        if (arg0 != -103) {
            field2658 = true;
        }
        field2667++;
        class155 var3 = class269.method1795((byte) -124, arg2);
        int var4 = var3.field2528;
        int var5 = var3.field2524;
        int var6 = var3.field2520;
        int var7 = class99.field1751[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class4.method56(var4, var8 & arg1 << var5 | ~var8 & class23.field468[var4], -1);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lag;BI)V", line = 32)
    private final void method1051(class202 arg0, byte arg1, int arg2) {
        if (arg1 == -116) {
            if (arg2 == 2) {
                this.field2662 = arg0.method1315(arg1 ^ 0xFFFFC85D);
            }
            field2661++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILkl;)V", line = 59)
    public static final void method1052(int arg0, class68 arg1) {
        field2666++;
        class68 var2 = class130.method859(false, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class88.field1658;
            var3 = class134.field2257;
        } else {
            var3 = var2.field1414;
            var4 = var2.field1416;
        }
        class162.method1037(arg1, -64, var4, false, var3);
        if (arg0 > 76) {
            class68.method524(var3, 2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V", line = 91)
    public static void method1053(int arg0) {
        field2672 = null;
        if (arg0 != 0) {
            field2671 = (class342) null;
        }
        field2674 = null;
        field2671 = null;
        field2657 = null;
        field2673 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIII)V", line = 112)
    public static final void method1054(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2665++;
        if (arg4 >= arg2) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class155.field2522[var5][arg0] = arg3;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class155.field2522[var6][arg0] = arg3;
            }
        }
        if (arg1 != -90) {
            field2660 = 93;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Z", line = 160)
    public static final boolean method1055(int arg0) {
        if (arg0 <= 20) {
            field2659 = 14;
        }
        field2663++;
        if (class276.field4214) {
            try {
                class102.method666(class177.field2849.field2139, false, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IB)Z", line = 181)
    public static final boolean method1056(int arg0, byte arg1) {
        field2669++;
        if (class303.field4607[arg0]) {
            return true;
        } else if (class302.field4577.method2037(arg0, -1)) {
            int var2 = class302.field4577.method2056(arg0, arg1 - 134);
            if (var2 == 0) {
                class303.field4607[arg0] = true;
                return true;
            }
            if (class138.field2300[arg0] == null) {
                class138.field2300[arg0] = new class68[var2];
            }
            if (arg1 != 24) {
                field2671 = (class342) null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class138.field2300[arg0][var3] == null) {
                    byte[] var4 = class302.field4577.method2036(arg0, var3, (byte) 62);
                    if (var4 != null) {
                        class68 var5 = class138.field2300[arg0][var3] = new class68();
                        var5.field1284 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method518(-9500, new class202(var4));
                        } else {
                            var5.method516(new class202(var4), 72);
                        }
                    }
                }
            }
            class303.field4607[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lag;I)V", line = 241)
    public final void method1057(class202 arg0, int arg1) {
        field2668++;
        while (true) {
            int var3 = arg0.method1317((byte) -84);
            if (var3 == 0) {
                if (arg1 >= -102) {
                    this.method1051((class202) null, (byte) 48, 109);
                }
                return;
            }
            this.method1051(arg0, (byte) -116, var3);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I[I[III)V", line = 262)
    public static final void method1058(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field2664++;
        if (arg0 != 1 || arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg3; var9 < arg4; var9++) {
            if ((var7 + (var9 & 0x1)) < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method1058(1, arg1, arg2, arg3, var6 - 1);
        method1058(arg0, arg1, arg2, var6 + 1, arg4);
    }
}
