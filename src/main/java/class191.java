import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class191 implements class184 {

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field3786 = 50;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    private int field3791 = 128;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Ldd;")
    private class32 field3790;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Ldd;")
    private class32 field3767;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lrc;")
    private class155 field3777;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3763 = 0;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[I")
    public static int[] field3768 = new int[256];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lea;")
    private static class38 field3764 = class9.method46((byte) 105, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lea;")
    public static class38 field3774 = field3764;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
    public static int[] field3778 = new int[5];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lea;")
    public static class38 field3765 = class9.method46((byte) 127, "Untersuchen");

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
    public static int[] field3772 = new int[25];

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lea;")
    public static class38 field3769 = class9.method46((byte) 125, ":assist:");

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lea;")
    public static class38 field3766 = class9.method46((byte) 102, "<col=00ff00>");

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lrc;")
    public static class155 field3789 = new class155(64);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)[I")
    public final int[] method1243(byte arg0, int arg1) {
        if (arg0 > -64) {
            this.field3767 = null;
        }
        field3771++;
        class66 var3 = new class66(this.field3767.method215(arg1, 0, 1));
        class4 var4 = new class4(var3);
        return var4.method21(94, this, this.field3790, this.field3791);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Z")
    public final boolean method1246(int arg0, int arg1) {
        if (arg1 <= 23) {
            this.method1249(-0.39047933F, -86, 121);
        }
        field3775++;
        return this.method1277(arg0, false).method19(this.field3790, this, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I")
    public static final int method1271(int arg0) {
        field3783++;
        if (arg0 != 6) {
            method1276(-58, (byte) 74, 81);
        }
        return 6;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public final void method1272(int arg0) {
        field3780++;
        this.field3777 = new class155(this.field3786);
        if (arg0 != 19918) {
            this.method1249(-0.64744514F, -57, -43);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Z")
    public final boolean method1245(boolean arg0, int arg1) {
        field3781++;
        if (!arg0) {
            this.method1277(-110, false);
        }
        return this.method1277(arg1, !arg0).field132;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI)I")
    public static final int method1273(int arg0, boolean arg1, int arg2) {
        field3779++;
        int var3 = class25.method145(arg2 + 45365, arg0 + 91923, 4, 121) + (class25.method145(arg2 - -10294, arg0 + 37821, 2, 126) - 128 >> 1) + (class25.method145(arg2, arg0, 1, 121) + -128 >> 2) - 128;
        if (!arg1) {
            return -37;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FII)[I")
    public final int[] method1249(float arg0, int arg1, int arg2) {
        int var4 = 92 % ((arg1 - 8) / 44);
        class4 var5 = this.method1277(arg2, false);
        field3784++;
        var5.field121 = true;
        return var5.method23(-10538, arg0, this, this.field3790, this.field3791);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
    public final void method1274(int arg0, boolean arg1) {
        for (class4 var3 = (class4) this.field3777.method1077(!arg1); var3 != null; var3 = (class4) this.field3777.method1074(-5)) {
            if (var3.field121) {
                var3.method22(arg0, 64);
                var3.field121 = false;
            }
        }
        if (!arg1) {
            field3782++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field3769 = null;
        field3764 = null;
        field3789 = null;
        field3765 = null;
        field3768 = null;
        field3766 = null;
        field3772 = null;
        field3778 = null;
        if (arg0 != -105) {
            method1275(-32);
        }
        field3774 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)V")
    public static final void method1276(int arg0, byte arg1, int arg2) {
        if (arg1 <= 59) {
            return;
        }
        int[] var3 = new int[4];
        int var4 = 1;
        field3787++;
        int[] var5 = new int[4];
        var5[0] = arg0;
        var3[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class200.field3939[var6] != arg0) {
                var5[var4] = class200.field3939[var6];
                var3[var4] = class74.field1813[var6];
                var4++;
            }
        }
        class200.field3939 = var5;
        class74.field1813 = var3;
        class169.method1196(class74.field1813, 0, class200.field3939, 0, class48.field1161.length - 1, class48.field1161);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)Z")
    public final boolean method1248(int arg0, int arg1) {
        field3773++;
        if (arg1 >= -73) {
            field3763 = 40;
        }
        return this.method1277(arg0, false).field136;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)Lac;")
    private final class4 method1277(int arg0, boolean arg1) {
        field3776++;
        class4 var3 = (class4) this.field3777.method1078((byte) 28, (long) arg0);
        if (arg1) {
            field3772 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3767.method215(arg0, 0, 1);
        if (var4 == null) {
            return class132.method967((byte) -107);
        } else {
            class66 var5 = new class66(var4);
            class4 var6 = new class4(var5);
            this.field3777.method1076((long) arg0, -4, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z")
    public final boolean method1244(int arg0, int arg1) {
        field3770++;
        if (arg0 >= -91) {
            method1271(-90);
        }
        return this.field3791 == 64 || this.method1277(arg1, false).field127 == 64;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(BI)I")
    public final int method1247(byte arg0, int arg1) {
        if (arg0 != -29) {
            this.method1274(30, false);
        }
        field3792++;
        return this.method1277(arg1, false).field115;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(IZ)V")
    public static final void method1278(int arg0, boolean arg1) {
        field3788++;
        if (arg0 < 52) {
            field3789 = null;
        }
        for (int var2 = 0; var2 < class177.field3593; var2++) {
            class102 var3 = class105.field2343[class170.field3488[var2]];
            int var4 = (class170.field3488[var2] << 14) + 536870912;
            if (var3 != null && var3.method108(20542) && var3.field2298.field3178 == arg1 && var3.field2298.method1070(126)) {
                int var5 = var3.field406 >> 7;
                int var6 = var3.field382 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field423 == 1 && (var3.field406 & 0x7F) == 64 && (var3.field382 & 0x7F) == 64) {
                        if (class179.field3622[var5][var6] == class172.field3523) {
                            continue;
                        }
                        class179.field3622[var5][var6] = class172.field3523;
                    }
                    if (!var3.field2298.field3126) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class101.field2268.method1135(class10.field224, var3.field406, var3.field382, class38.method257(class10.field224, -169496123, var3.field423 * 64 + var3.field382 - 64, (var3.field423 + -1) * 64 + var3.field406), var3.field423 * 64 + 60 - 64, var3, var3.field403, var4, var3.field375);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ldd;Ldd;II)V")
    public class191(class32 arg0, class32 arg1, int arg2, int arg3) {
        this.field3790 = arg1;
        this.field3791 = arg3;
        this.field3767 = arg0;
        this.field3786 = arg2;
        this.field3777 = new class155(this.field3786);
    }
}
