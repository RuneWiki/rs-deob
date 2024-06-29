import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class133 extends class96 {

    @OriginalMember(owner = "client!ml", name = "Z", descriptor = "Lna;")
    private class26 field2034 = class5.field72;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "Lna;")
    public static class26 field2027 = class69.method505("T", (byte) -128);

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!ml", name = "ab", descriptor = "Z")
    public static boolean field2035 = true;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
    private int field2037;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "Lsc;")
    public class259 field2032;

    @OriginalMember(owner = "client!ml", name = "bb", descriptor = "Lsc;")
    private class259 field2036;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILwa;B)V", line = 8)
    private final void method895(int arg0, class82 arg1, byte arg2) {
        if (arg2 > -29) {
            field2019 = 70;
        }
        if (arg0 == 1) {
            this.field2030 = arg1.method642((byte) -47);
        } else if (arg0 == 2) {
            this.field2022 = arg1.method642((byte) -52);
        } else if (arg0 == 3) {
            this.field2034 = arg1.method615(true);
        } else if (arg0 == 4) {
            this.field2037 = arg1.method587(-502942936);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method576(1);
            this.field2032 = new class259(class313.method2175((byte) 94, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method587(-502942936);
                class147 var7;
                if (arg0 == 5) {
                    var7 = new class56(arg1.method615(true));
                } else {
                    var7 = new class188(arg1.method587(-502942936));
                }
                this.field2032.method1826(1, var7, (long) var6);
            }
        }
        field2020++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)Lna;", line = 67)
    public final class26 method896(int arg0, byte arg1) {
        int var3 = 10 / ((arg1 - 68) / 50);
        field2018++;
        if (this.field2032 == null) {
            return this.field2034;
        } else {
            class56 var4 = (class56) this.field2032.method1827((long) arg0, 0);
            return var4 == null ? this.field2034 : var4.field914;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Lna;I)Z", line = 85)
    public final boolean method897(class26 arg0, int arg1) {
        field2021++;
        if (this.field2032 == null) {
            return false;
        }
        if (arg1 != 8729) {
            this.method895(-97, (class82) null, (byte) -91);
        }
        if (this.field2036 == null) {
            this.method898(0);
        }
        for (class35 var3 = (class35) this.field2036.method1827(arg0.method169(23), arg1 - 8729); var3 != null; var3 = (class35) this.field2036.method1831(0)) {
            if (var3.field581.method159((byte) -42, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 116)
    private final void method898(int arg0) {
        field2028++;
        this.field2036 = new class259(this.field2032.method1832(81));
        class56 var2 = (class56) this.field2032.method1823(arg0 + 88);
        if (arg0 != 0) {
            return;
        }
        while (var2 != null) {
            class35 var3 = new class35(var2.field914, (int) var2.field2293);
            this.field2036.method1826(1, var3, var2.field914.method169(61));
            var2 = (class56) this.field2032.method1825(-99);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BILve;)[Lek;", line = 140)
    public static final class183[] method899(byte arg0, int arg1, class266 arg2) {
        field2029++;
        if (class141.method938((byte) -119, arg2, arg1)) {
            return arg0 <= 52 ? (class183[]) null : class299.method2108(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)I", line = 158)
    public final int method900(int arg0, int arg1) {
        field2017++;
        if (this.field2032 == null) {
            return this.field2037;
        } else {
            class188 var3 = (class188) this.field2032.method1827((long) arg1, arg0);
            return var3 == null ? this.field2037 : var3.field2961;
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(II)Z", line = 185)
    public final boolean method901(int arg0, int arg1) {
        field2026++;
        if (this.field2032 == null) {
            return false;
        }
        if (this.field2036 == null) {
            this.method902(109);
        }
        if (arg0 != -8143) {
            method899((byte) 68, -100, (class266) null);
        }
        class188 var3 = (class188) this.field2036.method1827((long) arg1, 0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 218)
    private final void method902(int arg0) {
        this.field2036 = new class259(this.field2032.method1832(93));
        int var2 = -48 % ((26 - arg0) / 58);
        for (class188 var3 = (class188) this.field2032.method1823(123); var3 != null; var3 = (class188) this.field2032.method1825(-88)) {
            class188 var4 = new class188((int) var3.field2293);
            this.field2036.method1826(1, var4, (long) var3.field2961);
        }
        field2033++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B[B)[B", line = 246)
    public static final byte[] method903(byte arg0, byte[] arg1) {
        field2031++;
        if (arg0 > -112) {
            method899((byte) 43, -121, (class266) null);
        }
        class82 var2 = new class82(arg1);
        int var3 = var2.method642((byte) -67);
        int var4 = var2.method587(-502942936);
        if (var4 < 0 || class222.field3521 != 0 && class222.field3521 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method603(0, var4, var5, (byte) 93);
            return var5;
        } else {
            int var6 = var2.method587(-502942936);
            if (var6 < 0 || class222.field3521 != 0 && class222.field3521 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class143.method953(var7, var6, arg1, var4, 9);
            } else {
                class47.field744.method2127(var7, var2, false);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 300)
    public static void method904(int arg0) {
        field2027 = null;
        if (arg0 != -1) {
            method903((byte) -86, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lwa;I)V", line = 310)
    public final void method905(class82 arg0, int arg1) {
        field2023++;
        while (true) {
            int var3 = arg0.method642((byte) -83);
            if (var3 == 0) {
                int var4 = 68 % ((-arg1 - 84) / 35);
                return;
            }
            this.method895(var3, arg0, (byte) -84);
        }
    }
}
