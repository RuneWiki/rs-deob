import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class281 extends class14 {

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "[I")
    public static int[] field3697 = new int[1];

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "Lwv;")
    public static class26 field3698;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(BII)I")
    private final int method1674(byte arg0, int arg1, int arg2) {
        ++field3699;
        if (arg0 != -49) {
            field3697 = null;
        }
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(Z)V")
    public static void method1675(boolean arg0) {
        if (!arg0) {
            method1675(false);
        }
        field3698 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field3696;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            field3697 = null;
        }
        if (super.field270.field5222) {
            int var4 = class273.field3590[arg0];
            for (int var5 = 0; ~class115.field1637 < ~var5; ++var5) {
                var3[var5] = this.method1674((byte) -49, var4, class195.field2715[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)V")
    public static final void method1676(int arg0, int arg1, boolean arg2) {
        ++field3695;
        int var3 = class173.field2525.method2455((byte) 124, class388.field5275.method1764(class489.field6789, !arg2));
        for (class39 var4 = (class39) class415.field5733.method1672((byte) -114); var4 != null; var4 = (class39) class415.field5733.method1668(-1)) {
            int var8 = class48.method354(var4, 77);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class412.field5693 * 16 + 21;
        int var6 = -(var3 / 2) + arg1;
        if (~class149.field2132 > ~(var3 + var6)) {
            var6 = -var3 + class149.field2132;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (class175.field2555 < arg0 - -var5) {
            var7 = class175.field2555 - var5;
        }
        class232.field3126 = var6;
        if (~var7 > -1) {
            var7 = 0;
        }
        class462.field6398 = var7;
        class381.field5207 = var3;
        class379.field5189 = arg2;
        class522.field7714 = class412.field5693 * 16 + (class206.field2843 ? 26 : 22);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }
}
