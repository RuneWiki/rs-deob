import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class201 extends class200 {

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "Lwk;")
    public static class273 field3489 = new class273(64);

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Loa;")
    public class99 field3484;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "[I")
    public int[] field3481;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "[I")
    public int[] field3487;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "[I")
    public int[] field3491;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
    public int[] field3494;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[Ltf;I)V")
    public static final void method1347(int arg0, class107[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class107 var4 = arg1[var3];
            if (var4 != null && var4.field1801 == arg0 && (!var4.field1915 || !client.method1058(var4))) {
                if (var4.field1814 == 0) {
                    if (!var4.field1915 && client.method1058(var4) && class192.field3382 != var4) {
                        continue;
                    }
                    method1347(var4.field1873, arg1, 64);
                    if (var4.field1837 != null) {
                        method1347(var4.field1873, var4.field1837, 64);
                    }
                    class2 var5 = (class2) class57.field959.method1550(true, (long) var4.field1873);
                    if (var5 != null) {
                        class228.method1498(var5.field12, -36);
                    }
                }
                if (var4.field1814 == 6) {
                    if (var4.field1928 != -1 || var4.field1843 != -1) {
                        boolean var6 = class156.method1068(var4, (byte) 15);
                        int var7;
                        if (var6) {
                            var7 = var4.field1843;
                        } else {
                            var7 = var4.field1928;
                        }
                        if (var7 != -1) {
                            class270 var8 = class38.method297(132, var7);
                            if (var8 != null) {
                                var4.field1929 += class224.field3889;
                                while (var8.field4749[var4.field1911] < var4.field1929) {
                                    var4.field1929 -= var8.field4749[var4.field1911];
                                    var4.field1911++;
                                    if (var8.field4740.length <= var4.field1911) {
                                        var4.field1911 -= var8.field4771;
                                        if (var4.field1911 < 0 || var4.field1911 >= var8.field4740.length) {
                                            var4.field1911 = 0;
                                        }
                                    }
                                    class238.method1555(var4, arg2 + 10491);
                                }
                            }
                        }
                    }
                    if (var4.field1830 != 0 && !var4.field1915) {
                        int var9 = var4.field1830 >> 16;
                        int var10 = class224.field3889 * var9;
                        int var11 = var4.field1830 << 16 >> 16;
                        int var12 = class224.field3889 * var11;
                        var4.field1781 = var4.field1781 + var12 & 0x7FF;
                        var4.field1788 = var4.field1788 + var10 & 0x7FF;
                        class238.method1555(var4, 10555);
                    }
                }
            }
        }
        if (arg2 != 64) {
            method1350((class182) null, -103, (class182) null, true);
        }
        field3485++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)I")
    public final int method1348(byte arg0, int arg1) {
        field3482++;
        if (this.field3494 == null) {
            return -1;
        }
        int var3 = 99 / ((-arg0 - 48) / 35);
        for (int var4 = 0; var4 < this.field3494.length; var4++) {
            if (this.field3487[var4] == arg1) {
                return this.field3494[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLik;)V")
    public final void method1349(byte arg0, class261 arg1) {
        while (true) {
            int var3 = arg1.method1693((byte) 76);
            if (var3 == 0) {
                field3492++;
                if (arg0 != -57) {
                    method1347(-83, (class107[]) null, 17);
                    return;
                }
                return;
            }
            this.method1353(3, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ltg;ILtg;Z)V")
    public static final void method1350(class182 arg0, int arg1, class182 arg2, boolean arg3) {
        field3493++;
        class172.field3056 = arg0;
        class156.field2803 = arg2;
        class200.field3473 = arg3;
        if (arg1 != 11034) {
            field3489 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public final void method1351(int arg0) {
        field3488++;
        if (this.field3481 != null) {
            for (int var2 = 0; var2 < this.field3481.length; var2++) {
                this.field3481[var2] = class179.method1194(this.field3481[var2], 32768);
            }
        }
        if (this.field3494 != null) {
            for (int var3 = 0; var3 < this.field3494.length; var3++) {
                this.field3494[var3] = class179.method1194(this.field3494[var3], 32768);
            }
        }
        if (arg0 != 0) {
            this.field3481 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public static void method1352(int arg0) {
        if (arg0 > 87) {
            field3489 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILik;I)V")
    private final void method1353(int arg0, class261 arg1, int arg2) {
        field3483++;
        if (arg0 != 3) {
            this.field3487 = null;
        }
        if (arg2 == 1) {
            this.field3484 = arg1.method1705(arg0 - 123);
        } else if (arg2 == 2) {
            int var4 = arg1.method1693((byte) 89);
            this.field3487 = new int[var4];
            this.field3494 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3494[var5] = arg1.method1740((byte) 94);
                int var6 = arg1.method1693((byte) 37);
                if (var6 == 0) {
                    this.field3487[var5] = -1;
                } else {
                    this.field3487[var5] = var6;
                }
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1693((byte) -100);
            this.field3481 = new int[var7];
            this.field3491 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3481[var8] = arg1.method1740((byte) 76);
                int var9 = arg1.method1693((byte) -116);
                if (var9 == 0) {
                    this.field3491[var8] = -1;
                } else {
                    this.field3491[var8] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjd;Ljava/awt/Component;II)Lqh;")
    public static final class202 method1354(int arg0, class87 arg1, Component arg2, int arg3, int arg4) {
        field3486++;
        if (class225.field3905 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class202 var5 = (class202) Class.forName("dj").getDeclaredConstructor().newInstance();
                var5.field3535 = arg4;
                var5.field3518 = new int[(class85.field1468 ? 2 : 1) * 256];
                var5.method1182(arg2);
                var5.field3528 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3528 > 16384) {
                    var5.field3528 = 16384;
                }
                var5.method1176(var5.field3528);
                if (class108.field1955 > 0 && class143.field2517 == null) {
                    class143.field2517 = new class211();
                    class143.field2517.field3660 = arg1;
                    arg1.method594(-30175, class143.field2517, class108.field1955);
                }
                if (class143.field2517 != null) {
                    if (class143.field2517.field3659[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class143.field2517.field3659[arg3] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class176 var6 = new class176(arg1, arg3);
                    var6.field3518 = new int[(class85.field1468 ? 2 : 1) * 256];
                    var6.field3535 = arg4;
                    var6.method1182(arg2);
                    var6.field3528 = 16384;
                    var6.method1176(var6.field3528);
                    int var7 = -27 % ((-arg0 - 13) / 35);
                    if (class108.field1955 > 0 && class143.field2517 == null) {
                        class143.field2517 = new class211();
                        class143.field2517.field3660 = arg1;
                        arg1.method594(-30175, class143.field2517, class108.field1955);
                    }
                    if (class143.field2517 != null) {
                        if (class143.field2517.field3659[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class143.field2517.field3659[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class202();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public final int method1355(int arg0, int arg1) {
        field3490++;
        if (this.field3481 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3481.length; var3++) {
            if (this.field3491[var3] == arg1) {
                return this.field3481[var3];
            }
        }
        if (arg0 <= 101) {
            this.field3487 = null;
        }
        return -1;
    }
}
