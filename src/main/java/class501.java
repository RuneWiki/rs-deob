import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class501 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field7514 = 0;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field7516 = -1;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public int field7513;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public int field7518;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public int field7520;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public int field7521;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public int field7522;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public int field7523;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[B")
    public byte[] field7511;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[B")
    public byte[] field7519;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIF[FIIFIIFIIB)V")
    public static final void method3053(int arg0, int arg1, float arg2, float[] arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10, int arg11, byte arg12) {
        int var13 = arg10 - arg0;
        field7517++;
        int var14 = arg1 - arg4;
        int var15 = arg11 - arg8;
        float var16 = arg3[2] * (float) var14 + arg3[1] * (float) var13 + arg3[0] * (float) var15;
        float var17 = arg3[5] * (float) var14 + arg3[4] * (float) var13 + arg3[3] * (float) var15;
        float var18 = arg3[8] * (float) var14 + arg3[7] * (float) var13 + arg3[6] * (float) var15;
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg6 + 0.5F - var18;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 1) {
            var19 = arg6 + var18 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 2) {
            var19 = arg9 + 0.5F - var17;
            var20 = arg2 + 0.5F - var16;
        } else if (arg7 == 3) {
            var19 = arg9 + 0.5F - var17;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 4) {
            var20 = arg6 + var18 + 0.5F;
            var19 = arg9 + 0.5F - var17;
        } else {
            var20 = arg6 + 0.5F - var18;
            var19 = arg9 + 0.5F - var17;
        }
        if (arg12 <= 101) {
            method3053(41, -122, 0.21006091F, null, -98, -99, -1.1784879F, 29, -86, -0.77117115F, 62, 27, (byte) -50);
        }
        if (arg5 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg5 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg5 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class220.field3726 = var20;
        class436.field6586 = var19;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(JB)V")
    public static final void method3054(long arg0, byte arg1) {
        if (class217.field3699 != null) {
            if (class334.field5222 == 1 || class334.field5222 == 5) {
                class312.method2095(320, arg0);
            } else if (class334.field5222 == 4) {
                class216.method1595(0, arg0);
            }
        }
        field7515++;
        class284.method1915((long) class88.field1278, false, class19.field198);
        if (class509.field7597 != -1) {
            class345.method2281(class509.field7597, -126);
        }
        int var3 = -52 % ((arg1 - 28) / 35);
        for (int var4 = 0; var4 < class126.field1703; var4++) {
            if (class520.field7707[var4]) {
                class98.field1414[var4] = true;
            }
            class442.field6875[var4] = class520.field7707[var4];
            class520.field7707[var4] = false;
        }
        class231.field3821 = class88.field1278;
        if (class19.field198.method1267()) {
            class294.field4634 = true;
        }
        if (class509.field7597 != -1) {
            class126.field1703 = 0;
            class298.method1999(true);
        }
        class19.field198.method1228();
        class167.method1054(0, class19.field198);
        int var5 = class291.method1958(true);
        if (var5 == -1) {
            var5 = class436.field6587;
        }
        if (var5 == -1) {
            var5 = class86.field1254;
        }
        class456.method2860(var5, -117);
        class67.method484(class358.field5565.field6417, class358.field5565.field6419, class358.field5565.field6410, class376.field5786, -124);
        class376.field5786 = 0;
    }
}
