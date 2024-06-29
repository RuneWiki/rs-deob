import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class379 extends class172 {

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field5441 = 1406;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    private int field5436;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        if (arg0 == 71) {
            arg1.method411(-33, this.field5433, this.field5436);
            field5435++;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I")
    public static final int method2367(int arg0, int arg1, int arg2) {
        if (arg0 < 25) {
            return -11;
        }
        field5440++;
        int var3 = arg1 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static final void method2368(int arg0) {
        class208.field2898 = null;
        class346.field5032 = null;
        class182.field2292 = null;
        class78.field878 = null;
        class672.field9437 = null;
        class559.field7865 = null;
        class74.field832 = null;
        if (arg0 >= -126) {
            field5441 = 5;
        }
        class161.field2085 = null;
        class386.field5515 = null;
        field5434++;
        class69.field768 = null;
        class612.field8622 = null;
        class623.field8739 = null;
        class686.field9579 = null;
        class382.field5483 = null;
        class683.field9569 = null;
        class59.field686 = null;
        class140.field1792 = null;
        class475.field6585 = null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
    public static final void method2369(int arg0) {
        if (arg0 != 0) {
            method2370(true, -10, -40);
        }
        class678.field9487.method314(arg0 - 2);
        field5442++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        field5439++;
        this.field5436 = arg1.method3008(64);
        if (arg0 == 2048) {
            this.field5433 = arg1.method3008(64);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZII)I")
    public static final int method2370(boolean arg0, int arg1, int arg2) {
        field5438++;
        if (arg0) {
            return 0;
        }
        class717 var3 = class159.method1020(arg0, false, arg1);
        int var4 = 5 % ((-arg2 - 69) / 37);
        if (var3 == null) {
            return class532.field7331.method3619(arg1, 105).field6870;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var3.field9937.length; var6++) {
            if (var3.field9937[var6] == -1) {
                var5++;
            }
        }
        return var5 + class532.field7331.method3619(arg1, 122).field6870 - var3.field9937.length;
    }
}
