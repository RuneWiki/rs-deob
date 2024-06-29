import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class347 extends class725 {

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "Lmba;")
    public class646 field4932 = new class646();

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "Lgh;")
    public class50 field4939 = new class50();

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "Laea;")
    private class261 field4929;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "Lkr;")
    public static class602 field4930 = new class602(52, 6);

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "Lfv;")
    public static class718 field4936 = new class718();

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!hda", name = "y", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!hda", name = "A", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 6)
    public final void method366(int arg0) {
        this.field4939.method366(arg0);
        field4937++;
        for (class380 var2 = (class380) this.field4932.method3618(-102); var2 != null; var2 = (class380) this.field4932.method3619(0)) {
            if (!this.field4929.method1794(var2, -1347527508)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field5450) {
                        this.method2216(1048575, var2, var3);
                        var2.field5450 -= var3;
                        break;
                    }
                    this.method2216(1048575, var2, var2.field5450);
                    var3 -= var2.field5450;
                } while (!this.field4929.method1770(var3, 50, 0, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "([III)V", line = 45)
    public final void method360(int[] arg0, int arg1, int arg2) {
        field4933++;
        this.field4939.method360(arg0, arg1, arg2);
        for (class380 var4 = (class380) this.field4932.method3618(88); var4 != null; var4 = (class380) this.field4932.method3619(0)) {
            if (!this.field4929.method1794(var4, -1347527508)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field5450) {
                        this.method2219(var4, (byte) -108, arg0, var6, var5 + var6, var5);
                        var4.field5450 -= var5;
                        break;
                    }
                    this.method2219(var4, (byte) -109, arg0, var6, var5 + var6, var4.field5450);
                    var5 -= var4.field5450;
                    var6 += var4.field5450;
                } while (!this.field4929.method1770(var5, -126, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILafa;I)V", line = 85)
    private final void method2216(int arg0, class380 arg1, int arg2) {
        if ((this.field4929.field3820[arg1.field5447] & 0x4) != 0 && arg1.field5442 < 0) {
            int var4 = this.field4929.field3797[arg1.field5447] / class718.field9998;
            int var5 = (var4 + 1048575 - arg1.field5437) / var4;
            arg1.field5437 = arg2 * var4 + arg1.field5437 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4929.field3811[arg1.field5447] == 0) {
                    arg1.field5444 = class760.method4212(arg1.field5431, arg1.field5444.method4230(), arg1.field5444.method4213(), arg1.field5444.method4237());
                } else {
                    arg1.field5444 = class760.method4212(arg1.field5431, arg1.field5444.method4230(), 0, arg1.field5444.method4237());
                    this.field4929.method1783(-81, arg1, arg1.field5456.field4253[arg1.field5433] < 0);
                }
                if (arg1.field5456.field4253[arg1.field5433] < 0) {
                    arg1.field5444.method4242(-1);
                }
                arg2 = arg1.field5437 / var4;
            }
        }
        if (arg0 != 1048575) {
            this.method366(-77);
        }
        field4927++;
        arg1.field5444.method366(arg2);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;Z)V", line = 124)
    public static final void method2217(String arg0, int arg1, boolean arg2, String arg3, boolean arg4) {
        field4935++;
        class583 var5 = class385.method2413(0);
        var5.field7963.method444(class62.field912.field3032, 128);
        var5.field7963.method492(-2, 0);
        int var6 = var5.field7963.field956;
        var5.field7963.method492(-2, 641);
        int[] var7 = class702.method3962(-64, var5);
        int var8 = var5.field7963.field956;
        var5.field7963.method510(arg0, (byte) 61);
        var5.field7963.method492(-2, class593.field8043);
        var5.field7963.method510(arg3, (byte) 61);
        var5.field7963.method451(class350.field4971, (byte) 113);
        var5.field7963.method444(class120.field1576, 128);
        var5.field7963.method444(class289.field4140.field7713, 128);
        class255.method1735(arg2, var5.field7963);
        String var9 = class334.field4715;
        var5.field7963.method444(var9 == null ? 0 : 1, 128);
        if (var9 != null) {
            var5.field7963.method510(var9, (byte) 61);
        }
        var5.field7963.method444(arg1, 128);
        var5.field7963.method444(arg4 ? 1 : 0, 128);
        var5.field7963.field956 += 7;
        var5.field7963.method448(var5.field7963.field956, var7, var8, 32);
        var5.field7963.method501(arg2, var5.field7963.field956 - var6);
        class463.method2838(var5, (byte) 117);
        class210.field2748 = 1;
        class527.field7312 = 0;
        class332.field4708 = -3;
        class297.field4231 = 0;
        if (arg1 < 13) {
            class485.field6765 = true;
            class13.method61(-4006);
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "()Lco;", line = 174)
    public final class725 method358() {
        field4940++;
        class380 var1 = (class380) this.field4932.method3618(-59);
        if (var1 == null) {
            return null;
        } else if (var1.field5444 == null) {
            return this.method357();
        } else {
            return var1.field5444;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lco;", line = 191)
    public final class725 method357() {
        field4934++;
        class380 var1;
        do {
            var1 = (class380) this.field4932.method3619(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5444 == null);
        return var1.field5444;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V", line = 213)
    public static void method2218(boolean arg0) {
        field4930 = null;
        field4936 = null;
        if (arg0) {
            method2220(-20);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lafa;B[IIII)V", line = 226)
    private final void method2219(class380 arg0, byte arg1, int[] arg2, int arg3, int arg4, int arg5) {
        field4931++;
        if ((this.field4929.field3820[arg0.field5447] & 0x4) != 0 && arg0.field5442 < 0) {
            int var7 = this.field4929.field3797[arg0.field5447] / class718.field9998;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field5437) / var7;
                if (var8 > arg5) {
                    arg0.field5437 += arg5 * var7;
                    break;
                }
                arg0.field5444.method360(arg2, arg3, var8);
                arg5 -= var8;
                arg3 += var8;
                arg0.field5437 += var7 * var8 - 1048576;
                int var9 = class718.field9998 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class760 var11 = arg0.field5444;
                if (this.field4929.field3811[arg0.field5447] == 0) {
                    arg0.field5444 = class760.method4212(arg0.field5431, var11.method4230(), var11.method4213(), var11.method4237());
                } else {
                    arg0.field5444 = class760.method4212(arg0.field5431, var11.method4230(), 0, var11.method4237());
                    this.field4929.method1783(-119, arg0, arg0.field5456.field4253[arg0.field5433] < 0);
                    arg0.field5444.method4224(var9, var11.method4213());
                }
                if (arg0.field5456.field4253[arg0.field5433] < 0) {
                    arg0.field5444.method4242(-1);
                }
                var11.method4219(var9);
                var11.method360(arg2, arg3, arg4 - arg3);
                if (var11.method4232()) {
                    this.field4939.method359(var11);
                }
            }
        }
        if (arg1 >= -72) {
            this.field4929 = null;
        }
        arg0.field5444.method360(arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Laea;)V", line = 322)
    public class347(class261 arg0) {
        this.field4929 = arg0;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "()I", line = 299)
    public final int method355() {
        field4938++;
        return 0;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)Z", line = 311)
    public static final boolean method2220(int arg0) {
        if (arg0 < 0) {
            method2218(true);
        }
        field4928++;
        return class720.field10024;
    }
}
