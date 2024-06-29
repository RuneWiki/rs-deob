import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class117 extends class263 {

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    private int field1752 = 1;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    private int field1754 = 204;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    private int field1756 = 1;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Lfp;")
    public static class437 field1751 = new class437(11, 0, 1, 2);

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lgn;")
    public static class526 field1759 = new class526(5, 18);

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field1763 = 1;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "B")
    public static byte field1762;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lsd;")
    public static class265 field1757;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public static void method879(int arg0) {
        field1757 = null;
        field1759 = null;
        if (arg0 != 204) {
            field1753 = -64;
        }
        field1751 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field1760;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            for (int var4 = 0; ~var4 > ~class367.field5597; ++var4) {
                int var5 = class379.field5711[var4];
                int var6 = class170.field2509[arg0];
                int var7 = this.field1752 * var5 >> 12;
                int var8 = this.field1756 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1752) * this.field1752;
                int var10 = var6 % (4096 / this.field1756) * this.field1756;
                if (~var10 > ~this.field1754) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field1754) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1754 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
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
        if (arg1 < 40) {
            method879(-110);
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZZII)I")
    public static final int method880(boolean arg0, boolean arg1, int arg2, int arg3) {
        ++field1758;
        class411 var4 = class171.method1179(arg1, arg0, arg3);
        if (var4 == null) {
            return -1;
        } else {
            return ~arg2 <= -1 && ~arg2 > ~var4.field6200.length ? var4.field6200[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg1) {
            ++field1755;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field1754 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field1756 = arg2.method2765(81);
                }
            } else {
                this.field1752 = arg2.method2765(49);
            }
        }
    }
}
