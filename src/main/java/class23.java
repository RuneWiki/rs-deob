import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class70 {

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public int field437 = 0;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public int field453 = -1;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "Lqf;")
    private static class117 field448 = class72.method514(126, "Friends");

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lqf;")
    private static class117 field442 = class72.method514(112, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Lqf;")
    public static class117 field441 = class72.method514(123, ":  ");

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lqf;")
    public static class117 field443 = field442;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "Lqf;")
    private static class117 field447 = class72.method514(125, "Connecting to update server");

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Lqf;")
    public static class117 field452 = field448;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "Lqf;")
    public static class117 field458 = class72.method514(117, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "Lqf;")
    public static class117 field455 = class72.method514(113, "Name eingeben:");

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "[I")
    public static int[] field457 = new int[128];

    @OriginalMember(owner = "client!da", name = "U", descriptor = "Lqf;")
    public static class117 field449 = field447;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "[I")
    public static int[] field461 = new int[2000];

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "[I")
    public static int[] field459;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)Lve;")
    public static final class148 method181(byte arg0, int arg1) {
        field444++;
        class148 var2 = (class148) class94.field2277.method247(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 > -47) {
            return null;
        } else {
            byte[] var3 = class138.field3281.method458(false, arg1, 6);
            class148 var4 = new class148();
            var4.field3607 = arg1;
            if (var3 != null) {
                var4.method1182(new class77(var3), 115);
            }
            var4.method1192(60);
            if (var4.field3648) {
                var4.field3643 = 0;
                var4.field3668 = false;
            }
            class94.field2277.method248((long) arg1, (byte) -105, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILqf;Lmf;)Lqf;")
    public static final class117 method182(int arg0, class117 arg1, class89 arg2) {
        if (arg0 != 12074) {
            return null;
        }
        if (arg1.method926((byte) -93, class44.field874) != -1) {
            label62: while (true) {
                int var3 = arg1.method926((byte) -126, class132.field3130);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method926((byte) -85, class18.field275);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method926((byte) -81, class95.field2290);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method926((byte) -110, class152.field3739);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method926((byte) -100, class20.field331);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method926((byte) -71, class77.field1724);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class117 var9 = class141.field3351;
                                                        if (class78.field1768 != null) {
                                                            var9 = class76.method549(255, class78.field1768.field105);
                                                            try {
                                                                if (class78.field1768.field106 != null) {
                                                                    byte[] var10 = ((String) class78.field1768.field106).getBytes("ISO-8859-1");
                                                                    var9 = class24.method186(0, arg0 ^ 0x2F6A, var10, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class73.method530((byte) -83, new class117[] { arg1.method943(0, (byte) 119, var8), var9, arg1.method908(var8 + 4, (byte) 120) });
                                                    }
                                                }
                                                arg1 = class73.method530((byte) -83, new class117[] { arg1.method943(0, (byte) 119, var7), class130.method1014(-46, class143.method1160(0, 4, arg2)), arg1.method908(var7 + 2, (byte) 120) });
                                            }
                                        }
                                        arg1 = class73.method530((byte) -83, new class117[] { arg1.method943(0, (byte) 125, var6), class130.method1014(-113, class143.method1160(0, 3, arg2)), arg1.method908(var6 + 2, (byte) 120) });
                                    }
                                }
                                arg1 = class73.method530((byte) -83, new class117[] { arg1.method943(0, (byte) 121, var5), class130.method1014(arg0 ^ 0xFFFFD0AC, class143.method1160(arg0 ^ 0x2F2A, 2, arg2)), arg1.method908(var5 + 2, (byte) 120) });
                            }
                        }
                        arg1 = class73.method530((byte) -83, new class117[] { arg1.method943(0, (byte) 121, var4), class130.method1014(arg0 ^ 0xFFFFD0CE, class143.method1160(arg0 ^ 0x2F2A, 1, arg2)), arg1.method908(var4 + 2, (byte) 120) });
                    }
                }
                arg1 = class73.method530((byte) -83, new class117[] { arg1.method943(0, (byte) 123, var3), class130.method1014(-93, class143.method1160(0, 0, arg2)), arg1.method908(var3 + 2, (byte) 120) });
            }
        }
        field436++;
        return arg1;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public static void method183(int arg0) {
        field461 = null;
        field449 = null;
        if (arg0 != -7) {
            return;
        }
        field458 = null;
        field442 = null;
        field448 = null;
        field452 = null;
        field459 = null;
        field447 = null;
        field457 = null;
        field443 = null;
        field455 = null;
        field441 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BB)V")
    public static final void method184(byte[] arg0, byte arg1) {
        field435++;
        class77 var2 = new class77(arg0);
        var2.field1691 = arg0.length - 2;
        class140.field3340 = var2.method597(107);
        class41.field806 = new int[class140.field3340];
        class42.field840 = new int[class140.field3340];
        class116.field2758 = new int[class140.field3340];
        class3.field58 = new byte[class140.field3340][];
        class21.field354 = new int[class140.field3340];
        var2.field1691 = arg0.length - class140.field3340 * 8 - 7;
        class132.field3122 = var2.method597(100);
        class99.field2384 = var2.method597(42);
        int var3 = (var2.method570((byte) 123) & 0xFF) + 1;
        for (int var4 = 0; var4 < class140.field3340; var4++) {
            class116.field2758[var4] = var2.method597(122);
        }
        if (arg1 >= -59) {
            return;
        }
        for (int var5 = 0; var5 < class140.field3340; var5++) {
            class41.field806[var5] = var2.method597(114);
        }
        for (int var6 = 0; var6 < class140.field3340; var6++) {
            class21.field354[var6] = var2.method597(111);
        }
        for (int var7 = 0; var7 < class140.field3340; var7++) {
            class42.field840[var7] = var2.method597(65);
        }
        var2.field1691 = arg0.length - class140.field3340 * 8 - (var3 + -1) * 3 - 7;
        class144.field3536 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class144.field3536[var8] = var2.method557((byte) -114);
            if (class144.field3536[var8] == 0) {
                class144.field3536[var8] = 1;
            }
        }
        var2.field1691 = 0;
        for (int var9 = 0; var9 < class140.field3340; var9++) {
            int var10 = class21.field354[var9];
            int var11 = class42.field840[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class3.field58[var9] = var13;
            int var14 = var2.method570((byte) 123);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method592((byte) -113);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method592((byte) -111);
                    }
                }
            }
        }
    }
}
