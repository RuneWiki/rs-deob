import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class GZip {

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "I")
    public static volatile int field114;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Z")
    public static boolean field112;

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Lv;")
    public static JagString field121;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "Lv;")
    public static JagString field116;

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "Lv;")
    public static JagString field124;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lv;")
    public static JagString field115;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater inflater;

    static {
        ByteArrayPool.minPool = new byte[1000][];
        field114 = -1;
        field112 = false;
        field123 = -1;
        field118 = -1;
        field121 = class1.method2(255, "Mining Site");
        field116 = class1.method2(255, "Estate Agent");
        field122 = 0;
        field124 = class1.method2(255, "Sandpit");
        field119 = 0;
        field115 = class1.method2(255, "Find");
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Lp;I[B)V", line = 44)
    public final void decompress(Packet arg0, int arg1, byte[] arg2) {
        if (arg0.data[arg0.pos] != 31 || arg0.data[arg0.pos + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.inflater == null) {
            this.inflater = new Inflater(true);
        }
        try {
            if (arg1 != 3) {
                this.inflater = null;
            }
            this.inflater.setInput(arg0.data, arg0.pos + 10, arg0.data.length + -10 + -arg0.pos + -8);
            this.inflater.inflate(arg2);
        } catch (Exception var5) {
            this.inflater.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.inflater.reset();
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 81)
    public static final void method49(byte arg0) {
        JavaKeyboard var1 = StringNode.field81;
        synchronized (StringNode.field81) {
            Packet.field342 = GameCanvas.field35;
            if (mapview.field269 >= 0) {
                while (mapview.field269 != Timer.field397) {
                    int var2 = class1.field5[Timer.field397];
                    Timer.field397 = Timer.field397 + 1 & 0x7F;
                    if (var2 < 0) {
                        ByteArrayPool.field185[~var2] = false;
                    } else {
                        ByteArrayPool.field185[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    ByteArrayPool.field185[var3] = false;
                }
                mapview.field269 = Timer.field397;
            }
            GameCanvas.field35 = field122;
            if (arg0 != 26) {
                method50(-111);
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)V", line = 128)
    public static final void method50(int arg0) {
        if (class18.field165[arg0][JagException.field107][JavaMouse.field381] == null) {
            WorldmapOverlay.field378 = null;
        } else {
            WorldmapOverlay.field378 = class18.field165[0][JagException.field107][JavaMouse.field381];
        }
        if (class18.field165[1][JagException.field107][JavaMouse.field381] == null) {
            Timer.field404 = null;
        } else {
            Timer.field404 = class18.field165[1][JagException.field107][JavaMouse.field381];
        }
        if (class18.field165[2][JagException.field107][JavaMouse.field381] == null) {
            GameShell.field205 = null;
        } else {
            GameShell.field205 = class18.field165[2][JagException.field107][JavaMouse.field381];
        }
        if (class18.field165[3][JagException.field107][JavaMouse.field381] == null) {
            JavaKeyboard.field16 = null;
        } else {
            JavaKeyboard.field16 = class18.field165[3][JagException.field107][JavaMouse.field381];
        }
        if (class18.field165[4][JagException.field107][JavaMouse.field381] == null) {
            JavaMouse.field389 = null;
        } else {
            JavaMouse.field389 = class18.field165[4][JagException.field107][JavaMouse.field381];
        }
        if (GameShell.field207[JagException.field107][JavaMouse.field381] == null) {
            MillisTimer.field151 = null;
        } else {
            MillisTimer.field151 = GameShell.field207[JagException.field107][JavaMouse.field381];
        }
        if (JavaPixMap.field188[JagException.field107][JavaMouse.field381] == null) {
            Worldmap.field359 = null;
        } else {
            Worldmap.field359 = JavaPixMap.field188[JagException.field107][JavaMouse.field381];
        }
        if (class4.field28[JagException.field107][JavaMouse.field381] == null) {
            StringNode.field82 = null;
        } else {
            StringNode.field82 = class4.field28[JagException.field107][JavaMouse.field381];
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "()V", line = 179)
    public GZip() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B[BII)I", line = 184)
    public static final int method51(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        int var5 = 108 % ((arg0 - 69) / 46);
        for (int var6 = arg3; var6 < arg2; var6++) {
            var4 = MillisTimer.crctable[(var4 ^ arg1[var6]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)V", line = 219)
    public static void method52(int arg0) {
        field121 = null;
        field124 = null;
        field115 = null;
        field116 = null;
        ByteArrayPool.minPool = null;
        if (arg0 != 22953) {
            method49((byte) 108);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(III)V", line = 231)
    private GZip(int arg0, int arg1, int arg2) {
    }
}
