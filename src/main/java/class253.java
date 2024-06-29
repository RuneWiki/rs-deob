import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class253 {

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field3713 = 0;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lvq;")
    public static class24 field3717 = new class24(75, 8);

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field3722 = 99;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3723 = null;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "J")
    public static long field3725;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "[Lln;")
    public static class262[] field3720;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "[Lae;")
    public static class285[] field3719;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)Z", line = 6)
    public final boolean method1668(int arg0, int arg1, int arg2, int arg3) {
        field3712++;
        if (arg1 != 2) {
            return true;
        }
        int var5 = this.field3716;
        if (this.field3724 == arg0 && this.field3716 == 0) {
            return false;
        }
        boolean var8;
        if (this.field3716 == 0) {
            if (this.field3724 < arg0 && (this.field3724 + arg3) >= arg0 || arg0 < this.field3724 && arg0 >= this.field3724 - arg3) {
                this.field3724 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field3716 > 0 && this.field3724 < arg0) {
            int var6 = this.field3716 * this.field3716 / (arg3 * 2);
            int var7 = this.field3724 + var6;
            if (var7 < arg0 && var7 >= this.field3724) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field3716 < 0 && this.field3724 > arg0) {
            int var9 = this.field3716 * this.field3716 / (arg3 * 2);
            int var10 = this.field3724 - var9;
            if (var10 > arg0 && this.field3724 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg0 > this.field3724) {
                this.field3716 += arg3;
                if (arg2 != 0 && arg2 < this.field3716) {
                    this.field3716 = arg2;
                }
            } else {
                this.field3716 -= arg3;
                if (arg2 != 0 && -arg2 > this.field3716) {
                    this.field3716 = -arg2;
                }
            }
            if (this.field3716 != var5) {
                int var11 = this.field3716 * this.field3716 / (arg3 * 2);
                if (this.field3724 < arg0) {
                    if (this.field3724 + var11 > arg0) {
                        this.field3716 = var5;
                    }
                } else if (this.field3724 > arg0 && arg0 > (this.field3724 - var11)) {
                    this.field3716 = var5;
                }
            }
        } else if (this.field3716 > 0) {
            this.field3716 -= arg3;
            if (this.field3716 < 0) {
                this.field3716 = 0;
            }
        } else {
            this.field3716 += arg3;
            if (this.field3716 > 0) {
                this.field3716 = 0;
            }
        }
        this.field3724 += this.field3716 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIILjm;)Lhg;", line = 145)
    public static final class299 method1669(int arg0, int arg1, int arg2, class167 arg3) {
        field3715++;
        int var4 = arg0 << 8 | arg3.field2200;
        class299 var5 = (class299) class450.field6598.method1933((long) var4 << 16, 0);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class151.field2051.method733(0, class151.field2051.method724(var4, 37));
        if (var6 == null) {
            int var8 = arg2 + 65536 << 8 | arg3.field2200;
            class299 var9 = (class299) class450.field6598.method1933((long) var8 << 16, 0);
            if (var9 != null) {
                return var9;
            }
            int var10 = -63 / ((arg1 - 55) / 54);
            byte[] var11 = class151.field2051.method733(0, class151.field2051.method724(var8, 37));
            if (var11 == null) {
                int var13 = arg3.field2200 | 0xFFFF00;
                class299 var14 = (class299) class450.field6598.method1933((long) var13 << 16, 0);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class151.field2051.method733(0, class151.field2051.method724(var13, 37));
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class299 var16 = class422.method2604(-117, var15);
                    var16.field4352 = arg3;
                    class450.field6598.method1937(-43, (long) var13 << 16, var16);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class299 var12 = class422.method2604(80, var11);
                var12.field4352 = arg3;
                class450.field6598.method1937(122, (long) var8 << 16, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class299 var7 = class422.method2604(12, var6);
            var7.field4352 = arg3;
            class450.field6598.method1937(122, (long) var4 << 16, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(CIZ)C", line = 216)
    public static final char method1670(char arg0, int arg1, boolean arg2) {
        field3711++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else if (arg2) {
            return (char) 65530;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 300)
    public final void method1671(int arg0) {
        if (arg0 != -22544) {
            field3719 = null;
        }
        field3721++;
        this.field3724 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)I", line = 311)
    public final int method1672(int arg0) {
        field3718++;
        return arg0 == 10319 ? this.field3724 & 0x3FFF : 41;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V", line = 323)
    public static void method1673(int arg0) {
        field3723 = null;
        if (arg0 != -28150) {
            method1670('W', 94, true);
        }
        field3717 = null;
        field3720 = null;
        field3719 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V", line = 346)
    public final void method1674(int arg0, int arg1) {
        this.field3724 = arg0;
        this.field3716 = 0;
        if (arg1 != -2) {
            field3720 = null;
        }
        field3714++;
    }
}
