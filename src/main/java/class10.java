import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class10 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Z")
    public static boolean field115 = false;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Ljf;")
    public static class229 field122 = class212.method1457((byte) 112, "<)4col>");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field113 = 0;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lnf;")
    public static class67 field128 = null;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Ljd;")
    public static class141 field125;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 10)
    public static final void method51(byte arg0) {
        int var1 = 105 / ((-arg0 - 78) / 37);
        field126++;
        if (class235.field4060 < class160.field2716) {
            class235.field4060 = (float) ((double) class235.field4060 / 30.0D + (double) class235.field4060);
            if (class160.field2716 < class235.field4060) {
                class235.field4060 = class160.field2716;
            }
            class22.method211(79);
        } else if (class235.field4060 > class160.field2716) {
            class235.field4060 = (float) ((double) class235.field4060 - (double) class235.field4060 / 30.0D);
            if (class235.field4060 < class160.field2716) {
                class235.field4060 = class160.field2716;
            }
            class22.method211(87);
        }
        if (class132.field2325 == -1 || class189.field3304 == -1) {
            return;
        }
        int var2 = class132.field2325 - class151.field2619;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class151.field2619 += var2;
        int var3 = class189.field3304 - class42.field768;
        if (var3 < 2 || var3 > 2) {
            var3 >>= 0x4;
        }
        if (var2 == 0 && var3 == 0) {
            class189.field3304 = -1;
            class132.field2325 = -1;
        }
        class42.field768 += var3;
        class22.method211(73);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILkh;)V", line = 65)
    private final void method52(int arg0, int arg1, class14 arg2) {
        field121++;
        if (arg1 != 90) {
            this.method52(91, -101, (class14) null);
        }
        if (arg0 == 1) {
            this.field123 = arg2.method116(-1);
            this.field114 = arg2.method93(false);
            this.field127 = arg2.method93(false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLkh;)V", line = 104)
    public final void method53(boolean arg0, class14 arg1) {
        while (true) {
            int var3 = arg1.method93(arg0);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field117++;
                return;
            }
            this.method52(var3, 90, arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 124)
    public static void method54(int arg0) {
        field122 = null;
        int var1 = 89 % ((arg0 + 47) / 48);
        field125 = null;
        field128 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I", line = 141)
    public static final int method55(int arg0, int arg1) {
        field120++;
        int var2 = -3 % ((arg0 - 2) / 42);
        return arg1 == 16711935 ? -1 : class259.method1844(arg1, false);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)Le;", line = 157)
    public static final class161 method56(byte arg0) {
        field116++;
        if (arg0 > -90) {
            method58(-127, -40);
        }
        return class264.field4555;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)Ltb;", line = 180)
    public static final class222 method57(byte arg0) {
        field118++;
        if (class23.field419 >= class41.field737.length) {
            if (arg0 != 59) {
                field119 = 70;
            }
            return null;
        } else {
            return class41.field737[class23.field419++];
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Z", line = 199)
    public static final boolean method58(int arg0, int arg1) {
        field124++;
        if (arg0 != -58) {
            field125 = (class141) null;
        }
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
