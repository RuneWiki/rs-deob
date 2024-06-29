import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class170 extends class5 {

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lvj;")
    public class112 field3112;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Lhj;")
    public static class69 field3110 = class181.method1318("<col=ffb000>", (byte) -113);

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "Lhj;")
    private static class69 field3103 = class181.method1318("Loaded input handler", (byte) -126);

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Lhj;")
    private static class69 field3111 = class181.method1318("Connecting to update server", (byte) -114);

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Lhj;")
    public static class69 field3117 = class181.method1318("<col=ffffff> )4 ", (byte) -118);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field3113 = 0;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lhj;")
    public static class69 field3114 = field3111;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field3118 = 0;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lhj;")
    public static class69 field3115 = field3103;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Lnc;")
    public static class83 field3106;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lnc;")
    public static class83 field3109;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[[I")
    public static int[][] field3116;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(SI)Z")
    public static final boolean method1242(short arg0, int arg1) {
        int var2 = 7 / ((-arg1 - 70) / 38);
        field3101++;
        if (arg0 == 43 || arg0 == 45 || arg0 == 39 || arg0 == 21 || arg0 == 37 || arg0 == 44 || arg0 == 2 || arg0 == 23) {
            return true;
        } else if (arg0 == 12 || arg0 == 29 || arg0 == 1003 || arg0 == 1002) {
            return true;
        } else if (arg0 == 57 || arg0 == 47 || arg0 == 22 || arg0 == 34 || arg0 == 18) {
            return true;
        } else {
            return arg0 == 5 || arg0 == 33 || arg0 == 40 || arg0 == 9 || arg0 == 59 || arg0 == 7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1243(int arg0, int arg1, int arg2, long arg3) {
        class217 var5 = class158.field2935[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3932 != null && var5.field3932.field2238 == arg3) {
            return true;
        } else if (var5.field3946 != null && var5.field3946.field3849 == arg3) {
            return true;
        } else if (var5.field3949 != null && var5.field3949.field1293 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3940; var6++) {
                if (var5.field3933[var6].field1656 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[BIII[Lah;BZ)V")
    public static final void method1244(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class263[] arg5, byte arg6, boolean arg7) {
        int var8 = 39 / ((arg6 + 6) / 54);
        byte var9;
        if (arg7) {
            var9 = 1;
        } else {
            var9 = 4;
        }
        field3108++;
        if (!arg7) {
            for (int var10 = 0; var10 < 4; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (arg3 + var11 > 0 && (arg3 + var11) < 103 && arg4 + var12 > 0 && arg4 + var12 < 103) {
                            arg5[var10].field4672[arg3 + var11][arg4 + var12] = class69.method443(arg5[var10].field4672[arg3 + var11][arg4 + var12], -16777217);
                        }
                    }
                }
            }
        }
        class128 var13 = new class128(arg1);
        for (int var14 = 0; var14 < var9; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    class191.method1379(arg7, var14, arg2, arg3 + var15, arg4 + var16, var13, 1, 0, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var9 = arg3 + 1;
        class99.method740(arg1, class186.field3402[arg3], -1162793114, arg0, arg4);
        field3105++;
        int var8 = arg2 - 1;
        class99.method740(arg1, class186.field3402[arg2], -1162793114, arg0, arg4);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class186.field3402[var6];
            var7[arg4] = var7[arg0] = arg1;
        }
        if (arg5 <= 24) {
            field3114 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
    public static final void method1246(int arg0, byte arg1) {
        class268.field4767 = 1000 / arg0;
        field3104++;
        int var2 = -81 % ((arg1 - 32) / 34);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        field3109 = null;
        if (arg0 != -5) {
            field3118 = 59;
        }
        field3111 = null;
        field3106 = null;
        field3115 = null;
        field3117 = null;
        field3103 = null;
        field3116 = null;
        field3110 = null;
        field3114 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([Lhj;B)[Lhj;")
    public static final class69[] method1248(class69[] arg0, byte arg1) {
        field3102++;
        class69[] var2 = new class69[5];
        if (arg1 < 30) {
            method1248((class69[]) null, (byte) 2);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class9.method42(-124, new class69[] { class98.method727(-229, var3), class76.field1494 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class9.method42(127, new class69[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lvj;)V")
    public class170(class112 arg0) {
        this.field3112 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static final void method1249(int arg0) {
        field3107++;
        if (class42.field607.toLowerCase().indexOf("microsoft") == -1) {
            if (class42.field612 == null) {
                class82.field1566[192] = 58;
                class82.field1566[222] = 59;
            } else {
                class82.field1566[520] = 59;
                class82.field1566[222] = 58;
                class82.field1566[192] = 28;
            }
            class82.field1566[46] = 72;
            class82.field1566[44] = 71;
            class82.field1566[92] = 74;
            class82.field1566[93] = 43;
            class82.field1566[45] = 26;
            class82.field1566[61] = 27;
            class82.field1566[47] = 73;
            class82.field1566[91] = 42;
            class82.field1566[59] = 57;
        } else {
            class82.field1566[220] = 74;
            class82.field1566[190] = 72;
            class82.field1566[186] = 57;
            class82.field1566[223] = 28;
            class82.field1566[221] = 43;
            class82.field1566[219] = 42;
            class82.field1566[222] = 59;
            class82.field1566[188] = 71;
            class82.field1566[187] = 27;
            class82.field1566[189] = 26;
            class82.field1566[191] = 73;
            class82.field1566[192] = 58;
        }
        if (arg0 != 59) {
            method1244(82, (byte[]) null, 58, -105, -72, (class263[]) null, (byte) -68, true);
        }
    }
}
