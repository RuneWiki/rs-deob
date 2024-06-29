import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class135 extends class201 {

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[I")
    public static int[] field1537 = new int[3];

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "F")
    public static float field1531;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lhu;")
    private class131 field1526;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lhu;")
    private class131 field1528;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lhu;")
    public class131 field1530;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lhu;")
    private class131 field1533;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lhu;")
    private class131 field1535;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "Lhu;")
    private class131 field1536;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 3)
    public static void method866(int arg0) {
        if (arg0 == 0) {
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z", line = 17)
    public final boolean method9(byte arg0) {
        ++field1532;
        if (!super.method9(arg0)) {
            return false;
        } else {
            class511 var2 = (class511) super.field2375;
            if (!super.field2379.method2463((byte) 96, var2.field7299)) {
                return false;
            } else if (!super.field2379.method2463((byte) 94, var2.field7295)) {
                return false;
            } else if (!super.field2379.method2463((byte) 114, var2.field7289)) {
                return false;
            } else if (!super.field2379.method2463((byte) 95, var2.field7294)) {
                return false;
            } else if (!super.field2379.method2463((byte) 97, var2.field7286)) {
                return false;
            } else {
                return super.field2379.method2463((byte) 126, var2.field7296);
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIZ)V", line = 56)
    public final void method867(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field1525;
        int var5 = arg1 + this.field1533.method501();
        int var6 = super.field2375.field1249 + arg1 + -this.field1536.method501();
        int var7 = arg2 - -this.field1535.method510();
        int var8 = arg2 + (super.field2375.field1250 - this.field1528.method510());
        if (!arg3) {
            this.field1530 = null;
        }
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method1212(100) * var9 / 10000;
        int[] var12 = new int[4];
        class275.field3370.method354(var12);
        class275.field3370.method432(var5, var7, var5 + var11, var8);
        this.method870(var5, var10, var7, (byte) 21, var9);
        class275.field3370.method432(var5 + var11, var7, var6, var8);
        this.field1526.method819(var5, var7, var9, var10);
        class275.field3370.method432(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Loh;Loh;Luca;)V", line = 89)
    public class135(class404 arg0, class404 arg1, class511 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 92)
    public static final void method868(int arg0) {
        ++field1538;
        if (!class262.method1575(class392.field5397, arg0 + 21182) && !class100.method700((byte) 8, class392.field5397)) {
            int var1 = class90.field937.field7187[0] >> 3;
            int var2 = class90.field937.field7193[0] >> 3;
            if (~var1 <= -1 && class489.field6976 >> 3 > var1 && var2 >= 0 && class153.field1677 >> 3 > var2) {
                class678.method3850(var2, var1, 5000, 24892);
            } else {
                class678.method3850(class153.field1677 >> 4, class489.field6976 >> 4, 0, arg0 ^ -13196);
            }
        } else {
            class678.method3850(class590.field8319 >> 12, class167.field1855 >> 12, 5000, 24892);
        }
        class289.method1716((byte) 103);
        class211.method1253(-1678206238);
        class451.method2779(0);
        class514.method3037(-22201);
        if (arg0 != -21176) {
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 128)
    public final void method11(int arg0) {
        ++field1527;
        super.method11(arg0);
        class511 var2 = (class511) super.field2375;
        this.field1530 = class563.method3280(super.field2379, 0, var2.field7299);
        this.field1526 = class563.method3280(super.field2379, arg0 ^ arg0, var2.field7295);
        this.field1533 = class563.method3280(super.field2379, 0, var2.field7289);
        this.field1536 = class563.method3280(super.field2379, 0, var2.field7294);
        this.field1535 = class563.method3280(super.field2379, 0, var2.field7286);
        this.field1528 = class563.method3280(super.field2379, 0, var2.field7296);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIII)V", line = 144)
    public final void method869(boolean arg0, int arg1, int arg2, int arg3) {
        ++field1534;
        int var5 = -101 % ((-69 - arg3) / 42);
        if (arg0) {
            int[] var6 = new int[4];
            class275.field3370.method354(var6);
            class275.field3370.method432(arg2, arg1, super.field2375.field1249 + arg2, super.field2375.field1250 + arg1);
            int var7 = this.field1533.method501();
            int var8 = this.field1533.method510();
            int var9 = this.field1536.method501();
            int var10 = this.field1536.method510();
            this.field1533.method824(arg2, (-var8 + super.field2375.field1250) / 2 + arg1);
            this.field1536.method824(super.field2375.field1249 + arg2 + -var9, (-var10 + super.field2375.field1250) / 2 + arg1);
            class275.field3370.method432(arg2, arg1, super.field2375.field1249 + arg2, arg1 + this.field1535.method510());
            this.field1535.method819(arg2 + var7, arg1, -var9 + super.field2375.field1249 + -var7, super.field2375.field1250);
            int var11 = this.field1528.method510();
            class275.field3370.method432(arg2, super.field2375.field1250 + arg1 - var11, arg2 - -super.field2375.field1249, super.field2375.field1250 + arg1);
            this.field1528.method819(arg2 + var7, super.field2375.field1250 + arg1 - var11, -var7 + super.field2375.field1249 + -var9, super.field2375.field1250);
            class275.field3370.method432(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIBI)V", line = 179)
    public void method870(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 21) {
            this.method870(-101, 10, -9, (byte) -80, -51);
        }
        this.field1530.method819(arg0, arg2, arg4, arg1);
        ++field1529;
    }
}
