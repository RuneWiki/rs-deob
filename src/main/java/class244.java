import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class244 {

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Ldb;")
    private class39 field3778 = new class39(256);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Ldb;")
    private class39 field3780 = new class39(256);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lpk;")
    private class237 field3774;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lpk;")
    private class237 field3771;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Z")
    public static boolean field3781 = false;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lhl;")
    public static class139 field3783 = new class139(64);

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
    public static boolean field3785 = true;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3787 = "glow2:";

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3784 = -1;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lpk;")
    public static class237 field3788;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Ljk;")
    public static class297 field3773;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public static int[] field3786;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1659(int arg0) {
        field3788 = null;
        field3773 = null;
        field3786 = null;
        field3783 = null;
        field3787 = null;
        if (arg0 != 8) {
            field3785 = false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILgk;)V")
    public static final void method1660(int arg0, int arg1, int arg2, int arg3, class224 arg4) {
        field3772++;
        if (class185.field2687 == arg4 || class51.field826 >= 400) {
            return;
        }
        String var5;
        if (arg4.field3486 == 0) {
            boolean var6 = true;
            if (class185.field2687.field3491 != -1 && arg4.field3491 != -1) {
                int var7 = class185.field2687.field3485 <= arg4.field3485 ? arg4.field3485 : class185.field2687.field3485;
                int var8 = arg4.field3491 <= class185.field2687.field3491 ? arg4.field3491 : class185.field2687.field3491;
                int var9 = class185.field2687.field3485 - arg4.field3485;
                int var10 = var7 * 10 / 100 + var8 + 5;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var10) {
                    var6 = false;
                }
            }
            String var11 = class246.field3836 == 1 ? class146.field2116 : class239.field3683;
            if (arg4.field3485 >= arg4.field3504) {
                var5 = arg4.method1534(104) + (var6 ? class73.method585(class185.field2687.field3485, (byte) -81, arg4.field3485) : "<col=ffffff>") + " (" + var11 + arg4.field3485 + ")";
            } else {
                var5 = arg4.method1534(126) + (var6 ? class73.method585(class185.field2687.field3485, (byte) -97, arg4.field3485) : "<col=ffffff>") + " (" + var11 + arg4.field3485 + "+" + (arg4.field3504 - arg4.field3485) + ")";
            }
        } else {
            var5 = arg4.method1534(-126) + " (" + class186.field2712 + arg4.field3486 + ")";
        }
        if (arg0 > -34) {
            field3783 = null;
        }
        if (class277.field4275 == 1) {
            class246.method1685(class106.field1570 + " -> <col=ffffff>" + var5, arg2, (long) arg3, class123.field1819, arg1, (short) 18, class166.field2454, true);
            class102.field1491++;
        } else if (!class76.field1205) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class296.field4497[var12] != null) {
                    class208.field3124++;
                    short var13 = 0;
                    if (class246.field3836 == 0 && class296.field4497[var12].equalsIgnoreCase(class256.field3950)) {
                        if (class185.field2687.field3485 < arg4.field3485) {
                            var13 = 2000;
                        }
                        if (class185.field2687.field3476 != 0 && arg4.field3476 != 0) {
                            if (class185.field2687.field3476 == arg4.field3476) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class64.field1070[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class266.field4156[var12];
                    short var16 = (short) (var13 + var15);
                    class246.method1685("<col=ffffff>" + var5, arg2, (long) arg3, class296.field4497[var12], arg1, var16, class196.field2967[var12], true);
                }
            }
        } else if ((class146.field2123 & 0x8) != 0) {
            class88.field1337++;
            class246.method1685(class174.field2545 + " -> <col=ffffff>" + var5, arg2, (long) arg3, class182.field2647, arg1, (short) 14, class270.field4218, true);
        }
        for (int var17 = 0; var17 < class51.field826; var17++) {
            if (class265.field4147[var17] == 38) {
                class280.field4297[var17] = "<col=ffffff>" + var5;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[III)Ltf;")
    private final class98 method1661(int arg0, int[] arg1, int arg2, int arg3) {
        field3782++;
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF7 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class98 var9 = (class98) this.field3780.method306(var7, 16216);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg2 != -1062417268) {
                method1660(-18, -1, -36, -68, (class224) null);
            }
            class38 var10 = (class38) this.field3778.method306(var7, 16216);
            if (var10 == null) {
                var10 = class38.method302(this.field3774, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3778.method309((byte) -8, var10, var7);
            }
            class98 var11 = var10.method294(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1193(arg2 + 1062417386);
                this.field3780.method309((byte) -8, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public static final void method1662(int arg0, int arg1) {
        class283.field4344 = 3;
        field3776++;
        class155.field2259 = 20;
        if (arg0 != -28029) {
            field3786 = null;
        }
        class83.field1280 = arg1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[IIB)Ltf;")
    private final class98 method1663(int arg0, int[] arg1, int arg2, byte arg3) {
        int var5 = 84 / ((5 - arg3) / 50);
        field3779++;
        int var6 = (arg0 << 4 & 0xFFFF | arg0 >>> 12) ^ arg2;
        int var7 = var6 | arg0 << 16;
        long var8 = (long) var7;
        class98 var10 = (class98) this.field3780.method306(var8, 16216);
        if (var10 != null) {
            return var10;
        } else if (arg1 == null || arg1[0] > 0) {
            class57 var11 = class57.method473(this.field3771, arg0, arg2);
            if (var11 == null) {
                return null;
            }
            class98 var12 = var11.method474();
            this.field3780.method309((byte) -8, var12, var8);
            if (arg1 != null) {
                arg1[0] -= var12.field1446.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZIIILwg;)V")
    public static final void method1664(int arg0, boolean arg1, int arg2, int arg3, int arg4, class220 arg5) {
        field3777++;
        if (class284.field4353 >= 50 || arg5 == null || arg5.field3431 == null || arg2 >= arg5.field3431.length || arg5.field3431[arg2] == null) {
            return;
        }
        int var6 = arg5.field3431[arg2][0];
        int var7 = var6 >> 8;
        if (arg4 != 8890) {
            return;
        }
        int var8 = (var6 & 0xFA) >> 5;
        if (arg5.field3431[arg2].length > 1) {
            int var9 = (int) ((double) arg5.field3431[arg2].length * Math.random());
            if (var9 > 0) {
                var7 = arg5.field3431[arg2][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg1) {
                class44.method355(var7, var8, (byte) -124, 0, 255);
            }
        } else if (class194.field2934 != 0) {
            class49.field810[class284.field4353] = var7;
            class60.field987[class284.field4353] = var8;
            class173.field2539[class284.field4353] = 0;
            class295.field4492[class284.field4353] = null;
            int var11 = (arg3 - 64) / 128;
            class10.field155[class284.field4353] = 255;
            int var12 = (arg0 - 64) / 128;
            class163.field2364[class284.field4353] = (var11 << 16) + (var12 << 8) + var10;
            class284.field4353++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([III)Ltf;")
    public final class98 method1665(int[] arg0, int arg1, int arg2) {
        field3775++;
        if (this.field3771.method1603(-1) == 1) {
            return this.method1663(0, arg0, arg1, (byte) -118);
        } else if (this.field3771.method1614(arg2 + arg2, arg1) == 1) {
            return this.method1663(arg1, arg0, 0, (byte) 95);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "([III)Ltf;")
    public final class98 method1666(int[] arg0, int arg1, int arg2) {
        field3770++;
        if (this.field3774.method1603(-1) == 1) {
            return this.method1661(0, arg0, -1062417268, arg1);
        } else if (this.field3774.method1614(0, arg1) == 1) {
            return this.method1661(arg1, arg0, -1062417268, 0);
        } else {
            int var4 = -31 / ((arg2 + 9) / 57);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lpk;Lpk;)V")
    public class244(class237 arg0, class237 arg1) {
        this.field3774 = arg1;
        this.field3771 = arg0;
    }
}
