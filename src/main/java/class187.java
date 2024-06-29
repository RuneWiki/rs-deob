import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class187 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ltj;")
    public class280 field3013 = new class280();

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[S")
    public static short[] field3010 = new short[256];

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field3020 = 2;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Ltj;")
    private class280 field3016;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public final void method1382(int arg0) {
        if (arg0 != 0) {
            this.method1386((byte) 35);
        }
        while (true) {
            class280 var2 = this.field3013.field4470;
            if (this.field3013 == var2) {
                field3009++;
                this.field3016 = null;
                return;
            }
            var2.method1922(-1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILqi;II)V")
    public static final void method1383(int arg0, class131 arg1, int arg2, int arg3) {
        if (arg1.field2070 == 0) {
            arg1.field2001 = arg1.field2169;
        } else if (arg1.field2070 == 1) {
            arg1.field2001 = (arg3 - arg1.field2102) / 2 + arg1.field2169;
        } else if (arg1.field2070 == 2) {
            arg1.field2001 = arg3 - arg1.field2102 - arg1.field2169;
        } else if (arg1.field2070 == 3) {
            arg1.field2001 = arg1.field2169 * arg3 >> 14;
        } else if (arg1.field2070 == 4) {
            arg1.field2001 = (arg1.field2169 * arg3 >> 14) + (arg3 - arg1.field2102) / 2;
        } else {
            arg1.field2001 = arg3 - arg1.field2102 - (arg1.field2169 * arg3 >> 14);
        }
        field3017++;
        if (arg1.field2130 == 0) {
            arg1.field2121 = arg1.field2132;
        } else if (arg1.field2130 == 1) {
            arg1.field2121 = (arg0 - arg1.field2167) / 2 + arg1.field2132;
        } else if (arg1.field2130 == 2) {
            arg1.field2121 = arg0 - arg1.field2132 - arg1.field2167;
        } else if (arg1.field2130 == 3) {
            arg1.field2121 = arg1.field2132 * arg0 >> 14;
        } else if (arg1.field2130 == 4) {
            arg1.field2121 = (arg1.field2132 * arg0 >> 14) + (arg0 - arg1.field2167) / 2;
        } else {
            arg1.field2121 = arg0 - arg1.field2167 - (arg1.field2132 * arg0 >> 14);
        }
        if (class36.field447 && (client.method1168(arg1).field1063 != 0 || arg1.field2150 == 0)) {
            if (arg1.field2121 < 0) {
                arg1.field2121 = 0;
            } else if (arg1.field2167 + arg1.field2121 > arg0) {
                arg1.field2121 = arg0 - arg1.field2167;
            }
            if (arg1.field2001 < 0) {
                arg1.field2001 = 0;
            } else if ((arg1.field2102 + arg1.field2001) > arg3) {
                arg1.field2001 = arg3 - arg1.field2102;
            }
        }
        if (arg2 != -13075) {
            method1387((byte) -60, 41);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Ltj;")
    public final class280 method1384(int arg0) {
        field3006++;
        if (arg0 != 2) {
            return null;
        }
        class280 var2 = this.field3013.field4470;
        if (this.field3013 == var2) {
            this.field3016 = null;
            return null;
        } else {
            this.field3016 = var2.field4470;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ltj;Z)V")
    public final void method1385(class280 arg0, boolean arg1) {
        if (arg0.field4463 != null) {
            arg0.method1922(-1);
        }
        field3011++;
        arg0.field4463 = this.field3013.field4463;
        arg0.field4470 = this.field3013;
        if (arg1) {
            arg0.field4463.field4470 = arg0;
            arg0.field4470.field4463 = arg0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Ltj;")
    public final class280 method1386(byte arg0) {
        field3015++;
        class280 var2 = this.field3016;
        int var3 = -88 % ((arg0 - 30) / 46);
        if (this.field3013 == var2) {
            this.field3016 = null;
            return null;
        } else {
            this.field3016 = var2.field4463;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)Lnh;")
    public static final class55 method1387(byte arg0, int arg1) {
        field3012++;
        class55 var2 = (class55) class91.field1355.method1553((long) arg1, (byte) -106);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 8) {
            return null;
        } else {
            byte[] var3 = class230.field3715.method643(class99.method759(arg1, 255), class32.method240(arg1, true), false);
            class55 var4 = new class55();
            var4.field793 = arg1;
            if (var3 != null) {
                var4.method409((byte) 28, new class152(var3));
            }
            class91.field1355.method1551(var4, 0, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Ltj;")
    public final class280 method1388(byte arg0) {
        class280 var2 = this.field3016;
        field3018++;
        if (arg0 <= 64) {
            this.method1390((byte) -87);
        }
        if (this.field3013 == var2) {
            this.field3016 = null;
            return null;
        } else {
            this.field3016 = var2.field4470;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Ltj;")
    public final class280 method1389(byte arg0) {
        field3008++;
        class280 var2 = this.field3013.field4470;
        if (this.field3013 == var2) {
            return null;
        } else {
            var2.method1922(arg0 - 48);
            return arg0 == 47 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Ltj;")
    public final class280 method1390(byte arg0) {
        class280 var2 = this.field3013.field4463;
        field3021++;
        if (this.field3013 == var2) {
            this.field3016 = null;
            return null;
        }
        this.field3016 = var2.field4463;
        if (arg0 != -118) {
            field3007 = -65;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILtj;)V")
    public final void method1391(int arg0, class280 arg1) {
        field3014++;
        if (arg0 != 2) {
            this.field3016 = null;
        }
        if (arg1.field4463 != null) {
            arg1.method1922(-1);
        }
        arg1.field4470 = this.field3013.field4470;
        arg1.field4463 = this.field3013;
        arg1.field4463.field4470 = arg1;
        arg1.field4470.field4463 = arg1;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Lmj;")
    public static final class115 method1392(int arg0) {
        field3019++;
        class4 var1 = new class4(class262.field4258, class62.field912, class217.field3457[0], class272.field4377[0], class19.field214[0], class201.field3220[0], class152.field2505[0], class101.field1476);
        if (arg0 >= -7) {
            field3007 = -61;
        }
        class188.method1398((byte) 91);
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class187() {
        this.field3013.field4470 = this.field3013;
        this.field3013.field4463 = this.field3013;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public static void method1393(int arg0) {
        field3010 = null;
        if (arg0 < 65) {
            field3020 = -115;
        }
    }
}
