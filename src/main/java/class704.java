import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class704 {

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "[F")
    public static float[] field9789 = new float[4];

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "[Ljia;")
    public static class336[] field9787 = new class336[5];

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "J")
    public static long field9792;

    static {
        for (int var0 = 0; var0 < field9787.length; var0++) {
            field9787[var0] = new class336();
        }
        field9793 = 0;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILjava/io/File;)[B", line = 9)
    public static final byte[] method3957(int arg0, File arg1) {
        field9790++;
        return arg0 == 64 ? class473.method2813((int) arg1.length(), (byte) -60, arg1) : null;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)S", line = 21)
    public static final short method3958(byte arg0, int arg1) {
        field9791++;
        int var2 = (arg1 & 0xFD73) >> 10;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        if (arg0 <= 104) {
            field9788 = -112;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 69)
    public static void method3959(int arg0) {
        field9787 = null;
        field9789 = null;
        if (arg0 < 19) {
            field9787 = null;
        }
    }
}
