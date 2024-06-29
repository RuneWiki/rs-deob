import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class294 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public int field5025 = -1;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Ls;")
    public static class261 field5028 = new class261(64);

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lmh;")
    private static class128 field5032 = class22.method156(122, "flash2:");

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lmh;")
    public static class128 field5033 = field5032;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lmh;")
    public static class128 field5034 = field5032;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lmh;")
    public static class128 field5029 = class22.method156(122, "(Y<)4col>");

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lre;")
    public class266 field5024;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Ldj;")
    public static class314 field5037;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "[I")
    public int[] field5030;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "[Lmh;")
    public class128[] field5035;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[Lfb;")
    public static class55[] field5036;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I", line = 13)
    public static final int method2012(int arg0, int arg1) {
        field5026++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg0 != 4) {
            field5028 = (class261) null;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIII)V", line = 59)
    public static final void method2013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5031++;
        if (arg0 == arg1) {
            class191.method1283(128, arg2, arg4, arg1, arg3, arg5, arg6);
            return;
        }
        if (arg4 - arg1 >= class193.field3335 && class43.field875 >= (arg1 + arg4) && class70.field1315 <= (arg6 - arg0) && (arg0 + arg6) <= class181.field3173) {
            class188.method1264(arg3, arg0, arg6, arg2, arg4, arg5, -25, arg1);
        } else {
            class181.method1235(-1, arg6, arg5, arg4, arg1, arg3, arg0, arg2);
        }
        if (arg7 <= 122) {
            method2013(-75, -76, 81, -96, 50, 49, -81, 127);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILmh;)V", line = 92)
    public static final void method2014(int arg0, class128 arg1) {
        field5027++;
        if (class226.field3943 >= 2) {
            if (arg1.method861(arg0 ^ 0x287A, class165.field2845)) {
                class288.method1987(95);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class212.method1456(class28.method177((byte) -60, new class128[] { class254.field4379, class257.method1811(var4, (byte) 33), class58.field1116 }), 1, (class128) null, 0);
            }
            if (class247.field4247 && arg1.method861(10362, class8.field185)) {
                System.out.println("oncard_geometry:" + class274.field4745);
                System.out.println("oncard_2d:" + class274.field4746);
                System.out.println("oncard_texture:" + class274.field4744);
            }
            if (arg1.method861(10362, class31.field698)) {
                class263.method1848((byte) 88);
            }
            if (arg1.method861(10362, class79.field1439)) {
                class56.field1078.method675(127);
            }
            if (arg1.method861(10362, class293.field5020)) {
                class56.field1078.method681(0);
            }
            if (arg1.method861(10362, class287.field4900)) {
                class167.field2872 = true;
            }
            if (arg1.method861(10362, class159.field2726)) {
                class298.method2039((byte) -52, 25);
            }
            if (arg1.method861(arg0 ^ 0x287A, class115.field1947)) {
                class208.field3669 = true;
            }
            if (arg1.method861(10362, class81.field1454)) {
                class208.field3669 = false;
            }
            if (arg1.method861(arg0 + 10362, class296.field5057)) {
                class217.method1502(0, (byte) 109, -1, false, -1);
            }
            if (arg1.method861(10362, class88.field1507)) {
                class217.method1502(1, (byte) 46, -1, false, -1);
            }
            if (arg1.method861(arg0 ^ 0x287A, class242.field4141)) {
                class217.method1502(2, (byte) 115, -1, false, -1);
            }
            if (arg1.method861(10362, class144.field2459)) {
                class217.method1502(3, (byte) 109, 768, false, 1024);
            }
            if (arg1.method861(10362, class297.field5066)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class180.field3158[var5].field4306[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method838(class129.field2262, -9650) && class236.field4057 != 0) {
                class117.method701(arg1.method829(6, (byte) 125).method845((byte) -120), (byte) 116);
            }
            if (arg1.method861(10362, class113.field1897) && class236.field4057 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method838(class193.field3343, -9650)) {
                class226.field3954 = arg1.method829(12, (byte) 115).method832(~arg0).method845((byte) -121);
                class212.method1456(class28.method177((byte) -95, new class128[] { class310.field5261, class257.method1811(class226.field3954, (byte) -125) }), 1, (class128) null, 0);
            }
            if (arg1.method861(10362, class153.field2628)) {
                class3.field57 = true;
            }
        }
        class207.field3636++;
        class71.field1320.method570(5, -1);
        if (arg0 != 0) {
            method2012(74, -17);
        }
        class71.field1320.method1352(7528, arg1.method865((byte) -83) - 1);
        class71.field1320.method1343((byte) 66, arg1.method829(2, (byte) 107));
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 238)
    public static void method2015(int arg0) {
        field5029 = null;
        field5034 = null;
        field5033 = null;
        if (arg0 != 65536) {
            method2015(-81);
        }
        field5028 = null;
        field5036 = null;
        field5032 = null;
        field5037 = null;
    }
}
