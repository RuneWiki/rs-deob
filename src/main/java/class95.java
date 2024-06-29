import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class95 {

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public int field1310 = 128;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public int field1315 = 128;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field1312 = 0;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "Lkj;")
    public static class275 field1311 = new class275();

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Lrda;", line = 6)
    public final class95 method552(int arg0) {
        if (arg0 > -50) {
            this.field1309 = -39;
        }
        field1306++;
        return new class95(this.field1309, this.field1315, this.field1310, this.field1308, this.field1305, this.field1314);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V", line = 17)
    public static void method553(int arg0) {
        if (arg0 < -32) {
            field1311 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLrda;)V", line = 29)
    public final void method554(byte arg0, class95 arg1) {
        this.field1310 = arg1.field1310;
        this.field1314 = arg1.field1314;
        this.field1305 = arg1.field1305;
        if (arg0 != 110) {
            this.method552(-78);
        }
        this.field1309 = arg1.field1309;
        field1313++;
        this.field1315 = arg1.field1315;
        this.field1308 = arg1.field1308;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(I)V", line = 63)
    public class95(int arg0) {
        this.field1309 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(IIIIII)V", line = 70)
    private class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1315 = arg1;
        this.field1314 = arg5;
        this.field1310 = arg2;
        this.field1308 = arg3;
        this.field1309 = arg0;
        this.field1305 = arg4;
    }
}
