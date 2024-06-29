import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 extends class7 {

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    private int field302 = 2048;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
    private int field306 = 0;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    private int field310 = 10;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "Lob;")
    public static class141 field297 = class175.method1195(40, "Ausw-=hlen");

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lob;")
    public static class141 field296 = class175.method1195(40, "Starte 3D)2Softwarebibliothek");

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field304 = 0;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "Lob;")
    public static class141 field301 = class175.method1195(40, "p11_full");

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "[I")
    public static int[] field309 = new int[128];

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[I")
    private int[] field299;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "[I")
    private int[] field314;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "(I)V")
    private final void method104(int arg0) {
        ++field307;
        this.field314 = new int[this.field310 + 1];
        this.field299 = new int[this.field310 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field310;
        int var4 = this.field302 * var3 >> 12;
        for (int var5 = 0; var5 < this.field310; ++var5) {
            this.field314[var5] = var2;
            this.field299[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field314[this.field310] = arg0;
        this.field299[this.field310] = this.field299[0] + 4096;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -68 / ((66 - arg1) / 57);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field306 = arg2.method991(255);
                }
            } else {
                this.field302 = arg2.method1007(83);
            }
        } else {
            this.field310 = arg2.method991(255);
        }
        ++field312;
    }

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "(I)V")
    public static final void method105(int arg0) {
        int var1 = class81.field1624.method869(class11.field218);
        for (int var2 = 0; ~class188.field3637 < ~var2; ++var2) {
            int var6 = class81.field1624.method869(class46.method306(var2, (byte) 8));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class114.field2180 = true;
        int var3 = class188.field3637 * 15 + 21;
        ++field305;
        class79.field1594 = class188.field3637 * 15 + 22;
        var1 += 8;
        int var4 = class195.field3737;
        class203.field3890 = var1;
        int var5 = -(var1 / 2) + class81.field1630;
        if (arg0 < var1 + var5) {
            var5 = -var1 + 765;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        class114.field2188 = var5;
        if (var3 + var4 > 503) {
            var4 = -var3 + 503;
        }
        if (~var4 > -1) {
            var4 = 0;
        }
        class197.field3770 = var4;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)I")
    public static final int method106(int arg0, int arg1) {
        ++field308;
        if (arg0 >= -27) {
            field311 = 58;
        }
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            method106(36, -15);
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int var4 = class177.field3503[arg1];
            if (this.field306 != 0) {
                for (int var5 = 0; class117.field2272 > var5; ++var5) {
                    int var6 = 0;
                    int var7 = class15.field272[var5];
                    int var8 = this.field306;
                    if (~var8 != -2) {
                        if (var8 != 2) {
                            if (var8 == 3) {
                                var6 = (-var4 + var7 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var4 + var7 + -4096 >> 1);
                        }
                    } else {
                        var6 = var7;
                    }
                    short var9 = 0;
                    for (int var10 = 0; this.field310 > var10; ++var10) {
                        if (var6 >= this.field314[var10] && ~var6 > ~this.field314[var10 - -1]) {
                            if (this.field299[var10] > var6) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var9;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field310 > var12; ++var12) {
                    if (var4 >= this.field314[var12] && ~var4 > ~this.field314[var12 - -1]) {
                        if (~var4 > ~this.field299[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class149.method1040(var3, 0, class117.field2272, var11);
            }
        }
        ++field303;
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "(I)V")
    public static void method107(int arg0) {
        if (arg0 == 0) {
            field301 = null;
            field297 = null;
            field296 = null;
            field309 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        this.method104(4096);
        if (arg0 != 1) {
            this.method30((byte) -77, -83);
        }
        ++field313;
    }
}
