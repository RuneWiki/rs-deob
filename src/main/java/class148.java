import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class148 {

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lwf;")
    private class204 field2901 = new class204(256);

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Lwf;")
    private class204 field2913 = new class204(256);

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lah;")
    private class9 field2896;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lah;")
    private class9 field2890;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Leh;")
    public static class47 field2892 = class195.method1282((byte) -4, "(Z");

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Leh;")
    private static class47 field2899 = class195.method1282((byte) -4, "Malformed login packet)3");

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Leh;")
    public static class47 field2889 = class195.method1282((byte) -4, " )2> ");

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Leh;")
    public static class47 field2900 = class195.method1282((byte) -4, "");

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Leh;")
    public static class47 field2908 = class195.method1282((byte) -4, "runes");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Leh;")
    public static class47 field2888 = field2899;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Ldd;")
    public static class34 field2906;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[Lfb;")
    public static class50[] field2897;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "[[[I")
    public static int[][][] field2911;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[III)Lle;")
    private final class104 method1038(int arg0, int[] arg1, int arg2, int arg3) {
        field2912++;
        if (arg3 != -18182) {
            return null;
        }
        int var5 = arg0 ^ (arg2 << 4 & 0xFFFD | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class104 var9 = (class104) this.field2913.method1342(var7, (byte) -20);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class42 var10 = (class42) this.field2901.method1342(var7, (byte) -20);
            if (var10 == null) {
                var10 = class42.method358(this.field2890, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2901.method1341(-86, var7, var10);
            }
            class104 var11 = var10.method365(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method885(3);
                this.field2913.method1341(-110, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILeh;IIB)V")
    public static final void method1039(int arg0, class47 arg1, int arg2, int arg3, byte arg4) {
        field2905++;
        class61 var5 = class32.method278((byte) -69, arg0, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field1180 != null) {
            class43 var6 = new class43();
            var6.field871 = var5.field1180;
            var6.field866 = arg1;
            var6.field859 = var5;
            var6.field867 = arg3;
            class188.method1242(var6, 72);
        }
        boolean var7 = true;
        if (var5.field1225 > 0) {
            var7 = class73.method644(65, var5);
        }
        if (!var7 || !class90.method723(-29438, class5.method25(var5, (byte) 127), arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class60.field1174.method657(28182, 154);
            class60.field1174.method606(arg0, -1424429928);
            class60.field1174.method590(arg2, -1848441912);
            field2914++;
        }
        int var8 = 76 / ((arg4 - 17) / 35);
        if (arg3 == 2) {
            class73.field1616++;
            class60.field1174.method657(28182, 147);
            class60.field1174.method606(arg0, -1424429928);
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 3) {
            class60.field1174.method657(28182, 92);
            class60.field1174.method606(arg0, -1424429928);
            class19.field374++;
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 4) {
            class178.field3409++;
            class60.field1174.method657(28182, 216);
            class60.field1174.method606(arg0, -1424429928);
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 5) {
            class60.field1174.method657(28182, 11);
            class82.field1765++;
            class60.field1174.method606(arg0, -1424429928);
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 6) {
            class60.field1174.method657(28182, 130);
            class144.field2832++;
            class60.field1174.method606(arg0, -1424429928);
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 7) {
            class60.field1174.method657(28182, 173);
            class204.field4015++;
            class60.field1174.method606(arg0, -1424429928);
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 8) {
            class60.field1174.method657(28182, 77);
            class60.field1174.method606(arg0, -1424429928);
            client.field545++;
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 9) {
            class60.field1174.method657(28182, 132);
            class60.field1174.method606(arg0, -1424429928);
            class139.field2729++;
            class60.field1174.method590(arg2, -1848441912);
        }
        if (arg3 == 10) {
            class60.field1174.method657(28182, 64);
            class60.field1174.method606(arg0, -1424429928);
            class180.field3445++;
            class60.field1174.method590(arg2, -1848441912);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IBI)Lle;")
    public final class104 method1040(int[] arg0, byte arg1, int arg2) {
        field2902++;
        if (this.field2890.method71((byte) -95) == 1) {
            return this.method1038(arg2, arg0, 0, -18182);
        } else if (this.field2890.method68(47, arg2) == 1) {
            return this.method1038(0, arg0, arg2, arg1 ^ 0x4727);
        } else {
            if (arg1 != -35) {
                this.method1047(73, null, true);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lig;ZI)V")
    public static final void method1041(class79 arg0, boolean arg1, int arg2) {
        field2898++;
        if (class140.field2743 != null) {
            try {
                class140.field2743.method678((byte) -97);
            } catch (Exception var8) {
            }
            class140.field2743 = null;
        }
        class140.field2743 = arg0;
        class106.method861(arg1, 4);
        class31.field587 = null;
        class52.field1008 = null;
        class197.field3844.field1454 = 0;
        class27.field524 = 0;
        if (arg2 != 256) {
            method1044(false);
        }
        while (true) {
            class31 var3 = (class31) class40.field778.method1344(false);
            if (var3 == null) {
                while (true) {
                    class31 var4 = (class31) class56.field1071.method1344(false);
                    if (var4 == null) {
                        if (class136.field2664 != 0) {
                            try {
                                class68 var5 = new class68(4);
                                var5.method609(4, (byte) -103);
                                var5.method609(class136.field2664, (byte) -118);
                                var5.method590(0, arg2 ^ 0x91D302C8);
                                class140.field2743.method679(4, (byte) 56, var5.field1495, 0);
                            } catch (IOException var7) {
                                try {
                                    class140.field2743.method678((byte) -78);
                                } catch (Exception var6) {
                                }
                                class140.field2743 = null;
                                class53.field1032++;
                            }
                        }
                        class188.field3617 = 0;
                        class59.field1143 = class201.method1313(29);
                        return;
                    }
                    class151.field2961.method1345(0, var4);
                    class122.field2471.method1341(-63, var4.field2283, var4);
                    class86.field1812++;
                    class151.field2960--;
                }
            }
            class51.field995.method1341(arg2 ^ 0xFFFFFE91, var3.field2283, var3);
            class85.field1796++;
            class72.field1554--;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Leh;")
    public static final class47 method1042(byte arg0, int arg1) {
        field2895++;
        class47 var2 = new class47();
        if (arg0 < 120) {
            method1044(true);
        }
        var2.field940 = 0;
        var2.field960 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ldg;IIIII[B)V")
    public static final void method1043(class37[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg2 + var12 > 0 && arg2 + var12 < 103 && arg4 + var13 > 0 && arg4 + var13 < 103) {
                        arg0[var7].field741[arg2 + var12][arg4 + var13] = class142.method1018(arg0[var7].field741[arg2 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        field2894++;
        class68 var8 = new class68(arg6);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class203.method1329(var8, arg5, arg4 + var11, 0, arg3, var9, arg2 + var10, false);
                }
            }
        }
        if (arg1 <= 68) {
            method1043(null, -99, -62, 61, 32, -53, null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static void method1044(boolean arg0) {
        field2906 = null;
        field2897 = null;
        field2900 = null;
        field2911 = null;
        field2888 = null;
        field2899 = null;
        field2889 = null;
        if (!arg0) {
            field2892 = null;
            field2908 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IIII)Lle;")
    private final class104 method1045(int[] arg0, int arg1, int arg2, int arg3) {
        field2891++;
        if (arg2 != 8776) {
            this.field2901 = null;
        }
        int var5 = arg3 ^ (arg1 << 4 & 0xFFF7 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class104 var9 = (class104) this.field2913.method1342(var7, (byte) -20);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class112 var10 = class112.method891(this.field2896, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class104 var11 = var10.method892();
            this.field2913.method1341(-101, var7, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field2176.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZZLeh;)V")
    public static final void method1046(boolean arg0, boolean arg1, class47 arg2) {
        field2903++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class47.field946.method96(arg2, 250);
        int var7 = class47.field946.method110(arg2, 250) * 13;
        class169.method1149(var4 - var3, -var3 + var5, var6 + var3 + var3, var7 - -var3 + var3, 0);
        class169.method1151(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        if (arg1) {
            method1039(125, null, 60, 96, (byte) 48);
        }
        class47.field946.method121(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class27.method249(var5 - var3, -23343, var3 + var6 + var3, var3 + var3 + var7, -var3 + var4);
        if (!arg0) {
            class141.method1017(var6, var7, var5, var4, false);
            return;
        }
        try {
            Graphics var8 = class47.field949.getGraphics();
            class79.field1714.method1095(var8, 0, 0, -1);
        } catch (Exception var9) {
            class47.field949.repaint();
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IZ)Lle;")
    public final class104 method1047(int arg0, int[] arg1, boolean arg2) {
        field2910++;
        if (this.field2896.method71((byte) -68) == 1) {
            return this.method1045(arg1, 0, 8776, arg0);
        } else if (this.field2896.method68(41, arg0) == 1) {
            return this.method1045(arg1, arg0, 8776, 0);
        } else if (arg2) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lah;Lah;)V")
    public class148(class9 arg0, class9 arg1) {
        this.field2896 = arg0;
        this.field2890 = arg1;
    }
}
