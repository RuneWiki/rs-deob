import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class122 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    public static int[] field2785 = new int[5];

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lja;")
    private static class62 field2788 = class30.method243(43, "Ok");

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Lja;")
    public static class62 field2801 = class30.method243(43, "p12_full");

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lja;")
    private static class62 field2790 = class30.method243(43, "Loaded title screen");

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lja;")
    public static class62 field2793 = class30.method243(43, "Untersuchen");

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[Lja;")
    public static class62[] field2797 = new class62[100];

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lja;")
    public static class62 field2787 = field2790;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lja;")
    public static class62 field2802 = field2788;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lja;")
    private static class62 field2792 = class30.method243(43, "Could not complete login)3");

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lja;")
    public static class62 field2796 = field2792;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lpd;")
    public static class108 field2784;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[Lja;")
    public static class62[] field2791;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lja;IZ)V")
    public static final void method964(class62 arg0, int arg1, boolean arg2) {
        field2795++;
        byte var3 = 6;
        if (arg1 != -13897) {
            return;
        }
        short var4 = 200;
        byte var5 = 6;
        byte var6 = 30;
        class19.method143(var3, var5, var4, var6, 0);
        class19.method144(var3, var5, var4, var6, 16777215);
        class86.field2067.method677(arg0, var3, var5, var4, var6, 16777215, -1, 1, 1, 0);
        class4.method19(-23707, var3, var4, var5, var6);
        if (!arg2) {
            class40.method298(var5, (byte) 120, var3, var4, var6);
            return;
        }
        try {
            Graphics var7 = class9.field240.getGraphics();
            class105.field2419.method83(0, (byte) -119, var7, 0);
        } catch (Exception var8) {
            class9.field240.repaint();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BII)I")
    public static final int method965(byte arg0, int arg1, int arg2) {
        field2794++;
        class93 var3 = (class93) class59.field1438.method537(-1, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 >= -40) {
                field2797 = null;
            }
            for (int var5 = 0; var5 < var3.field2183.length; var5++) {
                if (var3.field2173[var5] == arg1) {
                    var4 += var3.field2183[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method966(byte arg0) {
        field2785 = null;
        field2791 = null;
        field2797 = null;
        field2787 = null;
        field2793 = null;
        field2790 = null;
        field2796 = null;
        field2792 = null;
        field2788 = null;
        field2802 = null;
        int var1 = 98 / ((-arg0 - 52) / 63);
        field2784 = null;
        field2801 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([III[I[Lub;I)V")
    public static final void method967(int[] arg0, int arg1, int arg2, int[] arg3, class139[] arg4, int arg5) {
        field2789++;
        if (arg5 != 0 || arg1 <= arg2) {
            return;
        }
        int var6 = arg2 - 1;
        int var7 = arg1 + 1;
        int var8 = (arg1 + arg2) / 2;
        class139 var9 = arg4[var8];
        arg4[var8] = arg4[arg2];
        arg4[arg2] = var9;
        while (var6 < var7) {
            boolean var10 = true;
            do {
                var7--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg3[var11] == 2) {
                        var13 = var9.field3230;
                        var12 = arg4[var7].field3230;
                    } else if (arg3[var11] == 1) {
                        var12 = arg4[var7].field3223;
                        var13 = var9.field3223;
                        if (var12 == -1 && arg0[var11] == 1) {
                            var12 = 2001;
                        }
                        if (var13 == -1 && arg0[var11] == 1) {
                            var13 = 2001;
                        }
                    } else if (arg3[var11] == 3) {
                        var12 = arg4[var7].field3229 ? 1 : 0;
                        var13 = var9.field3229 ? 1 : 0;
                    } else {
                        var12 = arg4[var7].field3232;
                        var13 = var9.field3232;
                    }
                    if (var12 != var13) {
                        if ((arg0[var11] != 1 || var12 <= var13) && (arg0[var11] != 0 || var12 >= var13)) {
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
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg3[var15] == 2) {
                        var16 = var9.field3230;
                        var17 = arg4[var6].field3230;
                    } else if (arg3[var15] == 1) {
                        var16 = var9.field3223;
                        var17 = arg4[var6].field3223;
                        if (var17 == -1 && arg0[var15] == 1) {
                            var17 = 2001;
                        }
                        if (var16 == -1 && arg0[var15] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var15] == 3) {
                        var17 = arg4[var6].field3229 ? 1 : 0;
                        var16 = var9.field3229 ? 1 : 0;
                    } else {
                        var16 = var9.field3232;
                        var17 = arg4[var6].field3232;
                    }
                    if (var16 != var17) {
                        if ((arg0[var15] != 1 || var17 >= var16) && (arg0[var15] != 0 || var17 <= var16)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var6 < var7) {
                class139 var18 = arg4[var6];
                arg4[var6] = arg4[var7];
                arg4[var7] = var18;
            }
        }
        method967(arg0, var7, arg2, arg3, arg4, 0);
        method967(arg0, arg1, var7 + 1, arg3, arg4, 0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method968(int arg0, int arg1) {
        class93 var2 = (class93) class59.field1438.method537(-1, (long) arg0);
        field2803++;
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field2173.length; var3++) {
                var2.field2173[var3] = -1;
                var2.field2183[var3] = 0;
            }
        }
    }
}
