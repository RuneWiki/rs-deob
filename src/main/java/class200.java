import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class200 {

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    private int field3266 = 0;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public int field3264;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "[Lu;")
    public class66[] field3259;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Lui;")
    public static class210 field3251 = new class210(7, 0, 1, 1);

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "J")
    private long field3255;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "Ldd;")
    public static class654 field3265;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "Lu;")
    private class66 field3252;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "Lu;")
    private class66 field3267;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lpn;)V", line = 7)
    public static final void method1554(class692 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class203.field3310[var1]; var2++) {
                if (class20.field329[var1][var2] == arg0) {
                    class398.method2564(class20.field329[var1], var2 + 1, class20.field329[var1], var2, class203.field3310[var1] - var2 - 1);
                    var10002 = class203.field3310[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class124.field2052[var1]; var3++) {
                if (class321.field5016[var1][var3] == arg0) {
                    class398.method2564(class321.field5016[var1], var3 + 1, class321.field5016[var1], var3, class124.field2052[var1] - var3 - 1);
                    var10002 = class124.field2052[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class95.field1483[var1]; var4++) {
                if (class245.field3903[var1][var4] == arg0) {
                    class398.method2564(class245.field3903[var1], var4 + 1, class245.field3903[var1], var4, class95.field1483[var1] - var4 - 1);
                    var10002 = class95.field1483[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)I", line = 65)
    public final int method1555(int arg0) {
        field3262++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field3264; var3++) {
            class66 var4 = this.field3259[var3];
            for (class66 var5 = var4.field848; var5 != var4; var5 = var5.field848) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)Lu;", line = 93)
    public final class66 method1556(int arg0) {
        this.field3266 = 0;
        if (arg0 < 55) {
            this.method1562((byte) -71);
        }
        field3263++;
        return this.method1559(109);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 105)
    public static void method1557(byte arg0) {
        field3265 = null;
        if (arg0 > -31) {
            method1554(null);
        }
        field3251 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(JB)Lu;", line = 116)
    public final class66 method1558(long arg0, byte arg1) {
        if (arg1 != -93) {
            field3265 = null;
        }
        this.field3255 = arg0;
        field3254++;
        class66 var4 = this.field3259[(int) (arg0 & (long) (this.field3264 - 1))];
        for (this.field3252 = var4.field848; this.field3252 != var4; this.field3252 = this.field3252.field848) {
            if (this.field3252.field844 == arg0) {
                class66 var5 = this.field3252;
                this.field3252 = this.field3252.field848;
                return var5;
            }
        }
        this.field3252 = null;
        return null;
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)Lu;", line = 145)
    public final class66 method1559(int arg0) {
        field3258++;
        if (arg0 <= 56) {
            return null;
        } else if (this.field3266 <= 0 || this.field3259[this.field3266 - 1] == this.field3267) {
            while (this.field3266 < this.field3264) {
                class66 var3 = this.field3259[this.field3266++].field848;
                if (this.field3259[this.field3266 - 1] != var3) {
                    this.field3267 = var3.field848;
                    return var3;
                }
            }
            return null;
        } else {
            class66 var2 = this.field3267;
            this.field3267 = var2.field848;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V", line = 180)
    public static final void method1560(int arg0, int arg1) {
        field3261++;
        if (arg0 != 7) {
            field3268 = 26;
        }
        for (class66 var2 = class122.field2037.method1556(95); var2 != null; var2 = class122.field2037.method1559(59)) {
            if ((var2.field844 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method707((byte) -108);
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(B)I", line = 201)
    public final int method1561(byte arg0) {
        field3257++;
        int var2 = -11 % ((arg0 - 29) / 44);
        return this.field3264;
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(B)V", line = 213)
    public final void method1562(byte arg0) {
        field3248++;
        int var2 = 32 / ((48 - arg0) / 54);
        for (int var3 = 0; var3 < this.field3264; var3++) {
            class66 var4 = this.field3259[var3];
            while (true) {
                class66 var5 = var4.field848;
                if (var4 == var5) {
                    break;
                }
                var5.method707((byte) -54);
            }
        }
        this.field3252 = null;
        this.field3267 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "([Lu;I)I", line = 256)
    public final int method1563(class66[] arg0, int arg1) {
        if (arg1 != 1) {
            this.method1556(88);
        }
        field3256++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3264; var4++) {
            class66 var5 = this.field3259[var4];
            for (class66 var6 = var5.field848; var6 != var5; var6 = var6.field848) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(JLu;B)V", line = 287)
    public final void method1564(long arg0, class66 arg1, byte arg2) {
        field3249++;
        if (arg1.field853 != null) {
            arg1.method707((byte) -89);
        }
        class66 var5 = this.field3259[(int) (arg0 & (long) (this.field3264 - 1))];
        if (arg2 <= 71) {
            this.method1564(65L, null, (byte) -2);
        }
        arg1.field853 = var5.field853;
        arg1.field848 = var5;
        arg1.field853.field848 = arg1;
        arg1.field844 = arg0;
        arg1.field848.field853 = arg1;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(I)V", line = 318)
    public class200(int arg0) {
        this.field3264 = arg0;
        this.field3259 = new class66[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class66 var3 = this.field3259[var2] = new class66();
            var3.field853 = var3;
            var3.field848 = var3;
        }
    }

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "(B)Lu;", line = 341)
    public final class66 method1565(byte arg0) {
        field3253++;
        if (this.field3252 == null) {
            return null;
        }
        class66 var2 = this.field3259[(int) (this.field3255 & (long) (this.field3264 - 1))];
        if (arg0 != 44) {
            field3250 = 106;
        }
        while (this.field3252 != var2) {
            if (this.field3252.field844 == this.field3255) {
                class66 var3 = this.field3252;
                this.field3252 = this.field3252.field848;
                return var3;
            }
            this.field3252 = this.field3252.field848;
        }
        this.field3252 = null;
        return null;
    }
}
