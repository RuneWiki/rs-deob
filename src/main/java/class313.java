import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class313 {

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    private int field3886 = 0;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    private int field3896 = -1;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lbq;")
    private class289 field3885 = new class289();

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Z")
    public boolean field3897 = false;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    private int field3884;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[Lvda;")
    private class181[] field3879;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[[I")
    private int[][] field3887;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3882 = new Rectangle[100];

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field3890 = 0;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[Lnu;")
    public static class590[] field3888 = new class590[50];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lrc;")
    public static class536 field3883;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method1858(int arg0, int arg1) {
        if (arg0 != 100) {
            method1865(-11);
        }
        field3892++;
        if (this.field3893 == this.field3884) {
            this.field3897 = this.field3879[arg1] == null;
            this.field3879[arg1] = class741.field10363;
            return this.field3887[arg1];
        } else if (this.field3884 == 1) {
            this.field3897 = this.field3896 != arg1;
            this.field3896 = arg1;
            return this.field3887[0];
        } else {
            class181 var3 = this.field3879[arg1];
            if (var3 == null) {
                this.field3897 = true;
                if (this.field3884 > this.field3886) {
                    var3 = new class181(arg1, this.field3886);
                    this.field3886++;
                } else {
                    class181 var4 = (class181) this.field3885.method1718(184887176);
                    var3 = new class181(arg1, var4.field2138);
                    this.field3879[var4.field2139] = null;
                    var4.method864(12983);
                }
                this.field3879[arg1] = var3;
            } else {
                this.field3897 = false;
            }
            this.field3885.method1731(var3, (byte) -90);
            return this.field3887[var3.field2138];
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZIZI)V", line = 83)
    public static final void method1859(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (!arg3) {
            method1864(-34, 46);
        }
        class163.field1827 = arg6;
        field3881++;
        class702.field9898 = arg4;
        class398.field5452 = arg2;
        class262.field3257 = arg1;
        class619.field8858 = arg0;
        if (arg5 && class262.field3257 >= 100) {
            class167.field1855 = class163.field1827 * 512 + 256;
            class590.field8319 = class398.field5452 * 512 + 256;
            class204.field2409 = class676.method3845(class590.field8319, class167.field1855, 0, class122.field1278) - class702.field9898;
        }
        class496.field7014 = 2;
        class406.field5556 = -1;
        class16.field147 = -1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)V", line = 109)
    public static final void method1860(boolean arg0, int arg1) {
        field3895++;
        if (class392.field5397 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class10.field79 == null) {
                class654.method3707(class80.field835, -1, class126.field1328, class411.field5619);
            } else {
                class238.method1404(!arg0, class126.field1328);
            }
        }
        if (arg1 != 13 && class185.field2213 != null) {
            class185.field2213.method1691(59);
            class185.field2213 = null;
        }
        if (arg1 == 3) {
            class373.method2165(class417.field5795 != class327.field4245, 1735429097);
        }
        if (arg1 == 7) {
            class479.method2884(-1, class633.field9105 != class327.field4245);
        }
        if (arg1 == 5) {
            if (class10.field79 == null) {
                class403.method2458(class411.field5619, (byte) 82, class80.field835);
            } else {
                class458.method2801((byte) -70);
            }
        } else if (arg1 == 6) {
            if (class10.field79 == null) {
                class654.method3707(class80.field835, -1, class126.field1328, class411.field5619);
            } else {
                class238.method1404(false, class126.field1328);
            }
        } else if (arg1 == 9) {
            if (class10.field79 == null) {
                class654.method3707(class80.field835, -1, class126.field1328, class411.field5619);
            } else {
                class238.method1404(false, class126.field1328);
            }
        } else if (arg1 == 12) {
            if (class10.field79 == null) {
                class403.method2458(class411.field5619, (byte) 88, class80.field835);
            } else {
                class458.method2801((byte) -75);
            }
        }
        if (class300.method1771(-3163, class392.field5397)) {
            class65.field663.field5531 = 2;
            class378.field5181.field5531 = 2;
            class203.field2401.field5531 = 2;
            class650.field9287.field5531 = 2;
            class332.field4306.field5531 = 2;
            class745.field10405.field5531 = 2;
            class199.field2350.field5531 = 2;
        }
        if (class300.method1771(-3163, arg1)) {
            class319.field4074 = 1;
            class736.field10295 = 1;
            class491.field6992 = 0;
            class689.field9719 = 0;
            class412.field5621 = 0;
            class40.method245(8, true);
            class65.field663.field5531 = 1;
            class378.field5181.field5531 = 1;
            class203.field2401.field5531 = 1;
            class650.field9287.field5531 = 1;
            class332.field4306.field5531 = 1;
            class745.field10405.field5531 = 1;
            class199.field2350.field5531 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class316.method1892(31);
        }
        if (!arg0) {
            method1863(-119, 120, true, false, -120);
        }
        boolean var2 = arg1 == 2 || class262.method1575(arg1, 6) || class100.method700((byte) 8, arg1);
        boolean var3 = class392.field5397 == 2 || class262.method1575(class392.field5397, 6) || class100.method700((byte) 8, class392.field5397);
        if (var3 != var2) {
            if (var2) {
                class326.field4223 = class581.field8216;
                if (class654.field9334.field9853.method1500(-127) == 0) {
                    class735.method4095(-1, 2);
                } else {
                    class641.method3655(0, 2, class654.field9334.field9853.method1500(78), class464.field6622, (byte) 56, class581.field8216, false);
                    class703.method3949(95);
                }
                class227.field2592.method2008(118, false);
            } else {
                class735.method4095(-1, 2);
                class227.field2592.method2008(116, true);
            }
        }
        if (class300.method1771(-3163, arg1) || arg1 == 13) {
            class275.field3370.method362();
        }
        class392.field5397 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 263)
    public static final void method1861(byte arg0) {
        class230.field2676 = class348.method2071(8, 0.4F, 2048, 4, 8, 35, true, (byte) -128);
        field3894++;
        if (arg0 != -105) {
            method1859(-68, -106, -7, false, -92, true, -38);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 275)
    public final void method1862(byte arg0) {
        field3880++;
        int var2 = 0;
        if (arg0 < 99) {
            this.field3896 = 52;
        }
        while (this.field3884 > var2) {
            this.field3887[var2] = null;
            var2++;
        }
        this.field3879 = null;
        this.field3887 = null;
        this.field3885.method1728(29632);
        this.field3885 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZZI)V", line = 305)
    public static final void method1863(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field3889++;
        if (!arg2 && class443.field6427 == arg1 && class630.field9065 == arg0 && class316.field4035 == class122.field1278 || class654.field9334.field9858.method2982(-122) == 1) {
            return;
        }
        class443.field6427 = arg1;
        class316.field4035 = class122.field1278;
        class630.field9065 = arg0;
        if (class654.field9334.field9858.method2982(57) == 1) {
            class316.field4035 = 0;
        }
        method1860(true, arg4);
        class192.method1170(class720.field10104, true, -8069, class275.field3370, class486.field6916.method2936(class489.field6978, -99), class740.field10344);
        int var5 = class464.field6624;
        int var6 = class181.field2144;
        class464.field6624 = (class443.field6427 - (class489.field6976 >> 4)) * 8;
        class181.field2144 = (class630.field9065 - (class153.field1677 >> 4)) * 8;
        class228.field2654 = class656.method3739(class443.field6427 * 8, class630.field9065 * 8);
        class230.field2685 = null;
        int var7 = class464.field6624 - var5;
        int var8 = class181.field2144 - var6;
        if (arg4 == 11) {
            for (int var9 = 0; var9 < class529.field7533; var9++) {
                class151 var10 = class452.field6509[var9];
                if (var10 != null) {
                    class197 var11 = var10.field1661;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field7187[var12] -= var7;
                        var11.field7193[var12] -= var8;
                    }
                    var11.field4629 -= var8 * 512;
                    var11.field4635 -= var7 * 512;
                }
            }
        } else {
            class302.field3784 = 0;
            boolean var13 = false;
            int var14 = (class489.field6976 - 1) * 512;
            int var15 = class153.field1677 * 512 - 512;
            for (int var16 = 0; var16 < class529.field7533; var16++) {
                class151 var29 = class452.field6509[var16];
                if (var29 != null) {
                    class197 var30 = var29.field1661;
                    var30.field4629 -= var8 * 512;
                    var30.field4635 -= var7 * 512;
                    if (var30.field4635 >= 0 && var30.field4635 <= var14 && var30.field4629 >= 0 && var15 >= var30.field4629) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field7187[var32] -= var7;
                            var30.field7193[var32] -= var8;
                            if (var30.field7187[var32] < 0 || class489.field6976 <= var30.field7187[var32] || var30.field7193[var32] < 0 || var30.field7193[var32] >= class153.field1677) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class272.field3359[class302.field3784++] = var30.field7107;
                        } else {
                            var30.method1176(54, null);
                            var29.method864(12983);
                            var13 = true;
                        }
                    } else {
                        var30.method1176(113, null);
                        var13 = true;
                        var29.method864(12983);
                    }
                }
            }
            if (var13) {
                class529.field7533 = class253.field3052.method1752(0);
                class253.field3052.method1750(class452.field6509, 0);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class183 var27 = class75.field792[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field7187[var28] -= var7;
                    var27.field7193[var28] -= var8;
                }
                var27.field4629 -= var8 * 512;
                var27.field4635 -= var7 * 512;
            }
        }
        class210[] var18 = class115.field1203;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class210 var26 = var18[var19];
            if (var26 != null) {
                var26.field2470 -= var7 * 512;
                var26.field2479 -= var8 * 512;
            }
        }
        for (class752 var20 = (class752) class572.field8135.method1719(65280); var20 != null; var20 = (class752) class572.field8135.method1723(-20665)) {
            var20.field10517 -= var8;
            var20.field10512 -= var7;
            if (class614.field8787 != 4 && (var20.field10512 < 0 || var20.field10517 < 0 || class489.field6976 <= var20.field10512 || class153.field1677 <= var20.field10517)) {
                var20.method864(12983);
            }
        }
        if (class614.field8787 != 4) {
            for (class723 var21 = (class723) class450.field6490.method1753(0); var21 != null; var21 = (class723) class450.field6490.method1755(-89)) {
                int var22 = (int) (var21.field1522 & 0x3FFFL);
                int var23 = var22 - class464.field6624;
                int var24 = (int) (var21.field1522 >> 14 & 0x3FFFL);
                int var25 = var24 - class181.field2144;
                if (var23 < 0 || var25 < 0 || class489.field6976 <= var23 || var25 >= class153.field1677) {
                    var21.method864(12983);
                }
            }
        }
        if (class471.field6718 != 0) {
            class75.field796 -= var8;
            class471.field6718 -= var7;
        }
        class714.method3990(arg3);
        if (arg4 != 11) {
            class398.field5452 -= var8;
            class167.field1855 -= var7 * 512;
            class590.field8319 -= var8 * 512;
            class163.field1827 -= var7;
            class450.field6492 -= var8;
            class277.field3403 -= var7;
            if (Math.abs(var7) > class489.field6976 || Math.abs(var8) > class153.field1677) {
                class341.method2026(9349);
            }
        } else if (class496.field7014 == 4) {
            class559.field7986 -= var8 * 512;
            class496.field7015 -= var7 * 512;
            class175.field2062 -= var7 * 512;
            class246.field2994 -= var8 * 512;
        } else {
            class496.field7014 = 1;
            class406.field5556 = -1;
            class16.field147 = -1;
        }
        class311.method1849((byte) 7);
        class8.method33(-31239);
        class105.field1093.method1728(29632);
        class395.field5414.method1728(29632);
        class262.field3249.method2787(-38);
        class102.method710(0);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V", line = 635)
    public class313(int arg0, int arg1, int arg2) {
        this.field3893 = arg1;
        this.field3884 = arg0;
        this.field3879 = new class181[this.field3893];
        this.field3887 = new int[this.field3884][arg2];
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V", line = 579)
    public static final void method1864(int arg0, int arg1) {
        if (arg1 != 920447620) {
            method1859(81, 104, 1, false, 84, true, -37);
        }
        class30.field352 = arg0;
        class99.field1035 = -1;
        class469.field6702 = -1;
        field3891++;
        class674.method3838(arg1 ^ 0xC923157B);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 593)
    public static void method1865(int arg0) {
        field3888 = null;
        field3882 = null;
        field3883 = null;
        if (arg0 >= -66) {
            field3883 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)[[I", line = 605)
    public final int[][] method1866(byte arg0) {
        if (arg0 <= 120) {
            method1863(0, 41, true, false, -106);
        }
        field3878++;
        if (this.field3893 != this.field3884) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3884; var2++) {
            this.field3879[var2] = class741.field10363;
        }
        return this.field3887;
    }
}
