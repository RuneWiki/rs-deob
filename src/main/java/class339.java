import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class339 implements class212 {

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "Lnj;")
    private class436 field4964 = new class436(128);

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "[I")
    private int[] field4955 = new int[class48.field654.field6273];

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "[I")
    public int[] field4959 = new int[class48.field654.field6273];

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "Lcb;")
    public static class318 field4961 = new class318(80, 8);

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "[I")
    public static int[] field4957;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "[I")
    public static int[] field4960;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)I")
    public final int method1323(int arg0, int arg1) {
        if (arg0 != 0) {
            field4957 = null;
        }
        field4958++;
        return this.field4959[arg1];
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
    public static void method2151(byte arg0) {
        field4961 = null;
        field4960 = null;
        if (arg0 < 107) {
            method2151((byte) -58);
        }
        field4957 = null;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)I")
    public final int method1324(int arg0, int arg1) {
        field4953++;
        class432 var3 = class150.field1888.method3004(arg0, true);
        int var4 = var3.field5996;
        if (arg1 >= -63) {
            field4961 = null;
        }
        int var5 = var3.field5994;
        int var6 = var3.field5999;
        int var7 = class438.field6053[var6 - var5];
        return this.field4959[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V")
    public final void method2152(int arg0, int arg1, int arg2) {
        if (arg2 <= 76) {
            field4957 = null;
        }
        this.field4959[arg1] = arg0;
        field4962++;
        class490 var4 = (class490) this.field4964.method2506(21, (long) arg1);
        if (var4 == null) {
            class490 var5 = new class490(class669.method3713(0) + 500L);
            this.field4964.method2504((long) arg1, -74, var5);
        } else {
            var4.field6607 = class669.method3713(0) + 500L;
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(III)V")
    public final void method2153(int arg0, int arg1, int arg2) {
        field4954++;
        class432 var4 = class150.field1888.method3004(arg1, true);
        if (arg0 != 10587) {
            this.method2154(false);
        }
        int var5 = var4.field5996;
        int var6 = var4.field5994;
        int var7 = var4.field5999;
        int var8 = class438.field6053[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2152(~var9 & this.field4959[var5] | arg2 << var6 & var9, var5, 111);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
    public final void method2154(boolean arg0) {
        field4965++;
        for (int var2 = 0; var2 < class48.field654.field6273; var2++) {
            class186 var3 = class48.field654.method2610(var2, (byte) -99);
            if (var3 != null && var3.field2277 == 0) {
                this.field4955[var2] = 0;
                this.field4959[var2] = 0;
            }
        }
        if (!arg0) {
            this.method2157(false, true);
        }
        this.field4964 = new class436(128);
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)V")
    public final void method2155(int arg0, int arg1, int arg2) {
        this.field4955[arg1] = arg2;
        field4963++;
        class490 var4 = (class490) this.field4964.method2506(117, (long) arg1);
        if (var4 == null) {
            class490 var5 = new class490(4611686018427387905L);
            this.field4964.method2504((long) arg1, -106, var5);
        } else if (var4.field6607 != 4611686018427387905L) {
            var4.field6607 = class669.method3713(0) + 500L | 0x4000000000000000L;
        }
        if (arg0 != 7412) {
            this.method2154(false);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBI)V")
    public final void method2156(int arg0, byte arg1, int arg2) {
        field4952++;
        class432 var4 = class150.field1888.method3004(arg0, true);
        int var5 = var4.field5996;
        int var6 = var4.field5994;
        if (arg1 <= 21) {
            method2151((byte) -95);
        }
        int var7 = var4.field5999;
        int var8 = class438.field6053[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2155(7412, var5, arg2 << var6 & var9 | ~var9 & this.field4955[var5]);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZ)I")
    public final int method2157(boolean arg0, boolean arg1) {
        field4956++;
        if (arg0) {
            this.method2153(95, -127, 98);
        }
        long var3 = class669.method3713(0);
        for (class490 var5 = arg1 ? (class490) this.field4964.method2499(-35) : (class490) this.field4964.method2503(0); var5 != null; var5 = (class490) this.field4964.method2503(0)) {
            if (var3 > (var5.field6607 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field6607 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field272;
                    this.field4959[var6] = this.field4955[var6];
                    var5.method175(30604);
                    return var6;
                }
                var5.method175(30604);
            }
        }
        return -1;
    }
}
