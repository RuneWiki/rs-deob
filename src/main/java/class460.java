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

@OriginalClass("client!io")
public class class460 extends class728 {

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field6438 = new SetupInfo();

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field6427 = new TheoraInfo();

    @OriginalMember(owner = "client!io", name = "w", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field6431 = new TheoraComment();

    @OriginalMember(owner = "client!io", name = "A", descriptor = "D")
    private double field6435;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    private int field6441;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!io", name = "Q", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "J")
    private long field6447;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "Ljd;")
    private class241 field6436;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "Lie;")
    public static class6 field6446;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field6450;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field6433;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field6442;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Z")
    private boolean field6428;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "Z")
    private boolean field6432;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "Z")
    private boolean field6445;

    @OriginalMember(owner = "client!io", name = "R", descriptor = "Z")
    private boolean field6452;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V", line = 7)
    public static void method2732(byte arg0) {
        if (arg0 <= -39) {
            field6446 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lha;B)Ljd;", line = 17)
    public final class241 method2733(class65 arg0, byte arg1) {
        int var3 = -22 % ((arg1 - 14) / 50);
        field6449++;
        if (this.field6433 == null) {
            return null;
        } else if (this.field6445 || this.field6436 == null) {
            this.field6436 = arg0.method536(this.field6433.pixels, 0, this.field6433.field10281, this.field6433.field10281, this.field6433.field10282, false);
            this.field6445 = false;
            return this.field6436;
        } else {
            return this.field6436;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIBLmb;ZI[IIIII[II)I", line = 42)
    public static final int method2734(int arg0, int arg1, int arg2, int arg3, byte arg4, class274 arg5, boolean arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        field6437++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class228.field3495[var15][var35] = 0;
                class673.field9380[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg7 == 1) {
            var16 = class306.method1982(arg11, arg3, arg1, -66, arg2, arg5, arg9, arg10, arg12, arg14, arg0);
        } else if (arg7 == 2) {
            var16 = class375.method2324(arg14, arg12, arg11, arg3, arg5, arg4 - 54, arg1, arg2, arg9, arg0, arg10);
        } else {
            var16 = class377.method2340(arg0, arg9, arg12, arg7, -1362, arg2, arg10, arg1, arg3, arg14, arg5, arg11);
        }
        int var17 = arg9 - 64;
        int var18 = arg12 - 64;
        if (arg4 != 55) {
            method2735(false, null, (byte) 123);
        }
        int var19 = class666.field9268;
        int var20 = class506.field7193;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= arg3 + var23; var24++) {
                for (int var25 = arg14 - var23; var25 <= (arg14 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class673.field9380[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg3) {
                            var28 = arg3 - var24;
                        } else if (var24 > (arg3 + arg11 - 1)) {
                            var28 = var24 + 1 - arg3 - arg11;
                        }
                        int var29 = 0;
                        if (arg14 > var25) {
                            var29 = arg14 - var25;
                        } else if ((arg14 + arg1 - 1) < var25) {
                            var29 = var25 - (arg1 - 1) - arg14;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class673.field9380[var26][var27] < var22) {
                            var21 = var30;
                            var22 = class673.field9380[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg9 == var19 && arg12 == var20) {
            return 0;
        }
        byte var31 = 0;
        class753.field10404[var31] = var19;
        int var37 = var31 + 1;
        class511.field7231[var31] = var20;
        int var32;
        int var33 = var32 = class228.field3495[var19 - var17][var20 - var18];
        while (arg9 != var19 || arg12 != var20) {
            if (var32 != var33) {
                class753.field10404[var37] = var19;
                var32 = var33;
                class511.field7231[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class228.field3495[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg8[var34] = class753.field10404[var37];
            arg13[var34++] = class511.field7231[var37];
            if (arg8.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLjc;B)V", line = 216)
    public static final void method2735(boolean arg0, class462 arg1, byte arg2) {
        field6430++;
        int var3 = -62 / ((32 - arg2) / 49);
        class16.field299.method2190(0, arg1);
        if (arg0) {
            class485.method2894(class36.field474, arg1, class486.field6846, class602.field8436, class16.field299, 12096);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 230)
    public class460(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)D", line = 242)
    public final double method2736(int arg0) {
        if (arg0 < 122) {
            this.method2739(-69);
        }
        field6448++;
        return this.field6435;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V", line = 257)
    private final void method2737(byte arg0, int arg1) {
        if (arg0 != 3) {
            this.field6452 = false;
        }
        this.field6441 = arg1;
        field6429++;
        if (!this.field6452) {
            return;
        }
        if (this.field6441 > this.field6443) {
            this.field6441 = this.field6443;
        }
        if (this.field6441 < 0) {
            this.field6441 = 0;
        }
        this.field6450.setPostProcessingLevel(this.field6441);
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(B)F", line = 282)
    public final float method2738(byte arg0) {
        field6444++;
        if (arg0 <= 119) {
            this.field6442 = null;
        }
        return this.field6452 && !this.field6427.method4128() ? (float) this.field6427.fpsNumerator / (float) this.field6427.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 296)
    public final void method1416(int arg0) {
        if (this.field6433 != null) {
            this.field6433.method4129();
        }
        field6439++;
        if (this.field6450 != null) {
            this.field6450.method4129();
            this.field6450 = null;
        }
        if (this.field6442 != null) {
            this.field6442.method4129();
            this.field6442 = null;
        }
        this.field6427.method4129();
        this.field6431.method4129();
        this.field6438.method4129();
        if (arg0 != -12054) {
            this.method2741(34);
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)J", line = 326)
    public final long method2739(int arg0) {
        if (arg0 != 0) {
            this.field6445 = false;
        }
        field6426++;
        return this.field6447;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)Z", line = 339)
    public static final boolean method2740(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        }
        field6434++;
        if (arg1 == 25 || arg1 == 44 || arg1 == 10 || arg1 == 16 || arg1 == 58) {
            return true;
        } else {
            return arg1 == 45 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Z", line = 357)
    public final boolean method2741(int arg0) {
        if (arg0 <= 109) {
            return false;
        } else {
            field6440++;
            return this.field6452;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 378)
    public final void method1417(OggPacket arg0, int arg1) {
        field6451++;
        if (this.field6452) {
            this.field6447 = class459.method2731(103);
            int var4 = this.field6450.decodePacketIn(arg0, this.field6442);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field6450.granuleFrame(this.field6442);
            this.field6435 = this.field6450.granuleTime(this.field6442);
            if (this.field6432) {
                boolean var5 = arg0.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field6432 = false;
            }
            if (!this.field6428 || arg0.isKeyFrame() == 1) {
                if (this.field6450.decodeFrame(this.field6433) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field6445 = true;
            }
        } else {
            int var3 = this.field6438.decodeHeader(this.field6427, this.field6431, arg0);
            if (var3 == 0) {
                this.field6452 = true;
                if (this.field6427.frameWidth > 2048 || this.field6427.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field6450 = new DecoderContext(this.field6427, this.field6438);
                this.field6442 = new GranulePos();
                this.field6433 = new Frame(this.field6427.frameWidth, this.field6427.frameHeight);
                this.field6443 = this.field6450.getMaxPostProcessingLevel();
                this.method2737((byte) 3, this.field6441);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        int var6 = 11 / ((arg1 - 34) / 54);
    }
}
