import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class184 extends class297 {

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    private int field2915 = 0;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    private int field2920 = 0;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    private int field2912 = 1;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "S")
    public static short field2913 = 32767;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field2914 = 1;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2922 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field2923 = -1;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method1339(byte arg0, int arg1) {
        field2924++;
        int var2 = -52 / ((-arg0 - 29) / 62);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V", line = 18)
    public static void method1340(boolean arg0) {
        if (!arg0) {
            field2922 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 30)
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 43)
    public final void method247(byte arg0) {
        if (arg0 != 68) {
            this.field2920 = 118;
        }
        field2911++;
        class37.method330((byte) 36);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZI)I", line = 66)
    public static final int method1341(boolean arg0, int arg1) {
        field2919++;
        return arg0 ? arg1 >>> 8 : 109;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIZI)V", line = 78)
    public static final void method1342(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class140.field2263 = 0L;
        boolean var5 = false;
        field2910++;
        int var6 = class101.method823(-69);
        if (arg4 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (arg0 > ~var6 != arg4 > 0) {
            var5 = true;
        }
        if (class69.field1047.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (arg3 && arg4 > 0) {
            var5 = true;
        }
        class242.method1712(arg3, arg1, var5, arg4, 3, var6, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)[I", line = 109)
    public final int[] method173(int arg0, boolean arg1) {
        field2917++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int var4 = class264.field3901[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class31.field491; var6++) {
                int var7 = class251.field3705[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field2920 == 0) {
                    var9 = (var7 - var4) * this.field2912;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2912 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field2915 == 0) {
                    var12 = class323.field5065[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2915 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (!arg1) {
            field2914 = 76;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILaj;)V", line = 180)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field2918++;
        if (arg0 == 0) {
            this.field2920 = arg2.method15((byte) -49);
        } else if (arg0 == 1) {
            this.field2915 = arg2.method15((byte) 72);
        } else if (arg0 == 3) {
            this.field2912 = arg2.method15((byte) -15);
        }
        if (arg1 != 255) {
            method1342(91, -75, 23, true, 89);
        }
    }
}
