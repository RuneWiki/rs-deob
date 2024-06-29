import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 extends class259 {

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "Z")
    public boolean field1708 = false;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "Lf;")
    private class36 field1712;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Z")
    private boolean field1705;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "Z")
    private boolean field1707;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Lji;")
    public static class42 field1699 = null;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Lcc;")
    public static class209 field1701 = class95.method669(86, "Ablegen");

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Lcc;")
    public static class209 field1714 = class95.method669(84, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Lcc;")
    private static class209 field1713 = class95.method669(104, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "Lcc;")
    public static class209 field1718 = field1713;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "F")
    public static float field1700;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "F")
    private float field1709;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "[I")
    private int[] field1702;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static final void method615(byte arg0) {
        field1711++;
        if (arg0 != -52) {
            return;
        }
        if (class103.field1974 == 2) {
            if (class93.field1836 == class231.field4200 && class56.field1161 == class255.field4616) {
                class103.field1974 = 0;
                if (class118.field2368 && class228.field4153[81] && class98.field1912 > 2) {
                    class146.method1016(class98.field1912 - 2, 0);
                } else {
                    class146.method1016(class98.field1912 - 1, 0);
                }
            }
        } else if (class237.field4246 == class231.field4200 && class76.field1413 == class56.field1161) {
            class103.field1974 = 0;
            if (class118.field2368 && class228.field4153[81] && class98.field1912 > 2) {
                class146.method1016(class98.field1912 - 2, 0);
            } else {
                class146.method1016(class98.field1912 - 1, arg0 + 52);
            }
        } else {
            class103.field1974 = 2;
            class93.field1836 = class237.field4246;
            class255.field4616 = class76.field1413;
        }
    }

    @OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field1721++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FBZLra;Lsj;)[I")
    public final int[] method616(float arg0, byte arg1, boolean arg2, class232 arg3, class49 arg4) {
        field1704++;
        if (this.field1702 == null || this.field1709 != arg0) {
            if (!this.field1712.method273(arg4, arg3, (byte) -80)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field1702 = this.field1712.method274((double) arg0, this.field1707, var6, var6, arg4, true, (byte) -106, arg3);
            this.field1709 = arg0;
            if (this.field1705) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13 = var6 - 1;
                int var14 = var6;
                int var15 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var13; var34 >= 0; var34--) {
                        var14--;
                        int var35 = this.field1702[var14];
                        var7[var34] += class27.method220(255, var35 >> 16);
                        var8[var34] += class27.method220(65423, var35) >> 8;
                        var9[var34] += class27.method220(var35, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var24 += var9[var21];
                        var23 += var8[var21];
                        var25 += var7[var21];
                        if (var21 == 0) {
                            var21 = var12;
                        }
                    }
                    for (int var27 = var13; var27 >= 0; var27--) {
                        var22--;
                        int var31 = var25 / 9;
                        int var32 = var23 / 9;
                        var21--;
                        int var33 = var24 / 9;
                        var19--;
                        var10[var19] = class6.method63(class6.method63(var32 << 8, var31 << 16), var33);
                        var25 += var7[var21] - var7[var22];
                        var24 += var9[var21] - var9[var22];
                        var23 += var8[var21] - var8[var22];
                        if (var21 == 0) {
                            var21 = var12;
                        }
                        if (var22 == 0) {
                            var22 = var12;
                        }
                    }
                    for (int var28 = var13; var28 >= 0; var28--) {
                        var14--;
                        int var29 = this.field1702[var14];
                        var15--;
                        int var30 = this.field1702[var15];
                        var7[var28] += class27.method220(var29 >> 16, 255) - (class27.method220(var30, 16721233) >> 16);
                        var8[var28] += -class27.method220(var30 >> 8, 255) + class27.method220(255, var29 >> 8);
                        var9[var28] += class27.method220(var29, 255) - class27.method220(var30, 255);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field1702 = var10;
            }
        }
        int var36 = 11 % ((-arg1 - 25) / 63);
        return this.field1702;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)I")
    public static final int method617(int arg0, int arg1, int arg2) {
        field1706++;
        class75 var3 = (class75) class31.field554.method1755((long) arg2, (byte) -101);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg0 != 12860) {
                return 100;
            }
            while (var3.field1401.length > var5) {
                if (var3.field1403[var5] == arg1) {
                    var4 += var3.field1401[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)V")
    public static final void method618(boolean arg0, int arg1, int arg2) {
        field1710++;
        int var3 = 0;
        if (arg0) {
            method617(-28, 22, 98);
        }
        while (class94.field1861 > var3) {
            class155 var4 = class148.method1030(var3, 3);
            if (var4 != null) {
                int var5 = var4.field2834;
                if (var5 >= 0 && !class15.field271.method1614(var5, (byte) 49)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2849 >= 0) {
                    int var6 = var4.field2849;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg1 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class15.field288[class8.method79((byte) -110, var8, 96)];
                } else if (var5 >= 0) {
                    var9 = class15.field288[class8.method79((byte) -121, class15.field271.method1620(var5, (byte) -69), 96)];
                } else if (var4.field2837 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field2837;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + ((var10 + arg1 & 0xFC00) + var11);
                    var9 = class15.field288[class8.method79((byte) -110, var12, 96)];
                }
                class12.field233[var3 + 1] = var9;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lra;ZILsj;)[I")
    public final int[] method619(class232 arg0, boolean arg1, int arg2, class49 arg3) {
        field1715++;
        if (!this.field1712.method273(arg3, arg0, (byte) -72)) {
            return null;
        } else if (arg2 == 18922) {
            int var5 = arg1 ? 64 : 128;
            return this.field1712.method274(1.0D, this.field1707, var5, var5, arg3, false, (byte) -74, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lji;IIII)V")
    public static final void method620(class42 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1703++;
        if (class8.field158 >= arg3) {
            class4.method27(arg4, arg2, 0, arg0.field838, arg0.field757);
        } else {
            ((class269) class145.field2680).method230(arg4, arg2, arg0.field789, arg0.field758, class145.field2680.field4197 / 2, class145.field2680.field4192 / 2, class253.field4565, 256, arg0.field838, arg0.field757);
        }
        class31.field562[arg1] = true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lsj;ZLra;)Z")
    public final boolean method621(class49 arg0, boolean arg1, class232 arg2) {
        field1717++;
        return arg1 ? this.field1712.method273(arg0, arg2, (byte) -124) : true;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ltf;)V")
    public class86(class106 arg0) {
        this.field1712 = new class36(arg0);
        this.field1705 = arg0.method774((byte) 112) == 1;
        this.field1707 = arg0.method774((byte) 98) == 1;
        arg0.method774((byte) 127);
        arg0.method774((byte) 112);
        int var2 = arg0.method774((byte) 83) & 0x3;
        this.field1720 = arg0.method777(94);
        this.field1719 = arg0.method777(103);
        arg0.method774((byte) 86);
        arg0.method774((byte) 98);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
    public final void method622(int arg0, boolean arg1) {
        field1716++;
        if (this.field1702 == null) {
            return;
        }
        if (arg1) {
            this.method619((class232) null, true, -115, (class49) null);
        }
        if (this.field1719 == 0 && this.field1720 == 0) {
            return;
        }
        if (class174.field3177 == null || class174.field3177.length < this.field1702.length) {
            class174.field3177 = new int[this.field1702.length];
        }
        int var3 = this.field1702.length == 4096 ? 64 : 128;
        int var4 = this.field1702.length;
        int var5 = var3 - 1;
        int var6 = arg0 * var3 * this.field1719;
        int var7 = this.field1720 * arg0;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var8 & var6 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 & var7 + var12) + var11;
                class174.field3177[var13] = this.field1702[var14];
            }
        }
        int[] var10 = this.field1702;
        this.field1702 = class174.field3177;
        class174.field3177 = var10;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public static void method623(byte arg0) {
        field1713 = null;
        if (arg0 > 94) {
            field1699 = null;
            field1714 = null;
            field1701 = null;
            field1718 = null;
        }
    }
}
