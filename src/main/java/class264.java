import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class264 {

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lrb;")
    public static class283 field3544 = new class283(5, -2);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lrb;")
    public static class283 field3551 = new class283(60, 12);

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "[Let;")
    public static class466[] field3553 = new class466[4];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field3545;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[B")
    public byte[] field3540;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[B")
    public byte[] field3541;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
    public static final int method1551(int arg0, int arg1, int arg2) {
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        field3550++;
        if (arg0 > var3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1552(int arg0) {
        field3538++;
        int var1 = 0;
        if (arg0 != 5) {
            method1554((byte) -75, -107, -108);
        }
        if (class76.field1075.method1597(false, class195.field2849)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class76.field1075.field3677) {
            var1 |= 0x40;
        }
        class113.method853(95, var1);
        class452.field6629.method598(var1, false);
        class534.field7872.method3085((byte) -72, var1);
        class233.field3248.method2229(var1, (byte) 75);
        class316.field4288.method2652(64, var1);
        class108.method824(0, var1);
        class336.method2049(var1, true);
        class147.method1060(var1, -25110);
        class238.method1452(0, var1);
        class75.method590(arg0 ^ 0x76);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method1553(int arg0) {
        field3551 = null;
        if (arg0 != 32) {
            field3551 = null;
        }
        field3544 = null;
        field3553 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)V")
    public static final void method1554(byte arg0, int arg1, int arg2) {
        field3542++;
        int var3 = 67 % ((-arg0 - 61) / 48);
        if (class523.method3109((byte) -65, arg2)) {
            class144.method1001((byte) 66, class505.field7387[arg2], arg1);
        }
    }
}
