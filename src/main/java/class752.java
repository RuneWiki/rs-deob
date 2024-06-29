import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class752 extends class344 {

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "Lpia;")
    private class100 field11069;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "Lnl;")
    private class578 field11075;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "[F")
    private float[] field11085;

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11088 = new String[] { method5461(method5460("S,]F#")), method5461(method5460("S,]O#")), method5461(method5460("Bl],v")), method5461(method5460("\u0018c2PIO2B,;3\r#VBv\fS\"Jk\u0000,rdJ+\u0007kdW\u001d\u001al}X0\u001aceMyyC_m\u0010:@+\u0019+#mx\u0019bS\"+\u0019bS\"6\u00194\u0016p\u007f\\:]rdJ+\u0007kdWyyC_m\u0010:@+\u0019+0mgV7\u0001\"+\u0019bS\"6\u00194\u0016p\u007f\\:]adU-\u00019\u0001x\u0016'PB{bSk_\\:0mdK&S\"+\u0019\u007fStnK6\u0016z%M'\u000badV0\u0017Y;dyyM^m\u0012&V+\u0019-0mgV7\u0001\"+\u0019bS\"6\u00190\u0016q~U6]adU-\u00019\u0001v\u0017'R^mbSm_\\:0mdK&C\"+\u0019\u007fSpnJ7\u001fv%M'\u000badV0\u0017Y;dyyM^m\u0012&V+\u0019-'gsz-\u001cpo\bbS\"6\u00190\u0016q~U6]vnA!\u001cmy]\u0019B_03\r&V[l\u0016S\"d\u007f-\u0014AdV0\u0017\"+\u0019bN\"y\\1\u0006n\u007f\u0017$\u001cehV-\u0001f03\u00122PJtbS\"\u007fP/\u0016\"+\u0019bS\"+\u0019bN\"{K-\u0014pjTl\u001fmhX.(4>dyyRJk\u0003>\"+\u00196\u0006piL.\u0016lh\\bS\"6\u00192\u0001mlK#\u001e,gV!\u0012nP\u000fv.9\u0001i\u0003!CF\u0019bSnb^*\u0007Cf[+\u0016l\u007f\u0019\u007fSryV%\u0001cf\u0017.\u001cajU\u0019E4V\u0002byRJk\u0003>\"+\u00192>c\u007fK+\u000bY?dbS\"6\u00199Sq\u007fX6\u0016,fX6\u0001ks\u00172\u0001ma\\!\u0007kdWb\u000e9\u0001i\u0003!CF\u0019bSo}t#\u0007pbA\u0019G_+\u0019\u007fSy+J6\u0012vn\u0017/\u0012vyP:]od]'\u001ftb\\5S\u007f03\u00122PJtbS\"bO\u000f\u0012vyP:(6V\u0019bN\"p\u00191\u0007c\u007f\\l\u001ec\u007fK+\u000b,\u007f\\:\u0007wy\\\u0019B_+DyyRJk\u0003>\"+\u00196\u0016zFX6\u0001ksbv.\"+\u0004b\b\"xM#\u0007g%T#\u0007pbAl\u0007gsM7\u0001gP\t\u001fS\u007f03\u00122PJtbS\"mw-\u001aqnbtG_+\u0019bN\"p\u00192\u0001mlK#\u001e,gV!\u0012nP\tl]48db\u000e9\u0001m\u0007>R+\u0019bSldP1\u0016.+O+\u0016u[V1_\"|V0\u001ff[V1_\"\u007f\\:0mdK&H\bJ}\u0006!GXjb\u001dmbJ'2foKyyF[\rbS\"}P'\u0004RdJl\u000b.+T4>c\u007fK+\u000bY;dnSk[V1H\bOivS\"+O+\u0016u[V1]{'\u0019/\u0005OjM0\u001azP\b\u001f_\"bi-\u00009\u0001}\u0012G\"+\u00194\u001ag|i-\u0000,q\u0015b\u001etFX6\u0001ksbp..+P\u0012\u001cq03\u0006#6+\u0019b\u0005knN\u0012\u001cq%NnSo}t#\u0007pbA\u0019@_'\u0019+#mx\u0002H>M]\u0019bSmMV%0mdK&]z'\u0019o\u0005knN\u0012\u001cq%CyyF[\rbS\"|V0\u001ff[V1]z'\u0019+\u0005OjM0\u001azP\t\u001f_\"}P'\u0004RdJyyF[\rbS\"|V0\u001ff[V1]{'\u0019+\u0005OjM0\u001azP\b\u001f_\"}P'\u0004RdJyyF[\rbS\"|V0\u001ff[V1]x'\u0019+\u0005OjM0\u001azP\u000b\u001f_\"}P'\u0004RdJyyF[\rbS\"|V0\u001ff[V1]u'\u0019+\u0005OjM0\u001azP\n\u001f_\"}P'\u0004RdJyyCO}bS\"eV+\u0000g%AnSudK.\u0017RdJl\u000b.+N-\u0001noi-\u0000,q\u0002\u0011&@+\u0019b\u001dmbJ']{'\u00195\u001cpg]\u0012\u001cq%CnSudK.\u0017RdJl\u000b9Fl\u000eS\"+W-\u001aqn\u0015b\u001dmbJ'_\";\u0017rC2:\u000bpC5;\nsA703\u0004!A+\u0019b\u001dmbJ'_\"eV+\u0000g03\u000f&N+\u0019b\u001dmbJ'_\"eV+\u0000g'\u0019tG9\u0001x\u0010?\"+\u0019,\u001ckx\\\u0003\u0017fy\u0017:_\"eV+\u0000g%AyyODobS\"eV+\u0000g%AnSdEV+\u0000gPW-\u001aqnx&\u0017p%A\u001f]z03\u0003!N+\u0019b\u001dmbJ'2foKl\u000b.+W-\u001aqn\u0017;H\bFv\u0014S\"+W-\u001aqn\u0017;_\"mw-\u001aqnb,\u001ckx\\\u0003\u0017fy\u0017:.,r\u0002H>WG\u0019bSldP1\u0016.+W-\u001aqn\u0015b\u0007wy[7\u001fgeZ']z03\u0006#6+\u0019b\u0007gsz-\u001cpo\u0017:_\"\u007f\\:>c\u007fK+\u000bY;dnSk_\\:0mdK&H\bOivS\"+M'\u000bAdV0\u0017,r\u0015b\u0007gst#\u0007pbA\u0019B_'\u0019+'gsz-\u001cpo\u0002H2FO\u0019bSm_\\:0mdK&C,s@nSvnA\u0001\u001cmy]nSldP1\u00169\u0001t\r%\"+\u0019-'gsz-\u001cpo\tl\t.+\tyyODobS\"dm'\u000bAdV0\u00172%NnS303\u000f&N+\u0019b\u001cVnA\u0001\u001cmy]s]zr\u0015b\u0007gsz-\u001cpo\u0015bC,:\u000bwH\bFv\u0014S\"+V\u0016\u0016zHV-\u0001f:\u00178\u0004.+M+\u001eg%A:\u000bu03\u000f&N+\u0019b\u001cAdU-\u0006p%A;\t.+P\u0001\u001cndL0_\"gP%\u001bvJT \u001ageMyyODobS\"dz-\u001fm~Kl\u0004.+P\u0001\u001cndL0]u03\u0007=F")), method5461(method5460("W7\u001fn")), method5461(method5460("S,]>bW+\u0007<#")), method5461(method5460("S,]K#")), method5461(method5460("S,]J#")), method5461(method5460("S,]A#")), method5461(method5460("S,]G#")), method5461(method5460("S,]N#")), method5461(method5460("S,]E#")), method5461(method5460("S,]@#")), method5461(method5460("S,]D#")), method5461(method5460("S,]C#")) };

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field11082 = new CRC32();

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field11084 = 0;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Lhl;")
    public static class556 field11087 = new class556(91, 4);

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "F")
    private float field11074;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field11070;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field11071;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field11073;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field11076;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field11077;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field11078;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field11079;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field11080;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field11081;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field11083;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    private int field11086;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Lfga;")
    private class266 field11072;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method834(int arg0, boolean arg1) {
        try {
            ++field11070;
            if (this.field11072 != null) {
                this.field11072.method2307(-1, '\u0000');
                super.field5595.method1432((byte) 3, 1);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field5595.field2426.method4955(318767104), 0);
                OpenGL.glMatrixMode(5888);
                super.field5595.method1432((byte) 3, 0);
                if (super.field5595.field2394 != this.field11086) {
                    int var3 = super.field5595.field2394 % 5000 * 128 / 5000;
                    for (int var4 = 0; ~var4 > -65; ++var4) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field11085, var3);
                        var3 += 2;
                    }
                    if (this.field11069.field1469) {
                        this.field11074 = (float) (super.field5595.field2394 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field11086 = super.field5595.field2394;
                }
                if (arg0 != 16) {
                    this.field11072 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11088[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z", line = 48)
    public static final boolean method5455(int arg0, int arg1) {
        try {
            ++field11080;
            if (arg0 <= 123) {
                field11082 = null;
            }
            return ~arg1 == -2 || arg1 == 3 || ~arg1 == -6;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11088[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)V", line = 61)
    public static void method5456(byte arg0) {
        try {
            if (arg0 == -77) {
                field11082 = null;
                field11087 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11088[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lvf;Lpia;)V", line = 74)
    public class752(class159 arg0, class100 arg1) {
        super(arg0);
        try {
            this.field11069 = arg1;
            if (super.field5595.field2463 && ~super.field5595.field2499 <= -3) {
                this.field11075 = class32.method334(34336, super.field5595, true, field11088[3]);
                if (this.field11075 != null) {
                    int[][] var3 = class432.method3416(0.4F, 124, 256, 4, 3, 4, false, 0, 64);
                    int[][] var4 = class432.method3416(0.4F, 59, 256, 4, 3, 4, false, 8, 64);
                    this.field11085 = new float[32768];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 256; ++var6) {
                        int[] var7 = var3[var6];
                        int[] var8 = var4[var6];
                        for (int var9 = 0; var9 < 64; ++var9) {
                            this.field11085[var5++] = (float) var7[var9] / 4096.0F;
                            this.field11085[var5++] = (float) var8[var9] / 4096.0F;
                        }
                    }
                    this.method5458(true);
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field11088[5] + (arg0 != null ? field11088[2] : field11088[4]) + ',' + (arg1 != null ? field11088[2] : field11088[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 122)
    public final void method833(int arg0) {
        try {
            ++field11078;
            if (this.field11072 != null) {
                this.field11072.method2307(-1, '\u0001');
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497((class224) null, true);
                if (arg0 > 38) {
                    super.field5595.method1432((byte) 3, 0);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11088[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V", line = 141)
    public static final void method5457(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field11083;
            class551 var4 = class380.method3113(-119, (long) arg0, arg2);
            var4.method4086(-67);
            var4.field8073 = arg3;
            var4.field8076 = arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11088[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lgb;II)V", line = 154)
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            ++field11081;
            if (arg2 != 16) {
                this.field11069 = null;
            }
            super.field5595.method1497(arg0, true);
            super.field5595.method1425((byte) 35, arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11088[9] + (arg0 != null ? field11088[2] : field11088[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V", line = 167)
    private final void method5458(boolean arg0) {
        try {
            this.field11072 = new class266(super.field5595, 2);
            ++field11077;
            this.field11072.method2303(0, 8334);
            super.field5595.method1432((byte) 3, 1);
            super.field5595.method1458(7, -16777216);
            super.field5595.method1492(7681, 260, (byte) 17);
            super.field5595.method1427(2, 34166, 770, 0);
            super.field5595.method1432((byte) 3, 0);
            OpenGL.glBindProgramARB(34336, this.field11075.field8319);
            OpenGL.glEnable(34336);
            this.field11072.method2304(false);
            this.field11072.method2303(1, 8334);
            super.field5595.method1432((byte) 3, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!arg0) {
                field11082 = null;
            }
            super.field5595.method1425((byte) 35, 0);
            super.field5595.method1427(2, 5890, 770, 0);
            super.field5595.method1432((byte) 3, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field11072.method2304(false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11088[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V", line = 200)
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            ++field11076;
            if (arg1 != 16) {
                this.method834(-1, true);
            }
            if (this.field11072 != null) {
                super.field5595.method1432((byte) 3, 1);
                if (~(128 & arg0) == -1) {
                    if ((1 & arg2) == 1) {
                        if (this.field11069.field1469) {
                            super.field5595.method1497(this.field11069.field1471, true);
                            OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field11074, 0.0F, 0.0F, 1.0F);
                        } else {
                            int var4 = super.field5595.field2394 % 4000 * 16 / 4000;
                            super.field5595.method1497(this.field11069.field1466[var4], true);
                            OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                        }
                    } else {
                        if (this.field11069.field1469) {
                            super.field5595.method1497(this.field11069.field1471, true);
                        } else {
                            super.field5595.method1497(this.field11069.field1466[0], true);
                        }
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    super.field5595.method1497((class224) null, true);
                }
                super.field5595.method1432((byte) 3, 0);
                if (~(64 & arg0) != -1) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
                } else {
                    class338.field5510[1] = super.field5595.field2476 * super.field5595.field2461;
                    class338.field5510[0] = super.field5595.field2480 * super.field5595.field2461;
                    class338.field5510[2] = super.field5595.field2461 * super.field5595.field2448;
                    OpenGL.glProgramLocalParameter4fvARB(34336, 66, class338.field5510, 0);
                }
                int var5 = 3 & arg0;
                if (var5 == 2) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
                } else if (~var5 == -4) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11088[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BZ)V", line = 278)
    public final void method837(byte arg0, boolean arg1) {
        try {
            ++field11079;
            if (arg0 >= -64) {
                this.method835(-111, 95, 9);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11088[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)Z", line = 299)
    public final boolean method831(boolean arg0) {
        try {
            ++field11073;
            if (arg0) {
                this.field11072 = null;
            }
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11088[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V", line = 310)
    public static final void method5459(byte arg0) {
        try {
            class623.field8996.method3244(22733, class623.field8996.field6397, 1);
            ++field11071;
            class623.field8996.method3244(22733, class623.field8996.field6356, 1);
            class623.field8996.method3244(arg0 + 22825, class623.field8996.field6362, 1);
            class623.field8996.method3244(22733, class623.field8996.field6384, 1);
            class623.field8996.method3244(22733, class623.field8996.field6371, 1);
            class623.field8996.method3244(22733, class623.field8996.field6357, 1);
            class623.field8996.method3244(arg0 ^ -22679, class623.field8996.field6365, 0);
            class623.field8996.method3244(22733, class623.field8996.field6373, 0);
            class623.field8996.method3244(22733, class623.field8996.field6394, 0);
            class623.field8996.method3244(22733, class623.field8996.field6381, 0);
            class623.field8996.method3244(22733, class623.field8996.field6363, 0);
            class623.field8996.method3244(arg0 ^ -22679, class623.field8996.field6400, 0);
            if (arg0 == -92) {
                class623.field8996.method3244(22733, class623.field8996.field6374, 0);
                class623.field8996.method3244(22733, class623.field8996.field6375, 0);
                class623.field8996.method3244(22733, class623.field8996.field6364, 0);
                class623.field8996.method3244(22733, class623.field8996.field6352, 0);
                class623.field8996.method3244(22733, class623.field8996.field6385, 0);
                class623.field8996.method3244(22733, class623.field8996.field6404, 0);
                class623.field8996.method3244(22733, class623.field8996.field6351, 0);
                class214.method1925(2);
                class623.field8996.method3244(22733, class623.field8996.field6383, 2);
                class623.field8996.method3244(22733, class623.field8996.field6388, 2);
                class181.method1710((byte) 41);
                class262.method2282(true);
                class550.field8069 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11088[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5460(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5461(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
