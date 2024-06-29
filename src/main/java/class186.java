import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class186 extends class297 {

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public int field2916 = 0;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field2919 = -1;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Ldb;")
    public static class126 field2926 = new class126();

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Lma;")
    public static class5 field2932 = class12.method119(" )2> <col=ffff00>", (byte) 89);

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field2934 = 0;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public int field2914;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "[Lma;")
    public static class5[] field2933;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Z", line = 6)
    public static final boolean method1226(int arg0, int arg1) {
        field2924++;
        if (class97.field1443[arg0]) {
            return true;
        } else if (class29.field479.method1348(arg0, -24597)) {
            int var2 = class29.field479.method1326((byte) -92, arg0);
            if (var2 == 0) {
                class97.field1443[arg0] = true;
                return true;
            }
            if (class256.field4376[arg0] == null) {
                class256.field4376[arg0] = new class253[var2];
            }
            for (int var3 = arg1; var3 < var2; var3++) {
                if (class256.field4376[arg0][var3] == null) {
                    byte[] var4 = class29.field479.method1342(15, arg0, var3);
                    if (var4 != null) {
                        class256.field4376[arg0][var3] = new class253();
                        class256.field4376[arg0][var3].field4206 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class256.field4376[arg0][var3].method1764(new class221(var4), 2);
                        } else {
                            class256.field4376[arg0][var3].method1769((byte) -109, new class221(var4));
                        }
                    }
                }
            }
            class97.field1443[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 73)
    public static void method1227(int arg0) {
        field2926 = null;
        field2932 = null;
        if (arg0 != 2) {
            field2932 = (class5) null;
        }
        field2933 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V", line = 91)
    public static final void method1228(int arg0, int arg1) {
        class198 var2 = class43.field646[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class198 var4 = class43.field646[var3][arg0][arg1] = class43.field646[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3155--;
                for (int var5 = 0; var5 < var4.field3162; var5++) {
                    class107 var6 = var4.field3166[var5];
                    if ((var6.field1590 >> 29 & 0x3L) == 2L && var6.field1597 == arg0 && var6.field1595 == arg1) {
                        var6.field1596--;
                    }
                }
            }
        }
        if (class43.field646[0][arg0][arg1] == null) {
            class43.field646[0][arg0][arg1] = new class198(0, arg0, arg1);
        }
        class43.field646[0][arg0][arg1].field3160 = var2;
        class43.field646[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIIIII)V", line = 132)
    public static final void method1229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2930++;
        if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
            if (!class152.method956((byte) -57) && (class18.field321[0][arg7][arg0] & 0x2) == 0) {
                int var8 = arg3;
                if ((class18.field321[arg3][arg7][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class276.field4709 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class18.field321[1][arg7][arg0] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class242.method1705(false, arg4, arg0, arg7, arg3, var9, class242.field4031[arg3]);
            if (arg6 >= 0) {
                boolean var10 = class112.field1663;
                class112.field1663 = true;
                class303.method2054(class242.field4031[arg3], arg2, arg6, arg7, false, arg3, var9, 426775073, arg1, false, arg0);
                class112.field1663 = var10;
            }
        }
        if (arg5 <= 66) {
            method1231(-19, -64, 3, -2);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)Lki;", line = 185)
    public static final class288 method1230(int arg0, int arg1) {
        field2921++;
        class288 var2 = (class288) class241.field4004.method521((long) arg1, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class228.field3788.method1342(-113, class251.method1755(19206, arg1), class10.method104(false, arg1));
        class288 var4 = new class288();
        var4.field4887 = arg1;
        if (var3 != null) {
            var4.method1945(new class221(var3), 54);
        }
        var4.method1950((byte) -96);
        if (arg0 == 29) {
            class241.field4004.method519((byte) -95, var4, (long) arg1);
            return var4;
        } else {
            return (class288) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V", line = 213)
    public static final void method1231(int arg0, int arg1, int arg2, int arg3) {
        field2917++;
        class5 var4 = class288.method1940((byte) 61, new class5[] { class117.field1773, class175.method1148(arg1, false), class90.field1343, class175.method1148(arg0 >> 6, false), class90.field1343, class175.method1148(arg3 >> 6, false), class90.field1343, class175.method1148(arg0 & 0x3F, false), class90.field1343, class175.method1148(arg3 & 0x3F, false) });
        if (arg2 != -11042) {
            method1229(-55, 119, 87, 42, -68, -4, -83, 16);
        }
        var4.method28(33);
        class52.method396((byte) -75, var4);
    }
}
