import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class92 {

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    private int field1265 = -1;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "Z")
    public boolean field1272 = true;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Loo;")
    private class628 field1261;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Lij;")
    private class424 field1264;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Lwk;")
    private class145 field1271;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Liaa;")
    private class497 field1262;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "Lkg;")
    public static class275 field1266 = new class275(115, -2);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z")
    public static final boolean method736(int arg0, int arg1, int arg2) {
        field1257++;
        return arg0 > -50 ? true : (class216.method1407(20308, arg1, arg2) | class356.method2068(arg1, (byte) 120, arg2) | class210.method1352(arg1, arg2, (byte) 58)) & class597.method3383(arg2, 7, arg1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZILiaa;)V")
    public final void method737(boolean arg0, int arg1, class497 arg2) {
        if (arg0) {
            method736(-68, 108, -72);
        }
        if (arg1 > 0) {
            this.method742(0);
            this.field1264.method2396(22357, this.field1271);
            this.field1264.method2030(this.field1258, this.field1267 + 1 - this.field1258, class662.field9281, arg2, false, arg1, 0);
        }
        field1259++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public final void method738(int arg0) {
        if (arg0 != 0) {
            this.field1272 = false;
        }
        field1268++;
        this.method737(false, this.field1269, this.field1262);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lqg;Lnd;Z)V")
    public static final void method739(class465 arg0, class547 arg1, boolean arg2) {
        class144.field2035 = "";
        class317.field4110 = arg1;
        class726.field10121 = arg0;
        if (!arg2) {
            field1266 = null;
        }
        field1255++;
        if (class540.field7475.startsWith("win")) {
            class144.field2035 = class144.field2035 + "windows/";
        } else if (class540.field7475.startsWith("linux")) {
            class144.field2035 = class144.field2035 + "linux/";
        } else if (class540.field7475.startsWith("mac")) {
            class144.field2035 = class144.field2035 + "macos/";
        }
        if (class726.field10121.field6235) {
            class144.field2035 = class144.field2035 + "msjava/";
        } else if (class540.field7485.startsWith("amd64") || class540.field7485.startsWith("x86_64")) {
            class144.field2035 = class144.field2035 + "x86_64/";
        } else if (class540.field7485.startsWith("i386") || class540.field7485.startsWith("i486") || class540.field7485.startsWith("i586") || class540.field7485.startsWith("x86")) {
            class144.field2035 = class144.field2035 + "x86/";
        } else if (class540.field7485.startsWith("ppc")) {
            class144.field2035 = class144.field2035 + "ppc/";
        } else {
            class144.field2035 = class144.field2035 + "universal/";
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(JJZZLjava/lang/String;IIIILjava/lang/String;ZIZ)V")
    public static final void method740(long arg0, long arg1, boolean arg2, boolean arg3, String arg4, int arg5, int arg6, int arg7, int arg8, String arg9, boolean arg10, int arg11, boolean arg12) {
        field1260++;
        if (class14.field276 || class159.field2181 >= 500) {
            return;
        }
        int var15 = arg6 == -1 ? class740.field10331 : arg6;
        class277 var16 = new class277(arg9, arg4, var15, arg7, arg5, arg0, arg11, arg8, arg3, arg2, arg1, arg10);
        if (arg12) {
            method741(66);
        }
        class303.method1805((byte) -118, var16);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static void method741(int arg0) {
        field1266 = null;
        if (arg0 != -128) {
            method740(-122L, -52L, false, true, null, 100, -120, 90, -118, null, false, -53, false);
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
    private final void method742(int arg0) {
        field1270++;
        if (!this.field1272) {
            return;
        }
        this.field1272 = false;
        byte[] var2 = this.field1261.field8658;
        int var3 = arg0;
        int var4 = this.field1261.field8650;
        int var5 = this.field1261.field8650 * this.field1256 + this.field1263;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field1271 != null && this.field1265 == var3) {
            this.field1272 = false;
            return;
        }
        this.field1265 = var3;
        int var7 = this.field1256 * var4 + this.field1263;
        int var8 = 0;
        if (!this.field1264.method1985(class522.field7319, (byte) 76, class285.field3589)) {
            if (class712.field9886 == null) {
                class712.field9886 = new int[16384];
            }
            int[] var9 = class712.field9886;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field1261.field8650 - 128;
            }
            if (this.field1271 == null) {
                this.field1271 = this.field1264.method2407(97, false, class712.field9886, 128, 128);
                this.field1271.method813((byte) 80, false, false);
            } else {
                this.field1271.method812(0, 128, 0, 0, class712.field9886, 128, 128, arg0 ^ 0xFFFF9B4A);
            }
            return;
        }
        if (class657.field9154 == null) {
            class657.field9154 = new byte[16384];
        }
        byte[] var13 = class657.field9154;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field1261.field8650 - 128;
        }
        if (this.field1271 == null) {
            this.field1271 = this.field1264.method2376(class657.field9154, class522.field7319, 128, 128, false, -101);
            this.field1271.method813((byte) 57, false, false);
        } else {
            this.field1271.method805(128, class522.field7319, 128, -8981, 0, class657.field9154, 128, 0, 0);
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lij;Loo;Llp;IIIII)V")
    public class92(class424 arg0, class628 arg1, class395 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1256 = arg7;
        this.field1261 = arg1;
        this.field1263 = arg6;
        this.field1264 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3561 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field5019[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field1271 = null;
            this.field1269 = 0;
        } else {
            this.field1267 = Integer.MIN_VALUE;
            this.field1258 = Integer.MAX_VALUE;
            this.field1262 = this.field1264.method1995(false, (byte) -110);
            this.field1262.method1008(var10, 23833);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field1262.method1369(-25053, true);
                if (var15 != null) {
                    Stream var16 = this.field1264.method2409((byte) 87, var15);
                    if (Stream.method3798()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3561 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field5019[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field1258 > var22) {
                                            this.field1258 = var22;
                                        }
                                        if (var22 > this.field1267) {
                                            this.field1267 = var22;
                                        }
                                        var16.method3785(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3561 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field5019[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field1258) {
                                            this.field1258 = var28;
                                        }
                                        if (var28 > this.field1267) {
                                            this.field1267 = var28;
                                        }
                                        var16.method3795(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3793();
                    if (this.field1262.method1368(true)) {
                        break;
                    }
                }
            }
            this.field1269 = var10 / 3;
        }
    }
}
