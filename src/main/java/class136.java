import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class136 {

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2119 = -1;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2122 = -1;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lok;")
    public static class41 field2118;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[[B")
    public static byte[][] field2114;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Luf;Luf;I)I")
    public static final int method953(class176 arg0, class176 arg1, int arg2) {
        field2120++;
        if (arg2 != -15272) {
            return -32;
        }
        int var3 = 0;
        if (arg1.method1147(class113.field1784, -128)) {
            var3++;
        }
        if (arg1.method1147(class243.field3764, arg2 ^ 0x3BF7)) {
            var3++;
        }
        if (arg1.method1147(class226.field3546, -128)) {
            var3++;
        }
        if (arg0.method1147(class113.field1784, -112)) {
            var3++;
        }
        if (arg0.method1147(class243.field3764, -125)) {
            var3++;
        }
        if (arg0.method1147(class226.field3546, -72)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLf;)V")
    public static final void method954(byte arg0, class37 arg1) {
        field2121++;
        if (arg0 != 13 || arg1.field583.length - arg1.field588 < 1) {
            return;
        }
        int var2 = arg1.method333((byte) -59);
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
        if (var3 > (arg1.field583.length - arg1.field588)) {
            return;
        }
        class250.field3847 = arg1.method333((byte) -59);
        if (class250.field3847 < 1) {
            class250.field3847 = 1;
        } else if (class250.field3847 > 4) {
            class250.field3847 = 4;
        }
        class88.method705(arg0 ^ 0x2D, arg1.method333((byte) -59) == 1);
        class51.field813 = arg1.method333((byte) -59) == 1;
        class1.field16 = arg1.method333((byte) -59) == 1;
        class196.field3083 = arg1.method333((byte) -59) == 1;
        class242.field3760 = arg1.method333((byte) -59) == 1;
        class21.field320 = arg1.method333((byte) -59) == 1;
        class155.field2366 = arg1.method333((byte) -59) == 1;
        class272.field4299 = arg1.method333((byte) -59) == 1;
        class270.field4279 = arg1.method333((byte) -59);
        if (class270.field4279 > 2) {
            class270.field4279 = 2;
        }
        if (var2 >= 2) {
            class30.field486 = arg1.method333((byte) -59) == 1;
        } else {
            class30.field486 = arg1.method333((byte) -59) == 1;
            arg1.method333((byte) -59);
        }
        class56.field862 = arg1.method333((byte) -59) == 1;
        class144.field2246 = arg1.method333((byte) -59) == 1;
        class39.field662 = arg1.method333((byte) -59);
        if (class39.field662 > 2) {
            class39.field662 = 2;
        }
        class30.field474 = class39.field662;
        class43.field688 = arg1.method333((byte) -59) == 1;
        class63.field1011 = arg1.method333((byte) -59);
        if (class63.field1011 > 127) {
            class63.field1011 = 127;
        }
        class259.field3985 = arg1.method333((byte) -59);
        class253.field3896 = arg1.method333((byte) -59);
        if (class253.field3896 > 127) {
            class253.field3896 = 127;
        }
        if (var2 >= 1) {
            class5.field96 = arg1.method293(-28);
            class8.field140 = arg1.method293(arg0 - 35);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method333((byte) -59);
        }
        if (var2 >= 4) {
            int var4 = arg1.method333((byte) -59);
            if (class64.field1024 < 96) {
                var4 = 0;
            }
            class240.method1623(var4);
        }
        if (var2 >= 5) {
            class184.field2785 = arg1.method307(-83);
        }
        if (var2 >= 6) {
            class148.field2287 = arg1.method333((byte) -59);
        }
        if (var2 >= 7) {
            class198.field3107 = arg1.method333((byte) -59) == 1;
        }
        if (var2 >= 8) {
            class195.field3070 = arg1.method333((byte) -59) == 1;
        }
        if (var2 >= 9) {
            class144.field2230 = arg1.method333((byte) -59);
        }
        if (var2 >= 10) {
            class66.field1047 = arg1.method333((byte) -59) != 0;
        }
        if (var2 >= 11) {
            class210.field3261 = arg1.method333((byte) -59) != 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method955(int arg0) {
        if (arg0 == 5) {
            field2114 = null;
            field2118 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Luf;II)La;")
    public static final class49 method956(class176 arg0, int arg1, int arg2) {
        if (arg1 < 56) {
            method953((class176) null, (class176) null, -85);
        }
        field2116++;
        return class223.method1489(arg2, arg0, (byte) 122) ? class209.method1399(0) : null;
    }
}
