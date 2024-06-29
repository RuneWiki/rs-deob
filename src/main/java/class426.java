import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class426 extends class349 {

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "Z")
    public static boolean field5921 = false;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public static int field5923 = -1;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "Lnl;")
    public static class50 field5922 = new class50(3);

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field5928 = 0;

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "Z")
    public static boolean field5927 = false;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "Lta;")
    public static class301 field5926;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "Lek;")
    public static class540 field5925;

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class426() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field5924;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[][] var4 = this.method2180(0, 29, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class39.field497; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        int var9 = 6 % ((56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)V")
    public static void method2456(int arg0) {
        field5926 = null;
        field5925 = null;
        if (arg0 < 88) {
            field5927 = true;
        }
        field5922 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIZI)V")
    public static final void method2457(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field5920;
        if (~class161.field2038 != -1) {
            class30.field297 = class161.field2038;
            class564.method3180(0, (byte) 72);
        } else {
            class227.method1389(64, false);
        }
        class141.field1799 = arg3;
        class309.field4144 = arg2;
        class582.field8026 = arg4;
        if (arg0 > 103) {
            class561.method3167(arg1);
        }
    }
}
