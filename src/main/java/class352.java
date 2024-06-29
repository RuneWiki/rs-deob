import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class352 extends class154 {

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    private int field5622;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    private int field5630;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    private int field5625;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5626 = null;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field5629 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Ljava/lang/String;")
    public static String field5627 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIII)V", line = 6)
    public class352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5622 = arg2;
        this.field5630 = arg3;
        this.field5623 = arg0;
        this.field5625 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V", line = 22)
    public final void method1268(int arg0, int arg1, int arg2) {
        field5620++;
        if (arg1 <= 91) {
            this.method1268(-12, 89, 28);
        }
        int var4 = this.field5623 * arg0 >> 12;
        int var5 = this.field5622 * arg0 >> 12;
        int var6 = this.field5625 * arg2 >> 12;
        int var7 = this.field5630 * arg2 >> 12;
        class10.method105(this.field2497, (byte) -122, var6, var7, var4, var5, this.field2498);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2485(int arg0) {
        field5631++;
        if (class351.field5597 < class351.field5595) {
            class351.field5597 = (float) ((double) class351.field5597 / 30.0D + (double) class351.field5597);
            if (class351.field5597 > class351.field5595) {
                class351.field5597 = class351.field5595;
            }
            class71.method679((byte) -34);
        } else if (class351.field5597 > class351.field5595) {
            class351.field5597 = (float) ((double) class351.field5597 - (double) class351.field5597 / 30.0D);
            if (class351.field5595 > class351.field5597) {
                class351.field5597 = class351.field5595;
            }
            class71.method679((byte) -34);
        }
        if (class191.field3006 != arg0 && class36.field544 != -1) {
            int var1 = class191.field3006 - class335.field5120;
            int var2 = class36.field544 - class348.field5530;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class335.field5120 += var1;
            class348.field5530 += var2;
            if (var1 == 0 && var2 == 0) {
                class191.field3006 = -1;
                class36.field544 = -1;
            }
            class71.method679((byte) -34);
        }
        if (class300.field4664 <= 0) {
            class310.field4800 = -1;
            class155.field2503 = -1;
        } else {
            class332.field5098--;
            if (class332.field5098 == 0) {
                class300.field4664--;
                class332.field5098 = 100;
            }
        }
        if (!class327.field5038 || class128.field2131 == null) {
            return;
        }
        for (class255 var3 = (class255) class128.field2131.method2244((byte) -126); var3 != null; var3 = (class255) class128.field2131.method2241(-1)) {
            class181 var4 = class334.method2351(var3.field3928.field349, (byte) -79);
            if (class133.field2228 == 0 && var3.method1891(class78.field1129, class268.field4137, (byte) -108)) {
                if (!var3.field3928.field340) {
                    var3.field3928.field340 = true;
                    class197.method1497(var3.field3928.field349, var4.field2857, false, 15);
                }
                if (var3.field3928.field340) {
                    class197.method1497(var3.field3928.field349, var4.field2857, false, 17);
                }
            } else if (var3.field3928.field340) {
                var3.field3928.field340 = false;
                class197.method1497(var3.field3928.field349, var4.field2857, false, 16);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 149)
    public static void method2486(int arg0) {
        if (arg0 != 16777215) {
            field5627 = (String) null;
        }
        field5626 = null;
        field5627 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IBI)V", line = 160)
    public final void method1269(int arg0, byte arg1, int arg2) {
        field5628++;
        int var4 = this.field5623 * arg0 >> 12;
        int var5 = this.field5622 * arg0 >> 12;
        int var6 = this.field5625 * arg2 >> 12;
        int var7 = this.field5630 * arg2 >> 12;
        if (arg1 <= 37) {
            this.method1268(-75, 35, 80);
        }
        class106.method916(var7, var6, 91, this.field2498, var4, this.field2496, this.field2497, var5);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)V", line = 187)
    public final void method1265(int arg0, byte arg1, int arg2) {
        field5624++;
        int var4 = this.field5623 * arg0 >> 12;
        int var5 = this.field5625 * arg2 >> 12;
        int var6 = this.field5630 * arg2 >> 12;
        int var7 = this.field5622 * arg0 >> 12;
        int var8 = 12 / ((arg1 + 4) / 40);
        class58.method577(var5, var6, this.field2496, var4, var7, -115);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)V", line = 207)
    public static final void method2487(boolean arg0, int arg1) {
        field5619++;
        byte var2;
        byte[][] var3;
        if (class240.field3737 && arg0) {
            var2 = 1;
            var3 = class46.field738;
        } else {
            var3 = class22.field336;
            var2 = 4;
        }
        int var4 = 0;
        if (arg1 != 4) {
            field5621 = -34;
        }
        while (var2 > var4) {
            class102.method886(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class74.field1090[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = (var7 & 0xFFEA51) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class292.field4540.length; var13++) {
                                if (class292.field4540[var13] == var12 && var3[var13] != null) {
                                    class89.method801(arg0, var8, (var10 & 0x7) * 8, (var11 & 0x7) * 8, 2707, var6 * 8, var5 * 8, var4, var9, class57.field905, var3[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }
}
