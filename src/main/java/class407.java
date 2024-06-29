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

@OriginalClass("client!sm")
public class class407 extends class464 {

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Ljagtheora/theora/SetupInfo;")
    private SetupInfo field5389 = new SetupInfo();

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "Ljagtheora/theora/TheoraInfo;")
    private TheoraInfo field5392 = new TheoraInfo();

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "Ljagtheora/theora/TheoraComment;")
    private TheoraComment field5405 = new TheoraComment();

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field5406 = 0;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Lrda;")
    public static class467 field5401 = new class467(64);

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "D")
    private double field5397;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "F")
    public static float field5417;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    private int field5391;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    private int field5407;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "J")
    private long field5413;

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "J")
    public static long field5418;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "Lwm;")
    public static class30 field5402;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "Lkc;")
    public static class684 field5416;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Lpu;")
    private class772 field5390;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "Ljagtheora/theora/DecoderContext;")
    private DecoderContext field5400;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "Ljagtheora/theora/Frame;")
    private Frame field5411;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "Ljagtheora/theora/GranulePos;")
    private GranulePos field5404;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "Z")
    private boolean field5394;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "Z")
    private boolean field5395;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "Z")
    private boolean field5410;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "Z")
    private boolean field5414;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(Z)V", line = 7)
    public static void method2364(boolean arg0) {
        if (!arg0) {
            field5417 = 1.3637807F;
        }
        field5416 = null;
        field5402 = null;
        field5401 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILha;)Lpu;", line = 23)
    public final class772 method2365(int arg0, class570 arg1) {
        field5393++;
        if (this.field5411 == null) {
            return null;
        } else if (this.field5414 || this.field5390 == null) {
            this.field5390 = arg1.method885(this.field5411.pixels, 0, this.field5411.field1238, this.field5411.field1238, this.field5411.field1239, false);
            this.field5414 = false;
            if (arg0 != 16621) {
                field5416 = null;
            }
            return this.field5390;
        } else {
            return this.field5390;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 47)
    public final void method508(int arg0) {
        if (this.field5411 != null) {
            this.field5411.method549();
        }
        field5398++;
        if (this.field5400 != null) {
            this.field5400.method549();
            this.field5400 = null;
        }
        if (this.field5404 != null) {
            this.field5404.method549();
            this.field5404 = null;
        }
        this.field5392.method549();
        if (arg0 > 27) {
            this.field5405.method549();
            this.field5389.method549();
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)J", line = 78)
    public final long method2366(byte arg0) {
        field5399++;
        return arg0 >= -37 ? -54L : this.field5413;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZC)C", line = 92)
    public static final char method2367(boolean arg0, char arg1) {
        field5412++;
        if (arg0) {
            field5401 = null;
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z", line = 487)
    public final boolean method2368(int arg0) {
        field5403++;
        if (arg0 < 54) {
            this.method2370(-37);
        }
        return this.field5410;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V", line = 502)
    private final void method2369(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field5408++;
        this.field5407 = arg1;
        if (!this.field5410) {
            return;
        }
        if (this.field5391 < this.field5407) {
            this.field5407 = this.field5391;
        }
        if (this.field5407 < 0) {
            this.field5407 = 0;
        }
        this.field5400.setPostProcessingLevel(this.field5407);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 530)
    public final void method510(OggPacket arg0, boolean arg1) {
        field5396++;
        if (this.field5410) {
            this.field5413 = class502.method2786(-7114);
            int var3 = this.field5400.decodePacketIn(arg0, this.field5404);
            if (var3 < 0) {
                throw new IllegalStateException(String.valueOf(var3));
            }
            this.field5400.granuleFrame(this.field5404);
            this.field5397 = this.field5400.granuleTime(this.field5404);
            if (this.field5395) {
                boolean var4 = arg0.isKeyFrame() == 1;
                if (!var4) {
                    return;
                }
                this.field5395 = false;
            }
            if (!this.field5394 || arg0.isKeyFrame() == 1) {
                if (this.field5400.decodeFrame(this.field5411) != 0) {
                    throw new IllegalStateException(String.valueOf(var3));
                }
                this.field5414 = true;
            }
        } else {
            int var5 = this.field5389.decodeHeader(this.field5392, this.field5405, arg0);
            if (var5 == 0) {
                this.field5410 = true;
                if (this.field5392.frameWidth > 2048 || this.field5392.frameHeight > 1024) {
                    throw new IllegalStateException();
                }
                this.field5400 = new DecoderContext(this.field5392, this.field5389);
                this.field5404 = new GranulePos();
                this.field5411 = new Frame(this.field5392.frameWidth, this.field5392.frameHeight);
                this.field5391 = this.field5400.getMaxPostProcessingLevel();
                this.method2369(0, this.field5407);
            } else if (var5 < 0) {
                throw new IllegalStateException(String.valueOf(var5));
            }
        }
        if (!arg1) {
            this.method2365(28, null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)F", line = 604)
    public final float method2370(int arg0) {
        field5409++;
        if (arg0 != -201) {
            this.method2365(-122, null);
        }
        return this.field5410 && !this.field5392.method548() ? (float) this.field5392.fpsNumerator / (float) this.field5392.fpsDenominator : 0.0F;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lr;III[Z)V", line = 624)
    public static final void method2371(class736 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class735.field9973 == class116.field1542) {
            return;
        }
        int var5 = class383.field4790[arg1].method2072((byte) -45, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class358 var7 = class383.field4790[var6];
                if (var7 != null) {
                    var7.method2063(arg0, arg2, var5 - var7.method2072((byte) -104, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(Z)D", line = 652)
    public final double method2372(boolean arg0) {
        field5415++;
        if (!arg0) {
            this.method2366((byte) -41);
        }
        return this.field5397;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 670)
    public class407(OggStreamState arg0) {
        super(arg0);
    }
}
