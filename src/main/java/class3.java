import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class3 extends class359 {

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[I")
    public static int[] field42 = new int[200];

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lra;")
    public static class57 field41;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lbm;")
    public static class60 field46;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
    public final int method20(int arg0) {
        if (arg0 >= -23) {
            this.method30(false);
        }
        field44++;
        return this.field39 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Lgg;")
    public static final class95 method21(byte arg0) {
        field43++;
        if (arg0 != -126) {
            field46 = null;
        }
        return class106.field1202;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Z")
    public final boolean method22(byte arg0) {
        if (arg0 < 103) {
            return false;
        } else {
            field38++;
            return (this.field39 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method23(int arg0) {
        field50++;
        class331 var1 = class39.field403;
        synchronized (class39.field403) {
            class39.field403.method2052(0);
        }
        class331 var2 = client.field2307;
        synchronized (client.field2307) {
            client.field2307.method2052(0);
        }
        class331 var3 = class193.field2629;
        synchronized (class193.field2629) {
            if (arg0 != -5) {
                field46 = null;
            }
            class193.field2629.method2052(0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        if (!arg0) {
            this.field39 = -3;
        }
        field51++;
        return (this.field39 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Z")
    public final boolean method25(byte arg0) {
        int var2 = 47 % ((-arg0 - 66) / 54);
        field48++;
        return (this.field39 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static final void method26(int arg0) {
        if (arg0 >= -27) {
            method21((byte) 105);
        }
        field52++;
        for (class63 var1 = (class63) class78.field880.method1124(-1); var1 != null; var1 = (class63) class78.field880.method1119(false)) {
            class426 var2 = var1.field724;
            if (class410.field5931 != var2.field1308 || class221.field3033 > var2.field6197) {
                var1.method2290((byte) 98);
                var2.method2660(-91);
            } else if (var2.field6173 <= class221.field3033) {
                if (var2.field6201 > 0) {
                    class358 var3 = class81.field917[var2.field6201 - 1];
                    if (var3 != null && var3.field1304 >= 0 && class279.field3935 * 128 > var3.field1304 && var3.field1311 >= 0 && var3.field1311 < (class164.field2287 * 128)) {
                        var2.method2654(0, var3.field1311, class372.method2335(var3.field1311, var2.field1308, (byte) 74, var3.field1304) - var2.field6181, var3.field1304, class221.field3033);
                    }
                }
                if (var2.field6201 < 0) {
                    int var4 = -var2.field6201 - 1;
                    class133 var5;
                    if (class188.field2547 == var4) {
                        var5 = class390.field5715;
                    } else {
                        var5 = class375.field5473[var4];
                    }
                    if (var5 != null && var5.field1304 >= 0 && class279.field3935 * 128 > var5.field1304 && var5.field1311 >= 0 && var5.field1311 < (class164.field2287 * 128)) {
                        var2.method2654(0, var5.field1311, class372.method2335(var5.field1311, var2.field1308, (byte) 81, var5.field1304) - var2.field6181, var5.field1304, class221.field3033);
                    }
                }
                var2.method2659(class245.field3329, -1);
                class310.method1947(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)I")
    public final int method27(int arg0) {
        if (arg0 != -6936) {
            this.method31((byte) -92, -6);
        }
        field47++;
        return class206.method1304(this.field39, arg0 + 6988);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method28(int arg0, byte arg1, String arg2) {
        field45++;
        boolean var3 = false;
        for (int var4 = 0; var4 < class148.field2082; var4++) {
            class133 var5 = class375.field5473[class294.field4217[var4]];
            if (var5 != null && var5.field1847 != null && var5.field1847.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class169.field2360.method809(57, -28022);
                    class137.field1942++;
                    class169.field2360.method1380(class294.field4217[var4], (byte) -8);
                    class169.field2360.method1396(21375, 0);
                } else if (arg0 == 4) {
                    class169.field2360.method809(114, -28022);
                    class97.field1086++;
                    class169.field2360.method1380(class294.field4217[var4], (byte) -8);
                    class169.field2360.method1396(21375, 0);
                } else if (arg0 == 5) {
                    class181.field2481++;
                    class169.field2360.method809(205, -28022);
                    class169.field2360.method1371(class294.field4217[var4], 29594);
                    class169.field2360.method1345(0, 0);
                } else if (arg0 == 6) {
                    class119.field1490++;
                    class169.field2360.method809(144, -28022);
                    class169.field2360.method1396(21375, 0);
                    class169.field2360.method1371(class294.field4217[var4], 29594);
                } else if (arg0 == 7) {
                    class176.field2440++;
                    class169.field2360.method809(218, -28022);
                    class169.field2360.method1396(21375, 0);
                    class169.field2360.method1371(class294.field4217[var4], 29594);
                }
                var3 = true;
                break;
            }
        }
        if (arg1 > -122) {
            method26(123);
        }
        if (!var3) {
            class413.method2589(class122.field1623 + arg2, 0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Z")
    public final boolean method29(int arg0) {
        field53++;
        if (arg0 != 128) {
            field42 = null;
        }
        return (this.field39 & 0x69CA54) >> 22 != 0;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V")
    public class3(int arg0, int arg1) {
        this.field36 = arg1;
        this.field39 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)Z")
    public final boolean method30(boolean arg0) {
        field54++;
        if (!arg0) {
            this.method24(true);
        }
        return (this.field39 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z")
    public final boolean method31(byte arg0, int arg1) {
        if (arg0 != -39) {
            field49 = 127;
        }
        field37++;
        return (this.field39 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
    public static void method32(int arg0) {
        field46 = null;
        field42 = null;
        field41 = null;
        if (arg0 != -6611) {
            method28(14, (byte) -25, (String) null);
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)Z")
    public final boolean method33(byte arg0) {
        int var2 = -120 / ((arg0 - 65) / 59);
        field40++;
        return (this.field39 & 0x2D33DD) >> 21 != 0;
    }
}
