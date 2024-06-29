import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class110 extends class283 {

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    private int field1751 = 585;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
    public static int[] field1748 = new int[5];

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lna;")
    private static class26 field1752 = class69.method505("Use", (byte) -125);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Lna;")
    public static class26 field1755 = field1752;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "Z")
    public static boolean field1754 = true;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static volatile int field1756 = 0;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "Ljava/awt/Font;")
    public static Font field1749;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)I", line = 22)
    public static final int method777(int arg0, int arg1, int arg2) {
        field1750++;
        if (arg1 >= -99) {
            field1754 = true;
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 42)
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBI)V", line = 46)
    public static final void method778(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg4 <= arg2) {
            class76.method543(class45.field710[arg1], arg4, -83, arg2, arg0);
        } else {
            class76.method543(class45.field710[arg1], arg2, -48, arg4, arg0);
        }
        if (arg3 > -55) {
            method778(99, 100, 74, (byte) 13, 92);
        }
        field1753++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I", line = 70)
    public final int[] method8(int arg0, byte arg1) {
        field1757++;
        int var3 = -76 / ((arg1 - 30) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = class59.field955[arg0];
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                int var7 = class13.field184[var6];
                if (var7 > this.field1751 && 4096 - this.field1751 > var7 && (2048 - this.field1751) < var5 && var5 < (this.field1751 + 2048)) {
                    int var8 = 2048 - var7;
                    int var9 = var8 < 0 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (2048 - this.field1751);
                    var4[var6] = 4096 - var11;
                } else if (var7 > (2048 - this.field1751) && var7 < this.field1751 + 2048) {
                    int var12 = var5 - 2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field1751;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (2048 - this.field1751);
                } else if (var5 < this.field1751 || (4096 - this.field1751) < var5) {
                    int var20 = var7 - 2048;
                    int var21 = var20 < 0 ? -var20 : var20;
                    int var22 = var21 - this.field1751;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (2048 - this.field1751);
                } else if (this.field1751 <= var7 && var7 <= 4096 - this.field1751) {
                    var4[var6] = 0;
                } else {
                    int var16 = 2048 - var5;
                    int var17 = var16 < 0 ? -var16 : var16;
                    int var18 = var17 << 12;
                    int var19 = var18 / (2048 - this.field1751);
                    var4[var6] = 4096 - var19;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V", line = 148)
    public static void method779(int arg0) {
        field1752 = null;
        field1748 = null;
        field1749 = null;
        field1755 = null;
        if (arg0 != -21136) {
            method777(-38, -96, -102);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILwa;Z)V", line = 165)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1747++;
        if (!arg2) {
            field1756 = 99;
        }
        if (arg0 == 0) {
            this.field1751 = arg1.method576(1);
        }
    }
}
