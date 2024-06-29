import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class106 implements Runnable {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Z")
    public boolean field1922 = true;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field1927 = new Object();

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field1930 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
    public int[] field1932 = new int[500];

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[I")
    public int[] field1931 = new int[500];

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ltg;")
    public static class184 field1921 = class135.method812("sch-Utteln:", 3);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ltg;")
    public static class184 field1925 = class135.method812("<img=0>", 3);

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Ltg;")
    public static class184 field1929 = class135.method812("l", 3);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Ltg;")
    public static class184 field1926 = class135.method812("<col=80ff00>", 3);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static void method659(boolean arg0) {
        field1925 = null;
        if (!arg0) {
            field1921 = null;
            field1926 = null;
            field1929 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1922) {
            Object var1 = this.field1927;
            synchronized (this.field1927) {
                if (this.field1930 < 500) {
                    this.field1931[this.field1930] = class39.field736;
                    this.field1932[this.field1930] = class195.field3793;
                    this.field1930++;
                }
            }
            class151.method926((byte) 101, 50L);
        }
        field1928++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static final void method660() {
        int var0 = class19.field371[class126.field2264];
        class194[] var1 = class19.field358[class126.field2264];
        class135.field2464 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class194 var3 = var1[var2];
            if (var3.field3775 == 1) {
                int var4 = var3.field3758 + class69.field1323 - class21.field405;
                if (var4 >= 0 && var4 <= class69.field1323 + class69.field1323) {
                    int var5 = var3.field3756 + class69.field1323 - class208.field3999;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field3773 + class69.field1323 - class208.field3999;
                    if (var6 > class69.field1323 + class69.field1323) {
                        var6 = class69.field1323 + class69.field1323;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class176.field3364[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class138.field2506 - var3.field3772;
                        if (var8 > 32) {
                            var3.field3755 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field3755 = 2;
                            var8 = -var8;
                        }
                        var3.field3759 = (var3.field3771 - class209.field4011 << 8) / var8;
                        var3.field3753 = (var3.field3749 - class209.field4011 << 8) / var8;
                        var3.field3751 = (var3.field3752 - class101.field1864 << 8) / var8;
                        var3.field3748 = (var3.field3768 - class101.field1864 << 8) / var8;
                        class177.field3382[class135.field2464++] = var3;
                    }
                }
            } else if (var3.field3775 == 2) {
                int var9 = var3.field3756 + class69.field1323 - class208.field3999;
                if (var9 >= 0 && var9 <= class69.field1323 + class69.field1323) {
                    int var10 = var3.field3758 + class69.field1323 - class21.field405;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field3766 + class69.field1323 - class21.field405;
                    if (var11 > class69.field1323 + class69.field1323) {
                        var11 = class69.field1323 + class69.field1323;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class176.field3364[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class209.field4011 - var3.field3771;
                        if (var13 > 32) {
                            var3.field3755 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field3755 = 4;
                            var13 = -var13;
                        }
                        var3.field3761 = (var3.field3772 - class138.field2506 << 8) / var13;
                        var3.field3750 = (var3.field3762 - class138.field2506 << 8) / var13;
                        var3.field3751 = (var3.field3752 - class101.field1864 << 8) / var13;
                        var3.field3748 = (var3.field3768 - class101.field1864 << 8) / var13;
                        class177.field3382[class135.field2464++] = var3;
                    }
                }
            } else if (var3.field3775 == 4) {
                int var14 = var3.field3752 - class101.field1864;
                if (var14 > 128) {
                    int var15 = var3.field3756 + class69.field1323 - class208.field3999;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field3773 + class69.field1323 - class208.field3999;
                    if (var16 > class69.field1323 + class69.field1323) {
                        var16 = class69.field1323 + class69.field1323;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field3758 + class69.field1323 - class21.field405;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field3766 + class69.field1323 - class21.field405;
                        if (var18 > class69.field1323 + class69.field1323) {
                            var18 = class69.field1323 + class69.field1323;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class176.field3364[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field3755 = 5;
                            var3.field3761 = (var3.field3772 - class138.field2506 << 8) / var14;
                            var3.field3750 = (var3.field3762 - class138.field2506 << 8) / var14;
                            var3.field3759 = (var3.field3771 - class209.field4011 << 8) / var14;
                            var3.field3753 = (var3.field3749 - class209.field4011 << 8) / var14;
                            class177.field3382[class135.field2464++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method661(int arg0) {
        field1923++;
        if (arg0 != 31387) {
            return;
        }
        for (class186 var1 = (class186) class79.field1429.method404(false); var1 != null; var1 = (class186) class79.field1429.method414(-123)) {
            if (var1.field3595 > 0) {
                var1.field3595--;
            }
            if (var1.field3595 != 0) {
                if (var1.field3598 > 0) {
                    var1.field3598--;
                }
                if (var1.field3598 == 0 && var1.field3605 >= 1 && var1.field3600 >= 1 && var1.field3605 <= 102 && var1.field3600 <= 102 && (var1.field3594 < 0 || class10.method60(var1.field3594, var1.field3584, 4))) {
                    class17.method113(var1.field3605, var1.field3600, var1.field3584, var1.field3586, var1.field3594, var1.field3587, var1.field3592, false);
                    var1.field3598 = -1;
                    if (var1.field3594 == var1.field3588 && var1.field3588 == -1) {
                        var1.method797((byte) -102);
                    } else if (var1.field3594 == var1.field3588 && var1.field3586 == var1.field3585 && var1.field3604 == var1.field3584) {
                        var1.method797((byte) -114);
                    }
                }
            } else if (var1.field3588 < 0 || class10.method60(var1.field3588, var1.field3604, arg0 - 31383)) {
                class17.method113(var1.field3605, var1.field3600, var1.field3604, var1.field3585, var1.field3588, var1.field3587, var1.field3592, false);
                var1.method797((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method662(int arg0) {
        field1924++;
        class178.field3400.method770(false);
        if (arg0 != 11882) {
            method662(107);
        }
    }
}
