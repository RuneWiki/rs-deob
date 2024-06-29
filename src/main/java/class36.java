import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field654 = 0;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Z")
    public static boolean field655 = false;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lp;")
    public static class280 field656 = class18.method140((byte) -124, ")4a=");

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method292(int arg0) {
        field656 = null;
        if (arg0 != 26406) {
            method292(-56);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
    public static final int method293(byte arg0, int arg1) {
        field653++;
        if (arg0 > -97) {
            method293((byte) 127, -11);
        }
        int var2 = (arg1 & 0xE7) >> 6;
        int var3 = arg1 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
