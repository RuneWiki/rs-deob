import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class199 extends class82 {

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    private int field3513 = 1;

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
    private int field3522 = 1;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    private int field3525 = 204;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "Ldj;")
    private static class44 field3517 = class89.method650(255, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!si", name = "W", descriptor = "Ldj;")
    private static class44 field3519 = class89.method650(255, "Members object");

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "Ldj;")
    public static class44 field3521 = field3519;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "Ldj;")
    private static class44 field3520 = class89.method650(255, "Select");

    @OriginalMember(owner = "client!si", name = "T", descriptor = "Ldj;")
    public static class44 field3516 = field3520;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!si", name = "db", descriptor = "Ldj;")
    public static class44 field3526 = field3517;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
    public static void method1286(int arg0) {
        field3519 = null;
        field3516 = null;
        field3520 = null;
        field3521 = null;
        field3517 = null;
        if (arg0 != -1855376884) {
            method1287(-39, -105);
        }
        field3526 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class199() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(II)Ldj;")
    public static final class44 method1287(int arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        } else {
            ++field3524;
            return class29.method203(22666, arg0, false, 10);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg2 == 68) {
            ++field3512;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field3525 = arg0.method500(75);
                    }
                } else {
                    this.field3513 = arg0.method506(255);
                }
            } else {
                this.field3522 = arg0.method506(arg2 ^ 187);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        int[] var3 = super.field1595.method603(true, arg1);
        ++field3514;
        if (super.field1595.field1538) {
            for (int var4 = 0; ~class129.field2287 < ~var4; ++var4) {
                int var5 = class212.field3809[arg1];
                int var6 = class49.field912[var4];
                int var7 = this.field3513 * var5 >> 12;
                int var8 = this.field3522 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3513) * this.field3513;
                int var10 = var6 % (4096 / this.field3522) * this.field3522;
                if (~this.field3525 < ~var9) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field3525) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var10 > ~this.field3525) {
                    int var11;
                    for (var11 = var8 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 != 25238) {
            field3517 = null;
        }
        return var3;
    }
}
