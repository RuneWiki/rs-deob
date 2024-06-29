import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class253 extends class200 {

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    private int field4434 = 1365;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    private int field4431 = 0;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    private int field4438 = 0;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    private int field4436 = 20;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "Lid;")
    public static class149 field4429 = class60.method382("", (byte) 11);

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "Lid;")
    private static class149 field4435 = class60.method382("Checking for updates )2 ", (byte) 79);

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "Lid;")
    public static class149 field4441 = field4435;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field4440 = 0;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "Lvc;")
    public static class190 field4439;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method26(18, (byte) -107);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field4438 = arg0.method485(-2386);
                    }
                } else {
                    this.field4431 = arg0.method485(-2386);
                }
            } else {
                this.field4436 = arg0.method485(-2386);
            }
        } else {
            this.field4434 = arg0.method485(-2386);
        }
        ++field4430;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.field4434 = -107;
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            for (int var4 = 0; class137.field2515 > var4; ++var4) {
                int var5 = (class73.field1263[var4] << 12) / this.field4434 + this.field4431;
                int var6 = (class93.field1644[arg0] << 12) / this.field4434 - -this.field4438;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field4436) {
                    var9 = (var9 * var10 >> 12) * 2 + var8;
                    var10 = var7 + var11 + -var12;
                    ++var13;
                    var12 = var9 * var9 >> 12;
                    var11 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < this.field4436 + -1 ? (var13 << 12) / this.field4436 : 0;
            }
        }
        ++field4433;
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public static void method1748(int arg0) {
        if (arg0 != -10744) {
            field4435 = null;
        }
        field4435 = null;
        field4441 = null;
        field4429 = null;
        field4439 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
    public static final void method1749(int arg0, boolean arg1) {
        ++field4428;
        if (arg1) {
            method1749(-120, false);
        }
        if (class73.field1267 == null || class73.field1267.length < arg0) {
            class73.field1267 = new int[arg0];
        }
    }
}
