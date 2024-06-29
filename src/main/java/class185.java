import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class185 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lok;")
    private static class41 field3016 = class137.method956("Sun", 45);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lok;")
    private static class41 field3012 = class137.method956("Fri", 45);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lok;")
    public static class41 field3021 = class137.method956(")3", 45);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lok;")
    private static class41 field3017 = class137.method956("Thu", 45);

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lok;")
    private static class41 field3013 = class137.method956("Tue", 45);

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Lok;")
    private static class41 field3018 = class137.method956("Wed", 45);

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static volatile int field3022 = -1;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lok;")
    private static class41 field3019 = class137.method956("Sat", 45);

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lok;")
    private static class41 field3024 = class137.method956("Mon", 45);

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[Lok;")
    public static class41[] field3020 = new class41[] { field3016, field3024, field3013, field3018, field3017, field3012, field3019 };

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lda;")
    public static class212 field3014 = new class212();

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lol;")
    public static class118 field3025 = new class118(5000);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[[B")
    public static byte[][] field3027;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)V", line = 6)
    public static final void method1339(boolean arg0, int arg1, int arg2) {
        class46 var3 = class195.method1396(7, arg2, arg0);
        field3023++;
        if (arg0) {
            field3027 = (byte[][]) ((byte[][]) null);
        }
        var3.method337(0);
        var3.field721 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1340(int arg0) {
        field3015++;
        class284 var1 = new class284();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class129.field1932[var2][var3] = var1;
            }
        }
        int var4 = 86 % ((32 - arg0) / 54);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1341(boolean arg0) {
        field3019 = null;
        field3025 = null;
        field3013 = null;
        field3016 = null;
        field3021 = null;
        field3020 = null;
        if (arg0) {
            return;
        }
        field3018 = null;
        field3027 = (byte[][]) null;
        field3014 = null;
        field3012 = null;
        field3024 = null;
        field3017 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lok;Lbc;B)Lok;", line = 92)
    public static final class41 method1342(class41 arg0, class302 arg1, byte arg2) {
        if (arg0.method305(-90, class15.field191) != -1) {
            label68: while (true) {
                int var3 = arg0.method305(arg2 - 119, class94.field1386);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method305(-102, class73.field1078);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method305(-95, class294.field4752);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method305(-73, class74.field1093);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method305(-111, class57.field820);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method305(-80, class122.field1814);
                                                        if (var8 == -1) {
                                                            break label68;
                                                        }
                                                        class41 var9 = class266.field4233;
                                                        if (class138.field2075 != null) {
                                                            var9 = class311.method2153(class138.field2075.field2946, arg2 - 62);
                                                            try {
                                                                if (class138.field2075.field2945 != null) {
                                                                    byte[] var10 = ((String) class138.field2075.field2945).getBytes("ISO-8859-1");
                                                                    var9 = class213.method1507(var10.length, 0, false, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg0 = class187.method1346(new class41[] { arg0.method308(var8, 0, 97), var9, arg0.method279(var8 + 4, (byte) -43) }, 0);
                                                    }
                                                }
                                                arg0 = class187.method1346(new class41[] { arg0.method308(var7, 0, -33), class38.method261(class152.method1080(4, -15400, arg1), -1000000000), arg0.method279(var7 + 2, (byte) -27) }, arg2 - 14);
                                            }
                                        }
                                        arg0 = class187.method1346(new class41[] { arg0.method308(var6, 0, arg2 ^ 0x79), class38.method261(class152.method1080(3, -15400, arg1), arg2 ^ 0xC465360E), arg0.method279(var6 + 2, (byte) -55) }, 0);
                                    }
                                }
                                arg0 = class187.method1346(new class41[] { arg0.method308(var5, 0, 105), class38.method261(class152.method1080(2, -15400, arg1), -1000000000), arg0.method279(var5 + 2, (byte) -93) }, 0);
                            }
                        }
                        arg0 = class187.method1346(new class41[] { arg0.method308(var4, 0, -117), class38.method261(class152.method1080(1, -15400, arg1), -1000000000), arg0.method279(var4 + 2, (byte) -18) }, 0);
                    }
                }
                arg0 = class187.method1346(new class41[] { arg0.method308(var3, 0, 121), class38.method261(class152.method1080(0, -15400, arg1), -1000000000), arg0.method279(var3 + 2, (byte) -80) }, 0);
            }
        }
        if (arg2 != 14) {
            method1341(true);
        }
        field3011++;
        return arg0;
    }
}
