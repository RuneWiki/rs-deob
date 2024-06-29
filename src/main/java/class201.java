import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class201 extends class124 {

    @OriginalMember(owner = "client!gh", name = "U", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!gh", name = "Z", descriptor = "Le;")
    public static class191 field3610 = class54.method368("hint_mapmarkers", 2047);

    @OriginalMember(owner = "client!gh", name = "Y", descriptor = "Lwe;")
    public static class147 field3609 = new class147(4);

    @OriginalMember(owner = "client!gh", name = "P", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!gh", name = "Q", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!gh", name = "R", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!gh", name = "S", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!gh", name = "T", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!gh", name = "ab", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!gh", name = "X", descriptor = "[[[Lnd;")
    public static class199[][][] field3608;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
    public static final boolean method1407(int arg0, int arg1) {
        ++field3606;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (~arg0 <= -49 && ~arg0 >= -58) {
            return true;
        } else {
            if (arg1 != 2) {
                field3608 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (arg2) {
            ++field3603;
            if (~arg0 == -1) {
                super.field2063 = ~arg1.method1580(-115) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field3607;
        int[][] var3 = super.field2053.method1775((byte) -109, arg0);
        if (arg1 != -7) {
            field3609 = null;
        }
        if (super.field2053.field4558) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class64.field1132 > var7; ++var7) {
                this.method1408(var7, (byte) -100, arg0);
                int[][] var8 = this.method843((byte) -37, class248.field4415, 0);
                var4[var7] = var8[0][class57.field1054];
                var5[var7] = var8[1][class57.field1054];
                var6[var7] = var8[2][class57.field1054];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class201() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBI)V")
    private final void method1408(int arg0, byte arg1, int arg2) {
        ++field3604;
        int var4 = class257.field4559[arg0];
        int var5 = class236.field4202[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (arg1 >= -61) {
            field3610 = null;
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class57.field1054 = arg0;
            class248.field4415 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class248.field4415 = arg0;
            class57.field1054 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class57.field1054 = class64.field1132 - arg2;
            class248.field4415 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class248.field4415 = -arg2 + class87.field1423;
            class57.field1054 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class57.field1054 = -arg0 + class64.field1132;
            class248.field4415 = class87.field1423 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class248.field4415 = class87.field1423 - arg0;
            class57.field1054 = -arg2 + class64.field1132;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class57.field1054 = arg2;
            class248.field4415 = -arg0 + class87.field1423;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class57.field1054 = -arg0 + class64.field1132;
            class248.field4415 = arg2;
        }
        class57.field1054 &= class8.field82;
        class248.field4415 &= class181.field3119;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        if (arg0 < 68) {
            field3610 = null;
        }
        if (super.field2064.field1035) {
            for (int var4 = 0; class64.field1132 > var4; ++var4) {
                this.method1408(var4, (byte) -98, arg1);
                int[] var5 = this.method844(0, 81, class248.field4415);
                var3[var4] = var5[class57.field1054];
            }
        }
        ++field3602;
        return var3;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lng;ZIZLng;)Ltc;")
    public static final class126 method1409(class121 arg0, boolean arg1, int arg2, boolean arg3, class121 arg4) {
        ++field3601;
        boolean var5 = arg1;
        int[] var6 = arg4.method811(arg2, 0);
        for (int var7 = 0; var6.length > var7; ++var7) {
            byte[] var8 = arg4.method806(var6[var7], arg2, (byte) 115);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (255 & var8[0]) << 8 | var8[1] & 255;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method806(var9, 0, (byte) 115);
                } else {
                    var10 = arg0.method806(0, var9, (byte) 115);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class126(arg4, arg0, arg2, arg3);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
    public static void method1410(byte arg0) {
        field3609 = null;
        field3610 = null;
        if (arg0 != -55) {
            method1410((byte) -80);
        }
        field3608 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
    public static final int method1411(int arg0, int arg1) {
        ++field3611;
        return arg0 != 255 ? -127 : arg1 & 1023;
    }
}
