import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class81 extends class149 {

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public int field1489 = 0;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lsg;")
    private static class169 field1485 = class165.method1060("Loaded wordpack", 1536);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "Lsg;")
    public static class169 field1490 = class165.method1060("event_opbase", 1536);

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Lsg;")
    public static class169 field1495 = class165.method1060("Schrifts-=tze geladen)3", 1536);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "Lsg;")
    public static class169 field1484 = field1485;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "[I")
    public static int[] field1496 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!j", name = "db", descriptor = "Lsg;")
    public static class169 field1498 = class165.method1060("blinken3:", 1536);

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "[I")
    public static int[] field1497;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public static final void method489(int arg0, int arg1, int arg2, int arg3) {
        class37.method240((byte) -110);
        class130.method851(arg0, arg1, class115.field2103.field1105 + arg0, class115.field2103.field1103 + arg1);
        if (class95.field1805 == 2 || class95.field1805 == 5) {
            class130.method848(arg0 + 25, arg1 - -5, 0, class27.field552, class131.field2437);
        } else {
            int var4 = class29.field600 + class182.field3546 & 0x7FF;
            int var5 = class4.field79.field3698 / 32 + 48;
            int var6 = 464 - class4.field79.field3679 / 32;
            class87.field1598.method131(arg0 + 25, arg1 + 5, 146, 151, var5, var6, var4, class148.field2744 + 256, class27.field552, class131.field2437);
            for (int var7 = 0; var7 < class88.field1603; var7++) {
                int var37 = class203.field3978[var7] * 4 + 2 - class4.field79.field3698 / 32;
                int var38 = class111.field2030[var7] * 4 + 2 - class4.field79.field3679 / 32;
                class68.method427(var37, class206.field4038[var7], arg0, arg1, var38, (byte) -83);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class22 var34 = class60.field1112[class61.field1132][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class4.field79.field3698 / 32;
                        int var36 = var33 * 4 + 2 - class4.field79.field3679 / 32;
                        class68.method427(var35, class123.field2268[0], arg0, arg1, var36, (byte) -75);
                    }
                }
            }
            for (int var9 = 0; var9 < class164.field3149; var9++) {
                class197 var29 = class54.field992[class182.field3547[var9]];
                if (var29 != null && var29.method1249(-5701)) {
                    class175 var30 = var29.field3872;
                    if (var30 != null && var30.field3430 != null) {
                        var30 = var30.method1173((byte) 94);
                    }
                    if (var30 != null && var30.field3387 && var30.field3427) {
                        int var31 = var29.field3698 / 32 - class4.field79.field3698 / 32;
                        int var32 = var29.field3679 / 32 - class4.field79.field3679 / 32;
                        class68.method427(var31, class123.field2268[1], arg0, arg1, var32, (byte) -74);
                    }
                }
            }
            for (int var10 = 0; var10 < class141.field2631; var10++) {
                class196 var21 = class65.field1213[class202.field3932[var10]];
                if (var21 != null && var21.method1249(-5701)) {
                    int var22 = var21.field3698 / 32 - class4.field79.field3698 / 32;
                    int var23 = var21.field3679 / 32 - class4.field79.field3679 / 32;
                    boolean var24 = false;
                    long var25 = var21.field3856.method1133(false);
                    for (int var27 = 0; var27 < class57.field1064; var27++) {
                        if (class142.field2640[var27] == var25 && class11.field273[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class4.field79.field3841 != 0 && var21.field3841 != 0 && class4.field79.field3841 == var21.field3841) {
                        var28 = true;
                    }
                    if (var24) {
                        class68.method427(var22, class123.field2268[3], arg0, arg1, var23, (byte) -121);
                    } else if (var28) {
                        class68.method427(var22, class123.field2268[4], arg0, arg1, var23, (byte) -64);
                    } else {
                        class68.method427(var22, class123.field2268[2], arg0, arg1, var23, (byte) -77);
                    }
                }
            }
            if (class136.field2543 != 0 && class162.field3107 % 20 < 10) {
                if (class136.field2543 == 1 && class169.field3261 >= 0 && class169.field3261 < class54.field992.length) {
                    class197 var11 = class54.field992[class169.field3261];
                    if (var11 != null) {
                        int var12 = var11.field3698 / 32 - class4.field79.field3698 / 32;
                        int var13 = var11.field3679 / 32 - class4.field79.field3679 / 32;
                        class110.method682(true, var13, arg1, class112.field2053[1], var12, arg0);
                    }
                }
                if (class136.field2543 == 2) {
                    int var14 = (class116.field2146 - class179.field3489) * 4 + 2 - class4.field79.field3698 / 32;
                    int var15 = (class174.field3376 - class191.field3761) * 4 + 2 - class4.field79.field3679 / 32;
                    class110.method682(true, var15, arg1, class112.field2053[1], var14, arg0);
                }
                if (class136.field2543 == 10 && class159.field3033 >= 0 && class159.field3033 < class65.field1213.length) {
                    class196 var16 = class65.field1213[class159.field3033];
                    if (var16 != null) {
                        int var17 = var16.field3698 / 32 - class4.field79.field3698 / 32;
                        int var18 = var16.field3679 / 32 - class4.field79.field3679 / 32;
                        class110.method682(true, var18, arg1, class112.field2053[1], var17, arg0);
                    }
                }
            }
            if (class154.field2964 != 0) {
                int var19 = class154.field2964 * 4 + 2 - class4.field79.field3698 / 32;
                int var20 = class96.field1822 * 4 + 2 - class4.field79.field3679 / 32;
                class68.method427(var19, class112.field2053[0], arg0, arg1, var20, (byte) -64);
            }
            class130.method850(arg0 + 93 + 4, arg1 - -82 - 4, 3, 3, 16777215);
        }
        if (arg2 != 22896) {
            field1497 = null;
        }
        field1488++;
        if (class95.field1805 >= 3) {
            class130.method848(arg0, arg1, 0, class89.field1622, class195.field3819);
        } else {
            class65.field1224.method131(arg0, arg1, 33, 33, 25, 25, class29.field600, 256, class89.field1622, class195.field3819);
        }
        if (class174.field3358[arg3]) {
            class115.field2103.method370(arg0, arg1);
        }
        class176.field3449[arg3] = true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Loa;B)V")
    public final void method490(class127 arg0, byte arg1) {
        field1491++;
        while (true) {
            int var3 = arg0.method819((byte) 22);
            if (var3 == 0) {
                if (arg1 == -69) {
                    return;
                } else {
                    method494(-65, -67, 88, 64, 33, 98);
                    return;
                }
            }
            this.method492((byte) -66, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static void method491(byte arg0) {
        field1485 = null;
        if (arg0 != 51) {
            return;
        }
        field1484 = null;
        field1490 = null;
        field1495 = null;
        field1496 = null;
        field1497 = null;
        field1498 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BILoa;)V")
    private final void method492(byte arg0, int arg1, class127 arg2) {
        if (arg1 == 2) {
            this.field1489 = arg2.method785(true);
        }
        field1486++;
        if (arg0 >= -41) {
            method489(28, -110, -108, 47);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILoa;)Lsg;")
    public static final class169 method493(int arg0, class127 arg1) {
        if (arg0 != 32) {
            field1494 = 65;
        }
        field1487++;
        return class139.method929(arg1, (byte) 52, 32767);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1493++;
        if (class6.field131 == arg2 && class93.field1745 == arg1 && (class26.field537 == arg0 || !class105.field1925)) {
            return;
        }
        class26.field537 = arg0;
        class93.field1745 = arg1;
        if (!class105.field1925) {
            class26.field537 = 0;
        }
        class6.field131 = arg2;
        class140.method933((byte) 124, 25);
        class104.method612(-118, class149.field2749, true);
        int var6 = class179.field3489;
        int var7 = class191.field3761;
        class179.field3489 = (arg2 - 6) * 8;
        class191.field3761 = arg1 * 8 - 48;
        int var8 = class179.field3489 - var6;
        int var9 = class179.field3489;
        int var10 = class191.field3761 - var7;
        int var11 = class191.field3761;
        if (arg4 != -22725) {
            return;
        }
        for (int var12 = 0; var12 < 32768; var12++) {
            class197 var28 = class54.field992[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3734[var29] -= var8;
                    var28.field3729[var29] -= var10;
                }
                var28.field3698 -= var8 * 128;
                var28.field3679 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class196 var26 = class65.field1213[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3734[var27] -= var8;
                    var26.field3729[var27] -= var10;
                }
                var26.field3679 -= var10 * 128;
                var26.field3698 -= var8 * 128;
            }
        }
        byte var14 = 104;
        class61.field1132 = arg0;
        byte var15 = 0;
        byte var16 = 1;
        if (var8 < 0) {
            var16 = -1;
            var14 = -1;
            var15 = 103;
        }
        class4.field79.method1246(arg3, (byte) 82, false, arg5);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var10 < 0) {
            var18 = -1;
            var19 = -1;
            var17 = 103;
        }
        for (int var20 = var15; var20 != var14; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var10 + var22;
                int var24 = var8 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class60.field1112[var25][var20][var22] = class60.field1112[var25][var24][var23];
                    } else {
                        class60.field1112[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class105 var21 = (class105) class57.field1056.method145(0); var21 != null; var21 = (class105) class57.field1056.method152((byte) -128)) {
            var21.field1921 -= var8;
            var21.field1932 -= var10;
            if (var21.field1921 < 0 || var21.field1932 < 0 || var21.field1921 >= 104 || var21.field1932 >= 104) {
                var21.method1213(9104);
            }
        }
        class17.field406 = false;
        class15.field324 = -1;
        if (class154.field2964 != 0) {
            class96.field1822 -= var10;
            class154.field2964 -= var8;
        }
        class103.field1886 = 0;
        class182.field3549.method155(0);
        class163.field3121.method155(0);
    }
}
