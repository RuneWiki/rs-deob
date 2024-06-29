import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class121 implements class535 {

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Lfaa;")
    private class139 field1670 = new class139(128);

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
    public int[] field1671 = new int[class59.field667.field6966];

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "[I")
    private int[] field1668 = new int[class59.field667.field6966];

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "Lma;")
    public static class12 field1665 = new class12();

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "[I")
    public static int[] field1674 = new int[1];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BII)V")
    public final void method865(byte arg0, int arg1, int arg2) {
        field1662++;
        this.field1671[arg2] = arg1;
        class478 var4 = (class478) this.field1670.method970((byte) 89, (long) arg2);
        if (arg0 > -56) {
            method871(-14);
        }
        if (var4 == null) {
            class478 var5 = new class478(class577.method3295((byte) 15) + 500L);
            this.field1670.method968((long) arg2, var5, -1);
        } else {
            var4.field6584 = class577.method3295((byte) 15) + 500L;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public final void method866(int arg0) {
        for (int var2 = arg0; var2 < class59.field667.field6966; var2++) {
            class441 var3 = class59.field667.method2904(arg0 ^ 0x6AE6, var2);
            if (var3 != null && var3.field6103 == 0) {
                this.field1668[var2] = 0;
                this.field1671[var2] = 0;
            }
        }
        field1669++;
        this.field1670 = new class139(128);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
    public final void method867(int arg0, int arg1, int arg2) {
        field1666++;
        int var4 = 9 / ((arg2 + 2) / 35);
        this.field1668[arg0] = arg1;
        class478 var5 = (class478) this.field1670.method970((byte) 89, (long) arg0);
        if (var5 == null) {
            class478 var6 = new class478(4611686018427387905L);
            this.field1670.method968((long) arg0, var6, -1);
        } else if (var5.field6584 != 4611686018427387905L) {
            var5.field6584 = class577.method3295((byte) 15) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(BII)V")
    public final void method868(byte arg0, int arg1, int arg2) {
        field1660++;
        if (arg0 <= 53) {
            field1665 = null;
        }
        class264 var4 = class333.field4490.method2041(91, arg2);
        int var5 = var4.field3580;
        int var6 = var4.field3578;
        int var7 = var4.field3583;
        int var8 = class56.field632[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method865((byte) -117, this.field1671[var5] & ~var9 | var9 & arg1 << var6, var5);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)I")
    public final int method869(int arg0, boolean arg1) {
        field1663++;
        if (!arg1) {
            this.field1671 = null;
        }
        return this.field1671[arg0];
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)I")
    public final int method870(byte arg0, int arg1) {
        field1661++;
        class264 var3 = class333.field4490.method2041(86, arg1);
        int var4 = var3.field3580;
        if (arg0 != 116) {
            this.field1668 = null;
        }
        int var5 = var3.field3578;
        int var6 = var3.field3583;
        int var7 = class56.field632[var6 - var5];
        return this.field1671[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public static void method871(int arg0) {
        field1674 = null;
        field1665 = null;
        if (arg0 != 0) {
            field1674 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BZ)I")
    public final int method872(byte arg0, boolean arg1) {
        field1672++;
        if (arg0 >= -79) {
            this.method867(8, 114, -26);
        }
        long var3 = class577.method3295((byte) 15);
        for (class478 var5 = arg1 ? (class478) this.field1670.method977(0) : (class478) this.field1670.method975(-1); var5 != null; var5 = (class478) this.field1670.method975(-1)) {
            if ((var5.field6584 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field6584 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5623;
                    this.field1671[var6] = this.field1668[var6];
                    var5.method2340(-47);
                    return var6;
                }
                var5.method2340(-88);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)V")
    public final void method873(int arg0, int arg1, int arg2) {
        field1667++;
        class264 var4 = class333.field4490.method2041(120, arg0);
        int var5 = var4.field3580;
        int var6 = var4.field3578;
        int var7 = var4.field3583;
        int var8 = class56.field632[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = 54 / ((arg1 - 40) / 63);
        int var10 = var8 << var6;
        this.method867(var5, var10 & arg2 << var6 | this.field1668[var5] & ~var10, -56);
    }
}
