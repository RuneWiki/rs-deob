import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class184 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[Lfd;")
    public static class52[] field3516 = new class52[256];

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Leh;")
    private static class47 field3518 = class195.method1282((byte) -4, "Ok");

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Leh;")
    public static class47 field3526 = field3518;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Leh;")
    private static class47 field3524 = class195.method1282((byte) -4, "wave:");

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3522 = 1;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Leh;")
    public static class47 field3528 = class195.method1282((byte) -4, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[[I")
    public static int[][] field3525 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Leh;")
    public static class47 field3521 = field3524;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Leh;")
    public static class47 field3527 = field3524;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3520 = Calendar.getInstance();

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lgf;")
    public static class61 field3523;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILgf;Leh;)Leh;")
    public static final class47 method1223(int arg0, class61 arg1, class47 arg2) {
        if (arg0 != -19829) {
            return null;
        }
        field3519++;
        if (arg2.method378(4, class26.field514) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method378(4, class143.field2819);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method378(4, class163.field3176);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method378(4, class204.field4012);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method378(arg0 ^ 0xFFFFB28F, class32.field607);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method378(4, class132.field2601);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method378(4, class19.field372);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class47 var9 = class181.field3472;
                                                    if (class138.field2697 != null) {
                                                        var9 = class206.method1354(class138.field2697.field2546, 0);
                                                        try {
                                                            if (class138.field2697.field2548 != null) {
                                                                byte[] var10 = ((String) class138.field2697.field2548).getBytes("ISO-8859-1");
                                                                var9 = class39.method332(var10, -25444, var10.length, 0);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class5.method24(new class47[] { arg2.method401(var8, 0, -49), var9, arg2.method380((byte) 26, var8 + 4) }, (byte) 122);
                                                }
                                            }
                                            arg2 = class5.method24(new class47[] { arg2.method401(var7, 0, -49), class179.method1194(92, class77.method670(4, arg1, true)), arg2.method380((byte) 26, var7 + 2) }, (byte) 78);
                                        }
                                    }
                                    arg2 = class5.method24(new class47[] { arg2.method401(var6, 0, -49), class179.method1194(116, class77.method670(3, arg1, true)), arg2.method380((byte) 26, var6 + 2) }, (byte) 120);
                                }
                            }
                            arg2 = class5.method24(new class47[] { arg2.method401(var5, 0, -49), class179.method1194(arg0 ^ 0xFFFFB2F0, class77.method670(2, arg1, true)), arg2.method380((byte) 26, var5 + 2) }, (byte) 85);
                        }
                    }
                    arg2 = class5.method24(new class47[] { arg2.method401(var4, 0, -49), class179.method1194(arg0 ^ 0xFFFFB2F6, class77.method670(1, arg1, true)), arg2.method380((byte) 26, var4 + 2) }, (byte) 118);
                }
            }
            arg2 = class5.method24(new class47[] { arg2.method401(var3, 0, arg0 ^ 0x4D44), class179.method1194(arg0 ^ 0xFFFFB2D5, class77.method670(0, arg1, true)), arg2.method380((byte) 26, var3 + 2) }, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B)Ljh;")
    public static final class89 method1224(int arg0, byte[] arg1) {
        field3517++;
        if (arg0 > -69) {
            method1223(68, null, null);
        }
        if (arg1 == null) {
            return null;
        } else {
            class89 var2 = new class89(arg1, class69.field1516, class198.field3850, class96.field1979, class109.field2270, class64.field1390, class69.field1511);
            class95.method755(-77);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1225(int arg0) {
        field3516 = null;
        field3526 = null;
        field3523 = null;
        field3520 = null;
        field3528 = null;
        if (arg0 != -1) {
            method1223(68, null, null);
        }
        field3525 = null;
        field3524 = null;
        field3527 = null;
        field3518 = null;
        field3521 = null;
    }
}
