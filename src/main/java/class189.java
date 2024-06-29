import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class189 extends class71 {

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    private int field3416 = 204;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    private int field3412 = 1;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    private int field3418 = 1;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Lud;")
    public static class279 field3419 = class130.method1024("::clientjs5drop", 255);

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IB)[I", line = 8)
    public final int[] method199(int arg0, byte arg1) {
        field3417++;
        if (arg1 >= -69) {
            this.field3416 = -62;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            for (int var4 = 0; var4 < class215.field3787; var4++) {
                int var5 = class200.field3574[arg0];
                int var6 = class133.field2424[var4];
                int var7 = this.field3412 * var5 >> 12;
                int var8 = var6 % (4096 / this.field3418) * this.field3418;
                int var9 = this.field3418 * var6 >> 12;
                int var10 = var5 % (4096 / this.field3412) * this.field3412;
                if (var10 < this.field3416) {
                    for (var9 -= var7; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field3416 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field3416) {
                    int var11;
                    for (var11 = var9 - var7; var11 < 0; var11 += 4) {
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

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V", line = 94)
    public static void method1439(int arg0) {
        if (arg0 != 4096) {
            method1441((byte) 4, 88);
        }
        field3419 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)I", line = 108)
    public static final int method1440(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field3415++;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != 1) {
            method1440(24, -44);
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 138)
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)V", line = 142)
    public static final void method1441(byte arg0, int arg1) {
        class101.field1887.method1339(arg1, 19326);
        field3410++;
        if (arg0 <= 82) {
            field3419 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZLvh;)V", line = 163)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            this.field3412 = -64;
        }
        if (arg0 == 0) {
            this.field3418 = arg2.method483(-119);
        } else if (arg0 == 1) {
            this.field3412 = arg2.method483(-107);
        } else if (arg0 == 2) {
            this.field3416 = arg2.method468(28214);
        }
        field3411++;
    }
}
