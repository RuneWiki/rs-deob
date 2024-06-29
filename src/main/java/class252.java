import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class252 {

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lib;")
    private class95 field4394 = new class95();

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lsf;")
    public static class108 field4387 = class140.method973(255, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lsf;")
    private static class108 field4386 = class140.method973(255, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lsf;")
    public static class108 field4391 = class140.method973(255, ")4j");

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lsf;")
    public static class108 field4397 = class140.method973(255, "(U (X");

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lsf;")
    public static class108 field4388 = class140.method973(255, "k");

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lsf;")
    public static class108 field4398 = class140.method973(255, "brillant3:");

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "[J")
    public static long[] field4399 = new long[1000];

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lsf;")
    public static class108 field4393 = field4386;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Lib;")
    private class95 field4403;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1777(boolean arg0) {
        field4399 = null;
        field4386 = null;
        field4393 = null;
        if (arg0) {
            return;
        }
        field4387 = null;
        field4397 = null;
        field4391 = null;
        field4388 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lib;", line = 46)
    public final class95 method1778(int arg0) {
        field4400++;
        class95 var2 = this.field4394.field1518;
        int var3 = 33 / ((arg0 + 94) / 32);
        if (this.field4394 == var2) {
            this.field4403 = null;
            return null;
        } else {
            this.field4403 = var2.field1518;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 78)
    public static final int method1779(int arg0, int arg1) {
        if (class14.field161 != null) {
            class14.field161.method1487(arg0 ^ 0x3629);
            class14.field161 = null;
        }
        if (arg0 != 16) {
            field4398 = (class108) null;
        }
        field4402++;
        class109.field1913++;
        if (class109.field1913 > 4) {
            class262.field4632 = 0;
            class109.field1913 = 0;
            return arg1;
        }
        class262.field4632 = 0;
        if (class69.field1081 == class206.field3703) {
            class206.field3703 = class160.field2881;
        } else {
            class206.field3703 = class69.field1081;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I", line = 114)
    public final int method1780(int arg0) {
        int var2 = 0;
        field4401++;
        if (arg0 != 16777215) {
            method1779(75, 2);
        }
        class95 var3 = this.field4394.field1518;
        while (this.field4394 != var3) {
            var3 = var3.field1518;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 136)
    public static final void method1781(int arg0) {
        field4404++;
        int var1 = class296.field5167;
        int var2 = class203.field3665;
        int var3 = class190.field3453;
        int var4 = class167.field2998;
        int var5 = 6116423;
        if (arg0 != 16776960) {
            field4391 = (class108) null;
        }
        if (class231.field4051) {
            class50.method348(var2, var1, var4, var3, var5);
            class50.method348(var2 + 1, var1 + 1, var4 - 2, 16, 0);
            class50.method353(var2 + 1, var1 - -18, var4 - 2, var3 - 19, 0);
        } else {
            class28.method193(var2, var1, var4, var3, var5);
            class28.method193(var2 + 1, var1 - -1, var4 - 2, 16, 0);
            class28.method183(var2 + 1, var1 + 18, var4 - 2, var3 - 19, 0);
        }
        class256.field4525.method520(class17.field209, var2 + 3, var1 + 14, var5, -1);
        int var6 = class171.field3116;
        int var7 = class317.field5456;
        for (int var8 = 0; var8 < class311.field5374; var8++) {
            int var9 = (class311.field5374 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var7 > var2 && var7 < (var2 + var4) && (var9 - 13) < var6 && (var9 + 3) > var6) {
                var10 = 16776960;
            }
            class256.field4525.method520(class210.method1453((byte) -128, var8), var2 + 3, var9, var10, 0);
        }
        class171.method1186(31962, class167.field2998, class190.field3453, class203.field3665, class296.field5167);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V", line = 207)
    public static final void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg1 - arg4;
        int var7 = arg2 - arg0;
        field4389++;
        if (var6 == 0) {
            if (var7 != 0) {
                class137.method944(32327, arg4, arg2, arg0, arg5);
            }
        } else if (var7 == 0) {
            class136.method932(arg0, arg4, arg1, arg5, (byte) -109);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            if (arg3 != 349598156) {
                field4386 = (class108) null;
            }
            int var10;
            int var11;
            if (class260.field4593 > arg4) {
                var10 = (class260.field4593 * var8 >> 12) + var9;
                var11 = class260.field4593;
            } else if (arg4 <= class79.field1202) {
                var10 = arg0;
                var11 = arg4;
            } else {
                var10 = var9 + (class79.field1202 * var8 >> 12);
                var11 = class79.field1202;
            }
            if (var10 < class266.field4677) {
                var11 = (class266.field4677 - var9 << 12) / var8;
                var10 = class266.field4677;
            } else if (class166.field2984 < var10) {
                var11 = (class166.field2984 - var9 << 12) / var8;
                var10 = class166.field2984;
            }
            int var12;
            int var13;
            if (arg1 < class260.field4593) {
                var12 = (class260.field4593 * var8 >> 12) + var9;
                var13 = class260.field4593;
            } else if (arg1 <= class79.field1202) {
                var12 = arg2;
                var13 = arg1;
            } else {
                var12 = (class79.field1202 * var8 >> 12) + var9;
                var13 = class79.field1202;
            }
            if (class266.field4677 > var12) {
                var13 = (class266.field4677 - var9 << 12) / var8;
                var12 = class266.field4677;
            } else if (class166.field2984 < var12) {
                var13 = (class166.field2984 - var9 << 12) / var8;
                var12 = class166.field2984;
            }
            class215.method1477(var10, (byte) 106, var11, arg5, var12, var13);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Lib;", line = 314)
    public final class95 method1783(int arg0) {
        field4392++;
        class95 var2 = this.field4403;
        if (arg0 != -27042) {
            field4398 = (class108) null;
        }
        if (this.field4394 == var2) {
            this.field4403 = null;
            return null;
        } else {
            this.field4403 = var2.field1518;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lib;Z)V", line = 335)
    public final void method1784(class95 arg0, boolean arg1) {
        field4395++;
        if (!arg1) {
            this.method1786(76);
        }
        if (arg0.field1522 != null) {
            arg0.method648(26562);
        }
        arg0.field1518 = this.field4394;
        arg0.field1522 = this.field4394.field1522;
        arg0.field1522.field1518 = arg0;
        arg0.field1518.field1522 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 361)
    public final void method1785(int arg0) {
        while (true) {
            class95 var2 = this.field4394.field1518;
            if (this.field4394 == var2) {
                if (arg0 != 0) {
                    this.method1786(-43);
                }
                this.field4403 = null;
                field4396++;
                return;
            }
            var2.method648(26562);
        }
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Lib;", line = 392)
    public final class95 method1786(int arg0) {
        if (arg0 != 5807) {
            field4388 = (class108) null;
        }
        field4390++;
        class95 var2 = this.field4394.field1518;
        if (this.field4394 == var2) {
            return null;
        } else {
            var2.method648(26562);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 413)
    public class252() {
        this.field4394.field1518 = this.field4394;
        this.field4394.field1522 = this.field4394;
    }
}
