import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 {

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    private int field2161 = 0;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "[Ldc;")
    private class22[] field2153;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "Lva;")
    private static class121 field2143 = class107.method797("Too many connections from your address)3", -10983);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[Lva;")
    public static class121[] field2140 = new class121[100];

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lva;")
    public static class121 field2148 = field2143;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lva;")
    public static class121 field2154 = class107.method797(": ", -10983);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Li;")
    public static class48 field2151 = new class48(64);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "J")
    private long field2145;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Ldc;")
    private class22 field2152;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Ldc;")
    private class22 field2160;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lhb;")
    public static class44 field2146;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lhe;")
    public static class47 field2156;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
    public static int[] field2147;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method648(boolean arg0) {
        field2141++;
        class97 var1 = class69.field1628;
        synchronized (class69.field1628) {
            if (class26.field667 == class116.field2646) {
                return false;
            }
            class43.field991 = class35.field837[class116.field2646];
            class120.field2769 = class97.field2190[class116.field2646];
            if (arg0) {
                class116.field2646 = class116.field2646 + 1 & 0x7F;
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V", line = 45)
    public static final void method649(boolean arg0) {
        class92.field2096 = -1;
        class60.field1438 = -1;
        field2158++;
        class26.field654 = 0;
        class116.field2640 = -1;
        class5.field90 = 0;
        class60.field1437.field2507 = 0;
        class100.field2245 = arg0;
        class66.field1578.field2507 = 0;
        class41.field954 = 0;
        class57.field1329 = -1;
        class21.field560 = 0;
        class43.field988 = 0;
        class1.field8 = 0;
        class60.method437((byte) 67, 30);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Ldc;", line = 73)
    public final class22 method650(int arg0) {
        if (arg0 != -16430) {
            field2143 = null;
        }
        field2159++;
        if (this.field2152 == null) {
            return null;
        }
        class22 var2 = this.field2153[(int) (this.field2145 & (long) (this.field2150 - 1))];
        while (this.field2152 != var2) {
            if (this.field2152.field577 == this.field2145) {
                class22 var3 = this.field2152;
                this.field2152 = this.field2152.field579;
                return var3;
            }
            this.field2152 = this.field2152.field579;
        }
        this.field2152 = null;
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)Ldc;", line = 106)
    private final class22 method651(boolean arg0) {
        if (!arg0) {
            field2154 = null;
        }
        field2144++;
        if (this.field2161 > 0 && this.field2153[this.field2161 - 1] != this.field2160) {
            class22 var2 = this.field2160;
            this.field2160 = var2.field579;
            return var2;
        }
        while (this.field2150 > this.field2161) {
            class22 var3 = this.field2153[this.field2161++].field579;
            if (this.field2153[this.field2161 - 1] != var3) {
                this.field2160 = var3.field579;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Ldc;", line = 140)
    public final class22 method652(long arg0, int arg1) {
        field2137++;
        int var4 = -87 % ((-arg1 - 66) / 51);
        this.field2145 = arg0;
        class22 var5 = this.field2153[(int) ((long) (this.field2150 - 1) & arg0)];
        for (this.field2152 = var5.field579; this.field2152 != var5; this.field2152 = this.field2152.field579) {
            if (this.field2152.field577 == arg0) {
                class22 var6 = this.field2152;
                this.field2152 = this.field2152.field579;
                return var6;
            }
        }
        this.field2152 = null;
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Ldc;", line = 170)
    public final class22 method653(byte arg0) {
        field2157++;
        int var2 = -29 / ((-arg0 - 65) / 37);
        this.field2161 = 0;
        return this.method651(true);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLdc;J)V", line = 181)
    public final void method654(byte arg0, class22 arg1, long arg2) {
        if (arg1.field575 != null) {
            arg1.method187((byte) 39);
        }
        class22 var5 = this.field2153[(int) (arg2 & (long) (this.field2150 - 1))];
        field2136++;
        if (arg0 > -10) {
            method649(false);
        }
        arg1.field575 = var5.field575;
        arg1.field577 = arg2;
        arg1.field579 = var5;
        arg1.field575.field579 = arg1;
        arg1.field579.field575 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V", line = 219)
    public class96(int arg0) {
        this.field2153 = new class22[arg0];
        this.field2150 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class22 var3 = this.field2153[var2] = new class22();
            var3.field579 = var3;
            var3.field575 = var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 255)
    public static void method655(byte arg0) {
        field2148 = null;
        field2146 = null;
        field2151 = null;
        field2147 = null;
        field2140 = null;
        if (arg0 >= -2) {
            method648(true);
        }
        field2156 = null;
        field2154 = null;
        field2143 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V", line = 273)
    public static final void method656(int arg0, boolean arg1) {
        field2139++;
        class56.field1291++;
        if (class56.field1291 < 50 && !arg1) {
            return;
        }
        class56.field1291 = 0;
        if (!class75.field1723 && class119.field2740 != null) {
            class92.field2093++;
            class60.field1437.method622(139, true);
            try {
                class119.field2740.method296(class60.field1437.field2512, class60.field1437.field2507, 0, true);
                class60.field1437.field2507 = 0;
            } catch (IOException var2) {
                class75.field1723 = true;
            }
        }
        if (arg0 >= -37) {
            field2151 = null;
        }
    }
}
