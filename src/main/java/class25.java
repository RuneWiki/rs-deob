import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 extends class498 {

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lhm;ZII)V")
    public static final void method163(class150 arg0, boolean arg1, int arg2, int arg3) {
        field310++;
        if (arg1) {
            method164((byte) 75, -48);
        }
        class202.field2889 = arg3;
        class251.field3750 = arg0;
        class230.field3390 = arg2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I")
    public static final int method164(byte arg0, int arg1) {
        field308++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        if (arg0 != -50) {
            field312 = 75;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V")
    public class25(int arg0, int arg1) {
        this.field309 = arg0;
        this.field311 = arg1;
    }
}
