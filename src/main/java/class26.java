import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class26 {

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "B")
    public byte field241;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lmm;")
    public class26 field234;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIFFF)F", line = 10)
    public static final float method118(int arg0, int arg1, float arg2, float arg3, float arg4) {
        if (arg0 != 2) {
            method118(85, -44, -0.39909163F, -1.0961156F, 1.1634107F);
        }
        field240++;
        float[] var5 = class313.field4711[arg1];
        return var5[2] * arg4 + var5[1] * arg3 + var5[0] * arg2;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Lcr;", line = 27)
    public final class446 method119(int arg0) {
        field251++;
        if (arg0 != 2) {
            this.method120(124, -114, 76, -122);
        }
        return class483.method2935(this.field245, 24319);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Lmm;", line = 38)
    public final class26 method120(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 67 % ((-arg1 - 54) / 43);
        field246++;
        return new class26(this.field245, arg2, arg0, arg3, this.field241);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIB)V", line = 54)
    public class26(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field241 = arg4;
        this.field236 = arg1;
        this.field248 = arg3;
        this.field244 = arg2;
        this.field245 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lmm;I)V", line = 65)
    public class26(class26 arg0, int arg1) {
        this.field234 = arg0;
        this.field244 = this.field234.field244 + arg1;
        this.field236 = this.field234.field236 + arg1;
        this.field241 = this.field234.field241;
        this.field245 = this.field234.field245;
        this.field248 = this.field234.field248 + arg1;
    }
}
