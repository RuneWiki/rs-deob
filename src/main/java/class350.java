import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class350 extends class42 {

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Lff;")
    public static class9 field4717 = new class9(106, -1);

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "[S")
    public static short[] field4722 = new short[256];

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lup;I)V", line = 3)
    public static final void method2042(class179 arg0, int arg1) {
        class226.field3055 = arg0;
        field4713++;
        int var2 = 108 / ((arg1 - 67) / 51);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method2043(int arg0) {
        int var2 = -90 / ((38 - arg0) / 62);
        field4719++;
        return (this.field4714 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z", line = 25)
    public final boolean method2044(int arg0, int arg1) {
        field4720++;
        if (arg1 < 93) {
            this.method2046((byte) 0);
        }
        return (this.field4714 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 38)
    public static void method2045(int arg0) {
        field4717 = null;
        field4722 = null;
        int var1 = 77 / ((-arg0 - 85) / 40);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I", line = 48)
    public final int method2046(byte arg0) {
        field4716++;
        if (arg0 >= -62) {
            field4721 = 17;
        }
        return class414.method2402(this.field4714, false);
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Z", line = 60)
    public final boolean method2047(int arg0) {
        if (arg0 == -25257) {
            field4712++;
            return (this.field4714 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)I", line = 73)
    public final int method2048(int arg0) {
        if (arg0 == 386216370) {
            field4723++;
            return this.field4714 >> 18 & 0x7;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(II)V", line = 86)
    public class350(int arg0, int arg1) {
        this.field4714 = arg0;
        this.field4718 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Z", line = 104)
    public final boolean method2049(byte arg0) {
        if (arg0 == 98) {
            field4715++;
            return ((this.field4714 & 0x50BD61) >> 22) != 0;
        } else {
            return true;
        }
    }
}
