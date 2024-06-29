import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class5 extends class273 {

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field78 = 0;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[Lwm;")
    public static class152[] field80 = new class152[5];

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "Lwm;")
    public static class152 field82 = class157.method1048("Sprites charg-Bs", 99);

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 6)
    public static void method23(byte arg0) {
        field82 = null;
        field80 = null;
        if (arg0 > -65) {
            field84 = -33;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 17)
    public static final void method24(int arg0) {
        field79++;
        class58.method381(4004, 5);
        class196.method1310(0, 5);
        class239.method1635((byte) 53, 5);
        class243.method1661(5, 2);
        class125.method796(-112, 5);
        class28.method228(5, 114);
        class91.method600(arg0 ^ 0x57EC, 5);
        class87.method568(5, -95);
        class59.method393(arg0 - 14756, 5);
        class23.method195(5, 0);
        class270.method1858(5, -70);
        class46.method322(-107, 5);
        class94.method623(5, 4);
        class45.method310((byte) 126, 5);
        class30.method234(3, 5);
        class160.method1082(50, (byte) 34);
        class192.method1275((byte) 107, 5);
        class23.method194((byte) 63, 5);
        class18.field253.method1617(5, 50);
        if (arg0 != 15090) {
            method25(79, -5, 97, 5);
        }
        class162.field2563.method1617(5, arg0 - 15040);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)I", line = 68)
    public static final int method25(int arg0, int arg1, int arg2, int arg3) {
        field77++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (arg1 != 5) {
                method23((byte) -127);
            }
            return var4 == 2 ? 7 - arg0 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V", line = 90)
    public class5(int arg0, int arg1) {
        this.field81 = arg0;
        this.field85 = arg1;
    }
}
