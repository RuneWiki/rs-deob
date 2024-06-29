import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class522 extends class337 {

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field7637 = 1;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    private int field7635 = 204;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    private int field7641 = 1;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "[Lfg;")
    public static class85[] field7636 = new class85[50];

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Lul;")
    public static class406 field7634;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILuq;)Luq;")
    public static final class114 method3107(int arg0, class114 arg1) {
        ++field7639;
        class114 var2 = client.method1384(arg1);
        if (arg0 != 50) {
            method3109(87, (class406) null);
        }
        if (var2 == null) {
            var2 = arg1.field1582;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field7640;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (arg1 != -11) {
            method3107(101, (class114) null);
        }
        if (super.field5007.field687) {
            for (int var4 = 0; class402.field5977 > var4; ++var4) {
                int var5 = class109.field1530[var4];
                int var6 = class505.field7381[arg0];
                int var7 = this.field7641 * var5 >> 12;
                int var8 = this.field7637 * var6 >> 12;
                int var9 = var5 % (4096 / this.field7641) * this.field7641;
                int var10 = var6 % (4096 / this.field7637) * this.field7637;
                if (var10 < this.field7635) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field7635) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field7635) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
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
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
    public class522() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
    public static void method3108(byte arg0) {
        field7634 = null;
        field7636 = null;
        if (arg0 > -111) {
            field7636 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILul;)I")
    public static final int method3109(int arg0, class406 arg1) {
        ++field7638;
        if (arg0 >= -124) {
            field7634 = null;
        }
        int var2 = 0;
        if (arg1.method2556((byte) 21, class227.field3701)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class175.field2599)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field7635 = arg2.method1511(-26);
                }
            } else {
                this.field7637 = arg2.method1515((byte) 122);
            }
        } else {
            this.field7641 = arg2.method1515((byte) 125);
        }
        int var5 = -55 / ((82 - arg0) / 40);
        ++field7633;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIZIZI)V")
    public static final void method3110(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        ++field7632;
        if (arg0 != 1) {
            field7636 = null;
        }
        if (arg4 > arg2) {
            int var7 = (arg2 - -arg4) / 2;
            int var8 = arg2;
            class445 var9 = class210.field3428[var7];
            class210.field3428[var7] = class210.field3428[arg4];
            class210.field3428[arg4] = var9;
            for (int var10 = arg2; ~arg4 < ~var10; ++var10) {
                if (class442.method2713(arg5, 0, arg6, var9, class210.field3428[var10], arg3, arg1) <= 0) {
                    class445 var11 = class210.field3428[var10];
                    class210.field3428[var10] = class210.field3428[var8];
                    class210.field3428[var8++] = var11;
                }
            }
            class210.field3428[arg4] = class210.field3428[var8];
            class210.field3428[var8] = var9;
            method3110(1, arg1, arg2, arg3, var8 - 1, arg5, arg6);
            method3110(arg0, arg1, var8 + 1, arg3, arg4, arg5, arg6);
        }
    }
}
