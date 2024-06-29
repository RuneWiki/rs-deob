import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class97 extends class160 {

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "[I")
    public static int[] field1629 = new int[5];

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "Ljb;")
    public static class276 field1625;

    @OriginalMember(owner = "client!nl", name = "ab", descriptor = "Z")
    public static boolean field1632;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)Ljava/lang/String;")
    public static final String method715(int arg0, int arg1) {
        field1624++;
        if (arg1 > -50) {
            method717(-99, (byte) -38);
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF9D59) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        field1631++;
        return arg1 == 57 ? class190.field2946 : null;
    }

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "(B)V")
    public static void method716(byte arg0) {
        field1629 = null;
        field1625 = null;
        if (arg0 > -119) {
            method717(-52, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)I")
    public static final int method717(int arg0, byte arg1) {
        field1628++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        int var3 = 112 / ((arg1 + 40) / 59);
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class97() {
        super(0, true);
    }
}
