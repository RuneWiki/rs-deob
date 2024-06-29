import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class287 extends class310 {

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    private int field4666 = -1;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "[S")
    public static short[] field4667 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
    public static boolean field4674 = true;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    private int field4676;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "[I")
    private int[] field4680;

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 7)
    public class287() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lth;B)V", line = 15)
    public static final void method2085(class57 arg0, byte arg1) {
        class191.field3058 = arg0;
        field4675++;
        if (arg1 <= 3) {
            method2087(21, -84, (class57) null, true, -78, -16);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)[[I", line = 30)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[][]) ((int[][]) null);
        }
        field4672++;
        int[][] var3 = this.field4942.method10((byte) -105, arg0);
        if (this.field4942.field30 && this.method2086((byte) -103)) {
            int var4 = this.field4676 * (class254.field4279 == this.field4671 ? arg0 : this.field4671 * arg0 / class254.field4279);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class261.field4405 == this.field4676) {
                for (int var8 = 0; var8 < class261.field4405; var8++) {
                    int var9 = this.field4680[var4++];
                    var7[var8] = class343.method2418(4080, var9 << 4);
                    var5[var8] = class343.method2418(var9 >> 4, 4080);
                    var6[var8] = class343.method2418(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class261.field4405; var10++) {
                    int var11 = this.field4676 * var10 / class261.field4405;
                    int var12 = this.field4680[var4 + var11];
                    var7[var10] = class343.method2418(255, var12) << 4;
                    var5[var10] = class343.method2418(var12, 65280) >> 4;
                    var6[var10] = class343.method2418(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)Z", line = 104)
    private final boolean method2086(byte arg0) {
        field4678++;
        if (this.field4680 != null) {
            return true;
        }
        if (arg0 >= -74) {
            this.method391(25, true);
        }
        if (this.field4666 < 0) {
            return false;
        }
        int var2 = class254.field4279;
        int var3 = class261.field4405;
        int var4 = class138.field2279.method1559(this.field4666, (byte) -94).field4610 ? 64 : 128;
        this.field4680 = class138.field2279.method1560(this.field4666, var4, false, var4, 1.0F, 123);
        this.field4671 = var4;
        this.field4676 = var4;
        class57.method464(0, var3, var2);
        return this.field4680 != null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILth;ZII)V", line = 138)
    public static final void method2087(int arg0, int arg1, class57 arg2, boolean arg3, int arg4, int arg5) {
        class66.field1177 = arg5;
        class318.field5065 = arg0;
        field4668++;
        class152.field2417 = 1;
        if (arg1 < 79) {
            field4674 = false;
        }
        class200.field3190 = arg3;
        class267.field4479 = 10000;
        class135.field2259 = arg2;
        class183.field2954 = arg4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)V", line = 157)
    public static final void method2088(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0 != -8498) {
            field4667 = (short[]) null;
        }
        field4677++;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 171)
    public final void method1388(int arg0) {
        super.method1388(-2);
        this.field4680 = null;
        int var2 = 107 / ((arg0 - 61) / 41);
        field4665++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lqm;II)V", line = 182)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field4670++;
        if (arg2 == 0) {
            this.field4666 = arg0.method1765(true);
        }
        if (arg1 != -2470) {
            this.method2089(true);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I", line = 203)
    public final int method2089(boolean arg0) {
        if (arg0) {
            field4679++;
            return this.field4666;
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lkc;IIII)V", line = 216)
    public static final void method2090(class29 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4673++;
        int var5 = -71 % ((arg1 - 21) / 60);
        for (class170 var6 = (class170) class314.field4984.method2300((byte) 100); var6 != null; var6 = (class170) class314.field4984.method2306(-23)) {
            if (var6.field2710 == arg3 && (arg2 * 128) == var6.field2711 && (arg4 * 128) == var6.field2695 && var6.field2700.field417 == arg0.field417) {
                if (var6.field2713 != null) {
                    class245.field4030.method2163(var6.field2713);
                    var6.field2713 = null;
                }
                if (var6.field2698 != null) {
                    class245.field4030.method2163(var6.field2698);
                    var6.field2698 = null;
                }
                var6.method330(15);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(B)V", line = 256)
    public static void method2091(byte arg0) {
        field4667 = null;
        int var1 = -72 % ((25 - arg0) / 34);
    }
}
