import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class686 extends class298 {

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field9953;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field9960;

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field9948;

    @OriginalMember(owner = "client!sv", name = "Y", descriptor = "[Ljava/lang/String;")
    private static final String[] field9971 = new String[] { method5037(method5036("m_b\u000fq")), method5037(method5036("m_b\tq")), method5037(method5036("m_b\u0003q")), method5037(method5036("p\\ '")), method5037(method5036("e\u0007be$")), method5037(method5036("m_b\u0004q")), method5037(method5036("m_bw0p@8uq")), method5037(method5036("m_b\u0006q")), method5037(method5036("m_b\bq")), method5037(method5036("m_b\u000eq")), method5037(method5036("m_b\u0005q")), method5037(method5036("m_b\fq")), method5037(method5036("m_b\nq")), method5037(method5036("m_b\rq")) };

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "D")
    private double field9961;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    private int field9947;

    @OriginalMember(owner = "client!sv", name = "V", descriptor = "I")
    public static int field9949;

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
    public static int field9950;

    @OriginalMember(owner = "client!sv", name = "T", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    private int field9956;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
    public static int field9967;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "J")
    private long field9965;

    @OriginalMember(owner = "client!sv", name = "U", descriptor = "Lfs;")
    private class581 field9966;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field9968;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field9944;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field9963;

    @OriginalMember(owner = "client!sv", name = "X", descriptor = "Z")
    private boolean field9945;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "Z")
    private boolean field9952;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "Z")
    private boolean field9958;

    @OriginalMember(owner = "client!sv", name = "W", descriptor = "Z")
    private boolean field9964;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "[[I")
    public static int[][] field9951;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
    public final void method138(byte arg0) {
        try {
            field9957++;
            if (arg0 != -119) {
                this.method138((byte) 5);
            }
            if (this.field9944 != null) {
                this.field9944.method5403();
            }
            if (this.field9968 != null) {
                this.field9968.method5403();
                this.field9968 = null;
            }
            if (this.field9963 != null) {
                this.field9963.method5403();
                this.field9963 = null;
            }
            this.field9960.method5403();
            this.field9948.method5403();
            this.field9953.method5403();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)Lib;")
    public static final class163 method5027(int arg0) {
        try {
            field9969++;
            class163 var1 = new class163(518);
            class360.field5500 = new int[4];
            class360.field5500[2] = (int) (Math.random() * 9.9999999E7D);
            class360.field5500[3] = (int) (Math.random() * 9.9999999E7D);
            class360.field5500[arg0] = (int) (Math.random() * 9.9999999E7D);
            class360.field5500[1] = (int) (Math.random() * 9.9999999E7D);
            var1.method1428((byte) -24, 10);
            var1.method1412(true, class360.field5500[0]);
            var1.method1412(true, class360.field5500[1]);
            var1.method1412(true, class360.field5500[2]);
            var1.method1412(true, class360.field5500[3]);
            return var1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
    public static void method5028(int arg0) {
        try {
            if (arg0 == 4) {
                field9951 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9971[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)J")
    public final long method5029(byte arg0) {
        try {
            field9954++;
            if (arg0 != 12) {
                this.field9960 = null;
            }
            return this.field9965;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
    public static final boolean method5030(int arg0, int arg1, int arg2) {
        try {
            field9962++;
            if (arg1 == -2) {
                return (arg0 & 0x800) != 0 && (arg2 & 0x37) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9971[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method139(OggPacket arg0, byte arg1) {
        try {
            int var3 = -114 / ((arg1 + 14) / 36);
            field9970++;
            if (this.field9952) {
                this.field9965 = class430.method3299(125);
                int var5 = this.field9968.decodePacketIn(arg0, this.field9963);
                if (var5 < 0) {
                    throw new IllegalStateException(String.valueOf(var5));
                }
                this.field9968.granuleFrame(this.field9963);
                this.field9961 = this.field9968.granuleTime(this.field9963);
                if (this.field9958) {
                    boolean var6 = arg0.isKeyFrame() == 1;
                    if (!var6) {
                        return;
                    }
                    this.field9958 = false;
                }
                if (!this.field9945 || arg0.isKeyFrame() == 1) {
                    if (this.field9968.decodeFrame(this.field9944) != 0) {
                        throw new IllegalStateException(String.valueOf(var5));
                    }
                    this.field9964 = true;
                }
            } else {
                int var4 = this.field9953.decodeHeader(this.field9960, this.field9948, arg0);
                if (var4 == 0) {
                    this.field9952 = true;
                    if (this.field9960.frameWidth > 2048 || this.field9960.frameHeight > 1024) {
                        throw new IllegalStateException();
                    }
                    this.field9968 = new DecoderContext(this.field9960, this.field9953);
                    this.field9963 = new GranulePos();
                    this.field9944 = new Frame(this.field9960.frameWidth, this.field9960.frameHeight);
                    this.field9947 = this.field9968.getMaxPostProcessingLevel();
                    this.method5031(this.field9956, (byte) -117);
                } else if (var4 < 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9971[9] + (arg0 == null ? field9971[3] : field9971[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class686(OggStreamState arg0) {
        super(arg0);
        try {
            this.field9953 = new SetupInfo();
            this.field9960 = new TheoraInfo();
            this.field9948 = new TheoraComment();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[6] + (arg0 == null ? field9971[3] : field9971[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
    private final void method5031(int arg0, byte arg1) {
        try {
            this.field9956 = arg0;
            field9949++;
            if (this.field9952) {
                if (this.field9956 > this.field9947) {
                    this.field9956 = this.field9947;
                }
                if (this.field9956 < 0) {
                    this.field9956 = 0;
                }
                this.field9968.setPostProcessingLevel(this.field9956);
            }
            if (arg1 > -67) {
                this.field9963 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9971[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)Z")
    public final boolean method5032(boolean arg0) {
        try {
            if (arg0) {
                return false;
            } else {
                field9943++;
                return this.field9952;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lha;B)Lfs;")
    public final class581 method5033(class66 arg0, byte arg1) {
        try {
            field9967++;
            if (this.field9944 == null) {
                return null;
            } else if (this.field9964 || this.field9966 == null) {
                this.field9966 = arg0.method560(this.field9944.pixels, 0, this.field9944.field10760, this.field9944.field10760, this.field9944.field10759, false);
                if (arg1 >= -36) {
                    method5030(-61, -15, 84);
                }
                this.field9964 = false;
                return this.field9966;
            } else {
                return this.field9966;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9971[2] + (arg0 == null ? field9971[3] : field9971[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)D")
    public final double method5034(int arg0) {
        try {
            if (arg0 != 99999999) {
                this.method5035(57);
            }
            field9946++;
            return this.field9961;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)F")
    public final float method5035(int arg0) {
        try {
            if (arg0 != -28921) {
                this.field9963 = null;
            }
            field9955++;
            return this.field9952 && !this.field9960.method5402() ? (float) this.field9960.fpsNumerator / (float) this.field9960.fpsDenominator : 0.0F;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9971[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5036(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5037(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
