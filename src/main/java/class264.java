import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class264 extends class123 {

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    private int field4690 = -1;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "Leb;")
    private static class230 field4689 = class68.method589(0, "red:");

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "Leb;")
    public static class230 field4687 = field4689;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
    public static volatile int field4693 = 0;

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Leb;")
    public static class230 field4694 = class68.method589(0, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "Leb;")
    public static class230 field4692 = field4689;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!g", name = "ob", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!g", name = "mb", descriptor = "[I")
    public int[] field4697;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public static void method1828(int arg0) {
        if (arg0 <= 42) {
            field4687 = null;
        }
        field4692 = null;
        field4687 = null;
        field4689 = null;
        field4694 = null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)Z")
    public final boolean method1829(boolean arg0) {
        ++field4684;
        if (this.field4697 != null) {
            return true;
        } else if (!arg0) {
            return true;
        } else if (~this.field4690 <= -1) {
            class10 var2 = class85.method684(this.field4690, (byte) -114, class197.field3538);
            var2.method91();
            this.field4696 = var2.field1463;
            this.field4697 = var2.field165;
            this.field4683 = var2.field1458;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLfk;)Lq;")
    public static final class123 method1830(byte arg0, class14 arg1) {
        arg1.method200(255);
        if (arg0 >= -46) {
            method1833(36, -56, (byte) 120);
        }
        ++field4682;
        int var2 = arg1.method200(255);
        class123 var3 = class168.method1241(22, var2);
        var3.field2156 = arg1.method200(255);
        int var4 = arg1.method200(255);
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            int var6 = arg1.method200(255);
            var3.method6(var6, arg1, 1876195788);
        }
        var3.method257(0);
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1831(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class30.field553 * 128) {
            arg0 = class30.field553 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class117.field2102 * 128) {
            arg2 = class117.field2102 * 128 - 1;
        }
        class47.field831 = class3.field21[arg3];
        class15.field354 = class3.field24[arg3];
        class21.field427 = class3.field21[arg4];
        class261.field4642 = class3.field24[arg4];
        class274.field4817 = arg0;
        class72.field1317 = arg1;
        class79.field1439 = arg2;
        class158.field2821 = arg0 / 128;
        class145.field2611 = arg2 / 128;
        class237.field4093 = class158.field2821 - class108.field1945;
        if (class237.field4093 < 0) {
            class237.field4093 = 0;
        }
        class167.field2951 = class145.field2611 - class108.field1945;
        if (class167.field2951 < 0) {
            class167.field2951 = 0;
        }
        class266.field4722 = class158.field2821 + class108.field1945;
        if (class266.field4722 > class30.field553) {
            class266.field4722 = class30.field553;
        }
        class68.field1273 = class145.field2611 + class108.field1945;
        if (class68.field1273 > class117.field2102) {
            class68.field1273 = class117.field2102;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class108.field1945 + class108.field1945 + 2; ++var16) {
            for (int var19 = 0; var19 < class108.field1945 + class108.field1945 + 2; ++var19) {
                int var20 = (var16 - class108.field1945 << 7) - (class274.field4817 & 127);
                int var21 = (var19 - class108.field1945 << 7) - (class79.field1439 & 127);
                int var22 = class158.field2821 - class108.field1945 + var16;
                int var23 = class145.field2611 - class108.field1945 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class30.field553 && var23 < class117.field2102) {
                    int var24;
                    if (class168.field2976 != null) {
                        var24 = class168.field2976[0][var22][var23] - class72.field1317 + 128;
                    } else {
                        var24 = class237.field4098[0][var22][var23] - class72.field1317 + 128;
                    }
                    int var25 = class237.field4098[3][var22][var23] - class72.field1317 - 1000;
                    class245.field4320[var16][var19] = class136.method1055(var20, var25, var24, var21, var15);
                } else {
                    class245.field4320[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class108.field1945 + class108.field1945 + 1; ++var17) {
            for (int var18 = 0; var18 < class108.field1945 + class108.field1945 + 1; ++var18) {
                class13.field255[var17][var18] = class245.field4320[var17][var18] || class245.field4320[var17 + 1][var18] || class245.field4320[var17][var18 + 1] || class245.field4320[var17 + 1][var18 + 1];
            }
        }
        class261.field4639 = arg6;
        class44.field785 = arg7;
        class244.field4191 = arg8;
        class110.field1971 = arg9;
        class169.field2986 = arg10;
        class163.method1218();
        if (class228.field3938 != null) {
            class182.method1313(true);
            class100.method855(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class182.method1313(false);
        }
        class100.method855(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static final void method1832(byte arg0) {
        class99.field1839 = new class245[class252.field4520.method1522(-128)][];
        ++field4686;
        if (arg0 != -44) {
            field4689 = null;
        }
        class128.field2237 = new boolean[class252.field4520.method1522(-124)];
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)I")
    public final int method968(int arg0) {
        if (arg0 <= 49) {
            method1831(62, -33, -60, 7, -90, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -100, (byte) -19, 16, -3);
        }
        ++field4688;
        return this.field4690;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(II)[[I")
    public int[][] method2(int arg0, int arg1) {
        ++field4700;
        if (arg1 != 26080) {
            return null;
        } else {
            int[][] var3 = super.field2152.method1106(arg0, arg1 + -33114);
            if (super.field2152.field2616 && this.method1829(true)) {
                int[] var4 = var3[0];
                int[] var5 = var3[2];
                int[] var6 = var3[1];
                int var7 = this.field4683 * (class255.field4540 != this.field4696 ? this.field4696 * arg0 / class255.field4540 : arg0);
                if (class140.field2505 != this.field4683) {
                    for (int var8 = 0; ~class140.field2505 < ~var8; ++var8) {
                        int var9 = this.field4683 * var8 / class140.field2505;
                        int var10 = this.field4697[var7 - -var9];
                        var5[var8] = class189.method1350(255, var10) << 4;
                        var6[var8] = class189.method1350(var10, 65280) >> 4;
                        var4[var8] = class189.method1350(4080, var10 >> 12);
                    }
                } else {
                    for (int var11 = 0; var11 < class140.field2505; ++var11) {
                        int var12 = this.field4697[var7++];
                        var5[var11] = class189.method1350(var12, 255) << 4;
                        var6[var11] = class189.method1350(65280, var12) >> 4;
                        var4[var11] = class189.method1350(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final void method961(boolean arg0) {
        ++field4699;
        super.method961(arg0);
        this.field4697 = null;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(IIB)V")
    public static final void method1833(int arg0, int arg1, byte arg2) {
        int var3 = arg1;
        if (~arg1 < -26) {
            var3 = 25;
        }
        --arg1;
        int var4 = class117.field2105[arg1];
        int var5 = class41.field757[arg1];
        ++field4691;
        if (~arg0 == -1) {
            ++class185.field3255;
            class153.field2747.method978(-127, 236);
            class153.field2747.method170((byte) 125, var3 + var3 + 3);
        }
        if (~arg0 == -2) {
            ++class226.field3907;
            class153.field2747.method978(-127, 207);
            class153.field2747.method170((byte) 113, var3 + var3 + 14 + 3);
        }
        if (~arg0 == -3) {
            class153.field2747.method978(-126, 84);
            class153.field2747.method170((byte) 127, var3 + 3 + var3);
            ++class164.field2920;
        }
        class153.field2747.method181(-20053, var4 - -class155.field2759);
        class153.field2747.method174(!class28.field515[82] ? 0 : 1, -18473);
        class16.field372 = class117.field2105[0];
        class227.field3918 = class41.field757[0];
        for (int var6 = 1; ~var3 < ~var6; ++var6) {
            --arg1;
            class153.field2747.method180(class41.field757[arg1] + -var5, -103);
            class153.field2747.method180(class117.field2105[arg1] + -var4, 65);
        }
        int var7 = 39 / ((-14 - arg2) / 63);
        class153.field2747.method192(var5 - -class272.field4795, false);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class264() {
        super(0, false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field4695;
        if (arg0 == 0) {
            this.field4690 = arg1.method161(4);
        }
        if (arg2 != 1876195788) {
            field4694 = null;
        }
    }
}
