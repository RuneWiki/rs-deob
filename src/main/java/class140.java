import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class140 extends class271 {

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "Lwa;")
    public static class75 field2430 = class66.method560("::rebuild", false);

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "Lwa;")
    public static class75 field2423 = class66.method560("(U1", false);

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "[I")
    public static int[] field2439 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "Lcb;")
    public static class267 field2424;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "Lcb;")
    public static class267 field2427;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Lwa;")
    public class75 field2435;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[I")
    public int[] field2422;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "[I")
    public int[] field2432;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "[I")
    public int[] field2434;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "[I")
    public int[] field2440;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V", line = 8)
    public static final void method1079(int arg0, byte arg1, int arg2) {
        if (arg0 == 4 && !class167.field2816) {
            arg0 = 2;
            arg2 = 2;
        }
        field2438++;
        if (class274.field4731 != arg0) {
            if (class156.field2682) {
                return;
            }
            if (class274.field4731 != 0) {
                class302.field5164[class274.field4731].method164();
            }
            if (arg0 != 0) {
                class243 var3 = class302.field5164[arg0];
                var3.method162();
                var3.method161(arg2);
            }
            class274.field4731 = arg0;
            class20.field269 = arg2;
        } else if (arg0 != 0 && class20.field269 != arg2) {
            class302.field5164[arg0].method161(arg2);
            class20.field269 = arg2;
        }
        int var4 = -78 % ((arg1 - 65) / 61);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Z", line = 62)
    public static final boolean method1080(int arg0, int arg1) {
        field2419++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        }
        if (arg0 != -91) {
            method1089(34, 6, 1, 19, -70, 110, -122, 104, -76, 73);
        }
        if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 86)
    public static void method1081(int arg0) {
        field2424 = null;
        field2439 = null;
        field2430 = null;
        field2423 = null;
        if (arg0 >= -105) {
            field2439 = (int[]) null;
        }
        field2427 = null;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)Laf;", line = 100)
    public static final class167 method1082(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class167 var4 = var3.field4098;
            var3.field4098 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 111)
    public final void method1083(byte arg0) {
        field2436++;
        if (this.field2422 != null) {
            for (int var2 = 0; var2 < this.field2422.length; var2++) {
                this.field2422[var2] = class102.method799(this.field2422[var2], 32768);
            }
        }
        if (this.field2432 != null) {
            for (int var3 = 0; var3 < this.field2432.length; var3++) {
                this.field2432[var3] = class102.method799(this.field2432[var3], 32768);
            }
        }
        if (arg0 != 110) {
            method1080(-21, 93);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)I", line = 140)
    public final int method1084(int arg0, boolean arg1) {
        field2421++;
        if (!arg1) {
            method1082(-38, 105, 78);
        }
        if (this.field2422 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2422.length; var3++) {
            if (this.field2440[var3] == arg0) {
                return this.field2422[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lja;B)V", line = 167)
    public final void method1085(class60 arg0, byte arg1) {
        if (arg1 > -29) {
            return;
        }
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                field2428++;
                return;
            }
            this.method1092(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Z", line = 187)
    public static final boolean method1086(int arg0, int arg1) {
        field2429++;
        if (class260.field4354 != arg0) {
            int var2 = 25 / ((-arg1 - 74) / 47);
            return false;
        }
        class271.field4679 = true;
        class260.field4354++;
        if (class260.field4354 > 65535) {
            class260.field4354 = 0;
        }
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)I", line = 207)
    public final int method1087(int arg0, int arg1) {
        field2425++;
        if (this.field2432 == null) {
            return -1;
        } else if (arg0 < 94) {
            return -46;
        } else {
            for (int var3 = 0; var3 < this.field2432.length; var3++) {
                if (this.field2434[var3] == arg1) {
                    return this.field2432[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 241)
    public static final void method1088(byte arg0) {
        field2426++;
        while (class136.field2328.method89(class299.field5105, -21530) >= 27) {
            int var1 = class136.field2328.method92(15, 8);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class35.field521[var1] == null) {
                class35.field521[var1] = new class295();
                var2 = true;
            }
            class295 var3 = class35.field521[var1];
            class132.field2281[class121.field2031++] = var1;
            var3.field3271 = class143.field2463;
            if (var3.field5070 != null && var3.field5070.method1671((byte) -110)) {
                class123.method929(var3, (byte) 124);
            }
            int var4 = class263.field4558[class136.field2328.method92(3, 8)];
            if (var2) {
                var3.field3206 = var3.field3274 = var4;
            }
            int var5 = class136.field2328.method92(1, 8);
            if (var5 == 1) {
                class72.field1214[class173.field2924++] = var1;
            }
            var3.field5070 = class182.method1343(class136.field2328.method92(14, 8), (byte) 62);
            int var6 = class136.field2328.method92(5, 8);
            int var7 = class136.field2328.method92(5, arg0 - 35);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class136.field2328.method92(1, 8);
            var3.method1454(var3.field5070.field3854, (byte) 94);
            var3.field3229 = var3.field5070.field3885;
            var3.field3269 = var3.field5070.field3849;
            var3.field3209 = var3.field5070.field3850;
            var3.field3227 = var3.field5070.field3884;
            var3.field3232 = var3.field5070.field3882;
            var3.field3219 = var3.field5070.field3840;
            var3.field3257 = var3.field5070.field3895;
            var3.field3228 = var3.field5070.field3846;
            if (var3.field3219 == 0) {
                var3.field3274 = 0;
            }
            var3.method1457(var3.method739(0), class279.field4831.field3205[0] + var7, 95, class279.field4831.field3236[0] + var6, var8 == 1);
            if (var3.field5070.method1671((byte) -55)) {
                class76.method664(class67.field1174, false, (class96) null, var3.field3236[0], 0, var3.field3205[0], (class108) null, var3);
            }
        }
        class136.field2328.method97((byte) 77);
        if (arg0 != 43) {
            method1082(-66, 33, -20);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIII)V", line = 328)
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2420++;
        if (class153.field2635 <= arg6 && arg6 <= class288.field4956 && class153.field2635 <= arg1 && class288.field4956 >= arg1 && class153.field2635 <= arg7 && class288.field4956 >= arg7 && arg8 >= class153.field2635 && arg8 <= class288.field4956 && arg0 >= class90.field1495 && arg0 <= class294.field5041 && class90.field1495 <= arg2 && arg2 <= class294.field5041 && class90.field1495 <= arg5 && arg5 <= class294.field5041 && arg3 >= class90.field1495 && class294.field5041 >= arg3) {
            class139.method1076(arg5, arg7, arg6, arg4, arg3, arg0, arg2, arg8, (byte) 70, arg1);
        } else {
            class130.method1018(arg5, arg1, arg0, arg2, arg8, arg3, arg6, (byte) -127, arg7, arg4);
        }
        if (arg9 != 24106) {
            field2424 = (class267) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 350)
    public static final void method1090(boolean arg0) {
        class28.field362.method1200(!arg0);
        field2431++;
        if (!arg0) {
            field2439 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lje;[Lje;B[Lcm;[Lje;[Lje;Lcb;)V", line = 367)
    public static final void method1091(class68[] arg0, class68[] arg1, byte arg2, class181[] arg3, class68[] arg4, class68[] arg5, class267 arg6) {
        class59.field995 = arg6;
        if (arg2 < 88) {
            method1088((byte) -53);
        }
        class200.field3387 = arg5;
        class169.field2845 = arg1;
        class246.field4153 = arg4;
        class28.field356 = arg0;
        class177.field2979 = arg3;
        field2437++;
        class139.field2418.method1261(2);
        int var7 = class59.field995.method1915(-15621, class82.field1369);
        int[] var8 = class59.field995.method1903(100, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class139.field2418.method1251(class108.method851((byte) 77, new class60(class59.field995.method1911(var7, var8[var9], -46))), -122);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLja;I)V", line = 407)
    private final void method1092(boolean arg0, class60 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2435 = arg1.method532(-1);
        } else if (arg2 == 2) {
            int var7 = arg1.method501(0);
            this.field2434 = new int[var7];
            this.field2432 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2432[var8] = arg1.method485((byte) -2);
                int var9 = arg1.method501(0);
                if (var9 == 0) {
                    this.field2434[var8] = -1;
                } else {
                    this.field2434[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method501(0);
            this.field2440 = new int[var4];
            this.field2422 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2422[var5] = arg1.method485((byte) -2);
                int var6 = arg1.method501(0);
                if (var6 == 0) {
                    this.field2440[var5] = -1;
                } else {
                    this.field2440[var5] = var6;
                }
            }
        } else if (arg2 == 4) {
        }
        field2433++;
        if (arg0) {
            field2439 = (int[]) null;
        }
    }
}
