import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class453 extends class748 {

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
    private int field6235 = 4096;

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "Ljf;")
    public static class640 field6240 = new class640(6, 7);

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "Ljava/lang/String;")
    public static String field6244 = null;

    @OriginalMember(owner = "client!oaa", name = "P", descriptor = "F")
    public static float field6242;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!oaa", name = "K", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(III)Z", line = 3)
    public static final boolean method2727(int arg0, int arg1, int arg2) {
        if (arg0 < 57) {
            method2727(-64, 91, 102);
        }
        ++field6241;
        return ~(arg1 & 52) != -1;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V", line = 19)
    public class453() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Z)V", line = 23)
    public static void method2728(boolean arg0) {
        field6240 = null;
        if (!arg0) {
            method2730(-121, 36);
        }
        field6244 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)[I", line = 35)
    public final int[] method25(int arg0, int arg1) {
        ++field6238;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field10407.field9527) {
                int[] var4 = this.method4157(0, (byte) 54, class150.field2077 & arg0 - 1);
                int[] var5 = this.method4157(0, (byte) 102, arg0);
                int[] var6 = this.method4157(0, (byte) 95, arg0 + 1 & class150.field2077);
                for (int var7 = 0; var7 < class424.field5889; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field6235;
                    int var9 = (var5[class354.field4552 & var7 - -1] + -var5[var7 + -1 & class354.field4552]) * this.field6235;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)) * 4096.0D);
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBILfha;Lha;)V", line = 92)
    public static final void method2729(int arg0, byte arg1, int arg2, class522 arg3, class545 arg4) {
        class19.field235.method3122(0);
        ++field6236;
        if (!class464.field6348) {
            int var5 = 60 / ((arg1 - -27) / 53);
            for (class753 var6 = (class753) arg3.method3118((byte) 73); var6 != null; var6 = (class753) arg3.method3111(120)) {
                class185 var7 = class531.field7421.method1971(var6.field10459, -23851);
                if (class228.method1476(var7, 65408)) {
                    boolean var8 = class365.method2052(arg2, var7, 24172, arg0, arg4, var6);
                    if (var8) {
                        class488.method2856((byte) 76, var6, var7, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(II)V", line = 124)
    public static final void method2730(int arg0, int arg1) {
        ++field6239;
        if (arg1 != 7943) {
            field6240 = null;
        }
        class477.field6508 = new int[arg0];
        class5.field27 = new int[arg0];
        class611.field8693 = new int[arg0];
        class504.field7062 = new int[arg0];
        class405.field5619 = new int[arg0];
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZLvj;)V", line = 140)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field6237;
        if (!arg1) {
            if (~arg0 == -1) {
                this.field6235 = arg2.method193(2);
            }
        }
    }
}
