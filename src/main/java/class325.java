import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class325 extends class190 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field4444 = -1;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lea;")
    public class325 field4445;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lea;")
    public class325 field4449;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static final void method2086(int arg0) {
        if (arg0 == -20548) {
            field4446++;
            class341.field4664.method90(((float) class361.field5000 * 0.1F + 0.7F) * class170.field2325);
            class341.field4664.method67(class99.field1370, class380.field5430, class7.field112, (float) class241.field3431, (float) class318.field4336, (float) class314.field4302);
            class341.field4664.method130(class382.field5450);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final void method2087(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field4452++;
        if (this.field4445 != null) {
            this.field4445.field4449 = this.field4449;
            this.field4449.field4445 = this.field4445;
            this.field4449 = null;
            this.field4445 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public static final void method2088(int arg0) {
        for (int var1 = 0; var1 < class108.field1556; var1++) {
            int var10002 = class156.field2199[var1]--;
            if (class156.field2199[var1] >= -10) {
                class330 var3 = class228.field3321[var1];
                if (var3 == null) {
                    var3 = class330.method2128(class130.field1829, class406.field5777[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class156.field2199[var1] += var3.method2129();
                    class228.field3321[var1] = var3;
                }
                if (class156.field2199[var1] < 0) {
                    int var4;
                    if (class428.field6063[var1] == 0) {
                        var4 = class123.field1702[var1] * class371.field5212 >> 8;
                    } else {
                        int var5 = (class428.field6063[var1] & 0xFF) * 128;
                        int var6 = (class428.field6063[var1] & 0xFF63CB) >> 16;
                        int var7 = var6 * 128 + 64 - class412.field5841.field6262;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (class428.field6063[var1] & 0xFF67) >> 8;
                        int var9 = var8 * 128 + 64 - class412.field5841.field6266;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class156.field2199[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class345.field4692 * class123.field1702[var1] / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class256 var11 = var3.method2131().method1698(class64.field957);
                        class421 var12 = class421.method2655(var11, 100, var4);
                        var12.method2679(class59.field810[var1] - 1);
                        class164.field2266.method2792(var12);
                    }
                    class156.field2199[var1] = -100;
                }
            } else {
                class108.field1556--;
                for (int var2 = var1; var2 < class108.field1556; var2++) {
                    class406.field5777[var2] = class406.field5777[var2 + 1];
                    class228.field3321[var2] = class228.field3321[var2 + 1];
                    class59.field810[var2] = class59.field810[var2 + 1];
                    class156.field2199[var2] = class156.field2199[var2 + 1];
                    class428.field6063[var2] = class428.field6063[var2 + 1];
                    class123.field1702[var2] = class123.field1702[var2 + 1];
                }
                var1--;
            }
        }
        field4442++;
        if (class429.field6078 && !class326.method2096((byte) 121)) {
            if (class52.field731 != 0 && class434.field6125 != -1) {
                class170.method1122(class52.field731, 1, 0, class362.field5004, false, class434.field6125);
            }
            class429.field6078 = false;
        } else if (class52.field731 != 0 && class434.field6125 != -1 && !class326.method2096((byte) 125)) {
            class334.field4600++;
            class46.field648.method1178(63, 89);
            class46.field648.method155(15489, class434.field6125);
            class434.field6125 = -1;
        }
        if (arg0 != -3925) {
            method2091(true, (Object) null, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Lvq;")
    public static final class269 method2089(int arg0, byte arg1) {
        field4443++;
        class131 var2 = class304.field4200;
        class269 var3;
        synchronized (class304.field4200) {
            var3 = (class269) class304.field4200.method904(false, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg1 != 58) {
            field4448 = 112;
        }
        byte[] var4 = class170.field2334.method1745(class125.method853(arg0, true), (byte) 69, class333.method2138((byte) 111, arg0));
        class269 var5 = new class269();
        if (var4 != null) {
            var5.method1770(new class11(var4), 42);
        }
        class131 var6 = class304.field4200;
        synchronized (class304.field4200) {
            class304.field4200.method902((long) arg0, (byte) 112, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lvd;ZZI)V")
    public static final void method2090(class26 arg0, boolean arg1, boolean arg2, int arg3) {
        field4447++;
        int var4 = arg0.field463;
        int var5 = (int) arg0.field5600;
        arg0.method2467((byte) -55);
        if (arg1) {
            class117.method809(var4, (byte) 46);
        }
        class184.method1202(var4, 1361880513);
        class453 var6 = class442.method2767(var5, -1229996208);
        if (var6 != null) {
            class404.method2531(26878, var6);
        }
        if (arg3 != -10) {
            method2090((class26) null, true, true, -5);
        }
        class280.method1832(arg3 ^ 0x45);
        if (!arg2 && class59.field801 != -1) {
            class46.method410(1, class59.field801, -111);
        }
        class264 var7 = new class264(class454.field6477);
        for (class26 var8 = (class26) var7.method1727(0); var8 != null; var8 = (class26) var7.method1725(arg3 + 111)) {
            if (!var8.method2470((byte) -107)) {
                var8 = (class26) var7.method1727(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field462 == 3) {
                int var9 = (int) var8.field5600;
                if (var9 >>> 16 == var4) {
                    method2090(var8, true, arg2, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
    public static final byte[] method2091(boolean arg0, Object arg1, byte arg2) {
        if (arg2 != 105) {
            field4451 = 70;
        }
        field4450++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class396.method2507((byte) -114, var3) : var3;
        } else if (arg1 instanceof class22) {
            class22 var4 = (class22) arg1;
            return var4.method284(-17912);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
