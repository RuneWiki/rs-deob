import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class86 extends class687 {

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1185 = 104;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V")
    public static final void method657(int arg0) {
        field1179++;
        class292.field4399.method453(class269.field3826, class274.field3872.field902 ? class629.field8789 + 256 << 2 : -1, 0);
        if (arg0 < 41) {
            field1185 = 63;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method658(int arg0, int arg1) {
        class486 var2 = class658.field9266[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class486 var4 = class658.field9266[var3][arg0][arg1] = class658.field9266[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6744--;
                for (class20 var5 = var4.field6751; var5 != null; var5 = var5.field284) {
                    class39 var6 = var5.field281;
                    if (var6.field517 == arg0 && var6.field512 == arg1) {
                        var6.field520--;
                    }
                }
            }
        }
        if (class658.field9266[0][arg0][arg1] == null) {
            class658.field9266[0][arg0][arg1] = new class486(0, arg0, arg1);
            class658.field9266[0][arg0][arg1].field6737 = 1;
        }
        class658.field9266[0][arg0][arg1].field6745 = var2;
        class658.field9266[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIII)V")
    public class86(int arg0, int arg1, int arg2, int arg3) {
        this.field1178 = arg0;
        this.field1183 = arg2;
        this.field1180 = arg3;
        this.field1182 = arg1;
    }
}
