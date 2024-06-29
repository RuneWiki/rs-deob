import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class109 extends class74 {

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[I")
    private int[] field1733 = new int[3];

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    private int field1738 = 4096;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    private int field1739 = 3216;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    private int field1740 = 3216;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "[Lql;")
    public static class223[] field1731 = new class223[14];

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
    public static int[] field1727 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "[I")
    public static int[] field1728;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIBI)V")
    public static final void method816(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = (arg0 - 32) * arg0 / arg1;
        ++field1735;
        class92.field1503[0].method1117(arg2, arg5);
        class92.field1503[1].method1117(arg2, arg5 + -16 - -arg0);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 + -32 + -var6) * arg3 / (-arg0 + arg1);
        class201.method1333(arg2, arg5 - -16, 16, arg0 + -32, class5.field94);
        class201.method1333(arg2, arg5 + 16 + var7, 16, var6, class23.field339);
        class201.method1346(arg2, arg5 + 16 - -var7, var6, class247.field3824);
        class201.method1346(arg2 - -1, var7 + 16 + arg5, var6, class247.field3824);
        class201.method1334(arg2, arg5 + var7 + 16, 16, class247.field3824);
        int var8 = -57 % ((-27 - arg4) / 40);
        class201.method1334(arg2, arg5 + var7 + 17, 16, class247.field3824);
        class201.method1346(arg2 + 15, arg5 + var7 + 16, var6, class112.field1773);
        class201.method1346(arg2 - -14, arg5 - (-var7 + -17), var6 + -1, class112.field1773);
        class201.method1334(arg2, arg5 + 15 + var6 - -var7, 16, class112.field1773);
        class201.method1334(arg2 + 1, arg5 + 14 + var6 + var7, 15, class112.field1773);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static final void method817(byte arg0) {
        int var1 = 24 / ((52 - arg0) / 34);
        class188.field2952.method1782(-108);
        class267.field4257.method1782(-27);
        ++field1737;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    private final void method818(byte arg0) {
        ++field1726;
        double var2 = Math.cos((double) ((float) this.field1739 / 4096.0F));
        if (arg0 <= -16) {
            this.field1733[0] = (int) (4096.0D * Math.sin((double) ((float) this.field1740 / 4096.0F)) * var2);
            this.field1733[1] = (int) (var2 * Math.cos((double) ((float) this.field1740 / 4096.0F)) * 4096.0D);
            this.field1733[2] = (int) (Math.sin((double) ((float) this.field1739 / 4096.0F)) * 4096.0D);
            int var4 = this.field1733[1] * this.field1733[1] >> 12;
            int var5 = this.field1733[0] * this.field1733[0] >> 12;
            int var6 = this.field1733[2] * this.field1733[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var5 - -var6 + var4 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field1733[2] = (this.field1733[2] << 12) / var7;
                this.field1733[0] = (this.field1733[0] << 12) / var7;
                this.field1733[1] = (this.field1733[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
    public static final void method819(int arg0, boolean arg1) {
        class134.method938(class34.field544, class35.field573, arg1, class277.field4369, (byte) -114);
        ++field1730;
        int var2 = 4 / ((arg0 - 88) / 38);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method820(int arg0) {
        field1731 = null;
        field1727 = null;
        if (arg0 >= -28) {
            field1728 = null;
        }
        field1728 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        if (arg0) {
            method819(-89, true);
        }
        ++field1743;
        this.method818((byte) -98);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1729;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            field1741 = 114;
        }
        if (super.field1254.field3118) {
            int var4 = class58.field909 * this.field1738 >> 12;
            int[] var5 = this.method590(arg0 ^ 4, 0, arg1 - 1 & class218.field3419);
            int[] var6 = this.method590(0, 0, arg1);
            int[] var7 = this.method590(0, 0, arg1 + 1 & class218.field3419);
            for (int var8 = 0; ~var8 > ~class178.field2662; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class129.field2012 & var8 - 1] + -var6[var8 + 1 & class129.field2012]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class277.field4368[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field1733[0] * var14 >> 12;
                int var18 = this.field1733[2] * var15 >> 12;
                int var19 = this.field1733[1] * var16 >> 12;
                var3[var8] = var17 - -var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field1742;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field1739 = arg1.method293(89);
                }
            } else {
                this.field1740 = arg1.method293(arg0 ^ 123);
            }
        } else {
            this.field1738 = arg1.method293(-16);
        }
        if (arg0 != -79) {
            method816(82, 29, 5, -101, (byte) 110, -125);
        }
    }
}
