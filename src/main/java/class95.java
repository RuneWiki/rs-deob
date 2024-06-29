import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class95 {

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Z")
    public boolean field1491 = true;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
    public static boolean field1487 = true;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[I")
    public static int[] field1484;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)I", line = 22)
    public static final int method814(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        int var4 = -13 / ((arg2 + 80) / 43);
        field1492++;
        return (arg3 >> 5 << 7) + ((arg1 >> 2 << 10) + (arg0 >> 1));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V", line = 52)
    public static final void method815(byte arg0, int arg1) {
        if (arg0 != -127) {
            field1484 = (int[]) null;
        }
        field1480++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class121.method1025(76);
        } else if (arg1 == 2) {
            class226.method1642(-16394);
        } else if (arg1 == 3) {
            class310.method2150(-126);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLcg;)V", line = 84)
    public static final void method816(byte arg0, class49 arg1) {
        class279.field4424 = arg1;
        field1486++;
        if (arg0 != -33) {
            method816((byte) 60, (class49) null);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 98)
    public static void method817(boolean arg0) {
        if (!arg0) {
            field1483 = 28;
        }
        field1484 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIZ)V", line = 127)
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1481 = arg5;
        this.field1482 = arg1;
        this.field1488 = arg2;
        this.field1491 = arg6;
        this.field1485 = arg3;
        this.field1489 = arg0;
        this.field1490 = arg4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 117)
    public static final void method818(int arg0) {
        field1479++;
        class161.field2862.method470(12);
        class17.field259.method470(12);
        if (arg0 > -87) {
            field1484 = (int[]) null;
        }
    }
}
