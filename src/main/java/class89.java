import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class89 extends class659 {

    @OriginalMember(owner = "client!via", name = "x", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field1240;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field1241;

    @OriginalMember(owner = "client!via", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field1249 = new String[] { method886(method885("Vgmr")), method886(method885("N{`0jQ|hjh\u0010")), method886(method885("C</0+")), method886(method885("N{`0\u0013\u0010")), method886(method885("N{`0\u0014\u0010")), method886(method885("N{`0\u0015\u0010")), method886(method885("N{`0\u0012\u0010")), method886(method885("N{`0\u0017\u0010")), method886(method885("N{`0\u0010\u0010")) };

    @OriginalMember(owner = "client!via", name = "A", descriptor = "[I")
    public static int[] field1243 = new int[8];

    @OriginalMember(owner = "client!via", name = "D", descriptor = "D")
    private double field1239;

    @OriginalMember(owner = "client!via", name = "C", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!via", name = "z", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!via", name = "y", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "Lwp;")
    private class389 field1234;

    @OriginalMember(owner = "client!via", name = "B", descriptor = "Ltfa;")
    private class754 field1238;

    @OriginalMember(owner = "client!via", name = "p", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field1236;

    @OriginalMember(owner = "client!via", name = "E", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field1235;

    @OriginalMember(owner = "client!via", name = "w", descriptor = "[I")
    public static int[] field1245;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "[Ltb;")
    public static class392[] field1242;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V", line = 10)
    public final void method879(byte arg0) {
        try {
            if (this.field1235 != null) {
                this.field1235.method4094();
            }
            ++field1247;
            if (arg0 != 41) {
                this.field1236 = null;
            }
            if (this.field1236 != null) {
                this.field1236.method4094();
            }
            this.field1241.method4094();
            this.field1240.method4094();
            if (this.field1238 != null) {
                this.field1238.method5465(0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1249[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V", line = 33)
    public static void method880(boolean arg0) {
        try {
            if (!arg0) {
                field1245 = null;
                field1243 = null;
                field1242 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1249[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(B)I", line = 48)
    public final int method881(byte arg0) {
        try {
            if (arg0 < 45) {
                field1245 = null;
            }
            ++field1237;
            return this.field1238 != null ? this.field1238.method5470(-48) : 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1249[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)Ltfa;", line = 61)
    public final class754 method882(int arg0) {
        try {
            if (arg0 != 0) {
                return null;
            } else {
                ++field1248;
                return this.field1238;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1249[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)D", line = 76)
    public final double method883(int arg0) {
        try {
            ++field1233;
            if (arg0 != 5455) {
                this.method882(-43);
            }
            double var2 = this.field1239;
            if (this.field1238 != null) {
                var2 = this.field1238.method5471((byte) 17);
                if (var2 < 0.0D) {
                    var2 = this.field1239;
                }
            }
            return (double) (-(256.0F / (float) class215.field3148)) + var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1249[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 100)
    public class89(OggStreamState arg0) {
        super(arg0);
        try {
            this.field1240 = new VorbisInfo();
            this.field1241 = new VorbisComment();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1249[1] + (arg0 != null ? field1249[2] : field1249[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 113)
    public final void method884(int arg0, OggPacket arg1) {
        try {
            ++field1244;
            if (arg0 != -9313) {
                this.method882(115);
            }
            if (~super.field9332 > -4) {
                int var3 = this.field1240.headerIn(this.field1241, arg1);
                if (~var3 > -1) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                if (~super.field9332 == -3) {
                    if (~this.field1240.channels >= -3 && this.field1240.channels >= 1) {
                        this.field1236 = new DSPState(this.field1240);
                        this.field1235 = new VorbisBlock(this.field1236);
                        this.field1234 = new class389(this.field1240.rate, class215.field3148);
                        this.field1238 = new class754(this.field1240.channels);
                        return;
                    }
                    throw new RuntimeException(String.valueOf(this.field1240.channels));
                }
            } else {
                if (this.field1235.synthesis(arg1) == 0) {
                    this.field1236.blockIn(this.field1235);
                }
                float[][] var4 = this.field1236.pcmOut(this.field1240.channels);
                this.field1239 = this.field1236.granuleTime();
                if (this.field1239 == -1.0D) {
                    this.field1239 = (double) ((float) this.field1246 / (float) this.field1240.rate);
                }
                this.field1236.read(var4[0].length);
                this.field1246 += var4[0].length;
                class346 var5 = this.field1238.method5468(this.field1239, (byte) 121, var4[0].length);
                class312.method2489(var4, arg0 ^ 9229, var5.field5035);
                for (int var6 = 0; ~this.field1240.channels < ~var6; ++var6) {
                    var5.field5035[var6] = this.field1234.method3047(0, var5.field5035[var6]);
                }
                this.field1238.method5463(arg0 ^ 9249, var5);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1249[5] + arg0 + ',' + (arg1 != null ? field1249[2] : field1249[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method885(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 86);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!via", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method886(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
