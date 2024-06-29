import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field59 = 1;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[[B")
    public static byte[][] field68 = new byte[250][];

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "J")
    public static long field62 = 0L;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "J")
    public static long field67 = 0L;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lvl;")
    public static class73 field65;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
    public static final void method25(int arg0, byte arg1) {
        field60++;
        if (arg0 == -1 || !class123.field1763[arg0]) {
            return;
        }
        class217.field3394.method505(arg0, 115);
        if (class68.field1018[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class68.field1018[arg0].length; var3++) {
            if (class68.field1018[arg0][var3] != null) {
                if (class68.field1018[arg0][var3].field3620 == 2) {
                    var2 = false;
                } else {
                    class68.field1018[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class68.field1018[arg0] = null;
        }
        class123.field1763[arg0] = false;
        if (arg1 >= -37) {
            field61 = -121;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method26(int arg0) {
        class62.field895.method1511((byte) 113);
        field63++;
        if (arg0 != 17978) {
            field67 = -4L;
        }
        class281.field4572.method1511((byte) 105);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method27(byte arg0) {
        field68 = null;
        if (arg0 == -64) {
            field65 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method28(int arg0, int arg1) {
        field66++;
        int var2 = arg0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 = arg0 + 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }
}
