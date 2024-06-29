import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class46 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    private int field988 = 0;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field985 = 128;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field987 = -1;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    private int field990 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    private int field995 = 128;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    private int field996 = 0;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "Z")
    public boolean field1005 = false;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Llb;")
    public static class127 field989 = new class127(30);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field1004 = 0;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "[I")
    public static int[] field998 = new int[100];

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Ltg;")
    public static class177 field1000;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    public static int[] field1003;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[S")
    private short[] field1002;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[S")
    private short[] field982;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[S")
    private short[] field983;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "[S")
    private short[] field992;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsi;I)V")
    private final void method290(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1301(-8317);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field994++;
                return;
            }
            this.method291(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLsi;I)V")
    private final void method291(boolean arg0, class194 arg1, int arg2) {
        field999++;
        if (arg2 == 1) {
            this.field986 = arg1.method1294((byte) 3);
        } else if (arg2 == 2) {
            this.field987 = arg1.method1294((byte) 3);
        } else if (arg2 == 4) {
            this.field995 = arg1.method1294((byte) 3);
        } else if (arg2 == 5) {
            this.field985 = arg1.method1294((byte) 3);
        } else if (arg2 == 6) {
            this.field990 = arg1.method1294((byte) 3);
        } else if (arg2 == 7) {
            this.field988 = arg1.method1301(-8317);
        } else if (arg2 == 8) {
            this.field996 = arg1.method1301(-8317);
        } else if (arg2 == 9) {
            this.field1005 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1301(-8317);
            this.field983 = new short[var4];
            this.field1002 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field983[var5] = (short) arg1.method1294((byte) 3);
                this.field1002[var5] = (short) arg1.method1294((byte) 3);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1301(-8317);
            this.field992 = new short[var6];
            this.field982 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field982[var7] = (short) arg1.method1294((byte) 3);
                this.field992[var7] = (short) arg1.method1294((byte) 3);
            }
        }
        if (arg0) {
            this.field983 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method292(int arg0) {
        field1000 = null;
        if (arg0 == -23190) {
            field989 = null;
            field998 = null;
            field1003 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)V")
    public static final void method293(int arg0, boolean arg1) {
        if (arg1) {
            if (class186.field3353 != -1) {
                class121.method784(class186.field3353, -10619);
            }
            for (class266 var2 = (class266) class212.field3797.method38(24172); var2 != null; var2 = (class266) class212.field3797.method36(-4)) {
                class218.method1488(var2, true, true);
            }
            class186.field3353 = -1;
            class212.field3797 = new class5(8);
            class39.method249((byte) 87);
            class186.field3353 = class3.field59;
            class82.method553(-32768, false);
            class259.method1708((byte) 66);
            class128.method834(class186.field3353, (byte) -111);
        }
        field984++;
        class229.field4018 = new class137();
        class229.field4018.field4705 = 3000;
        if (arg0 >= -44) {
            field1006 = -63;
        }
        class229.field4018.field4688 = 3000;
        class244.method1655(class204.field3664, -128);
        class244.method1659(10, 26473);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IZ)Lph;")
    public final class76 method294(int arg0, boolean arg1) {
        class76 var3 = (class76) field989.method828(0, (long) this.field991);
        field993++;
        if (var3 == null) {
            class242 var4 = class242.method1635(class37.field855, this.field986, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field983 != null) {
                for (int var5 = 0; var5 < this.field983.length; var5++) {
                    var4.method1633(this.field983[var5], this.field1002[var5]);
                }
            }
            if (this.field982 != null) {
                for (int var6 = 0; var6 < this.field982.length; var6++) {
                    var4.method1622(this.field982[var6], this.field992[var6]);
                }
            }
            var3 = var4.method1621(this.field988 + 64, this.field996 + 850, -30, -50, -30);
            field989.method826((long) this.field991, 9815, var3);
        }
        class76 var7;
        if (this.field987 == -1 || arg0 == -1) {
            var7 = var3.method510(true, true);
        } else {
            var7 = class186.method1226(12828, this.field987).method1609(var3, arg0, 2);
        }
        if (this.field995 != 128 || this.field985 != 128) {
            var7.method504(this.field995, this.field985, this.field995);
        }
        if (this.field990 != 0) {
            if (this.field990 == 90) {
                var7.method519();
            }
            if (this.field990 == 180) {
                var7.method501();
            }
            if (this.field990 == 270) {
                var7.method512();
            }
        }
        return arg1 ? var7 : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Loe;")
    public static final class140 method295(boolean arg0) {
        field997++;
        if (!arg0) {
            method296(-5, -39);
        }
        byte[] var1 = class191.field3425[0];
        int var2 = class198.field3583[0] * class181.field3289[0];
        class140 var5;
        if (class137.field2496[0]) {
            byte[] var6 = class51.field1091[0];
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class160.method1052(class103.field1965[class263.method1777(255, var1[var8])], class263.method1777(var6[var8], 255) << 24);
            }
            var5 = new class175(class240.field4200, class2.field46, class198.field3584[0], field1003[0], class198.field3583[0], class181.field3289[0], var7);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class103.field1965[class263.method1777(255, var1[var4])];
            }
            var5 = new class140(class240.field4200, class2.field46, class198.field3584[0], field1003[0], class198.field3583[0], class181.field3289[0], var3);
        }
        class14.method111(0);
        return var5;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)La;")
    public static final class46 method296(int arg0, int arg1) {
        field1001++;
        class46 var2 = (class46) class101.field1932.method828(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field2268.method596(16, class108.method721(arg1, (byte) -32), class48.method308(arg1, false));
        class46 var4 = new class46();
        var4.field991 = arg1;
        if (arg0 >= -49) {
            method296(-32, 87);
        }
        if (var3 != null) {
            var4.method290(new class194(var3), -1);
        }
        class101.field1932.method826((long) arg1, 9815, var4);
        return var4;
    }
}
