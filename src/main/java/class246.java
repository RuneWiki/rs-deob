import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class246 extends class472 implements class562 {

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
    public final int method1219(byte arg0) {
        if (arg0 > -65) {
            this.field3549 = -73;
        }
        ++field3540;
        return super.field6665;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public final void method1556(int arg0) {
        if (arg0 > -35) {
            method1561((class208) null, (byte) 102);
        }
        super.field6663.method3154(this, 34963);
        ++field3547;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[BI)V")
    public final void method1220(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != -27252) {
            method1557(124);
        }
        ++field3538;
        this.method2842(arg2, true, arg1);
        this.field3549 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static final void method1557(int arg0) {
        ++field3542;
        if (arg0 == -1) {
            for (int var1 = 0; class427.field5745 > var1; ++var1) {
                int var2 = class444.field5987[var1];
                class571 var3 = ((class505) class510.field7260.method2799((long) var2, true)).field7148;
                int var4 = class632.field9278.method1032((byte) -33);
                if (~(8 & var4) != -1) {
                    var4 += class632.field9278.method1032((byte) -33) << 8;
                }
                if ((var4 & 32) != 0) {
                    int var5 = class632.field9278.method1055(arg0 ^ -1957696097);
                    int var6 = class632.field9278.method1005(11022);
                    var3.method954(var5, arg0 ^ 33, class617.field9123, var6);
                }
                if (~(var4 & 8192) != -1) {
                    int var7 = class632.field9278.method1046((byte) -43);
                    int[] var8 = new int[var7];
                    int[] var9 = new int[var7];
                    int[] var10 = new int[var7];
                    for (int var11 = 0; ~var7 < ~var11; ++var11) {
                        int var12 = class632.field9278.method1045(true);
                        if (var12 == 65535) {
                            var12 = -1;
                        }
                        var8[var11] = var12;
                        var9[var11] = class632.field9278.method1032((byte) -33);
                        var10[var11] = class632.field9278.method1016(17);
                    }
                    class184.method1282(var3, var10, (byte) -103, var8, var9);
                }
                if ((2 & var4) != 0) {
                    var3.field1867 = class632.field9278.method1023(-29153);
                    var3.field1902 = 100;
                }
                if (~(16 & var4) != -1) {
                    int var13 = class632.field9278.method1055(1957696096);
                    int var14 = class632.field9278.method1032((byte) -33);
                    var3.method954(var13, arg0 ^ 118, class617.field9123, var14);
                    var3.field1906 = class617.field9123 + 300;
                    var3.field1925 = class632.field9278.method1032((byte) -33);
                }
                if (~(var4 & 4) != -1) {
                    if (var3.field8405.method650(arg0 ^ -129)) {
                        class396.method2353(var3, 1840068472);
                    }
                    var3.method3405(class64.field797.method1177(class632.field9278.method1042((byte) 116), false), 44);
                    var3.method958(4, var3.field8405.field1237);
                    var3.field1851 = var3.field8405.field1247 << 3;
                    if (var3.field8405.method650(128)) {
                        class300.method1836((byte) 111, var3, (class145) null, var3.field8501, (class373) null, var3.field1957[0], var3.field1955[0], 0);
                    }
                }
                if ((128 & var4) != 0) {
                    var3.field1923 = class632.field9278.method1024(-253);
                    if (~var3.field1923 == -65536) {
                        var3.field1923 = -1;
                    }
                }
                if ((256 & var4) != 0) {
                    var3.field1889 = class632.field9278.method1062(arg0 + -21187);
                    var3.field1915 = class632.field9278.method1052((byte) -95);
                    var3.field1928 = class632.field9278.method1052((byte) 71);
                    var3.field1853 = class632.field9278.method1062(-21188);
                    var3.field1874 = class632.field9278.method1045(true) + class617.field9123;
                    var3.field1857 = class632.field9278.method1045(true) + class617.field9123;
                    var3.field1932 = class632.field9278.method1005(11022);
                    var3.field1953 = 1;
                    var3.field1928 += var3.field1957[0];
                    var3.field1889 += var3.field1957[0];
                    var3.field1853 += var3.field1955[0];
                    var3.field1947 = 0;
                    var3.field1915 += var3.field1955[0];
                }
                if ((var4 & 512) != 0) {
                    var3.field1905 = class632.field9278.method1052((byte) -103);
                    var3.field1881 = class632.field9278.method1068((byte) -127);
                    var3.field1875 = class632.field9278.method1068((byte) -127);
                    var3.field1855 = (byte) class632.field9278.method1005(11022);
                    var3.field1944 = class617.field9123 + class632.field9278.method1016(arg0 + 122);
                    var3.field1892 = class617.field9123 - -class632.field9278.method1024(-253);
                }
                if (~(4096 & var4) != -1) {
                    int var15 = class632.field9278.method1042((byte) 113);
                    var3.field1910 = class632.field9278.method1032((byte) -33);
                    var3.field1868 = class632.field9278.method1061(-124);
                    var3.field1870 = ~(32768 & var15) != -1;
                    var3.field1934 = var15 & 32767;
                    var3.field1922 = class617.field9123 - -var3.field1934 + var3.field1910;
                }
                if ((var4 & 2048) != 0) {
                    int var16 = class632.field9278.method1016(-7);
                    int var17 = class632.field9278.method1018(false);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    int var18 = class632.field9278.method1032((byte) -33);
                    var3.method948(var17, arg0 + -115, true, var18, var16);
                }
                if ((var4 & 1024) != 0) {
                    var3.field8416 = class632.field9278.method1045(true);
                    var3.field8402 = class632.field9278.method1016(125);
                }
                if ((var4 & 64) != 0) {
                    int var19 = class632.field9278.method1045(true);
                    if (~var19 == -65536) {
                        var19 = -1;
                    }
                    int var20 = class632.field9278.method1061(-124);
                    class561.method3379(var20, var19, 124, var3);
                }
                if ((1 & var4) != 0) {
                    int var21 = class632.field9278.method1024(-253);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    int var22 = class632.field9278.method1026(-917302120);
                    int var23 = class632.field9278.method1032((byte) -33);
                    var3.method948(var22, -64, false, var23, var21);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IC)Z")
    public static final boolean method1558(int arg0, char arg1) {
        ++field3548;
        if (arg0 != 32) {
            method1559(84, -52, 14, -51);
        }
        return arg1 >= '0' && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
    public final int method1218(int arg0) {
        ++field3539;
        if (arg0 >= -99) {
            this.method1218(116);
        }
        return this.field3549;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
    public static final void method1559(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -26184) {
            ++field3546;
            class146.field2114 = new byte[arg0][arg3][arg1];
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)V")
    public static final void method1560(String arg0, byte arg1, int arg2, String arg3) {
        class378.field5211 = 2;
        ++field3543;
        if (arg1 == -16) {
            class84.field1208 = arg2;
            class263.method1665(arg0, false, -122, arg3);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)J")
    public final long method1217(byte arg0) {
        ++field3541;
        int var2 = 32 / ((arg0 - -32) / 46);
        return 0L;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqa;B)V")
    public static final void method1561(class208 arg0, byte arg1) {
        if (arg1 <= -120) {
            if (!class398.field5469) {
                class379.method2260(arg0, -123);
            } else {
                class452.method2748((byte) -35, arg0);
            }
            ++field3544;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)I")
    public static final int method1562(int arg0, byte arg1) {
        ++field3545;
        int var2 = -128 % ((13 - arg1) / 63);
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lte;I[BIZ)V")
    public class246(class527 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3549 = arg1;
    }
}
