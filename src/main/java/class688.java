import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class688 {

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "[S")
    public short[] field9566;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "[I")
    public int[] field9565;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "J")
    public long field9572;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "[S")
    public short[] field9575;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[I")
    public static int[] field9569 = new int[1];

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "Lst;")
    public static class335 field9577 = new class335(43, -1);

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Ljn;")
    public static class324 field9578 = new class324(12, 0, 1, 0);

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field9579 = 0;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public static int field9580 = 0;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "F")
    public static float field9571;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field9576;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(JI)V")
    public static final void method3874(long arg0, int arg1) {
        field9567++;
        if (arg1 != -7375) {
            method3879((byte) 18);
        }
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class70.method545(arg0 - 1L, arg1 + 7494);
            class70.method545(1L, arg1 ^ 0xFFFFE343);
        } else {
            class70.method545(arg0, 115);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)[Lub;")
    public static final class83[] method3875(int arg0) {
        field9573++;
        if (arg0 > -70) {
            return null;
        }
        if (class535.field7420 == null) {
            class83[] var1 = class87.method609(class159.field2227, 2);
            class83[] var2 = new class83[var1.length];
            int var3 = 0;
            int var4 = class332.field4707.field4758.method2724(0);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class83 var9 = var1[var5];
                if ((var9.field1185 <= 0 || var9.field1185 >= 24) && var9.field1187 >= 800 && var9.field1186 >= 600 && (var4 != 2 || var9.field1187 <= 800 && var9.field1186 <= 600) && (var4 != 1 || var9.field1187 <= 1024 && var9.field1186 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class83 var11 = var2[var10];
                        if (var9.field1187 == var11.field1187 && var9.field1186 == var11.field1186) {
                            if (var9.field1185 > var11.field1185) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class535.field7420 = new class83[var3];
            class245.method1649(var2, 0, class535.field7420, 0, var3);
            int[] var6 = new int[class535.field7420.length];
            for (int var7 = 0; var7 < class535.field7420.length; var7++) {
                class83 var8 = class535.field7420[var7];
                var6[var7] = var8.field1187 * var8.field1186;
            }
            class339.method2163(-1, class535.field7420, var6);
        }
        return class535.field7420;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)V")
    public static final void method3876(int arg0) {
        class57.field825 = null;
        field9574++;
        if (class222.field3009 && class710.method3997(3) != 1) {
            class8.method39(class102.field1401 == 3 || class102.field1401 == 7, class570.method3343(true), arg0 ^ 0xD53E7EE2, 0, 0, class150.method955(0));
        }
        int var1 = 0;
        if (arg0 != -15701) {
            method3878((byte) -45, null);
        }
        int var2 = 0;
        if (class222.field3009) {
            var1 = class580.method3374(24188);
            var2 = class721.method4038(true);
        }
        class485.method2950(class553.field7716 + var2, -1, var1, class118.field1561 + var1, class544.field7545, var2, var2, var1, 0);
        if (class57.field825 != null) {
            class217.method1276(class715.field9976, class553.field7716 + var2, class344.field4904.field10476, class697.field9741, var1, var2, true, -1412584499, -1412584499, class57.field825, class118.field1561 + var1);
            class57.field825 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method3877(byte arg0) {
        field9577 = null;
        field9569 = null;
        if (arg0 != -74) {
            method3874(38L, -104);
        }
        field9578 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLni;)V")
    public static final void method3878(byte arg0, class515 arg1) {
        field9570++;
        int var2 = arg1.field7107 - class483.field6741;
        if (arg0 != -50) {
            return;
        }
        int var3 = arg1.field7129 * 512 + (arg1.method662((byte) 15) * 256);
        int var4 = arg1.field7140 * 512 + arg1.method662((byte) 15) * 256;
        arg1.field4418 += (var4 - arg1.field4418) / var2;
        arg1.field4410 += (var3 - arg1.field4410) / var2;
        arg1.field7201 = 0;
        if (arg1.field7101 == 0) {
            arg1.method3086(8192, 29);
        }
        if (arg1.field7101 == 1) {
            arg1.method3086(12288, 1);
        }
        if (arg1.field7101 == 2) {
            arg1.method3086(0, arg0 ^ 0xFFFFFFA1);
        }
        if (arg1.field7101 == 3) {
            arg1.method3086(4096, -96);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
    public static final void method3879(byte arg0) {
        field9568++;
        int var1 = class209.field2736;
        if (arg0 < 10) {
            method3874(70L, -81);
        }
        int[] var2 = class344.field4898;
        for (int var3 = 0; var3 < var1; var3++) {
            class96 var4 = class251.field3675[var2[var3]];
            if (var4 != null) {
                class714.method4012(var4.method662((byte) 15), var4, 12309);
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(J[I[S[S)V")
    public class688(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field9566 = arg3;
        this.field9565 = arg1;
        this.field9572 = arg0;
        this.field9575 = arg2;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
    protected class688() {
    }
}
