import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class108 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    public static int[] field1778 = new int[32];

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
    public static int[] field1779;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lre;B)V")
    public static final void method772(class228 arg0, byte arg1) {
        field1780++;
        int var2 = arg0.field3549;
        if (var2 == 324) {
            if (class77.field1263 == -1) {
                class77.field1263 = arg0.field3507;
                class109.field1790 = arg0.field3524;
            }
            if (class202.field3159.field720) {
                arg0.field3507 = class77.field1263;
            } else {
                arg0.field3507 = class109.field1790;
            }
            return;
        }
        if (arg1 != -127) {
            method772((class228) null, (byte) 108);
        }
        if (var2 == 325) {
            if (class77.field1263 == -1) {
                class109.field1790 = arg0.field3524;
                class77.field1263 = arg0.field3507;
            }
            if (class202.field3159.field720) {
                arg0.field3507 = class109.field1790;
            } else {
                arg0.field3507 = class77.field1263;
            }
        } else if (var2 == 327) {
            arg0.field3614 = 150;
            arg0.field3618 = (int) (Math.sin((double) class192.field2978 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3496 = -1;
            arg0.field3515 = 5;
        } else if (var2 == 328) {
            if (class283.field4473.field3803 == null) {
                arg0.field3496 = 0;
            } else {
                arg0.field3614 = 150;
                arg0.field3618 = (int) (Math.sin((double) class192.field2978 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3515 = 5;
                arg0.field3496 = ((int) class148.method1000(class283.field4473.field3803, 934) << 11) + 2047;
                arg0.field3598 = class283.field4473.field2212;
                arg0.field3504 = class283.field4473.field2250;
                arg0.field3538 = class283.field4473.field2287;
                arg0.field3580 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method773(int arg0) {
        field1778 = null;
        if (arg0 != 654487979) {
            field1778 = null;
        }
        field1779 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method774(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1777++;
        int var8 = 2048 - arg0 & 0x7FF;
        int var9 = arg3 - 334;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 > 100) {
            var9 = 100;
        }
        int var10 = (class243.field3954 - class238.field3861) * var9 / 100 + class238.field3861;
        int var11 = arg2 * var10 >> 8;
        int var12 = 2048 - arg7 & 0x7FF;
        if (arg1 != 55) {
            method774(70, (byte) -52, -45, 5, 127, -82, 93, 122);
        }
        int var13 = var11;
        int var14 = 0;
        int var15 = 0;
        if (var8 != 0) {
            int var16 = class195.field3091[var8];
            var14 = -var11 * var16 >> 16;
            int var17 = class195.field3089[var8];
            var13 = var11 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class195.field3091[var12];
            var15 = var13 * var18 >> 16;
            int var19 = class195.field3089[var12];
            var13 = var13 * var19 >> 16;
        }
        class62.field1066 = arg0;
        class170.field2653 = arg4 - var14;
        class83.field1408 = arg7;
        class293.field4624 = arg5 - var13;
        class219.field3375 = arg6 - var15;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static final void method775(boolean arg0) {
        if (arg0) {
            field1778 = null;
        }
        field1781++;
        class190.field2945.method1898((byte) -125);
        class47.field677.method1898((byte) 21);
    }
}
