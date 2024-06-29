import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class301 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field4629 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILcd;)Z", line = 13)
    public static final boolean method2083(int arg0, class136 arg1) {
        field4628++;
        if (arg1.field2156 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2156.length; var2++) {
            int var3 = class256.method1854(var2, arg1, arg0 - 96);
            int var4 = arg1.field2019[var2];
            if (arg1.field2156[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field2156[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2156[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 == 104) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BJ)V", line = 70)
    public static final void method2084(byte arg0, long arg1) {
        if (arg0 <= 19) {
            return;
        }
        int var3 = class281.field4324 + class146.field2310.field4731;
        if (!class82.field1124) {
            class45.field604 += (float) arg1 * class135.field1975 / 40.0F;
            class6.field114 += (float) arg1 * class25.field383 / 40.0F;
        }
        field4624++;
        int var4 = class322.field5084 + class146.field2310.field4698;
        if ((class225.field3561 - var4) < -500 || (class225.field3561 - var4) > 500 || class2.field19 - var3 < -500 || (class2.field19 - var3) > 500) {
            class2.field19 = var3;
            class225.field3561 = var4;
        }
        if (class225.field3561 != var4) {
            class225.field3561 = (int) ((long) (var4 - class225.field3561) * arg1 / 320L + (long) class225.field3561);
        }
        if (class2.field19 != var3) {
            class2.field19 = (int) ((long) (var3 - class2.field19) * arg1 / 320L + (long) class2.field19);
        }
        class245.method1753(true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V", line = 108)
    public static final void method2085(int arg0, boolean arg1) {
        class329.field5151 = new int[104];
        if (arg0 >= -36) {
            return;
        }
        class63.field922 = new int[104];
        class10.field194 = new int[5];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class263.field4114 = new byte[var2][104][104];
        class314.field4919 = new byte[var2][104][104];
        field4625++;
        class66.field943 = new byte[var2][104][104];
        class39.field550 = new int[104];
        class253.field3964 = new int[104];
        class85.field1154 = 99;
        class175.field2868 = new int[var2][105][105];
        class24.field360 = new byte[var2][105][105];
        class135.field1979 = new int[104];
        class70.field974 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIIIIII)V", line = 138)
    public static final void method2086(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class136 var7 = class294.method2048((byte) 89, arg4, arg5);
        if (var7 != null && var7.field2025 != null) {
            class15 var8 = new class15();
            var8.field243 = var7.field2025;
            var8.field248 = var7;
            class172.method1282(var8, (byte) 73);
        }
        class56.field783 = true;
        class33.field488 = arg2;
        class171.field2825 = arg1;
        field4631 = arg6;
        if (arg0 != 122) {
            method2085(109, true);
        }
        class337.field5258 = arg3;
        field4632++;
        class63.field920 = arg5;
        class51.field646 = arg4;
        class167.method1250(var7, 412);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(CI)Z", line = 177)
    public static final boolean method2087(char arg0, int arg1) {
        field4630++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        } else if (arg1 <= 78) {
            return false;
        } else {
            if (arg0 != '\u0000') {
                char[] var2 = class59.field856;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
