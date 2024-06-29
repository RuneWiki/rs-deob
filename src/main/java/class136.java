import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class136 extends class70 {

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
    public static boolean field2321 = false;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Llj;")
    public static class59 field2330 = new class59(64);

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Z")
    public static boolean field2333 = true;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field2334 = 0;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lek;")
    public static class206 field2332;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
    public int[] field2322;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "[I")
    public int[] field2323;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public int[] field2325;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[Lme;")
    public class210[] field2326;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "[Lme;")
    public class210[] field2331;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "[[[B")
    public byte[][][] field2328;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I", line = 11)
    public static final int method952(int arg0) {
        if (arg0 != 2) {
            field2333 = true;
        }
        field2320++;
        return 2;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 22)
    public static void method953(byte arg0) {
        field2332 = null;
        field2330 = null;
        if (arg0 <= 118) {
            method953((byte) -74);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I", line = 46)
    public static final int method954(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        field2329++;
        if (arg1 >= -117) {
            field2330 = (class59) null;
        }
        return (arg0 >> 2 << 10) + (arg3 >> 1) + (arg2 >> 5 << 7);
    }
}
