import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class542 {

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field7926;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field7921;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field7925;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "S")
    public static short field7920 = 320;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Lip;")
    public static class508 field7924 = new class508("", 13);

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)V")
    public abstract void method931(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZII)I")
    public static final int method3193(int arg0, boolean arg1, int arg2, int arg3) {
        field7922++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * arg3 + (arg2 & 0x7F) * var4 >> 7;
        if (!arg1) {
            field7920 = -38;
        }
        int var6 = (arg0 & 0x380) * arg3 + (arg2 & 0x380) * var4 >> 7;
        int var7 = (arg0 & 0xFC00) * arg3 + (arg2 & 0xFC00) * var4 >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public abstract void method928(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I")
    public static final int method3194(int arg0, int arg1) {
        field7923++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        int var3 = -13 / ((19 - arg0) / 54);
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method3195(int arg0) {
        field7924 = null;
        if (arg0 != 16) {
            field7920 = 86;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(III)V")
    public class542(int arg0, int arg1, int arg2) {
        this.field7926 = arg1;
        this.field7921 = arg2;
        this.field7925 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
    public abstract void method930(byte arg0, int arg1, int arg2);
}
