import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class320 extends class141 {

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "Z")
    public boolean field4833 = false;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    private int field4837 = 0;

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "I")
    private int field4841 = -1;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    private int field4836 = 0;

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "I")
    private int field4852 = -32768;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public int field4828;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    private int field4849;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "Lgr;")
    private class379 field4838;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "[I")
    public static int[] field4832 = new int[3];

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "[J")
    public static long[] field4835 = new long[32];

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "J")
    public static long field4842 = 0L;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "Liq;")
    public static class134 field4840;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "Lmk;")
    private class336 field4834;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field4845;
        if (arg3 != 2) {
            this.method1957(-24, (class292) null, (class261) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4843;
        if (this.field4834 != null) {
            this.field4834.method2051();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLdr;)V")
    public static final void method1950(boolean arg0, class261 arg1) {
        ++field4851;
        if (arg0) {
            method1953(-53);
        }
        if (class55.field735.method2502(114) != 0) {
            if (~class405.field6032 != -1) {
                if (class136.field1816 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class136.field1816 = class261.method1619(true, var2, class79.field1043, 0, class362.field5334, 0);
                    class80.field1056 = class136.field1816.method410(class1.method14((byte) 113, class430.field6321, 0, class275.field4207), class4.method26(class427.field6274, class275.field4207, 0), true);
                }
                for (class450 var3 = (class450) class55.field735.method2514((byte) 61); var3 != null; var3 = (class450) class55.field735.method2511(-127)) {
                    class186.field2796.method1113(!var3.field6628 ? null : class113.field1500.field2443, var3.field6619, class80.field1056, 0, var3.field6630, arg1, var3.field6624, class136.field1816, false, var3.field6629, false, var3.field6622);
                    var3.method625((byte) -50);
                }
            } else {
                for (class450 var4 = (class450) class55.field735.method2514((byte) 61); var4 != null; var4 = (class450) class55.field735.method2511(-121)) {
                    class186.field2796.method1113(var4.field6628 ? class113.field1500.field2443 : null, var4.field6619, class284.field4334, 0, var4.field6630, arg1, var4.field6624, arg1, false, var4.field6629, false, var4.field6622);
                    var4.method625((byte) -50);
                }
                class141.method887((byte) -92);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        if (arg0 < -45) {
            ++field4853;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)I")
    public final int method120(boolean arg0) {
        if (arg0) {
            this.method1957(86, (class292) null, (class261) null);
        }
        ++field4854;
        return this.field4852;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILdr;I)Lwp;")
    private final class292 method1951(int arg0, class261 arg1, int arg2) {
        if (arg0 != 0) {
            this.finalize();
        }
        ++field4839;
        class195 var4 = class251.method1530(this.field4849, 125);
        return !this.field4833 ? var4.method1164(this.field4837, arg2, this.field4836, arg1, this.field4841, false) : var4.method1164(-1, arg2, 0, arg1, -1, false);
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        ++field4847;
        if (arg1 <= 114) {
            method1953(-94);
        }
        class292 var3 = this.method1951(0, arg0, 0);
        if (var3 != null) {
            this.method1957(1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field4828 = arg1 + arg2;
        this.field4849 = arg0;
        int var12 = class251.method1530(this.field4849, 116).field2950;
        if (~var12 == 0) {
            this.field4833 = true;
        } else {
            this.field4833 = false;
            this.field4838 = class98.method629(var12, (byte) -115);
        }
        if (~this.field4828 == ~arg2) {
            class251.method1528(false, this.field4837, super.field1892, super.field1900, this.field4838, super.field1902, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static final void method1952(int arg0) {
        ++field4844;
        class109.field1444.method1485(-22032);
        if (arg0 >= -19) {
            field4835 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
    public static void method1953(int arg0) {
        if (arg0 != 4) {
            method1953(85);
        }
        field4835 = null;
        field4840 = null;
        field4832 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)V")
    public final void method1954(int arg0, byte arg1) {
        ++field4829;
        if (!this.field4833) {
            this.field4836 += arg0;
            while (this.field4838.field5540[this.field4837] < this.field4836) {
                this.field4836 -= this.field4838.field5540[this.field4837];
                ++this.field4837;
                if (this.field4838.field5539.length <= this.field4837) {
                    this.field4833 = true;
                    break;
                }
            }
            if (arg1 >= -82) {
                method1953(91);
            }
            if (!this.field4833) {
                class251.method1528(false, this.field4837, super.field1892, super.field1900, this.field4838, super.field1902, (byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field4848;
        class292 var3 = this.method1951(arg1 + -7, arg0, 1024);
        if (arg1 != 7) {
            this.method117(false, 41, (class269) null, 50, 126, -73, (class261) null);
        }
        if (var3 == null) {
            return null;
        } else {
            class361 var4 = arg0.method434();
            var4.method611(super.field1900, super.field1888, super.field1892);
            if (this.field4834 == null) {
                var3.method1282(var4, (class158) null, 0);
            } else {
                class439 var5 = this.field4834.method2050();
                arg0.method369(var3, var5, var4, (class158) null, 0);
            }
            this.field4852 = var3.method1263();
            this.method1957(1, var3, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZLs;ILdr;[Lek;)V")
    public static final void method1955(int arg0, boolean arg1, class143 arg2, int arg3, class261 arg4, class375[] arg5) {
        ++field4830;
        if (!arg1) {
            for (int var6 = 0; var6 < 4; ++var6) {
                for (int var7 = 0; class115.field1522 > var7; ++var7) {
                    for (int var8 = 0; class198.field3004 > var8; ++var8) {
                        if ((class341.field5085[var6][var7][var8] & 1) != 0) {
                            int var9 = var6;
                            if (~(class341.field5085[1][var7][var8] & 2) != -1) {
                                var9 = var6 - 1;
                            }
                            if (~var9 <= -1) {
                                arg5[var9].method2249(var8, (byte) 42, var7);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class115.field1522][class198.field3004];
        for (int var11 = 0; ~arg0 < ~var11; ++var11) {
            for (int var13 = 0; ~var13 > ~class198.field3004; ++var13) {
                class145.field1943[var13] = 0;
                class68.field874[var13] = 0;
                class269.field4087[var13] = 0;
                class289.field4390[var13] = 0;
                class137.field1861[var13] = 0;
            }
            for (int var14 = -5; var14 < class115.field1522; ++var14) {
                for (int var15 = 0; class198.field3004 > var15; ++var15) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (class115.field1522 > var24) {
                        int var25 = 255 & class221.field3372[var11][var24][var15];
                        if (var25 > 0) {
                            class87 var26 = class90.method590(var25 - 1, 1);
                            class145.field1943[var15] += var26.field1216;
                            class68.field874[var15] += var26.field1219;
                            class269.field4087[var15] += var26.field1224;
                            class289.field4390[var15] += var26.field1218;
                            var10002 = class137.field1861[var15]++;
                        }
                    }
                    int var27 = var14 + -5;
                    if (var27 >= 0) {
                        int var28 = 255 & class221.field3372[var11][var27][var15];
                        if (var28 > 0) {
                            class87 var29 = class90.method590(var28 + -1, 1);
                            class145.field1943[var15] -= var29.field1216;
                            class68.field874[var15] -= var29.field1219;
                            class269.field4087[var15] -= var29.field1224;
                            class289.field4390[var15] -= var29.field1218;
                            var10002 = class137.field1861[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class198.field3004; ++var21) {
                        int var22 = var21 + 5;
                        if (~var22 > ~class198.field3004) {
                            var19 += class289.field4390[var22];
                            var20 += class137.field1861[var22];
                            var17 += class68.field874[var22];
                            var18 += class269.field4087[var22];
                            var16 += class145.field1943[var22];
                        }
                        int var23 = var21 + -5;
                        if (var23 >= 0) {
                            var17 -= class68.field874[var23];
                            var16 -= class145.field1943[var23];
                            var18 -= class269.field4087[var23];
                            var19 -= class289.field4390[var23];
                            var20 -= class137.field1861[var23];
                        }
                        if (var21 >= 0 && ~var19 < -1 && ~var20 < -1) {
                            var10[var14][var21] = class250.method1524(var18 / var20, var16 * 256 / var19, (byte) -124, var17 / var20);
                        }
                    }
                }
            }
            class161.method978(class198.field3004, class307.field4638[var11], class449.field6614[var11], var11, arg2, arg4, class221.field3372[var11], class115.field1522, (byte) 76, arg1, class45.field562[var11], class14.field172[var11], var10);
            class221.field3372[var11] = null;
            class449.field6614[var11] = null;
            class14.field172[var11] = null;
            class45.field562[var11] = null;
        }
        if (!arg1) {
            if (class451.field6650) {
                class36.method205();
            }
            if (class97.field1334 != 0) {
                class155.method965();
            }
        }
        for (int var12 = arg3; var12 < arg0; ++var12) {
            class307.field4638[var12].method101();
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        ++field4850;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
    public final void method1956(int arg0) {
        if (arg0 != 0) {
            this.field4841 = -35;
        }
        ++field4846;
        if (this.field4834 != null) {
            this.field4834.method2051();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        ++field4827;
        if (arg1 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILwp;Ldr;)V")
    private final void method1957(int arg0, class292 arg1, class261 arg2) {
        ++field4831;
        class219[] var4 = arg1.method1302();
        class95[] var5 = arg1.method1271();
        if ((this.field4834 == null || this.field4834.field4991) && (var4 != null || var5 != null)) {
            this.field4834 = new class336(class26.field332);
        }
        if (this.field4834 != null) {
            this.field4834.method2060(arg2, (long) class26.field332, var4, var5, false);
            this.field4834.method2049(super.field1902, super.field1895, super.field1890, super.field1901, super.field1889);
        }
        if (arg0 != 1) {
            this.field4841 = 54;
        }
    }
}
