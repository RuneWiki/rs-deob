import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class638 extends class320 {

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field9282 = new String[] { method4686(method4685("frN\u00171\"")), method4686(method4685("frN\u00178\"")), method4686(method4685("frN\u00172\"")), method4686(method4685("zv]X\u001dy")), method4686(method4685("q9\u0001\u0017\r")), method4686(method4685("ytJW\u0015^rW")), method4686(method4685("h{@V\u001d^rW")), method4686(method4685("ycJI")), method4686(method4685("hv\\\\$oo")), method4686(method4685("dbCU")), method4686(method4685("frN\u00175\"")), method4686(method4685("frN\u00179\"")), method4686(method4685("frN\u00176\"")), method4686(method4685("frN\u00173\"")), method4686(method4685("frN\u0017<\"")), method4686(method4685("frN\u0017:\"")), method4686(method4685(")rWM\u0015ddFV\u001e*Pcf1XUpM\u0015rcZK\u0015UeJZ\u0004kyHU\u0015*-\u000f\\\u001ekuC\\z\u007fyF_\u001fxz\u000fO\u0015i$\u000fI\u0011xvBJK\u0000bAP\u0016eeB\u0019\u0003kz_U\u0015x%kk\u0015ic\u000fJ\u0013oyJm\u0015r,%Z\u001fdd[\u0019\u0006ot\u001c\u0019\u001c\u007fzlV\u0015l7\u0012\u0019\u0006ot\u001c\u0011@$%\u001e\u000bF&7\u001f\u0017G;\"\u001d\u0015P:9\u001f\u000eB8>\u00143\u0006e~K\u0019\u001dk~A\u0011Y*l%\u0019P*7Y\\\u0013>7LV\u001c**\u000fM\u0015rcZK\u00158S}\\\u0013~?\\Z\u0015dr{\\\b&7HU/^rWz\u001feeKb@W9W@Y1\u001d\u000f\u0019P*pCf6xvHz\u001ffx]\u0019M*t@UZycJIXzv]X\u001dy9W\u0015Pnx[\u0011\u001c\u007fzlV\u0015l;\u000fZ\u001ff9]^\u0012#>\u00143\r\u0000")), method4686(method4685("frN\u00177\"")), method4686(method4685("\u007fyF_\u001fxz\u000fO\u0015i$\u000fI\u0011xvBJK\u0000bAP\u0016eeB\u0019\u0003kz_U\u0015x%k\u0019\u0003irA\\$oo\u00143\u0013ey\\MP|rL\nPfbBz\u001foq\u000f\u0004P|rL\nX:9\u001d\bB<;\u000f\t^=&\u001a\u000b\\*'\u0001\tG8%\u0006\u0002z|xF]PgvFWX#7T3P*7\u000fO\u0015i#\u000fZ\u001ff7\u0012\u0019\u0004oo[L\u0002o%k\u0011\u0003irA\\$oo\u0003\u0019\u0017fH{\\\bIx@K\u0014Q'r\u0017\bs>\u00143P*7\u000f^\u001cUQ]X\u0017IxCV\u0002**\u000fZ\u001ff=\\M\u0015z?_X\u0002kz\\\u0017\b&7KV\u0004\"{ZT3erI\u0015PixC\u0017\u0002mu\u0006\u0010K\u0000j%")), method4686(method4685("\u007fyF_\u001fxz\u000fO\u0015i$\u000fJ\u0004og\u00143\u0005d~IV\u0002g7\\X\u001dz{JKBN7MX\u0003oCJAK\u0000a@P\u0014*zNP\u001e\">\u000fBz\u0003aJZD*q]X\u0017IxC\u0019M*cJA\u0004\u007feJ\u000b4\"uNJ\u0015^rW\u0015Pm{pm\u0015rT@V\u0002nL\u001fd^rn\u0006\u0013@$'\u0016\bC3!\u001d\u000fE1\u001d&_\u0002kplV\u001c*<\u0012\u0019\u0004oo[L\u0002o%k\u0011\u0012kdJm\u0015r;\u000f^\u001cUCJA3ex]]+:J\u0001A\t!?\u0002\b^:=\\M\u0015z9W@Y#=\u001f\u0017@2/\u001a\u0001D9'\u001b\u0002z\u0003q]X\u0017IxC\u0019[77[\\\b~b]\\BN?MX\u0003oCJA\\*pCf$oolV\u001fxst\t-$oV\u0012X*&\u0001\tZycJI^rn\u0006\u0010Z:9\u001f\u0001H?/\u001b\n@>,%0\u0016xvHz\u001ff7\u0004\u0004P~rWM\u0005xr\u001d}Xhv\\\\$oo\u0003\u0019\u0017fH{\\\bIx@K\u0014Q'r\u0017\bs<\u0007\u0014B$'\u0005J\u0004og\u0001A\t#>\u0005\t^:/\u001f\u000fE<.\u001d\u0002z\u0003q]X\u0017IxC\u0019[77[\\\b~b]\\BN?MX\u0003oCJA\\*pCf$oolV\u001fxst\t-$oV\u0012X*%\u0001\tZycJI^rn\u0006\u0010Z:9\u001f\u0001@<\"\u0019\u0000B1\u001d&_\u0002kplV\u001c*<\u0012\u0019\u0004oo[L\u0002o%k\u0011\u0012kdJm\u0015r;\u000f^\u001cUCJA3ex]]+:J\u0001A\t!?\u0002\n^:=\\M\u0015z9W@Y#=\u001f\u0017@</\u0016\u0001I?&\u001a\u0002z\u0003q]X\u0017IxC\u0019[77[\\\b~b]\\BN?MX\u0003oCJA\\*pCf$oolV\u001fxst\t-$oV\u0012X*$\u0001\tZycJI^rn\u0006\u0010Z:9\u001f\u000fH3/\u0016\fA?,%0\u0016xvHz\u001ff7\u0004\u0004P~rWM\u0005xr\u001d}Xhv\\\\$oo\u0003\u0019\u0017fH{\\\bIx@K\u0014Q'r\u0017\bs<\u0007\u0014D$'\u0005J\u0004og\u0001A\t#>\u0005\t^:\"\u001a\rC>!\u001c\u000eK\u0000\u001eIK\u0011mT@UP!*\u000fM\u0015rcZK\u00158S\u0007[\u0011yr{\\\b&7HU/^rWz\u001feeKb@W9W@[\"7\u001b\u0017@ d[\\\u0000$oV\u0010Y '\u0001\tE?#\u001c\rF9 \u00143yleN^3e{\u000f\u0012M*cJA\u0004\u007feJ\u000b4\"uNJ\u0015^rW\u0015Pm{pm\u0015rT@V\u0002nL\u001fd^rn\u0004\u0011]?9\u001f\u0013\u0003~r_\u0017\bs>\u0006\u0013@$'\u001b\bH>#\u001d\u000fK\u0000\u001eIK\u0011mT@UP!*\u000fM\u0015rcZK\u00158S\u0007[\u0011yr{\\\b&7HU/^rWz\u001feeKb@W9W@[\"7\u001a\u0017@ d[\\\u0000$oV\u0010Y '\u0001\tD;/\u001b\rB<,%0\u0016xvHz\u001ff7\u0004\u0004P~rWM\u0005xr\u001d}Xhv\\\\$oo\u0003\u0019\u0017fH{\\\bIx@K\u0014Q'r\u0017\bs<\u0007\u0014F$'\u0005J\u0004og\u0001A\t#>\u0005\t^:%\u0016\u000fG8'\u001d\nK\u0000\u001eIK\u0011mT@UP!*\u000fM\u0015rcZK\u00158S\u0007[\u0011yr{\\\b&7HU/^rWz\u001feeKb@W9W@[\"7\u0019\u0017@ d[\\\u0000$oV\u0010Y '\u0001\tB3!\u0018\u000b@8$\u00143yleN^3e{\u000f\u0012M*cJA\u0004\u007feJ\u000b4\"uNJ\u0015^rW\u0015Pm{pm\u0015rT@V\u0002nL\u001fd^rn\u0004\u0011]=9\u001f\u0013\u0003~r_\u0017\bs>\u0006\u0013@$'\u001e\u0000G<\"\u0017\u000bH1\u001d&_\u0002kplV\u001c*<\u0012\u0019\u0004oo[L\u0002o%k\u0011\u0012kdJm\u0015r;\u000f^\u001cUCJA3ex]]+:J\u0001A\t!?\u000f\u000e^:=\\M\u0015z9W@Y#=\u001f\u0017@;.\u0018\u000fE2%\u0017\u0002z\u0003q]X\u0017IxC\u0019[77[\\\b~b]\\BN?MX\u0003oCJA\\*pCf$oolV\u001fxst\t-$oV\u0012X'/\u0001\tZycJI^rn\u0006\u0010Z:9\u001f\bB9!\u0016\bC3,%0\u0016xvHz\u001ff7\u0004\u0004P~rWM\u0005xr\u001d}Xhv\\\\$oo\u0003\u0019\u0017fH{\\\bIx@K\u0014Q'r\u0017\bs<\u0007\u0019H$'\u0005J\u0004og\u0001A\t#>\u0005\t^:&\u001d\nF3&\u001c\u0000K\u0000\u001eHU/LeN^3e{@KP77IK\u0011mT@UK\u0000j%")), method4686(method4685(")rWM\u0015ddFV\u001e*Pcf1XUpM\u0015rcZK\u0015UeJZ\u0004kyHU\u0015*-\u000f\\\u001ekuC\\z\u007fyF_\u001fxz\u000fO\u0015i$\u000fI\u0011xvBJK\u0000bAP\u0016eeB\u0019\u0006ot\u001c\u0019\u0014cz|Z\u0011fr\u00143\u0005d~IV\u0002g7\\X\u001dz{JKBN7MU\u001fez{\\\b1\u001dZW\u0019lx]TPyvBI\u001coe\u001d}\"ot[\u0019\u0003irA\\$oo\u00143\u0013ey\\MP|rL\nPfbBz\u001foq\u000f\u0004P|rL\nX:9\u001d\bB<;\u000f\t^=&\u001a\u000b\\*'\u0001\tG8%\u0006\u0002z|xF]PgvFWX#7T3y*aJZD*uCV\u001fgT@UP77[\\\b~b]\\BN?MU\u001fez{\\\b&7HU/^rWz\u001feeKbAW9W@Y1\u001d&\u0019\u0006ot\u001b\u0019\u0003irA\\3e{\u000f\u0004P~rWM\u0005xr\u001d}\"ot[\u0011\u0003irA\\$oo\u0003\u0019\u0017fH{\\\bIx@K\u0014Q'r\u0017\bs>\u00143y*qCV\u0011~7_K\u0015FbB\u0019M*'\u0001\u0000I s@MXfbBz\u001foq\u0003\u0019\u0003irA\\3e{\u0001K\u0017h>\u0004\t^:&\u00143P*7\u000f_\u001cev[\u0019\u0000ed[u\u0005g7\u0012\u0019\u0000xrcL\u001d ?\u001e\u0017@!?_K\u0015FbB\u0016\u0000keNT\u0003$n\u0006\u0010_\"g]\\<\u007fz\u0004\b^:>\u00143y*pCf6xvHz\u001ffx]\u0019M*dL\\\u001eoT@UZ\"g@J\u0004FbB\u0016\u0000xrcL\u001d#<MU\u001fezlV\u001c gNK\u0011gd\u0001AK\u0000j%")), method4686(method4685("frN\u0017;\"")), method4686(method4685("frN\u00174\"")) };

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "Lvaa;")
    public static class494 field9279 = new class494(3, 2);

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!lea", name = "S", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    private int field9269;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field9271;

    @OriginalMember(owner = "client!lea", name = "T", descriptor = "I")
    private int field9272;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
    private int field9275;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
    private int field9280;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "Lct;")
    private class156 field9258;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "Lct;")
    private class156 field9267;

    @OriginalMember(owner = "client!lea", name = "V", descriptor = "Lvc;")
    private class335 field9256;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "Lvc;")
    private class335 field9265;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "Lvc;")
    private class335 field9270;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "Lvc;")
    private class335 field9278;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "Lbca;")
    private class689 field9262;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "Lbca;")
    private class689 field9281;

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "Lwca;")
    public static class705 field9268;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "[Lbca;")
    private class689[] field9276;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V", line = 5)
    public final void method2713(int arg0, int arg1) {
        try {
            ++field9264;
            OpenGL.glUseProgramObjectARB(0L);
            super.field5055.method1716(33984, 1);
            if (arg1 < 24) {
                this.field9280 = -23;
            }
            super.field5055.method1733((class517) null, 17237);
            super.field5055.method1716(33984, 0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9282[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)I", line = 21)
    public final int method2709(byte arg0) {
        try {
            ++field9263;
            int var2 = 76 % ((76 - arg0) / 50);
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9282[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "(I)V", line = 34)
    public static void method4680(int arg0) {
        try {
            if (arg0 != 0) {
                method4684(-56, (class163) null);
            }
            field9279 = null;
            field9268 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9282[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lffa;)V", line = 45)
    public class638(class197 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)Z", line = 50)
    public final boolean method2714(byte arg0) {
        try {
            ++field9277;
            if (arg0 >= -30) {
                method4680(29);
            }
            return this.field9267 != null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9282[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V", line = 61)
    public final void method2711(byte arg0) {
        try {
            this.field9281 = null;
            ++field9260;
            this.field9270 = null;
            this.field9258 = null;
            this.field9256 = null;
            this.field9267 = null;
            this.field9262 = null;
            this.field9265 = null;
            this.field9276 = null;
            if (arg0 == -79) {
                this.field9278 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9282[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V", line = 84)
    public final void method2710(int arg0, int arg1, byte arg2) {
        try {
            ++field9266;
            this.field9275 = arg1;
            this.field9272 = arg0;
            int var4 = class554.method4172(this.field9275, 24500);
            int var5 = class554.method4172(this.field9272, 24500);
            if (~this.field9280 != ~var4 || ~this.field9269 != ~var5) {
                if (this.field9276 != null) {
                    for (int var6 = 0; this.field9276.length > var6; ++var6) {
                        this.field9276[var6].method3922(108);
                    }
                    this.field9276 = null;
                }
                if (var4 <= 256 && ~var5 >= -257) {
                    this.field9258 = null;
                } else {
                    int var7 = var4;
                    int var8 = var5;
                    int var9 = 0;
                    if (this.field9258 == null) {
                        this.field9258 = new class156(super.field5055);
                    }
                    label71: while (true) {
                        if (~var7 >= -257 && ~var8 >= -257) {
                            this.field9276 = new class689[var9];
                            int var10 = var4;
                            int var11 = var5;
                            int var12 = 0;
                            while (true) {
                                if (~var10 >= -257 && var11 <= 256) {
                                    break label71;
                                }
                                this.field9276[var12++] = new class689(super.field5055, 3553, 34842, var10, var11);
                                if (var11 > 256) {
                                    var11 >>= 1;
                                }
                                if (~var10 < -257) {
                                    var10 >>= 1;
                                }
                            }
                        }
                        ++var9;
                        if (~var8 < -257) {
                            var8 >>= 1;
                        }
                        if (~var7 < -257) {
                            var7 >>= 1;
                        }
                    }
                }
                this.field9280 = var4;
                this.field9269 = var5;
            }
            if (arg2 >= -29) {
                this.method2711((byte) -67);
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field9282[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)Z", line = 162)
    public final boolean method2708(boolean arg0) {
        try {
            if (arg0) {
                field9279 = null;
            }
            ++field9273;
            if (super.field5055.field2983 && super.field5055.field2937 && super.field5055.field2968) {
                this.field9267 = new class156(super.field5055);
                this.field9262 = new class689(super.field5055, 3553, 34842, 256, 256);
                this.field9262.method5046(false, (byte) -108, false);
                this.field9281 = new class689(super.field5055, 3553, 34842, 256, 256);
                this.field9281.method5046(false, (byte) -128, false);
                super.field5055.method1755(this.field9267, 0);
                this.field9267.method1305(0, 125, this.field9262);
                this.field9267.method1305(1, 127, this.field9281);
                this.field9267.method1303(0, -4356);
                if (!this.field9267.method1309((byte) 37)) {
                    super.field5055.method1746(this.field9267, (byte) 104);
                    return false;
                } else {
                    super.field5055.method1746(this.field9267, (byte) 103);
                    this.field9265 = class586.method4371(super.field5055, (byte) -126, new class414[] { class484.method3687(super.field5055, (byte) 115, 35632, field9282[16]) });
                    this.field9270 = class586.method4371(super.field5055, (byte) -127, new class414[] { class484.method3687(super.field5055, (byte) 92, 35632, field9282[18]) });
                    this.field9256 = class586.method4371(super.field5055, (byte) -124, new class414[] { class484.method3687(super.field5055, (byte) 119, 35632, field9282[20]) });
                    this.field9278 = class586.method4371(super.field5055, (byte) -119, new class414[] { class484.method3687(super.field5055, (byte) -123, 35632, field9282[19]) });
                    return this.field9270 != null && this.field9265 != null && this.field9256 != null && this.field9278 != null;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9282[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "(I)Z", line = 199)
    public final boolean method4681(int arg0) {
        try {
            ++field9257;
            if (arg0 != 16876) {
                return true;
            } else {
                return super.field5055.field2983 && super.field5055.field2937 && super.field5055.field2968;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9282[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILbca;ILbca;)V", line = 212)
    public final void method2706(int arg0, class689 arg1, int arg2, class689 arg3) {
        try {
            ++field9261;
            OpenGL.glPushAttrib(2048);
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            if (this.field9276 == null) {
                super.field5055.method1733(arg1, 17237);
                super.field5055.method1755(this.field9267, 0);
                this.field9267.method1303(0, -4356);
                OpenGL.glViewport(0, 0, 256, 256);
                long var5 = this.field9265.field5237;
                OpenGL.glUseProgramObjectARB(var5);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, field9282[5]), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, field9282[3]), class727.field10544, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f((float) this.field9275, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f((float) this.field9275, (float) this.field9272);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, (float) this.field9272);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            } else {
                super.field5055.method1755(this.field9258, 0);
                int var7 = class554.method4172(this.field9275, 24500);
                int var8 = class554.method4172(this.field9272, 24500);
                int var9 = 0;
                while (~var7 < -257 || var8 > 256) {
                    OpenGL.glViewport(0, 0, var7, var8);
                    this.field9258.method1305(0, arg0 + 126, this.field9276[var9]);
                    if (~var7 < -257) {
                        var7 >>= 1;
                    }
                    if (var9 == 0) {
                        super.field5055.method1733(arg1, arg0 + 17237);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f((float) this.field9275, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f((float) this.field9275, (float) this.field9272);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, (float) this.field9272);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    } else {
                        super.field5055.method1733(this.field9276[var9 + -1], 17237);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(1.0F, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f(1.0F, 1.0F);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    }
                    if (var8 > 256) {
                        var8 >>= 1;
                    }
                    ++var9;
                }
                super.field5055.method1746(this.field9258, (byte) 123);
                super.field5055.method1733(this.field9276[var9 + -1], 17237);
                super.field5055.method1755(this.field9267, arg0);
                this.field9267.method1303(0, arg0 + -4356);
                OpenGL.glViewport(0, 0, 256, 256);
                long var10 = this.field9270.field5237;
                OpenGL.glUseProgramObjectARB(var10);
                OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var10, field9282[5]), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var10, field9282[3]), class727.field10544, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f(1.0F, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f(1.0F, 1.0F);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, 1.0F);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            }
            this.field9267.method1303(1, arg0 + -4356);
            super.field5055.method1733(this.field9262, 17237);
            long var12 = this.field9278.field5237;
            OpenGL.glUseProgramObjectARB(var12);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var12, field9282[8]), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, field9282[7]), 0.00390625F, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            this.field9267.method1303(0, -4356);
            super.field5055.method1733(this.field9281, 17237);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var12, field9282[7]), 0.0F, 0.00390625F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, arg0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            super.field5055.method1746(this.field9267, (byte) 114);
            long var14 = this.field9256.field5237;
            OpenGL.glUseProgramObjectARB(var14);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, field9282[5]), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var14, field9282[6]), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var14, field9282[3]), class104.field1185, class792.field11526, 0.0F);
            super.field5055.method1716(33984, 1);
            super.field5055.method1733(this.field9262, 17237);
            super.field5055.method1716(33984, 0);
            super.field5055.method1733(arg1, 17237);
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field9282[2] + arg0 + ',' + (arg1 != null ? field9282[4] : field9282[9]) + ',' + arg2 + ',' + (arg3 != null ? field9282[4] : field9282[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILjava/lang/String;BII[B)I", line = 369)
    public static final int method4682(int arg0, String arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        try {
            ++field9271;
            int var6 = -arg3 + arg4;
            if (arg2 != -96) {
                method4684(82, (class163) null);
            }
            for (int var7 = 0; var6 > var7; ++var7) {
                char var8 = arg1.charAt(arg3 + var7);
                if (var8 > 0 && var8 < 128 || var8 >= 160 && ~var8 >= -256) {
                    arg5[arg0 + var7] = (byte) var8;
                } else if (~var8 != -8365) {
                    if (var8 != 8218) {
                        if (var8 == 402) {
                            arg5[arg0 + var7] = -125;
                        } else if (~var8 != -8223) {
                            if (~var8 != -8231) {
                                if (var8 != 8224) {
                                    if (~var8 == -8226) {
                                        arg5[arg0 + var7] = -121;
                                    } else if (~var8 != -711) {
                                        if (var8 == 8240) {
                                            arg5[arg0 - -var7] = -119;
                                        } else if (var8 == 352) {
                                            arg5[arg0 - -var7] = -118;
                                        } else if (~var8 == -8250) {
                                            arg5[arg0 + var7] = -117;
                                        } else if (var8 != 338) {
                                            if (~var8 == -382) {
                                                arg5[arg0 + var7] = -114;
                                            } else if (var8 == 8216) {
                                                arg5[arg0 + var7] = -111;
                                            } else if (var8 != 8217) {
                                                if (~var8 != -8221) {
                                                    if (var8 != 8221) {
                                                        if (~var8 == -8227) {
                                                            arg5[arg0 + var7] = -107;
                                                        } else if (var8 == 8211) {
                                                            arg5[arg0 - -var7] = -106;
                                                        } else if (var8 != 8212) {
                                                            if (var8 == 732) {
                                                                arg5[arg0 + var7] = -104;
                                                            } else if (var8 == 8482) {
                                                                arg5[arg0 + var7] = -103;
                                                            } else if (var8 == 353) {
                                                                arg5[arg0 + var7] = -102;
                                                            } else if (var8 == 8250) {
                                                                arg5[arg0 + var7] = -101;
                                                            } else if (var8 == 339) {
                                                                arg5[arg0 + var7] = -100;
                                                            } else if (var8 == 382) {
                                                                arg5[arg0 + var7] = -98;
                                                            } else if (var8 == 376) {
                                                                arg5[arg0 + var7] = -97;
                                                            } else {
                                                                arg5[arg0 + var7] = 63;
                                                            }
                                                        } else {
                                                            arg5[arg0 + var7] = -105;
                                                        }
                                                    } else {
                                                        arg5[arg0 + var7] = -108;
                                                    }
                                                } else {
                                                    arg5[arg0 + var7] = -109;
                                                }
                                            } else {
                                                arg5[arg0 - -var7] = -110;
                                            }
                                        } else {
                                            arg5[arg0 + var7] = -116;
                                        }
                                    } else {
                                        arg5[arg0 + var7] = -120;
                                    }
                                } else {
                                    arg5[arg0 + var7] = -122;
                                }
                            } else {
                                arg5[arg0 + var7] = -123;
                            }
                        } else {
                            arg5[arg0 + var7] = -124;
                        }
                    } else {
                        arg5[arg0 + var7] = -126;
                    }
                } else {
                    arg5[arg0 + var7] = -128;
                }
            }
            return var6;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9282[22] + arg0 + ',' + (arg1 != null ? field9282[4] : field9282[9]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9282[4] : field9282[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILla;IZII)V", line = 509)
    public static final void method4683(int arg0, class476 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            class630.method4666((long) arg2, arg5, arg0, arg2 + -92, arg3, arg1, arg4);
            ++field9259;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9282[13] + arg0 + ',' + (arg1 != null ? field9282[4] : field9282[9]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILib;)V", line = 519)
    public static final void method4684(int arg0, class163 arg1) {
        try {
            if (arg0 < 48) {
                method4682(56, (String) null, (byte) -124, -29, 103, (byte[]) null);
            }
            ++field9274;
            byte[] var2 = new byte[24];
            if (class605.field8870 != null) {
                try {
                    class605.field8870.method3438(0L, (byte) 96);
                    class605.field8870.method3434(-1, var2);
                    int var3;
                    for (var3 = 0; ~var3 > -25 && ~var2[var3] == -1; ++var3) {
                    }
                    if (~var3 <= -25) {
                        throw new IOException();
                    }
                } catch (Exception var6) {
                    for (int var4 = 0; var4 < 24; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg1.method1454(24, 0, var2, (byte) 104);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9282[14] + arg0 + ',' + (arg1 != null ? field9282[4] : field9282[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4685(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 112);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4686(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
