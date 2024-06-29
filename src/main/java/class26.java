import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class26 extends class254 {

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Z")
    public volatile boolean field343 = true;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lcf;")
    public static class93 field335 = class147.method1066("Abbrechen", -48);

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "Lcf;")
    public static class93 field339 = class147.method1066("Null", -48);

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lcf;")
    public static class93 field338 = class147.method1066("Interfaces charg-Bes", -48);

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field336 = -1;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Lcf;")
    public static class93 field347 = class147.method1066("Eingabeprozedur geladen)3", -48);

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field348 = 0;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lcf;")
    public static class93 field340 = class147.method1066("(U0a )2 in: ", -48);

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Lij;")
    public static class195 field345;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Z")
    public boolean field337;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Z")
    public boolean field346;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static void method140(int arg0) {
        field345 = null;
        field347 = null;
        field339 = null;
        field338 = null;
        field335 = null;
        if (arg0 != -9043) {
            method142(24, 98, -51, (class237) null);
        }
        field340 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
    public abstract int method141(boolean arg0);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILs;)V")
    public static final void method142(int arg0, int arg1, int arg2, class237 arg3) {
        if ((arg1 & 0x80) != 0) {
            int var4 = class250.field4504.method1876((byte) -82);
            byte[] var5 = new byte[var4];
            class280 var6 = new class280(var5);
            class250.field4504.method1910(var5, 0, var4, (byte) 124);
            class72.field1301[arg0] = var6;
            arg3.method1617((byte) -42, var6);
        }
        field334++;
        if ((arg1 & 0x20) != 0) {
            arg3.field3792 = class250.field4504.method1889((byte) -67);
            if (arg3.field3792.method645(arg2 ^ 0xFFFFF815, 0) == 126) {
                arg3.field3792 = arg3.field3792.method637(94, 1);
                class263.method1764(2, (byte) -116, arg3.method1616((byte) 52), arg3.field3792);
            } else if (class166.field2927 == arg3) {
                class263.method1764(2, (byte) -116, arg3.method1616((byte) 52), arg3.field3792);
            }
            arg3.field3810 = 0;
            arg3.field3835 = 0;
            arg3.field3773 = 150;
        }
        if ((arg1 & 0x400) != 0) {
            int var7 = class250.field4504.method1890(false);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class250.field4504.method1872(101);
            boolean var9 = true;
            if (var7 != -1 && arg3.field3846 != -1 && class131.method964(class188.method1359(var7, arg2 + 1740).field2352, true).field475 < class131.method964(class188.method1359(arg3.field3846, arg2 + 1768).field2352, true).field475) {
                var9 = false;
            }
            if (var9) {
                arg3.field3847 = 0;
                arg3.field3802 = (var8 & 0xFFFF) + class275.field4921;
                arg3.field3846 = var7;
                arg3.field3798 = 0;
                arg3.field3844 = var8 >> 16;
                arg3.field3829 = 1;
                if (arg3.field3802 > class275.field4921) {
                    arg3.field3847 = -1;
                }
                if (arg3.field3846 != -1 && class275.field4921 == arg3.field3802) {
                    int var10 = class188.method1359(arg3.field3846, -126).field2352;
                    if (var10 != -1) {
                        class31 var11 = class131.method964(var10, true);
                        if (var11 != null && var11.field479 != null) {
                            class55.method309(arg3.field3784, 0, var11, arg3.field3868, -17474, class166.field2927 == arg3);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x40) != 0) {
            int var12 = class250.field4504.method1890(false);
            int var13 = class250.field4504.method1876((byte) -82);
            int var14 = class250.field4504.method1879(1483502360);
            int var15 = class250.field4504.field5027;
            boolean var16 = (var12 & 0x8000) != 0;
            if (arg3.field4247 != null && arg3.field4249 != null) {
                long var17 = arg3.field4247.method679((byte) 52);
                boolean var19 = false;
                if (var13 <= 1) {
                    if (!var16 && (class3.field36 && !class67.field1224 || class19.field259)) {
                        var19 = true;
                    } else {
                        for (int var20 = 0; var20 < class284.field5098; var20++) {
                            if (class223.field4025[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var19 && class120.field2126 == 0) {
                    class41.field642.field5027 = 0;
                    int var21 = -1;
                    class250.field4504.method1902(0, class41.field642.field5011, var14, -28761);
                    class41.field642.field5027 = 0;
                    class93 var23;
                    if (var16) {
                        var12 &= 0x7FFF;
                        class95 var22 = class89.method615((byte) 126, class41.field642);
                        var21 = var22.field1712;
                        var23 = var22.field1715.method413(5383, class41.field642);
                    } else {
                        var23 = class274.method1815(class52.method285(32767, class41.field642).method672(958045282));
                    }
                    arg3.field3792 = var23.method671(false);
                    arg3.field3773 = 150;
                    arg3.field3835 = var12 >> 8;
                    arg3.field3810 = var12 & 0xFF;
                    if (var13 == 2) {
                        class260.method1753((class93) null, var23, class130.method949((byte) -77, new class93[] { class30.field451, arg3.method1616((byte) 52) }), var21, arg2 - 2438, var16 ? 17 : 1);
                    } else if (var13 == 1) {
                        class260.method1753((class93) null, var23, class130.method949((byte) -77, new class93[] { class288.field5150, arg3.method1616((byte) 52) }), var21, -4252, var16 ? 17 : 1);
                    } else {
                        class260.method1753((class93) null, var23, arg3.method1616((byte) 52), var21, -4252, var16 ? 17 : 2);
                    }
                }
            }
            class250.field4504.field5027 = var14 + var15;
        }
        if ((arg1 & 0x800) != 0) {
            int var24 = class250.field4504.method1924(8100);
            int var25 = class250.field4504.method1895(arg2 + 1915);
            arg3.method1485(class275.field4921, var25, (byte) -126, var24);
        }
        if ((arg1 & 0x100) != 0) {
            int var26 = class250.field4504.method1907(16832);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int[] var29 = new int[var26];
            for (int var30 = 0; var30 < var26; var30++) {
                int var31 = class250.field4504.method1877((byte) -26);
                if (var31 == 65535) {
                    var31 = -1;
                }
                var27[var30] = var31;
                var28[var30] = class250.field4504.method1879(class175.method1248(arg2, -1483502606));
                var29[var30] = class250.field4504.method1909((byte) 109);
            }
            class237.method1612(arg3, var27, false, var28, var29);
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field3841 = class250.field4504.method1909((byte) 27);
            if (arg3.field3841 == 65535) {
                arg3.field3841 = -1;
            }
        }
        if ((arg1 & 0x200) != 0) {
            arg3.field3851 = class250.field4504.method1876((byte) -82);
            arg3.field3781 = class250.field4504.method1895(111);
            arg3.field3780 = class250.field4504.method1907(16832);
            arg3.field3818 = class250.field4504.method1879(1483502360);
            arg3.field3804 = class250.field4504.method1877((byte) -26) + class275.field4921;
            arg3.field3833 = class250.field4504.method1877((byte) -26) + class275.field4921;
            arg3.field3794 = class250.field4504.method1895(115);
            arg3.field3870 = 1;
            arg3.field3785 = 0;
        }
        if (arg2 != -1814) {
            return;
        }
        if ((arg1 & 0x1) != 0) {
            int var32 = class250.field4504.method1924(8100);
            int var33 = class250.field4504.method1876((byte) -82);
            arg3.method1485(class275.field4921, var33, (byte) -107, var32);
            arg3.field3772 = class275.field4921 + 300;
            arg3.field3855 = class250.field4504.method1879(arg2 + 1483504174);
        }
        if ((arg1 & 0x10) != 0) {
            int var34 = class250.field4504.method1909((byte) 30);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = class250.field4504.method1876((byte) -82);
            class113.method812(32, var34, arg3, var35);
        }
        if ((arg1 & 0x2) != 0) {
            arg3.field3865 = class250.field4504.method1909((byte) 42);
            arg3.field3826 = class250.field4504.method1891(-114);
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public static final void method143(int arg0) {
        class54.field889 = arg0;
        for (int var1 = 0; var1 < class210.field3821; var1++) {
            for (int var2 = 0; var2 < class256.field4623; var2++) {
                if (class232.field4138[arg0][var1][var2] == null) {
                    class232.field4138[arg0][var1][var2] = new class41(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)[B")
    public abstract byte[] method144(int arg0);
}
