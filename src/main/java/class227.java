import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class227 extends class294 {

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    private int field3447 = 0;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Z")
    public boolean field3442 = false;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    private int field3427 = 0;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    private int field3426 = -1;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Z")
    private boolean field3450 = false;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    private int field3453 = -32768;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Lro;")
    private class111 field3451;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3429 = 0;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field3436 = 0;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3437 = 1;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Llg;")
    private class141 field3440;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[[I")
    public static int[][] field3428;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILua;Lng;)V", line = 5)
    public static final void method1574(int arg0, class103 arg1, class182 arg2) {
        field3435++;
        class270 var3 = arg1.method650((byte) 28);
        if (var3 == null) {
            return;
        }
        int var4 = var3.field2366;
        int var5 = arg2.field2747;
        int var6 = arg2.field2750;
        int var7 = 0;
        if (var3.field2361 > var3.field2366) {
            var4 = var3.field2361;
        }
        int var8 = 0;
        int var9 = 0;
        if (arg1.field1396 != null) {
            var7 = class344.field5463.method1681(arg1.field1396, (int[]) null, class212.field3214);
            for (int var10 = 0; var10 < var7; var10++) {
                String var11 = class212.field3214[var10];
                if ((var7 - 1) > var10) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class176.field2668.method1773(var11);
                if (var12 > var8) {
                    var8 = var12;
                }
            }
            var9 = (var7 - 1) * class176.field2668.method1768() + (class176.field2668.method1770() / 2);
        }
        int var13 = arg2.field2747;
        if (class336.field5367 + var4 > var5) {
            var13 = var8 / 2 + var4 / 2 + class336.field5367 + var4 + 5;
            var5 = class336.field5367 + var4;
        } else if (class336.field5365 - var4 < var5) {
            var5 = class336.field5365 - var4;
            var13 = class336.field5365 - (var4 / 2) - var4 - (var8 / 2) - 5;
        }
        if (arg0 <= 107) {
            return;
        }
        int var14 = arg2.field2750 - (var9 / 2);
        if (var6 < (class336.field5358 + var4)) {
            var6 = class336.field5358 + var4;
            var14 = var4 / 2 + (class336.field5358 + var4 + class176.field2668.method1768());
        } else if (var6 > (class336.field5359 - var4)) {
            var14 = class336.field5359 - (var4 / 2 + var9) - var4;
            var6 = class336.field5359 - var4;
        }
        int var15 = var4 >> 1;
        int var16 = -2;
        int var17 = (int) ((Math.atan2((double) (var5 - arg2.field2747), (double) (var6 - arg2.field2750)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var3.method1905(var3.field2369 << 3, var3.field2360 << 3, (var5 << 4) + var15, (var6 << 4) + var15, var17, 4096);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        if (arg1.field1396 != null) {
            var18 = var14 - class176.field2668.method1770() - 3;
            var16 = var13 - (var8 / 2) - 5;
            var19 = var8 + var16 + 10;
            var20 = class176.field2668.method1768() * var7 + var18;
            if (arg1.field1388 != 0) {
                class343.method2364(var16, var18, var19 - var16, -var18 + var20, arg1.field1388, arg1.field1388 >>> 24);
            }
            if (arg1.field1408 != 0) {
                class343.method2361(var16, var18, var19 - var16, -var18 + var20, arg1.field1408, arg1.field1408 >>> 24);
            }
            for (int var21 = 0; var21 < var7; var21++) {
                String var22 = class212.field3214[var21];
                if (var7 - 1 > var21) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class176.field2668.method1771(var22, var13, var14, arg1.field1394, true);
                var14 += class176.field2668.method1768();
            }
        }
        if ((var5 - var15) >= class197.field3009 || class197.field3009 >= (var5 + var15) || class128.field1873 <= (var6 - var15) || var6 + var15 <= class128.field1873 && class197.field3009 <= var16 || class197.field3009 >= var19 || class128.field1873 <= var18 || var20 <= class128.field1873) {
            return;
        }
        if (arg1.field1404[4] != null) {
            class67.method413(0, 0, -1, arg1.field1422, arg1.field1404[4], (short) 1008, (long) arg2.field2735, 0);
        }
        if (arg1.field1404[3] != null) {
            class67.method413(0, 0, -1, arg1.field1422, arg1.field1404[3], (short) 1003, (long) arg2.field2735, 0);
        }
        if (arg1.field1404[2] != null) {
            class67.method413(0, 0, -1, arg1.field1422, arg1.field1404[2], (short) 1011, (long) arg2.field2735, 0);
        }
        if (arg1.field1404[1] != null) {
            class67.method413(0, 0, -1, arg1.field1422, arg1.field1404[1], (short) 1005, (long) arg2.field2735, 0);
        }
        if (arg1.field1404[0] != null) {
            class67.method413(0, 0, -1, arg1.field1422, arg1.field1404[0], (short) 1007, (long) arg2.field2735, 0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 165)
    public final void method1575(int arg0, byte arg1) {
        if (arg1 >= -21) {
            this.field3442 = true;
        }
        field3443++;
        if (this.field3442) {
            return;
        }
        this.field3427 += arg0;
        while (this.field3451.field1524[this.field3447] < this.field3427) {
            this.field3427 -= this.field3451.field1524[this.field3447];
            this.field3447++;
            if (this.field3451.field1533.length <= this.field3447) {
                this.field3442 = true;
                break;
            }
        }
        if (!this.field3442) {
            class313.method2210(this.field3451, this.field3447, 50, this.field3433, false, this.field3438);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V", line = 198)
    public static final void method1576(int arg0, boolean arg1) {
        class315.field4950 = arg0;
        class168.field2579 = -1;
        class311.field4880 = -1;
        if (arg1) {
            method1577(-32);
        }
        field3445++;
        class349.method2424((byte) 115);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I", line = 212)
    public final int method417() {
        field3441++;
        return this.field3453;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 220)
    public static final void method1577(int arg0) {
        field3444++;
        class45.field517.method246((byte) 126);
        for (int var1 = 0; var1 < 32; var1++) {
            class304.field4736[var1] = 0L;
        }
        if (arg0 != -8588) {
            method1579(false);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class355.field5651[var2] = 0L;
        }
        class250.field3957 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V", line = 256)
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3452++;
        if (!this.field3450) {
            class362 var6 = this.method1578(13829);
            if (var6 == null) {
                return;
            }
            this.method1581(1, var6);
        }
        if (this.field3440 != null) {
            this.field3440.method984(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lbf;", line = 283)
    private final class362 method1578(int arg0) {
        if (arg0 != 13829) {
            field3436 = 88;
        }
        field3439++;
        class314 var2 = class255.method1803(this.field3448, (byte) -51);
        class362 var3;
        if (this.field3442) {
            var3 = var2.method2216(0, -1, -1, 41);
        } else {
            var3 = var2.method2216(this.field3427, this.field3426, this.field3447, 41);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 307)
    public static void method1579(boolean arg0) {
        field3428 = (int[][]) null;
        if (!arg0) {
            method1579(false);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 334)
    public static final int method1580(int arg0, int arg1) {
        field3446++;
        int var2 = arg1 >> 6 & 0x3;
        int var3 = arg1 & 0x3F;
        if (arg0 < 116) {
            field3437 = -67;
        }
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIJILlg;)V", line = 388)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10) {
        field3449++;
        class362 var13 = this.method1578(13829);
        if (var13 != null) {
            this.method1581(1, var13);
            var13.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3440);
            this.field3453 = var13.method417();
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIII)V", line = 471)
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3434 = arg1;
        this.field3431 = arg4;
        this.field3438 = arg2;
        this.field3448 = arg0;
        this.field3454 = arg5 + arg6;
        this.field3433 = arg3;
        int var8 = class255.method1803(this.field3448, (byte) -51).field4919;
        if (var8 == -1) {
            this.field3442 = true;
        } else {
            this.field3442 = false;
            this.field3451 = class289.method2067((byte) -67, var8);
        }
        if (this.field3454 == arg6) {
            class313.method2210(this.field3451, this.field3447, 50, this.field3433, false, this.field3438);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILbf;)V", line = 429)
    private final void method1581(int arg0, class362 arg1) {
        if (class272.field4317) {
            class124 var4 = (class124) arg1;
            if ((this.field3440 == null || this.field3440.field2175) && (var4.field1711 != null || var4.field1752 != null)) {
                this.field3440 = new class141(class102.field1381, 1, 1);
            }
            if (this.field3440 != null) {
                this.field3440.method983(var4.field1711, var4.field1752, false, var4.field1741, var4.field1723, var4.field1708);
            }
        } else {
            class133 var3 = (class133) arg1;
            if ((this.field3440 == null || this.field3440.field2175) && (var3.field1934 != null || var3.field1931 != null)) {
                this.field3440 = new class141(class102.field1381, 1, 1);
            }
            if (this.field3440 != null) {
                this.field3440.method983(var3.field1934, var3.field1931, false, var3.field1924, var3.field1923, var3.field1928);
            }
        }
        this.field3450 = true;
        field3430++;
        if (arg0 != 1) {
            this.field3440 = (class141) null;
        }
    }
}
