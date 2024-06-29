import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class99 extends class362 {

    @OriginalMember(owner = "client!in", name = "D", descriptor = "Lfja;")
    public static class783 field1616 = new class783(42, 10);

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field1617 = -1;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            super.field4929 = arg0.method793((byte) 119) == 1;
        }
        ++field1615;
        if (arg2 != -1) {
            field1617 = 11;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field1613;
        if (arg1 < 57) {
            this.method156(41, -34);
        }
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (super.field4938.field7848) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class769.field10597 > var7; ++var7) {
                this.method872(false, var7, arg0);
                int[][] var8 = this.method2222(0, class760.field10478, 28008);
                var4[var7] = var8[0][class446.field6134];
                var5[var7] = var8[1][class446.field6134];
                var6[var7] = var8[2][class446.field6134];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
    public static void method871(int arg0) {
        field1616 = null;
        int var1 = 82 / ((arg0 - 19) / 50);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZII)V")
    private final void method872(boolean arg0, int arg1, int arg2) {
        ++field1614;
        int var4 = class172.field2750[arg1];
        if (arg0) {
            this.method154((class93) null, 79, -45);
        }
        int var5 = class135.field2287[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class446.field6134 = arg1;
            class760.field10478 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class760.field10478 = arg1;
            class446.field6134 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class446.field6134 = -arg2 + class769.field10597;
            class760.field10478 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class760.field10478 = class555.field7845 - arg2;
            class446.field6134 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class760.field10478 = -arg2 + class555.field7845;
            class446.field6134 = class769.field10597 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class446.field6134 = -arg2 + class769.field10597;
            class760.field10478 = -arg1 + class555.field7845;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class760.field10478 = -arg1 + class555.field7845;
            class446.field6134 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class760.field10478 = arg2;
            class446.field6134 = -arg1 + class769.field10597;
        }
        class446.field6134 &= class522.field7083;
        class760.field10478 &= class606.field8463;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field1612;
        if (arg0 != -2026769311) {
            return null;
        } else {
            int[] var3 = super.field4927.method808(arg0 + 2026769187, arg1);
            if (super.field4927.field1471) {
                for (int var4 = 0; class769.field10597 > var4; ++var4) {
                    this.method872(false, var4, arg1);
                    int[] var5 = this.method2221(0, class760.field10478, -84);
                    var3[var4] = var5[class446.field6134];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, false);
    }
}
