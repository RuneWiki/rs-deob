import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class49 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public int field697 = -1;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
    public boolean field709 = false;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
    private int[] field700 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "S")
    public static short field703 = 1;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljo;")
    public static class150 field701 = new class150();

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
    public static boolean field717 = false;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field720 = 0;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "Le;")
    public static class248 field718;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "Lsi;")
    public static class264 field719;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
    private int[] field708;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[S")
    private short[] field696;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "[S")
    private short[] field699;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[S")
    private short[] field705;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "[S")
    private short[] field712;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 7)
    public static void method359(byte arg0) {
        field719 = null;
        field701 = null;
        if (arg0 != -69) {
            field720 = -54;
        }
        field718 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILfh;B)V", line = 20)
    private final void method360(int arg0, class313 arg1, byte arg2) {
        if (arg2 != 68) {
            method363(-23, -93, 16, (byte) -73);
        }
        field706++;
        if (arg0 == 1) {
            this.field697 = arg1.method2224(-122);
        } else if (arg0 == 2) {
            int var8 = arg1.method2224(-128);
            this.field708 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field708[var9] = arg1.method2250(class185.method1279(arg2, -1613178356));
            }
        } else if (arg0 == 3) {
            this.field709 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method2224(arg2 - 189);
            this.field705 = new short[var4];
            this.field699 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field705[var5] = (short) arg1.method2250(-1613178296);
                this.field699[var5] = (short) arg1.method2250(arg2 - 1613178364);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method2224(-122);
            this.field696 = new short[var6];
            this.field712 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field696[var7] = (short) arg1.method2250(-1613178296);
                this.field712[var7] = (short) arg1.method2250(-1613178296);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field700[arg0 - 60] = arg1.method2250(arg2 - 1613178364);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILfh;)Lmk;", line = 99)
    public static final class28 method361(int arg0, class313 arg1) {
        field713++;
        if (arg0 != -2) {
            field720 = -112;
        }
        return new class28(arg1.method2214(0), arg1.method2214(arg0 ^ 0xFFFFFFFE), arg1.method2214(0), arg1.method2214(0), arg1.method2249(-101), arg1.method2249(arg0 ^ 0x38), arg1.method2224(arg0 - 118));
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method362(int arg0) {
        boolean var2 = true;
        field704++;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field700[var3] != -1 && !class293.field4859.method1498(this.field700[var3], -59, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIB)Llk;", line = 139)
    public static final class280 method363(int arg0, int arg1, int arg2, byte arg3) {
        field707++;
        int var4 = arg2 << 8 | arg1;
        if (arg3 > -107) {
            method363(-106, 42, -36, (byte) 67);
        }
        class280 var5 = (class280) class177.field2753.method1539(-58, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class249.field3959.method1513(class249.field3959.method1492(var4, 23730), true);
        if (var6 == null) {
            int var7 = arg1 | arg0 + 65536 << 8;
            class280 var8 = (class280) class177.field2753.method1539(-77, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class249.field3959.method1513(class249.field3959.method1492(var7, 23730), true);
            if (var9 == null) {
                int var10 = arg1 | 0xFFFF00;
                class280 var11 = (class280) class177.field2753.method1539(-70, (long) var10 << 16);
                if (var11 != null) {
                    return var11;
                }
                byte[] var12 = class249.field3959.method1513(class249.field3959.method1492(var10, 23730), true);
                if (var12 == null) {
                    return null;
                } else if (var12.length > 1) {
                    class280 var13 = class116.method755(1439220704, var12);
                    var13.field4609 = arg1;
                    class177.field2753.method1538(122, (long) var10 << 16, var13);
                    return var13;
                } else {
                    return null;
                }
            } else if (var9.length <= 1) {
                return null;
            } else {
                class280 var14 = class116.method755(1439220704, var9);
                var14.field4609 = arg1;
                class177.field2753.method1538(-77, (long) var7 << 16, var14);
                return var14;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class280 var15 = class116.method755(1439220704, var6);
            var15.field4609 = arg1;
            class177.field2753.method1538(-123, (long) var4 << 16, var15);
            return var15;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z", line = 215)
    public final boolean method364(int arg0) {
        field714++;
        if (this.field708 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field708.length; var3++) {
            if (!class293.field4859.method1498(this.field708[var3], 98, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 239)
    public static final void method365(int arg0) {
        int var1 = class124.method803(false);
        if (var1 == 0) {
            class138.field2175 = (byte[][][]) null;
            class29.method248(0, arg0 ^ 0xE0);
        } else if (var1 == 1) {
            class2.method9(127, (byte) 0);
            class29.method248(512, -103);
            if (class148.field2392 != null) {
                class26.method222(57);
            }
        } else {
            class2.method9(95, (byte) (class253.field4021 - 4 & 0xFF));
            class29.method248(2, 107);
        }
        if (arg0 != 255) {
            method367(0, 58);
        }
        class320.field5277 = class120.field1779;
        field698++;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lnb;", line = 276)
    public final class135 method366(byte arg0) {
        field716++;
        if (this.field708 == null) {
            return null;
        } else if (arg0 <= 121) {
            return (class135) null;
        } else {
            class135[] var2 = new class135[this.field708.length];
            for (int var3 = 0; var3 < this.field708.length; var3++) {
                var2[var3] = class135.method925(class293.field4859, this.field708[var3], 0);
            }
            class135 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class135(var2, var2.length);
            }
            if (this.field705 != null) {
                for (int var5 = 0; var5 < this.field705.length; var5++) {
                    var4.method904(this.field705[var5], this.field699[var5]);
                }
            }
            if (this.field696 != null) {
                for (int var6 = 0; var6 < this.field696.length; var6++) {
                    var4.method930(this.field696[var6], this.field712[var6]);
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I", line = 343)
    public static final int method367(int arg0, int arg1) {
        if (arg0 > -116) {
            return -106;
        } else {
            field710++;
            return arg1 >> 11 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)Lnb;", line = 354)
    public final class135 method368(boolean arg0) {
        field711++;
        class135[] var2 = new class135[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field700[var4] != -1) {
                var2[var3++] = class135.method925(class293.field4859, this.field700[var4], 0);
            }
        }
        class135 var5 = new class135(var2, var3);
        if (this.field705 != null) {
            for (int var6 = 0; var6 < this.field705.length; var6++) {
                var5.method904(this.field705[var6], this.field699[var6]);
            }
        }
        if (this.field696 != null) {
            for (int var7 = 0; var7 < this.field696.length; var7++) {
                var5.method930(this.field696[var7], this.field712[var7]);
            }
        }
        return arg0 ? (class135) null : var5;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lfh;I)V", line = 419)
    public final void method369(class313 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2224(-119);
            if (var3 == 0) {
                if (arg1 != 20755) {
                    this.field708 = (int[]) null;
                }
                field702++;
                return;
            }
            this.method360(var3, arg0, (byte) 68);
        }
    }
}
