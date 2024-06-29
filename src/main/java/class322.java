import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class322 {

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
    private int[] field4579 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    public static int[] field4569 = new int[500];

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[I")
    public static int[] field4567 = new int[1000];

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "F")
    public static float field4575;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lffa;")
    public class198 field4568;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    private int[] field4572;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[S")
    private short[] field4565;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[S")
    private short[] field4573;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[S")
    private short[] field4574;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[S")
    private short[] field4582;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lgl;")
    public final class625 method2083(byte arg0) {
        field4580++;
        if (this.field4572 == null) {
            return null;
        }
        class625[] var2 = new class625[this.field4572.length];
        class172 var3 = this.field4568.field2567;
        synchronized (this.field4568.field2567) {
            int var4 = 0;
            while (true) {
                if (this.field4572.length <= var4) {
                    break;
                }
                var2[var4] = class180.method1226(this.field4572[var4], this.field4568.field2567, 0, true);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field4572.length; var5++) {
            if (var2[var5].field8456 < 13) {
                var2[var5].method3460(2, arg0 ^ 0x7C);
            }
        }
        if (arg0 != -20) {
            method2088((byte) 64, null);
        }
        class625 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class625(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4582 != null) {
            for (int var7 = 0; var7 < this.field4582.length; var7++) {
                var6.method3452(this.field4573[var7], -7, this.field4582[var7]);
            }
        }
        if (this.field4574 != null) {
            for (int var8 = 0; var8 < this.field4574.length; var8++) {
                var6.method3457(arg0 + 136, this.field4574[var8], this.field4565[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lgl;")
    public final class625 method2084(int arg0) {
        field4566++;
        class625[] var2 = new class625[5];
        int var3 = 0;
        class172 var4 = this.field4568.field2567;
        synchronized (this.field4568.field2567) {
            int var5 = arg0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4579[var5] != -1) {
                    var2[var3++] = class180.method1226(this.field4579[var5], this.field4568.field2567, 0, true);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field8456 < 13) {
                var2[var6].method3460(2, arg0 ^ 0xFFFFFF80);
            }
        }
        class625 var7 = new class625(var2, var3);
        if (this.field4582 != null) {
            for (int var8 = 0; var8 < this.field4582.length; var8++) {
                var7.method3452(this.field4573[var8], arg0 - 80, this.field4582[var8]);
            }
        }
        if (this.field4574 != null) {
            for (int var9 = 0; var9 < this.field4574.length; var9++) {
                var7.method3457(-62, this.field4574[var9], this.field4565[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLdt;)V")
    public final void method2085(byte arg0, class254 arg1) {
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                field4564++;
                if (arg0 != 54) {
                    field4569 = null;
                    return;
                }
                return;
            }
            this.method2087(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z")
    public final boolean method2086(int arg0) {
        field4571++;
        if (arg0 != 20605) {
            return true;
        } else if (this.field4572 == null) {
            return true;
        } else {
            boolean var2 = true;
            class172 var3 = this.field4568.field2567;
            synchronized (this.field4568.field2567) {
                for (int var4 = 0; var4 < this.field4572.length; var4++) {
                    if (!this.field4568.field2567.method1174(this.field4572[var4], 0, 1)) {
                        var2 = false;
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldt;II)V")
    private final void method2087(class254 arg0, int arg1, int arg2) {
        field4570++;
        if (arg1 == 1) {
            arg0.method1731((byte) 64);
        } else if (arg1 == 2) {
            int var8 = arg0.method1731((byte) 64);
            this.field4572 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4572[var9] = arg0.method1728((byte) 4);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg0.method1731((byte) 64);
                this.field4573 = new short[var6];
                this.field4582 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4582[var7] = (short) arg0.method1728((byte) 25);
                    this.field4573[var7] = (short) arg0.method1728((byte) 90);
                }
            } else if (arg1 == 41) {
                int var4 = arg0.method1731((byte) 64);
                this.field4565 = new short[var4];
                this.field4574 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4574[var5] = (short) arg0.method1728((byte) 69);
                    this.field4565[var5] = (short) arg0.method1728((byte) 26);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field4579[arg1 - 60] = arg0.method1728((byte) 52);
            }
        }
        if (arg2 != 0) {
            this.field4574 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLaf;)V")
    public static final void method2088(byte arg0, class459 arg1) {
        field4578++;
        for (int var2 = 0; var2 < class776.field10672; var2++) {
            int var3 = class738.field10012[var2];
            class758 var4 = class84.field1204[var3];
            int var5 = arg1.method1731((byte) 64);
            if ((var5 & 0x40) != 0) {
                var5 += arg1.method1731((byte) 64) << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg1.method1731((byte) 64) << 16;
            }
            class206.method1350(11725, arg1, var5, var3, var4);
        }
        if (arg0 > -118) {
            method2090(-3);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Z")
    public final boolean method2089(int arg0) {
        if (arg0 < 24) {
            field4569 = null;
        }
        field4577++;
        boolean var2 = true;
        class172 var3 = this.field4568.field2567;
        synchronized (this.field4568.field2567) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4579[var4] != -1 && !this.field4568.field2567.method1174(this.field4579[var4], 0, 1)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static void method2090(int arg0) {
        field4567 = null;
        field4569 = null;
        if (arg0 != 1000) {
            method2090(-14);
        }
    }
}
