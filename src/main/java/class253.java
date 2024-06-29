import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class253 {

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public int field3764 = 8;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public int field3758 = 16777215;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lki;")
    public static class498 field3769 = new class498(30, -1);

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field3771 = 1406;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
    public boolean field3768;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
    public static final int method1699(byte arg0, int arg1) {
        field3763++;
        return arg0 >= -82 ? 63 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLdh;I)V")
    private final void method1700(byte arg0, class209 arg1, int arg2) {
        int var4 = 22 % ((arg0 - 72) / 46);
        if (arg2 == 1) {
            this.field3764 = arg1.method1450((byte) 123);
        } else if (arg2 == 2) {
            this.field3768 = true;
        } else if (arg2 == 3) {
            this.field3770 = arg1.method1447(29480);
            this.field3767 = arg1.method1447(29480);
            this.field3765 = arg1.method1447(29480);
        } else if (arg2 == 4) {
            this.field3759 = arg1.method1428(32122);
        } else if (arg2 == 5) {
            this.field3760 = arg1.method1450((byte) 87);
        } else if (arg2 == 6) {
            this.field3758 = arg1.method1458((byte) -10);
        }
        field3762++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Z")
    public static final boolean method1701(int arg0, byte arg1) {
        field3766++;
        if (arg0 == 57 || arg0 == 16 || arg0 == 13 || arg0 == 8 || arg0 == 1012) {
            return true;
        } else if (arg0 == 18 || arg0 == 1006) {
            return true;
        } else {
            if (arg1 > -98) {
                method1699((byte) 52, 4);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method1702(byte arg0) {
        field3769 = null;
        int var1 = 74 % ((arg0 + 30) / 43);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLdh;)V")
    public final void method1703(byte arg0, class209 arg1) {
        if (arg0 <= 112) {
            this.field3765 = 85;
        }
        field3761++;
        while (true) {
            int var3 = arg1.method1428(32122);
            if (var3 == 0) {
                return;
            }
            this.method1700((byte) 127, arg1, var3);
        }
    }
}
