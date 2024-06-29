import java.awt.datatransfer.Clipboard;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class112 extends class202 {

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    private int field1573 = 4096;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    private int field1572 = 2000;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
    private int field1576 = 16;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
    private int field1578 = 0;

    @OriginalMember(owner = "client!bs", name = "Q", descriptor = "Lbi;")
    public static class104 field1579 = new class104(76, 7);

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1580;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "[[B")
    public static byte[][] field1571;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field1573 = arg0.method1455(-3387);
                        }
                    } else {
                        this.field1574 = arg0.method1455(-3387);
                    }
                } else {
                    this.field1576 = arg0.method1445(46);
                }
            } else {
                this.field1572 = arg0.method1455(-3387);
            }
        } else {
            this.field1578 = arg0.method1445(53);
        }
        int var5 = 35 % ((arg1 - -46) / 50);
        ++field1577;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field1575;
        int[] var3 = super.field3064.method2452((byte) 103, arg0);
        if (!arg1) {
            this.field1573 = -50;
        }
        if (super.field3064.field5837) {
            int var4 = this.field1573 >> 1;
            int[][] var5 = super.field3064.method2450(0);
            Random var6 = new Random((long) this.field1578);
            for (int var7 = 0; this.field1572 > var7; ++var7) {
                int var8 = ~this.field1573 >= -1 ? this.field1574 : this.field1574 - (var4 + -class167.method1057(-3481, var6, this.field1573));
                int var9 = (4085 & var8) >> 4;
                int var10 = class167.method1057(-3481, var6, class276.field4375);
                int var11 = class167.method1057(-3481, var6, class249.field4051);
                int var12 = (class237.field3882[var9] * this.field1576 >> 12) + var10;
                int var13 = (class425.field6440[var9] * this.field1576 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class167.method1057(-3481, var6, 4096) >> 2) + 1024;
                    int var27 = var11 < var13 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = var26 + 1024 - -((-var10 + var28) * var25);
                        int var30 = var28 & class538.field7882;
                        int var31 = var21 & class335.field5237;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
    public static void method725(int arg0) {
        if (arg0 != 1742608961) {
            method725(37);
        }
        field1580 = null;
        field1571 = null;
        field1579 = null;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        int var2 = -7 / ((arg0 - 80) / 46);
        class62.method461(-108);
        ++field1581;
    }
}
