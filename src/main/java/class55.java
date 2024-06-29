import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class55 extends class20 {

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    private int field1208 = -1;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    private int field1213 = -32768;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Lgj;")
    private class192 field1207 = null;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    private int field1225 = -1;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Leh;")
    private class138 field1218;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lsg;")
    public static class30 field1216 = class167.method1221((byte) 33, "leuchten2:");

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "Lsg;")
    public static class30 field1217 = class167.method1221((byte) 33, "mapflag");

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field1222 = 50;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lsg;")
    public static class30 field1203 = class167.method1221((byte) 33, "");

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lsg;")
    public static class30 field1215 = field1203;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lsg;")
    public static class30 field1227 = field1203;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
    public final int method22() {
        field1226++;
        return this.field1213;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static final void method525(int arg0) {
        if ((class208.field3749 < class29.field562)) {
            class208.field3749 = (float) ((double) class208.field3749 / 30.0D + (double) class208.field3749);
            if (class208.field3749 > class29.field562) {
                class208.field3749 = class29.field562;
            }
            class154.method1151((byte) -101);
        } else if (class29.field562 < class208.field3749) {
            class208.field3749 = (float) ((double) class208.field3749 - (double) class208.field3749 / 30.0D);
            if (class29.field562 > class208.field3749) {
                class208.field3749 = class29.field562;
            }
            class154.method1151((byte) -105);
        }
        if (class41.field1014 != -1 && class32.field811 != -1) {
            int var1 = class32.field811 - class241.field4304;
            int var2 = class41.field1014 - class242.field4331;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class241.field4304 += var1;
            class242.field4331 -= -var2;
            if (var2 == 0 && var1 == 0) {
                class41.field1014 = -1;
                class32.field811 = -1;
            }
            class154.method1151((byte) -115);
        }
        field1206++;
        if (arg0 <= 87) {
            field1222 = 89;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V")
    private final void method526(int arg0, byte arg1, int arg2) {
        if (arg1 != -66) {
            this.field1211 = 125;
        }
        if (this.field1218 != null) {
            int var4 = class133.field2617 - this.field1219;
            if (var4 > 100 && this.field1218.field2706 > 0) {
                int var5 = this.field1218.field2699.length - this.field1218.field2706;
                while (this.field1212 < var5 && this.field1218.field2690[this.field1212] < var4) {
                    var4 -= this.field1218.field2690[this.field1212];
                    this.field1212++;
                }
                if (this.field1212 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1218.field2699.length; var7++) {
                        var6 += this.field1218.field2690[var7];
                    }
                    var4 %= var6;
                }
            }
            label61: {
                do {
                    do {
                        if (this.field1218.field2690[this.field1212] >= var4) {
                            break label61;
                        }
                        class53.method518(arg2, arg0, arg1 ^ 0x3F, this.field1212, this.field1218, false);
                        var4 -= this.field1218.field2690[this.field1212];
                        this.field1212++;
                    } while (this.field1212 < this.field1218.field2699.length);
                    this.field1212 -= this.field1218.field2706;
                } while (this.field1212 >= 0 && this.field1212 < this.field1218.field2699.length);
                this.field1218 = null;
            }
            this.field1219 = class133.field2617 - var4;
        }
        field1210++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BLsg;)V")
    public static final void method527(byte arg0, class30 arg1) {
        field1214++;
        for (class179 var2 = (class179) class204.field3659.method478(0); var2 != null; var2 = (class179) class204.field3659.method476((byte) 13)) {
            if (var2.field3306.method267(-52, arg1)) {
                class101.field2061 = var2;
                return;
            }
        }
        if (arg0 >= -63) {
            field1215 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsg;I)V")
    public static final void method528(class30 arg0, int arg1) {
        field1204++;
        if (class133.field2610 >= arg1) {
            if (arg0.method285(class144.field2776, 0)) {
                class266.method1826(-121);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class268.method1838(0, -1, class160.method1188(new class30[] { class65.field1439, class73.method675(113, var4), class216.field3942 }, 0), (class30) null);
            }
            if (arg0.method285(class68.field1496, arg1 ^ 0x2)) {
                class261.method1805(40);
            }
            if (arg0.method285(class96.field1965, arg1 ^ 0x2)) {
                class262.field4618.method359(4);
            }
            if (arg0.method285(class211.field3809, arg1 - 2)) {
                class262.field4618.method349((byte) 127);
            }
            if (arg0.method285(class251.field4439, 0)) {
                class190.field3452.method590((byte) 103);
                class175.field3261.method1514(false);
                class262.field4618.method350((byte) 93);
            }
            if (arg0.method285(class163.field3040, 0)) {
                class275.field4803 = true;
            }
            if (arg0.method285(class176.field3274, 0)) {
                class253.method1764((byte) -85, 25);
            }
            if (arg0.method285(class136.field2660, 0)) {
                class197.field3570 = true;
            }
            if (arg0.method285(class69.field1518, arg1 ^ 0x2)) {
                class197.field3570 = false;
            }
            if (arg0.method285(class131.field2583, arg1 - 2)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class100.field2032[var5].field258[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method276(class178.field3299, -93) && class148.field2832 != 0) {
                class97.method794(arg0.method260((byte) -127, 6).method271((byte) -127), true);
            }
            if (arg0.method285(class62.field1335, 0) && class148.field2832 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method276(class17.field344, -93)) {
                class126.field2461 = arg0.method260((byte) 35, 12).method288((byte) 121).method271((byte) -127);
                class268.method1838(0, arg1 ^ 0xFFFFFFFD, class160.method1188(new class30[] { class78.field1690, class73.method675(123, class126.field2461) }, 0), (class30) null);
            }
            if (arg0.method285(class143.field2767, 0)) {
                class96.field1959 = true;
            }
        }
        class196.field3550++;
        class196.field3553.method1267(209, -9);
        class196.field3553.method76(arg1 + 5303, arg0.method249(-53) + -1);
        class196.field3553.method85(arg0.method260((byte) -127, 2), (byte) 64);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1228++;
        class20 var11 = this.method530((byte) -15);
        if (var11 != null) {
            var11.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1213 = var11.method22();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method529(boolean arg0) {
        field1203 = null;
        field1215 = null;
        field1216 = null;
        field1227 = null;
        if (!arg0) {
            method529(true);
        }
        field1217 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Lni;")
    private final class20 method530(byte arg0) {
        if (arg0 != -15) {
            field1217 = null;
        }
        field1229++;
        return this.method531(false, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZ)Lni;")
    private final class20 method531(boolean arg0, boolean arg1) {
        field1230++;
        boolean var3 = class242.field4333 != class177.field3289;
        class40 var4 = class195.method1415(29, this.field1224);
        if (var4.field997 != null) {
            var4 = var4.method418((byte) 126);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field1220 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field955;
            var6 = var4.field937;
        } else {
            var6 = var4.field955;
            var7 = var4.field937;
        }
        int var8 = this.field1209 + (var7 >> 1);
        int var9 = (var6 + 1 >> 1) + this.field1223;
        int var10 = (var6 >> 1) + this.field1223;
        int var11 = (var7 + 1 >> 1) + this.field1209;
        this.method526(var10 * 128, (byte) -66, var8 * 128);
        boolean var12 = !var3 && var4.field996 && (this.field1208 != var4.field989 || this.field1225 != this.field1212 && class22.field409 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class242.field4333[this.field1205];
        if (arg1) {
            this.method21(94, 68, 28, 17, -7, -14, -101, 12, 113L);
        }
        int var14 = var13[var8][var9] + var13[var11][var10] + var13[var8][var10] + var13[var11][var9] >> 2;
        int var15 = (this.field1209 << 7) + (var7 << 6);
        int[][] var16 = null;
        if (var3) {
            var16 = class177.field3289[0];
        } else if (this.field1205 < 3) {
            var16 = class242.field4333[this.field1205 + 1];
        }
        boolean var17 = this.field1207 == null;
        int var18 = (this.field1223 << 7) + (var6 << 6);
        class73 var19;
        if (this.field1218 == null) {
            var19 = var4.method409(var14, false, this.field1211, var18, var17 ? class110.field2220 : this.field1207, this.field1220, var13, var16, -83, var12, var15);
        } else {
            var19 = var4.method417(var13, var14, var15, var16, this.field1212, this.field1218, var12, this.field1211, this.field1220, var17 ? class110.field2220 : this.field1207, var18, 10);
        }
        return var19 == null ? null : var19.field1649;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public final void method191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1221++;
        if (arg4 == -1) {
            this.method526((arg0 + (arg2 - arg0 >> 1)) * 128 + 64, (byte) -66, ((arg3 - arg1 >> 1) + arg1) * 128 + 64);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIZLni;)V")
    public class55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class20 arg8) {
        this.field1211 = arg1;
        this.field1220 = arg2;
        this.field1223 = arg5;
        this.field1205 = arg3;
        this.field1224 = arg0;
        this.field1209 = arg4;
        if (arg6 != -1) {
            this.field1218 = class193.method1396(-30590, arg6);
            this.field1212 = 0;
            this.field1219 = class133.field2617 - 1;
            if (this.field1218.field2709 == 0 && arg8 != null && arg8 instanceof class55) {
                class55 var10 = (class55) arg8;
                if (this.field1218 == var10.field1218) {
                    this.field1219 = var10.field1219;
                    this.field1212 = var10.field1212;
                    return;
                }
            }
            if (arg7 && this.field1218.field2706 != -1) {
                this.field1212 = (int) ((double) this.field1218.field2699.length * Math.random());
                this.field1219 -= (int) ((double) this.field1218.field2690[this.field1212] * Math.random());
                return;
            }
        }
    }
}
