import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class438 {

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "[S")
    private static short[] field5908 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "[S")
    private static short[] field5911 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "[S")
    private static short[] field5906 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "[S")
    private static short[] field5909 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "[[S")
    public static short[][] field5912 = new short[][] { field5909, field5908, field5906, field5911 };

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "Lbu;")
    public static class21 field5910 = new class21(112, 1);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "D")
    public static double field5905;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method2615(int arg0, int arg1, int arg2, int arg3) {
        field5907++;
        if (arg0 != -1208546591) {
            method2615(28, 104, 27, 93);
        }
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        return (arg2 >> 1) + ((arg1 & 0xFF) >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 34)
    public static void method2616(int arg0) {
        field5911 = null;
        field5906 = null;
        field5910 = null;
        field5908 = null;
        if (arg0 == -20120) {
            field5909 = null;
            field5912 = null;
        }
    }
}
