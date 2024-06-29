import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class354 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Z")
    public boolean field5589 = true;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public int field5597 = -1;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public int field5595 = 16;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field5593 = -1;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
    public boolean field5600 = false;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
    public boolean field5599 = true;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field5588 = 0;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field5592 = 1190717;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public int field5603 = 8;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public int field5604 = 128;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field5596 = 0;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Z")
    public static boolean field5598 = false;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lul;")
    public static class51 field5601 = new class51(64);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lcg;ZLcg;)I", line = 9)
    public static final int method2461(class49 arg0, boolean arg1, class49 arg2) {
        field5591++;
        int var3 = 0;
        if (arg2.method432(class91.field1442, arg1)) {
            var3++;
        }
        if (arg2.method432(class159.field2815, arg1)) {
            var3++;
        }
        if (arg2.method432(class303.field4802, arg1)) {
            var3++;
        }
        if (arg0.method432(class91.field1442, false)) {
            var3++;
        }
        if (arg0.method432(class159.field2815, false)) {
            var3++;
        }
        if (arg0.method432(class303.field4802, arg1)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILpi;)V", line = 50)
    private final void method2462(int arg0, int arg1, int arg2, class336 arg3) {
        if (arg0 == 1) {
            this.field5588 = class278.method1906(arg3.method2317(21803), true);
        } else if (arg0 == 2) {
            this.field5593 = arg3.method2364(arg1 + 23475);
        } else if (arg0 == 3) {
            this.field5593 = arg3.method2339((byte) -46);
            if (this.field5593 == 65535) {
                this.field5593 = -1;
            }
        } else if (arg0 == 5) {
            this.field5599 = false;
        } else if (arg0 == 7) {
            this.field5597 = class278.method1906(arg3.method2317(21803), true);
        } else if (arg0 == 8) {
            class287.field4567 = arg2;
        } else if (arg0 == 9) {
            this.field5604 = arg3.method2339((byte) -46);
        } else if (arg0 == 10) {
            this.field5589 = false;
        } else if (arg0 == 11) {
            this.field5603 = arg3.method2364(-9069);
        } else if (arg0 == 12) {
            this.field5600 = true;
        } else if (arg0 == 13) {
            this.field5592 = arg3.method2317(arg1 + 54347);
        } else if (arg0 == 14) {
            this.field5595 = arg3.method2364(-9069);
        }
        field5594++;
        if (arg1 != -32544) {
            method2463(-21, (class128) null, (class128) null);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILnh;Lnh;)V", line = 115)
    public static final void method2463(int arg0, class128 arg1, class128 arg2) {
        if (arg1.field2213 != null) {
            arg1.method1067(40000);
        }
        arg1.field2213 = arg2;
        arg1.field2215 = arg2.field2215;
        arg1.field2213.field2215 = arg1;
        arg1.field2215.field2213 = arg1;
        if (arg0 <= 79) {
            method2464(-11);
        }
        field5590++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 137)
    public static final void method2464(int arg0) {
        field5587++;
        if (arg0 != 16) {
            field5586 = -2;
        }
        class113.field1889 = null;
        class148.field2657 = null;
        class219.field3657 = null;
        class329.field5236 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 158)
    public static void method2465(int arg0) {
        field5601 = null;
        if (arg0 != -1) {
            method2466(-7, -103);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z", line = 168)
    public static final boolean method2466(int arg0, int arg1) {
        field5585++;
        if (arg1 == -28209) {
            return arg0 >= 0 && class124.field2140.length > arg0 ? class124.field2140[arg0] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lpi;II)V", line = 186)
    public final void method2467(class336 arg0, int arg1, int arg2) {
        if (arg1 != 22200) {
            this.field5588 = 9;
        }
        while (true) {
            int var4 = arg0.method2364(-9069);
            if (var4 == 0) {
                field5602++;
                return;
            }
            this.method2462(var4, arg1 ^ 0xFFFFD658, arg2, arg0);
        }
    }
}
