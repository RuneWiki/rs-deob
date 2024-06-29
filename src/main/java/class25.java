import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class123 {

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "[Ljc;")
    public class65[] field599;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "Lvc;")
    public static class137 field592 = class45.method325("Bitte laden Sie die Seite neu)3", -46);

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "[Z")
    public static boolean[] field596 = new boolean[5];

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Lvc;")
    private static class137 field600 = class45.method325("Too many connections from your address)3", -46);

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Z")
    public static boolean field603 = false;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lvc;")
    public static class137 field601 = class45.method325("Zu viele Verbindungen von Ihrer Adresse)3", -46);

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lvc;")
    public static class137 field604 = field600;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Lnb;")
    public static class88 field597;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method211(int arg0) {
        field600 = null;
        field592 = null;
        field597 = null;
        field604 = null;
        field601 = null;
        if (arg0 != 0) {
            method214(null, null, 71);
        }
        field596 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Z")
    public final boolean method212(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method212(-16, 108);
        }
        field598++;
        return this.field599[arg1].field1360;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZLqe;)Lvc;")
    public static final class137 method213(int arg0, boolean arg1, class109 arg2) {
        field602++;
        try {
            class137 var3 = new class137();
            if (!arg1) {
                method213(-57, true, null);
            }
            var3.field3182 = arg2.method827(107);
            if (arg0 < var3.field3182) {
                var3.field3182 = arg0;
            }
            var3.field3176 = new byte[var3.field3182];
            arg2.field2583 += class42.field921.method265(0, var3.field3176, arg2.field2547, var3.field3182, 0, arg2.field2583);
            return var3;
        } catch (Exception var4) {
            return class86.field2052;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lnb;Lnb;IZ)V")
    public class25(class88 arg0, class88 arg1, int arg2, boolean arg3) {
        class100 var5 = new class100();
        int var6 = arg0.method651(arg2, true);
        this.field599 = new class65[var6];
        int[] var7 = arg0.method659(arg2, -3);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method668(arg2, -214, var7[var8]);
            class83 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class83 var12 = (class83) var5.method726(0); var12 != null; var12 = (class83) var5.method731((byte) -117)) {
                if (var12.field1864 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method644(0, 0, var11);
                } else {
                    var13 = arg1.method644(0, var11, 0);
                }
                var10 = new class83(var11, var13);
                var5.method730(467, var10);
            }
            this.field599[var7[var8]] = new class65(var9, var10);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lme;Lvc;I)Lvc;")
    public static final class137 method214(class85 arg0, class137 arg1, int arg2) {
        field594++;
        if (~arg1.method1003(class114.field2713, (byte) -106) == arg2) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method1003(class98.field2294, (byte) -61);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method1003(class107.field2489, (byte) -81);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method1003(class91.field2158, (byte) -75);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method1003(class33.field716, (byte) -124);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method1003(class120.field2803, (byte) -123);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method1003(client.field499, (byte) -121);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class137 var9 = class45.field999;
                                                    if (class37.field805 != null) {
                                                        var9 = class45.method324(class37.field805.field3133, arg2 + 255);
                                                        try {
                                                            if (class37.field805.field3129 != null) {
                                                                byte[] var10 = ((String) class37.field805.field3129).getBytes("ISO-8859-1");
                                                                var9 = class64.method465(-1, 0, var10, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg1 = class88.method666(-3, new class137[] { arg1.method1013(var8, 0, (byte) 41), var9, arg1.method1035(arg2 ^ 0x1, var8 + 4) });
                                                }
                                            }
                                            arg1 = class88.method666(arg2 + 119, new class137[] { arg1.method1013(var7, 0, (byte) 97), class38.method274(class134.method993(4, arg2 ^ 0xFFFFFFF4, arg0), 0), arg1.method1035(1, var7 + 2) });
                                        }
                                    }
                                    arg1 = class88.method666(arg2 ^ 0xFFFFFFBA, new class137[] { arg1.method1013(var6, 0, (byte) 56), class38.method274(class134.method993(3, arg2 ^ 0xFFFFFFF4, arg0), 0), arg1.method1035(arg2 ^ 0x1, var6 + 2) });
                                }
                            }
                            arg1 = class88.method666(0, new class137[] { arg1.method1013(var5, 0, (byte) 33), class38.method274(class134.method993(2, arg2 - 12, arg0), 0), arg1.method1035(1, var5 + 2) });
                        }
                    }
                    arg1 = class88.method666(-18, new class137[] { arg1.method1013(var4, 0, (byte) 71), class38.method274(class134.method993(1, -12, arg0), 0), arg1.method1035(1, var4 + 2) });
                }
            }
            arg1 = class88.method666(arg2 ^ 0xFFFFFFE9, new class137[] { arg1.method1013(var3, 0, (byte) 108), class38.method274(class134.method993(0, -12, arg0), 0), arg1.method1035(arg2 ^ 0x1, var3 + 2) });
        }
    }
}
