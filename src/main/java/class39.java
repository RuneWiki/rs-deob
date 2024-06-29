import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class39 extends class130 {

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public static final int method266(int arg0, int arg1, int arg2) {
        int var3 = -15 % ((arg2 + 21) / 40);
        field697++;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 13;
        int var6 = (var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lf;ILf;Lf;Lg;)Z")
    public static final boolean method267(class47 arg0, int arg1, class47 arg2, class47 arg3, class56 arg4) {
        class194.field3847 = arg3;
        class184.field3549 = arg2;
        class57.field1150 = arg0;
        if (arg1 == 789221) {
            class165.field3139 = arg4;
            field698++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class39() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field700 = arg0;
    }
}
