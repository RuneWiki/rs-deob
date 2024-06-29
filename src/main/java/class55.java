import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class55 extends class119 implements class64 {

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Z")
    private boolean field841 = false;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    private int field846 = 50;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Lnm;")
    private class221 field834;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "Lnm;")
    private class221 field852;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Lmi;")
    private class227 field835;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Lmi;")
    private class227 field837;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field824 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field843 = 0;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "Lnm;")
    public static class221 field833;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 5)
    public static final void method394(int arg0) {
        field854++;
        if (class124.method803(false) != 2 || arg0 != 15703) {
            return;
        }
        int var1 = class253.field4021 % 104;
        byte var2 = (byte) (class253.field4021 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class138.field2175[var3][var1][var4] = var2;
            }
        }
        if (class120.field1779 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class74.field1121[var5] = -1000000;
            class90.field1306[var5] = 1000000;
            class18.field226[var5] = 0;
            class172.field2697[var5] = 1000000;
            class178.field2780[var5] = 0;
        }
        if (class269.field4427 != 1) {
            int var16 = client.method889(class41.field625, class120.field1779, class259.field4098, -115);
            if (var16 - class74.field1117 < 800 && (class148.field2392[class120.field1779][class41.field625 >> 7][class259.field4098 >> 7] & 0x4) != 0) {
                class342.method2417(class259.field4098 >> 7, class264.field4230, false, class41.field625 >> 7, 1, arg0 ^ 0x3D0C);
            }
            return;
        }
        if ((class148.field2392[class120.field1779][class329.field5388.field4796 >> 7][class329.field5388.field4783 >> 7] & 0x4) != 0) {
            class342.method2417(class329.field5388.field4783 >> 7, class264.field4230, false, class329.field5388.field4796 >> 7, 0, 109);
        }
        if (class54.field817 >= 310) {
            return;
        }
        int var6 = class259.field4098 >> 7;
        int var7 = class329.field5388.field4796 >> 7;
        int var8 = class41.field625 >> 7;
        int var9 = class329.field5388.field4783 >> 7;
        int var10;
        if (var8 >= var7) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        int var11;
        if (var9 <= var6) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -104 || var10 >= 104 || var11 <= -104 || var11 >= 104) {
            class326.method2328((Throwable) null, "RC: " + var8 + "," + var6 + " " + var7 + "," + var9 + " " + class215.field3313 + "," + class150.field2420, true);
            return;
        }
        if (var10 > var11) {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var8) {
                if (var8 < var7) {
                    var8++;
                } else if (var8 > var7) {
                    var8--;
                }
                if ((class148.field2392[class120.field1779][var8][var6] & 0x4) != 0) {
                    class342.method2417(var6, class264.field4230, false, var8, 1, 111);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 > var6) {
                        var6++;
                    } else if (var9 < var6) {
                        var6--;
                    }
                    if ((class148.field2392[class120.field1779][var8][var6] & 0x4) != 0) {
                        class342.method2417(var6, class264.field4230, false, var8, 1, -72);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var10 * 65536 / var11;
        int var13 = 32768;
        while (var6 != var9) {
            if (var6 < var9) {
                var6++;
            } else if (var9 < var6) {
                var6--;
            }
            if ((class148.field2392[class120.field1779][var8][var6] & 0x4) != 0) {
                class342.method2417(var6, class264.field4230, false, var8, 1, 85);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                if (var7 > var8) {
                    var8++;
                } else if (var7 < var8) {
                    var8--;
                }
                var13 -= 65536;
                if ((class148.field2392[class120.field1779][var8][var6] & 0x4) != 0) {
                    class342.method2417(var6, class264.field4230, false, var8, 1, 97);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Z", line = 202)
    public final boolean method395(int arg0, int arg1) {
        field828++;
        class85 var3 = this.method401(arg0, false);
        if (arg1 > -94) {
            return false;
        } else if (var3 == null) {
            return false;
        } else {
            return var3.method560(this, this.field852);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 217)
    public final void method396(int arg0) {
        field840++;
        this.field835.method1547(-104);
        if (this.field837 != null) {
            this.field837.method1547(arg0 ^ 0x1004B);
        }
        if (arg0 == -65537) {
            class85.field1221 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(IB)Lkg;", line = 234)
    public final class121 method397(int arg0, byte arg1) {
        field823++;
        class85 var3 = this.method401(arg0, false);
        if (arg1 == -18) {
            return var3 == null ? null : var3.field1219;
        } else {
            return (class121) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(BI)V", line = 248)
    public final void method398(byte arg0, int arg1) {
        field855++;
        this.field846 = arg1;
        this.field835 = new class227(this.field846);
        if (class245.field3886) {
            this.field837 = new class227(this.field846);
        } else {
            this.field837 = null;
        }
        int var3 = 29 / ((arg0 + 59) / 49);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(II)I", line = 271)
    public final int method399(int arg0, int arg1) {
        field838++;
        if (arg1 < 53) {
            this.field834 = (class221) null;
        }
        return this.method774((byte) -16, arg0).field895 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(BI)V", line = 282)
    public final void method400(byte arg0, int arg1) {
        field844++;
        this.method414(arg1, this.field841 || this.method774((byte) -16, arg1).field901 ? 64 : 128, true);
        if (arg0 != 111) {
            this.field834 = (class221) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)Lpk;", line = 296)
    private final class85 method401(int arg0, boolean arg1) {
        field845++;
        class85 var3 = (class85) this.field835.method1539(-53, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field834.method1504(0, !arg1, arg0);
        if (var4 == null) {
            return null;
        }
        class85 var5 = new class85(new class313(var4));
        this.field835.method1538(-84, (long) arg0, var5);
        if (arg1) {
            field843 = -24;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)Z", line = 321)
    public final boolean method402(boolean arg0, int arg1) {
        if (!arg0) {
            field824 = (String) null;
        }
        field839++;
        return this.method774((byte) -16, arg1).field889;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(BI)Z", line = 335)
    public final boolean method403(byte arg0, int arg1) {
        if (arg0 >= -64) {
            this.method402(false, 10);
        }
        field832++;
        return this.field841 || this.method774((byte) -16, arg1).field901;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IFI)[I", line = 351)
    public final int[] method404(int arg0, float arg1, int arg2) {
        field826++;
        if (arg0 <= 0) {
            return (int[]) null;
        }
        class85 var4 = this.method401(arg2, false);
        if (var4 == null) {
            return null;
        } else {
            var4.field1217 = true;
            return var4.method561(this, this.field852, arg1, this.field841 || this.method774((byte) -16, arg2).field901);
        }
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(II)I", line = 367)
    public final int method405(int arg0, int arg1) {
        field825++;
        if (arg1 != -8237) {
            this.field846 = -56;
        }
        return this.method774((byte) -16, arg0).field892 & 0xFFFF;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I", line = 383)
    public final int method406(int arg0, int arg1) {
        field847++;
        if (arg0 != -1) {
            method394(113);
        }
        return this.method774((byte) -16, arg1).field890 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lnm;Lnm;Lnm;IZ)V", line = 575)
    public class55(class221 arg0, class221 arg1, class221 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field834 = arg0;
        this.field841 = arg4;
        this.field852 = arg2;
        this.field846 = arg3;
        this.field835 = new class227(this.field846);
        if (class245.field3886) {
            this.field837 = new class227(this.field846);
        } else {
            this.field837 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)I", line = 399)
    public final int method407(int arg0, byte arg1) {
        if (arg1 <= 76) {
            this.method414(107, 51, false);
        }
        field850++;
        return this.method774((byte) -16, arg0).field888 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILnm;)Lle;", line = 414)
    public static final class137 method408(int arg0, int arg1, class221 arg2) {
        field853++;
        if (class358.method2493((byte) -90, arg2, arg0)) {
            if (arg1 != 19472) {
                method394(78);
            }
            return class177.method1245((byte) 32);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIFBZ)Lle;", line = 429)
    public final class137 method409(int arg0, int arg1, float arg2, byte arg3, boolean arg4) {
        if (arg3 >= -74) {
            return (class137) null;
        }
        class85 var6 = this.method401(arg1, false);
        field851++;
        if (var6 != null && var6.method560(this, this.field852)) {
            return arg4 ? var6.field1219.method787(arg0, false, (double) arg2, arg0, this, this.field852, 27102) : var6.field1219.method781((double) arg2, false, this.field852, arg0, arg0, this, (byte) -87);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(ZI)[I", line = 450)
    public final int[] method410(boolean arg0, int arg1) {
        field849++;
        class85 var3 = this.method401(arg1, arg0);
        return var3 == null ? null : var3.method557(this, this.field852, this.field841 || this.method774((byte) -16, arg1).field901);
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(II)Ldg;", line = 464)
    private final class191 method411(int arg0, int arg1) {
        field829++;
        class191 var3 = (class191) this.field837.method1539(-99, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        class191 var4 = new class191(this.method774((byte) -16, arg0).field892 & 0xFFFF);
        if (arg1 < 59) {
            this.field846 = -103;
        }
        this.field837.method1538(37, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)I", line = 485)
    public final int method412(int arg0, int arg1) {
        field848++;
        if (arg0 != 103) {
            this.field837 = (class227) null;
        }
        return this.method774((byte) -16, arg1).field887 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(ZI)V", line = 498)
    public final void method413(boolean arg0, int arg1) {
        if (arg0) {
            this.method413(false, -91);
        }
        for (class85 var3 = (class85) this.field835.method1543(-32531); var3 != null; var3 = (class85) this.field835.method1544(true)) {
            if (var3.field1217) {
                var3.method559(arg1);
                var3.field1217 = false;
            }
        }
        field831++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZ)V", line = 524)
    public final void method414(int arg0, int arg1, boolean arg2) {
        class7.method53(this.method774((byte) -16, arg0).field895 & 0xFF, this.method774((byte) -16, arg0).field890 & 0xFF, arg2);
        boolean var4 = false;
        field827++;
        class85 var5 = this.method401(arg0, false);
        if (var5 != null) {
            var4 = var5.method562(this, this.field852, arg1);
        }
        if (!var4) {
            class191 var6 = this.method411(arg0, 93);
            var6.method1320((byte) -89);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)Z", line = 549)
    public final boolean method415(boolean arg0, int arg1) {
        field836++;
        if (arg0) {
            this.method395(-46, 11);
        }
        return !this.method774((byte) -16, arg1).field899;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)Z", line = 565)
    public final boolean method416(int arg0, byte arg1) {
        field842++;
        if (arg1 != -31) {
            this.method406(102, 36);
        }
        return this.method774((byte) -16, arg0).field891;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZZ)V", line = 596)
    public final void method417(boolean arg0, boolean arg1) {
        field830++;
        if (arg0) {
            this.field841 = arg1;
            this.method396(-65537);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V", line = 608)
    public static void method418(boolean arg0) {
        field824 = null;
        if (arg0) {
            method394(-1);
        }
        field833 = null;
    }
}
