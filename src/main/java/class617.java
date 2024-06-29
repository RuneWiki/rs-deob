import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class617 extends class333 {

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public static int field8695 = 0;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field8702 = 0;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field8696 = 0;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "[I")
    public static int[] field8704 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field8700 = class258.method1532(1600, false);

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "J")
    public long field8693;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Lvs;")
    public class617 field8692;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "Lvs;")
    public class617 field8698;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "Ltf;")
    public static class701 field8703;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lpj;Z)V", line = 9)
    public static final void method3441(class237 arg0, boolean arg1) {
        arg0.field2943 = null;
        field8701++;
        if (!arg1) {
            method3442(123);
        }
        if (class403.field5402 < 20) {
            class170.field1898.method1670((byte) -53, arg0);
            class403.field5402++;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 37)
    public static void method3442(int arg0) {
        if (arg0 != -2) {
            field8700 = -125;
        }
        field8704 = null;
        field8703 = null;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V", line = 50)
    public final void method3443(int arg0) {
        field8694++;
        if (arg0 > 94 && this.field8698 != null) {
            this.field8698.field8692 = this.field8692;
            this.field8692.field8698 = this.field8698;
            this.field8698 = null;
            this.field8692 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)I", line = 69)
    public static final int method3444(int arg0, int arg1) {
        field8699++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xEC) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 == -19151 ? 0 : 9;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z", line = 124)
    public final boolean method3445(byte arg0) {
        int var2 = 69 / ((55 - arg0) / 32);
        field8697++;
        return this.field8698 != null;
    }
}
