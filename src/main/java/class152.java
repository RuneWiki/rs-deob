import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class152 extends class227 {

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    private int field1986 = 0;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    private int field1987 = 20;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    private int field1985 = 0;

    @OriginalMember(owner = "client!em", name = "O", descriptor = "I")
    private int field1988 = 1365;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "Lqh;")
    public static class50 field1989 = new class50(8);

    @OriginalMember(owner = "client!em", name = "R", descriptor = "[Ljv;")
    public static class57[] field1991 = new class57[128];

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "[I")
    public static int[] field1990 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!em", name = "S", descriptor = "Lao;")
    public static class191 field1992 = new class191(22, 18);

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "[Lo;")
    public static class24[] field1984;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "[Lya;")
    public static class38[] field1993;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V")
    public static void method908(boolean arg0) {
        field1991 = null;
        field1990 = null;
        field1993 = null;
        if (!arg0) {
            field1989 = null;
        }
        field1989 = null;
        field1992 = null;
        field1984 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field1982;
        int[] var3 = super.field3068.method1970(arg1, (byte) 121);
        if (arg0 != 15811) {
            field1993 = null;
        }
        if (super.field3068.field4480) {
            for (int var4 = 0; class446.field6486 > var4; ++var4) {
                int var5 = (class4.field37[var4] << 12) / this.field1988 + this.field1986;
                int var6 = (class190.field2457[arg1] << 12) / this.field1988 + this.field1985;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && ~this.field1987 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field1987 + -1 > var13 ? (var13 << 12) / this.field1987 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field1981;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 == -4) {
                        this.field1985 = arg0.method2386(-23648);
                    }
                } else {
                    this.field1986 = arg0.method2386(-23648);
                }
            } else {
                this.field1987 = arg0.method2386(-23648);
            }
        } else {
            this.field1988 = arg0.method2386(-23648);
        }
        if (arg1 != 487215116) {
            this.method61((class396) null, 24, 113);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(II)I")
    public static final int method909(int arg0, int arg1) {
        ++field1983;
        if (arg1 != -241375636) {
            return 64;
        } else {
            int var2 = arg0 & 63;
            int var3 = (210 & arg0) >> 6;
            if (var2 != 18) {
                if (var2 == 19 || var2 == 21) {
                    if (var3 == 0) {
                        return 16;
                    }
                    if (var3 == 1) {
                        return 32;
                    }
                    if (~var3 == -3) {
                        return 64;
                    }
                    if (var3 == 3) {
                        return 128;
                    }
                }
            } else {
                if (~var3 == -1) {
                    return 1;
                }
                if (~var3 == -2) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (~var3 == -4) {
                    return 8;
                }
            }
            return 0;
        }
    }
}
