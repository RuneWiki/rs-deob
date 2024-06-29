import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class673 extends class56 {

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "I")
    private int field9232 = 4096;

    @OriginalMember(owner = "client!nia", name = "D", descriptor = "Ldj;")
    public static class362 field9230 = new class362(64);

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!nia", name = "G", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)V", line = 5)
    public static void method3781(int arg0) {
        field9230 = null;
        if (arg0 > -58) {
            field9234 = -60;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(BILes;)V", line = 15)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 == 0) {
            this.field9232 = arg2.method2390((byte) -98);
        }
        if (arg0 > -44) {
            this.method145(-6, -59);
        }
        ++field9235;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)[I", line = 29)
    public final int[] method145(int arg0, int arg1) {
        ++field9231;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            field9230 = null;
        }
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, class75.field1037 & arg1 - 1, (byte) 120);
            int[] var5 = this.method492(0, arg1, (byte) 65);
            int[] var6 = this.method492(0, class75.field1037 & arg1 + 1, (byte) 67);
            for (int var7 = 0; ~var7 > ~class642.field8759; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field9232;
                int var9 = (var5[class446.field5990 & var7 + 1] - var5[var7 + -1 & class446.field5990]) * this.field9232;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(II)I", line = 86)
    public static final int method3782(int arg0, int arg1) {
        ++field9233;
        return arg0 != 1990162540 ? -95 : arg1 & 127;
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "()V", line = 100)
    public class673() {
        super(1, true);
    }
}
