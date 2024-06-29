import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class80 extends class234 {

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Z")
    public static boolean field1335 = false;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[B")
    public static byte[] field1332;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "Lmh;")
    public static class62 field1338;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Z")
    public static boolean field1341;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Lsg;")
    public static class191 field1342;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Z")
    public static boolean field1339;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 4)
    public static final void method616(byte arg0) {
        field1334++;
        if (class301.field5183 != -1) {
            class37.method249(104, class301.field5183);
        }
        for (int var1 = 0; var1 < class221.field3805; var1++) {
            if (class220.field3784[var1]) {
                class159.field2560[var1] = true;
            }
            class57.field839[var1] = class220.field3784[var1];
            class220.field3784[var1] = false;
        }
        class304.field5238 = -1;
        class150.field2368 = class199.field3367;
        class230.field3989 = true;
        class102.field1689 = -1;
        class42.field640 = null;
        if (class301.field5183 != -1) {
            class221.field3805 = 0;
            class140.method1046(-1, class60.field878, class301.field5183, 0, 0, 0, 0, (byte) -113, class306.field5258);
        }
        int var2 = 95 % ((-arg0 - 58) / 59);
        class311.method2110();
        class277.field4757 = 0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 51)
    public static final void method617(int arg0, int arg1) {
        if (arg0 != 23564) {
            field1338 = (class62) null;
        }
        class151 var2 = class165.method1194((byte) 1, 9, arg1);
        field1336++;
        var2.method1081(128);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIILjm;IJZ)Z", line = 62)
    public static final boolean method618(int arg0, int arg1, int arg2, int arg3, int arg4, class123 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class134.method1011(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)V", line = 111)
    public static void method619(byte arg0) {
        field1338 = null;
        field1332 = null;
        field1342 = null;
        if (arg0 >= -10) {
            method619((byte) 102);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lmi;Z)V", line = 127)
    public static final void method620(class92 arg0, boolean arg1) {
        field1331++;
        if (!arg1) {
            return;
        }
        while (true) {
            while (arg0.field1495.length > arg0.field1476) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method702(-1) == 1) {
                    var2 = true;
                    var3 = arg0.method702(-1);
                    var4 = arg0.method702(-1);
                }
                int var5 = arg0.method702(-1);
                int var6 = arg0.method702(-1);
                int var7 = class164.field2666 + class248.field4219 - var6 * 64 - 1;
                int var8 = var5 * 64 - class22.field239;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class184.field2955 && var7 < class248.field4219) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method743((byte) 102);
                                if (var13 != 0) {
                                    if (class14.field118[var9][var10] == null) {
                                        class14.field118[var9][var10] = new byte[4096];
                                    }
                                    class14.field118[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method743((byte) 93);
                                    if (class266.field4497[var9][var10] == null) {
                                        class266.field4497[var9][var10] = new byte[4096];
                                    }
                                    class266.field4497[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method743((byte) 46);
                        if (var16 != 0) {
                            arg0.field1476++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZI)V", line = 221)
    public static final void method621(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class90.field1422 = -1;
        if (!arg3) {
            return;
        }
        field1333++;
        class103.field1696 = -1;
        class282.field4813 = class248.field4219 * arg4 / arg0;
        class114.field1915 = class184.field2955 * arg1 / arg2;
        class225.method1595((byte) 60);
    }

    static {
        int var0 = 0;
        field1332 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1332[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1337 = 0;
        field1338 = class201.method1405(true, "Verbindung abgebrochen)3");
        field1341 = false;
        field1342 = null;
        field1340 = 0;
        field1339 = false;
    }
}
