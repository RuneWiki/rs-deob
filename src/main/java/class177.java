import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class177 {

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    private int field2708 = 32;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "Z")
    private boolean field2720 = false;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "J")
    private long field2692 = class195.method1322(127);

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    private int field2722 = 0;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "J")
    private long field2727 = 0L;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "Z")
    private boolean field2723 = true;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "[Lic;")
    private class176[] field2725 = new class176[8];

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    private int field2730 = 0;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    private int field2728 = 0;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "[Lic;")
    private class176[] field2731 = new class176[8];

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    private int field2733 = 0;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "J")
    private long field2732 = 0L;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2693 = " has logged in.";

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2712 = "Drop";

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field2713 = 0;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2700 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2718 = "purple:";

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "F")
    public static float field2701;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Lee;")
    public static class137 field2697;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "Lic;")
    private class176 field2717;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "Lng;")
    public static class245 field2719;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "[I")
    public int[] field2707;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1192(boolean arg0) {
        this.field2723 = true;
        if (arg0) {
            this.field2717 = (class176) null;
        }
        field2695++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 18)
    public final synchronized void method1193(byte arg0) {
        field2703++;
        this.field2723 = true;
        if (arg0 < 4) {
            return;
        }
        try {
            this.method1051();
        } catch (Exception var3) {
            this.method1052();
            this.field2727 = class195.method1322(126) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()I", line = 38)
    public int method1050() throws Exception {
        field2710++;
        return this.field2726;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I", line = 46)
    public static final int method1194(int arg0, int arg1) {
        field2691++;
        return arg0 == -16584 ? arg1 & 0xFF : -116;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 57)
    public void method1055(Component arg0) throws Exception {
        field2715++;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V", line = 66)
    public static void method1195(boolean arg0) {
        field2700 = null;
        field2718 = null;
        field2693 = null;
        field2697 = null;
        if (arg0) {
            field2712 = (String) null;
        }
        field2719 = null;
        field2712 = null;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()V", line = 81)
    public void method1051() throws Exception {
        field2709++;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V", line = 89)
    private final void method1196(int arg0, int arg1) {
        this.field2733 -= arg1;
        field2698++;
        if (this.field2733 < 0) {
            this.field2733 = 0;
        }
        if (arg0 == 29819 && this.field2717 != null) {
            this.field2717.method211(arg1);
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(II)V", line = 111)
    public static final void method1197(int arg0, int arg1) {
        class78.field1162.method1287(arg0, -48);
        field2694++;
        if (arg1 != 0) {
            method1198((short) 57, 26);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(SI)Z", line = 123)
    public static final boolean method1198(short arg0, int arg1) {
        field2705++;
        if (arg0 == 58 || arg0 == 29 || arg0 == 8 || arg0 == 18 || arg0 == 15 || arg0 == 12 || arg0 == 45 || arg0 == 31) {
            return true;
        } else if (arg0 == 7 || arg0 == 1 || arg0 == 1005 || arg0 == 1001) {
            return true;
        } else if (arg0 == 19 || arg0 == 20 || arg0 == 26 || arg0 == 5 || arg0 == 2) {
            return true;
        } else if (arg1 == 23904) {
            return arg0 == 11 || arg0 == 40 || arg0 == 48 || arg0 == 47 || arg0 == 17 || arg0 == 10;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V", line = 151)
    public final synchronized void method1199(byte arg0) {
        field2696++;
        if (this.field2720) {
            return;
        }
        long var2 = class195.method1322(122);
        try {
            if (var2 > (this.field2692 + 500000L)) {
                this.field2692 = var2 - 500000L;
            }
            while (var2 > (this.field2692 + 5000L)) {
                this.method1196(29819, 256);
                this.field2692 += (long) (256000 / class282.field4337);
            }
        } catch (Exception var10) {
            this.field2692 = var2;
        }
        if (this.field2707 == null) {
            return;
        }
        try {
            if (this.field2727 != 0L) {
                if (var2 < this.field2727) {
                    return;
                }
                this.method1054(this.field2726);
                this.field2727 = 0L;
                this.field2723 = true;
            }
            int var5 = this.method1050();
            int var6 = this.field2729 + this.field2721;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if (this.field2728 < this.field2730 - var5) {
                this.field2728 = this.field2730 - var5;
            }
            int var7 = -88 / ((-arg0 - 30) / 61);
            if (var6 + 256 > this.field2726) {
                var5 = 0;
                this.field2726 += 1024;
                if (this.field2726 > 16384) {
                    this.field2726 = 16384;
                }
                this.method1052();
                this.method1054(this.field2726);
                if (this.field2726 < var6 + 256) {
                    var6 = this.field2726 - 256;
                    this.field2721 = var6 - this.field2729;
                }
                this.field2723 = true;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method1205(this.field2707, 256);
                this.method1053();
            }
            if (this.field2732 < var2) {
                if (this.field2723) {
                    this.field2723 = false;
                } else if (this.field2728 == 0 && this.field2722 == 0) {
                    this.method1052();
                    this.field2727 = var2 + 2000L;
                    return;
                } else {
                    this.field2721 = Math.min(this.field2722, this.field2728);
                    this.field2722 = this.field2728;
                }
                this.field2728 = 0;
                this.field2732 = var2 + 2000L;
            }
            this.field2730 = var5;
        } catch (Exception var9) {
            this.method1052();
            this.field2727 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILic;)V", line = 271)
    public final synchronized void method1200(int arg0, class176 arg1) {
        field2724++;
        if (arg0 >= 72) {
            this.field2717 = arg1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()V", line = 285)
    public void method1052() {
        field2702++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIBI[Ljh;I)V", line = 292)
    public static final void method1201(boolean arg0, int arg1, byte arg2, int arg3, class207[] arg4, int arg5) {
        if (arg2 <= 55) {
            method1194(50, -83);
        }
        field2714++;
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class207 var7 = arg4[var6];
            if (var7 != null && var7.field3232 == arg1) {
                class322.method2180(arg3, var7, arg0, 5, arg5);
                class158.method1098(arg5, arg3, -22245, var7);
                if (var7.field3270 > (var7.field3187 - var7.field3239)) {
                    var7.field3270 = var7.field3187 - var7.field3239;
                }
                if (var7.field3245 > var7.field3153 - var7.field3169) {
                    var7.field3245 = var7.field3153 - var7.field3169;
                }
                if (var7.field3270 < 0) {
                    var7.field3270 = 0;
                }
                if (var7.field3245 < 0) {
                    var7.field3245 = 0;
                }
                if (var7.field3273 == 0) {
                    class342.method2386(arg0, var7, 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()V", line = 339)
    public void method1053() throws Exception {
        field2704++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 361)
    public final synchronized void method1202(int arg0) {
        field2706++;
        if (class64.field971 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class64.field971.field1955[var3] == this) {
                    class64.field971.field1955[var3] = null;
                }
                if (class64.field971.field1955[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class64.field971.field1952 = true;
                while (class64.field971.field1956) {
                    class96.method657(50L, (byte) -115);
                }
                class64.field971 = null;
            }
        }
        this.method1052();
        int var4 = 42 % ((arg0 + 19) / 57);
        this.field2707 = null;
        this.field2720 = true;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILic;)V", line = 410)
    private final void method1203(int arg0, int arg1, class176 arg2) {
        field2699++;
        if (arg1 != -7043) {
            method1204(26);
        }
        int var4 = arg0 >> 5;
        class176 var5 = this.field2725[var4];
        if (var5 == null) {
            this.field2731[var4] = arg2;
        } else {
            var5.field2690 = arg2;
        }
        this.field2725[var4] = arg2;
        arg2.field2688 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 435)
    public void method1054(int arg0) throws Exception {
        field2716++;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 450)
    public static final void method1204(int arg0) {
        int var1 = 0;
        if (arg0 != 104) {
            return;
        }
        field2711++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class222.method1488((byte) -52, var3, var2, true, class90.field1375, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([II)V", line = 486)
    private final void method1205(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class162.field2508) {
            var3 = arg1 << 1;
        }
        class223.method1498(arg0, 0, var3);
        this.field2733 -= arg1;
        if (this.field2717 != null && this.field2733 <= 0) {
            this.field2733 += class282.field4337 >> 4;
            class343.method2389(this.field2717, false);
            this.method1203(this.field2717.method1191(), -7043, this.field2717);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class176 var10 = null;
                        class176 var11 = this.field2731[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class209 var12 = var11.field2687;
                                if (var12 == null || var12.field3325 <= var8) {
                                    var11.field2689 = true;
                                    int var13 = var11.method216();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3325 += var13;
                                    }
                                    if (var4 >= this.field2708) {
                                        break label105;
                                    }
                                    class176 var14 = var11.method220();
                                    if (var14 != null) {
                                        int var15 = var11.field2688;
                                        while (var14 != null) {
                                            this.method1203(var15 * var14.method1191() >> 8, -7043, var14);
                                            var14 = var11.method213();
                                        }
                                    }
                                    class176 var16 = var11.field2690;
                                    var11.field2690 = null;
                                    if (var10 == null) {
                                        this.field2731[var7] = var16;
                                    } else {
                                        var10.field2690 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2725[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2690;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class176 var18 = this.field2731[var17];
                this.field2731[var17] = this.field2725[var17] = null;
                while (var18 != null) {
                    class176 var19 = var18.field2690;
                    var18.field2690 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2733 < 0) {
            this.field2733 = 0;
        }
        if (this.field2717 != null) {
            this.field2717.method217(arg0, 0, arg1);
        }
        this.field2692 = class195.method1322(118);
    }
}
