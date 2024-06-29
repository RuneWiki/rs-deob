import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class101 {

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    private int field1787 = -1;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    private int field1805 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lpj;")
    private static class237 field1784 = class33.method353(" has logged out)3", 26);

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lpj;")
    public static class237 field1789 = class33.method353(")4l=", 96);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Lpj;")
    public static class237 field1783 = class33.method353("Konfig geladen)3", 40);

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lpj;")
    public static class237 field1790 = class33.method353("Mem:", 55);

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field1802 = 50;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lpj;")
    public static class237 field1795 = field1784;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Lw;")
    public static class141 field1803;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method764(int arg0) {
        field1784 = null;
        field1790 = null;
        field1789 = null;
        field1795 = null;
        if (arg0 != 0) {
            method766((byte) -44, 15);
        }
        field1803 = null;
        field1783 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I[BI)I")
    public static final int method765(int arg0, byte[] arg1, int arg2) {
        int var3 = 41 / ((arg0 - 84) / 42);
        field1788++;
        return class241.method1674(0, arg1, (byte) 122, arg2);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)I")
    public static final int method766(byte arg0, int arg1) {
        field1786++;
        if (arg0 != 95) {
            field1789 = null;
        }
        class223 var2 = class105.method784(arg1, arg0 - 96);
        int var3 = var2.field3822;
        int var4 = var2.field3833;
        int var5 = var2.field3828;
        int var6 = class63.field1263[var5 - var4];
        return var6 & class202.field3471[var3] >> var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILie;B)V")
    private final void method767(int arg0, int arg1, class32 arg2, byte arg3) {
        if (arg0 == 1) {
            this.field1805 = arg2.method313((byte) -80);
            this.method770(0, this.field1805);
        } else if (arg0 == 2) {
            this.field1787 = arg2.method339(arg3 - 16777170);
            if (this.field1787 == 65535) {
                this.field1787 = -1;
            }
        } else if (arg0 == 3) {
            arg2.method339(arg3 - 16777170);
        }
        if (arg3 != -46) {
            this.method771(7, 93, (class32) null);
        }
        field1792++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILw;)I")
    public static final int method768(int arg0, int arg1, class141 arg2) {
        if (arg1 != 709041672) {
            method768(-54, -51, (class141) null);
        }
        field1801++;
        if (arg2.field2459 == null || arg0 >= arg2.field2459.length) {
            return -2;
        }
        try {
            int var3 = 0;
            byte var4 = 0;
            int var5 = 0;
            int[] var6 = arg2.field2459[arg0];
            while (true) {
                int var7 = var6[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var9 = class242.field4251[var6[var5++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 2) {
                    var9 = class177.field3105[var6[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 3) {
                    var9 = class29.field582[var6[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var6[var5++] << 16;
                    int var11 = var10 + var6[var5++];
                    class141 var12 = class70.method572(20043, var11);
                    int var13 = var6[var5++];
                    if (var13 != -1 && (!class112.method829((byte) -82, var13).field158 || class29.field587)) {
                        for (int var14 = 0; var14 < var12.field2548.length; var14++) {
                            if ((var13 + 1) == var12.field2548[var14]) {
                                var9 += var12.field2540[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class202.field3471[var6[var5++]];
                }
                if (var7 == 6) {
                    var9 = class96.field1700[class177.field3105[var6[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class202.field3471[var6[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class229.field3911.field4660;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class102.field1822[var15]) {
                            var9 += class177.field3105[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var6[var5++] << 16;
                    int var17 = var16 + var6[var5++];
                    class141 var18 = class70.method572(20043, var17);
                    int var19 = var6[var5++];
                    if (var19 != -1 && (!class112.method829((byte) -82, var19).field158 || class29.field587)) {
                        for (int var20 = 0; var20 < var18.field2548.length; var20++) {
                            if (var19 + 1 == var18.field2548[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class25.field463;
                }
                if (var7 == 12) {
                    var9 = class81.field1532;
                }
                if (var7 == 13) {
                    int var21 = class202.field3471[var6[var5++]];
                    int var22 = var6[var5++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var6[var5++];
                    var9 = method766((byte) 95, var23);
                }
                if (var7 == 18) {
                    var9 = (class229.field3911.field3710 >> 7) + class235.field4087;
                }
                if (var7 == 19) {
                    var9 = (class229.field3911.field3700 >> 7) + class27.field494;
                }
                if (var7 == 20) {
                    var9 = var6[var5++];
                }
                if (var8 == 0) {
                    if (var4 == 0) {
                        var3 += var9;
                    }
                    if (var4 == 1) {
                        var3 -= var9;
                    }
                    if (var4 == 2 && var9 != 0) {
                        var3 /= var9;
                    }
                    if (var4 == 3) {
                        var3 *= var9;
                    }
                    var4 = 0;
                } else {
                    var4 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
    public static final void method769(byte arg0, boolean arg1) {
        field1785++;
        class177.method1220(class142.field2585, class119.field2087, -1, class84.field1573, arg1);
        if (arg0 > -100) {
            field1800 = -119;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    private final void method770(int arg0, int arg1) {
        field1804++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF4F16) >> 16) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var5;
        if (var3 < var5) {
            var11 = var3;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var13 = var5;
        if (var3 > var5) {
            var13 = var3;
        }
        double var15 = (double) arg0;
        if (var7 > var13) {
            var13 = var7;
        }
        double var17 = (var11 + var13) / 2.0D;
        this.field1794 = (int) (var17 * 256.0D);
        if (this.field1794 < 0) {
            this.field1794 = 0;
        } else if (this.field1794 > 255) {
            this.field1794 = 255;
        }
        if (var11 != var13) {
            if (var5 == var13) {
                var9 = (var3 - var7) / (var13 - var11);
            } else if (var3 == var13) {
                var9 = (var7 - var5) / (var13 - var11) + 2.0D;
            } else if (var7 == var13) {
                var9 = (var5 - var3) / (var13 - var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var11) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var11) / (2.0D - var13 - var11);
            }
        }
        double var19 = var9 / 6.0D;
        this.field1796 = (int) (var15 * 256.0D);
        if (this.field1796 < 0) {
            this.field1796 = 0;
        } else if (this.field1796 > 255) {
            this.field1796 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field1791 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1791 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1791 < 1) {
            this.field1791 = 1;
        }
        this.field1797 = (int) ((double) this.field1791 * var19);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILie;)V")
    public final void method771(int arg0, int arg1, class32 arg2) {
        if (arg0 != -1) {
            this.method767(78, -5, (class32) null, (byte) -12);
        }
        field1799++;
        while (true) {
            int var4 = arg2.method316((byte) 7);
            if (var4 == 0) {
                return;
            }
            this.method767(var4, arg1, arg2, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILfa;BLfa;)Lug;")
    public static final class194 method772(int arg0, int arg1, class239 arg2, byte arg3, class239 arg4) {
        field1793++;
        if (arg3 <= 77) {
            field1802 = 7;
        }
        return class123.method883(arg0, arg1, -1, arg4) ? class188.method1280(arg2.method1645(true, arg1, arg0), -1326723476) : null;
    }
}
