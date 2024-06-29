import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class227 extends class191 {

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lqv;")
    public static class316 field3426 = new class316(73, -1);

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "J")
    public long field3420;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1523(int arg0, int arg1, int arg2) {
        field3418++;
        if (arg0 != 16) {
            method1525(16, 105, 31, -7, 85);
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)J", line = 15)
    public final long method1303(byte arg0) {
        field3416++;
        return arg0 <= 124 ? -97L : this.field3420;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 29)
    public static void method1524(int arg0) {
        field3426 = null;
        if (arg0 != 73) {
            method1523(69, 31, 83);
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)I", line = 42)
    public final int method1305(byte arg0) {
        if (arg0 != 126) {
            this.method1301((byte) 67);
        }
        field3417++;
        return 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I", line = 55)
    public final int method1300(int arg0) {
        field3421++;
        return arg0 == 0 ? this.field3419 : -96;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V", line = 67)
    public static final void method1525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3423++;
        class51.field944 = arg3;
        class173.field2594 = arg2;
        class503.field7250 = arg0;
        if (arg1 == 24209) {
            class434.field6214 = arg4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V", line = 81)
    public static final void method1526(int arg0, int arg1, int arg2) {
        field3422++;
        class414 var3 = class57.field1019[arg0][arg2];
        if (var3 != null) {
            class455.field6618 = var3.field5851;
            class206.field3138 = var3.field5864;
            class457.field6634 = var3.field5869;
        }
        class133.method973(true);
        int var4 = 28 % ((39 - arg1) / 47);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I", line = 105)
    public final int method1301(byte arg0) {
        if (arg0 != 39) {
            this.method1301((byte) -3);
        }
        field3425++;
        return this.field3427;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I", line = 116)
    public final int method1302(int arg0) {
        if (arg0 == -6) {
            field3424++;
            return this.field3415;
        } else {
            return 5;
        }
    }
}
