import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class275 extends class214 {

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    private int field4199 = 1;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    private int field4197 = 204;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    private int field4196 = 1;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Lcb;")
    public static class631 field4203 = new class631(43, 3);

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "Lcl;")
    public static class746 field4205;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILofa;I)V", line = 4)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field4200;
        if (arg0 >= 92) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field4197 = arg1.method1989((byte) -45);
                    }
                } else {
                    this.field4196 = arg1.method1987(-67);
                }
            } else {
                this.field4199 = arg1.method1987(-96);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBZ)V", line = 53)
    public static final void method1805(int arg0, byte arg1, boolean arg2) {
        ++field4204;
        class33 var3 = class446.method2724(arg0, 9, arg2);
        if (var3 != null) {
            if (arg1 < 113) {
                method1806(-39);
            }
            for (int var4 = 0; ~var3.field311.length < ~var4; ++var4) {
                var3.field311[var4] = -1;
                var3.field310[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 179)
    public class275() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I", line = 82)
    public final int[] method64(int arg0, byte arg1) {
        ++field4201;
        if (arg1 != 5) {
            this.method64(-73, (byte) 33);
        }
        int[] var3 = super.field3544.method3869(arg0, arg1 ^ -115);
        if (super.field3544.field9836) {
            for (int var4 = 0; class626.field8787 > var4; ++var4) {
                int var5 = class592.field8328[var4];
                int var6 = class131.field2138[arg0];
                int var7 = this.field4199 * var5 >> 12;
                int var8 = this.field4196 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4199) * this.field4199;
                int var10 = var6 % (4096 / this.field4196) * this.field4196;
                if (this.field4197 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4197 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4197 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 182)
    public static void method1806(int arg0) {
        if (arg0 >= 88) {
            field4203 = null;
            field4205 = null;
        }
    }
}
