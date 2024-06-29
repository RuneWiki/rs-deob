import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class153 extends class189 {

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    private int field3198 = 20;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    private int field3199 = 0;

    @OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
    private int field3206 = 1365;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
    private int field3197 = 0;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "Lgg;")
    public static class63 field3194 = class116.method911(43, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3196 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!r", name = "xb", descriptor = "Lgg;")
    public static class63 field3210 = class116.method911(43, "");

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "Lgg;")
    public static class63 field3201 = field3210;

    @OriginalMember(owner = "client!r", name = "wb", descriptor = "Lgg;")
    public static class63 field3209 = field3210;

    @OriginalMember(owner = "client!r", name = "rb", descriptor = "Lgg;")
    public static class63 field3204 = field3210;

    @OriginalMember(owner = "client!r", name = "ub", descriptor = "Lgg;")
    public static class63 field3207 = field3210;

    @OriginalMember(owner = "client!r", name = "vb", descriptor = "Lgg;")
    public static class63 field3208 = class116.method911(43, "(Y<)4col>");

    @OriginalMember(owner = "client!r", name = "sb", descriptor = "Lgg;")
    public static class63 field3205 = field3210;

    @OriginalMember(owner = "client!r", name = "zb", descriptor = "Lgg;")
    public static class63 field3212 = field3210;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!r", name = "qb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!r", name = "yb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3193;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
    public static final int method1067(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3203;
        if (arg0 != 0) {
            this.method77(-120, (byte) 95, (class3) null);
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -111);
        if (super.field3825.field1840) {
            for (int var4 = 0; ~var4 > ~class54.field1430; ++var4) {
                int var5 = (class35.field825[var4] << 12) / this.field3206 + this.field3199;
                int var6 = (class21.field496[arg1] << 12) / this.field3206 - -this.field3197;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5 * var5 >> 12;
                int var11 = var5;
                int var12 = 0;
                int var13 = var6 * var6 >> 12;
                while (var10 + var13 < 16384 && this.field3198 > var12) {
                    var8 = (var8 * var11 >> 12) * 2 + var9;
                    var11 = -var13 + var10 + var7;
                    var10 = var11 * var11 >> 12;
                    var13 = var8 * var8 >> 12;
                    ++var12;
                }
                var3[var4] = var12 < this.field3198 + -1 ? (var12 << 12) / this.field3198 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIZLhf;)V")
    public static final void method1068(byte[] arg0, int arg1, boolean arg2, class71 arg3) {
        ++field3195;
        class34 var4 = new class34();
        var4.field807 = arg0;
        if (arg2) {
            method1070(102, false, 78);
        }
        var4.field812 = 0;
        var4.field808 = arg3;
        var4.field3612 = (long) arg1;
        class148 var5 = class69.field1729;
        synchronized (class69.field1729) {
            class69.field1729.method1034(0, var4);
        }
        class74.method679(-25);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        if (arg0 != 123) {
            method1068((byte[]) null, -15, false, (class71) null);
        }
        field3212 = null;
        field3196 = null;
        field3201 = null;
        field3204 = null;
        field3210 = null;
        field3193 = null;
        field3205 = null;
        field3209 = null;
        field3194 = null;
        field3207 = null;
        field3208 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field3197 = arg2.method46((byte) 65);
                    }
                } else {
                    this.field3199 = arg2.method46((byte) 65);
                }
            } else {
                this.field3198 = arg2.method46((byte) 65);
            }
        } else {
            this.field3206 = arg2.method46((byte) 65);
        }
        if (arg1 <= 32) {
            this.method90(66, 42);
        }
        ++field3200;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZI)I")
    public static final int method1070(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return 33;
        } else {
            ++field3211;
            int var3 = 1;
            while (~arg0 < -2) {
                if ((1 & arg0) != 0) {
                    var3 = arg2 * var3;
                }
                arg0 >>= 1;
                arg2 *= arg2;
            }
            if (~arg0 == -2) {
                return arg2 * var3;
            } else {
                return var3;
            }
        }
    }
}
