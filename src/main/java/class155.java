import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class155 extends RuntimeException {

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3599;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ljava/lang/String;")
    public String field3608;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Laf;")
    public static class7 field3602 = class48.method406(40, "cross");

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Laf;")
    public static class7 field3601 = class48.method406(40, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    public static int[] field3600 = new int[32768];

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Laf;")
    public static class7 field3595 = class48.method406(40, "Konfig geladen)3");

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[Lmd;")
    public static class87[] field3609 = new class87[4];

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3610 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field3611 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lqc;")
    public static class114 field3594;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lkb;")
    public static class71 field3598;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lkb;")
    public static class71 field3606;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
    public static boolean field3605;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
    public static final void method1211(boolean arg0) {
        field3603++;
        class91.field2100.method1136(-27608);
        int var1 = class91.field2100.method1138(8, arg0);
        if (class106.field2615 > var1) {
            for (int var2 = var1; var2 < class106.field2615; var2++) {
                class84.field1982[class120.field2837++] = field3600[var2];
            }
        }
        if (var1 > class106.field2615) {
            throw new RuntimeException("gnpov1");
        }
        class106.field2615 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field3600[var3];
            class141 var5 = class121.field2843[var4];
            int var6 = class91.field2100.method1138(1, false);
            if (var6 == 0) {
                field3600[class106.field2615++] = var4;
                var5.field476 = field3611;
            } else {
                int var7 = class91.field2100.method1138(2, false);
                if (var7 == 0) {
                    field3600[class106.field2615++] = var4;
                    var5.field476 = field3611;
                    class21.field537[class98.field2325++] = var4;
                } else if (var7 == 1) {
                    field3600[class106.field2615++] = var4;
                    var5.field476 = field3611;
                    int var8 = class91.field2100.method1138(3, false);
                    var5.method182(false, var8, (byte) -67);
                    int var9 = class91.field2100.method1138(1, false);
                    if (var9 == 1) {
                        class21.field537[class98.field2325++] = var4;
                    }
                } else if (var7 == 2) {
                    field3600[class106.field2615++] = var4;
                    var5.field476 = field3611;
                    int var10 = class91.field2100.method1138(3, false);
                    var5.method182(true, var10, (byte) -42);
                    int var11 = class91.field2100.method1138(3, false);
                    var5.method182(true, var11, (byte) -8);
                    int var12 = class91.field2100.method1138(1, arg0);
                    if (var12 == 1) {
                        class21.field537[class98.field2325++] = var4;
                    }
                } else if (var7 == 3) {
                    class84.field1982[class120.field2837++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1212(int arg0) {
        field3606 = null;
        field3602 = null;
        field3594 = null;
        field3595 = null;
        if (arg0 == 3) {
            field3609 = null;
            field3598 = null;
            field3600 = null;
            field3601 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lcd;I)V")
    public static final void method1213(class19 arg0, int arg1) {
        field3596++;
        arg0.field437 = false;
        if (arg0.field502 != -1) {
            class93 var2 = class87.method710(arg0.field502, 6491);
            if (var2 == null || var2.field2158 == null) {
                arg0.field502 = -1;
            } else {
                arg0.field458++;
                if (var2.field2158.length > arg0.field489 && var2.field2169[arg0.field489] < arg0.field458) {
                    arg0.field489++;
                    arg0.field458 = 1;
                    class25.method231(true, arg0.field491, arg0.field505, var2, arg0.field489);
                }
                if (var2.field2158.length <= arg0.field489) {
                    arg0.field458 = 0;
                    arg0.field489 = 0;
                    class25.method231(true, arg0.field491, arg0.field505, var2, arg0.field489);
                }
            }
        }
        if (arg0.field469 != -1 && arg0.field500 <= field3611) {
            if (arg0.field475 < 0) {
                arg0.field475 = 0;
            }
            int var3 = class94.method764(arg0.field469, -21565).field702;
            if (var3 == -1) {
                arg0.field469 = -1;
            } else {
                class93 var4 = class87.method710(var3, 6491);
                if (var4 == null || var4.field2158 == null) {
                    arg0.field469 = -1;
                } else {
                    arg0.field477++;
                    if (var4.field2158.length > arg0.field475 && var4.field2169[arg0.field475] < arg0.field477) {
                        arg0.field475++;
                        arg0.field477 = 1;
                        class25.method231(true, arg0.field491, arg0.field505, var4, arg0.field475);
                    }
                    if (var4.field2158.length <= arg0.field475 && (arg0.field475 < 0 || arg0.field475 >= var4.field2158.length)) {
                        arg0.field469 = -1;
                    }
                }
            }
        }
        if (arg0.field478 != -1 && arg0.field457 <= 1) {
            class93 var5 = class87.method710(arg0.field478, 6491);
            if (var5.field2150 == 1 && arg0.field471 > 0 && arg0.field483 <= field3611 && field3611 > arg0.field486) {
                arg0.field457 = 1;
                return;
            }
        }
        if (arg0.field478 != -1 && arg0.field457 == 0) {
            class93 var6 = class87.method710(arg0.field478, 6491);
            if (var6 == null || var6.field2158 == null) {
                arg0.field478 = -1;
            } else {
                arg0.field463++;
                if (arg0.field487 < var6.field2158.length && arg0.field463 > var6.field2169[arg0.field487]) {
                    arg0.field463 = 1;
                    arg0.field487++;
                    class25.method231(true, arg0.field491, arg0.field505, var6, arg0.field487);
                }
                if (var6.field2158.length <= arg0.field487) {
                    arg0.field487 -= var6.field2176;
                    arg0.field499++;
                    if (arg0.field499 >= var6.field2174) {
                        arg0.field478 = -1;
                    } else if (arg0.field487 >= 0 && arg0.field487 < var6.field2158.length) {
                        class25.method231(true, arg0.field491, arg0.field505, var6, arg0.field487);
                    } else {
                        arg0.field478 = -1;
                    }
                }
                arg0.field437 = var6.field2160;
            }
        }
        if (arg0.field457 > 0) {
            arg0.field457--;
        }
        int var7 = 103 / ((37 - arg1) / 40);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Llf;")
    public static final class82 method1214(byte arg0, int arg1) {
        field3604++;
        class82 var2 = (class82) class137.field3259.method395(127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field2736.method572(6, false, arg1);
        class82 var4 = new class82();
        var4.field1900 = arg1;
        if (arg0 >= -62) {
            method1211(false);
        }
        if (var3 != null) {
            var4.method695(-125, new class122(var3));
        }
        var4.method692((byte) 119);
        if (var4.field1910) {
            var4.field1897 = 0;
            var4.field1928 = false;
        }
        class137.field3259.method388(var4, (long) arg1, 2047);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class155(Throwable arg0, String arg1) {
        this.field3599 = arg0;
        this.field3608 = arg1;
    }
}
