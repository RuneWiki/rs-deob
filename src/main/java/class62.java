import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class62 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lsb;")
    private static class98 field1034 = class47.method368("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", 0);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lsb;")
    public static class98 field1041 = class47.method368("settings=", 0);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lsb;")
    public static class98 field1032 = class47.method368(" loggt sich aus)3", 0);

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lsb;")
    public static class98 field1039 = field1034;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Lsb;")
    public static class98 field1044 = class47.method368(")1", 0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lbd;")
    public static class22 field1035;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
    public static int[] field1038;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1041 = null;
        if (arg0 != 2) {
            field1041 = null;
        }
        field1038 = null;
        field1034 = null;
        field1044 = null;
        field1032 = null;
        field1039 = null;
        field1035 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static final void method452(byte arg0) {
        for (int var1 = 0; var1 < class59.field961; var1++) {
            class93 var3 = class215.method1431(0, var1);
            if (var3 != null && var3.field1629 == 0) {
                class68.field1086[var1] = 0;
                class118.field2117[var1] = 0;
            }
        }
        int var2 = 56 / ((9 - arg0) / 51);
        field1040++;
        class85.field1505 = new class219(16);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public static final void method453(int arg0, int arg1, int arg2) {
        field1037++;
        int[] var3 = new int[4];
        var3[arg2] = arg1;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class202.field3451[var6] != arg1) {
                var3[var5] = class202.field3451[var6];
                var4[var5] = class43.field724[var6];
                var5++;
            }
        }
        class202.field3451 = var3;
        class43.field724 = var4;
        class71.method493((byte) -41, class229.field3947.length - 1, class229.field3947, 0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
    public static final int method454(int arg0, int arg1) {
        field1042++;
        if (arg0 != 14) {
            field1041 = null;
        }
        if (class76.field1355 == 1) {
            return 7;
        } else if (class76.field1355 == 2) {
            return 20;
        } else if (arg1 == 15) {
            return 13;
        } else if (arg1 == 16) {
            return 3;
        } else if (arg1 == 22) {
            return 8;
        } else if (arg1 == 31) {
            return 14;
        } else if (arg1 == 38) {
            return 2;
        } else if (arg1 == 43) {
            return 15;
        } else if (arg1 == 48) {
            return 17;
        } else if (arg1 == 58) {
            return 11;
        } else if (arg1 == 69) {
            return 6;
        } else if (arg1 == 74) {
            return 20;
        } else if (arg1 == 77) {
            return 1;
        } else if (arg1 == 101) {
            return 12;
        } else if (arg1 == 103) {
            return 19;
        } else if (arg1 == 152) {
            return 16;
        } else if (arg1 == 161) {
            return 4;
        } else if (arg1 == 162) {
            return 9;
        } else if (arg1 == 166) {
            return 10;
        } else if (arg1 == 179) {
            return 18;
        } else if (arg1 == 191) {
            return 5;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Lq;")
    public static final class148 method455(int arg0, int arg1) {
        if (arg0 != -854073200) {
            field1043 = 120;
        }
        field1033++;
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class33.field585[var3] == null || class33.field585[var3][var2] == null) {
            boolean var4 = class141.method1056(var3, (byte) -56);
            if (!var4) {
                return null;
            }
        }
        return class33.field585[var3][var2];
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
    public static final void method456(byte arg0) {
        if (class148.field2726 > class4.field42) {
            class4.field42 = (float) ((double) class4.field42 / 30.0D + (double) class4.field42);
            if (class4.field42 > class148.field2726) {
                class4.field42 = class148.field2726;
            }
            class225.method1553(arg0 ^ 0xFFFFFF91);
        } else if (class148.field2726 < class4.field42) {
            class4.field42 = (float) ((double) class4.field42 - (double) class4.field42 / 30.0D);
            if (class148.field2726 > class4.field42) {
                class4.field42 = class148.field2726;
            }
            class225.method1553(119);
        }
        field1030++;
        if (class192.field3354 != -1 && class70.field1121 != -1) {
            int var1 = class192.field3354 - class211.field3612;
            int var2 = class70.field1121 - class211.field3613;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class211.field3612 -= -var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class211.field3613 += var2;
            if (var1 == 0 && var2 == 0) {
                class192.field3354 = -1;
                class70.field1121 = -1;
            }
            class225.method1553(arg0 ^ 0xFFFFFF94);
        }
        if (arg0 != -43) {
            field1036 = -28;
        }
    }
}
