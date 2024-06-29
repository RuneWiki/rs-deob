import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class363 extends class261 {

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Lwv;")
    private class26 field5305;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "Lda;")
    private class44 field5307;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!hv", name = "H", descriptor = "F")
    public float field5324;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "[I")
    private int[] field5320;

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Lbi;")
    private class338 field5303;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "[C")
    public static char[] field5310 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "Ls;")
    public static class186 field5317 = new class186(111, 6);

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "Ls;")
    public static class186 field5302;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "Ler;")
    private class70 field5315;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field5316;

    @OriginalMember(owner = "client!hv", name = "G", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field5323;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BIILph;ZI)V", line = 8)
    public static final void method2222(byte arg0, int arg1, int arg2, class459 arg3, boolean arg4, int arg5) {
        class138.field2322 = arg3;
        class4.field80 = 10000;
        field5309++;
        class309.field4690 = arg4;
        class503.field7350 = arg2;
        class491.field7200 = 1;
        class224.field3507 = arg1;
        class194.field3135 = arg5;
        if (arg0 <= 0) {
            method2222((byte) -100, 4, 114, null, true, 100);
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(II)V", line = 29)
    public final void method2223(int arg0, int arg1) {
        this.field5323.method2646(arg0 * 4 + 3);
        if (arg1 != -29920) {
            this.method2227(-2, -48);
        }
        field5321++;
        this.field5323.method2645(-1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V", line = 42)
    public final void method2224(int arg0, boolean arg1) {
        this.field5323.method2647();
        field5311++;
        if (!arg1) {
            this.field5314 = 92;
        }
        class118 var3 = this.field5307.method400(arg0 * 4, false, this.field5316, 4, 123);
        this.field5315 = new class70(var3, 5121, 4, 0);
        this.field5323 = null;
        this.field5316 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIF)V", line = 60)
    public final void method2225(int arg0, int arg1, int arg2, int arg3, float arg4) {
        field5313++;
        if (arg0 != 16145) {
            this.field5307 = null;
        }
        if (this.field5314 != -1) {
            class486 var6 = this.field5307.field4358.method105(arg0 ^ 0xFFFFC092, this.field5314);
            int var7 = var6.field7139 & 0xFF;
            if (var7 != 0 && var6.field7141 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((arg1 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field7146 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var12 << 8 & 0xFF002A) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = (arg1 & 0xFFCB17) >> 16;
            int var16 = (arg1 & 0xFF00) >> 8;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg1 & 0xFF;
            int var19 = (int) ((float) var16 * arg4);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var19 << 8 | var17 << 16 | var20;
        }
        this.field5323.method2646(arg3 * 4);
        this.field5323.method2645((byte) (arg1 >> 16));
        this.field5323.method2645((byte) (arg1 >> 8));
        this.field5323.method2645((byte) arg1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 172)
    public static void method2226(int arg0) {
        if (arg0 > -126) {
            field5302 = null;
        }
        field5310 = null;
        field5302 = null;
        field5317 = null;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(II)V", line = 187)
    public final void method2227(int arg0, int arg1) {
        field5312++;
        int var3 = -60 / ((56 - arg0) / 63);
        this.field5316 = this.field5307.field809.method2653(arg1 * 4);
        this.field5323 = new NativeStream(this.field5316);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZ)V", line = 200)
    public static final void method2228(byte arg0, boolean arg1) {
        if (arg1) {
            if (class155.field2523 != -1) {
                class406.method2520(class155.field2523, -334);
            }
            for (class141 var2 = (class141) class470.field6975.method1615(0); var2 != null; var2 = (class141) class470.field6975.method1621((byte) -97)) {
                if (!var2.method1677(-1)) {
                    var2 = (class141) class470.field6975.method1615(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class86.method797(false, (byte) -99, var2, true);
            }
            class155.field2523 = -1;
            class470.field6975 = new class249(8);
            class86.method801(18391);
            class155.field2523 = class471.field6989;
            class505.method3033((byte) 125, false);
            class102.method895(0);
            class495.method2984(class155.field2523);
        }
        field5319++;
        class355.field5228 = false;
        class256.field3934 = "";
        class339.field5106 = "";
        class467.method2798(false);
        class271.field4116 = -1;
        class124.method989(class3.field67, (byte) -55);
        class15.field266 = new class366();
        class15.field266.field6073 = class339.field5099 * 128 / 2;
        if (arg0 < 18) {
            method2222((byte) 81, -9, -88, null, false, 38);
        }
        class15.field266.field6078 = class484.field7129 * 128 / 2;
        class15.field266.field7866[0] = class339.field5099 / 2;
        class15.field266.field7870[0] = class484.field7129 / 2;
        class432.field6435 = 0;
        class509.field7427 = 0;
        if (class510.field7435 == 2) {
            class509.field7427 = class268.field4063 << 7;
            class432.field6435 = class239.field3715 << 7;
        } else {
            class78.method699(-65536);
        }
        class237.method1550((byte) -124);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZI)Z", line = 263)
    public static final boolean method2229(int arg0, boolean arg1, int arg2) {
        field5306++;
        if (!arg1) {
            method2222((byte) -82, -34, -56, null, true, -63);
        }
        return class172.method1194((byte) 124, arg0, arg2) | (arg0 & 0x60000) != 0 || class181.method1237(arg0, 0, arg2) || class205.method1397(-26108, arg0, arg2);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([III)V", line = 278)
    public final void method2230(int[] arg0, int arg1, int arg2) {
        field5318++;
        int var4 = 0;
        class364 var5 = this.field5307.field934;
        if (arg2 != 5888) {
            method2226(31);
        }
        var5.field4399 = 0;
        if (this.field5307.field924) {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg0[var6];
                short[] var8 = this.field5305.field395[var7];
                int var9 = this.field5320[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((0x1 << var10++ & var9) == 0) {
                            var11 += 3;
                        } else {
                            var5.method1865(var8[var11++] & 0xFFFF, 812856296);
                            var4++;
                            var4++;
                            var5.method1865(var8[var11++] & 0xFFFF, 812856296);
                            var4++;
                            var5.method1865(var8[var11++] & 0xFFFF, 812856296);
                        }
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var13 = arg0[var12];
                int var14 = this.field5320[var13];
                short[] var15 = this.field5305.field395[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method1852(-114, var15[var17++] & 0xFFFF);
                            var5.method1852(107, var15[var17++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method1852(33, var15[var17++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field5303.method1902(var5.field4408, var5.field4399, -24568, 5123);
        this.field5307.method352(arg2 - 5883, this.field5305.field434, this.field5305.field422, this.field5305.field428, this.field5315);
        this.field5307.method429((this.field5305.field396 & 0x7) != 0, (this.field5305.field396 & 0x8) != 0, this.field5314, (byte) -76);
        if (this.field5307.field895) {
            this.field5307.method375(Integer.MAX_VALUE, this.field5308, this.field5301, this.field5322);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field5324, 1.0F / this.field5324, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field5307.method352(63, this.field5305.field434, this.field5305.field422, this.field5305.field428, this.field5315);
        this.field5307.method370(var4, 4, -120, 0, this.field5303);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBII)V", line = 403)
    public final void method2231(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = -9 / ((arg1 + 2) / 53);
        field5304++;
        this.field5320[this.field5305.field551 * arg3 + arg0] = class418.method2558(this.field5320[this.field5305.field551 * arg3 + arg0], 0x1 << arg2);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lwv;IIIII)V", line = 418)
    public class363(class26 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5305 = arg0;
        this.field5307 = this.field5305.field410;
        this.field5314 = arg1;
        this.field5301 = arg4;
        this.field5324 = arg2;
        this.field5320 = new int[this.field5305.field554 * this.field5305.field551];
        this.field5322 = arg5;
        this.field5308 = arg3;
        this.field5303 = new class338(this.field5307, 5123, null, 1);
    }
}
