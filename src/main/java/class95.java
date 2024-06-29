import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class95 extends class197 {

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    private int field1663 = 585;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "[Loh;")
    public static class258[] field1660 = new class258[100];

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Lgb;")
    public static class213 field1662;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "Lgb;")
    public static class213 field1667;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILva;I)V", line = 6)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            method696(114, 48, 90, 64);
        }
        if (arg2 == 0) {
            this.field1663 = arg1.method1615(92);
        }
        field1659++;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IB)V", line = 34)
    public static final void method695(int arg0, byte arg1) {
        class29.field342.method1156(arg0, 0);
        field1661++;
        if (arg1 != -125) {
            field1662 = (class213) null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Lwj;", line = 51)
    public static final class247 method696(int arg0, int arg1, int arg2, int arg3) {
        class247 var4 = new class247();
        field1665++;
        var4.field4279 = arg2;
        var4.field4283 = arg0;
        class276.field4750.method984((byte) -82, var4, (long) arg1);
        class93.method689(true, arg0);
        class171 var5 = class263.method1844(arg1, (byte) -70);
        if (var5 != null) {
            class165.method1099((byte) 127, var5);
        }
        if (class23.field297 != null) {
            class165.method1099((byte) 126, class23.field297);
            class23.field297 = null;
        }
        if (arg3 <= 49) {
            return (class247) null;
        }
        int var6 = class69.field1195;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class164.method1096(class227.field3910[var7], (byte) 66)) {
                class191.method1288(var7, true);
            }
        }
        if (class69.field1195 == 1) {
            class252.field4342 = false;
            class93.method691(-124, class84.field1414, class224.field3845, class218.field3766, class201.field3490);
        } else {
            class93.method691(-124, class84.field1414, class224.field3845, class218.field3766, class201.field3490);
            int var8 = class123.field2180.method252(class16.field204);
            for (int var9 = 0; var9 < class69.field1195; var9++) {
                int var10 = class123.field2180.method252(class63.method488(true, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class84.field1414 = var8 + 8;
            class224.field3845 = class69.field1195 * 15 + 22;
        }
        if (var5 != null) {
            class92.method686((byte) 79, false, var5);
        }
        class231.method1542(arg0, 2000000);
        if (class170.field2901 != -1) {
            class20.method134(class170.field2901, -29750, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I", line = 149)
    public final int[] method96(int arg0, int arg1) {
        field1658++;
        int[] var3 = this.field3456.method2104(arg1, arg0 + 16221);
        if (arg0 != -16221) {
            field1664 = 79;
        }
        if (this.field3456.field5115) {
            int var4 = class268.field4670[arg1];
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                int var6 = class166.field2822[var5];
                if (var6 > this.field1663 && var6 < (4096 - this.field1663) && (2048 - this.field1663) < var4 && var4 < (this.field1663 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1663);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field1663 < var6 && var6 < this.field1663 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field1663;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1663);
                } else if (var4 < this.field1663 || var4 > 4096 - this.field1663) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1663;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1663);
                } else if (var6 >= this.field1663 && (4096 - this.field1663) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1663);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(B)V", line = 230)
    public static void method697(byte arg0) {
        field1667 = null;
        field1660 = null;
        field1662 = null;
        if (arg0 != -58) {
            field1664 = 53;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 243)
    public class95() {
        super(0, true);
    }
}
