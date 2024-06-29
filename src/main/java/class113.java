import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 extends class41 {

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "Lu;")
    public static class135 field2717 = class87.method676((byte) -128, "Aus");

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Lu;")
    public static class135 field2730 = class87.method676((byte) -114, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "Lu;")
    public static class135 field2729 = class87.method676((byte) -60, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Lu;")
    public static class135 field2732 = class87.method676((byte) -49, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Lu;")
    public static class135 field2733 = class87.method676((byte) -92, "Freunde");

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field2738 = 2301979;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Lu;")
    private static class135 field2736 = class87.method676((byte) -73, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lu;")
    public static class135 field2720 = field2736;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "Lu;")
    public static class135 field2740 = class87.method676((byte) -73, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "Lu;")
    public static class135 field2742 = class87.method676((byte) -45, "");

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Lu;")
    public static class135 field2724 = field2742;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lu;")
    public static class135 field2718 = field2742;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lu;")
    public static class135 field2722 = field2742;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Lu;")
    public static class135 field2734 = field2742;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lu;")
    public static class135 field2725 = field2742;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "Lu;")
    public static class135 field2723 = field2742;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Lu;")
    public static class135 field2745 = class87.method676((byte) -96, "Lade)3)3)3");

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "Lu;")
    public static class135 field2744 = field2742;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lu;")
    public static class135 field2735 = field2742;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lqb;")
    public class113 field2731;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "Lqb;")
    public class113 field2741;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "Lre;")
    public static class122 field2739;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lae;")
    public static class6 field2721;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
    public static int[] field2726;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method921(int arg0) {
        field2737++;
        if (this.field2741 == null) {
            return;
        }
        this.field2741.field2731 = this.field2731;
        this.field2731.field2741 = this.field2741;
        if (arg0 == 2001) {
            this.field2741 = null;
            this.field2731 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2729 = null;
        field2721 = null;
        field2734 = null;
        field2740 = null;
        field2736 = null;
        field2722 = null;
        field2726 = null;
        field2723 = null;
        field2720 = null;
        field2732 = null;
        field2739 = null;
        field2718 = null;
        field2735 = null;
        field2724 = null;
        field2733 = null;
        field2742 = null;
        field2744 = null;
        field2730 = null;
        field2725 = null;
        field2745 = null;
        field2717 = null;
        if (arg0 < 65) {
            field2730 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI[Lha;[I[I)V")
    public static final void method923(int arg0, byte arg1, int arg2, class50[] arg3, int[] arg4, int[] arg5) {
        if (arg2 < arg0) {
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg0 + 1;
            int var8 = arg2 - 1;
            class50 var9 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var9;
            while (var8 < var7) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg4[var11] == 2) {
                            var13 = arg3[var7].field1190;
                            var12 = var9.field1190;
                        } else if (arg4[var11] == 1) {
                            var12 = var9.field1182;
                            if (var12 == -1 && arg5[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = arg3[var7].field1182;
                            if (var13 == -1 && arg5[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg4[var11] == 3) {
                            var12 = var9.field1185 ? 1 : 0;
                            var13 = arg3[var7].field1185 ? 1 : 0;
                        } else {
                            var13 = arg3[var7].field1186;
                            var12 = var9.field1186;
                        }
                        if (var12 != var13) {
                            if ((arg5[var11] != 1 || var13 <= var12) && (arg5[var11] != 0 || var13 >= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var8++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg4[var15] == 2) {
                            var16 = arg3[var8].field1190;
                            var17 = var9.field1190;
                        } else if (arg4[var15] == 1) {
                            var17 = var9.field1182;
                            if (var17 == -1 && arg5[var15] == 1) {
                                var17 = 2001;
                            }
                            var16 = arg3[var8].field1182;
                            if (var16 == -1 && arg5[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg4[var15] == 3) {
                            var17 = var9.field1185 ? 1 : 0;
                            var16 = arg3[var8].field1185 ? 1 : 0;
                        } else {
                            var16 = arg3[var8].field1186;
                            var17 = var9.field1186;
                        }
                        if (var16 != var17) {
                            if ((arg5[var15] != 1 || var16 >= var17) && (arg5[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 > var8) {
                    class50 var18 = arg3[var8];
                    arg3[var8] = arg3[var7];
                    arg3[var7] = var18;
                }
            }
            method923(var7, (byte) 65, arg2, arg3, arg4, arg5);
            method923(arg0, (byte) 104, var7 + 1, arg3, arg4, arg5);
        }
        int var19 = -85 % ((-arg1 - 75) / 50);
        field2727++;
    }
}
