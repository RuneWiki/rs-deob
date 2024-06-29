import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class226 {

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Lvd;")
    private class15 field3908 = new class15();

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Lwa;")
    private class219 field3900;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3894 = 0;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "[I")
    public static int[] field3898 = new int[50];

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field3903 = 0;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Lsb;")
    private static class98 field3907 = class47.method368("flash3:", 0);

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lsb;")
    public static class98 field3906 = class47.method368("blinken1:", 0);

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lsb;")
    public static class98 field3891 = field3907;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lsb;")
    public static class98 field3892 = field3907;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[I")
    public static int[] field3889;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public final void method1554(byte arg0) {
        field3896++;
        this.field3908.method119((byte) 107);
        this.field3900.method1517((byte) -60);
        if (arg0 != -109) {
            field3892 = null;
        }
        this.field3899 = this.field3893;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static void method1555(boolean arg0) {
        if (!arg0) {
            field3891 = null;
        }
        field3889 = null;
        field3891 = null;
        field3898 = null;
        field3892 = null;
        field3907 = null;
        field3906 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class14.field278 * arg0 + class136.field2411 * arg3 >> 16;
        int var6 = class14.field278 * arg3 - class136.field2411 * arg0 >> 16;
        int var7 = class46.field778 * arg1 + class189.field3264 * var6 >> 16;
        int var8 = class189.field3264 * arg1 - class46.field778 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class46.field778 * arg2 + class189.field3264 * var6 >> 16;
        int var12 = class189.field3264 * arg2 - class46.field778 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class170.field2996 && var13 < class170.field2996) {
            return false;
        } else if (var9 > class47.field786 && var13 > class47.field786) {
            return false;
        } else if (var10 < class107.field1922 && var14 < class107.field1922) {
            return false;
        } else {
            return var10 <= class47.field790 || var14 <= class47.field790;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V")
    public final void method1557(long arg0, int arg1) {
        if (arg1 != 0) {
            method1559(-30, 104, 104, 61, 101, -60, -12);
        }
        field3890++;
        class158 var4 = (class158) this.field3900.method1511((byte) -128, arg0);
        if (var4 != null) {
            var4.method1611((byte) -10);
            var4.method1368((byte) 3);
            this.field3899++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lbi;")
    public static final class167 method1558(int arg0) {
        field3901++;
        int var1 = -65 % ((-arg0 - 41) / 63);
        try {
            return (class167) Class.forName("qi").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3904++;
        if (arg4 != 9) {
            method1556(110, 28, -39, -99, -122);
        }
        int var7 = class47.method369(2, arg0, class116.field2077, class215.field3666);
        int var8 = class47.method369(2, arg5, class116.field2077, class215.field3666);
        int var9 = class47.method369(2, arg2, class229.field3933, class106.field1899);
        int var10 = class47.method369(2, arg1, class229.field3933, class106.field1899);
        int var11 = class47.method369(arg4 - 7, arg0 + arg3, class116.field2077, class215.field3666);
        int var12 = class47.method369(2, arg5 - arg3, class116.field2077, class215.field3666);
        for (int var13 = var7; var13 < var11; var13++) {
            class37.method305(-7, class43.field721[var13], var10, arg6, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class37.method305(-7, class43.field721[var14], var10, arg6, var9);
        }
        int var15 = class47.method369(2, arg2 + arg3, class229.field3933, class106.field1899);
        int var16 = class47.method369(2, arg1 - arg3, class229.field3933, class106.field1899);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class43.field721[var17];
            class37.method305(arg4 - 16, var18, var15, arg6, var9);
            class37.method305(-7, var18, var10, arg6, var16);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lsb;Lsb;SBIIJ)V")
    public static final void method1560(class98 arg0, class98 arg1, short arg2, byte arg3, int arg4, int arg5, long arg6) {
        field3905++;
        int var8 = 91 / ((arg3 - 59) / 53);
        if (class97.field1672 || field3894 >= 500) {
            return;
        }
        class112.field1994[field3894] = arg1;
        class217.field3751[field3894] = arg0;
        class212.field3630[field3894] = arg2;
        class88.field1569[field3894] = arg6;
        class182.field3138[field3894] = arg5;
        class129.field2309[field3894] = arg4;
        field3894++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)V")
    public final void method1561(int arg0, int arg1) {
        field3895++;
        if (class61.field1025 != null) {
            for (class158 var3 = (class158) this.field3908.method129(0); var3 != null; var3 = (class158) this.field3908.method123(true)) {
                if (var3.method349((byte) -122)) {
                    if (var3.method351(false) == null) {
                        var3.method1611((byte) 28);
                        var3.method1368((byte) 3);
                        this.field3899++;
                    }
                } else if (((long) arg1) < (++var3.field3439)) {
                    class158 var4 = class61.field1025.method457(var3, 3000);
                    this.field3900.method1513(var3.field4061, var4, -1);
                    class218.method1501(var4, -789221, var3);
                    var3.method1611((byte) 92);
                    var3.method1368((byte) 3);
                }
            }
        }
        if (arg0 >= -51) {
            field3889 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1562(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3902++;
        if (arg1) {
            method1560((class98) null, (class98) null, (short) -3, (byte) -117, 114, -81, 100L);
        }
        if (class141.method1056(arg4, (byte) -94)) {
            client.method777(class33.field585[arg4], -1, arg3, arg7, arg0, arg5, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method1563(long arg0, int arg1, Object arg2) {
        if (arg1 != 21771) {
            field3891 = null;
        }
        this.method1557(arg0, 0);
        field3888++;
        if (this.field3899 == 0) {
            class158 var5 = (class158) this.field3908.method130(7918);
            var5.method1611((byte) -128);
            var5.method1368((byte) 3);
        } else {
            this.field3899--;
        }
        class44 var6 = new class44(arg2);
        this.field3900.method1513(arg0, var6, -1);
        this.field3908.method128(16, var6);
        var6.field3439 = 0L;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1564(long arg0, int arg1) {
        class158 var4 = (class158) this.field3900.method1511((byte) -127, arg0);
        if (arg1 != 0) {
            field3891 = null;
        }
        field3897++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method351(false);
        if (var5 == null) {
            var4.method1611((byte) -128);
            var4.method1368((byte) 3);
            this.field3899++;
            return null;
        }
        if (var4.method349((byte) -122)) {
            class44 var6 = new class44(var5);
            this.field3900.method1513(var4.field4061, var6, -1);
            this.field3908.method128(16, var6);
            var6.field3439 = 0L;
            var4.method1611((byte) -128);
            var4.method1368((byte) 3);
        } else {
            this.field3908.method128(16, var4);
            var4.field3439 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final void method1565(int arg0) {
        if (arg0 != -1) {
            this.method1557(-98L, -53);
        }
        field3887++;
        for (class158 var2 = (class158) this.field3908.method129(0); var2 != null; var2 = (class158) this.field3908.method123(true)) {
            if (var2.method349((byte) -122)) {
                var2.method1611((byte) 3);
                var2.method1368((byte) 3);
                this.field3899++;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I)V")
    public class226(int arg0) {
        this.field3899 = arg0;
        int var2 = 1;
        this.field3893 = arg0;
        while (arg0 > (var2 + var2)) {
            var2 += var2;
        }
        this.field3900 = new class219(var2);
    }
}
