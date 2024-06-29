import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class466 extends class326 {

    @OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
    public static int field6457 = 0;

    @OriginalMember(owner = "client!dr", name = "U", descriptor = "I")
    public static int field6459 = 0;

    @OriginalMember(owner = "client!dr", name = "N", descriptor = "Lgd;")
    public static class206 field6452 = new class206("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
    public static int field6460 = 0;

    @OriginalMember(owner = "client!dr", name = "P", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!dr", name = "Q", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!dr", name = "R", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!dr", name = "T", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!dr", name = "O", descriptor = "Lh;")
    public static class434 field6453;

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
    public class466() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field6455;
        if (~arg0 == -1) {
            super.field4358 = ~arg1.method201((byte) -115) == -2;
        }
        if (arg2 >= -3) {
            this.method30((byte) 87, 56);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        ++field6456;
        int[][] var3 = super.field4343.method2356(arg0, 97);
        if (arg1 > -52) {
            return null;
        } else {
            if (super.field4343.field5336) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class181.field2495; ++var7) {
                    this.method2745(var7, 24593, arg0);
                    int[][] var8 = this.method1828(0, true, class168.field2327);
                    var4[var7] = var8[0][class90.field1311];
                    var5[var7] = var8[1][class90.field1311];
                    var6[var7] = var8[2][class90.field1311];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)V")
    public static void method2744(int arg0) {
        field6453 = null;
        field6452 = null;
        int var1 = -60 / ((-69 - arg0) / 32);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
    private final void method2745(int arg0, int arg1, int arg2) {
        ++field6458;
        int var4 = class389.field5375[arg0];
        int var5 = class95.field1400[arg2];
        if (arg1 == 24593) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class90.field1311 = arg0;
                class168.field2327 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class90.field1311 = arg2;
                class168.field2327 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class90.field1311 = -arg2 + class181.field2495;
                class168.field2327 = arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class90.field1311 = arg0;
                class168.field2327 = class27.field359 - arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class168.field2327 = -arg2 + class27.field359;
                class90.field1311 = -arg0 + class181.field2495;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class90.field1311 = class181.field2495 - arg2;
                class168.field2327 = -arg0 + class27.field359;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class168.field2327 = -arg0 + class27.field359;
                class90.field1311 = arg2;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class168.field2327 = arg2;
                class90.field1311 = -arg0 + class181.field2495;
            }
            class168.field2327 &= class266.field3509;
            class90.field1311 &= class459.field6226;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field6454;
        int[] var3 = super.field4344.method130(arg1, 95);
        if (arg0 >= -6) {
            this.method33(94, (class32) null, -64);
        }
        if (super.field4344.field286) {
            for (int var4 = 0; var4 < class181.field2495; ++var4) {
                this.method2745(var4, 24593, arg1);
                int[] var5 = this.method1824(0, false, class168.field2327);
                var3[var4] = var5[class90.field1311];
            }
        }
        return var3;
    }
}
