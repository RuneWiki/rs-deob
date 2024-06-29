import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class47 extends class147 {

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Lna;")
    public static class26 field757 = class69.method505("Poser", (byte) -122);

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lna;")
    public static class26 field737 = class69.method505("Okay", (byte) -117);

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Lha;")
    public static class302 field744 = new class302();

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "Lna;")
    public static class26 field765 = class69.method505("Starte 3D)2Softwarebibliothek)3", (byte) -126);

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Lna;")
    private static class26 field766 = class69.method505("rating: ", (byte) -118);

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "Lna;")
    public static class26 field767 = field766;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Lwh;")
    public class10 field743;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Lkj;")
    public class176 field748;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Lve;")
    public static class266 field769;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Lb;")
    public class60 field746;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "Ljk;")
    public class88 field768;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "[[B")
    public static byte[][] field761;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 13)
    public static final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class285.field4778 * 128) {
            arg0 = class285.field4778 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class303.field5221 * 128) {
            arg2 = class303.field5221 * 128 - 1;
        }
        class177.field2789 = class200.field3104[arg3];
        class299.field5142 = class200.field3115[arg3];
        class126.field1957 = class200.field3104[arg4];
        class72.field1111 = class200.field3115[arg4];
        class50.field794 = arg0;
        class133.field2019 = arg1;
        class18.field255 = arg2;
        class314.field5377 = arg0 / 128;
        class309.field5315 = arg2 / 128;
        class139.field2121 = class314.field5377 - class261.field4272;
        if (class139.field2121 < 0) {
            class139.field2121 = 0;
        }
        class8.field94 = class309.field5315 - class261.field4272;
        if (class8.field94 < 0) {
            class8.field94 = 0;
        }
        class9.field114 = class314.field5377 + class261.field4272;
        if (class9.field114 > class285.field4778) {
            class9.field114 = class285.field4778;
        }
        class136.field2079 = class309.field5315 + class261.field4272;
        if (class136.field2079 > class303.field5221) {
            class136.field2079 = class303.field5221;
        }
        short var15;
        if (class255.field4184) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class261.field4272 + class261.field4272 + 2; var16++) {
            for (int var17 = 0; var17 < class261.field4272 + class261.field4272 + 2; var17++) {
                int var18 = (var16 - class261.field4272 << 7) - (class50.field794 & 0x7F);
                int var19 = (var17 - class261.field4272 << 7) - (class18.field255 & 0x7F);
                int var20 = class314.field5377 + var16 - class261.field4272;
                int var21 = class309.field5315 + var17 - class261.field4272;
                if (var20 >= 0 && var21 >= 0 && var20 < class285.field4778 && var21 < class303.field5221) {
                    int var22;
                    if (class8.field96 == null) {
                        var22 = class258.field4209[0][var20][var21] + 128 - class133.field2019;
                    } else {
                        var22 = class8.field96[0][var20][var21] + 128 - class133.field2019;
                    }
                    int var23 = class258.field4209[3][var20][var21] - class133.field2019 - 1000;
                    class302.field5206[var16][var17] = class228.method1530(var18, var23, var22, var19, var15);
                } else {
                    class302.field5206[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class261.field4272 + class261.field4272 + 1; var24++) {
            for (int var25 = 0; var25 < class261.field4272 + class261.field4272 + 1; var25++) {
                class38.field626[var24][var25] = class302.field5206[var24][var25] || class302.field5206[var24 + 1][var25] || class302.field5206[var24][var25 + 1] || class302.field5206[var24 + 1][var25 + 1];
            }
        }
        class1.field11 = arg6;
        class233.field3693 = arg7;
        class209.field3249 = arg8;
        class196.field3038 = arg9;
        class61.field983 = arg10;
        class149.method1015();
        if (class10.field124 != null) {
            class216.method1446(true);
            class189.method1294(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class255.field4184) {
                class74.field1130 = false;
                class281.method1973(0, 0, 0);
                class289.method2037((float[]) null);
                class226.method1502();
            }
            class216.method1446(false);
        }
        class189.method1294(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 146)
    public static void method355(int arg0) {
        if (arg0 != 186) {
            field757 = (class26) null;
        }
        field766 = null;
        field761 = (byte[][]) null;
        field765 = null;
        field769 = null;
        field767 = null;
        field737 = null;
        field744 = null;
        field757 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)V", line = 167)
    public static final void method356(long arg0, int arg1) {
        field759++;
        if ((long) arg1 != arg0) {
            class114.field1789.method1431(0, 104);
            class114.field1789.method579(arg0, arg1 ^ 0x868E5910);
            class59.field957++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 190)
    public final void method357(int arg0) {
        this.field743 = null;
        this.field748 = null;
        this.field746 = null;
        field742++;
        this.field768 = null;
        if (arg0 != 221) {
            field757 = (class26) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 206)
    public static final void method358(int arg0) {
        field736++;
        if (class156.field2423.toLowerCase().indexOf("microsoft") == -1) {
            if (class156.field2440 == null) {
                class193.field3007[192] = 58;
                class193.field3007[222] = 59;
            } else {
                class193.field3007[222] = 58;
                class193.field3007[192] = 28;
                class193.field3007[520] = 59;
            }
            class193.field3007[45] = 26;
            class193.field3007[61] = 27;
            class193.field3007[91] = 42;
            class193.field3007[59] = 57;
            class193.field3007[93] = 43;
            class193.field3007[44] = 71;
            class193.field3007[92] = 74;
            class193.field3007[46] = 72;
            class193.field3007[47] = 73;
        } else {
            class193.field3007[187] = 27;
            class193.field3007[223] = 28;
            class193.field3007[221] = 43;
            class193.field3007[188] = 71;
            class193.field3007[222] = 59;
            class193.field3007[192] = 58;
            class193.field3007[191] = 73;
            class193.field3007[219] = 42;
            class193.field3007[190] = 72;
            class193.field3007[186] = 57;
            class193.field3007[220] = 74;
            class193.field3007[189] = 26;
        }
        if (arg0 != 74) {
            method354(125, -50, 10, -49, 88, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 57, (byte) -58, 88, -74);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V", line = 256)
    public static final void method359() {
        GL var0 = class255.field4181;
        var0.glDisableClientState(32886);
        class255.method1777(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class255.method1791();
        for (int var1 = 0; var1 < client.field4125[0].length; var1++) {
            class172 var2 = client.field4125[0][var1];
            if (var2.field2686 >= 0 && class200.field3102.method89(var2.field2686, 255) == 4) {
                var0.glColor4fv(class85.method660(var2.field2690, 0), 0);
                float var3 = 201.5F - (var2.field2699 ? 1.0F : 0.5F);
                var2.method1183(class36.field585, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class255.method1786();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class255.method1770();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLwa;)Lta;", line = 296)
    public static final class196 method360(byte arg0, class82 arg1) {
        if (arg0 > -55) {
            return (class196) null;
        } else {
            field762++;
            return new class196(arg1.method626((byte) 93), arg1.method626((byte) 55), arg1.method626((byte) 81), arg1.method626((byte) 95), arg1.method633((byte) 124), arg1.method633((byte) 120), arg1.method642((byte) -103));
        }
    }
}
