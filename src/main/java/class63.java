import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class63 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1098 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Lfk;")
    public static class144 field1112;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[B")
    public byte[] field1102;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[B")
    public byte[] field1109;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Loh;I)V", line = 7)
    public static final void method485(class258 arg0, int arg1) {
        if (arg1 != 3570) {
            return;
        }
        int var2 = class78.method559(-122, arg0);
        field1104++;
        if (var2 == -1) {
            return;
        }
        class218.field3782 = class65.field1144.field3853[var2] - class49.field735;
        int var3 = class218.field3782 - ((int) ((float) class280.field4814.field3002 / class121.field2139));
        class299.field5122 = class225.field3870 + class317.field5348 - class65.field1144.field3854[var2] - 1;
        int var4 = class299.field5122 - ((int) ((float) class280.field4814.field3054 / class121.field2139));
        int var5 = (int) ((float) class280.field4814.field3002 / class121.field2139) + class218.field3782;
        int var6 = (int) ((float) class280.field4814.field3054 / class121.field2139) + class299.field5122;
        if (var3 < 0) {
            class218.field3782 = (int) ((float) class280.field4814.field3002 / class121.field2139);
        }
        if (var5 > class57.field907) {
            class218.field3782 = class57.field907 - ((int) ((float) class280.field4814.field3002 / class121.field2139));
        }
        if (var4 < 0) {
            class299.field5122 = (int) ((float) class280.field4814.field3054 / class121.field2139);
        }
        if (var6 > class225.field3870) {
            class299.field5122 = class225.field3870 - ((int) ((float) class280.field4814.field3054 / class121.field2139));
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 51)
    public static final void method486(int arg0, int arg1) {
        if (arg0 != 2) {
            method489((class171) null, (class258) null, (byte) -121);
        }
        class265.field4614 = 1000 / arg1;
        field1107++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V", line = 63)
    public static final void method487(int arg0, int arg1) {
        if (arg0 == 3) {
            field1106++;
            class233.field4036.method1156(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)Loh;", line = 105)
    public static final class258 method488(boolean arg0, int arg1) {
        if (!arg0) {
            method486(0, -80);
        }
        field1100++;
        return class225.field3849[arg1].method1816(false) <= 0 ? class242.field4205[arg1] : class100.method755(-6, new class258[] { class242.field4205[arg1], class85.field1430, class225.field3849[arg1] });
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ls;Loh;B)Loh;", line = 127)
    public static final class258 method489(class171 arg0, class258 arg1, byte arg2) {
        field1108++;
        if (arg2 > -89) {
            field1099 = -19;
        }
        if (arg1.method1808(class14.field187, 0) == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method1808(class268.field4666, 0);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method1808(class215.field3725, 0);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method1808(class218.field3752, 0);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method1808(class225.field3861, 0);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method1808(class253.field4359, 0);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method1808(class91.field1602, 0);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class258 var9 = class235.field4104;
                                                    if (class165.field2787 != null) {
                                                        var9 = class214.method1456(class165.field2787.field2068, (byte) 77);
                                                        try {
                                                            if (class165.field2787.field2063 != null) {
                                                                byte[] var10 = ((String) class165.field2787.field2063).getBytes("ISO-8859-1");
                                                                var9 = class285.method2004(var10.length, var10, 0, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg1 = class100.method755(-6, new class258[] { arg1.method1813(var8, 0, true), var9, arg1.method1777((byte) 122, var8 + 4) });
                                                }
                                            }
                                            arg1 = class100.method755(-6, new class258[] { arg1.method1813(var7, 0, true), class232.method1551((byte) 41, class279.method1964(4, arg0, -76)), arg1.method1777((byte) 124, var7 + 2) });
                                        }
                                    }
                                    arg1 = class100.method755(-6, new class258[] { arg1.method1813(var6, 0, true), class232.method1551((byte) 41, class279.method1964(3, arg0, -47)), arg1.method1777((byte) 124, var6 + 2) });
                                }
                            }
                            arg1 = class100.method755(-6, new class258[] { arg1.method1813(var5, 0, true), class232.method1551((byte) 41, class279.method1964(2, arg0, -52)), arg1.method1777((byte) 124, var5 + 2) });
                        }
                    }
                    arg1 = class100.method755(-6, new class258[] { arg1.method1813(var4, 0, true), class232.method1551((byte) 41, class279.method1964(1, arg0, -94)), arg1.method1777((byte) 125, var4 + 2) });
                }
            }
            arg1 = class100.method755(-6, new class258[] { arg1.method1813(var3, 0, true), class232.method1551((byte) 41, class279.method1964(0, arg0, -79)), arg1.method1777((byte) 126, var3 + 2) });
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V", line = 234)
    public static void method490(boolean arg0) {
        if (arg0) {
            method489((class171) null, (class258) null, (byte) -61);
        }
        field1112 = null;
    }
}
