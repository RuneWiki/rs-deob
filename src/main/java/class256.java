import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class256 extends class177 {

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    private int field3820 = 1;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    private int field3824 = 204;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    private int field3823 = 1;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3821 = "M";

    @OriginalMember(owner = "client!u", name = "L", descriptor = "F")
    public static float field3825;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Lcn;")
    public static class267 field3818;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 3)
    public class256() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V", line = 19)
    public static void method1783(boolean arg0) {
        field3821 = null;
        field3818 = null;
        if (!arg0) {
            method1783(false);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I", line = 40)
    public final int[] method95(int arg0, int arg1) {
        if (arg0 >= -52) {
            field3821 = (String) null;
        }
        field3817++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -63);
        if (this.field2652.field3287) {
            for (int var4 = 0; var4 < class287.field4415; var4++) {
                int var5 = class260.field3858[arg1];
                int var6 = this.field3823 * var5 >> 12;
                int var7 = class179.field2684[var4];
                int var8 = var7 % (4096 / this.field3820) * this.field3820;
                int var9 = this.field3820 * var7 >> 12;
                int var10 = var5 % (4096 / this.field3823) * this.field3823;
                if (this.field3824 > var10) {
                    for (var9 -= var6; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field3824) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3824 > var8) {
                    int var11;
                    for (var11 = var9 - var6; var11 < 0; var11 += 4) {
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

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lhb;II)V", line = 137)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3820 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field3823 = arg0.method273(65280);
        } else if (arg2 == 2) {
            this.field3824 = arg0.method300(-1394191632);
        }
        field3819++;
        if (arg1 != -18061) {
            this.field3823 = 45;
        }
    }
}
