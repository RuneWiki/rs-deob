import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class265 extends class273 {

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    private int field4681 = 1;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    private int field4685 = 0;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    private int field4678 = 0;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field4677 = 0;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field4684 = 0;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "Ljd;")
    public static class86 field4686 = null;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field4683 = 0;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "Ljd;")
    public static class86 field4691 = class122.method868("null", true);

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "Lnk;")
    public static class124 field4680;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)[Lod;")
    public static final class90[] method1794(int arg0) {
        ++field4679;
        class90[] var1 = new class90[class64.field1270];
        for (int var2 = arg0; ~class64.field1270 < ~var2; ++var2) {
            byte[] var3 = class213.field3857[var2];
            int var4 = class24.field592[var2] * class191.field3393[var2];
            if (class264.field4673[var2]) {
                byte[] var5 = class173.field3169[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; var4 > var7; ++var7) {
                    var6[var7] = class49.method377(class1.method5(-16777216, var5[var7] << 24), class268.field4718[class1.method5(255, var3[var7])]);
                }
                var1[var2] = new class99(class70.field1438, class169.field3121, class138.field2628[var2], class1.field6[var2], class24.field592[var2], class191.field3393[var2], var6);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; ++var9) {
                    var8[var9] = class268.field4718[class1.method5(var3[var9], 255)];
                }
                var1[var2] = new class167(class70.field1438, class169.field3121, class138.field2628[var2], class1.field6[var2], class24.field592[var2], class191.field3393[var2], var8);
            }
        }
        class127.method894((byte) 20);
        return var1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V")
    public static void method1795(int arg0) {
        field4680 = null;
        field4686 = null;
        field4691 = null;
        if (arg0 != -1480506268) {
            field4691 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 == 4095) {
            class144.method1022((byte) -124);
            ++field4689;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lbj;I)I")
    public static final int method1796(class151 arg0, int arg1) {
        ++field4688;
        int var2 = arg1;
        if (arg0.method1096(-81, class198.field3511)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1096(-26, class5.field68)) {
            ++var2;
        }
        if (arg0.method1096(arg1 ^ -72, class273.field4797)) {
            ++var2;
        }
        if (arg0.method1096(-92, class155.field2923)) {
            ++var2;
        }
        if (arg0.method1096(-115, class107.field2068)) {
            ++var2;
        }
        if (arg0.method1096(-111, class152.field2880)) {
            ++var2;
        }
        if (arg0.method1096(-16, class246.field4377)) {
            ++var2;
        }
        if (arg0.method1096(-118, class203.field3672)) {
            ++var2;
        }
        if (arg0.method1096(-99, class138.field2638)) {
            ++var2;
        }
        if (arg0.method1096(-33, class226.field4098)) {
            ++var2;
        }
        if (arg0.method1096(-43, class25.field607)) {
            ++var2;
        }
        if (arg0.method1096(-34, class58.field1173)) {
            ++var2;
        }
        if (arg0.method1096(-98, class178.field3219)) {
            ++var2;
        }
        if (arg0.method1096(-62, class54.field1095)) {
            ++var2;
        }
        if (arg0.method1096(-89, class155.field2929)) {
            ++var2;
        }
        if (arg0.method1096(-103, class179.field3239)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field4681 = arg1.method1408((byte) -68);
                }
            } else {
                this.field4678 = arg1.method1408((byte) -101);
            }
        } else {
            this.field4685 = arg1.method1408((byte) -102);
        }
        if (arg2 > -16) {
            field4684 = -97;
        }
        ++field4687;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4682;
        int[] var3 = super.field4800.method1224(arg1, arg0 + 7420);
        if (super.field4800.field3160) {
            int var4 = class143.field2711[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class176.field3200 > var6; ++var6) {
                int var7 = class114.field2184[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field4685 == -1) {
                    var9 = (-var4 + var7) * this.field4681;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4681 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (~this.field4678 == -1) {
                    var12 = class205.field3698[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field4678 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != -7420) {
            this.method84(37);
        }
        return var3;
    }
}
