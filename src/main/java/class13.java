import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 implements class48 {

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "Z")
    private boolean field206 = false;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    private int field216 = 50;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lve;")
    private class266 field182;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lve;")
    private class266 field189;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Lgn;")
    private class5 field222;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Lgn;")
    private class5 field213;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "[B")
    private byte[] field223;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[B")
    private byte[] field192;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "[B")
    private byte[] field188;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "[S")
    private short[] field212;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "[B")
    private byte[] field224;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[Z")
    private boolean[] field191;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[Z")
    private boolean[] field181;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[Z")
    private boolean[] field183;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "[Z")
    private boolean[] field199;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "[Z")
    private boolean[] field210;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "[Lsl;")
    public static class99[] field194 = new class99[50];

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Lna;")
    public static class26 field195 = class69.method505("Titelbild ge-Offnet)3", (byte) -118);

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "Le;")
    public static class159 field221;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
    public static int[] field184;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "[Lmm;")
    public static class256[] field218;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method82(boolean arg0, int arg1) {
        field197++;
        if (!arg0) {
            this.method92((byte) 113, 17);
        }
        for (class275 var3 = (class275) this.field222.method30(0); var3 != null; var3 = (class275) this.field222.method35(-1)) {
            if (var3.field4599) {
                var3.method1947(arg1, (byte) -120);
                var3.field4599 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(IZ)V", line = 39)
    public static final void method83(int arg0, boolean arg1) {
        field214++;
        int var10002;
        for (int var2 = 0; var2 < class81.field1270; var2++) {
            class324 var3 = class185.field2877[class316.field5412[var2]];
            if (var3 != null && var3.method1082((byte) 17) && var3.field5565.field2921 == arg1 && var3.field5565.method1274((byte) 74)) {
                int var4 = var3.method1078((byte) 114);
                if (var4 == 1) {
                    if ((var3.field3962 & 0x7F) == 64 && (var3.field3972 & 0x7F) == 64) {
                        int var11 = var3.field3962 >> 7;
                        int var12 = var3.field3972 >> 7;
                        if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                            var10002 = class139.field2127[var11][var12]++;
                        }
                    }
                } else if (((var4 & 0x1) != 0 || (var3.field3962 & 0x7F) == 0 && (var3.field3972 & 0x7F) == 0) && ((var4 & 0x1) != 1 || (var3.field3962 & 0x7F) == 64 && (var3.field3972 & 0x7F) == 64)) {
                    int var5 = var3.field3962 - (var4 * 64) >> 7;
                    int var6 = var3.field3972 - (var4 * 64) >> 7;
                    int var7 = var3.method1078((byte) 114) + var5;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    int var8 = var6 + var3.method1078((byte) 114);
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            var10002 = class139.field2127[var9][var10]++;
                        }
                    }
                }
            }
        }
        label199: for (int var13 = 0; var13 < class81.field1270; var13++) {
            class324 var14 = class185.field2877[class316.field5412[var13]];
            long var15 = (long) class316.field5412[var13] << 32 | 0x20000000L;
            if (var14 != null && var14.method1082((byte) 17) && var14.field5565.field2921 == arg1 && var14.field5565.method1274((byte) 74)) {
                int var17 = var14.method1078((byte) 114);
                if (var17 == 1) {
                    if ((var14.field3962 & 0x7F) == 64 && (var14.field3972 & 0x7F) == 64) {
                        int var27 = var14.field3962 >> 7;
                        int var28 = var14.field3972 >> 7;
                        if (var27 < 0 || var27 >= 104 || var28 < 0 || var28 >= 104) {
                            continue;
                        }
                        if (class139.field2127[var27][var28] > 1) {
                            var10002 = class139.field2127[var27][var28]--;
                            continue;
                        }
                    }
                } else if ((var17 & 0x1) == 0 && (var14.field3962 & 0x7F) == 0 && (var14.field3972 & 0x7F) == 0 || (var17 & 0x1) == 1 && (var14.field3962 & 0x7F) == 64 && (var14.field3972 & 0x7F) == 64) {
                    int var18 = var14.field3962 - (var17 * 64) >> 7;
                    int var19 = var14.field3972 - (var17 * 64) >> 7;
                    int var20 = var19 + var17;
                    if (var19 < 0) {
                        var19 = 0;
                    }
                    boolean var21 = true;
                    int var22 = var17 + var18;
                    if (var20 > 104) {
                        var20 = 104;
                    }
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    for (int var23 = var18; var23 < var22; var23++) {
                        for (int var24 = var19; var24 < var20; var24++) {
                            if (class139.field2127[var23][var24] <= 1) {
                                var21 = false;
                                break;
                            }
                        }
                    }
                    if (var21) {
                        int var25 = var18;
                        while (true) {
                            if (var25 >= var22) {
                                continue label199;
                            }
                            for (int var26 = var19; var26 < var20; var26++) {
                                var10002 = class139.field2127[var25][var26]--;
                            }
                            var25++;
                        }
                    }
                }
                if (!var14.field5565.field2928) {
                    var15 |= Long.MIN_VALUE;
                }
                var14.field3975 = class17.method118(class279.field4651, 1, var14.field3962, var14.field3972);
                class318.method2207(class279.field4651, var14.field3962, var14.field3972, var14.field3975, var17 * 64 + 60 - 64, var14, var14.field3922, var15, var14.field3951);
            }
        }
        int var29 = -28 / ((arg0 + 7) / 34);
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)[I", line = 252)
    public final int[] method84(int arg0, int arg1) {
        if (arg0 != 64) {
            this.method97(105, -92);
        }
        field219++;
        class275 var3 = this.method87(arg1, 1);
        return var3 == null ? null : var3.method1944(false, this.field206 || this.field181[arg1], this, this.field182);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 276)
    public static void method85(int arg0) {
        field221 = null;
        if (arg0 != -11565) {
            method90(false, (long[]) null, (int[]) null);
        }
        field184 = null;
        field195 = null;
        field218 = null;
        field194 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V", line = 294)
    public final void method86(int arg0, boolean arg1) {
        field204++;
        class281.method1973(0, this.field223[arg0] & 0xFF, this.field224[arg0] & 0xFF);
        if (!arg1) {
            return;
        }
        boolean var3 = false;
        class275 var4 = this.method87(arg0, 1);
        if (var4 != null) {
            var3 = var4.method1943(this.field182, this, 579100487, this.field206 || this.field181[arg0]);
        }
        if (!var3) {
            class27 var5 = this.method93(48, arg0);
            var5.method216((byte) 6);
        }
    }

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "(II)Luh;", line = 325)
    private final class275 method87(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field191 = (boolean[]) null;
        }
        class275 var3 = (class275) this.field222.method28((long) arg0, 1400);
        field208++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field189.method1889(arg0, (byte) -122, 0);
        if (var4 == null) {
            return null;
        } else {
            class82 var5 = new class82(var4);
            class275 var6 = new class275(var5);
            this.field222.method33(var6, (long) arg0, (byte) -118);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)I", line = 359)
    public final int method88(int arg0, boolean arg1) {
        if (arg1) {
            return -63;
        } else {
            field190++;
            return this.field223[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(II)I", line = 370)
    public final int method89(int arg0, int arg1) {
        if (arg1 != 255) {
            method85(-48);
        }
        field203++;
        return this.field224[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z[J[I)V", line = 383)
    public static final void method90(boolean arg0, long[] arg1, int[] arg2) {
        field207++;
        class229.method1542(arg1, 0, arg1.length - 1, arg2, -24337);
        if (!arg0) {
            method85(103);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I", line = 396)
    public final int method91(int arg0, int arg1) {
        field187++;
        int var3 = -81 % ((arg0 - 4) / 55);
        return this.field188[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)Z", line = 408)
    public final boolean method92(byte arg0, int arg1) {
        if (arg0 != 88) {
            this.method98(-99, -37);
        }
        field225++;
        return this.field191[arg1];
    }

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "(II)Lsd;", line = 419)
    private final class27 method93(int arg0, int arg1) {
        field185++;
        int var3 = 111 / ((-arg0 - 15) / 38);
        class27 var4 = (class27) this.field213.method28((long) arg1, 1400);
        if (var4 == null) {
            class27 var5 = new class27(this.field212[arg1] & 0xFFFF);
            this.field213.method33(var5, (long) arg1, (byte) 69);
            return var5;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Z", line = 437)
    public final boolean method94(int arg0, int arg1) {
        if (arg0 < 0) {
            this.method92((byte) 68, -47);
        }
        field186++;
        class275 var3 = this.method87(arg1, 1);
        return var3 == null ? false : var3.method1946(-5, this, this.field182);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(ZI)V", line = 455)
    public final void method95(boolean arg0, int arg1) {
        this.field206 = arg0;
        field215++;
        this.method99(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lve;Lve;Lve;IZ)V", line = 685)
    public class13(class266 arg0, class266 arg1, class266 arg2, int arg3, boolean arg4) {
        this.field182 = arg2;
        this.field206 = arg4;
        this.field216 = arg3;
        this.field189 = arg0;
        this.field222 = new class5(this.field216);
        if (class255.field4184) {
            this.field213 = new class5(this.field216);
        } else {
            this.field213 = null;
        }
        class82 var6 = new class82(arg1.method1889(0, (byte) -122, 0));
        int var7 = var6.method576(1);
        this.field223 = new byte[var7];
        this.field192 = new byte[var7];
        this.field188 = new byte[var7];
        this.field212 = new short[var7];
        this.field224 = new byte[var7];
        this.field191 = new boolean[var7];
        this.field181 = new boolean[var7];
        this.field183 = new boolean[var7];
        this.field199 = new boolean[var7];
        this.field210 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field199[var8] = var6.method642((byte) -69) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field199[var9]) {
                this.field183[var9] = var6.method642((byte) -50) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field199[var10]) {
                this.field191[var10] = var6.method642((byte) -60) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field199[var11]) {
                this.field181[var11] = var6.method642((byte) -23) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field199[var12]) {
                this.field210[var12] = var6.method642((byte) -30) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field199[var13]) {
                this.field188[var13] = var6.method599(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field199[var14]) {
                this.field192[var14] = var6.method599(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field199[var15]) {
                this.field224[var15] = var6.method599(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field199[var16]) {
                this.field223[var16] = var6.method599(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field199[var17]) {
                this.field212[var17] = (short) var6.method576(1);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIB)V", line = 472)
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg4 <= class117.field1840 && arg2 >= class80.field1259) {
            boolean var6;
            if (class225.field3572 > arg1) {
                var6 = false;
                arg1 = class225.field3572;
            } else if (class27.field454 >= arg1) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class27.field454;
            }
            boolean var7;
            if (arg3 < class225.field3572) {
                arg3 = class225.field3572;
                var7 = false;
            } else if (arg3 > class27.field454) {
                arg3 = class27.field454;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class80.field1259 > arg4) {
                arg4 = class80.field1259;
            } else {
                class76.method543(class45.field710[arg4++], arg1, -66, arg3, arg0);
            }
            if (arg2 <= class117.field1840) {
                class76.method543(class45.field710[arg2--], arg1, -54, arg3, arg0);
            } else {
                arg2 = class117.field1840;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg2; var8++) {
                    int[] var9 = class45.field710[var8];
                    var9[arg1] = var9[arg3] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg2; var11++) {
                    class45.field710[var11][arg1] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg2; var10++) {
                    class45.field710[var10][arg3] = arg0;
                }
            }
        }
        if (arg5 == 29) {
            field201++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Z", line = 577)
    public final boolean method97(int arg0, int arg1) {
        field198++;
        if (arg1 != -65) {
            method90(false, (long[]) null, (int[]) null);
        }
        return this.field210[arg0];
    }

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "(II)I", line = 590)
    public final int method98(int arg0, int arg1) {
        field200++;
        int var3 = -115 / ((-arg0 - 12) / 56);
        return this.field192[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 603)
    public final void method99(int arg0) {
        this.field222.method37(2);
        if (arg0 == 0) {
            if (this.field213 != null) {
                this.field213.method37(2);
            }
            field205++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)I", line = 631)
    public final int method100(int arg0, int arg1) {
        field209++;
        if (arg1 != 65535) {
            this.method94(-82, -17);
        }
        return this.field212[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(BI)Z", line = 643)
    public final boolean method101(byte arg0, int arg1) {
        field220++;
        if (arg0 >= -97) {
            return true;
        } else {
            return this.field206 || this.field181[arg1];
        }
    }

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "(II)V", line = 659)
    public final void method102(int arg0, int arg1) {
        if (arg1 != -1) {
            field221 = (class159) null;
        }
        field217++;
        this.field216 = arg0;
        this.field222 = new class5(this.field216);
        if (class255.field4184) {
            this.field213 = new class5(this.field216);
        } else {
            this.field213 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(II)Z", line = 677)
    public final boolean method103(int arg0, int arg1) {
        field202++;
        int var3 = -8 / ((20 - arg1) / 45);
        return this.field183[arg0];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZF)[I", line = 808)
    public final int[] method104(int arg0, boolean arg1, float arg2) {
        field196++;
        class275 var4 = this.method87(arg0, 1);
        if (var4 == null) {
            return null;
        } else {
            var4.field4599 = arg1;
            return var4.method1942(this, 0, arg2, this.field182, this.field206 || this.field181[arg0]);
        }
    }
}
