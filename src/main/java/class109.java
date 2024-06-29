import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class109 extends class8 {

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    private int field1798 = 0;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    private int field1802 = 4096;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Z")
    public static boolean field1800 = false;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field1801 = 0;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Z")
    public static boolean field1805 = false;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            field1800 = true;
        }
        int[] var3 = super.field110.method1585(0, arg1);
        ++field1796;
        if (super.field110.field3734) {
            int[] var4 = this.method61(arg1, 120, 0);
            for (int var5 = 0; ~class231.field3798 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field1798 >= ~var6 && this.field1802 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)Log;")
    public static final class221 method797(byte arg0) {
        ++field1806;
        class221 var1 = new class221(34);
        var1.method1548(-494964184, 11);
        var1.method1548(-494964184, class20.field342);
        var1.method1548(-494964184, class10.field151 ? 1 : 0);
        var1.method1548(-494964184, class229.field3785 ? 1 : 0);
        var1.method1548(-494964184, class22.field361 ? 1 : 0);
        var1.method1548(-494964184, class284.field4487 ? 1 : 0);
        var1.method1548(-494964184, !class51.field893 ? 0 : 1);
        var1.method1548(-494964184, class79.field1269 ? 1 : 0);
        int var2 = 41 % ((-41 - arg0) / 52);
        var1.method1548(-494964184, !class281.field4459 ? 0 : 1);
        var1.method1548(-494964184, !class78.field1254 ? 0 : 1);
        var1.method1548(-494964184, class97.field1575);
        var1.method1548(-494964184, !class169.field2671 ? 0 : 1);
        var1.method1548(-494964184, !class236.field3851 ? 0 : 1);
        var1.method1548(-494964184, !class107.field1776 ? 0 : 1);
        var1.method1548(-494964184, class252.field4018);
        var1.method1548(-494964184, !class260.field4139 ? 0 : 1);
        var1.method1548(-494964184, class94.field1550);
        var1.method1548(-494964184, class284.field4480);
        var1.method1548(-494964184, class107.field1745);
        var1.method1554(class178.field2801, (byte) 89);
        var1.method1554(class4.field50, (byte) 89);
        var1.method1548(-494964184, class130.method924());
        var1.method1529((byte) 126, class235.field3831);
        var1.method1548(-494964184, class282.field4463);
        var1.method1548(-494964184, class231.field3808 ? 1 : 0);
        var1.method1548(-494964184, class235.field3836 ? 1 : 0);
        var1.method1548(-494964184, class100.field1649);
        var1.method1548(-494964184, class278.field4370 ? 1 : 0);
        var1.method1548(-494964184, class22.field379 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V")
    public static final void method798(byte arg0) {
        ++field1803;
        class136.field2246.method472((byte) -63);
        class27.field433.method472((byte) -63);
        if (arg0 > -91) {
            method797((byte) -43);
        }
        class179.field2819.method472((byte) -63);
        class121.field1966.method472((byte) -63);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field1797;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1802 = arg1.method1521((byte) 113);
            }
        } else {
            this.field1798 = arg1.method1521((byte) 113);
        }
        if (arg0 <= 62) {
            this.method64((byte) -45, (class221) null, -19);
        }
    }
}
