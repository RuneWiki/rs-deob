import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class622 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Lne;")
    public static class336 field8739 = new class336("LIVE", "", "", 0);

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "()V", line = 3)
    public static final void method3585() {
        if (class385.field5312 != null) {
            for (int var0 = 0; var0 < class385.field5312.length; var0++) {
                for (int var1 = 0; var1 < class81.field902; var1++) {
                    for (int var2 = 0; var2 < class48.field615; var2++) {
                        if (class385.field5312[var0][var1][var2] != null) {
                            class385.field5312[var0][var1][var2].method334(-49);
                        }
                        class385.field5312[var0][var1][var2] = null;
                    }
                }
            }
        }
        class385.field5312 = null;
        class411.field5572 = null;
        if (class356.field5006 != null) {
            for (int var3 = 0; var3 < class356.field5006.length; var3++) {
                for (int var4 = 0; var4 < class81.field902; var4++) {
                    for (int var5 = 0; var5 < class48.field615; var5++) {
                        if (class356.field5006[var3][var4][var5] != null) {
                            class356.field5006[var3][var4][var5].method334(-75);
                        }
                        class356.field5006[var3][var4][var5] = null;
                    }
                }
            }
        }
        class356.field5006 = null;
        class774.field10642 = null;
        class767.field10562 = null;
        class208.field3219 = null;
        class735.field10157 = null;
        class281.field4084 = null;
        class103.field1193 = null;
        class631.field8875 = null;
        class760.field10485 = null;
        class706.method3992(true);
        if (class184.field2830 != null) {
            for (int var6 = 0; var6 < class309.field4423; var6++) {
                class184.field2830[var6] = null;
            }
            class309.field4423 = 0;
        }
        class745.field10328 = null;
        class338.field4733 = null;
        class695.field9711 = null;
        if (class216.field3344 != null) {
            for (int var7 = 0; var7 < class216.field3344.length; var7++) {
                class216.field3344[var7] = null;
            }
            class536.field7716 = 0;
        }
        if (class586.field8280 != null) {
            for (int var8 = 0; var8 < class586.field8280.length; var8++) {
                class586.field8280[var8] = null;
            }
            class215.field3321 = 0;
        }
        if (class603.field8444 != null) {
            for (int var9 = 0; var9 < class97.field1103; var9++) {
                class603.field8444[var9] = null;
            }
            for (int var10 = 0; var10 < class562.field7990; var10++) {
                for (int var11 = 0; var11 < class81.field902; var11++) {
                    for (int var12 = 0; var12 < class48.field615; var12++) {
                        class143.field2105[var10][var11][var12] = 0L;
                    }
                }
            }
            class97.field1103 = 0;
        }
        class404.method2486(38);
        class510.field7211 = class510.field7212;
        class510.field7211.method2451((byte) 127);
        class190.field2943 = null;
        class392.field5398 = null;
        class721.field9985 = null;
        if (class16.field297 != null) {
            class591.method3439();
            class228.field3494.method497(1);
            class228.field3494.method519(0);
        }
        if (class747.field10352 != null) {
            class747.field10352 = null;
        }
        class228.field3494 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)V", line = 174)
    public static final void method3586(byte arg0, int arg1) {
        class680.field9442 = arg1;
        field8738++;
        class474.field6644.method3735(2);
        int var2 = 90 / ((15 - arg0) / 53);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILvn;I)V", line = 186)
    public static final void method3587(int arg0, class330 arg1, int arg2) {
        if (arg2 != -20365) {
            field8739 = null;
        }
        if (arg1.field4609 != null) {
            int var3 = arg1.field4609[arg0 + 1];
            if (arg1.field4604 != var3) {
                arg1.field4603 = 0;
                arg1.field4604 = var3;
                arg1.field4583 = 0;
                arg1.field4675 = arg1.field4668;
                arg1.field4575 = 0;
                arg1.field4657 = 1;
                if (arg1.field4604 != -1) {
                    class760.method4227(arg2 ^ 0xFFFFB08C, arg1, class563.field7993.method651(arg1.field4604, (byte) 99), arg1.field4583);
                }
            }
        }
        field8741++;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 216)
    public static void method3588(int arg0) {
        field8739 = null;
        if (arg0 != 0) {
            field8742 = -117;
        }
    }
}
