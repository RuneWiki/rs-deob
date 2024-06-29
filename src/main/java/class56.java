import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class56 extends class122 {

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public int field1076 = 0;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "Lqd;")
    public static class40 field1075 = class147.method1106("logo", (byte) -49);

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "Lqd;")
    public static class40 field1078 = class147.method1106(":trade:", (byte) -125);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field1082 = 0;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1080 = 99;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILqd;I)V", line = 10)
    public static final void method474(int arg0, class40 arg1, int arg2) {
        if (arg0 != 6) {
            field1082 = 36;
        }
        field1079++;
        class40 var3 = arg1.method367(63).method372((byte) -58);
        boolean var4 = false;
        for (int var5 = 0; var5 < class159.field2663; var5++) {
            class258 var6 = class298.field4979[class212.field3390[var5]];
            if (var6 != null && var6.field4319 != null && var6.field4319.method327(var3, -21581)) {
                var4 = true;
                class170.method1263(class255.field4233.field1489[0], 1, true, 0, var6.field1489[0], var6.field1532[0], 2, false, 0, 0, 1, class255.field4233.field1532[0]);
                if (arg2 == 1) {
                    class19.field295.method1464(230, 0);
                    class19.field295.method202(class212.field3390[var5], 49);
                    class192.field3095++;
                } else if (arg2 == 4) {
                    class19.field295.method1464(25, 0);
                    class19.field295.method191(class212.field3390[var5], -1);
                    class105.field1851++;
                } else if (arg2 == 5) {
                    class244.field4039++;
                    class19.field295.method1464(52, arg0 ^ 0x6);
                    class19.field295.method209(16711680, class212.field3390[var5]);
                } else if (arg2 == 6) {
                    class174.field2827++;
                    class19.field295.method1464(108, arg0 - 6);
                    class19.field295.method202(class212.field3390[var5], arg0 ^ 0x37);
                } else if (arg2 == 7) {
                    class251.field4169++;
                    class19.field295.method1464(185, arg0 - 6);
                    class19.field295.method191(class212.field3390[var5], -1);
                }
                break;
            }
        }
        if (!var4) {
            class303.method2071(class264.field4421, 28, 0, class153.method1192(new class40[] { class54.field1044, var3 }, (byte) 124));
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V", line = 84)
    public static void method475(int arg0) {
        field1078 = null;
        if (arg0 <= 73) {
            method474(-63, (class40) null, -116);
        }
        field1075 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILfm;II)V", line = 95)
    public static final void method476(int arg0, class42 arg1, int arg2, int arg3) {
        field1077++;
        if (arg1.field1519 == arg0 && arg0 != -1) {
            class300 var4 = class20.method128(66, arg0);
            int var5 = var4.field5020;
            if (var5 == 1) {
                arg1.field1529 = arg2;
                arg1.field1525 = 0;
                arg1.field1534 = 0;
                arg1.field1546 = 0;
                class185.method1338(var4, arg1.field1531, -31987, false, arg1.field1497, arg1.field1534);
            }
            if (var5 == 2) {
                arg1.field1525 = 0;
            }
        } else if (arg0 == -1 || arg1.field1519 == -1 || class20.method128(127, arg0).field5029 >= class20.method128(121, arg1.field1519).field5029) {
            arg1.field1546 = 0;
            arg1.field1534 = 0;
            arg1.field1529 = arg2;
            arg1.field1490 = arg1.field1516;
            arg1.field1519 = arg0;
            arg1.field1525 = 0;
            if (arg1.field1519 != -1) {
                class185.method1338(class20.method128(106, arg1.field1519), arg1.field1531, -31987, false, arg1.field1497, arg1.field1534);
            }
        }
        int var6 = -127 / ((-arg3 - 7) / 55);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lsd;II)V", line = 149)
    private final void method477(class26 arg0, int arg1, int arg2) {
        field1084++;
        if (arg1 == 0 && arg2 == 2) {
            this.field1076 = arg0.method197(-1);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(III)J", line = 177)
    public static final long method478(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        return var3 == null || var3.field235 == null ? 0L : var3.field235.field5061;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLsd;)V", line = 196)
    public final void method479(byte arg0, class26 arg1) {
        if (arg0 <= 102) {
            field1081 = 97;
        }
        field1083++;
        while (true) {
            int var3 = arg1.method226(255);
            if (var3 == 0) {
                return;
            }
            this.method477(arg1, 0, var3);
        }
    }
}
