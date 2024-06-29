import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class76 extends class107 {

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    private int field1430 = 1365;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    private int field1431 = 20;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    private int field1437 = 0;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    private int field1443 = 0;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "Lfb;")
    public static class29 field1432 = new class29();

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "[I")
    public static int[] field1442 = new int[128];

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field1444 = -1;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "Lfa;")
    public static class239 field1438;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lfa;")
    public static class239 field1440;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "Lfa;")
    public static class239 field1441;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "[I")
    public static int[] field1445;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            ++field1436;
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            if (super.field1921.field3539) {
                for (int var4 = 0; class106.field1862 > var4; ++var4) {
                    int var5 = (class182.field3199[var4] << 12) / this.field1430 + this.field1443;
                    int var6 = (class185.field3233[arg1] << 12) / this.field1430 - -this.field1437;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var6;
                    int var10 = var5;
                    int var11 = var5 * var5 >> 12;
                    int var12 = 0;
                    for (int var13 = var6 * var6 >> 12; var11 + var13 < 16384 && ~this.field1431 < ~var12; var13 = var9 * var9 >> 12) {
                        ++var12;
                        var9 = (var9 * var10 >> 12) * 2 - -var8;
                        var10 = -var13 + var7 + var11;
                        var11 = var10 * var10 >> 12;
                    }
                    var3[var4] = this.field1431 + -1 <= var12 ? 0 : (var12 << 12) / this.field1431;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lw;B)Lw;")
    public static final class141 method588(class141 arg0, byte arg1) {
        ++field1434;
        class141 var2 = client.method1045(arg0);
        if (var2 == null) {
            var2 = arg0.field2494;
        }
        if (arg1 != 76) {
            field1432 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1440 = null;
        if (arg0 != 494) {
            field1445 = null;
        }
        field1441 = null;
        field1438 = null;
        field1442 = null;
        field1445 = null;
        field1432 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field1433;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1437 = arg0.method339(-16777216);
                    }
                } else {
                    this.field1443 = arg0.method339(arg2 + -16744703);
                }
            } else {
                this.field1431 = arg0.method339(-16777216);
            }
        } else {
            this.field1430 = arg0.method339(-16777216);
        }
        if (arg2 != -32513) {
            field1438 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIII)V")
    public static final void method590(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 35) {
            method591(52, 102, 92, (class239) null);
        }
        ++field1446;
        class270 var4 = class202.method1368(-15, 11, arg2);
        var4.method1793(13);
        var4.field4628 = arg3;
        var4.field4619 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILfa;)[Lgj;")
    public static final class225[] method591(int arg0, int arg1, int arg2, class239 arg3) {
        ++field1435;
        if (arg0 != 0) {
            method589(-2);
        }
        return !class123.method883(arg2, arg1, -1, arg3) ? null : class214.method1430((byte) 76);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(BI)V")
    public static final void method592(byte arg0, int arg1) {
        class143.method986(true);
        ++field1439;
        class39.method402(arg0 + -27350);
        int var2 = class181.method1241(16, arg1).field3089;
        if (var2 != 0) {
            int var3 = class202.field3471[arg1];
            if (~var2 == -10) {
                class235.field4077 = var3;
            }
            if (var2 == 6) {
                class182.field3208 = var3;
            }
            if (var2 == 5) {
                class7.field93 = var3;
            }
            if (arg0 != -87) {
                method592((byte) 54, 44);
            }
        }
    }
}
