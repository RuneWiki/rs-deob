import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 {

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "Z")
    public static boolean field239 = true;

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Ll;")
    public static class22 field238 = class33.method229("Loading", -78);

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[I")
    public static int[] field237 = new int[256];

    @OriginalMember(owner = "mapview!m", name = "k", descriptor = "Ll;")
    public static class22 field241;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "B")
    public byte field240;

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field231;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "[B")
    public byte[] field232;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "[I")
    public static int[] field235;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)V", line = 27)
    public static void method160(int arg0) {
        field231 = null;
        field235 = null;
        int var1 = -2 % ((-arg0 - 16) / 47);
        field237 = null;
        field241 = null;
        field238 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field237[var0] = var1;
        }
        field241 = class33.method229("world", -103);
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(I)B", line = 48)
    public static final byte method161(int arg0) {
        if (arg0 >= -3) {
            method164(-40);
        }
        return class29.field396 == null ? 0 : class29.field396[class35.field471];
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)V", line = 66)
    public final void method162(byte arg0) {
        boolean var2 = true;
        if (this.field232 != null) {
            this.field240 = this.field232[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field232[var3] != this.field240) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field232 = null;
            }
        }
        int var4 = 47 % ((-arg0 - 58) / 54);
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(I)I", line = 101)
    public static final int method163(int arg0) {
        if (arg0 > -33) {
            return 85;
        } else if (class2.field12 == null) {
            return 0;
        } else if (class2.field12.field232 == null) {
            return class29.field378[class2.field12.field240 & 0xFF];
        } else {
            return class29.field378[class2.field12.field232[class35.field471] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "(I)I", line = 128)
    public static final int method164(int arg0) {
        if (arg0 != 0) {
            return -14;
        } else if (class2.field10 == null) {
            return 0;
        } else if (class2.field10.field232 == null) {
            return class29.field378[class2.field10.field240 & 0xFF];
        } else {
            return class29.field378[class2.field10.field232[class35.field471] & 0xFF];
        }
    }
}
