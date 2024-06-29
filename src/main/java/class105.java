import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class105 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public int field1611 = 0;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[I")
    public static int[] field1609 = new int[2];

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1613 = 0;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "[[S")
    public static short[][] field1616 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field1617 = -1;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lnk;")
    public static class13 field1610;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[I")
    public static int[] field1612;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)I", line = 7)
    public static final int method808(int arg0, byte arg1, int arg2) {
        int var3 = 0;
        field1614++;
        int var4 = 56 % ((arg1 - 58) / 51);
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lhb;I)Luc;", line = 26)
    public static final class190 method809(class35 arg0, int arg1) {
        field1605++;
        class190 var2 = new class190(arg0.method279(119), arg0.method279(19), arg0.method300(-1394191632), arg0.method300(-1394191632), arg0.method299(-91), arg0.method273(65280) == 1, arg0.method273(65280));
        int var3 = arg0.method273(65280);
        if (arg1 > -2) {
            method811(true, (class184) null);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3015.method977(4, new class253(arg0.method300(-1394191632), arg0.method300(-1394191632), arg0.method300(-1394191632), arg0.method300(-1394191632)));
        }
        var2.method1366(false);
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lhb;II)V", line = 51)
    private final void method810(class35 arg0, int arg1, int arg2) {
        field1615++;
        int var4 = 76 / ((44 - arg2) / 36);
        if (arg1 == 5) {
            this.field1611 = arg0.method300(-1394191632);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLek;)Z", line = 69)
    public static final boolean method811(boolean arg0, class184 arg1) {
        if (!arg0) {
            field1610 = (class13) null;
        }
        field1607++;
        if (arg1.field2842 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2842.length; var2++) {
            int var3 = class290.method2049(-10320, arg1, var2);
            int var4 = arg1.field2805[var2];
            if (arg1.field2842[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2842[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2842[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIZ)V", line = 131)
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1608++;
        if (class36.field534) {
            int var8 = arg3 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class272.field4115 - class317.field4921) * var8 / 100 + class317.field4921;
            arg5 = arg5 * var9 >> 8;
        }
        int var10 = 2048 - arg1 & 0x7FF;
        if (!arg7) {
            method814((byte) -35);
        }
        int var11 = 0;
        int var12 = 0;
        int var13 = 2048 - arg0 & 0x7FF;
        int var14 = arg5;
        if (var13 != 0) {
            int var15 = class56.field838[var13];
            var12 = -arg5 * var15 >> 16;
            int var16 = class56.field830[var13];
            var14 = arg5 * var16 >> 16;
        }
        if (var10 != 0) {
            int var17 = class56.field838[var10];
            var11 = var14 * var17 >> 16;
            int var18 = class56.field830[var10];
            var14 = var14 * var18 >> 16;
        }
        class220.field3455 = arg6 - var11;
        class89.field1299 = arg0;
        class294.field4628 = arg2 - var12;
        class203.field3227 = arg1;
        class311.field4845 = arg4 - var14;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLhb;)V", line = 196)
    public final void method813(byte arg0, class35 arg1) {
        if (arg0 >= -126) {
            field1610 = (class13) null;
        }
        field1604++;
        while (true) {
            int var3 = arg1.method273(65280);
            if (var3 == 0) {
                return;
            }
            this.method810(arg1, var3, 96);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 230)
    public static void method814(byte arg0) {
        field1616 = (short[][]) null;
        if (arg0 > 35) {
            field1612 = null;
            field1610 = null;
            field1609 = null;
        }
    }
}
