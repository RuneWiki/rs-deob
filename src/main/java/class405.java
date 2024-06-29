import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class405 {

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public int field5323 = 8;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public int field5329 = 16777215;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5326 = new CRC32();

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "[I")
    public static int[] field5330 = new int[128];

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public int field5325;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "Z")
    public boolean field5327;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "[[I")
    public static int[][] field5331;

    static {
        for (int var0 = 0; var0 < field5330.length; var0++) {
            field5330[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field5330[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field5330[var2] = var2 - 71;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field5330[var3] = var3 + 52 - 48;
        }
        field5330[45] = field5330[47] = 63;
        field5330[42] = field5330[43] = 62;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Los;I)V", line = 3)
    public final void method2310(class374 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2129(arg1 ^ 0xFFFFFFBC);
            if (var3 == 0) {
                field5319++;
                if (arg1 != 0) {
                    this.field5324 = -102;
                    return;
                }
                return;
            }
            this.method2311(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILos;Z)V", line = 26)
    private final void method2311(int arg0, class374 arg1, boolean arg2) {
        field5321++;
        if (arg0 == 1) {
            this.field5323 = arg1.method2136(false);
        } else if (arg0 == 2) {
            this.field5327 = true;
        } else if (arg0 == 3) {
            this.field5320 = arg1.method2089(true);
            this.field5324 = arg1.method2089(true);
            this.field5325 = arg1.method2089(true);
        } else if (arg0 == 4) {
            this.field5318 = arg1.method2129(-98);
        } else if (arg0 == 5) {
            this.field5328 = arg1.method2136(false);
        } else if (arg0 == 6) {
            this.field5329 = arg1.method2128(true);
        }
        if (arg2) {
            field5330 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 77)
    public static void method2312(int arg0) {
        field5330 = null;
        if (arg0 == 63) {
            field5326 = null;
            field5331 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIB)B", line = 89)
    public static final byte method2313(int arg0, int arg1, byte arg2) {
        field5322++;
        if (arg1 == 9) {
            if (arg2 != -25) {
                field5330 = null;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
