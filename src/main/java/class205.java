import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class205 {

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Z")
    public boolean field2930 = false;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public int field2937 = 64;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public int field2939 = -1;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field2940 = 2;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "Z")
    public boolean field2934 = false;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public int field2932 = 64;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public int field2943 = 1;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field2931 = 0;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2942 = null;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lud;II)V", line = 6)
    public final void method1427(class35 arg0, int arg1, int arg2) {
        int var4 = -125 / ((arg1 + 7) / 36);
        while (true) {
            int var5 = arg0.method273(255);
            if (var5 == 0) {
                field2941++;
                return;
            }
            this.method1428(arg2, arg0, 7, var5);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILud;II)V", line = 26)
    private final void method1428(int arg0, class35 arg1, int arg2, int arg3) {
        field2936++;
        if (arg3 == 1) {
            this.field2939 = arg1.method253(-13900);
            if (this.field2939 == 65535) {
                this.field2939 = -1;
            }
        } else if (arg3 == 2) {
            this.field2937 = arg1.method253(arg2 ^ 0xFFFFC9B3) + 1;
            this.field2932 = arg1.method253(-13900) + 1;
        } else if (arg3 == 3) {
            arg1.method277((byte) 108);
        } else if (arg3 == 4) {
            this.field2940 = arg1.method273(arg2 ^ 0xF8);
        } else if (arg3 == 5) {
            this.field2943 = arg1.method273(255);
        } else if (arg3 == 6) {
            this.field2930 = true;
        } else if (arg3 == 7) {
            this.field2934 = true;
        }
        if (arg2 != 7) {
            field2942 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1429(int arg0, int arg1, int arg2) {
        field2933++;
        class354 var3 = class501.method3012(arg1, 17, 2145997216);
        if (arg2 != -29861) {
            field2931 = -58;
        }
        var3.method2222(-121);
        var3.field4990 = arg0;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 115)
    public static final void method1430(int arg0) {
        class532.field7530.method552(((float) class471.field6781.field6686.method3630(27669) * 0.1F + 0.7F) * 1.1523438F);
        field2938++;
        class532.field7530.method522(class70.field1248, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class532.field7530.method636(class509.field7255, -1, 0);
        int var1 = -67 % ((arg0 + 13) / 51);
        class532.field7530.method587(class618.field8927);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V", line = 131)
    public static void method1431(int arg0) {
        if (arg0 == 9800) {
            field2942 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lpc;", line = 144)
    public static final class667 method1432(int arg0, int arg1) {
        if (arg0 > -23) {
            return null;
        }
        field2935++;
        if (arg1 == 0) {
            return new class265();
        } else if (arg1 == 1) {
            return new class78();
        } else if (arg1 == 2) {
            return new class495();
        } else if (arg1 == 3) {
            return new class592();
        } else if (arg1 == 4) {
            return new class193();
        } else if (arg1 == 5) {
            return new class165();
        } else if (arg1 == 6) {
            return new class425();
        } else if (arg1 == 7) {
            return new class475();
        } else if (arg1 == 8) {
            return new class736();
        } else if (arg1 == 9) {
            return new class273();
        } else if (arg1 == 10) {
            return new class334();
        } else if (arg1 == 11) {
            return new class731();
        } else if (arg1 == 12) {
            return new class395();
        } else if (arg1 == 13) {
            return new class92();
        } else if (arg1 == 14) {
            return new class393();
        } else if (arg1 == 15) {
            return new class140();
        } else if (arg1 == 16) {
            return new class329();
        } else if (arg1 == 17) {
            return new class612();
        } else if (arg1 == 18) {
            return new class252();
        } else if (arg1 == 19) {
            return new class431();
        } else if (arg1 == 20) {
            return new class215();
        } else if (arg1 == 21) {
            return new class128();
        } else if (arg1 == 22) {
            return new class190();
        } else if (arg1 == 23) {
            return new class449();
        } else if (arg1 == 24) {
            return new class697();
        } else if (arg1 == 25) {
            return new class437();
        } else if (arg1 == 26) {
            return new class739();
        } else if (arg1 == 27) {
            return new class735();
        } else if (arg1 == 28) {
            return new class714();
        } else if (arg1 == 29) {
            return new class522();
        } else if (arg1 == 30) {
            return new class359();
        } else if (arg1 == 31) {
            return new class611();
        } else if (arg1 == 32) {
            return new class19();
        } else if (arg1 == 33) {
            return new class576();
        } else if (arg1 == 34) {
            return new class313();
        } else if (arg1 == 35) {
            return new class352();
        } else if (arg1 == 36) {
            return new class711();
        } else if (arg1 == 37) {
            return new class470();
        } else if (arg1 == 38) {
            return new class407();
        } else if (arg1 == 39) {
            return new class708();
        } else {
            return null;
        }
    }
}
