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

@OriginalClass("client!rda")
public class class378 extends class659 {

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field5525;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field5515;

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field5520;

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field5532 = new String[] { method2995(method2994("xq\u0007?J\"")), method2995(method2994("xq\u0007?N\"")), method2995(method2994("xq\u0007?E\"")), method2995(method2994("xq\u0007?G\"")), method2995(method2994("xq\u0007?A\"")), method2995(method2994("xq\u0007?H\"")), method2995(method2994("d`\n}")), method2995(method2994("q;H?q")), method2995(method2994("xq\u0007?F\"")), method2995(method2994("xq\u0007?O\"")), method2995(method2994("xq\u0007?@\"")), method2995(method2994("xq\u0007?I\"")), method2995(method2994("xq\u0007?M\"")), method2995(method2994("xq\u0007?0c{\u000fe2\"")) };

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "Lmv;")
    public static class125 field5512 = new class125(68, 8);

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "Lsb;")
    public static class261 field5521 = new class261(120, 17);

    @OriginalMember(owner = "client!rda", name = "S", descriptor = "Lfs;")
    public static class796 field5530 = new class796(method2995(method2994("x`\bt\u007fit\u0016t")), method2995(method2994("X`\bt_it\u0016t")), 0);

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "D")
    private double field5504;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "D")
    public static double field5528;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "I")
    private int field5503;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    private int field5519;

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!rda", name = "R", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "J")
    private long field5509;

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "Ltb;")
    private class392 field5516;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "Llga;")
    public static class47 field5529;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field5522;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field5526;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field5508;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "Z")
    private boolean field5510;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "Z")
    private boolean field5513;

    @OriginalMember(owner = "client!rda", name = "T", descriptor = "Z")
    private boolean field5514;

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "Z")
    private boolean field5518;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 3)
    public final void method884(int arg0, OggPacket arg1) {
        try {
            field5506++;
            if (arg0 != -9313) {
                field5528 = 0.7946437905548459D;
            }
            if (this.field5514) {
                this.field5509 = class614.method4531(-51);
                int var3 = this.field5522.decodePacketIn(arg1, this.field5508);
                if (var3 < 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                this.field5522.granuleFrame(this.field5508);
                this.field5504 = this.field5522.granuleTime(this.field5508);
                if (this.field5518) {
                    boolean var4 = arg1.isKeyFrame() == 1;
                    if (!var4) {
                        return;
                    }
                    this.field5518 = false;
                }
                if (!this.field5510 || arg1.isKeyFrame() == 1) {
                    if (this.field5522.decodeFrame(this.field5526) != 0) {
                        throw new IllegalStateException(String.valueOf(var3));
                    }
                    this.field5513 = true;
                }
            } else {
                int var5 = this.field5525.decodeHeader(this.field5515, this.field5520, arg1);
                if (var5 == 0) {
                    this.field5514 = true;
                    if (this.field5515.frameWidth > 2048 || this.field5515.frameHeight > 1024) {
                        throw new IllegalStateException();
                    }
                    this.field5522 = new DecoderContext(this.field5515, this.field5525);
                    this.field5508 = new GranulePos();
                    this.field5526 = new Frame(this.field5515.frameWidth, this.field5515.frameHeight);
                    this.field5503 = this.field5522.getMaxPostProcessingLevel();
                    this.method2991(this.field5519, -20629);
                } else if (var5 < 0) {
                    throw new IllegalStateException(String.valueOf(var5));
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5532[9] + arg0 + ',' + (arg1 == null ? field5532[6] : field5532[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lha;I)Ltb;", line = 78)
    public final class392 method2985(class18 arg0, int arg1) {
        try {
            field5505++;
            if (this.field5526 == null) {
                return null;
            } else if (this.field5513 || this.field5516 == null) {
                this.field5516 = arg0.method180(this.field5526.pixels, 0, this.field5526.field7936, this.field5526.field7936, this.field5526.field7935, false);
                this.field5513 = false;
                return arg1 >= -69 ? null : this.field5516;
            } else {
                return this.field5516;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5532[12] + (arg0 == null ? field5532[6] : field5532[7]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)D", line = 98)
    public final double method2986(byte arg0) {
        try {
            int var2 = -13 / ((-arg0 - 59) / 48);
            field5502++;
            return this.field5504;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5532[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)Z", line = 108)
    public final boolean method2987(int arg0) {
        try {
            field5517++;
            return arg0 == 1024 ? this.field5514 : true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5532[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V", line = 121)
    public static void method2988(boolean arg0) {
        try {
            if (arg0) {
                method2988(false);
            }
            field5512 = null;
            field5530 = null;
            field5529 = null;
            field5521 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5532[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 134)
    public class378(OggStreamState arg0) {
        super(arg0);
        try {
            this.field5525 = new SetupInfo();
            this.field5515 = new TheoraInfo();
            this.field5520 = new TheoraComment();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5532[13] + (arg0 == null ? field5532[6] : field5532[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)J", line = 147)
    public final long method2989(int arg0) {
        try {
            if (arg0 > -92) {
                return -100L;
            } else {
                field5507++;
                return this.field5509;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5532[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V", line = 162)
    public final void method879(byte arg0) {
        try {
            field5523++;
            if (this.field5526 != null) {
                this.field5526.method4094();
            }
            if (arg0 != 41) {
                method2992(false, (byte) 61, null, null);
            }
            if (this.field5522 != null) {
                this.field5522.method4094();
                this.field5522 = null;
            }
            if (this.field5508 != null) {
                this.field5508.method4094();
                this.field5508 = null;
            }
            this.field5515.method4094();
            this.field5520.method4094();
            this.field5525.method4094();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5532[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)Llq;", line = 195)
    public static final class728 method2990(int arg0, byte arg1) {
        try {
            field5531++;
            if (arg1 != 75) {
                field5528 = 0.05548536745888994D;
            }
            return class485.field7119 && class391.field5713 <= arg0 && class631.field8968 >= arg0 ? class336.field4870[arg0 - class391.field5713] : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5532[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)V", line = 224)
    private final void method2991(int arg0, int arg1) {
        try {
            field5511++;
            this.field5519 = arg0;
            if (this.field5514) {
                if (this.field5519 > this.field5503) {
                    this.field5519 = this.field5503;
                }
                if (this.field5519 < 0) {
                    this.field5519 = 0;
                }
                this.field5522.setPostProcessingLevel(this.field5519);
            }
            if (arg1 != -20629) {
                this.field5514 = true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5532[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZBLjava/lang/String;Llga;)Lip;", line = 263)
    public static final class663 method2992(boolean arg0, byte arg1, String arg2, class47 arg3) {
        try {
            field5527++;
            int var4 = arg3.method502(arg2, (byte) -115);
            if (var4 == -1) {
                return new class663(0);
            }
            int[] var5 = arg3.method531(-24705, var4);
            class663 var6 = new class663(var5.length);
            int var7 = 0;
            int var8 = -38 / ((arg1 - 75) / 48);
            int var9 = 0;
            while (true) {
                while (var7 < var6.field9378) {
                    class711 var10 = new class711(arg3.method512(var5[var9++], var4, (byte) -95));
                    int var11 = var10.method5113(18443);
                    int var12 = var10.method5116((byte) -107);
                    int var13 = var10.method5128(0);
                    if (!arg0 && var13 == 1) {
                        var6.field9378--;
                    } else {
                        var6.field9374[var7] = var11;
                        var6.field9377[var7] = var12;
                        var7++;
                    }
                }
                return var6;
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field5532[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5532[6] : field5532[7]) + ',' + (arg3 == null ? field5532[6] : field5532[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)F", line = 308)
    public final float method2993(int arg0) {
        try {
            field5524++;
            if (this.field5514 && !this.field5515.method4093()) {
                return arg0 == 6488 ? (float) this.field5515.fpsNumerator / (float) this.field5515.fpsDenominator : -0.41544008F;
            } else {
                return 0.0F;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5532[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2994(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2995(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
