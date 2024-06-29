import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class511 {

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Lbh;")
    private class538 field7123 = new class538(64);

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Lbh;")
    public class538 field7137 = new class538(50);

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Lkca;")
    public class756 field7138 = new class756(250);

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "Lvba;")
    private class734 field7139 = new class734();

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Ldda;")
    private class392 field7141;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Lwu;")
    private class557 field7121;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "Z")
    private boolean field7118;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "Lwu;")
    public class557 field7124;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public int field7131;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public int field7134;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field7143;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field7140;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Z")
    public static boolean field7122 = false;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "[I")
    public static int[] field7132 = new int[5];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public int field7142;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7117;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lwn;I)V")
    public static final void method3044(class583 arg0, int arg1) {
        field7125++;
        int var2 = 0;
        arg0.method3464(arg1 + 6);
        for (int var3 = 0; var3 < class147.field2030; var3++) {
            int var15 = class351.field4456[var3];
            if ((class204.field2933[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class204.field2933[var15] = (byte) class747.method4153(class204.field2933[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method3467(arg1 ^ 0x50, 1);
                    if (var16 == 0) {
                        var2 = class61.method396(arg0, -29124);
                        class204.field2933[var15] = (byte) class747.method4153(class204.field2933[var15], 2);
                    } else {
                        class492.method2871(2, arg0, var15);
                    }
                }
            }
        }
        arg0.method3458((byte) 53);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method3464(8);
        for (int var4 = 0; var4 < class147.field2030; var4++) {
            int var13 = class351.field4456[var4];
            if ((class204.field2933[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class204.field2933[var13] = (byte) class747.method4153(class204.field2933[var13], 2);
                } else {
                    int var14 = arg0.method3467(arg1 ^ 0x59, 1);
                    if (var14 == 0) {
                        var2 = class61.method396(arg0, arg1 - 29126);
                        class204.field2933[var13] = (byte) class747.method4153(class204.field2933[var13], 2);
                    } else {
                        class492.method2871(2, arg0, var13);
                    }
                }
            }
        }
        arg0.method3458((byte) 53);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method3464(8);
        if (arg1 != 2) {
            return;
        }
        for (int var5 = 0; var5 < class223.field3127; var5++) {
            int var11 = class87.field1203[var5];
            if ((class204.field2933[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class204.field2933[var11] = (byte) class747.method4153(class204.field2933[var11], 2);
                } else {
                    int var12 = arg0.method3467(arg1 ^ 0x77, 1);
                    if (var12 == 0) {
                        var2 = class61.method396(arg0, -29124);
                        class204.field2933[var11] = (byte) class747.method4153(class204.field2933[var11], 2);
                    } else if (class80.method478(var11, arg0, (byte) 38)) {
                        class204.field2933[var11] = (byte) class747.method4153(class204.field2933[var11], 2);
                    }
                }
            }
        }
        arg0.method3458((byte) 53);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method3464(8);
        for (int var6 = 0; var6 < class223.field3127; var6++) {
            int var9 = class87.field1203[var6];
            if ((class204.field2933[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class204.field2933[var9] = (byte) class747.method4153(class204.field2933[var9], 2);
                } else {
                    int var10 = arg0.method3467(arg1 ^ 0x72, 1);
                    if (var10 == 0) {
                        var2 = class61.method396(arg0, -29124);
                        class204.field2933[var9] = (byte) class747.method4153(class204.field2933[var9], 2);
                    } else if (class80.method478(var9, arg0, (byte) 38)) {
                        class204.field2933[var9] = (byte) class747.method4153(class204.field2933[var9], 2);
                    }
                }
            }
        }
        arg0.method3458((byte) 53);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class147.field2030 = 0;
        class223.field3127 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class204.field2933[var7] = (byte) (class204.field2933[var7] >> 1);
            class655 var8 = class40.field563[var7];
            if (var8 == null) {
                class87.field1203[class223.field3127++] = var7;
            } else {
                class351.field4456[class147.field2030++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
    public final void method3045(int arg0, int arg1) {
        class538 var3 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method3204((byte) 63, arg1);
        }
        field7116++;
        class538 var4 = this.field7137;
        synchronized (this.field7137) {
            this.field7137.method3204((byte) -69, arg1);
        }
        class756 var5 = this.field7138;
        synchronized (this.field7138) {
            this.field7138.method4201(false, arg1);
        }
        if (arg0 != 0) {
            this.method3051(false);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBIIIILme;Lha;)Lcw;")
    public final class21 method3046(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class635 arg6, class545 arg7) {
        if (arg1 < 84) {
            this.field7138 = null;
        }
        this.field7139.field10274 = arg2;
        this.field7139.field10268 = arg4;
        this.field7139.field10276 = arg5;
        this.field7139.field10277 = arg6 != null;
        this.field7139.field10270 = arg3;
        field7135++;
        this.field7139.field10269 = arg7.field7688;
        this.field7139.field10273 = arg0;
        return (class21) this.field7138.method4196(this.field7139, false);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIIILme;ZLda;Lha;ILha;IZ)Lcw;")
    public final class21 method3047(boolean arg0, int arg1, int arg2, int arg3, class635 arg4, boolean arg5, class400 arg6, class545 arg7, int arg8, class545 arg9, int arg10, boolean arg11) {
        field7128++;
        class21 var13 = this.method3046(arg10, (byte) 120, arg8, arg3, arg1, arg2, arg4, arg7);
        if (var13 != null) {
            return var13;
        }
        class544 var14 = this.method3054(arg2, (byte) -99);
        if (arg10 > 1 && var14.field7611 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field7633[var16] <= arg10 && var14.field7633[var16] != 0) {
                    var15 = var14.field7611[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3054(var15, (byte) -99);
            }
        }
        int[] var17 = var14.method3247(arg3, arg1, 24419, arg9, arg4, arg10, arg8, arg7, arg6, arg11);
        if (arg0) {
            method3049(-90, (byte) -113, 37, null);
        }
        if (var17 == null) {
            return null;
        }
        class21 var18;
        if (arg5) {
            var18 = arg9.method3258(var17, 1, 0, 36, 36, 32);
        } else {
            var18 = arg7.method3258(var17, 1, 0, 36, 36, 32);
        }
        if (!arg5) {
            class734 var19 = new class734();
            var19.field10274 = arg8;
            var19.field10270 = arg3;
            var19.field10268 = arg1;
            var19.field10273 = arg10;
            var19.field10269 = arg7.field7688;
            var19.field10276 = arg2;
            var19.field10277 = arg4 != null;
            this.field7138.method4200(var19, 11667, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public final void method3048(byte arg0) {
        class756 var2 = this.field7138;
        synchronized (this.field7138) {
            if (arg0 != 99) {
                return;
            }
            this.field7138.method4195((byte) -91);
        }
        field7119++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBILjava/awt/Canvas;)Lsfa;")
    public static final class125 method3049(int arg0, byte arg1, int arg2, Canvas arg3) {
        field7129++;
        try {
            Class var4 = Class.forName("pa");
            if (arg1 < 125) {
                method3055(69);
            }
            class125 var5 = (class125) var4.getDeclaredConstructor().newInstance();
            var5.method800(arg0, arg3, arg2, (byte) 113);
            return var5;
        } catch (Throwable var7) {
            class641 var6 = new class641();
            var6.method800(arg0, arg3, arg2, (byte) 113);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public final void method3050(int arg0) {
        field7130++;
        class538 var2 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method3210(false);
        }
        if (arg0 != -1) {
            method3044(null, 56);
        }
        class538 var3 = this.field7137;
        synchronized (this.field7137) {
            this.field7137.method3210(false);
        }
        class756 var4 = this.field7138;
        synchronized (this.field7138) {
            this.field7138.method4195((byte) -89);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public final void method3051(boolean arg0) {
        class538 var2 = this.field7137;
        synchronized (this.field7137) {
            this.field7137.method3210(arg0);
        }
        if (arg0) {
            field7132 = null;
        }
        field7120++;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
    public final void method3052(int arg0, int arg1) {
        field7127++;
        this.field7142 = arg1;
        class538 var3 = this.field7137;
        synchronized (this.field7137) {
            int var4 = -9 % ((9 - arg0) / 58);
            this.field7137.method3210(false);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BZ)V")
    public final void method3053(byte arg0, boolean arg1) {
        field7126++;
        if (arg0 >= 16 && this.field7118 != arg1) {
            this.field7118 = arg1;
            this.method3050(-1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)Lbj;")
    public final class544 method3054(int arg0, byte arg1) {
        field7136++;
        class538 var3 = this.field7123;
        class544 var4;
        synchronized (this.field7123) {
            var4 = (class544) this.field7123.method3200((long) arg0, arg1 ^ 0x4E6C);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field7121;
        byte[] var6;
        synchronized (this.field7121) {
            var6 = this.field7121.method3322(class116.method766(-25922, arg0), class223.method1452(arg0, (byte) 106), (byte) 85);
        }
        class544 var7 = new class544();
        var7.field7613 = this;
        var7.field7640 = arg0;
        var7.field7623 = new String[] { null, null, class138.field1843.method891(arg1 ^ 0x79B11E6D, this.field7131), null, null };
        var7.field7654 = new String[] { null, null, null, null, class138.field1844.method891(-2041650704, this.field7131) };
        if (arg1 != -99) {
            return null;
        }
        if (var6 != null) {
            var7.method3245((byte) 122, new class26(var6));
        }
        var7.method3246((byte) 122);
        if (var7.field7655 != -1) {
            var7.method3249(this.method3054(var7.field7679, (byte) -99), this.method3054(var7.field7655, (byte) -99), arg1 - 16);
        }
        if (var7.field7618 != -1) {
            var7.method3248(-1, this.method3054(var7.field7608, (byte) -99), this.method3054(var7.field7618, (byte) -99));
        }
        if (!this.field7118 && var7.field7670) {
            var7.field7672 = class138.field1841.method891(-2041650704, this.field7131);
            var7.field7634 = false;
            var7.field7666 = null;
            var7.field7645 = 0;
            var7.field7654 = this.field7140;
            var7.field7623 = this.field7143;
            if (var7.field7656 != null) {
                boolean var8 = false;
                for (class513 var9 = var7.field7656.method1382(27901); var9 != null; var9 = var7.field7656.method1383(false)) {
                    class752 var10 = this.field7141.method2390(1, (int) var9.field7166);
                    if (var10.field10445) {
                        var9.method3065(-17363);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7656 = null;
                }
            }
        }
        class538 var11 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static void method3055(int arg0) {
        field7132 = null;
        field7117 = null;
        if (arg0 != -1) {
            field7117 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public final void method3056(int arg0) {
        if (arg0 >= -121) {
            this.field7124 = null;
        }
        field7133++;
        class538 var2 = this.field7123;
        synchronized (this.field7123) {
            this.field7123.method3202((byte) 127);
        }
        class538 var3 = this.field7137;
        synchronized (this.field7137) {
            this.field7137.method3202((byte) 127);
        }
        class756 var4 = this.field7138;
        synchronized (this.field7138) {
            this.field7138.method4198(-1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lwj;IZLdda;Lwu;Lwu;)V")
    public class511(class121 arg0, int arg1, boolean arg2, class392 arg3, class557 arg4, class557 arg5) {
        this.field7141 = arg3;
        this.field7121 = arg4;
        this.field7118 = arg2;
        this.field7124 = arg5;
        this.field7131 = arg1;
        if (this.field7121 == null) {
            this.field7134 = 0;
        } else {
            int var7 = this.field7121.method3341((byte) -98) - 1;
            this.field7134 = var7 * 256 + this.field7121.method3333(var7, 3443);
        }
        this.field7143 = new String[] { null, null, class138.field1843.method891(-2041650704, this.field7131), null, null };
        this.field7140 = new String[] { null, null, null, null, class138.field1844.method891(-2041650704, this.field7131) };
    }
}
