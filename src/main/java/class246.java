import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class246 {

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lhd;")
    public class128 field3926 = new class128();

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
    public static int[] field3921 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3912 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "B")
    public static byte field3920;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lhd;")
    private class128 field3927;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[I")
    public static int[] field3916;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Lhd;")
    public final class128 method1640(byte arg0) {
        if (arg0 >= -25) {
            method1649(23, (char) 65506);
        }
        field3924++;
        class128 var2 = this.field3926.field2015;
        if (this.field3926 == var2) {
            this.field3927 = null;
            return null;
        } else {
            this.field3927 = var2.field2015;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method1641(byte arg0) {
        field3916 = null;
        field3921 = null;
        if (arg0 != 73) {
            field3912 = -122;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)Lhd;")
    public final class128 method1642(byte arg0) {
        if (arg0 < 26) {
            this.method1650((byte) 45);
        }
        field3918++;
        class128 var2 = this.field3927;
        if (this.field3926 == var2) {
            this.field3927 = null;
            return null;
        } else {
            this.field3927 = var2.field2022;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)Lhd;")
    public final class128 method1643(byte arg0) {
        field3914++;
        int var2 = 115 % ((37 - arg0) / 62);
        class128 var3 = this.field3926.field2022;
        if (this.field3926 == var3) {
            this.field3927 = null;
            return null;
        } else {
            this.field3927 = var3.field2022;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI)V")
    public static final void method1644(long arg0, int arg1) {
        if (!class144.field2281) {
            class90.field1456 += (float) arg0 * class245.field3887 / 40.0F;
            class20.field240 += (float) arg0 * class193.field3141 / 40.0F;
        }
        field3913++;
        if (arg1 != 0) {
            return;
        }
        int var3 = class208.field3300 + class239.field3829.field710;
        int var4 = class15.field160 + class239.field3829.field637;
        if (class162.field2580 - var4 < -500 || class162.field2580 - var4 > 500 || class163.field2646 - var3 < -500 || (class163.field2646 - var3) > 500) {
            class163.field2646 = var3;
            class162.field2580 = var4;
        }
        if (class162.field2580 != var4) {
            int var5 = var4 - class162.field2580;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class162.field2580 += var6;
        }
        if (class163.field2646 != var3) {
            int var7 = var3 - class163.field2646;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class163.field2646 += var8;
        }
        class296.method1966(arg1 ^ 0xFFFFFF88);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILhd;)V")
    public final void method1645(int arg0, class128 arg1) {
        if (arg1.field2015 != null) {
            arg1.method913(-3542);
        }
        arg1.field2022 = this.field3926.field2022;
        arg1.field2015 = this.field3926;
        arg1.field2015.field2022 = arg1;
        field3915++;
        if (arg0 <= 32) {
            field3920 = -41;
        }
        arg1.field2022.field2015 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLhd;)V")
    public final void method1646(boolean arg0, class128 arg1) {
        field3928++;
        if (arg1.field2015 != null) {
            arg1.method913(-3542);
        }
        arg1.field2022 = this.field3926;
        arg1.field2015 = this.field3926.field2015;
        arg1.field2015.field2022 = arg1;
        if (!arg0) {
            this.field3926 = null;
        }
        arg1.field2022.field2015 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Lhd;")
    public final class128 method1647(int arg0) {
        if (arg0 != 1939253256) {
            method1649(122, (char) 65459);
        }
        field3923++;
        class128 var2 = this.field3927;
        if (this.field3926 == var2) {
            this.field3927 = null;
            return null;
        } else {
            this.field3927 = var2.field2015;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
    public static final int method1648(int arg0, int arg1) {
        field3911++;
        return arg1 == 1939253256 ? arg0 >>> 8 : 79;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IC)B")
    public static final byte method1649(int arg0, char arg1) {
        if (arg0 != -8217) {
            return 18;
        }
        field3925++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V")
    public final void method1650(byte arg0) {
        if (arg0 != -119) {
            this.field3927 = null;
        }
        field3919++;
        while (true) {
            class128 var2 = this.field3926.field2022;
            if (this.field3926 == var2) {
                this.field3927 = null;
                return;
            }
            var2.method913(-3542);
        }
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(B)Lhd;")
    public final class128 method1651(byte arg0) {
        field3917++;
        if (arg0 < 114) {
            field3921 = null;
        }
        class128 var2 = this.field3926.field2022;
        if (this.field3926 == var2) {
            return null;
        } else {
            var2.method913(-3542);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class246() {
        this.field3926.field2022 = this.field3926;
        this.field3926.field2015 = this.field3926;
    }
}
