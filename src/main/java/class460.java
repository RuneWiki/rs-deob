import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class460 implements class130 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lwb;")
    private class45 field6493 = new class45(128);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
    public int[] field6490 = new int[class75.field907.field5030];

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    private int[] field6491 = new int[class75.field907.field5030];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lco;")
    public static class210 field6497 = new class210(5);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lgq;")
    public static class453 field6501;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)I", line = 8)
    public final int method621(int arg0, int arg1) {
        field6499++;
        if (arg1 != -1) {
            this.field6491 = null;
        }
        return this.field6490[arg0];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V", line = 24)
    public final void method2710(int arg0, int arg1, boolean arg2) {
        field6492++;
        class36 var4 = class269.field3860.method990(arg0, -113);
        if (!arg2) {
            this.field6491 = null;
        }
        int var5 = var4.field443;
        int var6 = var4.field449;
        int var7 = var4.field440;
        int var8 = class223.field3093[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method2714(~var9 & this.field6490[var5] | var9 & arg1 << var6, var5, 125);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BZ)I", line = 51)
    public final int method2711(byte arg0, boolean arg1) {
        field6495++;
        long var3 = class434.method2591(-19310);
        int var5 = 74 % ((arg0 + 32) / 41);
        for (class244 var6 = arg1 ? (class244) this.field6493.method241(0) : (class244) this.field6493.method239(0); var6 != null; var6 = (class244) this.field6493.method239(0)) {
            if ((var6.field3327 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var6.field3327 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field1776;
                    this.field6490[var7] = this.field6491[var7];
                    var6.method702((byte) -114);
                    return var7;
                }
                var6.method702((byte) -114);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I", line = 89)
    public final int method620(int arg0, int arg1) {
        field6494++;
        class36 var3 = class269.field3860.method990(arg0, -112);
        if (arg1 < 29) {
            method2712((byte) -19);
        }
        int var4 = var3.field443;
        int var5 = var3.field449;
        int var6 = var3.field440;
        int var7 = class223.field3093[var6 - var5];
        return var7 & this.field6490[var4] >> var5;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 110)
    public static final void method2712(byte arg0) {
        field6496++;
        class158 var1 = (class158) class485.field6882.method802((byte) 122);
        if (arg0 >= -105) {
            field6497 = null;
        }
        while (var1 != null) {
            if (class157.method754(var1.field1889, (byte) -98)) {
                class37.method190((byte) -60, var1);
            }
            var1 = (class158) class485.field6882.method806((byte) 104);
        }
        if (class223.field3099 == 1) {
            class385.field5517 = false;
            class343.method2084(true, class150.field1822, class345.field4933, class274.field3913, class77.field925);
            return;
        }
        class343.method2084(true, class150.field1822, class345.field4933, class274.field3913, class77.field925);
        int var2 = class453.field6394.method2419(false, class440.field6302.method205((byte) 99, class68.field849));
        for (class158 var3 = (class158) class485.field6882.method802((byte) 104); var3 != null; var3 = (class158) class485.field6882.method806((byte) 104)) {
            int var4 = class216.method1208(false, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class77.field925 = (class371.field5311 ? 26 : 22) + class223.field3099 * 16;
        class345.field4933 = var2 + 8;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 159)
    public final void method2713(int arg0, int arg1, int arg2) {
        field6500++;
        class36 var4 = class269.field3860.method990(arg2, -124);
        int var5 = var4.field443;
        if (arg1 < 53) {
            return;
        }
        int var6 = var4.field449;
        int var7 = var4.field440;
        int var8 = class223.field3093[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2715(var5, arg0 << var6 & var9 | this.field6491[var5] & ~var9, 22);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V", line = 188)
    public final void method2714(int arg0, int arg1, int arg2) {
        field6487++;
        this.field6490[arg1] = arg0;
        if (arg2 < 106) {
            field6497 = null;
        }
        class244 var4 = (class244) this.field6493.method233(66, (long) arg1);
        if (var4 == null) {
            class244 var5 = new class244(class434.method2591(-19310) + 500L);
            this.field6493.method234(-63, (long) arg1, var5);
        } else {
            var4.field3327 = class434.method2591(-19310) + 500L;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(III)V", line = 215)
    public final void method2715(int arg0, int arg1, int arg2) {
        this.field6491[arg0] = arg1;
        field6489++;
        if (arg2 != 22) {
            this.method2717(-108);
        }
        class244 var4 = (class244) this.field6493.method233(arg2 ^ 0x45, (long) arg0);
        if (var4 == null) {
            class244 var5 = new class244(4611686018427387905L);
            this.field6493.method234(-47, (long) arg0, var5);
        } else if (var4.field3327 != 4611686018427387905L) {
            var4.field3327 = class434.method2591(-19310) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 258)
    public static void method2716(int arg0) {
        field6501 = null;
        int var1 = -104 / ((arg0 + 41) / 34);
        field6497 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 268)
    public final void method2717(int arg0) {
        field6498++;
        if (arg0 != 26) {
            return;
        }
        for (int var2 = 0; var2 < class75.field907.field5030; var2++) {
            class199 var3 = class75.field907.method2124(arg0 - 10, var2);
            if (var3 != null && var3.field2761 == 0) {
                this.field6491[var2] = 0;
                this.field6490[var2] = 0;
            }
        }
        this.field6493 = new class45(128);
    }
}
