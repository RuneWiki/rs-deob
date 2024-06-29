import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class113 extends class73 {

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "[F")
    public static float[] field1444 = new float[4];

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "F")
    public static float field1448;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lf;")
    private class532 field1436;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Lf;")
    private class532 field1437;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "Lf;")
    public class532 field1438;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Lf;")
    private class532 field1445;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Lf;")
    private class532 field1447;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "Lf;")
    private class532 field1449;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
    public void method666(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 2) {
            this.field1437 = null;
        }
        this.field1438.method2992(arg1, arg3, arg2, arg4);
        ++field1442;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public final boolean method404(boolean arg0) {
        ++field1443;
        if (!super.method404(arg0)) {
            return false;
        } else {
            class77 var2 = (class77) super.field873;
            if (!super.field872.method1931(1, var2.field907)) {
                return false;
            } else if (!super.field872.method1931(1, var2.field910)) {
                return false;
            } else if (!super.field872.method1931(1, var2.field909)) {
                return false;
            } else if (!super.field872.method1931(1, var2.field902)) {
                return false;
            } else if (!super.field872.method1931(1, var2.field911)) {
                return false;
            } else {
                return super.field872.method1931(1, var2.field906);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BZII)V")
    public final void method401(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 <= 14) {
            this.field1447 = null;
        }
        ++field1446;
        int var5 = this.field1447.method523() + arg3;
        int var6 = super.field873.field9733 + arg3 + -this.field1449.method523();
        int var7 = this.field1445.method532() + arg2;
        int var8 = super.field873.field9743 + (arg2 - this.field1436.method532());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method400(2) * var9 / 10000;
        int[] var12 = new int[4];
        class146.field1963.method1057(var12);
        class146.field1963.method1042(var5, var7, var5 - -var11, var8);
        this.method666(2, var5, var9, var7, var10);
        class146.field1963.method1042(var5 + var11, var7, var6, var8);
        this.field1437.method2992(var5, var7, var9, var10);
        class146.field1963.method1042(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method402(int arg0) {
        ++field1440;
        super.method402(120);
        class77 var2 = (class77) super.field873;
        this.field1438 = class567.method3141(-15, super.field872, var2.field907);
        this.field1437 = class567.method3141(117, super.field872, var2.field910);
        this.field1447 = class567.method3141(-60, super.field872, var2.field909);
        this.field1449 = class567.method3141(-8, super.field872, var2.field902);
        this.field1445 = class567.method3141(125, super.field872, var2.field911);
        if (arg0 <= 119) {
            field1441 = 117;
        }
        this.field1436 = class567.method3141(111, super.field872, var2.field906);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V")
    public static void method667(boolean arg0) {
        if (!arg0) {
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lga;Lga;Ljp;)V")
    public class113(class332 arg0, class332 arg1, class77 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Z")
    public static final boolean method668(byte arg0, int arg1) {
        ++field1439;
        if (arg0 <= 21) {
            method667(true);
        }
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIBI)V")
    public final void method403(boolean arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= 93) {
            if (arg0) {
                int[] var5 = new int[4];
                class146.field1963.method1057(var5);
                class146.field1963.method1042(arg1, arg3, arg1 - -super.field873.field9733, super.field873.field9743 + arg3);
                int var6 = this.field1447.method523();
                int var7 = this.field1447.method532();
                int var8 = this.field1449.method523();
                int var9 = this.field1449.method532();
                this.field1447.method2990(arg1, (super.field873.field9743 - var7) / 2 + arg3);
                this.field1449.method2990(super.field873.field9733 + arg1 + -var8, (super.field873.field9743 - var9) / 2 + arg3);
                class146.field1963.method1042(arg1, arg3, super.field873.field9733 + arg1, this.field1445.method532() + arg3);
                this.field1445.method2992(arg1 + var6, arg3, -var6 + super.field873.field9733 + -var8, super.field873.field9743);
                int var10 = this.field1436.method532();
                class146.field1963.method1042(arg1, -var10 + arg3 - -super.field873.field9743, arg1 - -super.field873.field9733, super.field873.field9743 + arg3);
                this.field1436.method2992(arg1 - -var6, -var10 + arg3 - -super.field873.field9743, -var6 + -var8 + super.field873.field9733, super.field873.field9743);
                class146.field1963.method1042(var5[0], var5[1], var5[2], var5[3]);
            }
            ++field1434;
        }
    }
}
