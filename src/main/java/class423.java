import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class423 extends class657 {

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "Lbb;")
    private class351 field6227;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Ljt;")
    private class114 field6225;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "[F")
    private float[] field6233;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field6243 = new String[] { method3270(method3269("x<\u0002\u0007")), method3270(method3269("7h/9O`9_E=\u001c\u0006>?DY\u0007NKLD\u000b1\u001bbe \u001a\u0002bx\u0016\u0007\u0005{w;\u0007\ncbrd*YB\u001b')-6 >\u0004~6iNK-6iNK06?\u000b\u0019ys1@\u001bbe \u001a\u0002bxrd*YB\u001b')-6 -\u0004ay<\u001cK-6iNK06?\u000b\u0019ys1@\bbz&\u001cP\u0007W\u001d:9DTiN\u0002Ys1-\u0004bd-NK-6tN\u001dhd=\u000b\u0013#b,\u0016\bby;\n0=Krd$XB\u0019;?-6&-\u0004ay<\u001cK-6iNK06;\u000b\u0018xz=@\bbz&\u001cP\u0007Y\u001c:;XBiN\u0004Ys1-\u0004bd-^K-6tN\u0019he<\u0002\u001f#b,\u0016\bby;\n0=Krd$XB\u0019;?-6&:\u000euU&\u0001\u0019i'iNK06;\u000b\u0018xz=@\u001fhn*\u0001\u0004\u007fr\u0012_66\u001c\u0006;?]C\u001dNKbP&\t(by;\nK-6iSK\u007fs:\u001b\u0007y8/\u0001\fny&\u001c\u000f6\u001c\u0019/9L[iNKy\u007f$\u000bK-6iNK-6iSK}d&\t\u0019l{g\u0002\u0004nw%5]8Krd;LD\b#K-6=\u001b\u0019oc%\u000b\u0005nsiNK069\u001c\u0004jd(\u0003Eay*\u000f\u0007V }3P\u0007F\b<*@6iN\u0007dq!\u001a*`t \u000b\u0005y6tN\u001b\u007fy.\u001c\n`8%\u0001\blz\u0012X]P-id;LD\b#K-69#\nyd \u001609KiNK062N\u0018yw=\u000bE`w=\u001c\u0002u89\u001c\u0004gs*\u001a\u0002bxi\u0013P\u0007F\b<*@6iN\u0006{[(\u001a\u0019dn\u0012Z6-6tN\u0010-e=\u000f\u001fh8$\u000f\u001f\u007f\u007f1@\u0006br,\u0002\u001dds>N\u00166\u001c\u0019/9L[iNKd`\u0004\u000f\u001f\u007f\u007f15_P6iSKv6:\u001a\nysg\u0003\nyd \u0016Eys1\u001a\u001e\u007fs\u0012_6-krd;LD\b#K-6=\u000b\u0013@w=\u001c\u0002uM}3K-+i\u0015K~b(\u001a\u000e#{(\u001a\u0019dng\u001a\u000eub<\u001c\u000eV&\u0014N\u00166\u001c\u0019/9L[iNKkX&\u0007\u0018hM\u007fZ6-6iSKv69\u001c\u0004jd(\u0003Eay*\u000f\u0007V&g@]>Ki\u0013P\u0007B\f#;-6iN\u0005b\u007f:\u000bG-` \u000b\u001c]y:BKzy;\u0002\u000f]y:BKys1-\u0004bd-UaLR\r<.^Ei\u0000\u0004de,/\u000fidrd/]\"iNK{\u007f,\u0019;beg\u0016G-{?#\nyd \u00160=KeN\u0002]y:UaIF}NK-` \u000b\u001c]y:@\u0012!6$\u0018&lb;\u0007\u0013V'\u0014BKdF&\u001dP\u0007R\u0019ZK-6?\u0007\u000ezF&\u001dEw:i\u0003\u001d@w=\u001c\u0002uM{3G-\u007f\u0019\u0001\u00186\u001c\r>_-6i\u0018\u0002ha\u0019\u0001\u0018#aeN\u0006{[(\u001a\u0019dn\u0012]6!6 >\u0004~-C#$[6iN\u0004Ky.-\u0004bd-@\u0013!6d\u0018\u0002ha\u0019\u0001\u0018#lrd/]\"iNKzy;\u0002\u000f]y:@\u0013!6 \u0018&lb;\u0007\u0013V&\u0014BK{\u007f,\u0019;berd/]\"iNKzy;\u0002\u000f]y:@\u0012!6 \u0018&lb;\u0007\u0013V'\u0014BK{\u007f,\u0019;berd/]\"iNKzy;\u0002\u000f]y:@\u0011!6 \u0018&lb;\u0007\u0013V$\u0014BK{\u007f,\u0019;berd/]\"iNKzy;\u0002\u000f]y:@\u001c!6 \u0018&lb;\u0007\u0013V%\u0014BK{\u007f,\u0019;berd*IRiNKcy \u001d\u000e#neN\u001cbd%\n;beg\u0016G-a&\u001c\u0007iF&\u001dEw-\u001a;)-6i\u0000\u0004de,@\u0012!6>\u0001\u0019ar\u0019\u0001\u0018#leN\u001cbd%\n;beg\u0016P@C\u0005NK-x&\u0007\u0018h:i\u0000\u0004de,BK=8y^[<${^\\=%x\\^6\u001c\u000f<(-6i\u0000\u0004de,BKcy \u001d\u000e6\u001c\u0004;'-6i\u0000\u0004de,BKcy \u001d\u000e!6\u007fZP\u0007W\u001b\"K-6'\u0001\u0002~s\b\n\u000f\u007f81BKcy \u001d\u000e#nrd&B@iNKcy \u001d\u000e#neN\rCy \u001d\u000eVx&\u0007\u0018hW-\n\u0019#n\u0014@\u00136\u001c\b<'-6i\u0000\u0004de,/\u000fidg\u0016G-x&\u0007\u0018h80Ua@Y\u001fNK-x&\u0007\u0018h80BKkX&\u0007\u0018hM'\u0001\u0002~s\b\n\u000f\u007f813Et-C#>A6iN\u0005b\u007f:\u000bG-x&\u0007\u0018h:i\u001a\u001e\u007ft<\u0002\u000ecu,@\u00136\u001c\r>_-6i\u001a\u000euU&\u0001\u0019i81BKys1#\nyd \u00160=KeN\u0002Ys1-\u0004bd-UaIF}NK-b,\u0016(by;\nEt:i\u001a\u000eu[(\u001a\u0019dn\u0012_6!6 :\u000euU&\u0001\u0019i-C//I6iN\u0004Ys1-\u0004bd-^EuoeN\u001fhn\n\u0001\u0004\u007freN\u0005b\u007f:\u000bP\u0007[\u00068K-6&:\u000euU&\u0001\u0019i&g\u0014G-&rd&B@iNKbB,\u0016(by;\n[#aeNZ6\u001c\u0004;'-6i\u0001?hn\n\u0001\u0004\u007frx@\u0013t:i\u001a\u000euU&\u0001\u0019i:i^E<$|Ua@Y\u001fNK-y\u001d\u000b\u0013Ny&\u001c\u000f<83\u0019G-b \u0003\u000e#n1\u0016\u001c6\u001c\u0004;'-6i\u0001(bz&\u001b\u0019#n0\u0014G-\u007f\n\u0001\u0007bc;BKa\u007f.\u0006\u001fL{+\u0007\u000ecbrd&B@iNKbU&\u0002\u0004xdg\u0019G-\u007f\n\u0001\u0007bc;@\u001c6\u001c\f /")), method3270(method3269("mg@Ep")), method3270(method3269("x:@Wdx \u001aU%")), method3270(method3269("x:@#%")), method3270(method3269("x:@!%")), method3270(method3269("x:@-%")), method3270(method3269("x:@(%")), method3270(method3269("x:@/%")), method3270(method3269("x:@,%")), method3270(method3269("~;T\u0007\u007f")), method3270(method3269("x:@\"%")), method3270(method3269("x:@)%")), method3270(method3269("x:@.%")), method3270(method3269("x:@ %")), method3270(method3269("x:@*%")) };

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "[I")
    public static int[] field6231 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "F")
    private float field6226;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "F")
    public static float field6228;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    private int field6240;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "Lbia;")
    private class524 field6239;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
    public final void method3(boolean arg0, int arg1) {
        try {
            ++field6237;
            if (this.field6239 != null) {
                this.field6239.method3971(0, '\u0000');
                super.field9490.method1716(33984, arg1);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field9490.field2885.method5543(-71), 0);
                OpenGL.glMatrixMode(5888);
                super.field9490.method1716(arg1 ^ 33985, 0);
                if (super.field9490.field2853 != this.field6240) {
                    int var3 = super.field9490.field2853 % 5000 * 128 / 5000;
                    for (int var4 = 0; ~var4 > -65; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field6233, var3);
                        var3 += 2;
                    }
                    if (this.field6227.field5415) {
                        this.field6226 = (float) (super.field9490.field2853 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field6240 = super.field9490.field2853;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6243[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lffa;Lbb;)V")
    public class423(class197 arg0, class351 arg1) {
        super(arg0);
        try {
            this.field6227 = arg1;
            if (super.field9490.field2946 && super.field9490.field2935 >= 2) {
                this.field6225 = class171.method1521(field6243[1], (byte) 113, super.field9490, 34336);
                if (this.field6225 != null) {
                    int[][] var3 = class174.method1536(0.4F, 0, 3, false, 4, 12, 256, 4, 64);
                    int[][] var4 = class174.method1536(0.4F, 8, 3, false, 4, 23, 256, 4, 64);
                    int var5 = 0;
                    this.field6233 = new float[32768];
                    for (int var6 = 0; ~var6 > -257; ++var6) {
                        int[] var7 = var3[var6];
                        int[] var8 = var4[var6];
                        for (int var9 = 0; ~var9 > -65; ++var9) {
                            this.field6233[var5++] = (float) var7[var9] / 4096.0F;
                            this.field6233[var5++] = (float) var8[var9] / 4096.0F;
                        }
                    }
                    this.method3268((byte) -128);
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6243[3] + (arg0 != null ? field6243[2] : field6243[0]) + ',' + (arg1 != null ? field6243[2] : field6243[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IJB)Ljava/lang/String;")
    public static final String method3264(int arg0, long arg1, byte arg2) {
        try {
            class693.method5066(arg1, true);
            if (arg2 != 49) {
                return null;
            } else {
                ++field6238;
                int var4 = class555.field8270.get(5);
                int var5 = class555.field8270.get(2);
                int var6 = class555.field8270.get(1);
                return ~arg0 == -4 ? class354.method2902(86, arg0, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class115.field1369[arg0][var5] + "-" + var6;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6243[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V")
    public static final void method3265(byte arg0) {
        try {
            ++field6235;
            if (class2.field14 == null) {
                int var1 = class10.field103;
                int var2 = class554.field8258;
                int var3 = class650.field9404 - class179.field2489 + -var1;
                if (arg0 == -9) {
                    int var4 = -class94.field1062 + class101.field1118 - var2;
                    if (var1 > 0 || ~var3 < -1 || ~var2 < -1 || var4 > 0) {
                        try {
                            Container var5;
                            if (class376.field5730 == null) {
                                if (class629.field9206 == null) {
                                    var5 = class277.field4174;
                                } else {
                                    var5 = class629.field9206;
                                }
                            } else {
                                var5 = class376.field5730;
                            }
                            int var6 = 0;
                            int var7 = 0;
                            if (class376.field5730 == var5) {
                                Insets var8 = class376.field5730.getInsets();
                                var6 = var8.left;
                                var7 = var8.top;
                            }
                            Graphics var9 = var5.getGraphics();
                            var9.setColor(Color.black);
                            if (~var1 < -1) {
                                var9.fillRect(var6, var7, var1, class101.field1118);
                            }
                            if (~var2 < -1) {
                                var9.fillRect(var6, var7, class650.field9404, var2);
                            }
                            if (~var3 < -1) {
                                var9.fillRect(var6 - -class650.field9404 - var3, var7, var3, class101.field1118);
                            }
                            if (var4 > 0) {
                                var9.fillRect(var6, -var4 + class101.field1118 + var7, class650.field9404, var4);
                                return;
                            }
                        } catch (Exception var11) {
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6243[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLmw;)V")
    public final void method4(int arg0, byte arg1, class517 arg2) {
        try {
            super.field9490.method1733(arg2, 17237);
            ++field6242;
            if (arg1 >= 117) {
                super.field9490.method1753(0, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6243[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6243[2] : field6243[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        try {
            ++field6230;
            int var2 = 43 / ((arg0 - -17) / 42);
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6243[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BZ)V")
    public final void method6(byte arg0, boolean arg1) {
        try {
            if (arg0 == 38) {
                ++field6232;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6243[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIZ)V")
    public final void method7(int arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                this.field6226 = -0.742518F;
            }
            ++field6234;
            if (this.field6239 != null) {
                super.field9490.method1716(33984, 1);
                if (~(arg1 & 128) != -1) {
                    super.field9490.method1733((class517) null, 17237);
                } else if ((1 & arg0) == 1) {
                    if (this.field6227.field5415) {
                        super.field9490.method1733(this.field6227.field5421, 17237);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field6226, 0.0F, 0.0F, 1.0F);
                    } else {
                        int var4 = super.field9490.field2853 % 4000 * 16 / 4000;
                        super.field9490.method1733(this.field6227.field5423[var4], 17237);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (this.field6227.field5415) {
                        super.field9490.method1733(this.field6227.field5421, 17237);
                    } else {
                        super.field9490.method1733(this.field6227.field5423[0], 17237);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                super.field9490.method1716(33984, 0);
                if (~(64 & arg1) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    class528.field7671[1] = super.field9490.field2965 * super.field9490.field2936;
                    class528.field7671[2] = super.field9490.field2987 * super.field9490.field2965;
                    class528.field7671[0] = super.field9490.field2965 * super.field9490.field2930;
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class528.field7671, 0);
                }
                int var5 = 3 & arg1;
                if (~var5 == -3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (var5 != 3) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6243[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLub;)Z")
    public static final boolean method3266(int arg0, byte arg1, class22 arg2) {
        try {
            ++field6229;
            int var3 = arg2.method156(-10160, 2);
            if (var3 == 0) {
                if (~arg2.method156(-10160, 1) != -1) {
                    method3266(arg0, (byte) -111, arg2);
                }
                int var4 = arg2.method156(-10160, 6);
                int var5 = arg2.method156(-10160, 6);
                boolean var6 = ~arg2.method156(-10160, 1) == -2;
                if (var6) {
                    class732.field10622[class426.field6270++] = arg0;
                }
                if (class197.field2685[arg0] != null) {
                    throw new RuntimeException(field6243[10]);
                } else {
                    class133 var7 = class176.field2458[arg0];
                    class726 var8 = class197.field2685[arg0] = new class726();
                    var8.field3780 = arg0;
                    if (class216.field3295[arg0] != null) {
                        var8.method5294(7000, class216.field3295[arg0]);
                    }
                    var8.method2103(0, var7.field1554, true);
                    var8.field3842 = var7.field1555;
                    int var9 = var7.field1557;
                    int var10 = var9 >> 28;
                    int var11 = var9 >> 14 & 255;
                    int var12 = var9 & 255;
                    int var13 = (var11 << 6) - (-var4 - -class494.field7101);
                    int var14 = (var12 << 6) + var5 + -class281.field4219;
                    var8.field10512 = var7.field1553;
                    var8.field10494 = var7.field1552;
                    var8.field3857[0] = class459.field6686[arg0];
                    var8.field6200 = var8.field6205 = (byte) var10;
                    if (class231.method1980(1, var14, var13)) {
                        ++var8.field6205;
                    }
                    var8.method5296(var13, (byte) 79, var14);
                    var8.field10516 = false;
                    class176.field2458[arg0] = null;
                    return true;
                }
            } else if (var3 == 1) {
                int var15 = arg2.method156(-10160, 2);
                int var16 = class176.field2458[arg0].field1557;
                class176.field2458[arg0].field1557 = (805306368 & (var16 >> 28) + var15 << 28) + (268435455 & var16);
                return false;
            } else if (var3 == 2) {
                int var17 = arg2.method156(-10160, 5);
                int var18 = var17 >> 3;
                int var19 = 7 & var17;
                int var20 = class176.field2458[arg0].field1557;
                int var21 = (var20 >> 28) - -var18 & 3;
                int var22 = var20 >> 14 & 255;
                int var23 = var20 & 255;
                if (var19 == 0) {
                    --var22;
                    --var23;
                }
                if (var19 == 1) {
                    --var23;
                }
                if (var19 == 2) {
                    ++var22;
                    --var23;
                }
                if (~var19 == -4) {
                    --var22;
                }
                if (~var19 == -5) {
                    ++var22;
                }
                if (~var19 == -6) {
                    --var22;
                    ++var23;
                }
                if (~var19 == -7) {
                    ++var23;
                }
                if (var19 == 7) {
                    ++var23;
                    ++var22;
                }
                class176.field2458[arg0].field1557 = (var21 << 28) + var23 - -(var22 << 14);
                return false;
            } else {
                int var24 = arg2.method156(-10160, 18);
                int var25 = var24 >> 16;
                int var26 = (var24 & 65328) >> 8;
                int var27 = var24 & 255;
                int var28 = class176.field2458[arg0].field1557;
                int var29 = (var28 >> 28) + var25 & 3;
                if (arg1 > -24) {
                    field6231 = null;
                }
                int var30 = (var28 >> 14) + var26 & 255;
                int var31 = var27 + var28 & 255;
                class176.field2458[arg0].field1557 = (var29 << 28) + (var30 << 14) + var31;
                return false;
            }
        } catch (RuntimeException var33) {
            throw class759.method5498(var33, field6243[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6243[2] : field6243[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        try {
            ++field6241;
            if (this.field6239 != null) {
                this.field6239.method3971(arg0, '\u0001');
                super.field9490.method1716(33984, 1);
                super.field9490.method1733((class517) null, 17237);
                super.field9490.method1716(33984, 0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6243[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
    public static void method3267(int arg0) {
        try {
            field6231 = null;
            if (arg0 < 90) {
                field6231 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6243[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    private final void method3268(byte arg0) {
        try {
            this.field6239 = new class524(super.field9490, 2);
            ++field6236;
            this.field6239.method3972(0, (byte) -108);
            super.field9490.method1716(33984, 1);
            super.field9490.method1693(-16777216, 8705);
            super.field9490.method1684((byte) -61, 7681, 260);
            super.field9490.method1683(770, 32888, 34166, 0);
            super.field9490.method1716(33984, 0);
            OpenGL.glBindProgramARB(34336, this.field6225.field1351);
            OpenGL.glEnable(34336);
            this.field6239.method3973(-56);
            this.field6239.method3972(1, (byte) -82);
            super.field9490.method1716(33984, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            if (arg0 < -125) {
                OpenGL.glMatrixMode(5888);
                super.field9490.method1753(0, 0);
                super.field9490.method1683(770, 32888, 5890, 0);
                super.field9490.method1716(33984, 0);
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34336);
                OpenGL.glDisable(34820);
                this.field6239.method3973(-8);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6243[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3269(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3270(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
