import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class418 extends class202 {

    @OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
    public static int field6343 = 0;

    @OriginalMember(owner = "client!tp", name = "T", descriptor = "[[I")
    public static int[][] field6347 = new int[128][128];

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "Lvn;")
    public static class141 field6338 = null;

    @OriginalMember(owner = "client!tp", name = "V", descriptor = "Z")
    public static boolean field6349 = false;

    @OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
    private int field6342;

    @OriginalMember(owner = "client!tp", name = "Q", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
    private int field6346;

    @OriginalMember(owner = "client!tp", name = "U", descriptor = "I")
    private int field6348;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)V")
    private final void method2667(int arg0, int arg1) {
        int var3 = 79 / ((-30 - arg0) / 37);
        this.field6348 = arg1 << 4 & 4080;
        ++field6345;
        this.field6342 = 4080 & arg1 >> 4;
        this.field6346 = 4080 & arg1 >> 12;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lmn;Lmn;ILmn;Lmn;)V")
    public static final void method2668(class162 arg0, class162 arg1, int arg2, class162 arg3, class162 arg4) {
        class152.field2017 = arg1;
        class135.field1830 = arg4;
        class197.field3039 = arg3;
        if (arg2 != 19420) {
            field6347 = null;
        }
        ++field6344;
        class18.field191 = arg0;
        class433.field6540 = new class437[class152.field2017.method1023(127)][];
        class239.field3897 = new boolean[class152.field2017.method1023(126)];
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(I)V")
    private class418(int arg0) {
        super(0, false);
        this.method2667(-120, arg0);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
    public class418() {
        this(0);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
    public static final void method2669(byte arg0) {
        if (~class481.field7331 <= -1) {
            long var1 = class246.method1705((byte) 28);
            class481.field7331 = (int) ((long) class481.field7331 - (-class1.field5 + var1));
            if (class481.field7331 <= 0) {
                class15.field161 = class172.field2507.field5324;
                class428.field6486 = class172.field2507.field5321;
                class509.field7594 = class172.field2507.field5331;
                class80.field1185 = class172.field2507.field5319;
                class137.field1885 = class172.field2507.field5330;
                class272.field4341 = class172.field2507.field5323;
                class33.field342 = class172.field2507.field5329;
                class481.field7325 = class172.field2507.field5318;
                class481.field7331 = -1;
                class416.field6322 = class172.field2507.field5320;
                class188.field2734 = class172.field2507.field5315;
            } else {
                int var3 = (class481.field7331 << 8) / class429.field6512;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                class416.field6322 = ((class211.field3472 & 16711935) * var3 - -((class172.field2507.field5320 & 16711935) * var4) & -16711936) + ((class211.field3472 & 65280) * var3 + (65280 & class172.field2507.field5320) * var4 & 16711680) >>> 8;
                float var6 = -var5 + 1.0F;
                class481.field7325 = (class172.field2507.field5318 - class94.field1366) * var6 + class94.field1366;
                class188.field2734 = (-class36.field371 + class172.field2507.field5315) * var6 + class36.field371;
                class428.field6486 = ((16711935 & class405.field6105) * var3 - -((16711935 & class172.field2507.field5321) * var4) & -16711936) + (16711680 & (class405.field6105 & 65280) * var3 + (65280 & class172.field2507.field5321) * var4) >>> 8;
                class272.field4341 = (-class526.field7761 + class172.field2507.field5323) * var6 + class526.field7761;
                class80.field1185 = (-class226.field3779 + class172.field2507.field5319) * var6 + class226.field3779;
                class509.field7594 = class168.field2458 * var3 + class172.field2507.field5331 * var4 >> 8;
                class15.field161 = (class172.field2507.field5324 - class53.field713) * var6 + class53.field713;
                class33.field342 = (-class192.field2844 + class172.field2507.field5329) * var6 + class192.field2844;
                if (class234.field3854 != class172.field2507.field5330) {
                    class137.field1885 = class307.field4813.method1286(class234.field3854, class172.field2507.field5330, var6, class137.field1885);
                }
            }
            class1.field5 = var1;
        }
        ++field6337;
        if (arg0 <= 87) {
            field6347 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field6339;
        int[][] var3 = super.field3081.method1050(arg1, arg0 + -44);
        if (arg0 != -1) {
            method2670(true);
        }
        if (super.field3081.field2432) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class276.field4375 < ~var7; ++var7) {
                var4[var7] = this.field6346;
                var5[var7] = this.field6342;
                var6[var7] = this.field6348;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 14 / ((-46 - arg1) / 50);
        if (~arg2 == -1) {
            this.method2667(46, arg0.method1452(3));
        }
        ++field6340;
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(Z)V")
    public static void method2670(boolean arg0) {
        field6338 = null;
        if (!arg0) {
            field6341 = -21;
        }
        field6347 = null;
    }
}
