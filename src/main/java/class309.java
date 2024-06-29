import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class309 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "F")
    public float field5258;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "F")
    public float field5260;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public int field5269;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "F")
    public float field5276;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field5262 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lhi;")
    private static class82 field5266 = class95.method664((byte) -125, "Sun");

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
    public static int[] field5261 = new int[128];

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lhi;")
    private static class82 field5263 = class95.method664((byte) -90, "Fri");

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lhi;")
    private static class82 field5275 = class95.method664((byte) -57, "Tue");

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lhi;")
    private static class82 field5265 = class95.method664((byte) -84, "Wed");

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field5277 = 0;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lhi;")
    private static class82 field5267 = class95.method664((byte) -87, "Mon");

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "Lhi;")
    private static class82 field5278 = class95.method664((byte) -126, "Sat");

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Lhi;")
    private static class82 field5280 = class95.method664((byte) -42, "Thu");

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "[Lhi;")
    public static class82[] field5272 = new class82[] { field5266, field5267, field5275, field5265, field5280, field5263, field5278 };

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "[Lti;")
    public static class186[] field5271;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lhi;I)Lmb;", line = 4)
    public static final class109 method2129(class82 arg0, int arg1) {
        field5274++;
        for (class109 var2 = (class109) class42.field741.method1936(16173); var2 != null; var2 = (class109) class42.field741.method1926((byte) 90)) {
            if (var2.field1955.method534(-43, arg0)) {
                return var2;
            }
        }
        int var3 = -87 / ((arg1 + 30) / 34);
        return null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V", line = 54)
    public static final void method2130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5279++;
        int var6 = 0;
        int var7 = arg1 * arg1;
        int var8 = arg0;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = ((arg0 << 1) - 3) * var11;
        int var18 = (arg0 - 1) * var15;
        if (class60.field931 <= arg3 && arg3 <= class29.field399) {
            int var19 = class163.method1179(arg5 + arg1, class207.field3623, class200.field3443, (byte) -77);
            int var20 = class163.method1179(arg5 - arg1, class207.field3623, class200.field3443, (byte) -89);
            class114.method780(104, var20, var19, arg4, class73.field1117[arg3]);
        }
        if (arg2 > -100) {
            return;
        }
        int var21 = var9 << 2;
        int var22 = (var6 + 1) * var21;
        while (var8 > 0) {
            var8--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var22;
                    var22 += var21;
                    var13 += var16;
                    var16 += var21;
                }
            }
            int var23 = arg3 - var8;
            int var24 = arg3 + var8;
            if (var14 < 0) {
                var6++;
                var13 += var16;
                var16 += var21;
                var14 += var22;
                var22 += var21;
            }
            var14 += -var17;
            var17 -= var15;
            if (var24 >= class60.field931 && class29.field399 >= var23) {
                int var25 = class163.method1179(arg5 + var6, class207.field3623, class200.field3443, (byte) -102);
                int var26 = class163.method1179(arg5 - var6, class207.field3623, class200.field3443, (byte) -102);
                if (class60.field931 <= var23) {
                    class114.method780(-40, var26, var25, arg4, class73.field1117[var23]);
                }
                if (var24 <= class29.field399) {
                    class114.method780(115, var26, var25, arg4, class73.field1117[var24]);
                }
            }
            var13 += -var18;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 161)
    public static void method2131(int arg0) {
        field5265 = null;
        field5266 = null;
        field5278 = null;
        if (arg0 != 17426817) {
            method2131(-110);
        }
        field5280 = null;
        field5275 = null;
        field5263 = null;
        field5271 = null;
        field5272 = null;
        field5267 = null;
        field5261 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 196)
    public class309() {
        this.field5258 = 1.1523438F;
        this.field5260 = 1.2F;
        this.field5270 = class85.field1528;
        this.field5264 = -50;
        this.field5268 = -60;
        this.field5259 = -50;
        this.field5269 = 0;
        this.field5276 = 0.69921875F;
        this.field5273 = class85.field1524;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lbc;)V", line = 212)
    public class309(class153 arg0) {
        int var2 = arg0.method1082(-94);
        if ((var2 & 0x1) == 0) {
            this.field5270 = class85.field1528;
        } else {
            this.field5270 = arg0.method1097((byte) -113);
        }
        if ((var2 & 0x2) == 0) {
            this.field5258 = 1.1523438F;
        } else {
            this.field5258 = (float) arg0.method1090(false) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field5276 = 0.69921875F;
        } else {
            this.field5276 = (float) arg0.method1090(false) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field5260 = 1.2F;
        } else {
            this.field5260 = (float) arg0.method1090(false) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5264 = -50;
            this.field5259 = -50;
            this.field5268 = -60;
        } else {
            this.field5264 = arg0.method1052(31521);
            this.field5268 = arg0.method1052(31521);
            this.field5259 = arg0.method1052(31521);
        }
        if ((var2 & 0x20) == 0) {
            this.field5273 = class85.field1524;
        } else {
            this.field5273 = arg0.method1097((byte) -88);
        }
        if ((var2 & 0x40) == 0) {
            this.field5269 = 0;
        } else {
            this.field5269 = arg0.method1090(false);
        }
    }
}
