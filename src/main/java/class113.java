import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class113 extends class601 {

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    private int field1858 = 0;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    private int field1860 = 20;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    private int field1857 = 1365;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    private int field1865 = 0;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "Lhda;")
    public static class752 field1861 = new class752(34, 3);

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Z")
    public static boolean field1864 = false;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "[Ls;")
    public static class282[] field1866;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field1862;
        if (arg0 != -40) {
            field1861 = null;
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            for (int var4 = 0; ~var4 > ~class171.field2624; ++var4) {
                int var5 = (class453.field6186[var4] << 12) / this.field1857 + this.field1858;
                int var6 = (class250.field3446[arg1] << 12) / this.field1857 - -this.field1865;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && var13 < this.field1860) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field1860 + -1 <= var13 ? 0 : (var13 << 12) / this.field1860;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public static void method951(int arg0) {
        field1861 = null;
        if (arg0 != 0) {
            method951(-80);
        }
        field1866 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field1859;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field1865 = arg0.method3807(-1);
                    }
                } else {
                    this.field1858 = arg0.method3807(-1);
                }
            } else {
                this.field1860 = arg0.method3807(-1);
            }
        } else {
            this.field1857 = arg0.method3807(-1);
        }
        if (arg1 != -61) {
            this.method6((class677) null, (byte) 113, 100);
        }
    }
}
