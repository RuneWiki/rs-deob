import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class271 extends class512 {

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    private int field4502 = 204;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    private int field4499 = 1;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    private int field4505 = 1;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "Lwv;")
    public static class535 field4501 = null;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "Lnk;")
    public static class326 field4503 = new class326(33, 7);

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "Lvv;")
    public static class313 field4507 = new class313(77, 2);

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "[Lol;")
    public static class290[] field4497;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZILia;)V", line = 4)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (!arg0) {
            this.field4499 = 114;
        }
        ++field4504;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4502 = arg2.method132(118);
                }
            } else {
                this.field4499 = arg2.method126((byte) -117);
            }
        } else {
            this.field4505 = arg2.method126((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)V", line = 49)
    public static final void method1805(int arg0, byte arg1) {
        ++field4500;
        class266 var2 = class308.method1961(true, arg0, 3);
        if (arg1 > 69) {
            var2.method1778(17991);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I", line = 63)
    public final int[] method75(int arg0, byte arg1) {
        int var3 = -7 % ((arg1 - 43) / 48);
        ++field4506;
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            for (int var5 = 0; ~var5 > ~class402.field6113; ++var5) {
                int var6 = class276.field4540[var5];
                int var7 = class412.field6233[arg0];
                int var8 = this.field4505 * var6 >> 12;
                int var9 = this.field4499 * var7 >> 12;
                int var10 = var6 % (4096 / this.field4505) * this.field4505;
                int var11 = var7 % (4096 / this.field4499) * this.field4499;
                if (var11 < this.field4502) {
                    for (var8 -= var9; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (this.field4502 > var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (~this.field4502 < ~var10) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (~var12 < -4) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V", line = 148)
    public class271() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V", line = 153)
    public static void method1806(byte arg0) {
        field4501 = null;
        field4503 = null;
        field4497 = null;
        if (arg0 != -67) {
            field4507 = null;
        }
        field4507 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)Lf;", line = 167)
    public static final class192 method1807(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6908;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJIB)V", line = 181)
    public static final void method1808(int arg0, long arg1, int arg2, byte arg3) {
        ++field4498;
        int var5 = (int) arg1 >> 14 & 31;
        if (arg3 < 104) {
            field4497 = null;
        }
        int var6 = (3392693 & (int) arg1) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class452.method2703(var6, var5, arg0, arg2, 0, (byte) -116, true, 0, 0);
        } else {
            class39 var8 = class61.field928.method791(var7, true);
            int var9;
            int var10;
            if (~var6 != -1 && var6 != 2) {
                var9 = var8.field647;
                var10 = var8.field611;
            } else {
                var9 = var8.field611;
                var10 = var8.field647;
            }
            int var11 = var8.field577;
            if (~var6 != -1) {
                var11 = (var11 >> -var6 + 4) + (15 & var11 << var6);
            }
            class452.method2703(0, 0, arg0, arg2, var11, (byte) -126, true, var10, var9);
        }
    }
}
