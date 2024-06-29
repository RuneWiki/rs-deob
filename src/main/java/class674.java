import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class674 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
    public static int[] field9567 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[[I")
    public static int[][] field9565 = new int[6][];

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "[I")
    public static int[] field9570 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Ljo;")
    public static class303 field9566;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)I", line = 8)
    public static final int method3775(int arg0, int arg1, int arg2) {
        field9569++;
        int var3 = arg1 >> 31 & arg0 + arg2;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 27)
    public static void method3776(byte arg0) {
        field9565 = null;
        field9570 = null;
        field9567 = null;
        field9566 = null;
        int var1 = -38 % ((58 - arg0) / 36);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)Z", line = 48)
    public static final boolean method3777(int arg0, int arg1, int arg2) {
        field9568++;
        if (arg1 != 1) {
            field9567 = null;
        }
        return (arg2 & 0x20) != 0;
    }
}
