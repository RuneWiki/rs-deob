import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class260 {

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[I")
    private int[] field4573 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Z")
    public boolean field4574 = false;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field4576 = -1;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "[I")
    public static int[] field4572 = new int[256];

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lsb;")
    public static class98 field4570 = class47.method368("blinken3:", 0);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    private int[] field4561;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[S")
    private short[] field4560;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[S")
    private short[] field4567;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[S")
    private short[] field4569;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[S")
    private short[] field4571;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field4570 = null;
        if (arg0 == 0) {
            field4572 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILlj;I)V")
    private final void method1779(int arg0, class216 arg1, int arg2) {
        field4564++;
        int var4 = 6 % ((-arg0 - 13) / 33);
        if (arg2 == 1) {
            this.field4576 = arg1.method1446(5350);
        } else if (arg2 == 2) {
            int var9 = arg1.method1446(5350);
            this.field4561 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field4561[var10] = arg1.method1487(70);
            }
        } else if (arg2 == 3) {
            this.field4574 = true;
        } else if (arg2 == 40) {
            int var5 = arg1.method1446(5350);
            this.field4569 = new short[var5];
            this.field4567 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4567[var6] = (short) arg1.method1487(108);
                this.field4569[var6] = (short) arg1.method1487(11);
            }
            return;
        } else if (arg2 == 41) {
            int var7 = arg1.method1446(5350);
            this.field4571 = new short[var7];
            this.field4560 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4560[var8] = (short) arg1.method1487(109);
                this.field4571[var8] = (short) arg1.method1487(85);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field4573[arg2 - 60] = arg1.method1487(75);
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Llj;B)V")
    public final void method1780(class216 arg0, byte arg1) {
        field4568++;
        if (arg1 != -84) {
            this.field4574 = false;
        }
        while (true) {
            int var3 = arg0.method1446(arg1 + 5434);
            if (var3 == 0) {
                return;
            }
            this.method1779(102, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)Lab;")
    public final class240 method1781(int arg0) {
        field4575++;
        if (this.field4561 == null) {
            return null;
        }
        if (arg0 >= -31) {
            field4570 = null;
        }
        class240[] var2 = new class240[this.field4561.length];
        for (int var3 = 0; var3 < this.field4561.length; var3++) {
            var2[var3] = class240.method1648(class136.field2401, this.field4561[var3], 0);
        }
        class240 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class240(var2, var2.length);
        }
        if (this.field4567 != null) {
            for (int var5 = 0; var5 < this.field4567.length; var5++) {
                var4.method1636(this.field4567[var5], this.field4569[var5]);
            }
        }
        if (this.field4560 != null) {
            for (int var6 = 0; var6 < this.field4560.length; var6++) {
                var4.method1663(this.field4560[var6], this.field4571[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z")
    public final boolean method1782(int arg0) {
        int var2 = 105 / ((arg0 + 60) / 53);
        field4563++;
        if (this.field4561 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field4561.length; var4++) {
            if (!class136.field2401.method576(true, this.field4561[var4], 0)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)Lab;")
    public final class240 method1783(int arg0) {
        if (arg0 < 12) {
            this.method1783(105);
        }
        class240[] var2 = new class240[5];
        field4566++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4573[var4] != -1) {
                var2[var3++] = class240.method1648(class136.field2401, this.field4573[var4], 0);
            }
        }
        class240 var5 = new class240(var2, var3);
        if (this.field4567 != null) {
            for (int var6 = 0; var6 < this.field4567.length; var6++) {
                var5.method1636(this.field4567[var6], this.field4569[var6]);
            }
        }
        if (this.field4560 != null) {
            for (int var7 = 0; var7 < this.field4560.length; var7++) {
                var5.method1663(this.field4560[var7], this.field4571[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Z")
    public final boolean method1784(int arg0) {
        field4565++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field4573[var3] != -1 && !class136.field2401.method576(true, this.field4573[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLac;Lmi;I)V")
    public static final void method1785(byte arg0, class188 arg1, class171 arg2, int arg3) {
        field4562++;
        class99 var4 = new class99();
        var4.field1741 = arg1;
        var4.field1748 = arg2;
        var4.field4061 = (long) arg3;
        var4.field1743 = 1;
        class48 var5 = class239.field4123;
        synchronized (class239.field4123) {
            class239.field4123.method376((byte) 13, var4);
        }
        if (arg0 >= 118) {
            class156.method1133(1);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4572[var0] = var1;
        }
    }
}
