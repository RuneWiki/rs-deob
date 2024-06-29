import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class71 extends class36 {

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "Ljava/lang/String;")
    public static String field969 = "Please wait...";

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Ljava/lang/String;")
    public static String field968 = "Loading config - ";

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Ljava/lang/String;")
    public String field970;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "[C")
    public char[] field960;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "[C")
    public char[] field972;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[I")
    public int[] field959;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "[I")
    public int[] field961;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[[B")
    public static byte[][] field964;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BC)I", line = 9)
    public final int method515(byte arg0, char arg1) {
        field971++;
        if (this.field959 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = -46 / ((arg0 - 39) / 43);
        while (this.field959.length > var3) {
            if (this.field972[var3] == arg1) {
                return this.field959[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILcg;B)V", line = 31)
    private final void method516(int arg0, class316 arg1, byte arg2) {
        field963++;
        if (arg0 == 1) {
            this.field970 = arg1.method2158(-872702056);
        } else if (arg0 == 2) {
            int var7 = arg1.method2219(16448);
            this.field959 = new int[var7];
            this.field972 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field959[var8] = arg1.method2220((byte) 60);
                byte var9 = arg1.method2192(3);
                this.field972[var8] = var9 == 0 ? 0 : class266.method1807(var9, true);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method2219(16448);
            this.field961 = new int[var4];
            this.field960 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field961[var5] = arg1.method2220((byte) 113);
                byte var6 = arg1.method2192(3);
                this.field960[var5] = var6 == 0 ? 0 : class266.method1807(var6, true);
            }
        } else if (arg0 != 4) {
        }
        int var10 = -93 % ((41 - arg2) / 43);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V", line = 94)
    public static final void method517() {
        for (int var0 = 0; var0 < class342.field5127; var0++) {
            class280 var1 = class226.field3242[var0];
            class237.method1633(var1);
            class226.field3242[var0] = null;
        }
        class342.field5127 = 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lcg;B)V", line = 112)
    public final void method518(class316 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2219(16448);
            if (var3 == 0) {
                if (arg1 != -102) {
                    this.field970 = (String) null;
                }
                field967++;
                return;
            }
            this.method516(var3, arg0, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 130)
    public static final void method519(boolean arg0) {
        field957++;
        class176.method1219(-28376, false);
        System.gc();
        class189.method1325(1, 25);
        if (!arg0) {
            field964 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(BI)V", line = 149)
    public static final void method520(byte arg0, int arg1) {
        field973++;
        if (arg0 >= -94) {
            field964 = (byte[][]) ((byte[][]) null);
        }
        class113 var2 = (class113) class255.field3648.method111(11, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field1541.length; var3++) {
                var2.field1541[var3] = -1;
                var2.field1546[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(CI)I", line = 181)
    public final int method521(char arg0, int arg1) {
        field962++;
        if (arg1 <= 107) {
            return -23;
        } else if (this.field961 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field961.length; var3++) {
                if (this.field960[var3] == arg0) {
                    return this.field961[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V", line = 212)
    public static void method522(byte arg0) {
        field969 = null;
        field968 = null;
        if (arg0 == 54) {
            field964 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZII)V", line = 228)
    public static final void method523(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field965 = 65;
        }
        field974++;
        int var3 = class83.field1199 * arg1 >> 8;
        if (arg2 == -1 && !class31.field384) {
            class206.method1457((byte) 70);
        } else if (arg2 != -1 && (class231.field3272 != arg2 || !class33.method188(-128)) && var3 != 0 && !class31.field384) {
            class68.method503(0, (byte) -91, false, var3, arg2, 2, class173.field2349);
        }
        class231.field3272 = arg2;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V", line = 253)
    public final void method524(byte arg0) {
        field958++;
        if (arg0 != 9) {
            this.method524((byte) 25);
        }
        if (this.field961 != null) {
            for (int var2 = 0; var2 < this.field961.length; var2++) {
                this.field961[var2] = class190.method1334(this.field961[var2], 32768);
            }
        }
        if (this.field959 != null) {
            for (int var3 = 0; var3 < this.field959.length; var3++) {
                this.field959[var3] = class190.method1334(this.field959[var3], 32768);
            }
        }
    }
}
