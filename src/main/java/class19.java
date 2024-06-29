import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 extends class105 {

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lnd;")
    public class122 field317 = new class122();

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Lse;")
    public class168 field325 = new class168();

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lqh;")
    private class153 field316;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field312 = 50;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Lkb;")
    public static class93 field322 = class76.method390("Benutzeroberfl-=che geladen)3", 0);

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "()Lle;")
    public final class105 method109() {
        field314++;
        class172 var1;
        do {
            var1 = (class172) this.field317.method695(512);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3401 == null);
        return var1.field3401;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLt;)V")
    private final void method110(int arg0, byte arg1, class172 arg2) {
        if ((this.field316.field2992[arg2.field3406] & 0x4) != 0 && arg2.field3424 < 0) {
            int var4 = this.field316.field2976[arg2.field3406] / class170.field3385;
            int var5 = (var4 + 1048575 - arg2.field3415) / var4;
            arg2.field3415 = arg0 * var4 + arg2.field3415 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field316.field2965[arg2.field3406] == 0) {
                    arg2.field3401 = class199.method1286(arg2.field3404, arg2.field3401.method1301(), arg2.field3401.method1280(), arg2.field3401.method1285());
                } else {
                    arg2.field3401 = class199.method1286(arg2.field3404, arg2.field3401.method1301(), 0, arg2.field3401.method1285());
                    this.field316.method966(arg2.field3399.field3247[arg2.field3411] < 0, -1, arg2);
                }
                if (arg2.field3399.field3247[arg2.field3411] < 0) {
                    arg2.field3401.method1277(-1);
                }
                arg0 = arg2.field3415 / var4;
            }
        }
        field327++;
        arg2.field3401.method116(arg0);
        if (arg1 != -126) {
            field319 = -92;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lkb;ZLjg;Lkb;)[Lob;")
    public static final class129[] method111(class93 arg0, boolean arg1, class89 arg2, class93 arg3) {
        field321++;
        int var4 = arg2.method454(236, arg0);
        if (arg1) {
            method114(121);
        }
        int var5 = arg2.method468(21, arg3, var4);
        return class142.method893(arg2, var5, var4, -1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lmc;II)V")
    public static final void method112(class112 arg0, int arg1, int arg2) {
        field315++;
        if (arg1 != 0) {
            method112(null, 108, 75);
        }
        class12.method63(arg0.field2045, arg2, arg0.field2032, 1118300112);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
    public final int method113() {
        field323++;
        return 0;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method114(int arg0) {
        field322 = null;
        if (arg0 >= -41) {
            field312 = 80;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILkb;)V")
    public static final void method115(int arg0, int arg1, class93 arg2) {
        field320++;
        class93 var3 = arg2.method506(false).method505((byte) -83);
        if (arg1 > -99) {
            return;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < class205.field3966; var5++) {
            class34 var6 = class206.field4035[class144.field2818[var5]];
            if (var6 != null && var6.field550 != null && var6.field550.method523(117, var3)) {
                var4 = true;
                class6.method36(0, false, class106.field1940.field2038[0], 1, (byte) -2, 2, class106.field1940.field2064[0], var6.field2064[0], 0, 1, 0, var6.field2038[0]);
                if (arg0 == 1) {
                    class184.field3625++;
                    class151.field2908.method47(204, 8);
                    class151.field2908.method1061(class144.field2818[var5], 12184);
                } else if (arg0 == 4) {
                    class88.field1605++;
                    class151.field2908.method47(111, 8);
                    class151.field2908.method1046((byte) 120, class144.field2818[var5]);
                } else if (arg0 == 6) {
                    class123.field2300++;
                    class151.field2908.method47(159, 8);
                    class151.field2908.method1061(class144.field2818[var5], 12184);
                } else if (arg0 == 7) {
                    class104.field1907++;
                    class151.field2908.method47(175, 8);
                    class151.field2908.method1046((byte) 113, class144.field2818[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class189.method1223(0, class43.field712, 2249, class203.method1321(new class93[] { class63.field1005, var3 }, -29));
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public final void method116(int arg0) {
        this.field325.method116(arg0);
        for (class172 var2 = (class172) this.field317.method692(false); var2 != null; var2 = (class172) this.field317.method695(512)) {
            if (!this.field316.method964(var2, -128)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3421) {
                        this.method110(var3, (byte) -126, var2);
                        var2.field3421 -= var3;
                        break;
                    }
                    this.method110(var2.field3421, (byte) -126, var2);
                    var3 -= var2.field3421;
                } while (!this.field316.method960(var2, var3, null, 0, (byte) -71));
            }
        }
        field324++;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()Lle;")
    public final class105 method117() {
        field326++;
        class172 var1 = (class172) this.field317.method692(false);
        if (var1 == null) {
            return null;
        } else if (var1.field3401 == null) {
            return this.method109();
        } else {
            return var1.field3401;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([IILt;III)V")
    private final void method118(int[] arg0, int arg1, class172 arg2, int arg3, int arg4, int arg5) {
        field318++;
        if ((arg4 & this.field316.field2992[arg2.field3406]) != 0 && arg2.field3424 < 0) {
            int var7 = this.field316.field2976[arg2.field3406] / class170.field3385;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3415) / var7;
                if (arg3 < var8) {
                    arg2.field3415 += arg3 * var7;
                    break;
                }
                arg2.field3401.method119(arg0, arg5, var8);
                arg3 -= var8;
                arg5 += var8;
                arg2.field3415 += var7 * var8 - 1048576;
                int var9 = class170.field3385 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class199 var11 = arg2.field3401;
                if (this.field316.field2965[arg2.field3406] == 0) {
                    arg2.field3401 = class199.method1286(arg2.field3404, var11.method1301(), var11.method1280(), var11.method1285());
                } else {
                    arg2.field3401 = class199.method1286(arg2.field3404, var11.method1301(), 0, var11.method1285());
                    this.field316.method966(arg2.field3399.field3247[arg2.field3411] < 0, -1, arg2);
                    arg2.field3401.method1293(var9, var11.method1280());
                }
                if (arg2.field3399.field3247[arg2.field3411] < 0) {
                    arg2.field3401.method1277(-1);
                }
                var11.method1282(var9);
                var11.method119(arg0, arg5, arg1 - arg5);
                if (var11.method1288()) {
                    this.field325.method1137(var11);
                }
            }
        }
        arg2.field3401.method119(arg0, arg5, arg3);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "([III)V")
    public final void method119(int[] arg0, int arg1, int arg2) {
        this.field325.method119(arg0, arg1, arg2);
        field313++;
        for (class172 var4 = (class172) this.field317.method692(false); var4 != null; var4 = (class172) this.field317.method695(512)) {
            if (!this.field316.method964(var4, -126)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3421 >= var6) {
                        this.method118(arg0, var5 + var6, var4, var6, 4, var5);
                        var4.field3421 -= var6;
                        break;
                    }
                    this.method118(arg0, var5 + var6, var4, var4.field3421, 4, var5);
                    var6 -= var4.field3421;
                    var5 += var4.field3421;
                } while (!this.field316.method960(var4, var6, arg0, var5, (byte) 59));
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lqh;)V")
    public class19(class153 arg0) {
        this.field316 = arg0;
    }
}
