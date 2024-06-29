import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public abstract class class7 {

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "[I")
    public static int[] field164 = new int[256];

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Lna;")
    public static class26 field168;

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lg;")
    public static class12 field166;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lra;")
    public static class33 field169;

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Ld;")
    public static class6 field165;

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
            field164[var0] = var1;
        }
        field168 = class30.method205((byte) 115, "Tannery");
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)V", line = 36)
    public static void method69(int arg0) {
        field165 = null;
        field164 = null;
        field166 = null;
        field168 = null;
        if (arg0 != -8741) {
            field167 = 29;
        }
        field169 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)[B")
    public abstract byte[] method67(int arg0);

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "([BZ)V")
    public abstract void method68(byte[] arg0, boolean arg1);
}
