import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class94 extends class240 {

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    private int field1744 = 1365;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    private int field1745 = 0;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    private int field1750 = 20;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    private int field1752 = 0;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "[I")
    public static int[] field1743 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Lcd;")
    public static class64 field1738 = class44.method335((byte) 71, "(Z");

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "Lcd;")
    public static class64 field1740 = class44.method335((byte) 71, "null");

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lcd;")
    private static class64 field1751 = class44.method335((byte) 71, "yellow:");

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Lcd;")
    public static class64 field1739 = class44.method335((byte) 71, "blinken2:");

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "Lcd;")
    public static class64 field1748 = field1751;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lcd;")
    public static class64 field1746 = field1751;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Lej;")
    public static class149 field1747;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Lqm;")
    public static class222 field1741;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Lqm;")
    public static class222 field1753;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V", line = 14)
    public static void method713(byte arg0) {
        field1747 = null;
        field1753 = null;
        field1751 = null;
        field1746 = null;
        field1739 = null;
        field1740 = null;
        field1748 = null;
        field1738 = null;
        field1741 = null;
        field1743 = null;
        if (arg0 != 34) {
            method713((byte) 34);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 40)
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILkh;)V", line = 67)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field1744 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field1750 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field1745 = arg2.method112((byte) 92);
        } else if (arg1 == 3) {
            this.field1752 = arg2.method112((byte) 92);
        }
        if (arg0 != 2) {
            this.method12(-1, 4);
        }
        field1754++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I", line = 142)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            method713((byte) -5);
        }
        int[] var3 = this.field4094.method179(arg1, true);
        field1742++;
        if (this.field4094.field344) {
            for (int var4 = 0; var4 < class169.field2936; var4++) {
                int var5 = (class74.field1408[var4] << 12) / this.field1744 + this.field1745;
                int var6 = var5;
                int var7 = (class268.field4615[arg1] << 12) / this.field1744 + this.field1752;
                int var8 = var5;
                int var9 = var7;
                int var10 = var7;
                int var11 = var5 * var5 >> 12;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field1750) {
                    var13++;
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var8 = var6 + var11 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var8 * var8 >> 12;
                }
                var3[var4] = this.field1750 - 1 > var13 ? (var13 << 12) / this.field1750 : 0;
            }
        }
        return var3;
    }
}
