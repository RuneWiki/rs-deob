import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class484 extends class71 {

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "[B")
    public byte[] field6744;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Z")
    public static boolean field6743 = false;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILpn;Lpn;)V")
    public static final void method2945(int arg0, int arg1, int arg2, class91 arg3, class91 arg4) {
        class262 var5 = class670.method3779(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field3845 = arg3;
        var5.field3842 = arg4;
        int var6 = class433.field6043 == class371.field5240 ? 1 : 0;
        if (!arg3.method783(0)) {
            arg3.field4412 = class204.field2694[var6];
            class204.field2694[var6] = arg3;
        } else if (arg3.method785(-126)) {
            arg3.field4412 = class333.field4710[var6];
            class333.field4710[var6] = arg3;
        } else {
            arg3.field4412 = class234.field3474[var6];
            class234.field3474[var6] = arg3;
            class569.field7870 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method783(0)) {
            if (arg4.method785(-125)) {
                arg4.field4412 = class333.field4710[var6];
                class333.field4710[var6] = arg4;
                return;
            }
            arg4.field4412 = class234.field3474[var6];
            class234.field3474[var6] = arg4;
            class569.field7870 = true;
            return;
        }
        arg4.field4412 = class204.field2694[var6];
        class204.field2694[var6] = arg4;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[[[Lve;)V")
    public static final void method2946(int arg0, class262[][][] arg1) {
        for (int var2 = arg0; var2 < arg1.length; var2++) {
            class262[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class262 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3844 instanceof class722) {
                            ((class722) var6.field3844).method795(67);
                        }
                        if (var6.field3841 instanceof class722) {
                            ((class722) var6.field3841).method795(arg0 ^ 0x34);
                        }
                        if (var6.field3850 instanceof class722) {
                            ((class722) var6.field3850).method795(arg0 + 35);
                        }
                        if (var6.field3845 instanceof class722) {
                            ((class722) var6.field3845).method795(arg0 ^ 0x5C);
                        }
                        if (var6.field3842 instanceof class722) {
                            ((class722) var6.field3842).method795(117);
                        }
                        for (class638 var7 = var6.field3846; var7 != null; var7 = var7.field8564) {
                            class395 var8 = var7.field8567;
                            if (var8 instanceof class722) {
                                ((class722) var8).method795(111);
                            }
                        }
                    }
                }
            }
        }
        field6742++;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Luu;Luu;Luu;Lefa;ZLaea;)Z")
    public static final boolean method2947(class237 arg0, class237 arg1, class237 arg2, class531 arg3, boolean arg4, class261 arg5) {
        class240.field3592 = new int[16];
        class71.field1080 = arg0;
        if (arg4) {
            field6743 = true;
        }
        field6746++;
        class291.field4177 = arg1;
        class562.field7809 = arg2;
        class149.field2066 = arg5;
        class685.field9520 = arg3;
        for (int var6 = 0; var6 < 16; var6++) {
            class240.field3592[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "([B)V")
    public class484(byte[] arg0) {
        this.field6744 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZB)V")
    public static final void method2948(boolean arg0, byte arg1) {
        field6745++;
        class601.field8132.method900(class496.field6948.method1385());
        int[] var2 = class496.field6948.method1407();
        class683.field9497 = var2[0];
        class606.field8184 = var2[3];
        if (arg1 > -52) {
            return;
        }
        class655.field8753 = var2[2];
        class726.field10055 = var2[1];
        if (arg0) {
            class496.field6948.method1421(class229.field3083, class30.field364, class371.field5242, class244.field3620);
            class523.method3114(0, class291.field4182);
        } else {
            class496.field6948.method1421(class385.field5531, class124.field1715, class84.field1199, class312.field4338);
            class523.method3114(0, class263.field3858);
        }
    }
}
