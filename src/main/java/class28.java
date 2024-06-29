import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class28 extends class171 {

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Z")
    public static boolean field428 = false;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Lqd;")
    public static class208 field434;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
    public static int[] field419;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[Lga;")
    public static class186[] field433;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZI)V", line = 12)
    public final void method236(int arg0, boolean arg1, int arg2) {
        int var4 = this.field429 * arg0 >> 12;
        field427++;
        int var5 = this.field432 * arg0 >> 12;
        int var6 = this.field431 * arg2 >> 12;
        int var7 = this.field425 * arg2 >> 12;
        if (!arg1) {
            field433 = (class186[]) null;
        }
        class213.method1449(var4, var5, this.field2672, var7, (byte) 92, var6, this.field2663);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJ)V", line = 44)
    public static final void method237(int arg0, long arg1) {
        field416++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class339.field5458 < 100 || class59.field900) || class339.field5458 >= 200) {
            class147.method1047(false, class190.field2955, "", 0);
            return;
        }
        String var3 = class322.method2314(arg1, true);
        for (int var4 = 0; var4 < class339.field5458; var4++) {
            if (class328.field5374[var4] == arg1) {
                class147.method1047(false, var3 + class219.field3372, "", 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class265.field4361; var5++) {
            if (class76.field1144[var5] == arg1) {
                class147.method1047(false, class178.field2778 + var3 + class99.field1439, "", 0);
                return;
            }
        }
        if (var3.equals(class329.field5388.field597)) {
            class147.method1047(false, class209.field3187, "", 0);
            return;
        }
        class261.field4108++;
        class31.field476[class339.field5458] = var3;
        class328.field5374[class339.field5458] = arg1;
        class248.field3931[class339.field5458] = 0;
        class236.field3736[class339.field5458] = "";
        if (arg0 != -10582) {
            return;
        }
        class21.field260[class339.field5458] = 0;
        class296.field4909[class339.field5458] = false;
        class339.field5458++;
        class246.field3916 = class12.field157;
        class195.field2992.method250(21066, 37);
        class195.field2992.method2228(arg1, true);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V", line = 121)
    public static final void method238(int arg0, boolean arg1) {
        field422++;
        if (arg0 != -7) {
            return;
        }
        class190.method1316(arg0 ^ 0x7D);
        if (class346.field5553 != 30 && class346.field5553 != 25) {
            return;
        }
        class124.field1840++;
        if (class124.field1840 < 50 && !arg1) {
            return;
        }
        class124.field1840 = 0;
        if (!class32.field489 && class346.field5545 != null) {
            class195.field2992.method250(21066, 71);
            try {
                class346.field5545.method669(0, class195.field2992.field5124, class195.field2992.field5137, (byte) -81);
                class195.field2992.field5137 = 0;
            } catch (IOException var3) {
                class32.field489 = true;
            }
            class123.field1824++;
        }
        class190.method1316(arg0 - 121);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lnm;Lnm;I)I", line = 159)
    public static final int method239(class221 arg0, class221 arg1, int arg2) {
        field417++;
        int var3 = arg2;
        if (arg0.method1519(false, class358.field5675)) {
            var3 = arg2 + 1;
        }
        if (arg0.method1519(false, class181.field2821)) {
            var3++;
        }
        if (arg0.method1519(false, class147.field2373)) {
            var3++;
        }
        if (arg1.method1519(false, class358.field5675)) {
            var3++;
        }
        if (arg1.method1519(false, class181.field2821)) {
            var3++;
        }
        if (arg1.method1519(false, class147.field2373)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)Z", line = 196)
    public static final boolean method240(byte arg0) {
        field430++;
        if (arg0 != 29) {
            method239((class221) null, (class221) null, -46);
        }
        if (class5.field60) {
            try {
                return !(Boolean) class73.method499(48, "showingVideoAd", class96.field1382.field4515);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIIII)V", line = 215)
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field429 = arg0;
        this.field425 = arg3;
        this.field432 = arg2;
        this.field431 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 227)
    public static void method241(int arg0) {
        field434 = null;
        field419 = null;
        if (arg0 > -103) {
            field419 = (int[]) null;
        }
        field433 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIB)V", line = 241)
    public final void method242(int arg0, int arg1, byte arg2) {
        field421++;
        int var4 = this.field429 * arg1 >> 12;
        int var5 = this.field431 * arg0 >> 12;
        int var6 = this.field425 * arg0 >> 12;
        int var7 = this.field432 * arg1 >> 12;
        class45.method344(var7, var5, this.field2663, var4, this.field2667, var6, this.field2672, -1);
        if (arg2 > -105) {
            field419 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIB)V", line = 258)
    public static final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field426++;
        if (arg1 >= 0 && arg4 >= 0 && arg1 < 103 && arg4 < 103) {
            if (arg5 == 0) {
                class257 var8 = class216.method1466(arg2, arg1, arg4);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field4069 >>> 32);
                    if (arg3 == 2) {
                        var8.field4070 = new class263(var9, 2, arg0 + 4, arg2, arg1, arg4, arg6, false, var8.field4070);
                        var8.field4059 = new class263(var9, 2, arg0 + 1 & 0x3, arg2, arg1, arg4, arg6, false, var8.field4059);
                    } else {
                        var8.field4070 = new class263(var9, arg3, arg0, arg2, arg1, arg4, arg6, false, var8.field4070);
                    }
                }
            }
            if (arg5 == 1) {
                class206 var10 = class84.method553(arg2, arg1, arg4);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field3128 >>> 32);
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field3136 = new class263(var11, 4, arg0, arg2, arg1, arg4, arg6, false, var10.field3136);
                    } else if (arg3 == 6) {
                        var10.field3136 = new class263(var11, 4, arg0 + 4, arg2, arg1, arg4, arg6, false, var10.field3136);
                    } else if (arg3 == 7) {
                        var10.field3136 = new class263(var11, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg4, arg6, false, var10.field3136);
                    } else if (arg3 == 8) {
                        var10.field3136 = new class263(var11, 4, arg0 + 4, arg2, arg1, arg4, arg6, false, var10.field3136);
                        var10.field3141 = new class263(var11, 4, (arg0 + 2 & 0x3) + 4, arg2, arg1, arg4, arg6, false, var10.field3141);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 11) {
                    arg3 = 10;
                }
                class258 var12 = class161.method1139(arg2, arg1, arg4);
                if (var12 != null) {
                    var12.field4071 = new class263((int) (var12.field4076 >>> 32) & Integer.MAX_VALUE, arg3, arg0, arg2, arg1, arg4, arg6, false, var12.field4071);
                }
            }
            if (arg5 == 3) {
                class86 var13 = class215.method1458(arg2, arg1, arg4);
                if (var13 != null) {
                    var13.field1235 = new class263((int) (var13.field1237 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg2, arg1, arg4, arg6, false, var13.field1235);
                }
            }
        }
        if (arg7 != -120) {
            method238(-123, true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBI)V", line = 350)
    public final void method244(int arg0, byte arg1, int arg2) {
        int var4 = this.field429 * arg2 >> 12;
        field418++;
        int var5 = this.field432 * arg2 >> 12;
        int var6 = this.field431 * arg0 >> 12;
        int var7 = this.field425 * arg0 >> 12;
        class61.method444(this.field2667, var5, var4, true, var6, var7);
        if (arg1 < 93) {
            this.field429 = -86;
        }
    }
}
