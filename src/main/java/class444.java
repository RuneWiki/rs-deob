import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public abstract class class444 extends class105 {

    @OriginalMember(owner = "client!lv", name = "D", descriptor = "S")
    public short field6312;

    @OriginalMember(owner = "client!lv", name = "F", descriptor = "[F")
    public static float[] field6314 = new float[16384];

    @OriginalMember(owner = "client!lv", name = "I", descriptor = "[F")
    public static float[] field6317 = new float[16384];

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!lv", name = "A", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIII)V")
    public static final void method2668(int arg0, int arg1, int arg2, int arg3) {
        ++field6308;
        if (class650.field8925 != arg1 || class473.field6702 != arg0 || ~class407.field5772 != ~arg2) {
            class650.field8925 = arg1;
            class473.field6702 = arg0;
            class407.field5772 = arg2;
            class230.field3098 = true;
            double var4 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class134.field1954 = -var8 * var14;
            class568.field8060 = var12;
            class449.field6367 = var10 * var14;
            if (arg3 != -1) {
                field6317 = null;
            }
            class635.field8745 = var8 * var12;
            class277.field3924 = var14;
            class555.field7792 = 0.0D;
            class698.field9624 = var8;
            class160.field2202 = var10;
            class510.field7295 = -var10 * var12;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "([Lwi;I)I")
    public final int method618(class465[] arg0, int arg1) {
        ++field6311;
        int var3 = super.field1264 >> class660.field9038;
        int var4 = super.field1250 >> class660.field9038;
        int var5 = 0;
        if (class136.field1982 != var3) {
            if (class136.field1982 < var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (~class481.field6801 == ~var4) {
            var5 += 3;
        } else if (var4 < class481.field6801) {
            var5 += 6;
        }
        int var6 = class607.field8550[var5];
        if (~(var6 & this.field6312) != arg1) {
            return this.method742(var3, arg0, (byte) -73, var4);
        } else if (~this.field6312 == -2 && ~var3 < -1) {
            return this.method742(var3 + -1, arg0, (byte) -19, var4);
        } else if (~this.field6312 == -5 && ~class492.field6939 <= ~var3) {
            return this.method742(var3 - -1, arg0, (byte) -79, var4);
        } else if (this.field6312 == 8 && ~var4 < -1) {
            return this.method742(var3, arg0, (byte) -112, var4 - 1);
        } else if (this.field6312 == 2 && class365.field5171 >= var4) {
            return this.method742(var3, arg0, (byte) -26, var4 + 1);
        } else if (this.field6312 == 16 && ~var3 < -1 && class365.field5171 >= var4) {
            return this.method742(var3 + -1, arg0, (byte) -97, var4 - -1);
        } else if (~this.field6312 == -33 && var3 <= class492.field6939 && class365.field5171 >= var4) {
            return this.method742(var3 + 1, arg0, (byte) -37, var4 + 1);
        } else if (this.field6312 == 128 && var3 > 0 && var4 > 0) {
            return this.method742(var3 + -1, arg0, (byte) -101, var4 + -1);
        } else if (this.field6312 == 64 && ~var3 >= ~class492.field6939 && ~var4 < -1) {
            return this.method742(var3 + 1, arg0, (byte) -33, var4 + -1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "(I)V")
    public static void method2669(int arg0) {
        field6314 = null;
        field6317 = null;
        if (arg0 > -96) {
            method2670(false);
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(Z)V")
    public static final void method2670(boolean arg0) {
        if (!arg0) {
            field6316 = -79;
        }
        ++field6309;
        if (class451.field6391 != -1) {
            class138.method974(-1, -1, class451.field6391, 0, false);
            class451.field6391 = -1;
        }
    }

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        if (arg0 > -85) {
            field6317 = null;
        }
        ++field6313;
        return class471.method2812(true, super.field1264 >> class660.field9038, super.field1258, super.field1250 >> class660.field9038, this);
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIIII)V")
    public class444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field1250 = arg2;
        super.field1258 = (byte) arg4;
        super.field1266 = (byte) arg3;
        super.field1264 = arg0;
        this.field6312 = (short) arg5;
        super.field1255 = arg1;
    }

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "(I)Z")
    public final boolean method617(int arg0) {
        if (arg0 != -21499) {
            method2670(false);
        }
        ++field6310;
        return class589.field8299[(super.field1264 >> class660.field9038) + -class136.field1982 + class453.field6405][(super.field1250 >> class660.field9038) + -class481.field6801 + class453.field6405];
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6317[var2] = (float) Math.sin((double) var2 * var0);
            field6314[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
