import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class398 {

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lnr;")
    public class97 field5946 = new class97();

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Ljg;")
    public static class241 field5938 = new class241(256);

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field5948 = -1;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lpf;")
    public static class425 field5944 = new class425(42, 7);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Liq;")
    public static class134 field5950;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Lnr;")
    private class97 field5955;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ldr;Lla;IIIII)V")
    public static final void method2501(class261 arg0, class269 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class56.field750 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class275.field4206) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class265.field4044 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class13 var15 = class277.field4216[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class307.field4638[var12].method92(var13, var14) + class307.field4638[var12].method92(var13 + 1, var14) + class307.field4638[var12].method92(var13, var14 + 1) + class307.field4638[var12].method92(var13 + 1, var14 + 1)) / 4 - (class307.field4638[arg2].method92(arg3, arg4) + class307.field4638[arg2].method92(arg3 + 1, arg4) + class307.field4638[arg2].method92(arg3, arg4 + 1) + class307.field4638[arg2].method92(arg3 + 1, arg4 + 1)) / 4;
                                    class233 var17 = var15.field167;
                                    class233 var18 = var15.field163;
                                    if (var17 != null && var17.method112(true)) {
                                        arg1.method117(var7, 0, var17, (var13 - arg3) * class26.field337 + (1 - arg5) * class267.field4058, var16, (var14 - arg4) * class26.field337 + (1 - arg6) * class267.field4058, arg0);
                                    }
                                    if (var18 != null && var18.method112(true)) {
                                        arg1.method117(var7, 0, var18, (var13 - arg3) * class26.field337 + (1 - arg5) * class267.field4058, var16, (var14 - arg4) * class26.field337 + (1 - arg6) * class267.field4058, arg0);
                                    }
                                    for (class466 var19 = var15.field151; var19 != null; var19 = var19.field6853) {
                                        class141 var20 = var19.field6862;
                                        if (var20 != null && var20.method112(true) && (var20.field1895 == var13 || var8 == var13) && (var20.field1901 == var14 || var10 == var14)) {
                                            int var21 = var20.field1890 + 1 - var20.field1895;
                                            int var22 = var20.field1889 + 1 - var20.field1901;
                                            arg1.method117(var7, 0, var20, (var20.field1895 - arg3) * class26.field337 + (var21 - arg5) * class267.field4058, var16, (var20.field1901 - arg4) * class26.field337 + (var22 - arg6) * class267.field4058, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)I")
    public final int method2502(int arg0) {
        field5947++;
        int var2 = 0;
        int var3 = -111 % ((arg0 - 30) / 59);
        for (class97 var4 = this.field5946.field1331; var4 != this.field5946; var4 = var4.field1331) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V")
    public static final void method2503(int arg0, byte arg1, int arg2) {
        field5940++;
        class353 var3 = class450.method2772((byte) -99, arg2);
        int var4 = var3.field5218;
        int var5 = var3.field5216;
        int var6 = var3.field5217;
        int var7 = class363.field5349[var6 - var5];
        if (arg1 > -119) {
            field5944 = null;
        }
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class277.method1713(arg0 << var5 & var8 | class287.field4375[var4] & ~var8, (byte) -75, var4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILnr;)V")
    public final void method2504(int arg0, class97 arg1) {
        field5939++;
        if (arg1.field1336 != null) {
            arg1.method625((byte) -50);
        }
        if (arg0 == 42) {
            arg1.field1331 = this.field5946;
            arg1.field1336 = this.field5946.field1336;
            arg1.field1336.field1331 = arg1;
            arg1.field1331.field1336 = arg1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;I)V")
    public final void method2505(class398 arg0, int arg1) {
        if (arg1 != 25778) {
            this.method2512((byte) 50);
        }
        this.method2507(arg0, (byte) -16, this.field5946.field1331);
        field5953++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Z")
    public final boolean method2506(boolean arg0) {
        field5937++;
        if (arg0) {
            this.method2505((class398) null, -36);
        }
        return this.field5946.field1331 == this.field5946;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lsf;BLnr;)V")
    private final void method2507(class398 arg0, byte arg1, class97 arg2) {
        field5935++;
        class97 var4 = this.field5946.field1336;
        this.field5946.field1336 = arg2.field1336;
        arg2.field1336.field1331 = this.field5946;
        if (arg1 != -16) {
            this.field5955 = null;
        }
        if (this.field5946 != arg2) {
            arg2.field1336 = arg0.field5946.field1336;
            arg2.field1336.field1331 = arg2;
            arg0.field5946.field1336 = var4;
            var4.field1331 = arg0.field5946;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method2508(int arg0, int arg1) {
        if (arg0 <= 77) {
            field5944 = null;
        }
        class241 var2 = class189.field2838;
        synchronized (class189.field2838) {
            class189.field2838.method1481(3, arg1);
        }
        field5951++;
        class241 var3 = class338.field5048;
        synchronized (class338.field5048) {
            class338.field5048.method1481(3, arg1);
        }
        class241 var4 = class427.field6289;
        synchronized (class427.field6289) {
            class427.field6289.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Lnr;")
    public final class97 method2509(boolean arg0) {
        field5954++;
        if (arg0) {
            field5950 = null;
        }
        class97 var2 = this.field5946.field1331;
        if (this.field5946 == var2) {
            return null;
        } else {
            var2.method625((byte) -50);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method2510(byte arg0) {
        field5938 = null;
        if (arg0 != 7) {
            method2503(15, (byte) -51, 66);
        }
        field5950 = null;
        field5944 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lnr;")
    public final class97 method2511(int arg0) {
        field5941++;
        class97 var2 = this.field5955;
        if (this.field5946 == var2) {
            this.field5955 = null;
            return null;
        } else {
            int var3 = -25 / ((arg0 + 42) / 62);
            this.field5955 = var2.field1331;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public final void method2512(byte arg0) {
        field5952++;
        while (true) {
            class97 var2 = this.field5946.field1331;
            if (this.field5946 == var2) {
                if (arg0 != 4) {
                    method2501((class261) null, (class269) null, 123, -41, 12, 36, 79);
                }
                this.field5955 = null;
                return;
            }
            var2.method625((byte) -50);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLnr;)V")
    public final void method2513(byte arg0, class97 arg1) {
        field5936++;
        if (arg1.field1336 != null) {
            arg1.method625((byte) -50);
        }
        arg1.field1336 = this.field5946;
        if (arg0 != 89) {
            field5944 = null;
        }
        arg1.field1331 = this.field5946.field1331;
        arg1.field1336.field1331 = arg1;
        arg1.field1331.field1336 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Lnr;")
    public final class97 method2514(byte arg0) {
        field5945++;
        class97 var2 = this.field5946.field1331;
        if (this.field5946 == var2) {
            this.field5955 = null;
            return null;
        } else if (arg0 == 61) {
            this.field5955 = var2.field1331;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Lnr;")
    public final class97 method2515(int arg0) {
        field5943++;
        if (arg0 != 63) {
            return null;
        }
        class97 var2 = this.field5946.field1336;
        if (this.field5946 == var2) {
            this.field5955 = null;
            return null;
        } else {
            this.field5955 = var2.field1336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lnr;")
    public final class97 method2516(int arg0) {
        if (arg0 != -1) {
            field5938 = null;
        }
        field5949++;
        class97 var2 = this.field5955;
        if (this.field5946 == var2) {
            this.field5955 = null;
            return null;
        } else {
            this.field5955 = var2.field1336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BB)C")
    public static final char method2517(byte arg0, byte arg1) {
        field5942++;
        int var2 = -111 % ((-arg1 - 53) / 33);
        int var3 = arg0 & 0xFF;
        if (var3 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var3, 16) + " provided");
        }
        if (var3 >= 128 && var3 < 160) {
            char var4 = class112.field1477[var3 - 128];
            if (var4 == '\u0000') {
                var4 = '?';
            }
            var3 = var4;
        }
        return (char) var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILfh;I)V")
    public static final void method2518(int arg0, int arg1, class170 arg2, int arg3) {
        if (arg0 != 1) {
            method2510((byte) -17);
        }
        class167.field2384 = arg3;
        class426.field6264 = arg2;
        field5934++;
        class99.field1364 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class398() {
        this.field5946.field1331 = this.field5946;
        this.field5946.field1336 = this.field5946;
    }
}
