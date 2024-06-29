import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class78 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lsg;")
    public static class30 field1690 = class167.method1221((byte) 33, "rect_debug=");

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1698 = -1;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lbl;")
    public static class262 field1696;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Ldl;")
    public static class31 field1695;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method687(int arg0, int arg1) {
        if (arg0 == 37) {
            class29.field562 = 3.0F;
        } else if (arg0 == 50) {
            class29.field562 = 4.0F;
        } else if (arg0 == 75) {
            class29.field562 = 6.0F;
        } else {
            class29.field562 = 8.0F;
        }
        field1692++;
        if (arg1 <= -39) {
            class32.field811 = -1;
            class32.field811 = -1;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lmc;B)V")
    public static final void method688(class151 arg0, byte arg1) {
        class91.field1837 = arg0;
        class154.field2916 = class91.field1837.method1124(16, 117);
        field1693++;
        if (arg1 <= 91) {
            method687(-111, -18);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIBII)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != -77) {
            field1695 = null;
        }
        class143[] var7 = class262.field4620;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class143 var9 = var7[var8];
            if (var9 != null && var9.field2754 == 2) {
                class122.method934(arg0 >> 1, (var9.field2760 - class22.field421 << 7) + var9.field2764, arg3, arg5, -1, arg1 >> 1, var9.field2761 * 2, (var9.field2763 - class196.field3547 << 7) + var9.field2766);
                if (class238.field4245 > -1 && (class133.field2617 % 20) < 10) {
                    class9.field172[var9.field2758].method446(class238.field4245 + arg2 - 12, class256.field4511 + -28 + arg6);
                }
            }
        }
        field1701++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        if (arg0 == -122) {
            field1697++;
            class35.field858.method1650(121);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method691(int arg0) {
        if (arg0 != 7150) {
            method688((class151) null, (byte) 22);
        }
        field1695 = null;
        field1690 = null;
        field1696 = null;
    }
}
