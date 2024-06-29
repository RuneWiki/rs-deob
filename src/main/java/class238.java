import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class238 extends class209 {

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Lnf;")
    public static class162 field3751 = new class162(64);

    @OriginalMember(owner = "client!me", name = "N", descriptor = "[J")
    public static long[] field3762 = new long[200];

    @OriginalMember(owner = "client!me", name = "L", descriptor = "C")
    private char field3760;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "F")
    public static float field3757;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Ljava/lang/String;")
    public String field3755;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lha;II)V")
    private final void method1626(class31 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field3760 = class31.method292(-25717, arg0.method266(arg1 ^ 0x81));
        } else if (arg2 == 2) {
            this.field3753 = arg0.method300((byte) -30);
        } else if (arg2 == 5) {
            this.field3755 = arg0.method262(arg1 ^ 0xFFFFD384);
        }
        field3761++;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static final void method1627(int arg0) {
        field3754++;
        for (int var1 = arg0; var1 < class274.field4367; var1++) {
            int var10002 = class48.field792[var1]--;
            if (class48.field792[var1] >= -10) {
                class71 var3 = class164.field2488[var1];
                if (var3 == null) {
                    var3 = class71.method567(class150.field2231, class181.field2842[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class48.field792[var1] += var3.method564();
                    class164.field2488[var1] = var3;
                }
                if (class48.field792[var1] < 0) {
                    int var4;
                    if (class63.field994[var1] == 0) {
                        var4 = class303.field4868[var1] * class174.field2684 >> 8;
                    } else {
                        int var5 = (class63.field994[var1] & 0xFF) * 128;
                        int var6 = (class63.field994[var1] & 0xFF797C) >> 16;
                        int var7 = class63.field994[var1] >> 8 & 0xFF;
                        int var8 = var6 * 128 + 64 - class263.field4168.field4725;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 * 128 + 64 - class263.field4168.field4709;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var5 < var10) {
                            class48.field792[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = class303.field4868[var1] * class70.field1106 * (var5 - var10) / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class90 var11 = var3.method565().method689(class182.field2875);
                        class119 var12 = class119.method869(var11, 100, var4);
                        var12.method878(class98.field1567[var1] - 1);
                        class83.field1251.method244(var12);
                    }
                    class48.field792[var1] = -100;
                }
            } else {
                class274.field4367--;
                for (int var2 = var1; var2 < class274.field4367; var2++) {
                    class181.field2842[var2] = class181.field2842[var2 + 1];
                    class164.field2488[var2] = class164.field2488[var2 + 1];
                    class98.field1567[var2] = class98.field1567[var2 + 1];
                    class48.field792[var2] = class48.field792[var2 + 1];
                    class63.field994[var2] = class63.field994[var2 + 1];
                    class303.field4868[var2] = class303.field4868[var2 + 1];
                }
                var1--;
            }
        }
        if (class41.field697 && !class257.method1735((byte) 111)) {
            if (class85.field1274 != 0 && class75.field1164 != -1) {
                class104.method791(0, class75.field1164, false, 93, class205.field3153, class85.field1274);
            }
            class41.field697 = false;
        } else if (class85.field1274 != 0 && class75.field1164 != -1 && !class257.method1735((byte) 118)) {
            class240.field3826.method1762(155, true);
            class240.field3826.method258(class75.field1164, -1527329320);
            class75.field1164 = -1;
            class292.field4525++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lha;B)V")
    public final void method1628(class31 arg0, byte arg1) {
        if (arg1 != 44) {
            return;
        }
        field3758++;
        while (true) {
            int var3 = arg0.method265(-102);
            if (var3 == 0) {
                return;
            }
            this.method1626(arg0, -2, var3);
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static void method1629(int arg0) {
        field3762 = null;
        if (arg0 >= -78) {
            field3752 = -91;
        }
        field3751 = null;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static final void method1630(byte arg0) {
        field3750++;
        if (field3757 > class247.field3932) {
            class247.field3932 = (float) ((double) class247.field3932 / 30.0D + (double) class247.field3932);
            if (field3757 < class247.field3932) {
                class247.field3932 = field3757;
            }
            class195.method1395(arg0 ^ 0xFFFF8FA1);
        } else if (field3757 < class247.field3932) {
            class247.field3932 = (float) ((double) class247.field3932 - (double) class247.field3932 / 30.0D);
            if (field3757 > class247.field3932) {
                class247.field3932 = field3757;
            }
            class195.method1395(28690);
        }
        if (class232.field3674 != -1 && class254.field4063 != -1) {
            int var1 = class232.field3674 - class129.field1920;
            int var2 = class254.field4063 - class175.field2698;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class129.field1920 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class175.field2698 += var2;
            if (var1 == 0 && var2 == 0) {
                class232.field3674 = -1;
                class254.field4063 = -1;
            }
            class195.method1395(arg0 + 28767);
        }
        if (arg0 != -77) {
            method1630((byte) 82);
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z")
    public final boolean method1631(int arg0) {
        field3756++;
        if (arg0 != -116) {
            method1627(63);
        }
        return this.field3760 == 's';
    }
}
