import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class169 extends class377 {

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    private int field1980 = 4096;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "Lue;")
    public static class218 field1983;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field1985;
        int var3 = 27 % ((5 - arg1) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -123);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, arg0, (byte) -123);
            for (int var6 = 0; var6 < class528.field6661; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~this.field1981 >= ~var7 && this.field1980 >= var7 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        field1983 = null;
        if (arg0 != -99) {
            field1984 = 25;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -91 / ((13 - arg1) / 55);
        ++field1982;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1980 = arg2.method3031(-1);
            }
        } else {
            this.field1981 = arg2.method3031(-1);
        }
    }
}
