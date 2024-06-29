import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class177 extends class299 {

    @OriginalMember(owner = "client!wa", name = "cc", descriptor = "Z")
    public static boolean field2436 = true;

    @OriginalMember(owner = "client!wa", name = "Kb", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!wa", name = "Lb", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!wa", name = "Mb", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!wa", name = "Nb", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!wa", name = "Pb", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!wa", name = "Qb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!wa", name = "Rb", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!wa", name = "Sb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!wa", name = "Tb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!wa", name = "Vb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!wa", name = "Wb", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!wa", name = "Xb", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!wa", name = "Yb", descriptor = "I")
    private int field2432;

    @OriginalMember(owner = "client!wa", name = "Zb", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!wa", name = "ac", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!wa", name = "bc", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Lm;")
    private class52 field2422;

    @OriginalMember(owner = "client!wa", name = "Ub", descriptor = "[I")
    public static int[] field2428;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V", line = 14)
    public class177(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([II)V", line = 20)
    public final void method1298(int[] arg0, int arg1) {
        if (arg1 == -1) {
            this.field2422 = new class52(arg0);
            field2427++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BJ)V", line = 32)
    public static final void method1299(byte arg0, long arg1) {
        field2418++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class157.method1212((byte) -43, arg1 - 1L);
            class157.method1212((byte) -43, 1L);
        } else {
            class157.method1212((byte) -43, arg1);
        }
        if (arg0 != 64) {
            field2436 = true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(IB)V", line = 54)
    public static final void method1300(int arg0, byte arg1) {
        field2421++;
        class308.field4544 = 3;
        class130.field1774 = arg0;
        if (arg1 <= -86) {
            class193.field2672 = 100;
            class144.field2014 = -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)V", line = 69)
    public final void method1301(int arg0) {
        if (arg0 != -2) {
            this.method1309(50, -35);
        }
        field2424++;
        this.field2432 = this.field4351 * 8;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lfd;I)V", line = 88)
    public static final void method1302(class299 arg0, int arg1) {
        field2435++;
        if (arg0.field4350.length - arg0.field4351 < 1) {
            return;
        }
        int var2 = arg0.method2096((byte) -122);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field4350.length - arg0.field4351)) {
            return;
        }
        class254.field3713 = arg0.method2096((byte) -122);
        if (class254.field3713 < 1) {
            class254.field3713 = 1;
        } else if (class254.field3713 > 4) {
            class254.field3713 = 4;
        }
        class286.method1949((byte) 56, arg0.method2096((byte) -122) == 1);
        class199.field2803 = arg0.method2096((byte) -122) == 1;
        class329.field4812 = arg0.method2096((byte) -122) == 1;
        class27.field313 = arg0.method2096((byte) -122) == 1;
        class343.field5340 = arg0.method2096((byte) -122) == 1;
        class80.field1017 = arg0.method2096((byte) -122) == 1;
        class40.field506 = arg0.method2096((byte) -122) == 1;
        class122.field1603 = arg0.method2096((byte) -122) == 1;
        class89.field1119 = arg0.method2096((byte) -122);
        if (class89.field1119 > 2) {
            class89.field1119 = 2;
        }
        if (var2 < 2) {
            class67.field856 = arg0.method2096((byte) -122) == 1;
            arg0.method2096((byte) -122);
        } else {
            class67.field856 = arg0.method2096((byte) -122) == 1;
        }
        field2436 = arg0.method2096((byte) -122) == 1;
        class280.field3995 = arg0.method2096((byte) -122) == 1;
        class315.field4647 = arg0.method2096((byte) -122);
        if (class315.field4647 > 2) {
            class315.field4647 = 2;
        }
        class24.field266 = class315.field4647;
        class103.field1343 = arg0.method2096((byte) -122) == 1;
        class75.field991 = arg0.method2096((byte) -122);
        if (class75.field991 > 127) {
            class75.field991 = 127;
        }
        class101.field1319 = arg0.method2096((byte) -122);
        class204.field2843 = arg0.method2096((byte) -122);
        if (class204.field2843 > 127) {
            class204.field2843 = 127;
        }
        if (var2 >= 1) {
            class330.field4838 = arg0.method2083((byte) -44);
            class214.field3032 = arg0.method2083((byte) -90);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method2096((byte) -122);
        }
        if (var2 >= 4) {
            int var4 = arg0.method2096((byte) -122);
            if (class255.field3734 < 96) {
                var4 = 0;
            }
            class187.method1359(var4);
        }
        if (var2 >= 5) {
            class97.field1280 = arg0.method2062(-25795);
        }
        if (var2 >= 6) {
            class118.field1543 = arg0.method2096((byte) -122);
        }
        if (var2 >= 7) {
            class142.field1963 = arg0.method2096((byte) -122) == 1;
        }
        if (arg1 != 2245) {
            method1302((class299) null, -85);
        }
        if (var2 >= 8) {
            class48.field638 = arg0.method2096((byte) -122) == 1;
        }
        if (var2 >= 9) {
            class58.field745 = arg0.method2096((byte) -122);
        }
        if (var2 >= 10) {
            class66.field849 = arg0.method2096((byte) -122) != 0;
        }
        if (var2 >= 11) {
            class139.field1917 = arg0.method2096((byte) -122) != 0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "(I)V", line = 250)
    public final void method1303(int arg0) {
        field2433++;
        this.field4351 = (this.field2432 + 7) / 8;
        if (arg0 != 0) {
            field2436 = false;
        }
    }

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "(B)V", line = 263)
    public static final void method1304(byte arg0) {
        if (class109.field1420 == null || class112.field1446 == null) {
            class112.field1446 = new int[256];
            class109.field1420 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class109.field1420[var1] = (int) (Math.sin(var2) * 4096.0D);
                class112.field1446[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != -29) {
            field2436 = false;
        }
        field2426++;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)I", line = 294)
    public final int method1305(boolean arg0) {
        field2429++;
        return arg0 ? -109 : this.field4350[this.field4351++] - this.field2422.method403(-123) & 0xFF;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BII)V", line = 305)
    public final void method1306(int arg0, byte[] arg1, int arg2, int arg3) {
        field2419++;
        int var5 = 0;
        if (arg0 != 1) {
            method1308(-123);
        }
        while (var5 < arg2) {
            arg1[var5 + arg3] = (byte) (this.field4350[this.field4351++] - this.field2422.method403(-127));
            var5++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "(B)V", line = 325)
    public static void method1307(byte arg0) {
        field2428 = null;
        if (arg0 < 59) {
            field2436 = true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "(I)V", line = 338)
    public static final void method1308(int arg0) {
        if (arg0 == 32) {
            field2430++;
            class130.field1775.method2258((byte) 86);
        }
    }

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "(II)V", line = 349)
    public final void method1309(int arg0, int arg1) {
        field2420++;
        if (arg0 == 23) {
            this.field4350[this.field4351++] = (byte) (this.field2422.method403(-114) + arg1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "(II)I", line = 361)
    public final int method1310(int arg0, int arg1) {
        field2431++;
        return arg1 == 8 ? arg0 * 8 - this.field2432 : 112;
    }

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "(II)I", line = 377)
    public final int method1311(int arg0, int arg1) {
        field2425++;
        int var3 = 8 - (this.field2432 & arg1);
        int var4 = this.field2432 >> 3;
        this.field2432 += arg0;
        int var5 = 0;
        while (arg0 > var3) {
            var5 += (this.field4350[var4++] & class248.field3613[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class248.field3613[var3] & this.field4350[var4]) + var5;
        } else {
            var6 = (this.field4350[var4] >> var3 - arg0 & class248.field3613[arg0]) + var5;
        }
        return var6;
    }
}
