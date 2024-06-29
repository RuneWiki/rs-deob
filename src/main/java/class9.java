import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class9 {

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lla;")
    public static class319 field173 = new class319(53, 0);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[Lkg;")
    public static class181[] field174 = new class181[4];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIB)I", line = 4)
    public static final int method98(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -57) {
            method98(-20, 7, -60, (byte) -101);
        }
        field171++;
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        return (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 33)
    public static void method99(int arg0) {
        if (arg0 != 53) {
            field174 = null;
        }
        field174 = null;
        field173 = null;
    }
}
