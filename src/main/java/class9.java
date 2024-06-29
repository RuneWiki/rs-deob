import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 implements class24 {

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Z")
    private boolean field301 = false;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field285 = 50;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lfl;")
    private class192 field294;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "Lfl;")
    private class192 field314;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Lfd;")
    private class207 field310;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Lfd;")
    private class207 field309;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "[Z")
    private boolean[] field313;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "[Z")
    private boolean[] field315;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "[B")
    private byte[] field317;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[Z")
    private boolean[] field296;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[B")
    private byte[] field306;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[Z")
    private boolean[] field307;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "[B")
    private byte[] field303;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "[Z")
    private boolean[] field311;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[S")
    private short[] field284;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "[B")
    private byte[] field300;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[J")
    public static long[] field286 = new long[200];

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lvf;")
    public static class265 field293 = class87.method582(-46, "Hierhin gehen");

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
    public static boolean field292 = false;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lvf;")
    public static class265 field282 = class87.method582(-46, "welle2:");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lvf;")
    public static class265 field287 = class87.method582(-46, "_labels");

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Lvf;")
    public static class265 field305 = null;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)Z")
    public final boolean method58(int arg0, byte arg1) {
        if (arg1 != -14) {
            this.method69(true, 44);
        }
        field316++;
        return this.field301 || this.field296[arg0];
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)Z")
    public final boolean method59(int arg0, int arg1) {
        field295++;
        int var3 = -26 / ((30 - arg1) / 62);
        return this.field313[arg0];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        field283++;
        this.field310.method1416(-2136869688);
        if (arg0 > -64) {
            this.field317 = null;
        }
        if (this.field309 != null) {
            this.field309.method1416(-2136869688);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BJ)V")
    public static final void method61(byte arg0, long arg1) {
        if (arg0 != -11) {
            return;
        }
        field291++;
        if (arg1 == 0L) {
            return;
        }
        if (class262.field4582 >= 100) {
            class259.method1725(-93, class230.field4065, 0, class4.field66);
            return;
        }
        class265 var3 = class103.method691(arg1, arg0 ^ 0xFFFFA736).method1765(true);
        for (int var4 = 0; var4 < class262.field4582; var4++) {
            if (class4.field55[var4] == arg1) {
                class259.method1725(-82, class148.method1022(arg0 + 21, new class265[] { var3, class68.field1291 }), 0, class4.field66);
                return;
            }
        }
        for (int var5 = 0; var5 < class89.field1603; var5++) {
            if (field286[var5] == arg1) {
                class259.method1725(-60, class148.method1022(10, new class265[] { class55.field1126, var3, class45.field1013 }), 0, class4.field66);
                return;
            }
        }
        if (var3.method1776((byte) -127, class214.field3827.field2163)) {
            class259.method1725(arg0 ^ 0x65, class261.field4523, 0, class4.field66);
            return;
        }
        class4.field55[class262.field4582] = arg1;
        class110.field1928[class262.field4582++] = class103.method691(arg1, 22723);
        class7.field248++;
        class242.field4231 = class135.field2455;
        class55.field1133.method1863(true, 71);
        class55.field1133.method911(0, arg1);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
    public static final int method62(int arg0) {
        int var1 = -69 / ((-arg0 - 63) / 36);
        field297++;
        return class70.field1321.method1889((byte) 114);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)Z")
    public final boolean method63(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method72(20, 127);
        }
        field290++;
        return this.field307[arg1];
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)I")
    public final int method64(int arg0, int arg1) {
        field288++;
        if (arg0 > -48) {
            this.field296 = null;
        }
        return this.field284[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static void method65(int arg0) {
        field282 = null;
        field287 = null;
        field305 = null;
        int var1 = -93 / ((arg0 - 11) / 62);
        field293 = null;
        field286 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        field304++;
        class102 var3 = this.method70(-59, arg0);
        int var4 = 32 % ((arg1 + 42) / 42);
        return var3 == null ? null : var3.method681(-63, this.field314, this, this.field301 || this.field296[arg0]);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ldk;IIIII)V")
    public static final void method67(class179 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class64.field1244 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class2.field40) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class263.field4588 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class137 var14 = class200.field3577[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class279.field4936[var11][var12 + 1][var13] + class279.field4936[var11][var12][var13] + class279.field4936[var11][var12][var13 + 1] + class279.field4936[var11][var12 + 1][var13 + 1]) / 4 - (class279.field4936[arg1][arg2 + 1][arg3] + class279.field4936[arg1][arg2][arg3] + class279.field4936[arg1][arg2][arg3 + 1] + class279.field4936[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class144 var16 = var14.field2518;
                                    if (var16 != null) {
                                        if (var16.field2682.method165()) {
                                            arg0.method151(var16.field2682, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2694 != null && var16.field2694.method165()) {
                                            arg0.method151(var16.field2694, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2502; var17++) {
                                        class146 var18 = var14.field2506[var17];
                                        if (var18 != null && var18.field2737.method165() && (var18.field2728 == var12 || var7 == var12) && (var18.field2719 == var13 || var9 == var13)) {
                                            int var19 = var18.field2733 + 1 - var18.field2728;
                                            int var20 = var18.field2721 + 1 - var18.field2719;
                                            arg0.method151(var18.field2737, (var18.field2728 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2719 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public final boolean method68(int arg0, int arg1) {
        if (arg1 != 7164) {
            this.method72(64, -98);
        }
        field308++;
        class102 var3 = this.method70(-127, arg0);
        return var3 == null ? false : var3.method685(this, -89, this.field314);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
    public final void method69(boolean arg0, int arg1) {
        if (arg1 != -609) {
            this.method66(107, (byte) 16);
        }
        this.field301 = arg0;
        field299++;
        this.method60((byte) -81);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(II)Lhd;")
    private final class102 method70(int arg0, int arg1) {
        class102 var3 = (class102) this.field310.method1424((long) arg1, (byte) 98);
        field302++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field294.method1332(true, 0, arg1);
        if (var4 == null) {
            return null;
        } else if (arg0 > -16) {
            return null;
        } else {
            class135 var5 = new class135(var4);
            class102 var6 = new class102(var5);
            this.field310.method1419(0, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IFI)[I")
    public final int[] method71(int arg0, float arg1, int arg2) {
        class102 var4 = this.method70(-99, arg0);
        field298++;
        if (var4 == null) {
            return null;
        } else {
            var4.field1808 = true;
            return arg2 == 1 ? var4.method687(this, this.field314, this.field301 || this.field296[arg0], (byte) 31, arg1) : null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(II)V")
    public final void method72(int arg0, int arg1) {
        for (class102 var3 = (class102) this.field310.method1418((byte) -57); var3 != null; var3 = (class102) this.field310.method1422(-89)) {
            if (var3.field1808) {
                var3.method686((byte) 76, arg1);
                var3.field1808 = false;
            }
        }
        field289++;
        if (arg0 != -18085) {
            this.field300 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lfl;Lfl;Lfl;IZ)V")
    public class9(class192 arg0, class192 arg1, class192 arg2, int arg3, boolean arg4) {
        this.field294 = arg0;
        this.field301 = arg4;
        this.field314 = arg2;
        this.field285 = arg3;
        this.field310 = new class207(this.field285);
        this.field309 = null;
        class135 var6 = new class135(arg1.method1332(true, 0, 0));
        int var7 = var6.method927(125);
        this.field313 = new boolean[var7];
        this.field315 = new boolean[var7];
        this.field317 = new byte[var7];
        this.field296 = new boolean[var7];
        this.field306 = new byte[var7];
        this.field307 = new boolean[var7];
        this.field303 = new byte[var7];
        this.field311 = new boolean[var7];
        this.field284 = new short[var7];
        this.field300 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field315[var8] = var6.method920((byte) 113) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field315[var9]) {
                this.field307[var9] = var6.method920((byte) 48) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field315[var10]) {
                this.field313[var10] = var6.method920((byte) 121) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field315[var11]) {
                this.field296[var11] = var6.method920((byte) 111) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field315[var12]) {
                this.field311[var12] = var6.method920((byte) 94) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field315[var13]) {
                this.field300[var13] = var6.method929((byte) -3);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field315[var14]) {
                this.field303[var14] = var6.method929((byte) -3);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field315[var15]) {
                this.field306[var15] = var6.method929((byte) -3);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field315[var16]) {
                this.field317[var16] = var6.method929((byte) -3);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field315[var17]) {
                this.field284[var17] = (short) var6.method927(127);
            }
        }
    }
}
