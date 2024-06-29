import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class689 extends class258 {

    @OriginalMember(owner = "client!mia", name = "p", descriptor = "[F")
    public static float[] field8849 = new float[16384];

    @OriginalMember(owner = "client!mia", name = "o", descriptor = "[F")
    public static float[] field8848 = new float[16384];

    @OriginalMember(owner = "client!mia", name = "s", descriptor = "Z")
    public static boolean field8852 = true;

    @OriginalMember(owner = "client!mia", name = "x", descriptor = "Z")
    public static boolean field8857 = false;

    @OriginalMember(owner = "client!mia", name = "y", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!mia", name = "A", descriptor = "[F")
    public static float[] field8860;

    @OriginalMember(owner = "client!mia", name = "m", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!mia", name = "n", descriptor = "I")
    private int field8847;

    @OriginalMember(owner = "client!mia", name = "q", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!mia", name = "r", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!mia", name = "t", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!mia", name = "v", descriptor = "I")
    private int field8855;

    @OriginalMember(owner = "client!mia", name = "w", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!mia", name = "u", descriptor = "[Lpu;")
    public static class772[] field8854;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lk;I)Z")
    public static final boolean method3679(class66 arg0, int arg1) {
        field8859++;
        int var2 = -90 / ((arg1 + 22) / 58);
        return class549.field6880 == arg0 || class561.field7132 == arg0 || class620.field7843 == arg0 || class254.field3449 == arg0 || class520.field6611 == arg0;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BZI)Lpi;")
    public static final class266 method3680(byte arg0, boolean arg1, int arg2) {
        field8851++;
        class151[] var3 = class719.field9450;
        synchronized (class719.field9450) {
            class266 var4;
            if (arg2 >= class719.field9450.length || class719.field9450[arg2].method861((byte) -80)) {
                var4 = new class266();
                var4.field3533 = new class706[arg2];
                for (int var5 = 0; var5 < arg2; var5++) {
                    var4.field3533[var5] = new class706();
                }
            } else {
                var4 = (class266) class719.field9450[arg2].method860((byte) 30);
                var4.method3306(false);
                int var10002 = class318.field3970[arg2]--;
            }
            if (arg0 == -15) {
                var4.field3527 = arg1;
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        arg0.method3535(this.field8847, 4, this.field8855);
        field8856++;
        if (arg1 <= 123) {
            this.method546((byte) 116, null);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILwm;)V")
    public static final void method3681(int arg0, class30 arg1) {
        class615.field7806 = arg1;
        if (arg0 != 0) {
            field8852 = false;
        }
        field8853++;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIII[B[BIII)V")
    public static final void method3682(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field8846++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg2 & arg7);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] - arg4[arg8++]);
                int var14 = arg1++;
                arg5[var14] = (byte) (arg5[var14] - arg4[arg8++]);
                int var15 = arg1++;
                arg5[var15] = (byte) (arg5[var15] - arg4[arg8++]);
                int var16 = arg1++;
                arg5[var16] = (byte) (arg5[var16] - arg4[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg5[var10001] = (byte) (arg5[var10001] - arg4[arg8++]);
            }
            arg1 += arg6;
            arg8 += arg3;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        int var3 = 6 % ((arg0 - 7) / 41);
        field8850++;
        this.field8855 = arg1.method1497((byte) 44);
        this.field8847 = arg1.method1497((byte) 85);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)V")
    public static void method3683(int arg0) {
        field8848 = null;
        if (arg0 > -59) {
            field8857 = true;
        }
        field8860 = null;
        field8854 = null;
        field8849 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8849[var2] = (float) Math.sin((double) var2 * var0);
            field8848[var2] = (float) Math.cos((double) var2 * var0);
        }
        field8858 = 0;
        field8860 = new float[4];
    }
}
