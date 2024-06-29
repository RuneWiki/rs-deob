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

@OriginalClass("client!gq")
public class class94 extends class434 {

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field1362 = new SetupInfo();

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field1365 = new TheoraInfo();

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field1367 = new TheoraComment();

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "Z")
    public static boolean field1354 = false;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "D")
    private double field1347;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "J")
    private long field1370;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Llc;")
    public static class435 field1353;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "Ltd;")
    private class515 field1368;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field1348;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field1369;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field1360;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Z")
    private boolean field1346;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Z")
    private boolean field1350;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
    private boolean field1352;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "Z")
    private boolean field1363;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V", line = 4)
    private final void method724(int arg0, byte arg1) {
        this.field1364 = arg0;
        if (arg1 > -111) {
            this.field1363 = true;
        }
        field1359++;
        if (!this.field1363) {
            return;
        }
        if (this.field1364 > this.field1358) {
            this.field1364 = this.field1358;
        }
        if (this.field1364 < 0) {
            this.field1364 = 0;
        }
        this.field1348.setPostProcessingLevel(this.field1364);
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)F", line = 28)
    public final float method725(int arg0) {
        field1357++;
        if (this.field1363 && !this.field1365.method674()) {
            if (arg0 != 0) {
                this.field1364 = 19;
            }
            return (float) this.field1365.fpsNumerator / (float) this.field1365.fpsDenominator;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)D", line = 48)
    public final double method726(boolean arg0) {
        if (!arg0) {
            this.method726(false);
        }
        field1349++;
        return this.field1347;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 60)
    public final void method143(OggPacket arg0, boolean arg1) {
        field1371++;
        if (this.field1363) {
            this.field1370 = class465.method2818(255);
            int var4 = this.field1348.decodePacketIn(arg0, this.field1360);
            if (var4 < 0) {
                throw new IllegalStateException(String.valueOf(var4));
            }
            this.field1348.granuleFrame(this.field1360);
            this.field1347 = this.field1348.granuleTime(this.field1360);
            if (this.field1350) {
                boolean var5 = arg0.isKeyFrame() == 1;
                if (!var5) {
                    return;
                }
                this.field1350 = false;
            }
            if (!this.field1352 || arg0.isKeyFrame() == 1) {
                if (this.field1348.decodeFrame(this.field1369) != 0) {
                    throw new IllegalStateException(String.valueOf(var4));
                }
                this.field1346 = true;
            }
        } else {
            int var3 = this.field1362.decodeHeader(this.field1365, this.field1367, arg0);
            if (var3 == 0) {
                this.field1363 = true;
                if (this.field1365.frameWidth > 2048 || this.field1365.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field1348 = new DecoderContext(this.field1365, this.field1362);
                this.field1360 = new GranulePos();
                this.field1369 = new Frame(this.field1365.frameWidth, this.field1365.frameHeight);
                this.field1358 = this.field1348.getMaxPostProcessingLevel();
                this.method724(this.field1364, (byte) -119);
            } else if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
        }
        if (!arg1) {
            method732(81, 36);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 136)
    public class94(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 146)
    public final void method138(int arg0) {
        field1351++;
        if (this.field1369 != null) {
            this.field1369.method675();
        }
        if (arg0 != 0) {
            method732(-15, 121);
        }
        if (this.field1348 != null) {
            this.field1348.method675();
            this.field1348 = null;
        }
        if (this.field1360 != null) {
            this.field1360.method675();
            this.field1360 = null;
        }
        this.field1365.method675();
        this.field1367.method675();
        this.field1362.method675();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)Z", line = 179)
    public static boolean method727(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIIII)I", line = 187)
    public static final int method728(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1361++;
        int var5 = arg3 & 0xF;
        if (arg0 >= -12) {
            return 118;
        } else {
            int var6 = var5 >= 8 ? arg4 : arg2;
            int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg2 : arg1);
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V", line = 210)
    public static void method729(int arg0) {
        field1353 = null;
        if (arg0 != 2) {
            method732(60, 95);
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z", line = 227)
    public final boolean method730(byte arg0) {
        field1355++;
        return arg0 == 54 ? this.field1363 : false;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)J", line = 243)
    public final long method731(byte arg0) {
        if (arg0 != -17) {
            method732(-27, -122);
        }
        field1366++;
        return this.field1370;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I", line = 254)
    public static final int method732(int arg0, int arg1) {
        return class167.field2372 == null ? 0 : class167.field2372[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lha;I)Ltd;", line = 260)
    public final class515 method733(class543 arg0, int arg1) {
        field1356++;
        if (this.field1369 == null) {
            return null;
        } else if (this.field1346 || this.field1368 == null) {
            this.field1368 = arg0.method339(this.field1369.pixels, 0, this.field1369.field1240, this.field1369.field1240, this.field1369.field1241, false);
            if (arg1 != 8) {
                this.field1346 = false;
            }
            this.field1346 = false;
            return this.field1368;
        } else {
            return this.field1368;
        }
    }
}
