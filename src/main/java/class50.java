import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class50 extends class297 {

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field759 = 0;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "Lwd;")
    public static class88 field760;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[[[B")
    public static byte[][][] field766;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 4)
    public static final void method417(int arg0) {
        field765++;
        if (arg0 != 4096) {
            method417(19);
        }
        class66.field979.method2283((byte) 77);
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V", line = 15)
    public static void method418(int arg0) {
        field760 = null;
        if (arg0 != 0) {
            field759 = 124;
        }
        field766 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 27)
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILaj;)V", line = 35)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field763++;
        if (arg0 == 0) {
            this.field4762 = arg2.method15((byte) 104) == 1;
        }
        if (arg1 != 255) {
            field762 = 20;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)[I", line = 51)
    public final int[] method173(int arg0, boolean arg1) {
        field758++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 81, 0);
            for (int var5 = 0; var5 < class31.field491; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        if (!arg1) {
            method417(106);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I", line = 86)
    public final int[][] method172(int arg0, byte arg1) {
        if (arg1 != 63) {
            method418(23);
        }
        field764++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, 2, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class31.field491; var11++) {
                var7[var11] = 4096 - var6[var11];
                var8[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var9[var11];
            }
        }
        return var3;
    }
}
