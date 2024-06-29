import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class233 extends class119 {

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    private int field4005 = 0;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    private int field4007 = -32768;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "Z")
    public boolean field4023 = false;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    private int field4030 = 0;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public int field4000;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public int field4024;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    private int field4027;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public int field4013;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public int field4029;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lje;")
    private class138 field4004;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lsb;")
    public static class98 field4011 = class47.method368("", 0);

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Lsb;")
    public static class98 field4017 = field4011;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "Lsb;")
    public static class98 field4019 = class47.method368("Benutzen", 0);

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "Lsb;")
    public static class98 field4010 = field4011;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lsb;")
    private static class98 field4001 = class47.method368("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 0);

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "Lsb;")
    public static class98 field4025 = class47.method368("Weiter", 0);

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "Lsb;")
    public static class98 field4028 = class47.method368("Clientscript error )2 check log for details", 0);

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "Lsb;")
    public static class98 field4020 = field4001;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Lac;")
    public static class188 field4003;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Ltg;")
    public static class75 field4016;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "[[[B")
    public static byte[][][] field4006;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "[[[I")
    public static int[][][] field4018;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lne;I)I")
    public static final int method1594(class108 arg0, int arg1) {
        if (arg1 != -1) {
            return 16;
        }
        class120 var2 = arg0.field1928;
        field4009++;
        if (var2.field2189 != null) {
            var2 = var2.method895(arg1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2171;
        if (arg0.field4510 == arg0.field4479) {
            var3 = var2.field2162;
        } else if (arg0.field4490 == arg0.field4479) {
            var3 = var2.field2211;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method1595(int arg0, int arg1) {
        field4012++;
        if (arg0 != 5) {
            this.field4005 = -73;
        }
        if (this.field4023) {
            return;
        }
        this.field4005 += arg1;
        while (this.field4005 > this.field4004.field2439[this.field4030]) {
            this.field4005 -= this.field4004.field2439[this.field4030];
            this.field4030++;
            if (this.field4004.field2454.length <= this.field4030) {
                this.field4023 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lna;")
    private final class17 method1596(byte arg0) {
        if (arg0 != 116) {
            this.field4007 = 115;
        }
        field4021++;
        class203 var2 = class49.method385(this.field4027, arg0 ^ 0x74);
        class17 var3;
        if (this.field4023) {
            var3 = var2.method1376(-124, -1);
        } else {
            var3 = var2.method1376(arg0 - 244, this.field4030);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4002++;
        class17 var11 = this.method1596((byte) 116);
        if (var11 != null) {
            var11.method91(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4007 = var11.method90();
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
    public static void method1597(byte arg0) {
        field4016 = null;
        field4017 = null;
        field4018 = null;
        field4019 = null;
        field4028 = null;
        field4006 = null;
        field4025 = null;
        field4010 = null;
        field4020 = null;
        if (arg0 != -105) {
            method1598(-78, true, 56, (class148) null, -92);
        }
        field4001 = null;
        field4011 = null;
        field4003 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZILq;I)V")
    public static final void method1598(int arg0, boolean arg1, int arg2, class148 arg3, int arg4) {
        field4022++;
        int var5 = arg3.field2694;
        if (arg3.field2609 == 0) {
            arg3.field2694 = arg3.field2669;
        } else if (arg3.field2609 == 1) {
            arg3.field2694 = arg0 - arg3.field2669;
        } else if (arg3.field2609 == 2) {
            arg3.field2694 = arg3.field2669 * arg0 >> 14;
        } else if (arg3.field2609 == 3) {
            if (arg3.field2665 == 2) {
                arg3.field2694 = arg3.field2669 * 32 + ((arg3.field2669 - 1) * arg3.field2622);
            } else if (arg3.field2665 == 7) {
                arg3.field2694 = (arg3.field2669 - 1) * arg3.field2622 + arg3.field2669 * 115;
            }
        }
        int var6 = arg3.field2647;
        if (arg2 >= -59) {
            field4011 = null;
        }
        if (arg3.field2673 == 0) {
            arg3.field2647 = arg3.field2597;
        } else if (arg3.field2673 == 1) {
            arg3.field2647 = arg4 - arg3.field2597;
        } else if (arg3.field2673 == 2) {
            arg3.field2647 = arg3.field2597 * arg4 >> 14;
        } else if (arg3.field2673 == 3) {
            if (arg3.field2665 == 2) {
                arg3.field2647 = (arg3.field2597 - 1) * arg3.field2652 + arg3.field2597 * 32;
            } else if (arg3.field2665 == 7) {
                arg3.field2647 = (arg3.field2597 - 1) * arg3.field2652 + arg3.field2597 * 12;
            }
        }
        if (arg3.field2609 == 4) {
            arg3.field2694 = arg3.field2675 * arg3.field2647 / arg3.field2747;
        }
        if (arg3.field2673 == 4) {
            arg3.field2647 = arg3.field2747 * arg3.field2694 / arg3.field2675;
        }
        if (class186.field3207 && (client.method761(arg3) != 0 || arg3.field2665 == 0)) {
            if (arg3.field2647 < 5 && arg3.field2694 < 5) {
                arg3.field2694 = 5;
                arg3.field2647 = 5;
            } else {
                if (arg3.field2694 <= 0) {
                    arg3.field2694 = 5;
                }
                if (arg3.field2647 <= 0) {
                    arg3.field2647 = 5;
                }
            }
        }
        if (arg3.field2691 == 1337) {
            class23.field473 = arg3;
        }
        if (arg1 && arg3.field2602 != null && arg3.field2694 != var5 || arg3.field2647 != var6) {
            class28 var7 = new class28();
            var7.field517 = arg3;
            var7.field514 = arg3.field2602;
            class88.field1554.method376((byte) 13, var7);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "()I")
    public final int method90() {
        field4014++;
        return this.field4007;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)Z")
    public static final boolean method1599(byte arg0, int arg1) {
        field4026++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class212.field3630[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 < 67) {
            return false;
        } else {
            return var2 == 1004;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public static final void method1600(byte arg0) {
        class237.field4084.method490(145, -61);
        int var1 = -92 % ((-arg0 - 29) / 46);
        class237.field4084.method1484(0L, (byte) 38);
        field4015++;
        class118.field2110++;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIIII)V")
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4008 = arg3;
        this.field4000 = arg1;
        this.field4024 = arg5 + arg6;
        this.field4027 = arg0;
        this.field4013 = arg2;
        this.field4029 = arg4;
        int var8 = class49.method385(this.field4027, 0).field3464;
        if (var8 == -1) {
            this.field4023 = true;
        } else {
            this.field4023 = false;
            this.field4004 = class16.method144(1, var8);
        }
    }
}
