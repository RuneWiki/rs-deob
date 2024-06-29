import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class308 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lof;")
    private class620 field3827 = new class620(256);

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lnv;")
    private class417 field3833;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ld;")
    private class150 field3830;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3828 = -1;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3829 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "F")
    public static float field3835 = 1024.0F;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Lwn;", line = 5)
    public final class720 method1835(int arg0, byte arg1) {
        field3837++;
        Object var3 = this.field3827.method3538((long) arg0, arg1 ^ 0xFFFFFFE3);
        if (var3 != null) {
            return (class720) var3;
        } else if (arg1 != -29) {
            return null;
        } else if (this.field3830.method929(15715, arg0)) {
            class298 var4 = this.field3830.method931(arg0, true);
            int var5 = var4.field3711 ? 64 : this.field3833.field5908;
            class720 var7;
            if (var4.field3714 && this.field3833.method358()) {
                float[] var6 = this.field3830.method933(false, arg0, var5, var5, (byte) -115, 0.7F);
                var7 = new class720(this.field3833, 3553, 34842, var5, var5, var4.field3701 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field3698 != 2 && class720.method4017(var4.field3702, -31302)) {
                    var8 = this.field3830.method930(true, 116, var5, arg0, 0.7F, var5);
                } else {
                    var8 = this.field3830.method932(0.7F, var5, arg0, false, -20255, var5);
                }
                var7 = new class720(this.field3833, 3553, 6408, var5, var5, var4.field3701 != 0, var8, 0, 0, false);
            }
            var7.method4018(var4.field3700, var4.field3716, (byte) 125);
            this.field3827.method3537(arg1 ^ 0xFFFFFF82, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIB)V", line = 53)
    public static final void method1836(int arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 != 42) {
            field3835 = -0.45936602F;
        }
        field3836++;
        if (class228.field2651.method1754(false, (long) arg0) != null) {
            return;
        }
        if (class47.field512) {
            class456 var4 = new class456(arg0, new class698(4096, class105.field1092, arg0), arg2, arg1);
            var4.field6543.method3486(class370.field4733[class489.field6978], 14994);
            class228.field2651.method1751(var4, 3970, (long) arg0);
        } else {
            class444.method2755(arg1, arg3 ^ 0x292F, arg0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V", line = 78)
    public static final void method1837(int arg0, int arg1) {
        if (class220.field2541 == null || arg0 > class220.field2541.length) {
            class220.field2541 = new int[arg0];
        }
        if (arg1 != 2) {
            field3835 = -0.30964014F;
        }
        field3832++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 94)
    public final void method1838(int arg0) {
        this.field3827.method3549(0);
        field3834++;
        if (arg0 != 2) {
            this.method1835(-94, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 106)
    public final void method1839(int arg0) {
        field3831++;
        if (arg0 != 2) {
            field3835 = -0.22994931F;
        }
        this.field3827.method3539((byte) -27, 5);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 117)
    public static final void method1840(int arg0) {
        class340.field4400 = null;
        field3826++;
        class180.field2131 = null;
        if (arg0 != 0) {
            method1837(-92, 115);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lnv;Ld;)V", line = 145)
    public class308(class417 arg0, class150 arg1) {
        this.field3833 = arg0;
        this.field3830 = arg1;
    }
}
