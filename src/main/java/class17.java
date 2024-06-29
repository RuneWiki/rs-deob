import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class17 extends class148 {

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Ljf;")
    public static class68 field388 = new class68(4096);

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Lja;")
    public static class62 field398 = class30.method243(43, "<col=c0ff00>");

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Lja;")
    public static class62 field393 = class30.method243(43, "mapdots");

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "Lea;")
    public static class29 field399;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Lja;")
    public class62 field389;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "[I")
    public static int[] field395;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "[I")
    public static int[] field397;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)I")
    public static final int method115(byte arg0, int arg1, int arg2) {
        field392++;
        int var3 = 21 % ((arg0 - 57) / 58);
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var5 = (arg1 & 0x7F) * arg2 / 128;
            if (var5 < 2) {
                var5 = 2;
            } else if (var5 > 126) {
                var5 = 126;
            }
            return (arg1 & 0xFF80) + var5;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
    public static final boolean method116(int arg0, int arg1, int arg2) {
        field386++;
        class65 var3 = class84.method653(6, arg1);
        if (arg0 < 49) {
            return true;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method501(false, arg2);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
    public static final void method117(byte arg0, int arg1) {
        class90.field2143 = -1;
        class43.field1011 = 1;
        field387++;
        if (arg0 <= 45) {
            field397 = null;
        }
        class22.field518 = -1;
        class93.field2179 = false;
        class15.field368 = null;
        class151.field3542 = 0;
        class62.field1535 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZZIZB)Lea;")
    public static final class29 method118(boolean arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 != -90) {
            method118(false, true, 22, false, (byte) -105);
        }
        class141 var5 = null;
        field384++;
        if (class121.field2780 != null) {
            var5 = new class141(arg2, class121.field2780, class100.field2330[arg2], 1000000);
        }
        return new class29(var5, class18.field406, arg2, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLhe;)V")
    public static final void method119(boolean arg0, class54 arg1) {
        int var2 = arg1.field1311;
        field390++;
        if (var2 == 324) {
            if (class57.field1405 == -1) {
                class150.field3525 = arg1.field1292;
                class57.field1405 = arg1.field1321;
            }
            if (class67.field1670.field2526) {
                arg1.field1321 = class57.field1405;
            } else {
                arg1.field1321 = class150.field3525;
            }
            return;
        }
        if (!arg0) {
            field394 = -104;
        }
        if (var2 == 325) {
            if (class57.field1405 == -1) {
                class150.field3525 = arg1.field1292;
                class57.field1405 = arg1.field1321;
            }
            if (class67.field1670.field2526) {
                arg1.field1321 = class150.field3525;
            } else {
                arg1.field1321 = class57.field1405;
            }
        } else if (var2 == 327) {
            arg1.field1267 = 150;
            arg1.field1282 = (int) (Math.sin((double) class86.field2060 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1324 = 0;
            arg1.field1235 = 5;
        } else if (var2 == 328) {
            arg1.field1267 = 150;
            arg1.field1282 = (int) (Math.sin((double) class86.field2060 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1324 = 1;
            arg1.field1235 = 5;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)Z")
    public static final boolean method120(int arg0, int arg1) {
        field396++;
        if (arg1 != 1) {
            field393 = null;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static void method121(int arg0) {
        if (arg0 != -325) {
            field393 = null;
        }
        field388 = null;
        field395 = null;
        field399 = null;
        field393 = null;
        field397 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field391++;
        if (arg3 != -6257) {
            return;
        }
        for (int var5 = arg2; var5 <= arg2 + arg4; var5++) {
            for (int var6 = arg1; var6 <= arg1 + arg0; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class15.field369[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class7.field214[0][var6][var5] = class7.field214[0][var6 - 1][var5];
                    }
                    if (arg1 + arg0 == var6 && var6 < 103) {
                        class7.field214[0][var6][var5] = class7.field214[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class7.field214[0][var6][var5] = class7.field214[0][var6][var5 - 1];
                    }
                    if (arg2 + arg4 == var5 && var5 < 103) {
                        class7.field214[0][var6][var5] = class7.field214[0][var6][var5 + 1];
                    }
                }
            }
        }
    }
}
