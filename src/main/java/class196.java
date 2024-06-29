import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class196 extends class82 {

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    private int field3471 = 4096;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    private int field3472 = 4096;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    private int field3473 = 4096;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static volatile int field3466 = 0;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "Ldj;")
    private static class44 field3469 = class89.method650(255, "New User");

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "Ldj;")
    public static class44 field3476 = field3469;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "Lle;")
    public static class125 field3468;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "Lod;")
    public static class155 field3465;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1272(int arg0, byte arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        ++field3475;
        if (~arg0 <= -6 && ~arg0 >= -9) {
            arg0 = 4;
        }
        if (arg1 > -94) {
            return true;
        } else {
            class39 var3 = class40.method281(true, arg2);
            return var3.method269((byte) 106, arg0);
        }
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
    public static void method1273(int arg0) {
        field3469 = null;
        if (arg0 == 2) {
            field3465 = null;
            field3476 = null;
            field3468 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class196() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
    public static final void method1274() {
        for (int var0 = 0; var0 < class163.field2815; ++var0) {
            for (int var5 = 0; var5 < class66.field1205; ++var5) {
                for (int var6 = 0; var6 < class21.field355; ++var6) {
                    class32.field567[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class22.field369; ++var1) {
            for (int var4 = 0; var4 < class22.field370[var1]; ++var4) {
                class22.field365[var1][var4] = null;
            }
            class22.field370[var1] = 0;
        }
        for (int var2 = 0; var2 < class226.field4250; ++var2) {
            class98.field1812[var2] = null;
        }
        class226.field4250 = 0;
        for (int var3 = 0; var3 < class220.field3996.length; ++var3) {
            class220.field3996[var3] = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field3467;
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[][] var4 = this.method619(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class129.field2287 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field3472 * var12 >> 12;
                    var10[var11] = this.field3473 * var13 >> 12;
                    var9[var11] = this.field3471 * var14 >> 12;
                } else {
                    var8[var11] = this.field3472;
                    var10[var11] = this.field3473;
                    var9[var11] = this.field3471;
                }
            }
        }
        if (arg0 >= -59) {
            field3466 = 108;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field3477;
        if (arg2 == 68) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field3471 = arg0.method500(45);
                    }
                } else {
                    this.field3473 = arg0.method500(arg2 + 53);
                }
            } else {
                this.field3472 = arg0.method500(arg2 + -20);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lve;Lve;B)V")
    public static final void method1275(class225 arg0, class225 arg1, byte arg2) {
        class66.field1242 = arg0;
        if (arg2 >= -15) {
            field3466 = 55;
        }
        ++field3474;
        class53.field950 = arg1;
    }
}
