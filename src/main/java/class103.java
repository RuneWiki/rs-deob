import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class103 extends class95 {

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    private final int field1739;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    private final int field1722;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    private final int field1733;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Z")
    public static boolean field1734 = false;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "F")
    public static float field1737;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    private int field1724;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    private int field1727;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "[B")
    private byte[] field1736;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method791(int arg0, int arg1) {
        field1741++;
        if (arg0 < 45) {
            method796(-99, (short[]) null);
        }
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class229.field3793 += arg1 * 128;
        if (class229.field3793 > class163.field2744.length) {
            class229.field3793 -= class163.field2744.length;
            int var3 = (int) (Math.random() * 12.0D);
            class155.method1148(class151.field2556[var3], (byte) -113);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class67.field993[var4 + var5] - (class163.field2744[class163.field2744.length - 1 & var4 - -class229.field3793] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class67.field993[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class67.field993[var10 + var11] = 255;
                } else {
                    class67.field993[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class160.field2711[var13] = class160.field2711[var13 + arg1];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class160.field2711[var14] = (int) (Math.sin((double) class284.field4890 / 14.0D) * 16.0D + Math.sin((double) class284.field4890 / 15.0D) * 14.0D + Math.sin((double) class284.field4890 / 16.0D) * 12.0D);
            class284.field4890++;
        }
        int var15 = ((class277.field4768 & 0x1) + arg1) / 2;
        class106.field1769 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class106.field1769; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class67.field993[(var18 << 7) + var17] = 192;
        }
        class106.field1769 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class67.field993[var15 + var22 + var21];
                }
                if ((-(var15 - var22) - 1) >= 0) {
                    var20 -= class67.field993[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class50.field752[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if ((var15 + var25) < var2) {
                    var24 += class50.field752[var15 * 128 + var23 + var26];
                }
                if (var25 - var15 - 1 >= 0) {
                    var24 -= class50.field752[var23 + var26 - ((var15 - -1) * 128)];
                }
                if (var25 >= 0) {
                    class67.field993[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)V", line = 179)
    public final void method743(int arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field1727 = 4096;
            this.field1725 = this.field1722 - (arg0 < 0 ? -arg0 : arg0);
            this.field1725 = this.field1725 * this.field1725 >> 12;
            this.field1723 = this.field1725;
        } else {
            this.field1727 = this.field1739 * this.field1725 >> 12;
            this.field1725 = this.field1722 - (arg0 >= 0 ? arg0 : -arg0);
            if (this.field1727 < 0) {
                this.field1727 = 0;
            } else if (this.field1727 > 4096) {
                this.field1727 = 4096;
            }
            this.field1725 = this.field1725 * this.field1725 >> 12;
            this.field1725 = this.field1727 * this.field1725 >> 12;
            this.field1723 += this.field1726 * this.field1725 >> 12;
            this.field1726 = this.field1733 * this.field1726 >> 12;
        }
        field1730++;
        int var4 = 2 % ((arg2 + 47) / 41);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 221)
    public final void method740(int arg0) {
        this.field1723 = 0;
        field1735++;
        if (arg0 > -6) {
            this.field1724 = 117;
        }
        this.field1724 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lrg;ILrg;)V", line = 234)
    public static final void method792(class88 arg0, int arg1, class88 arg2) {
        class6.field82 = class234.method1622(class63.field960, 0, arg2, arg0, (byte) 104);
        if (arg1 != -11933) {
            field1738 = -53;
        }
        if (class281.field4827) {
            class276.field4735 = class11.method54(arg2, 2841, arg0, class63.field960, 0);
        } else {
            class276.field4735 = (class290) class6.field82;
        }
        class102.field1719 = class234.method1622(class75.field1239, 0, arg2, arg0, (byte) 104);
        field1732++;
        class277.field4761 = class234.method1622(class123.field2046, 0, arg2, arg0, (byte) 104);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 252)
    public static final void method793(int arg0, int arg1) {
        if (arg1 != 255) {
            method791(-95, 26);
        }
        field1740++;
        class10.field148.method562((byte) 54, arg0);
        class95.field1638.method562((byte) 48, arg0);
        class25.field383.method562((byte) 52, arg0);
        class217.field3682.method562((byte) 71, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V", line = 271)
    public static final void method794(int arg0, int arg1) {
        field1728++;
        if (arg0 == -1 || !class107.field1794[arg0]) {
            return;
        }
        class253.field4254.method623(arg0, (byte) -94);
        if (arg1 != -1 || class297.field5087[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class297.field5087[arg0].length; var3++) {
            if (class297.field5087[arg0][var3] != null) {
                if (class297.field5087[arg0][var3].field3281 == 2) {
                    var2 = false;
                } else {
                    class297.field5087[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class297.field5087[arg0] = null;
        }
        class107.field1794[arg0] = false;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 319)
    public final void method741(byte arg0) {
        this.field1723 >>= 0x4;
        this.field1726 = this.field1733;
        if (this.field1723 < 0) {
            this.field1723 = 0;
        } else if (this.field1723 > 255) {
            this.field1723 = 255;
        }
        field1729++;
        if (arg0 != -119) {
            this.method740(39);
        }
        this.method795(this.field1724++, (byte) this.field1723);
        this.field1723 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIFFF)V", line = 340)
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1739 = (int) (arg7 * 4096.0F);
        this.field1722 = (int) (arg6 * 4096.0F);
        this.field1726 = this.field1733 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V", line = 368)
    public void method795(int arg0, byte arg1) {
        field1743++;
        this.field1736[arg0] = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[S)[S", line = 377)
    public static final short[] method796(int arg0, short[] arg1) {
        field1742++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == 7897) {
            short[] var2 = new short[arg1.length];
            class36.method219(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (short[]) null;
        }
    }
}
