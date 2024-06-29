import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class59 extends class61 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Llc;")
    public static class143 field1131 = class66.method374("hint_mapmarkers", -1);

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Llc;")
    public static class143 field1134 = class66.method374("::fpsoff", -1);

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lli;")
    public static class191 field1139 = new class191();

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1140 = 0;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "[J")
    public static long[] field1141 = new long[256];

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
    public static int[] field1142;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method341(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field1131 = null;
        field1142 = null;
        field1134 = null;
        field1139 = null;
        field1141 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
    public static final int method342(byte arg0) {
        if (arg0 == 93) {
            field1130++;
            return 16;
        } else {
            return 91;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lvh;Llc;Z)Llc;")
    public static final class143 method343(class43 arg0, class143 arg1, boolean arg2) {
        field1137++;
        if (arg1.method891(-31978, class80.field1459) != -1) {
            label77: while (true) {
                int var3 = arg1.method891(-31978, class240.field4329);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method891(-31978, class18.field318);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method891(-31978, class157.field2808);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method891(-31978, class65.field1217);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method891(-31978, class22.field353);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method891(-31978, class144.field2590);
                                                        if (var8 == -1) {
                                                            break label77;
                                                        }
                                                        class143 var9 = class21.field342;
                                                        if (class249.field4490 != null) {
                                                            var9 = class49.method298(class249.field4490.field3243, -32621);
                                                            try {
                                                                if (class249.field4490.field3239 != null) {
                                                                    byte[] var10 = ((String) class249.field4490.field3239).getBytes("ISO-8859-1");
                                                                    var9 = class224.method1539(0, var10.length, 42, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class25.method179(0, new class143[] { arg1.method896(var8, 0, !arg2), var9, arg1.method863(var8 + 4, -161) });
                                                    }
                                                }
                                                arg1 = class25.method179(0, new class143[] { arg1.method896(var7, 0, false), class224.method1538(class123.method745(false, arg0, 4), -127), arg1.method863(var7 + 2, -161) });
                                            }
                                        }
                                        arg1 = class25.method179(0, new class143[] { arg1.method896(var6, 0, !arg2), class224.method1538(class123.method745(false, arg0, 3), 81), arg1.method863(var6 + 2, -161) });
                                    }
                                }
                                arg1 = class25.method179(0, new class143[] { arg1.method896(var5, 0, !arg2), class224.method1538(class123.method745(false, arg0, 2), 118), arg1.method863(var5 + 2, -161) });
                            }
                        }
                        arg1 = class25.method179(0, new class143[] { arg1.method896(var4, 0, false), class224.method1538(class123.method745(false, arg0, 1), -123), arg1.method863(var4 + 2, -161) });
                    }
                }
                arg1 = class25.method179(0, new class143[] { arg1.method896(var3, 0, false), class224.method1538(class123.method745(false, arg0, 0), 50), arg1.method863(var3 + 2, -161) });
            }
        }
        if (!arg2) {
            field1131 = null;
        }
        return arg1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1141[var0] = var1;
        }
        field1142 = new int[] { 12543016, 15504954, 15914854, 16773818 };
    }
}
