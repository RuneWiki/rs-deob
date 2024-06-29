import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class108 extends class189 {

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "I")
    private int field2439 = 3216;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    private int field2430 = 4096;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "[I")
    private int[] field2437 = new int[3];

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "I")
    private int field2435 = 3216;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    public static int field2432 = 1;

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "I")
    public static volatile int field2441 = 0;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2429 = new CRC32();

    @OriginalMember(owner = "client!m", name = "ub", descriptor = "Lgg;")
    public static class63 field2443 = class116.method911(43, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!m", name = "wb", descriptor = "Lgg;")
    public static class63 field2445 = class116.method911(43, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!m", name = "tb", descriptor = "Lgg;")
    public static class63 field2442 = class116.method911(43, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!m", name = "vb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!m", name = "xb", descriptor = "Lmc;")
    public static class111 field2446;

    @OriginalMember(owner = "client!m", name = "yb", descriptor = "Lqe;")
    public static class149 field2447;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "Ljb;")
    public static class84 field2433;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            field2444 = 3;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2435 = arg2.method46((byte) 65);
                }
            } else {
                this.field2439 = arg2.method46((byte) 65);
            }
        } else {
            this.field2430 = arg2.method46((byte) 65);
        }
        ++field2434;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2438;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3825.method681(arg1, (byte) -62);
            if (super.field3825.field1840) {
                int[] var4 = this.method1245(0, arg1 + -1 & class1.field4, 11433);
                int[] var5 = this.method1245(0, arg1, 11433);
                int[] var6 = this.method1245(0, arg1 + 1 & class1.field4, arg0 ^ 11433);
                for (int var7 = 0; ~class54.field1430 < ~var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field2430;
                    int var9 = (var5[var7 + 1 & class75.field1867] + -var5[class75.field1867 & var7 - 1]) * this.field2430;
                    int var10 = var8 >> 12;
                    int var11 = var10 * var10 >> 12;
                    int var12 = var9 >> 12;
                    int var13 = var12 * var12 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((var13 - (-var11 - 4096)) / 4096)) * 4096.0D);
                    int var15;
                    int var16;
                    int var17;
                    if (~var14 == -1) {
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                    } else {
                        var15 = var9 / var14;
                        var16 = var8 / var14;
                        var17 = 16777216 / var14;
                    }
                    int var18 = this.field2437[1] * var16 >> 12;
                    int var19 = this.field2437[0] * var15 >> 12;
                    int var20 = this.field2437[2] * var17 >> 12;
                    var3[var7] = var19 - -var20 + var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class108() {
        super(1, true);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method876(byte arg0) {
        field2433 = null;
        field2429 = null;
        field2447 = null;
        field2442 = null;
        field2445 = null;
        if (arg0 > -35) {
            field2443 = null;
        }
        field2446 = null;
        field2443 = null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        this.method877(false);
        if (!arg0) {
            field2445 = null;
        }
        ++field2436;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(Z)V")
    private final void method877(boolean arg0) {
        ++field2440;
        double var2 = Math.cos((double) (this.field2435 / 4096));
        this.field2437[0] = (int) (4096.0D * Math.sin((double) (this.field2439 / 4096)) * var2);
        if (!arg0) {
            this.field2437[1] = (int) (4096.0D * var2 * Math.cos((double) (this.field2439 / 4096)));
            this.field2437[2] = (int) (Math.sin((double) (this.field2435 / 4096)) * 4096.0D);
            int var4 = this.field2437[1] * this.field2437[1] >> 12;
            int var5 = this.field2437[0] * this.field2437[0] >> 12;
            int var6 = this.field2437[2] * this.field2437[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field2437[0] = (this.field2437[0] << 12) / var7;
                this.field2437[1] = (this.field2437[1] << 12) / var7;
                this.field2437[2] = (this.field2437[2] << 12) / var7;
            }
        }
    }
}
