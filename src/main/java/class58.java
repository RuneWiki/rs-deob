import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class58 extends class97 {

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    private int field1356 = -1;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "Z")
    private boolean field1365 = false;

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "Z")
    private volatile boolean field1370 = false;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "Lug;")
    private class186 field1362;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lug;")
    private class186 field1353;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lcd;")
    public static class23 field1360 = class54.method414(")1p", -1);

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lcd;")
    public static class23 field1363 = class54.method414("Keine Antwort vom Anmelde)2Server)3", -1);

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lkh;")
    public static class97 field1358;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "[Z")
    private volatile boolean[] field1357;

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lug;Lug;IZZZ)V")
    public class58(class186 arg0, class186 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1350 = arg2;
        this.field1362 = arg0;
        this.field1353 = arg1;
        this.field1365 = arg5;
        class184.method1133(this.field1350, 125, this);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(II)I")
    private final int method442(int arg0, int arg1) {
        if (arg1 < 6) {
            this.method445(false, 59, true, 17, (byte[]) null);
        }
        ++field1354;
        if (super.field2034[arg0] != null) {
            return 100;
        } else {
            return this.field1357[arg0] ? 100 : class162.method992((byte) 115, arg0, this.field1350);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)V")
    public final void method443(byte arg0, int arg1) {
        if (this.field1362 != null && this.field1357 != null && this.field1357[arg1]) {
            class163.method1003((byte) -125, arg1, this.field1362, this);
        } else {
            class161.method988(arg1, (byte) 2, 6116423, this.field1350, true, this, super.field2079[arg1]);
        }
        ++field1374;
        if (arg0 > -55) {
            this.method452(-37);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(III)V")
    public final void method444(int arg0, int arg1, int arg2) {
        ++field1364;
        if (arg0 >= -12) {
            this.method445(false, -112, false, -85, (byte[]) null);
        }
        this.field1369 = arg1;
        this.field1372 = arg2;
        if (this.field1353 != null) {
            class163.method1003((byte) 42, this.field1350, this.field1353, this);
        } else {
            class161.method988(this.field1350, (byte) 0, 6116423, 255, true, this, this.field1369);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZI[B)V")
    public final void method445(boolean arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        ++field1361;
        if (arg0) {
            if (this.field1370) {
                throw new RuntimeException();
            }
            if (this.field1353 != null) {
                class44.method349(this.field1350, arg4, this.field1353, (byte) -85);
            }
            this.method661(arg4, true);
            this.method446(98);
        } else {
            arg4[arg4.length + -2] = (byte) (super.field2054[arg1] >> 8);
            arg4[arg4.length + -1] = (byte) super.field2054[arg1];
            if (this.field1362 != null) {
                class44.method349(arg1, arg4, this.field1362, (byte) -85);
                this.field1357[arg1] = true;
            }
            if (arg2) {
                super.field2034[arg1] = class102.method674(arg3 + -2437, arg4, false);
            }
        }
        if (arg3 != -2) {
            this.method448(true, false, -103, (class186) null, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    private final void method446(int arg0) {
        this.field1357 = new boolean[super.field2034.length];
        ++field1352;
        int var2 = 0;
        if (arg0 >= 45) {
            while (var2 < this.field1357.length) {
                this.field1357[var2] = false;
                ++var2;
            }
            if (this.field1362 == null) {
                this.field1370 = true;
            } else {
                this.field1356 = -1;
                for (int var3 = 0; ~this.field1357.length < ~var3; ++var3) {
                    if (~super.field2082[var3] < -1) {
                        class17.method90(52, this, var3, this.field1362);
                        this.field1356 = var3;
                    }
                }
                if (this.field1356 == -1) {
                    this.field1370 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
    public final int method447(int arg0) {
        ++field1351;
        if (this.field1370) {
            return 100;
        } else if (super.field2034 != null) {
            return 99;
        } else {
            int var2 = class162.method992((byte) 51, this.field1350, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            if (arg0 != 100) {
                this.method442(31, 115);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZILug;[B)V")
    public final void method448(boolean arg0, boolean arg1, int arg2, class186 arg3, byte[] arg4) {
        ++field1373;
        if (this.field1353 == arg3) {
            if (this.field1370) {
                throw new RuntimeException();
            }
            if (arg4 == null) {
                class161.method988(this.field1350, (byte) 0, 6116423, 255, true, this, this.field1369);
                return;
            }
            class42.field891.reset();
            class42.field891.update(arg4, 0, arg4.length);
            int var6 = (int) class42.field891.getValue();
            class189 var7 = new class189(class131.method841(arg4, (byte) 76));
            int var8 = var7.method1202(127);
            if (var8 != 5 && var8 != 6) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
            }
            int var9 = 0;
            if (var8 >= 6) {
                var9 = var7.method1190(-4);
            }
            if (~this.field1369 != ~var6 || ~this.field1372 != ~var9) {
                class161.method988(this.field1350, (byte) 0, 6116423, 255, true, this, this.field1369);
                return;
            }
            this.method661(arg4, !arg0);
            this.method446(47);
        } else {
            if (!arg1 && this.field1356 == arg2) {
                this.field1370 = true;
            }
            if (arg4 == null || arg4.length <= 2) {
                this.field1357[arg2] = false;
                if (this.field1365 || arg1) {
                    class161.method988(arg2, (byte) 2, 6116423, this.field1350, arg1, this, super.field2079[arg2]);
                }
                return;
            }
            class42.field891.reset();
            class42.field891.update(arg4, 0, arg4.length + -2);
            int var10 = (int) class42.field891.getValue();
            int var11 = ((arg4[arg4.length + -2] & 255) << 8) + (arg4[arg4.length + -1] & 255);
            if (super.field2079[arg2] != var10 || super.field2054[arg2] != var11) {
                this.field1357[arg2] = false;
                if (this.field1365 || arg1) {
                    class161.method988(arg2, (byte) 2, 6116423, this.field1350, arg1, this, super.field2079[arg2]);
                }
                return;
            }
            this.field1357[arg2] = true;
            if (arg1) {
                super.field2034[arg2] = class102.method674(-2439, arg4, false);
            }
        }
        if (arg0) {
            field1363 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIZ)Lea;")
    public static final class38 method449(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field1355;
        long var6 = ((long) arg2 << 40) + ((long) arg0 << 38) + ((long) arg1 << 16) + (long) arg3;
        if (!arg5) {
            class38 var8 = (class38) class43.field909.method995(arg4 + 1663219624, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class63 var9 = class85.method565(arg3, (byte) -92);
        if (arg1 > 1 && var9.field1487 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; ++var11) {
                if (arg1 >= var9.field1461[var11] && var9.field1461[var11] != 0) {
                    var10 = var9.field1487[var11];
                }
            }
            if (var10 != -1) {
                var9 = class85.method565(var10, (byte) -108);
            }
        }
        class18 var12 = var9.method465(arg4 + 1663219546, 1);
        if (var12 == null) {
            return null;
        } else {
            class38 var13 = null;
            if (var9.field1470 != -1) {
                var13 = method449(1, 10, 0, var9.field1478, arg4, true);
                if (var13 == null) {
                    return null;
                }
            }
            if (arg4 != -1663219674) {
                return null;
            } else {
                int[] var14 = class196.field3871;
                int var15 = class196.field3872;
                int[] var16 = new int[4];
                int var17 = class196.field3868;
                class196.method1282(var16);
                class38 var18 = new class38(36, 32);
                class196.method1274(var18.field782, 36, 32);
                class196.method1269();
                class140.method888();
                class140.method889(16, 16);
                int var19 = var9.field1473;
                if (!arg5) {
                    if (~arg0 == -3) {
                        var19 = (int) ((double) var19 * 1.04D);
                    }
                } else {
                    var19 = (int) ((double) var19 * 1.5D);
                }
                class140.field2876 = false;
                int var20 = class140.field2891[var9.field1489] * var19 >> 16;
                int var21 = class140.field2878[var9.field1489] * var19 >> 16;
                var12.method122();
                var12.method115(0, var9.field1507, var9.field1455, var9.field1489, var9.field1504, var12.field3376 / 2 + var21 - -var9.field1482, var9.field1482 + var20);
                if (~arg0 <= -2) {
                    var18.method303(1);
                }
                if (~arg0 <= -3) {
                    var18.method303(16777215);
                }
                if (arg2 != 0) {
                    var18.method301(arg2);
                }
                class196.method1274(var18.field782, 36, 32);
                if (var9.field1470 != -1) {
                    var13.method315(0, 0);
                }
                if (!arg5 && (~var9.field1471 == -2 || arg1 != 1) && arg1 != -1) {
                    class7.field122.method291(class172.method1086(arg1, 1000000), 0, 9, 16776960, 1);
                }
                if (!arg5) {
                    class43.field909.method990(var18, var6, arg4 ^ 1663219626);
                }
                class196.method1274(var14, var15, var17);
                class196.method1279(var16);
                class140.method888();
                class140.field2876 = true;
                return var18;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public final void method450(int arg0, boolean arg1) {
        if (!arg1) {
            class63.method469(arg0, -128, this.field1350);
            ++field1366;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1360 = null;
        if (arg0 < 11) {
            field1349 = 26;
        }
        field1358 = null;
        field1363 = null;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)I")
    public final int method452(int arg0) {
        ++field1367;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 8272) {
            return 65;
        } else {
            for (int var4 = 0; ~super.field2034.length < ~var4; ++var4) {
                if (super.field2082[var4] > 0) {
                    var2 += 100;
                    var3 += this.method442(var4, arg0 + -8187);
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }
}
