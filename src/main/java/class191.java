import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 extends class13 {

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    private int field2623 = 0;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    private int field2624 = 20;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    private int field2631 = 1365;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    private int field2628 = 0;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2632 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
    public static final void method1237(int arg0) {
        class131 var1 = class337.field4640;
        synchronized (class337.field4640) {
            class337.field4640.method900(0);
        }
        ++field2627;
        class131 var2 = class360.field4970;
        synchronized (class360.field4970) {
            class360.field4970.method900(0);
        }
        class131 var3 = class387.field5560;
        synchronized (class387.field5560) {
            class387.field5560.method900(0);
        }
        class131 var4 = class141.field2011;
        synchronized (class141.field2011) {
            class141.field2011.method900(0);
            if (arg0 <= 2) {
                method1242(-79);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lms;Luo;Z)V")
    public static final void method1238(class453 arg0, class345 arg1, boolean arg2) {
        ++field2626;
        boolean var3 = class212.method1396(arg1, arg0.field6325, arg0.field6368, !arg0.field6379 ? null : class412.field5841.field1934, (byte) 78, arg0.field6396, -16777216 | arg0.field6401, arg0.field6452) == null;
        if (var3) {
            class114.field1640.method643(new class128(arg0.field6452, arg0.field6396, arg0.field6325, -16777216 | arg0.field6401, arg0.field6368, arg0.field6379), -83);
        }
        if (!arg2) {
            method1242(-7);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lnq;I)I")
    public static final int method1239(class268 arg0, int arg1) {
        ++field2633;
        int var2 = 0;
        if (arg0.method1759(-109, class223.field3119)) {
            ++var2;
        }
        if (arg0.method1759(-121, class224.field3175)) {
            ++var2;
        }
        if (arg0.method1759(-79, class99.field1375)) {
            ++var2;
        }
        if (arg1 != 2) {
            field2634 = 64;
        }
        if (arg0.method1759(-52, class205.field2823)) {
            ++var2;
        }
        if (arg0.method1759(-100, class9.field173)) {
            ++var2;
        }
        if (arg0.method1759(-33, class436.field6142)) {
            ++var2;
        }
        if (arg0.method1759(-99, class159.field2227)) {
            ++var2;
        }
        if (arg0.method1759(-81, class377.field5397)) {
            ++var2;
        }
        if (arg0.method1759(-31, class214.field2986)) {
            ++var2;
        }
        if (arg0.method1759(-110, class273.field3783)) {
            ++var2;
        }
        if (arg0.method1759(-83, class70.field1023)) {
            ++var2;
        }
        if (arg0.method1759(arg1 + -53, class328.field4546)) {
            ++var2;
        }
        if (arg0.method1759(-127, class18.field324)) {
            ++var2;
        }
        if (arg0.method1759(-105, class416.field5914)) {
            ++var2;
        }
        if (arg0.method1759(-50, class292.field4081)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 > 50) {
            ++field2630;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            this.field2628 = arg0.method174(255);
                        }
                    } else {
                        this.field2623 = arg0.method174(255);
                    }
                } else {
                    this.field2624 = arg0.method174(255);
                }
            } else {
                this.field2631 = arg0.method174(255);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
    public static final void method1240(int arg0) {
        class288.field4047.method905((byte) 64);
        if (arg0 == -16777216) {
            ++field2622;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[IJI)Ljava/lang/String;")
    public static final String method1241(int arg0, int[] arg1, long arg2, int arg3) {
        if (arg3 != -8797) {
            return null;
        } else {
            ++field2625;
            if (class7.field109 != null) {
                String var5 = class7.field109.method435(arg2, arg1, arg3 ^ -8795, arg0);
                if (var5 != null) {
                    return var5;
                }
            }
            return Long.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field2632 = null;
        if (arg0 != 26742) {
            field2634 = 30;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field2629;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            field2632 = null;
        }
        if (super.field263.field1845) {
            for (int var4 = 0; ~class269.field3751 < ~var4; ++var4) {
                int var5 = (class296.field4148[var4] << 12) / this.field2631 + this.field2623;
                int var6 = (class277.field3873[arg1] << 12) / this.field2631 - -this.field2628;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && ~var13 > ~this.field2624) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 - -var7;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field2624 + -1 ? 0 : (var13 << 12) / this.field2624;
            }
        }
        return var3;
    }
}
