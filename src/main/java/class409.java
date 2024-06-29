import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class409 extends class601 {

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    private int field5426 = 4096;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "Lfca;")
    public static class661 field5429 = new class661();

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "Lgh;")
    public static class54 field5430 = new class54(7, 0, 1, 1);

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field5431 = -1;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Lho;")
    public static class222 field5432;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class409() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field5424;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 >= -76) {
            field5432 = null;
        }
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0 + -1 & class104.field1388, 27123, 0);
            int[] var5 = this.method3243(arg0, 27123, 0);
            int[] var6 = this.method3243(class104.field1388 & arg0 + 1, 27123, 0);
            for (int var7 = 0; var7 < class418.field5518; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field5426;
                int var9 = (var5[class511.field6519 & var7 + 1] + -var5[class511.field6519 & var7 + -1]) * this.field5426;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = -86 % ((arg2 - 40) / 52);
        ++field5425;
        if (~arg1 == -1) {
            this.field5426 = arg0.method1553((byte) 28);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBII)V")
    public static final void method2375(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field5427;
        if (~arg0 != -9 && arg0 != 16) {
            class766 var5 = class28.field252[arg4][arg3][arg1];
            if (var5 != null) {
                if (arg0 == 1) {
                    var5.field10427 = 0;
                } else if (~arg0 == -3) {
                    var5.field10429 = 0;
                }
            }
            class70.method417(2);
        } else {
            for (int var6 = 0; ~class164.field2177 < ~var6; ++var6) {
                class318 var8 = class763.field10388[var6];
                if (~var8.field3964 == ~arg0 && ~var8.field3961 == ~arg3 && ~var8.field3957 == ~arg1 || var8.field3963 == arg3 && ~var8.field3957 == ~arg1) {
                    if (~class164.field2177 != ~var6) {
                        class642.method3474(class763.field10388, var6 + 1, class763.field10388, var6, -var6 - 1 + class763.field10388.length);
                    }
                    --class164.field2177;
                    return;
                }
            }
        }
        int var7 = 30 % ((-15 - arg2) / 58);
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static final void method2376(int arg0) {
        if (arg0 == 4096) {
            ++field5428;
            if (class332.field4052 == 9) {
                class26.method113((byte) 95, 5);
            } else {
                if (~class332.field4052 != -6 && ~class332.field4052 != -7) {
                    if (class332.field4052 == 12) {
                        class26.method113((byte) 95, 3);
                        return;
                    }
                } else {
                    class26.method113((byte) 95, 3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public static void method2377(byte arg0) {
        if (arg0 > 26) {
            field5432 = null;
            field5430 = null;
            field5429 = null;
        }
    }
}
