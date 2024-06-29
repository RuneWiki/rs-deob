import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class191 extends class245 {

    @OriginalMember(owner = "client!t", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field3450;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "Lhj;")
    public static class69 field3454 = class181.method1318(")4g", (byte) -105);

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "[J")
    public static long[] field3460 = new long[256];

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Lhj;")
    public static class69 field3463;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "Lhj;")
    public static class69 field3462;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "Lue;")
    public static class86 field3458;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIIILfh;III)V")
    public static final void method1379(boolean arg0, int arg1, int arg2, int arg3, int arg4, class128 arg5, int arg6, int arg7, int arg8) {
        field3457++;
        if (arg3 >= 0 && arg3 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg0) {
                class19.field246[arg1][arg3][arg4] = 0;
            }
            while (true) {
                int var9 = arg5.method937(false);
                if (var9 == 0) {
                    if (arg0) {
                        class271.field4793[0][arg3][arg4] = class31.field429[0][arg3][arg4];
                    } else if (arg1 == 0) {
                        class271.field4793[0][arg3][arg4] = -class240.method1697(arg4 + arg2 + 556238, arg3 + arg8 + 932731, -47) * 8;
                    } else {
                        class271.field4793[arg1][arg3][arg4] = class271.field4793[arg1 - 1][arg3][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method937(false);
                    if (arg0) {
                        class271.field4793[0][arg3][arg4] = var10 * 8 + class31.field429[0][arg3][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class271.field4793[0][arg3][arg4] = -var10 * 8;
                        } else {
                            class271.field4793[arg1][arg3][arg4] = class271.field4793[arg1 - 1][arg3][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class181.field3285[arg1][arg3][arg4] = arg5.method950(1495791448);
                    class212.field3858[arg1][arg3][arg4] = (byte) ((var9 - 2) / 4);
                    class41.field581[arg1][arg3][arg4] = (byte) class69.method443(var9 + arg7 - 2, 3);
                } else if (var9 > 81) {
                    class253.field4560[arg1][arg3][arg4] = (byte) (var9 - 81);
                } else if (!arg0) {
                    class19.field246[arg1][arg3][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method937(false);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method937(false);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method937(false);
                }
            }
        }
        if (arg6 != 1) {
            method1386(-10, (byte) 89, -6);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class191(Object arg0) {
        this.field3450 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static void method1380(int arg0) {
        field3460 = null;
        field3458 = null;
        field3462 = null;
        field3454 = null;
        field3463 = null;
        if (arg0 != -1) {
            method1385((class83) null, true, (class83) null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)I")
    public static final int method1381(boolean arg0, int arg1) {
        field3459++;
        return arg0 ? arg1 & 0x7F : -16;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1382(int arg0) {
        if (arg0 == 0) {
            field3456++;
            return this.field3450;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)Z")
    public final boolean method1383(int arg0) {
        field3452++;
        if (arg0 <= 91) {
            this.method1382(106);
        }
        return false;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILnc;Ljf;Lnc;Lnc;)Z")
    public static final boolean method1384(int arg0, class83 arg1, class62 arg2, class83 arg3, class83 arg4) {
        class80.field1533 = arg1;
        class78.field1502 = arg4;
        if (arg0 < 18) {
            method1386(82, (byte) 1, -74);
        }
        field3449++;
        class49.field724 = arg2;
        class239.field4377 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lnc;ZLnc;)V")
    public static final void method1385(class83 arg0, boolean arg1, class83 arg2) {
        class227.field4139 = class200.method1460(arg0, arg2, 0, (byte) -110, class186.field3368);
        field3453++;
        class71.field1393 = (class30) class227.field4139;
        class155.field2897 = class200.method1460(arg0, arg2, 0, (byte) -123, class56.field1006);
        if (arg1) {
            field3454 = null;
        }
        class26.field378 = class200.method1460(arg0, arg2, 0, (byte) -122, class165.field3049);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBI)I")
    public static final int method1386(int arg0, byte arg1, int arg2) {
        field3455++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg1 != -107) {
            field3461 = 28;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
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
            field3460[var0] = var1;
        }
        field3461 = 2;
        field3463 = class181.method1318("Benutzeroberfl-=che geladen)3", (byte) -114);
        field3462 = class181.method1318("gelb:", (byte) -112);
    }
}
