import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class224 extends class265 {

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    private int field3867 = 0;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Z")
    public boolean field3859 = false;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    private int field3869 = -32768;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    private int field3879 = 0;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field3860;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lph;")
    private class78 field3868;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lp;")
    public static class280 field3876 = class18.method140((byte) -120, " <col=ffffff>");

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Z")
    public static boolean field3864 = false;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Lp;")
    public static class280 field3878 = class18.method140((byte) -120, " autres options");

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lbb;")
    public static class90 field3880 = new class90();

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lp;")
    public static class280 field3885 = class18.method140((byte) -127, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lak;")
    public static class137 field3884;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lla;")
    private class95 field3866;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Lua;")
    public static final class113 method1509(int arg0, int arg1, byte arg2) {
        int var3 = -9 % ((arg2 - 34) / 41);
        field3872++;
        class113 var4 = class233.method1569(65535, arg0);
        if (arg1 == -1) {
            return var4;
        } else if (var4 == null || var4.field1865 == null || var4.field1865.length <= arg1) {
            return null;
        } else {
            return var4.field1865[arg1];
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10) {
        class256 var13 = this.method1513(-1);
        field3863++;
        if (var13 != null) {
            var13.method427(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3866);
            this.field3869 = var13.method426();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public final void method1510(int arg0, int arg1) {
        field3871++;
        if (this.field3859) {
            return;
        }
        if (arg0 > -33) {
            method1509(39, -123, (byte) -113);
        }
        this.field3879 += arg1;
        while (this.field3879 > this.field3868.field1268[this.field3867]) {
            this.field3879 -= this.field3868.field1268[this.field3867];
            this.field3867++;
            if (this.field3868.field1275.length <= this.field3867) {
                this.field3859 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3865++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method1511(int arg0) {
        field3875++;
        int var1 = 0;
        if (arg0 < 92) {
            field3878 = null;
        }
        while (var1 < class204.field3543) {
            int var2 = class192.field3359[var1];
            class61 var3 = class46.field756[var2];
            int var4 = class20.field367.method189((byte) -103);
            if ((var4 & 0x4) != 0) {
                int var5 = class20.field367.method217(true);
                int var6 = class20.field367.method189((byte) -103);
                var3.method1838(var6, class117.field2104, var5, (byte) -17);
                var3.field4835 = class117.field2104 + 300;
                var3.field4840 = class20.field367.method220(true);
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class20.field367.method213((byte) 113);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class20.field367.method187(2);
                boolean var9 = true;
                if (var7 != -1 && var3.field4827 != -1 && class207.method1401((byte) -22, class199.method1368(-940, var7).field4210).field1288 < class207.method1401((byte) -22, class199.method1368(-940, var3.field4827).field4210).field1288) {
                    var9 = false;
                }
                if (var9) {
                    var3.field4800 = (var8 & 0xFFFF) + class117.field2104;
                    var3.field4823 = var8 >> 16;
                    var3.field4827 = var7;
                    var3.field4790 = 0;
                    var3.field4857 = 0;
                    if (class117.field2104 < var3.field4800) {
                        var3.field4857 = -1;
                    }
                    if (var3.field4827 != -1 && class117.field2104 == var3.field4800) {
                        int var10 = class199.method1368(-940, var3.field4827).field4210;
                        if (var10 != -1) {
                            class78 var11 = class207.method1401((byte) -22, var10);
                            if (var11 != null && var11.field1275 != null) {
                                class150.method1034(var3.field4793, false, var11, 0, var3.field4791, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field4797 = class20.field367.method198(false);
                var3.field4789 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field4829 = class20.field367.method212((byte) -50);
                if (var3.field4829 == 65535) {
                    var3.field4829 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field4812 = class20.field367.method213((byte) 113);
                var3.field4832 = class20.field367.method193((byte) 77);
            }
            if ((var4 & 0x1) != 0) {
                int var12 = class20.field367.method217(true);
                int var13 = class20.field367.method217(true);
                var3.method1838(var13, class117.field2104, var12, (byte) 42);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field987.method1712((byte) 70)) {
                    class268.method1799(-23980, var3);
                }
                var3.method432(class265.method1785(class20.field367.method212((byte) -50), true), 1);
                var3.method1843(103, var3.field987.field4489);
                var3.field4834 = var3.field987.field4472;
                var3.field4850 = var3.field987.field4510;
                var3.field4855 = var3.field987.field4479;
                var3.field4854 = var3.field987.field4520;
                var3.field4860 = var3.field987.field4475;
                var3.field4858 = var3.field987.field4468;
                var3.field4843 = var3.field987.field4499;
                var3.field4822 = var3.field987.field4462;
                if (var3.field987.method1712((byte) 120)) {
                    class127.method877(var3.field4792[0], var3.field4837[0], 128, class231.field4013, (class142) null, 0, var3, (class130) null);
                }
            }
            if ((var4 & 0x40) != 0) {
                int var14 = class20.field367.method193((byte) 77);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = class20.field367.method211(false);
                class57.method413(var15, var14, false, var3);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
    public final int method426() {
        field3877++;
        return this.field3869;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    public static void method1512(boolean arg0) {
        field3884 = null;
        field3880 = null;
        if (arg0) {
            field3885 = null;
        }
        field3878 = null;
        field3885 = null;
        field3876 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Lik;")
    private final class256 method1513(int arg0) {
        field3873++;
        class241 var2 = class199.method1368(-940, this.field3861);
        if (arg0 != -1) {
            method1511(-85);
        }
        class256 var3;
        if (this.field3859) {
            var3 = var2.method1637(-1, -50);
        } else {
            var3 = var2.method1637(this.field3867, -50);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)V")
    public static final void method1514(boolean arg0) {
        if (arg0) {
            method1509(17, 97, (byte) 90);
        }
        class103.field1721.method102(-1);
        field3883++;
        for (int var1 = 0; var1 < 32; var1++) {
            class228.field3954[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class194.field3421[var2] = 0L;
        }
        class253.field4442 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIIIII)V")
    public class224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3860 = arg4;
        this.field3881 = arg3;
        this.field3862 = arg1;
        this.field3870 = arg2;
        this.field3861 = arg0;
        this.field3874 = arg6 + arg5;
        int var8 = class199.method1368(-940, this.field3861).field4210;
        if (var8 == -1) {
            this.field3859 = true;
        } else {
            this.field3859 = false;
            this.field3868 = class207.method1401((byte) -22, var8);
        }
    }
}
