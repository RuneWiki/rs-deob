import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class191 {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    private int field3730 = -1;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    private int field3734 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lnd;")
    private class122 field3718 = new class122();

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Z")
    public boolean field3737 = false;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[[I")
    private int[][] field3733;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    private int field3727;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[Lhg;")
    private class72[] field3720;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lkb;")
    private static class93 field3726 = class76.method390("Loading title screen )2 ", 0);

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lkb;")
    public static class93 field3725 = field3726;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lnb;")
    public static class120 field3721 = new class120(100);

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3735 = -1;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Lrg;")
    public static class161 field3736;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static final void method1230(byte arg0) {
        class97.field1818 = new int[151];
        class25.field391 = new int[33];
        class205.field3978 = new int[33];
        if (arg0 != 15) {
            method1234(27, 74);
        }
        class138.field2668 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 0;
            int var7 = 999;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class64.field1036.field2208[class64.field1036.field2211 * var1 + var8] == 0) {
                    if (var7 == 999) {
                        var7 = var8;
                    }
                } else if (var7 != 999) {
                    var6 = var8;
                    break;
                }
            }
            class205.field3978[var1] = var7;
            class25.field391[var1] = var6 - var7;
        }
        field3732++;
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class64.field1036.field2208[class64.field1036.field2211 * var2 + var5] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class97.field1818[var2 - 5] = var3 - 25;
            class138.field2668[var2 - 5] = var4 - var3;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
    public static final void method1231(int arg0, byte arg1) {
        field3722++;
        if (arg0 == -1 || !class67.method352(arg1 - 62, arg0)) {
            return;
        }
        class65[] var2 = class28.field460[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class65 var4 = var2[var3];
            if (var4.field1166 != null) {
                class104 var5 = new class104();
                var5.field1924 = var4.field1166;
                var5.field1919 = var4;
                class111.method599(2000000, var5, -127);
            }
        }
        if (arg1 != 64) {
            field3726 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lmc;I)V")
    public static final void method1232(class112 arg0, int arg1) {
        field3728++;
        arg0.field2054 = arg0.field2015;
        if (arg0.field2060 == 0) {
            arg0.field2043 = 0;
            return;
        }
        if (arg0.field2077 != -1 && arg0.field2062 == 0) {
            class37 var2 = class39.method213(-10639, arg0.field2077);
            if (arg0.field2050 > 0 && var2.field612 == 0) {
                arg0.field2043++;
                return;
            }
            if (arg0.field2050 <= 0 && var2.field618 == 0) {
                arg0.field2043++;
                return;
            }
        }
        if (arg1 != 8) {
            field3736 = null;
        }
        int var3 = arg0.field2032;
        int var4 = arg0.field2045;
        int var5 = arg0.field2038[arg0.field2060 - 1] * 128 + arg0.field2046 * 64;
        int var6 = arg0.field2064[arg0.field2060 - 1] * 128 + arg0.field2046 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field2032 = var5;
            arg0.field2045 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var3 <= var5) {
                if (var6 > var4) {
                    arg0.field2071 = 1024;
                } else if (var6 < var4) {
                    arg0.field2071 = 0;
                }
            } else if (var6 > var4) {
                arg0.field2071 = 768;
            } else if (var4 > var6) {
                arg0.field2071 = 256;
            } else {
                arg0.field2071 = 512;
            }
        } else if (var4 < var6) {
            arg0.field2071 = 1280;
        } else if (var4 > var6) {
            arg0.field2071 = 1792;
        } else {
            arg0.field2071 = 1536;
        }
        int var7 = arg0.field2071 - arg0.field2075 & 0x7FF;
        boolean var8 = true;
        int var9 = 4;
        int var10 = arg0.field2076;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var10 = arg0.field2047;
        } else if (var7 >= 256 && var7 < 768) {
            var10 = arg0.field2044;
        } else if (var7 >= -768 && var7 <= -256) {
            var10 = arg0.field2029;
        }
        if (var10 == -1) {
            var10 = arg0.field2047;
        }
        arg0.field2054 = var10;
        if (arg0 instanceof class76) {
            var8 = ((class76) arg0).field1364.field3787;
        }
        if (var8) {
            if (arg0.field2075 != arg0.field2071 && arg0.field2059 == -1 && arg0.field2014 != 0) {
                var9 = 2;
            }
            if (arg0.field2060 > 2) {
                var9 = 6;
            }
            if (arg0.field2060 > 3) {
                var9 = 8;
            }
            if (arg0.field2043 > 0 && arg0.field2060 > 1) {
                var9 = 8;
                arg0.field2043--;
            }
        } else {
            if (arg0.field2060 > 1) {
                var9 = 6;
            }
            if (arg0.field2060 > 2) {
                var9 = 8;
            }
            if (arg0.field2043 > 0 && arg0.field2060 > 1) {
                var9 = 8;
                arg0.field2043--;
            }
        }
        if (arg0.field2069[arg0.field2060 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg0.field2045 += var9;
            if (var6 < arg0.field2045) {
                arg0.field2045 = var6;
            }
        } else if (var4 > var6) {
            arg0.field2045 -= var9;
            if (var6 > arg0.field2045) {
                arg0.field2045 = var6;
            }
        }
        if (var9 >= 8 && arg0.field2054 == arg0.field2047 && arg0.field2020 != -1) {
            arg0.field2054 = arg0.field2020;
        }
        if (var5 > var3) {
            arg0.field2032 += var9;
            if (arg0.field2032 > var5) {
                arg0.field2032 = var5;
            }
        } else if (var5 < var3) {
            arg0.field2032 -= var9;
            if (var5 > arg0.field2032) {
                arg0.field2032 = var5;
            }
        }
        if (arg0.field2032 != var5 || arg0.field2045 != var6) {
            return;
        }
        arg0.field2060--;
        if (arg0.field2050 > 0) {
            arg0.field2050--;
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method1233(int arg0) {
        field3725 = null;
        field3736 = null;
        if (arg0 == -1) {
            field3726 = null;
            field3721 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
    public static final boolean method1234(int arg0, int arg1) {
        field3724++;
        if (arg0 != 1974910684) {
            method1235(101, 92);
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lo;")
    public static final class127 method1235(int arg0, int arg1) {
        field3719++;
        class127 var2 = (class127) class24.field361.method680((long) arg1, (byte) 4);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class53.field893.method461(8, (byte) 117, arg1);
        class127 var4 = new class127();
        if (arg0 != 256) {
            field3736 = null;
        }
        if (var3 != null) {
            var4.method723(new class158(var3), 5);
        }
        class24.field361.method678(true, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public final void method1236(int arg0) {
        for (int var2 = arg0; var2 < this.field3727; var2++) {
            this.field3733[var2] = null;
        }
        field3729++;
        this.field3733 = null;
        this.field3720 = null;
        this.field3718.method702((byte) 93);
        this.field3718 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)[[I")
    public final int[][] method1237(byte arg0) {
        field3723++;
        if (this.field3731 != this.field3727) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -127) {
            method1234(-121, 124);
        }
        for (int var2 = 0; var2 < this.field3727; var2++) {
            this.field3720[var2] = class80.field1419;
        }
        return this.field3733;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[I")
    public final int[] method1238(boolean arg0, int arg1) {
        field3738++;
        if (arg0) {
            return null;
        } else if (this.field3731 == this.field3727) {
            this.field3737 = this.field3720[arg1] == null;
            this.field3720[arg1] = class80.field1419;
            return this.field3733[arg1];
        } else if (this.field3727 == 1) {
            this.field3737 = this.field3730 != arg1;
            this.field3730 = arg1;
            return this.field3733[0];
        } else {
            class72 var3 = this.field3720[arg1];
            if (this.field3737 = var3 == null) {
                if (this.field3727 > this.field3734) {
                    var3 = new class72(arg1, this.field3734);
                    this.field3734++;
                } else {
                    class72 var4 = (class72) this.field3718.method698((byte) 33);
                    var3 = new class72(arg1, var4.field1319);
                    this.field3720[var4.field1322] = null;
                    var4.method235(false);
                }
                this.field3720[arg1] = var3;
            }
            this.field3718.method699(var3, 101);
            return this.field3733[var3.field1319];
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V")
    public class191(int arg0, int arg1, int arg2) {
        this.field3733 = new int[arg0][arg2];
        this.field3731 = arg1;
        this.field3727 = arg0;
        this.field3720 = new class72[arg1];
    }
}
