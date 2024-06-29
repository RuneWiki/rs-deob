import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class446 extends class478 implements class534 {

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "Lsv;")
    public class478 field6367;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Lqv;")
    public static class316 field6359 = new class316(77, 10);

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
    public static int[] field6366 = new int[32];

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
    public static int field6374 = 0;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
    public static final void method2629(int arg0) {
        class335.field4964 = false;
        class226.field3410 = null;
        field6370++;
        if (arg0 != -7880) {
            method2630(100, null, '~');
        }
        class531.method3148(arg0 ^ 0x1EF4);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        if (arg0 != 0) {
            field6366 = null;
        }
        field6375++;
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 >= -119) {
            this.method556(28);
        }
        field6358++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method2630(int arg0, String arg1, char arg2) {
        field6360++;
        int var3 = class510.method2970((byte) 124, arg1, arg2);
        String[] var4 = new String[var3 + 1];
        if (arg0 != -1) {
            method2631(107);
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V")
    public static void method2631(int arg0) {
        if (arg0 != 0) {
            field6368 = -66;
        }
        field6366 = null;
        field6359 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLqa;)V")
    public final void method557(byte arg0, class167 arg1) {
        field6363++;
        int var3 = -65 % ((arg0 - 13) / 59);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)I")
    public final int method561(byte arg0) {
        field6352++;
        return arg0 == -85 ? 0 : -126;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
    public static final void method2632(int arg0, boolean arg1) {
        class94.field1501 = -1;
        field6361++;
        if (arg1) {
            class388.field5514 = arg0;
            class94.field1501 = -1;
            class521.method3091((byte) 70);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)Z")
    public final boolean method547(int arg0) {
        field6371++;
        int var2 = 50 % ((arg0 + 73) / 39);
        return false;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        field6373++;
        if (arg1 >= -117) {
            this.method561((byte) 93);
        }
        return this.field6367.method562(arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        if (!arg0) {
            field6365++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)I")
    public final int method1792(boolean arg0) {
        if (arg0) {
            return -44;
        } else {
            field6353++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public final void method548(int arg0) {
        int var2 = -122 / ((arg0 + 37) / 34);
        field6357++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        field6351++;
        return arg0 == -14322 ? null : null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIIIIIILsv;)V")
    public class446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class478 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class84.method620(arg0, arg1, -4164));
        this.field6367 = arg10;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        field6364++;
        return arg2 <= 42;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
    public final int method559(byte arg0) {
        if (arg0 < 3) {
            return 34;
        } else {
            field6355++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            this.method561((byte) 95);
        }
        field6356++;
        return false;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != -29863) {
            field6368 = -40;
        }
        field6354++;
        return 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lqa;I)V")
    public final void method551(class167 arg0, int arg1) {
        field6362++;
        if (arg1 < 62) {
            field6368 = 35;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        field6372++;
        if (arg4) {
            this.method561((byte) 5);
        }
    }
}
