import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class709 {

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "Z")
    public boolean field9748 = false;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
    public int field9752 = 64;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public int field9749 = 1;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "Z")
    public boolean field9742 = false;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
    public int field9755 = -1;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    public int field9754 = 64;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public int field9753 = 2;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "B")
    public static byte field9746 = -6;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "Lad;")
    public static class448 field9750 = new class448();

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "B")
    public static byte field9743;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "Ljava/lang/String;")
    public static String field9751;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lfca;IB)V")
    public final void method3953(class93 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method793((byte) 16);
            if (var4 == 0) {
                field9747++;
                if (arg2 != -10) {
                    method3956(55, false);
                    return;
                }
                return;
            }
            this.method3954((byte) 105, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLfca;II)V")
    private final void method3954(byte arg0, class93 arg1, int arg2, int arg3) {
        if (arg0 <= 47) {
            return;
        }
        field9745++;
        if (arg2 == 1) {
            this.field9755 = arg1.method763(-123);
            if (this.field9755 == 65535) {
                this.field9755 = -1;
                return;
            }
        } else if (arg2 == 2) {
            this.field9754 = arg1.method763(-76) + 1;
            this.field9752 = arg1.method763(-72) + 1;
        } else if (arg2 == 3) {
            arg1.method766((byte) 122);
            return;
        } else if (arg2 == 4) {
            this.field9753 = arg1.method793((byte) 103);
            return;
        } else if (arg2 == 5) {
            this.field9749 = arg1.method793((byte) 14);
            return;
        } else {
            if (arg2 == 6) {
                this.field9748 = true;
            } else if (arg2 == 7) {
                this.field9742 = true;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public static void method3955(int arg0) {
        field9751 = null;
        int var1 = -1 / ((arg0 + 3) / 50);
        field9750 = null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZ)V")
    public static final void method3956(int arg0, boolean arg1) {
        field9744++;
        int var2 = class440.field5977 - class415.field5691;
        if (!arg1) {
            return;
        }
        if (var2 >= 100) {
            class536.field7291 = 1;
            class100.field1626 = -1;
            class577.field8185 = -1;
            return;
        }
        int var3 = (int) class43.field682;
        if (var3 < (class224.field3284 >> 8)) {
            var3 = class224.field3284 >> 8;
        }
        if (class727.field9991[4] && (class214.field3184[4] + 128) > var3) {
            var3 = class214.field3184[4] + 128;
        }
        int var4 = (int) class53.field763 + class485.field6563 & 0x3FFF;
        class584.method3357(arg0, (byte) -128, class488.field6593, class97.field1557, var4, (var3 >> 3) * 3 + 600 << 2, var3, class309.method1973(15356, class235.field3379.field7396, class235.field3379.field7398, class282.field3917) - 200);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class733.field10131 = (int) ((float) (class733.field10131 - class695.field9621) * var5 + (float) class695.field9621);
        class605.field8452 = (int) ((float) (class605.field8452 - class366.field4971) * var5 + (float) class366.field4971);
        class255.field3585 = (int) ((float) (class255.field3585 - class132.field2269) * var5 + (float) class132.field2269);
        class450.field6172 = (int) ((float) (class450.field6172 - class382.field5193) * var5 + (float) class382.field5193);
        int var6 = class460.field6249 - class634.field8771;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class460.field6249 = (int) ((float) var6 * var5 + (float) class634.field8771);
        class460.field6249 &= 0x3FFF;
    }
}
