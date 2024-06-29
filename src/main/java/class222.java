import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class222 extends class198 {

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    private int field3254 = -1;

    @OriginalMember(owner = "client!vm", name = "x", descriptor = "Lvb;")
    public static class396 field3260 = new class396(6, 4);

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    private int field3256;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    private int field3258;

    @OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILlm;)V", line = 7)
    public final void method858(int arg0, class50 arg1) {
        field3262++;
        if (arg0 != 3) {
            method1524(false, (byte) -40);
        }
        arg1.method396(this.field3255, arg0 ^ 0x3A65, this.field3254, this.field3256, this.field3258);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZB)Z", line = 20)
    public static final boolean method1524(boolean arg0, byte arg1) {
        field3257++;
        boolean var2 = class686.field9702.method99();
        if (arg1 >= -105) {
            field3266 = 10;
        }
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class686.field9702.method87();
        } else if (!class686.field9702.method83()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class420.field5820.method3781(class420.field5820.field9476, 97, arg0 ? 1 : 0);
            class95.method797(-65);
            return true;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V", line = 60)
    public static void method1525(boolean arg0) {
        field3260 = null;
        if (!arg0) {
            method1525(false);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLol;)V", line = 73)
    public final void method855(boolean arg0, class431 arg1) {
        field3264++;
        if (!arg0) {
            field3266 = -3;
        }
        this.field3254 = arg1.method2565((byte) -124);
        this.field3256 = arg1.method2526(17);
        this.field3255 = arg1.method2557(14929);
        this.field3258 = arg1.method2557(14929);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZLof;)V", line = 90)
    public static final void method1526(int arg0, boolean arg1, class477 arg2) {
        field3259++;
        class646.field9183.method3615((byte) 126, arg2);
        if (arg1) {
            class614.method3540(class104.field1517, class224.field3296, class12.field151, 16, class646.field9183, arg2);
        }
        if (arg0 != -32672) {
            method1527(-85, -63, 10, 38);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)V", line = 108)
    public static final void method1527(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        field3261++;
        int var5 = arg3 << 3;
        int var6 = arg0 << 3;
        class98.field1423 = var6;
        if (class783.field10725 == 2) {
            class642.field9037 = var6;
            class99.field1437 = var5;
            class389.field5439 = var4;
        }
        class208.field3031 = var5;
        class494.method2894(-4);
        if (arg2 < -5) {
            class438.field6083 = true;
        }
    }
}
