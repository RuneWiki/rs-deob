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

@OriginalClass("client!naa")
public class class72 extends class734 {

    @OriginalMember(owner = "client!naa", name = "Z", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field1326 = new SetupInfo();

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field1298 = new TheoraInfo();

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field1301 = new TheoraComment();

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "Lsia;")
    public static class732 field1302 = new class732();

    @OriginalMember(owner = "client!naa", name = "Y", descriptor = "Lej;")
    public static class124 field1325 = new class124(30, 4);

    @OriginalMember(owner = "client!naa", name = "cb", descriptor = "Z")
    public static boolean field1329 = false;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "D")
    private double field1306;

    @OriginalMember(owner = "client!naa", name = "M", descriptor = "D")
    public static double field1314;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!naa", name = "K", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!naa", name = "L", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!naa", name = "O", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!naa", name = "P", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!naa", name = "Q", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!naa", name = "U", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!naa", name = "bb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!naa", name = "db", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "J")
    private long field1309;

    @OriginalMember(owner = "client!naa", name = "ab", descriptor = "Lqga;")
    public static class186 field1327;

    @OriginalMember(owner = "client!naa", name = "V", descriptor = "Lon;")
    public static class337 field1322;

    @OriginalMember(owner = "client!naa", name = "T", descriptor = "Lku;")
    public static class377 field1320;

    @OriginalMember(owner = "client!naa", name = "J", descriptor = "Lmi;")
    private class496 field1311;

    @OriginalMember(owner = "client!naa", name = "X", descriptor = "Lin;")
    public static class91 field1324;

    @OriginalMember(owner = "client!naa", name = "W", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field1323;

    @OriginalMember(owner = "client!naa", name = "N", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field1315;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field1310;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "Z")
    private boolean field1299;

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "Z")
    private boolean field1305;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "Z")
    private boolean field1307;

    @OriginalMember(owner = "client!naa", name = "R", descriptor = "Z")
    private boolean field1319;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V", line = 5)
    public static void method687(int arg0) {
        field1325 = null;
        if (arg0 != 1) {
            field1302 = null;
        }
        field1324 = null;
        field1302 = null;
        field1320 = null;
        field1322 = null;
        field1327 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lha;I)Lmi;", line = 21)
    public final class496 method688(class59 arg0, int arg1) {
        field1317++;
        if (this.field1315 == null) {
            return null;
        } else if (this.field1305 || this.field1311 == null) {
            this.field1311 = arg0.method281(this.field1315.pixels, arg1, this.field1315.field9639, this.field1315.field9639, this.field1315.field9640, false);
            this.field1305 = false;
            return this.field1311;
        } else {
            return this.field1311;
        }
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 41)
    public class72(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V", line = 55)
    public final void method689(byte arg0) {
        if (this.field1315 != null) {
            this.field1315.method3950();
        }
        field1312++;
        if (this.field1323 != null) {
            this.field1323.method3950();
            this.field1323 = null;
        }
        if (arg0 != 13) {
            this.method693(115);
        }
        if (this.field1310 != null) {
            this.field1310.method3950();
            this.field1310 = null;
        }
        this.field1298.method3950();
        this.field1301.method3950();
        this.field1326.method3950();
    }

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "(I)Z", line = 88)
    public final boolean method690(int arg0) {
        field1303++;
        if (arg0 != -1) {
            this.field1298 = null;
        }
        return this.field1307;
    }

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "(I)F", line = 108)
    public final float method691(int arg0) {
        field1313++;
        if (this.field1307 && !this.field1298.method3951()) {
            if (arg0 != 0) {
                this.field1318 = -65;
            }
            return (float) this.field1298.fpsNumerator / (float) this.field1298.fpsDenominator;
        } else {
            return 0.0F;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)V", line = 127)
    private final void method692(int arg0, byte arg1) {
        field1321++;
        this.field1300 = arg0;
        if (this.field1307) {
            if (this.field1300 > this.field1318) {
                this.field1300 = this.field1318;
            }
            if (this.field1300 < 0) {
                this.field1300 = 0;
            }
            this.field1323.setPostProcessingLevel(this.field1300);
        }
        if (arg1 > -127) {
            this.field1311 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "(I)J", line = 151)
    public final long method693(int arg0) {
        field1316++;
        if (arg0 != 30) {
            this.method692(-126, (byte) -43);
        }
        return this.field1309;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)D", line = 168)
    public final double method694(byte arg0) {
        field1304++;
        if (arg0 != 100) {
            method687(102);
        }
        return this.field1306;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 184)
    public final void method695(byte arg0, OggPacket arg1) {
        field1308++;
        if (arg0 >= -91) {
            return;
        }
        if (!this.field1307) {
            int var5 = this.field1326.decodeHeader(this.field1298, this.field1301, arg1);
            if (var5 == 0) {
                this.field1307 = true;
                if (this.field1298.frameWidth > 2048 || this.field1298.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field1323 = new DecoderContext(this.field1298, this.field1326);
                this.field1310 = new GranulePos();
                this.field1315 = new Frame(this.field1298.frameWidth, this.field1298.frameHeight);
                this.field1318 = this.field1323.getMaxPostProcessingLevel();
                this.method692(this.field1300, (byte) -128);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
            return;
        }
        this.field1309 = class554.method3190(-102);
        int var3 = this.field1323.decodePacketIn(arg1, this.field1310);
        if (var3 < 0) {
            throw new IllegalStateException(String.valueOf(var3));
        }
        this.field1323.granuleFrame(this.field1310);
        this.field1306 = this.field1323.granuleTime(this.field1310);
        if (this.field1299) {
            boolean var4 = arg1.isKeyFrame() == 1;
            if (!var4) {
                return;
            }
            this.field1299 = false;
        }
        if (!this.field1319 || arg1.isKeyFrame() == 1) {
            if (this.field1323.decodeFrame(this.field1315) != 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field1305 = true;
        }
    }
}
