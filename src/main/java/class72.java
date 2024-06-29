import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class72 extends class273 {

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    private int field1084 = 10;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "I")
    private int field1078 = 2048;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "I")
    private int field1090 = 0;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1085 = "green:";

    @OriginalMember(owner = "client!p", name = "V", descriptor = "[[S")
    public static short[][] field1089 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "[I")
    private int[] field1079;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "[I")
    private int[] field1087;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V", line = 4)
    private final void method515(int arg0) {
        this.field1079 = new int[this.field1084 + 1];
        field1080++;
        int var2 = arg0 / this.field1084;
        int var3 = this.field1078 * var2 >> 12;
        int var4 = 0;
        this.field1087 = new int[this.field1084 + 1];
        for (int var5 = 0; var5 < this.field1084; var5++) {
            this.field1087[var5] = var4;
            this.field1079[var5] = var3 + var4;
            var4 += var2;
        }
        this.field1087[this.field1084] = 4096;
        this.field1079[this.field1084] = this.field1079[0] + 4096;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BILgn;)V", line = 33)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field1082++;
        if (arg1 == 0) {
            this.field1084 = arg2.method2043((byte) -123);
        } else if (arg1 == 1) {
            this.field1078 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field1090 = arg2.method2043((byte) -112);
        }
        if (arg0 <= 27) {
            this.field1079 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 77)
    public static final void method516(int arg0) {
        if (arg0 != 192) {
            method517(-40);
        }
        field1088++;
        class132.field2070.method1298((byte) 110);
        class280.field4318.method1298((byte) 110);
        class46.field647.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V", line = 90)
    public static void method517(int arg0) {
        if (arg0 != 5323) {
            field1085 = (String) null;
        }
        field1085 = null;
        field1089 = (short[][]) null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 108)
    public final void method349(int arg0) {
        if (arg0 == 1) {
            field1081++;
            this.method515(4096);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 280)
    public class72() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I", line = 126)
    public final int[] method331(int arg0, int arg1) {
        field1086++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (arg1 != -14650) {
            method516(111);
        }
        if (this.field4204.field792) {
            int var4 = class96.field1473[arg0];
            if (this.field1090 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field1084; var12++) {
                    if (this.field1087[var12] <= var4 && var4 < this.field1087[var12 + 1]) {
                        if (var4 < this.field1079[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class223.method1500(var3, 0, class27.field346, var11);
            } else {
                for (int var5 = 0; var5 < class27.field346; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class151.field2384[var5];
                    int var9 = this.field1090;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var8 + var4 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field1084; var10++) {
                        if (var6 >= this.field1087[var10] && this.field1087[var10 + 1] > var6) {
                            if (this.field1079[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V", line = 244)
    public static final void method518(byte arg0) {
        field1077++;
        if (arg0 > 79) {
            class58.field802.method1296(255);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lwf;ILwf;Lwf;Lwf;)V", line = 257)
    public static final void method519(class306 arg0, int arg1, class306 arg2, class306 arg3, class306 arg4) {
        field1083++;
        class142.field2250 = arg0;
        class116.field1793 = arg3;
        class253.field3937 = arg4;
        class266.field4100 = arg2;
        if (arg1 != 2048) {
            method519((class306) null, -83, (class306) null, (class306) null, (class306) null);
        }
        class219.field3487 = new class207[class116.field1793.method2092(arg1 - 2049)][];
        class228.field3658 = new boolean[class116.field1793.method2092(-1)];
    }
}
