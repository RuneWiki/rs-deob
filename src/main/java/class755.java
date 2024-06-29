import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class755 extends class423 {

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "Ljagtheora/vorbis/VorbisInfo;")
    private VorbisInfo field11109;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Ljagtheora/vorbis/VorbisComment;")
    private VorbisComment field11098;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field11113 = new String[] { method5469(method5468("\u00013E\u0001V")), method5469(method5468("\u001d*\u0007(")), method5469(method5468("\bqEj\u0003")), method5469(method5468("\u00013E\u0000V")), method5469(method5468("\u00013E\u0005V")), method5469(method5468("\u00013E\u0007V")), method5469(method5468("\u00013E\u0006V")), method5469(method5468("\u00013Ex\u0017\u001d6\u001fzV")), method5469(method5468("\u00013E\u0002V")), method5469(method5468("\u00013E\u0003V")) };

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "Z")
    public static boolean field11100 = false;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Z")
    public static boolean field11106 = false;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public static int field11107 = 1405;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "D")
    private double field11112;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field11095;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    private int field11097;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field11101;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public static int field11102;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field11103;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field11104;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field11110;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field11111;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "Ltl;")
    private class648 field11099;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "Lki;")
    private class739 field11096;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "Ljagtheora/vorbis/DSPState;")
    private DSPState field11108;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Ljagtheora/vorbis/VorbisBlock;")
    private VorbisBlock field11105;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lki;", line = 3)
    public final class739 method5463(int arg0) {
        try {
            if (arg0 > -66) {
                return null;
            } else {
                ++field11102;
                return this.field11096;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11113[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 15)
    public final void method2086(byte arg0, OggPacket arg1) {
        try {
            ++field11101;
            if (~super.field6668 > -4) {
                int var3 = this.field11109.headerIn(this.field11098, arg1);
                if (var3 < 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                if (super.field6668 == 2) {
                    if (this.field11109.channels > 2 || this.field11109.channels < 1) {
                        throw new RuntimeException(String.valueOf(this.field11109.channels));
                    }
                    this.field11108 = new DSPState(this.field11109);
                    this.field11105 = new VorbisBlock(this.field11108);
                    this.field11099 = new class648(this.field11109.rate, class210.field3321);
                    this.field11096 = new class739(this.field11109.channels);
                }
            } else {
                if (this.field11105.synthesis(arg1) == 0) {
                    this.field11108.blockIn(this.field11105);
                }
                float[][] var4 = this.field11108.pcmOut(this.field11109.channels);
                this.field11112 = this.field11108.granuleTime();
                if (this.field11112 == -1.0D) {
                    this.field11112 = (double) ((float) this.field11097 / (float) this.field11109.rate);
                }
                this.field11108.read(var4[0].length);
                this.field11097 += var4[0].length;
                class66 var5 = this.field11096.method5378(true, var4[0].length, this.field11112);
                class467.method3606(var4, 16383, var5.field904);
                for (int var6 = 0; var6 < this.field11109.channels; ++var6) {
                    var5.field904[var6] = this.field11099.method4724(var5.field904[var6], (byte) 21);
                }
                this.field11096.method5373((byte) -91, var5);
            }
            if (arg0 >= -125) {
                this.method5463(-93);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field11113[3] + arg0 + ',' + (arg1 != null ? field11113[2] : field11113[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 86)
    public final void method2090(byte arg0) {
        try {
            if (this.field11105 != null) {
                this.field11105.method5417();
            }
            if (arg0 != 124) {
                this.method2090((byte) -24);
            }
            ++field11095;
            if (this.field11108 != null) {
                this.field11108.method5417();
            }
            this.field11098.method5417();
            this.field11109.method5417();
            if (this.field11096 != null) {
                this.field11096.method5376(true);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11113[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)D", line = 110)
    public final double method5464(byte arg0) {
        try {
            ++field11103;
            if (arg0 > -85) {
                return -2.19667511181696D;
            } else {
                double var2 = this.field11112;
                if (this.field11096 != null) {
                    var2 = this.field11096.method5382(0);
                    if (var2 < 0.0D) {
                        var2 = this.field11112;
                    }
                }
                return (double) (-(256.0F / (float) class210.field3321)) + var2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11113[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I", line = 133)
    public final int method5465(int arg0) {
        try {
            if (arg0 != -17402) {
                return 90;
            } else {
                ++field11111;
                return this.field11096 != null ? this.field11096.method5371(95) : 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11113[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V", line = 151)
    public static final void method5466(byte arg0) {
        try {
            ++field11110;
            class551.field8082.method298(5);
            if (arg0 != -52) {
                field11106 = false;
            }
            class104.field1524.method298(5);
            class303.field4880.method298(5);
            class37.field426.method298(5);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11113[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 167)
    public class755(OggStreamState arg0) {
        super(arg0);
        try {
            this.field11109 = new VorbisInfo();
            this.field11098 = new VorbisComment();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11113[7] + (arg0 != null ? field11113[2] : field11113[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsg;ILha;Lrfa;)V", line = 189)
    public static final void method5467(class420 arg0, int arg1, class63 arg2, class209 arg3) {
        try {
            ++field11104;
            class107 var4 = arg3.method1885(1906146380, arg2);
            if (var4 != null) {
                int var5 = var4.method7();
                if (~var5 > ~var4.method13()) {
                    var5 = var4.method13();
                }
                byte var6 = 10;
                int var7 = arg0.field6633;
                if (arg1 > 23) {
                    int var8 = arg0.field6634;
                    int var9 = 0;
                    int var10 = 0;
                    int var11 = 0;
                    if (arg3.field3282 != null) {
                        var9 = class693.field9978.method507(class504.field7552, arg3.field3282, (class107[]) null, -127, (int[]) null);
                        for (int var12 = 0; ~var9 < ~var12; ++var12) {
                            String var13 = class504.field7552[var12];
                            if (var12 < var9 - 1) {
                                var13 = var13.substring(0, -4 + var13.length());
                            }
                            int var14 = class628.field9045.method1852(var13);
                            if (~var14 < ~var10) {
                                var10 = var14;
                            }
                        }
                        var11 = var9 * class628.field9045.method1851() - -(class628.field9045.method1849() / 2);
                    }
                    int var15 = var5 / 2 + arg0.field6633;
                    if (var7 >= class770.field11273 + var5) {
                        if (var7 > class770.field11274 - var5) {
                            var15 = -(var5 / 2) + class770.field11274 - (var6 - -(var10 / 2)) + -5;
                            var7 = class770.field11274 - var5;
                        }
                    } else {
                        var15 = var5 / 2 + (class770.field11273 - -var6) + var10 / 2 + 5;
                        var7 = class770.field11273;
                    }
                    int var16 = arg0.field6634;
                    if (var8 < class770.field11287 - -var5) {
                        var8 = class770.field11287;
                        var16 = class770.field11287 + var6 - -(var5 / 2);
                    } else if (var8 > -var5 + class770.field11288) {
                        var16 = class770.field11288 - (var5 / 2 - (-var6 + -var11));
                        var8 = -var5 + class770.field11288;
                    }
                    int var17 = (int) (Math.atan2((double) (var7 - arg0.field6633), (double) (-arg0.field6634 + var8)) / 3.141592653589793D * 32767.0D) & 65535;
                    var4.method1004((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
                    int var18 = -2;
                    int var19 = -2;
                    int var20 = -2;
                    int var21 = -2;
                    if (arg3.field3282 != null) {
                        var18 = -(var10 / 2) + var15 + -5;
                        var19 = var16;
                        var20 = var18 + 10 + var10;
                        var21 = 3 + class628.field9045.method1851() * var9 + var16;
                        if (arg3.field3262 != 0) {
                            arg2.method664(var16, arg3.field3262, var20 - var18, var18, -var16 + var21, true);
                        }
                        if (arg3.field3295 != 0) {
                            arg2.method661(var16, arg3.field3295, -var18 + var20, 77, var18, -var16 + var21);
                        }
                        for (int var22 = 0; ~var9 < ~var22; ++var22) {
                            String var23 = class504.field7552[var22];
                            if (~(var9 + -1) < ~var22) {
                                var23 = var23.substring(0, var23.length() - 4);
                            }
                            class628.field9045.method1850(arg2, var23, var15, var16, arg3.field3271, true);
                            var16 += class628.field9045.method1851();
                        }
                    }
                    if (arg3.field3279 != -1 || arg3.field3282 != null) {
                        int var24 = var5 >> 1;
                        class388 var25 = new class388(arg0);
                        var25.field6197 = var7 - var24;
                        var25.field6206 = var19;
                        var25.field6195 = var8 + var24;
                        var25.field6202 = var21;
                        var25.field6198 = var7 + var24;
                        var25.field6194 = var18;
                        var25.field6201 = -var24 + var8;
                        var25.field6205 = var20;
                        class728.field10663.method3220(var25, 0);
                    }
                }
            }
        } catch (RuntimeException var27) {
            throw class590.method4333(var27, field11113[4] + (arg0 != null ? field11113[2] : field11113[1]) + ',' + arg1 + ',' + (arg2 != null ? field11113[2] : field11113[1]) + ',' + (arg3 != null ? field11113[2] : field11113[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5468(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 126);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5469(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
