import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class50 {

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Llg;")
    public static class237 field595;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "[[B")
    public static byte[][] field602;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[[S")
    public static short[][] field601;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILdg;BI)V")
    private final void method285(int arg0, class236 arg1, byte arg2, int arg3) {
        field598++;
        if (arg3 == 1) {
            this.field590 = arg1.method1617((byte) 48);
        } else if (arg3 == 2) {
            this.field600 = arg1.method1574(-35);
            this.field592 = arg1.method1574(-14);
        }
        int var5 = 56 / ((arg2 - 70) / 40);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public static final void method286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field594++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class130.method805(true, class235.field3295, arg1 + arg4, class81.field946);
        int var10 = class130.method805(true, class235.field3295, arg1 - arg4, class81.field946);
        class296.method1954(arg0, var9, class291.field4067[arg2], var10, arg3);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class388.field5464 <= var12 && var11 <= class219.field3080) {
                    int var13 = class130.method805(true, class235.field3295, arg1 + var5, class81.field946);
                    int var14 = class130.method805(true, class235.field3295, arg1 - var5, class81.field946);
                    if (class219.field3080 >= var12) {
                        class296.method1954(arg0, var13, class291.field4067[var12], var14, -1);
                    }
                    if (var11 >= class388.field5464) {
                        class296.method1954(arg0, var13, class291.field4067[var11], var14, -1);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class388.field5464 && class219.field3080 >= var15) {
                int var17 = class130.method805(true, class235.field3295, arg1 + var6, class81.field946);
                int var18 = class130.method805(true, class235.field3295, arg1 - var6, class81.field946);
                if (class219.field3080 >= var16) {
                    class296.method1954(arg0, var17, class291.field4067[var16], var18, -1);
                }
                if (var15 >= class388.field5464) {
                    class296.method1954(arg0, var17, class291.field4067[var15], var18, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method287(int arg0) {
        field599++;
        class146.method887(false);
        class305.field4288 = null;
        class335.field4740 = null;
        class311.field4398 = null;
        class296.field4124 = null;
        if (arg0 != 8) {
            field596 = 33;
        }
        class382.field5353 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lw;")
    public static final class163 method288(int arg0, int arg1) {
        field597++;
        class237 var2 = class406.field5860;
        class163 var3;
        synchronized (class406.field5860) {
            var3 = (class163) class406.field5860.method1625((long) arg1, arg0 ^ arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class279.field3949.method2431((byte) 85, class207.method1356(false, arg1), class162.method1053((byte) -48, arg1));
        class163 var5 = new class163();
        var5.field2291 = arg1;
        var5.field2261 = new String[] { null, null, class313.field4416.method2331(25, class334.field4726), null, null };
        var5.field2276 = new String[] { null, null, null, null, class126.field1536.method2331(25, class334.field4726) };
        if (var4 != null) {
            var5.method1084(new class236(var4), 22976);
        }
        var5.method1085(91);
        if (var5.field2236 != -1) {
            var5.method1093((byte) 125, method288(0, var5.field2236), method288(0, var5.field2296));
        }
        if (var5.field2269 != -1) {
            var5.method1086(method288(0, var5.field2269), method288(0, var5.field2275), 0);
        }
        if (!class435.field6250 && var5.field2282) {
            var5.field2238 = class129.field1566.method2331(25, class334.field4726);
            var5.field2261 = class1.field5;
            var5.field2283 = false;
            var5.field2276 = class203.field2910;
            var5.field2295 = null;
            var5.field2294 = 0;
            if (var5.field2253 != null) {
                boolean var6 = false;
                for (class406 var7 = var5.field2253.method1884(arg0); var7 != null; var7 = var5.field2253.method1890(-1)) {
                    class41 var8 = class401.method2555((int) var7.field5855, 1024);
                    if (var8.field495) {
                        var7.method2594((byte) -22);
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var5.field2253 = null;
                }
            }
        }
        class237 var9 = class406.field5860;
        synchronized (class406.field5860) {
            class406.field5860.method1622((byte) 13, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lgo;")
    public final class375 method289(byte arg0) {
        field604++;
        class375 var2 = (class375) class392.field5521.method1625((long) this.field590, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -115) {
            this.field592 = 15;
        }
        class375 var3 = class375.method2402(class86.field976, this.field590, 0);
        if (var3 != null) {
            class392.field5521.method1622((byte) 13, var3, (long) this.field590);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILdg;)V")
    public final void method290(int arg0, int arg1, class236 arg2) {
        field591++;
        while (true) {
            int var4 = arg2.method1574(-128);
            if (var4 == 0) {
                if (arg1 == -28076) {
                    return;
                } else {
                    field605 = 45;
                    return;
                }
            }
            this.method285(arg0, arg2, (byte) -109, var4);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method291(boolean arg0) {
        field601 = null;
        field595 = null;
        if (arg0) {
            field602 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIIZIIZ)V")
    public static final void method292(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field603++;
        if (!arg7 && class153.field1896 == arg3 && class291.field4066 == arg6 && class422.field6035 == arg5 || class12.method93(1)) {
            return;
        }
        class153.field1896 = arg3;
        class291.field4066 = arg6;
        class422.field6035 = arg5;
        if (class12.method93(1)) {
            class422.field6035 = 0;
        }
        if (arg4) {
            class178.method1210(28, -109);
        } else {
            class178.method1210(25, 95);
        }
        class440.method2749((byte) 92, true, class248.field3544.method2331(25, class271.field3836), class73.field874);
        int var8 = class114.field1403;
        if (arg0 < 73) {
            method287(-97);
        }
        class114.field1403 = (class153.field1896 - (class176.field2403 >> 4)) * 8;
        int var9 = class41.field496;
        class41.field496 = (class291.field4066 - (class383.field5395 >> 4)) * 8;
        class8.field125 = class308.method2043(class153.field1896 * 8, class291.field4066 * 8);
        class330.field4667 = null;
        int var10 = class114.field1403 - var8;
        int var11 = class41.field496 - var9;
        if (arg4) {
            class102.field1250 = 0;
            int var15 = class176.field2403 * 128 - 128;
            int var16 = (class383.field5395 - 1) * 128;
            for (int var17 = 0; var17 < 32768; var17++) {
                class77 var22 = class167.field2335[var17];
                if (var22 != null) {
                    var22.field3269 -= var11 * 128;
                    var22.field3284 -= var10 * 128;
                    if (var22.field3284 >= 0 && var22.field3284 <= var15 && var22.field3269 >= 0 && var22.field3269 <= var16) {
                        boolean var23 = true;
                        for (int var24 = 0; var24 < 10; var24++) {
                            var22.field5677[var24] -= var10;
                            var22.field5664[var24] -= var11;
                            if (var22.field5677[var24] < 0 || class176.field2403 <= var22.field5677[var24] || var22.field5664[var24] < 0 || class383.field5395 <= var22.field5664[var24]) {
                                var23 = false;
                            }
                        }
                        if (var23) {
                            class86.field981[class102.field1250++] = var17;
                        } else {
                            class167.field2335[var17].method431((class135) null, 90);
                            class167.field2335[var17] = null;
                        }
                    } else {
                        class167.field2335[var17].method431((class135) null, 119);
                        class167.field2335[var17] = null;
                    }
                }
            }
        } else {
            for (int var12 = 0; var12 < 32768; var12++) {
                class77 var13 = class167.field2335[var12];
                if (var13 != null) {
                    for (int var14 = 0; var14 < 10; var14++) {
                        var13.field5677[var14] -= var10;
                        var13.field5664[var14] -= var11;
                    }
                    var13.field3269 -= var11 * 128;
                    var13.field3284 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class40 var20 = class26.field314[var18];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field5677[var21] -= var10;
                    var20.field5664[var21] -= var11;
                }
                var20.field3284 -= var10 * 128;
                var20.field3269 -= var11 * 128;
            }
        }
        class129.field1570 = arg5;
        class384.field5422.method247(class129.field1570, arg1, false, arg2, -112);
        class23.method166(-1932894386, var10, var11);
        for (class248 var19 = (class248) class151.field1872.method506((byte) -128); var19 != null; var19 = (class248) class151.field1872.method514(true)) {
            var19.field3545 -= var11;
            var19.field3540 -= var10;
            if (var19.field3540 < 0 || var19.field3545 < 0 || var19.field3540 >= class176.field2403 || class383.field5395 <= var19.field3545) {
                var19.method2594((byte) -22);
            }
        }
        class229.field3247 = 0;
        if (class33.field386 != 0) {
            class443.field6343 -= var11;
            class33.field386 -= var10;
        }
        if (arg4) {
            class65.field745 -= var11;
            class265.field3774 -= var11 * 128;
            class160.field2105 -= var10;
            class334.field4730 -= var10 * 128;
            class253.field3627 -= var11;
            class168.field2346 -= var10;
            if (Math.abs(var10) > class176.field2403 || Math.abs(var11) > class383.field5395) {
                class223.method1495((byte) -73);
            }
        } else if (class129.field1568 == 4) {
            class331.field4680 -= var11 * 128;
            class214.field3034 -= var10 * 128;
            class130.field1576 -= var10 * 128;
            class79.field929 -= var11 * 128;
        } else {
            class129.field1568 = 1;
        }
        class245.method1664(-22116);
        class193.method1307(false);
        class79.field928.method505((byte) 44);
        class39.field441.method505((byte) 44);
        class158.field2062.method2508(112);
        class127.method790(0);
    }

    static {
        new class362((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field596 = 0;
        field595 = new class237(64);
    }
}
