import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class216 extends class262 {

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    private int field3604 = 0;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    private int field3610 = 0;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3605 = 0;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private int field3606 = -1;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field3595 = -1;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "Z")
    private boolean field3611 = true;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    private int field3619 = -32768;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "Lnm;")
    private class176 field3624 = null;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    private int field3628;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    private int field3599;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "Lia;")
    private class199 field3616;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    private int field3623;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Lcd;")
    public static class64 field3613 = class44.method335((byte) 71, "showingVideoAd");

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "Lcd;")
    public static class64 field3622 = null;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "Lqm;")
    public static class222 field3625;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "Lod;")
    public static class24 field3626;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "Lja;")
    public static class60 field3617;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1513(boolean arg0, int arg1) {
        field3607++;
        for (int var2 = 0; var2 < class218.field3707; var2++) {
            long var3 = (long) class254.field4422[var2] << 32 | 0x20000000L;
            class232 var5 = class2.field12[class254.field4422[var2]];
            if (var5 != null && var5.method318(4) && arg0 == var5.field3911.field108 && var5.field3911.method68(-128)) {
                int var6 = var5.field1859 >> 7;
                int var7 = var5.field1865 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.method325(-12808) == 1 && (var5.field1859 & 0x7F) == 64 && (var5.field1865 & 0x7F) == 64) {
                        if (class273.field4678[var6][var7] == class26.field426) {
                            continue;
                        }
                        class273.field4678[var6][var7] = class26.field426;
                    }
                    if (!var5.field3911.field133) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field1910 = class15.method169(var5.field1865, 13257, class20.field364, var5.field1859);
                    class11.method93(class20.field364, var5.field1859, var5.field1865, var5.field1910, (var5.method325(-12808) - 1) * 64 + 60, var5, var5.field1863, var3, var5.field1849);
                }
            }
        }
        if (arg1 != 127) {
            field3603 = 64;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 63)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class262 var11 = this.method1517((byte) 98);
        field3614++;
        if (var11 != null) {
            var11.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3619 = var11.method48();
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIIIZLa;)V", line = 550)
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class262 arg8) {
        this.field3628 = arg4;
        this.field3621 = arg0;
        this.field3599 = arg2;
        this.field3597 = arg3;
        this.field3608 = arg5;
        this.field3618 = arg1;
        if (class123.field2216 && arg8 != null) {
            if (arg8 instanceof class216) {
                ((class216) arg8).method1515(-1);
            } else {
                class290 var10 = class172.method1207(this.field3621, -113);
                if (var10.field4993 != null) {
                    var10 = var10.method2001(true);
                }
                if (var10 != null) {
                    class200.method1407(var10, this.field3599, this.field3608, 2095812161, this.field3618, this.field3628, 0, this.field3597, 0);
                }
            }
        }
        if (arg6 != -1) {
            this.field3616 = class281.method1944(arg6, 0);
            this.field3623 = class29.field482 - 1;
            this.field3602 = 0;
            if (this.field3616.field3403 == 0 && arg8 != null && arg8 instanceof class216) {
                class216 var11 = (class216) arg8;
                if (this.field3616 == var11.field3616) {
                    this.field3602 = var11.field3602;
                    this.field3623 = var11.field3623;
                    return;
                }
            }
            if (arg7 && this.field3616.field3395 != -1) {
                this.field3602 = (int) (Math.random() * (double) this.field3616.field3393.length);
                this.field3623 -= (int) (Math.random() * (double) this.field3616.field3419[this.field3602]);
            }
        }
        if (class123.field2216 && arg8 != null) {
            this.method1516(true, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V", line = 95)
    private final void method1514(byte arg0, int arg1, int arg2) {
        if (arg0 != 111) {
            field3613 = (class64) null;
        }
        if (this.field3616 != null) {
            int var4 = class29.field482 - this.field3623;
            if (var4 > 100 && this.field3616.field3395 > 0) {
                int var5 = this.field3616.field3393.length - this.field3616.field3395;
                while (var5 > this.field3602 && var4 > this.field3616.field3419[this.field3602]) {
                    var4 -= this.field3616.field3419[this.field3602];
                    this.field3602++;
                }
                if (this.field3602 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3616.field3393.length; var7++) {
                        var6 += this.field3616.field3419[var7];
                    }
                    var4 %= var6;
                }
            }
            label60: {
                do {
                    do {
                        if (var4 <= this.field3616.field3419[this.field3602]) {
                            break label60;
                        }
                        class10.method89(arg2, arg1, this.field3602, this.field3616, true, false);
                        var4 -= this.field3616.field3419[this.field3602];
                        this.field3602++;
                    } while (this.field3616.field3393.length > this.field3602);
                    this.field3602 -= this.field3616.field3395;
                } while (this.field3602 >= 0 && this.field3616.field3393.length > this.field3602);
                this.field3616 = null;
            }
            this.field3623 = class29.field482 - var4;
        }
        field3600++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 161)
    public final void method1515(int arg0) {
        if (this.field3624 != null) {
            class302.method2120(this.field3624, this.field3605, this.field3604, this.field3610);
        }
        field3612++;
        this.field3624 = null;
        this.field3606 = -1;
        this.field3595 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZB)La;", line = 176)
    private final class262 method1516(boolean arg0, byte arg1) {
        boolean var3 = class96.field1764 != class266.field4571;
        field3601++;
        class290 var4 = class172.method1207(this.field3621, arg1 - 51);
        if (var4.field4993 != null) {
            var4 = var4.method2001(true);
        }
        if (var4 == null) {
            if (class123.field2216 && !var3) {
                this.method1515(-1);
            }
            return null;
        }
        int var5 = this.field3599 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field4957;
            var6 = var4.field5017;
        } else {
            var6 = var4.field4957;
            var7 = var4.field5017;
        }
        int var8 = this.field3628 + (var7 >> 1);
        int var9 = (var7 + 1 >> 1) + this.field3628;
        int var10 = (var6 + 1 >> 1) + this.field3608;
        int var11 = this.field3608 + (var6 >> 1);
        this.method1514((byte) 111, var8 * 128, var11 * 128);
        boolean var12 = !var3 && var4.field5013 && (this.field3595 != var4.field4962 || this.field3606 != this.field3602 && class244.field4251 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class96.field1764[this.field3597];
        int var14 = var13[var8][var11] + var13[var9][var11] + var13[var8][var10] + var13[var9][var10] >> 2;
        int var15 = (this.field3608 << 7) + (var6 << 6);
        int[][] var16 = (int[][]) null;
        if (var3) {
            var16 = class266.field4571[0];
        } else if (this.field3597 < 3) {
            var16 = class96.field1764[this.field3597 + 1];
        }
        int var17 = (this.field3628 << 7) + (var7 << 6);
        if (arg1 != -74) {
            return (class262) null;
        }
        if (class123.field2216 && var12) {
            class302.method2120(this.field3624, this.field3605, this.field3604, this.field3610);
        }
        boolean var18 = this.field3624 == null;
        class1 var19;
        if (this.field3616 == null) {
            var19 = var4.method2000(var15, var13, -1, var18 ? class133.field2362 : this.field3624, var17, var12, false, var16, this.field3618, var14, this.field3599);
        } else {
            var19 = var4.method2007(this.field3599, var14, this.field3618, var17, var15, -250, this.field3616, var16, this.field3602, var12, var18 ? class133.field2362 : this.field3624, var13);
        }
        if (var19 == null) {
            return null;
        }
        if (class123.field2216 && var12) {
            if (var18) {
                class133.field2362 = var19.field1;
            }
            int var20 = 0;
            if (this.field3597 != 0) {
                int[][] var21 = class96.field1764[0];
                var20 = var14 - (var21[var8][var10] + var21[var8][var11] + var21[var9][var11] + var21[var9][var10] >> 2);
            }
            class176 var22 = var19.field1;
            if (this.field3611 && class302.method2114(var22, var17, var20, var15)) {
                this.field3611 = false;
            }
            if (!this.field3611) {
                class302.method2112(var22, var17, var20, var15);
                this.field3604 = var20;
                if (var18) {
                    class133.field2362 = null;
                }
                this.field3605 = var17;
                this.field3624 = var22;
                this.field3610 = var15;
            }
            this.field3595 = var4.field4962;
            this.field3606 = this.field3602;
        }
        return var19.field6;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)La;", line = 310)
    private final class262 method1517(byte arg0) {
        field3627++;
        if (arg0 < 85) {
            method1520(30, 70);
        }
        return this.method1516(false, (byte) -74);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)I", line = 323)
    public static final int method1518(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3596++;
        int var5 = arg4 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg3;
        if (arg2 != 15094688) {
            method1520(-24, -90);
        }
        int var7 = var5 < 4 ? arg3 : (var5 == 12 || var5 == 14 ? arg1 : arg0);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I", line = 341)
    public final int method48() {
        field3620++;
        return this.field3619;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIII)V", line = 353)
    public static final void method1519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg7 >= 0 && arg5 < 103 && arg7 < 103) {
            if (arg3 == 0) {
                class162 var8 = class32.method274(arg2, arg5, arg7);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2848 >>> 32);
                    if (arg6 == 2) {
                        var8.field2852 = new class216(var9, 2, arg0 + 4, arg2, arg5, arg7, arg1, false, var8.field2852);
                        var8.field2842 = new class216(var9, 2, arg0 + 1 & 0x3, arg2, arg5, arg7, arg1, false, var8.field2842);
                    } else {
                        var8.field2852 = new class216(var9, arg6, arg0, arg2, arg5, arg7, arg1, false, var8.field2852);
                    }
                }
            }
            if (arg3 == 1) {
                class184 var10 = class235.method1685(arg2, arg5, arg7);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3141 >>> 32);
                    if (arg6 == 4 || arg6 == 5) {
                        var10.field3151 = new class216(var11, 4, arg0, arg2, arg5, arg7, arg1, false, var10.field3151);
                    } else if (arg6 == 6) {
                        var10.field3151 = new class216(var11, 4, arg0 + 4, arg2, arg5, arg7, arg1, false, var10.field3151);
                    } else if (arg6 == 7) {
                        var10.field3151 = new class216(var11, 4, (arg0 + 2 & 0x3) + 4, arg2, arg5, arg7, arg1, false, var10.field3151);
                    } else if (arg6 == 8) {
                        var10.field3151 = new class216(var11, 4, arg0 + 4, arg2, arg5, arg7, arg1, false, var10.field3151);
                        var10.field3143 = new class216(var11, 4, (arg0 + 2 & 0x3) + 4, arg2, arg5, arg7, arg1, false, var10.field3143);
                    }
                }
            }
            if (arg3 == 2) {
                class195 var12 = class268.method1873(arg2, arg5, arg7);
                if (arg6 == 11) {
                    arg6 = 10;
                }
                if (var12 != null) {
                    var12.field3330 = new class216(Integer.MAX_VALUE & (int) (var12.field3324 >>> 32), arg6, arg0, arg2, arg5, arg7, arg1, false, var12.field3330);
                }
            }
            if (arg3 == 3) {
                class37 var13 = class20.method195(arg2, arg5, arg7);
                if (var13 != null) {
                    var13.field599 = new class216(Integer.MAX_VALUE & (int) (var13.field593 >>> 32), 22, arg0, arg2, arg5, arg7, arg1, false, var13.field599);
                }
            }
        }
        field3609++;
        int var14 = -30 / ((53 - arg4) / 55);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)I", line = 446)
    public static final int method1520(int arg0, int arg1) {
        field3629++;
        if (arg0 < 0) {
            return 0;
        }
        class115 var2 = (class115) class17.field351.method1151((long) arg0, 0);
        if (var2 == null) {
            return class246.method1779((byte) -64, arg0).field2784;
        }
        int var3 = 0;
        if (arg1 != -21829) {
            field3625 = (class222) null;
        }
        for (int var4 = 0; var4 < var2.field2109.length; var4++) {
            if (var2.field2109[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class246.method1779((byte) -64, arg0).field2784 - var2.field2109.length);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 494)
    public static void method1521(int arg0) {
        field3617 = null;
        int var1 = -81 / ((arg0 + 28) / 57);
        field3622 = null;
        field3626 = null;
        field3625 = null;
        field3613 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V", line = 517)
    public final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class123.field2216) {
            this.method1516(true, (byte) -74);
        } else {
            this.method1514((byte) 111, ((arg2 - arg4 >> 1) + arg4) * 128 + 64, (arg0 - -(-arg0 + arg3 >> 1)) * 128 + 64);
        }
        field3615++;
        if (arg1 != 8) {
            this.method1515(115);
        }
    }
}
