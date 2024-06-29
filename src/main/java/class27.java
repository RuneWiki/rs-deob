import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class27 extends class213 {

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Ldj;")
    public class43 field598;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lvd;")
    public static class222 field605 = class212.method1357(" loggt sich aus)3", 10731);

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lvd;")
    public static class222 field601 = class212.method1357("und die Schaltfl-=che (WSpielkonto erstellen(W am", 10731);

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Lje;")
    public static class102 field602;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ldj;)V")
    public class27(class43 arg0) {
        this.field598 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
    public static final int method228(byte arg0, int arg1) {
        field599++;
        int var2 = 76 / ((arg0 - 86) / 38);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
    public static final int method229(int arg0, int arg1) {
        field600++;
        if (arg0 == 16711935) {
            return -1;
        }
        if (arg1 != -185694960) {
            field601 = null;
        }
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var2;
        double var12 = 0.0D;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var4 < var2) {
            var6 = var4;
        }
        double var14 = 0.0D;
        if (var8 > var10) {
            var10 = var8;
        }
        if (var8 < var6) {
            var6 = var8;
        }
        double var16 = (var6 + var10) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var6 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var6) / (var6 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var6) / (-var10 + 2.0D + -var6);
            }
            if (var2 == var10) {
                var12 = (var4 - var8) / (-var6 + var10);
            } else if (var4 == var10) {
                var12 = (var8 - var2) / (-var6 + var10) + 2.0D;
            } else if (var8 == var10) {
                var12 = (var2 - var4) / (-var6 + var10) + 4.0D;
            }
        }
        int var19 = (int) (var14 * 256.0D);
        double var20 = var12 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var18 >> 1) + (var19 >> 5 << 7) + (var22 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIILe;JZ)V")
    public static final void method230(int arg0, int arg1, int arg2, int arg3, class44 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class5 var8 = new class5();
        var8.field90 = arg4;
        var8.field89 = arg1 * 128 + 64;
        var8.field86 = arg2 * 128 + 64;
        var8.field83 = arg3;
        var8.field84 = arg5;
        if (class204.field3800[arg0][arg1][arg2] == null) {
            class204.field3800[arg0][arg1][arg2] = new class121(arg0, arg1, arg2);
        }
        class204.field3800[arg0][arg1][arg2].field2300 = var8;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)I")
    public static final int method231(int arg0, int arg1) {
        field606++;
        if (arg1 > -61) {
            method228((byte) -37, 60);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)Z")
    public static final boolean method232(int arg0, int arg1) {
        field603++;
        if (class211.field3921[arg0]) {
            return true;
        } else if (class202.field3700.method41(0, arg0)) {
            int var2 = class202.field3700.method38(arg1 + 7759, arg0);
            if (var2 == 0) {
                class211.field3921[arg0] = true;
                return true;
            }
            if (arg1 != -7754) {
                field602 = null;
            }
            if (class220.field4066[arg0] == null) {
                class220.field4066[arg0] = new class13[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class220.field4066[arg0][var3] == null) {
                    byte[] var4 = class202.field3700.method33(arg1 ^ 0x6DE6, arg0, var3);
                    if (var4 != null) {
                        class220.field4066[arg0][var3] = new class13();
                        class220.field4066[arg0][var3].field269 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class220.field4066[arg0][var3].method117(new class109(var4), arg1 + 7881);
                        } else {
                            class220.field4066[arg0][var3].method107(new class109(var4), arg1 + 7758);
                        }
                    }
                }
            }
            class211.field3921[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIILe;Le;IIJ)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3, class44 arg4, class44 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class94 var10 = new class94();
        var10.field1767 = arg8;
        var10.field1761 = arg1 * 128 + 64;
        var10.field1763 = arg2 * 128 + 64;
        var10.field1758 = arg3;
        var10.field1764 = arg4;
        var10.field1771 = arg5;
        var10.field1762 = arg6;
        var10.field1760 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class204.field3800[var11][arg1][arg2] == null) {
                class204.field3800[var11][arg1][arg2] = new class121(var11, arg1, arg2);
            }
        }
        class204.field3800[arg0][arg1][arg2].field2306 = var10;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
    public static void method234(int arg0) {
        field601 = null;
        field602 = null;
        field605 = null;
        if (arg0 != -25380) {
            method229(106, -10);
        }
    }
}
