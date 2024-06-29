import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class62 extends class9 {

    @OriginalMember(owner = "client!naa", name = "Q", descriptor = "Z")
    public boolean field615 = true;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
    public static int field607 = 0;

    @OriginalMember(owner = "client!naa", name = "N", descriptor = "Lrg;")
    public static class548 field612 = new class548(19, 3);

    @OriginalMember(owner = "client!naa", name = "T", descriptor = "Ljs;")
    public static class275 field618 = new class275(0, 2, 2, 1);

    @OriginalMember(owner = "client!naa", name = "U", descriptor = "I")
    public static int field619 = -1;

    @OriginalMember(owner = "client!naa", name = "V", descriptor = "Lcea;")
    public static class180 field620 = new class180(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!naa", name = "W", descriptor = "Lrg;")
    public static class548 field621 = new class548(25, 7);

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "F")
    public static float field603;

    @OriginalMember(owner = "client!naa", name = "X", descriptor = "F")
    public static float field622;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!naa", name = "J", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!naa", name = "K", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!naa", name = "L", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!naa", name = "M", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!naa", name = "O", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!naa", name = "P", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!naa", name = "R", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!naa", name = "S", descriptor = "Lcaa;")
    public class251 field617;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "[I")
    public int[] field598;

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "[I")
    private int[] field600;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field599;

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "[[I")
    private int[][] field596;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Ljs;")
    public final class275 method352(int arg0, int arg1) {
        field604++;
        if (this.field600 == null || arg1 < 0 || this.field600.length < arg1) {
            return null;
        } else {
            int var3 = 113 % ((40 - arg0) / 62);
            return class485.method2819(this.field600[arg1], (byte) -99);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
    public static void method353(byte arg0) {
        field618 = null;
        field621 = null;
        field620 = null;
        if (arg0 != -97) {
            field622 = -0.5307662F;
        }
        field612 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Los;[II)V")
    public final void method354(class374 arg0, int[] arg1, int arg2) {
        field605++;
        if (this.field600 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field600.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method352(109, var4).field3627;
            if (var5 > 0) {
                arg0.method2132((long) arg1[var4], -8798, var5);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V")
    public final void method355(int arg0) {
        if (arg0 != 32768) {
            method361(32, -57, 115, 114);
        }
        field602++;
        if (this.field598 != null) {
            for (int var2 = 0; var2 < this.field598.length; var2++) {
                this.field598[var2] = class42.method223(this.field598[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(III)I")
    public final int method356(int arg0, int arg1, int arg2) {
        field601++;
        if (this.field600 == null || arg1 < 0 || this.field600.length < arg1) {
            return -1;
        } else if (this.field596[arg1] == null || arg2 < 0 || this.field596[arg1].length < arg2) {
            return -1;
        } else if (arg0 == 260514) {
            return this.field596[arg1][arg2];
        } else {
            return -49;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Los;I)Ljava/lang/String;")
    public final String method357(class374 arg0, int arg1) {
        if (arg1 < 41) {
            return null;
        }
        field610++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field600 != null) {
            for (int var4 = 0; var4 < this.field600.length; var4++) {
                var3.append(this.field599[var4]);
                var3.append(this.field617.method1425(arg0.method2118(class485.method2819(this.field600[var4], (byte) -38).field3621, 255), 118, this.field596[var4], this.method352(-117, var4)));
            }
        }
        var3.append(this.field599[this.field599.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "(I)I")
    public final int method358(int arg0) {
        field609++;
        if (this.field600 == null) {
            return 0;
        } else {
            int var2 = 12 / ((15 - arg0) / 49);
            return this.field600.length;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)I")
    public static final int method359(byte arg0, int arg1) {
        if (arg0 == 81) {
            field608++;
            return (arg1 & 0x3F9A2) >> 11;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILos;I)V")
    private final void method360(int arg0, class374 arg1, int arg2) {
        if (arg0 != -3) {
            field607 = -83;
        }
        if (arg2 == 1) {
            this.field599 = class220.method1267(arg1.method2133(false), '<', (byte) 119);
        } else if (arg2 == 2) {
            int var9 = arg1.method2129(arg0 - 83);
            this.field598 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field598[var10] = arg1.method2136(false);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2129(-111);
            this.field596 = new int[var4][];
            this.field600 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2136(false);
                class275 var7 = class485.method2819(var6, (byte) -46);
                if (var7 != null) {
                    this.field600[var5] = var6;
                    this.field596[var5] = new int[var7.field3624];
                    for (int var8 = 0; var8 < var7.field3624; var8++) {
                        this.field596[var5][var8] = arg1.method2136(false);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field615 = false;
        }
        field606++;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 52 / ((arg1 - 51) / 50);
        field616++;
        class136.field1663.method2131(arg2, -1495157560);
        class136.field1663.method2148(arg0, 29780);
        class136.field1663.method2148(arg3, 29780);
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(Los;I)V")
    public final void method362(class374 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2129(-121);
            if (var3 == 0) {
                if (arg1 >= -28) {
                    this.method354(null, null, 0);
                }
                field613++;
                return;
            }
            this.method360(-3, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III[II)V")
    public static final void method363(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        field597++;
        if (arg1 > -126) {
            field603 = 1.5816301F;
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg3[var7] = arg2;
            int var8 = var7 + 1;
            arg3[var8] = arg2;
            int var9 = var8 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            int var13 = var12 + 1;
            arg3[var13] = arg2;
            arg4 = var13 + 1;
            arg3[arg4] = arg2;
        }
        while (var6 > arg4) {
            arg4++;
            arg3[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method364(int arg0) {
        field614++;
        if (arg0 != 99) {
            this.field599 = null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field599 == null) {
            return "";
        }
        var2.append(this.field599[0]);
        for (int var3 = 1; var3 < this.field599.length; var3++) {
            var2.append("...");
            var2.append(this.field599[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;ILjava/lang/String;I)V")
    public static final void method365(String arg0, int arg1, String arg2, byte arg3, String arg4, int arg5, String arg6, int arg7) {
        field611++;
        class115 var8 = class5.field45[99];
        for (int var9 = 99; var9 > 0; var9--) {
            class5.field45[var9] = class5.field45[var9 - 1];
        }
        if (arg3 != -29) {
            field603 = -1.5305425F;
        }
        if (var8 == null) {
            var8 = new class115(arg5, arg1, arg4, arg6, arg2, arg7, arg0);
        } else {
            var8.method683(-28388, arg0, arg5, arg4, arg2, arg7, arg6, arg1);
        }
        class602.field8691++;
        class5.field45[0] = var8;
        class354.field4642 = class519.field7305;
    }
}
