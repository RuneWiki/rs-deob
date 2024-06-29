import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class204 extends class53 {

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    private int field3454 = 4096;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    private int field3453 = 4096;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    private int field3464 = 4096;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Lwa;")
    public static class75 field3455 = class66.method560(" <col=00ff80>", false);

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "[[[B")
    public static byte[][][] field3459 = new byte[4][104][104];

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "Lwa;")
    private static class75 field3461 = class66.method560("Connection lost)3", false);

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "Lwa;")
    public static class75 field3465 = class66.method560(":assist:", false);

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Lwa;")
    public static class75 field3456 = field3461;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "Lwa;")
    private static class75 field3462 = class66.method560("Loading interfaces )2 ", false);

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Lwa;")
    public static class75 field3452 = field3462;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lod;B)V", line = 6)
    public static final void method1515(class24 arg0, byte arg1) {
        class167.method1241(arg0, 0, 200000);
        if (arg1 != 9) {
            method1515((class24) null, (byte) 115);
        }
        field3457++;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 86)
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I", line = 30)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = -79 / ((76 - arg1) / 42);
        field3458++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(108, 0, arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class269.field4644; var12++) {
                int var13 = var7[var12];
                int var14 = var6[var12];
                int var15 = var8[var12];
                if (var13 == var15 && var14 == var15) {
                    var9[var12] = this.field3464 * var13 >> 12;
                    var10[var12] = this.field3453 * var15 >> 12;
                    var11[var12] = this.field3454 * var14 >> 12;
                } else {
                    var9[var12] = this.field3464;
                    var10[var12] = this.field3453;
                    var11[var12] = this.field3454;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILja;Z)V", line = 94)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            method1517(123, (class60) null);
        }
        if (arg0 == 0) {
            this.field3464 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field3453 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field3454 = arg1.method485((byte) -2);
        }
        field3463++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(JB)V", line = 147)
    public static final void method1516(long arg0, byte arg1) {
        field3466++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        if (arg1 > -95) {
            field3459 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILja;)Ldk;", line = 162)
    public static final class200 method1517(int arg0, class60 arg1) {
        if (arg0 != 4096) {
            return (class200) null;
        }
        class200 var2 = new class200();
        field3460++;
        var2.field3377 = arg1.method485((byte) -2);
        var2.field3390 = class303.method2087(1, var2.field3377);
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V", line = 185)
    public static void method1518(byte arg0) {
        field3465 = null;
        field3459 = (byte[][][]) null;
        if (arg0 >= -26) {
            field3461 = (class75) null;
        }
        field3456 = null;
        field3462 = null;
        field3452 = null;
        field3455 = null;
        field3461 = null;
    }
}
