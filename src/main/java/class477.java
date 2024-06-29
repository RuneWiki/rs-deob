import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class477 {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    private int field6661 = 0;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    private int field6672 = -1;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Lsu;")
    private class192 field6670 = new class192();

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "Z")
    public boolean field6674 = false;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    private int field6658;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    private int field6659;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "[[I")
    private int[][] field6665;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[Ltv;")
    private class515[] field6666;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "[F")
    public static float[] field6662 = new float[4];

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6657 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field6669 = 0;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static final void method2709(int arg0) {
        class328 var1 = class205.field3010;
        synchronized (class205.field3010) {
            class205.field3010.method1987(-31085);
        }
        if (arg0 > -85) {
            field6657 = null;
        }
        field6660++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZLhp;)V")
    public static final void method2710(boolean arg0, class297 arg1) {
        if (!arg0) {
            method2716(0, 72, -26);
        }
        field6673++;
        class485.field6724.method1856(18259);
        class485.field6724 = arg1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
    public static void method2711(boolean arg0) {
        if (arg0) {
            field6657 = null;
        }
        field6662 = null;
        field6657 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)[I")
    public final int[] method2712(int arg0, byte arg1) {
        if (arg1 != 118) {
            this.method2712(-73, (byte) 18);
        }
        field6656++;
        if (this.field6659 == this.field6658) {
            this.field6674 = this.field6666[arg0] == null;
            this.field6666[arg0] = class227.field3261;
            return this.field6665[arg0];
        } else if (this.field6659 == 1) {
            this.field6674 = this.field6672 != arg0;
            this.field6672 = arg0;
            return this.field6665[0];
        } else {
            class515 var3 = this.field6666[arg0];
            if (var3 == null) {
                this.field6674 = true;
                if (this.field6659 > this.field6661) {
                    var3 = new class515(arg0, this.field6661);
                    this.field6661++;
                } else {
                    class515 var4 = (class515) this.field6670.method1284(arg1 ^ 0x76);
                    var3 = new class515(arg0, var4.field7039);
                    this.field6666[var4.field7033] = null;
                    var4.method2971(1);
                }
                this.field6666[arg0] = var3;
            } else {
                this.field6674 = false;
            }
            this.field6670.method1280(var3, (byte) -79);
            return this.field6665[var3.field7039];
        }
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V")
    public final void method2713(boolean arg0) {
        field6668++;
        for (int var2 = 0; var2 < this.field6659; var2++) {
            this.field6665[var2] = null;
        }
        if (!arg0) {
            this.field6665 = null;
        }
        this.field6665 = null;
        this.field6666 = null;
        this.field6670.method1269((byte) 94);
        this.field6670 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I")
    public static final int method2714(int arg0, int arg1) {
        field6667++;
        int var2 = -70 % ((4 - arg1) / 48);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
    public static final void method2715(int arg0) {
        class72.field985 = null;
        class121.field1675 = null;
        class143.field2134 = null;
        class548.field7419 = null;
        class229.field3276 = null;
        class545.field7386 = null;
        class261.field3712 = null;
        class650.field9206 = null;
        class656.field9239 = null;
        class485.field6725 = null;
        class486.field6754 = null;
        field6671++;
        class687.field9666 = null;
        if (arg0 != 0) {
            return;
        }
        class244.field3482 = null;
        class694.field9755 = null;
        class423.field5966 = null;
        class36.field452 = null;
        class668.field9418 = null;
        class381.field5358 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)V")
    public static final void method2716(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return;
        }
        field6663++;
        if (class350.field5045 == class158.field2374) {
            if (!class524.method2903(1, 1, false, -2, arg0, arg2 - 1, 0, 0, arg1)) {
                class524.method2903(1, 1, false, -3, arg0, arg2 ^ 0x1, 0, 0, arg1);
            }
        } else if (!class524.method2903(1, 1, false, -3, arg0, 0, 0, 0, arg1)) {
            class524.method2903(1, 1, false, -2, arg0, 0, 0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)[[I")
    public final int[][] method2717(int arg0) {
        field6664++;
        if (this.field6659 != this.field6658) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6659; var2++) {
            this.field6666[var2] = class227.field3261;
        }
        return this.field6665;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(III)V")
    public class477(int arg0, int arg1, int arg2) {
        this.field6658 = arg1;
        this.field6659 = arg0;
        this.field6665 = new int[this.field6659][arg2];
        this.field6666 = new class515[this.field6658];
    }
}
