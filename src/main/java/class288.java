import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class288 extends class145 {

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    private int field3855 = 4096;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    private int field3862 = 0;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    private int field3860 = 16;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    private int field3861 = 0;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    private int field3870 = 2000;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "Z")
    public static boolean field3859 = false;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "[I")
    public static int[] field3854 = new int[128];

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3857 = "flash3:";

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "Z")
    public static boolean field3866 = false;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3867 = "yellow:";

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3863 = "wave:";

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "Lps;")
    public static class395 field3865;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "Lrk;")
    public static class427 field3856;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Lrk;")
    public static class427 field3858;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field3855 = arg0.method1853(-124);
                        }
                    } else {
                        this.field3861 = arg0.method1853(85);
                    }
                } else {
                    this.field3860 = arg0.method1861((byte) -72);
                }
            } else {
                this.field3870 = arg0.method1853(111);
            }
        } else {
            this.field3862 = arg0.method1861((byte) -72);
        }
        ++field3872;
        int var5 = -106 % ((11 - arg1) / 52);
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
    public static final void method1817(int arg0) {
        class316.method2015(29770, class41.field630);
        ++field3871;
        int var1 = (class356.field4842 >> 10) + (class283.field3794 >> 3);
        if (arg0 == -1) {
            int var2 = (class374.field5261 >> 10) - -(class296.field3988 >> 3);
            byte var3 = 0;
            byte var4 = 8;
            byte var5 = 8;
            byte var6 = 18;
            class227.field3138 = new int[var6];
            class192.field2760 = new byte[var6][];
            class360.field4894 = new byte[var6][];
            class438.field6251 = new int[var6];
            class263.field3536 = new byte[var6][];
            class150.field2296 = new int[var6];
            class276.field3714 = new byte[var6][];
            class213.field2962 = new int[var6];
            class392.field5495 = new int[var6][4];
            class329.field4474 = new byte[var6][];
            class101.field1500 = new int[var6];
            class431.field6130 = new int[var6];
            int var7 = 0;
            for (int var8 = (-(class116.field1621 >> 4) + var1) / 8; var8 <= ((class116.field1621 >> 4) + var1) / 8; ++var8) {
                for (int var10 = (var2 - (class385.field5425 >> 4)) / 8; ~var10 >= ~(((class385.field5425 >> 4) + var2) / 8); ++var10) {
                    int var11 = (var8 << 8) + var10;
                    class101.field1500[var7] = var11;
                    class213.field2962[var7] = class23.field417.method2643("m" + var8 + "_" + var10, class331.method2109(arg0, 0));
                    class438.field6251[var7] = class23.field417.method2643("l" + var8 + "_" + var10, -1);
                    class227.field3138[var7] = class23.field417.method2643("n" + var8 + "_" + var10, arg0);
                    class150.field2296[var7] = class23.field417.method2643("um" + var8 + "_" + var10, -1);
                    class431.field6130[var7] = class23.field417.method2643("ul" + var8 + "_" + var10, -1);
                    if (class227.field3138[var7] == -1) {
                        class213.field2962[var7] = -1;
                        class438.field6251[var7] = -1;
                        class150.field2296[var7] = -1;
                        class431.field6130[var7] = -1;
                    }
                    ++var7;
                }
            }
            for (int var9 = var7; ~var9 > ~class227.field3138.length; ++var9) {
                class227.field3138[var9] = -1;
                class213.field2962[var9] = -1;
                class438.field6251[var9] = -1;
                class150.field2296[var9] = -1;
                class431.field6130[var9] = -1;
            }
            class257.method1673(var5, true, false, var2, true, var1, var3, var4);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
    public static void method1818(int arg0) {
        field3854 = null;
        field3863 = null;
        field3856 = null;
        field3867 = null;
        field3858 = null;
        field3857 = null;
        field3865 = null;
        if (arg0 != 128) {
            field3857 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field3868;
        class377.method2347(-101);
        if (arg0 != 77) {
            this.method2((class289) null, (byte) -87, -59);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field3864;
        int var3 = 70 % ((arg1 - 16) / 49);
        int[] var4 = super.field2218.method1614(60, arg0);
        if (super.field2218.field3396) {
            int var5 = this.field3855 >> 1;
            int[][] var6 = super.field2218.method1610(0);
            Random var7 = new Random((long) this.field3862);
            for (int var8 = 0; ~var8 > ~this.field3870; ++var8) {
                int var9 = this.field3855 <= 0 ? this.field3861 : this.field3861 - var5 - -class283.method1785((byte) 23, this.field3855, var7);
                int var10 = (4091 & var9) >> 4;
                int var11 = class283.method1785((byte) 23, class156.field2364, var7);
                int var12 = class283.method1785((byte) 23, class81.field1209, var7);
                int var13 = (class381.field5351[var10] * this.field3860 >> 12) + var11;
                int var14 = var12 - -(class100.field1444[var10] * this.field3860 >> 12);
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (~var16 != -1 || ~var15 != -1) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var17 = var15 > var16;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (~var11 < ~var13) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = var13 - var11;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = -(class283.method1785((byte) 23, 4096, var7) >> 2) + 1024;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var28 = var14 <= var12 ? -1 : 1;
                    for (int var29 = var11; var13 > var29; ++var29) {
                        int var30 = var27 - -((-var11 + var29) * var26) + 1024;
                        int var31 = class40.field606 & var29;
                        int var32 = var22 & class402.field5610;
                        var25 += var24;
                        if (!var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        if (~var25 < -1) {
                            var22 += var28;
                            var25 += -var23;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Lqi;")
    public static final class209 method1819(int arg0, byte arg1) {
        ++field3853;
        class410 var2 = class189.field2721;
        class209 var3;
        synchronized (class189.field2721) {
            var3 = (class209) class189.field2721.method2537(arg1 ^ -69, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else {
            if (arg1 != 105) {
                field3856 = null;
            }
            byte[] var4 = class260.field3511.method2633(class165.method1228(arg0, arg1 ^ 14784), -1, class325.method2068(arg0, arg1 ^ 23162));
            class209 var5 = new class209();
            var5.field2893 = arg0;
            if (var4 != null) {
                var5.method1444(new class289(var4), 0);
            }
            var5.method1442(9);
            class410 var6 = class189.field2721;
            synchronized (class189.field2721) {
                class189.field2721.method2542(var5, (byte) 50, (long) arg0);
                return var5;
            }
        }
    }
}
