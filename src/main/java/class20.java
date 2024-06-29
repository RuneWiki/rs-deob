import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 extends class298 {

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field234;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field237;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field241 = new String[] { method142(method141("6GHF")), method142(method141("6GNF")), method142(method141("!G!@\n")), method142(method141("6GMF")), method142(method141("4\u001cc\u0002")), method142(method141("6GLF")), method142(method141("6G3\u0007\u00193\u001d1F")), method142(method141("6GKF")), method142(method141("6GGF")), method142(method141("6GJF")), method142(method141("6GIF")) };

    @OriginalMember(owner = "client!l", name = "G", descriptor = "D")
    private double field238;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Lwu;")
    private class391 field235;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lhf;")
    private class415 field228;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field240;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field231;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
    public static int[] field232;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I", line = 5)
    public final int method133(int arg0) {
        try {
            if (arg0 != 0) {
                this.field234 = null;
            }
            ++field236;
            return this.field228 == null ? 0 : this.field228.method3221(-119);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field241[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V", line = 16)
    public static final void method134(boolean arg0, int arg1) {
        try {
            if (class429.field6309 == 1) {
                class156.field1943 = arg1;
            } else if (class429.field6309 == 2) {
                class684.field9918 = arg1;
            }
            if (arg0) {
                field232 = null;
            }
            ++field229;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field241[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)D", line = 34)
    public final double method135(int arg0) {
        try {
            ++field227;
            if (arg0 != 1067) {
                return 1.3174759989820726D;
            } else {
                double var2 = this.field238;
                if (this.field228 != null) {
                    var2 = this.field228.method3225(-32285);
                    if (var2 < 0.0D) {
                        var2 = this.field238;
                    }
                }
                return (double) (-(256.0F / (float) class598.field8803)) + var2;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field241[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Lhf;", line = 58)
    public final class415 method136(byte arg0) {
        try {
            if (arg0 != -105) {
                method140(40);
            }
            ++field239;
            return this.field228;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field241[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 69)
    public static final String method137(String arg0, int arg1) {
        try {
            ++field225;
            String var2 = class779.method5632(class473.method3590(arg0, 63), 37);
            int var3 = -88 % ((-2 - arg1) / 50);
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field241[3] + (arg0 != null ? field241[2] : field241[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 86)
    public final void method138(byte arg0) {
        try {
            ++field230;
            if (this.field231 != null) {
                this.field231.method5403();
            }
            if (this.field240 != null) {
                this.field240.method5403();
            }
            this.field237.method5403();
            this.field234.method5403();
            if (this.field228 != null) {
                this.field228.method3223((byte) 56);
            }
            if (arg0 != -119) {
                this.method138((byte) 10);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field241[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 116)
    public class20(OggStreamState arg0) {
        super(arg0);
        try {
            this.field234 = new VorbisInfo();
            this.field237 = new VorbisComment();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field241[6] + (arg0 != null ? field241[2] : field241[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 126)
    public final void method139(OggPacket arg0, byte arg1) {
        try {
            ++field233;
            if (super.field4695 < 3) {
                int var3 = this.field234.headerIn(this.field237, arg0);
                if (var3 < 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                if (~super.field4695 == -3) {
                    if (~this.field234.channels < -3 || ~this.field234.channels > -2) {
                        throw new RuntimeException(String.valueOf(this.field234.channels));
                    }
                    this.field240 = new DSPState(this.field234);
                    this.field231 = new VorbisBlock(this.field240);
                    this.field235 = new class391(this.field234.rate, class598.field8803);
                    this.field228 = new class415(this.field234.channels);
                }
            } else {
                if (this.field231.synthesis(arg0) == 0) {
                    this.field240.blockIn(this.field231);
                }
                float[][] var4 = this.field240.pcmOut(this.field234.channels);
                this.field238 = this.field240.granuleTime();
                if (this.field238 == -1.0D) {
                    this.field238 = (double) ((float) this.field226 / (float) this.field234.rate);
                }
                this.field240.read(var4[0].length);
                this.field226 += var4[0].length;
                class120 var5 = this.field228.method3222(this.field238, (byte) -121, var4[0].length);
                class614.method4540(75, var5.field1418, var4);
                for (int var6 = 0; this.field234.channels > var6; ++var6) {
                    var5.field1418[var6] = this.field235.method3108(2, var5.field1418[var6]);
                }
                this.field228.method3216(var5, -101);
            }
            int var7 = -79 % ((-14 - arg1) / 36);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field241[9] + (arg0 != null ? field241[2] : field241[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 191)
    public static void method140(int arg0) {
        try {
            if (arg0 != 3) {
                method134(false, -92);
            }
            field232 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field241[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method141(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 119);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!l", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method142(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
