import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class385 implements class23 {

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "Llb;")
    private class465 field5301 = new class465(128);

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "[I")
    private int[] field5292 = new int[class110.field1564.field5307];

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "[I")
    public int[] field5300 = new int[class110.field1564.field5307];

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "[Lbea;")
    public static class190[] field5293 = new class190[8];

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "Llb;")
    public static class465 field5297 = new class465(8);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZII)V")
    public final void method2289(boolean arg0, int arg1, int arg2) {
        this.field5292[arg1] = arg2;
        field5291++;
        if (arg0) {
            this.method2293(-19);
        }
        class347 var4 = (class347) this.field5301.method2799((long) arg1, true);
        if (var4 == null) {
            class347 var5 = new class347(4611686018427387905L);
            this.field5301.method2797(-4234, var5, (long) arg1);
        } else if (var4.field4757 != 4611686018427387905L) {
            var4.field4757 = class598.method3538(true) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(BI)I")
    public final int method141(byte arg0, int arg1) {
        if (arg0 != -110) {
            this.method2290(23, -48, 73);
        }
        field5295++;
        class435 var3 = class32.field393.method2265(arg1, false);
        int var4 = var3.field5824;
        int var5 = var3.field5816;
        int var6 = var3.field5817;
        int var7 = class153.field2307[var6 - var5];
        return this.field5300[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)V")
    public final void method2290(int arg0, int arg1, int arg2) {
        field5296++;
        class435 var4 = class32.field393.method2265(arg2, false);
        int var5 = var4.field5824;
        if (arg0 != 8) {
            this.method2294((byte) -76, -18, 98);
        }
        int var6 = var4.field5816;
        int var7 = var4.field5817;
        int var8 = class153.field2307[var7 - var6];
        if (arg1 < 0 || var8 < arg1) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method2289(false, var5, arg1 << var6 & var9 | this.field5292[var5] & ~var9);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZZ)I")
    public final int method2291(boolean arg0, boolean arg1) {
        field5294++;
        long var3 = class598.method3538(arg1);
        for (class347 var5 = arg0 ? (class347) this.field5301.method2798((byte) -111) : (class347) this.field5301.method2806(true); var5 != null; var5 = (class347) this.field5301.method2806(arg1)) {
            if (var3 > (var5.field4757 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field4757 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5651;
                    this.field5300[var6] = this.field5292[var6];
                    var5.method2457(-8422);
                    return var6;
                }
                var5.method2457(-8422);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(III)V")
    public final void method2292(int arg0, int arg1, int arg2) {
        this.field5300[arg1] = arg0;
        if (arg2 != 0) {
            return;
        }
        field5290++;
        class347 var4 = (class347) this.field5301.method2799((long) arg1, true);
        if (var4 == null) {
            class347 var5 = new class347(class598.method3538(true) + 500L);
            this.field5301.method2797(-4234, var5, (long) arg1);
        } else {
            var4.field4757 = class598.method3538(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public final void method2293(int arg0) {
        for (int var2 = 0; var2 < class110.field1564.field5307; var2++) {
            class123 var3 = class110.field1564.method2302(3, var2);
            if (var3 != null && var3.field1722 == 0) {
                this.field5292[var2] = 0;
                this.field5300[var2] = 0;
            }
        }
        if (arg0 != 8066) {
            this.field5301 = null;
        }
        field5298++;
        this.field5301 = new class465(128);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)V")
    public final void method2294(byte arg0, int arg1, int arg2) {
        field5299++;
        class435 var4 = class32.field393.method2265(arg1, false);
        int var5 = var4.field5824;
        if (arg0 > -57) {
            return;
        }
        int var6 = var4.field5816;
        int var7 = var4.field5817;
        int var8 = class153.field2307[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2292(this.field5300[var5] & ~var9 | var9 & arg2 << var6, var5, 0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)I")
    public final int method140(byte arg0, int arg1) {
        if (arg0 <= 3) {
            this.field5300 = null;
        }
        field5302++;
        return this.field5300[arg1];
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public static void method2295(byte arg0) {
        field5297 = null;
        int var1 = 55 / ((-arg0 - 29) / 56);
        field5293 = null;
    }
}
