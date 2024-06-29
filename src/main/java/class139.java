import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class139 extends class132 {

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Lvd;")
    public static class222 field2684 = class212.method1357(":trade:", 10731);

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
    public static boolean field2689 = false;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Lvd;")
    public static class222 field2686 = class212.method1357("Schrifts-=tze geladen)3", 10731);

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Lvd;")
    private static class222 field2690 = class212.method1357("and choose the (Wcreate account(W", 10731);

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Lvd;")
    public static class222 field2685 = class212.method1357("Ung-Ultige Session)2ID)3", 10731);

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Lvd;")
    public static class222 field2683 = field2690;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "B")
    public static byte field2682;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "[[[[Z")
    public static boolean[][][][] field2681;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method872(int arg0, int arg1, int arg2, long arg3) {
        class121 var5 = class204.field3800[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2306 != null && var5.field2306.field1767 == arg3) {
            return true;
        } else if (var5.field2302 != null && var5.field2302.field3670 == arg3) {
            return true;
        } else if (var5.field2300 != null && var5.field2300.field84 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2299; var6++) {
                if (var5.field2297[var6].field536 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLvd;)V")
    public static final void method873(byte arg0, class222 arg1) {
        field2688++;
        class40 var2 = class118.method756(83, arg1);
        if (var2 == null) {
            return;
        }
        class218.field4052 = class59.field1107 + class38.field852 - var2.field885;
        class121.field2314 = var2.field883 - class167.field3184;
        int var3 = 104 % ((arg0 - 66) / 59);
        int var4 = class121.field2314 - (int) ((double) class228.field4275.field341 / class229.field4313);
        int var5 = (int) ((double) class228.field4275.field341 / class229.field4313) + class121.field2314;
        if (var4 < 0) {
            class121.field2314 = (int) ((double) class228.field4275.field341 / class229.field4313);
        }
        int var6 = class218.field4052 - (int) ((double) class228.field4275.field245 / class229.field4313);
        if (class99.field1862 < var5) {
            class121.field2314 = class99.field1862 - (int) ((double) class228.field4275.field341 / class229.field4313);
        }
        int var7 = (int) ((double) class228.field4275.field245 / class229.field4313) + class218.field4052;
        if (var6 < 0) {
            class218.field4052 = (int) ((double) class228.field4275.field245 / class229.field4313);
        }
        if (var7 > class38.field852) {
            class218.field4052 = class38.field852 - (int) ((double) class228.field4275.field245 / class229.field4313);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII[B[Lag;IIB)V")
    public static final void method874(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class8[] arg6, int arg7, int arg8, byte arg9) {
        field2691++;
        int var10 = 0;
        if (arg9 != -5) {
            method873((byte) -62, null);
        }
        while (var10 < 8) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg2 + var10 > 0 && arg2 + var10 < 103 && arg1 + var15 > 0 && arg1 + var15 < 103) {
                    arg6[arg7].field132[arg2 + var10][arg1 + var15] = method876(arg6[arg7].field132[arg2 + var10][arg1 + var15], -16777217);
                }
            }
            var10++;
        }
        class109 var11 = new class109(arg5);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 == var12 && arg0 <= var13 && arg0 + 8 > var13 && var14 >= arg8 && arg8 + 8 > var14) {
                        class14.method124(var11, arg4, arg2 + class196.method1209(var14 & 0x7, arg4, 113, var13 & 0x7), arg1 + class32.method259(var13 & 0x7, arg4, 125, var14 & 0x7), -69, 0, 0, arg7);
                    } else {
                        class14.method124(var11, 0, -1, -1, -111, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2683 = null;
        field2681 = null;
        if (arg0 != -1) {
            field2686 = null;
        }
        field2686 = null;
        field2685 = null;
        field2684 = null;
        field2690 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
    public static int method876(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
    public static final void method877(int arg0, int arg1) {
        class121 var2 = class204.field3800[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class121 var4 = class204.field3800[var3][arg0][arg1] = class204.field3800[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2293--;
                for (int var5 = 0; var5 < var4.field2299; var5++) {
                    class23 var6 = var4.field2297[var5];
                    if ((var6.field536 >> 29 & 0x3L) == 2L && var6.field534 == arg0 && var6.field539 == arg1) {
                        var6.field548--;
                    }
                }
            }
        }
        if (class204.field3800[0][arg0][arg1] == null) {
            class204.field3800[0][arg0][arg1] = new class121(0, arg0, arg1);
        }
        class204.field3800[0][arg0][arg1].field2303 = var2;
        class204.field3800[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class139() {
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        this.field2687 = arg0;
    }
}
