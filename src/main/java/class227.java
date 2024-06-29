import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class227 extends class172 {

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Z")
    public static boolean field3551 = false;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "[Z")
    public static boolean[] field3540 = new boolean[100];

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "F")
    public static float field3542;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)Z", line = 6)
    public final boolean method1692(int arg0) {
        if (arg0 > -23) {
            field3551 = false;
        }
        field3550++;
        return (this.field3544 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Z", line = 19)
    public final boolean method1693(int arg0) {
        field3541++;
        if (arg0 > -10) {
            method1704((byte) -67, -16);
        }
        return (this.field3544 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)Z", line = 34)
    public final boolean method1694(int arg0) {
        if (arg0 == 1) {
            field3543++;
            return (this.field3544 & 0x432505) >> 22 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)I", line = 48)
    public final int method1695(int arg0) {
        field3549++;
        if (arg0 != -1) {
            this.method1695(-51);
        }
        return class37.method369(0, this.field3544);
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)I", line = 59)
    public final int method1696(int arg0) {
        field3538++;
        return arg0 == 2089534706 ? (this.field3544 & 0x1E9134) >> 18 : -70;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z", line = 75)
    public final boolean method1697(byte arg0) {
        int var2 = -55 % ((arg0 + 32) / 35);
        field3547++;
        return ((this.field3544 & 0x3A9C28) >> 21) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)V", line = 84)
    public static void method1698(int arg0) {
        field3540 = null;
        if (arg0 <= 69) {
            field3540 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lug;B)Lck;", line = 99)
    public static final class86 method1699(class25 arg0, byte arg1) {
        if (arg1 != 88) {
            method1698(115);
        }
        arg0.method281(-125);
        field3545++;
        int var2 = arg0.method281(-124);
        class86 var3 = class185.method1425((byte) 75, var2);
        var3.field1245 = arg0.method281(arg1 ^ 0xFFFFFFD9);
        int var4 = arg0.method281(36);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method281(19);
            var3.method157(var6, false, arg0);
        }
        var3.method476(0);
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z", line = 135)
    public final boolean method1700(boolean arg0) {
        field3552++;
        if (arg0) {
            return false;
        } else {
            return (this.field3544 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z", line = 148)
    public final boolean method1701(boolean arg0, int arg1) {
        if (arg0) {
            field3548++;
            return (this.field3544 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)Z", line = 162)
    public final boolean method1702(boolean arg0) {
        field3537++;
        if (arg0) {
            this.method1692(-93);
        }
        return (this.field3544 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V", line = 172)
    public class227(int arg0, int arg1) {
        this.field3546 = arg1;
        this.field3544 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z", line = 185)
    public final boolean method1703(byte arg0) {
        field3539++;
        if (arg0 != 80) {
            this.method1703((byte) 16);
        }
        return (this.field3544 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V", line = 199)
    public static final void method1704(byte arg0, int arg1) {
        if (class42.field671 == 0) {
            class128.field2122.method153(arg1, (byte) 125);
        } else {
            class110.field1693 = arg1;
        }
        field3535++;
        if (arg0 > -19) {
            field3536 = 94;
        }
    }
}
