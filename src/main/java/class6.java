import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 {

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field77 = 0;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static volatile int field78 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljj;")
    public static class134 field72;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lli;")
    public class197 field71;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "Lcg;")
    public static class36 field82;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field75;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "[Lvl;")
    public static class68[] field81;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method37(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        field76++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg0 != -3) {
                method40(-70, 9);
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method38(int arg0) {
        field82 = null;
        field72 = null;
        field75 = null;
        field81 = null;
        if (arg0 > -39) {
            method41(122, 74, -119);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Leb;I)V")
    public static final void method39(class103 arg0, int arg1) {
        field73++;
        int var2 = arg0.field1716;
        if (var2 == 324) {
            if (class34.field424 == -1) {
                class184.field2944 = arg0.field1664;
                class34.field424 = arg0.field1698;
            }
            if (class203.field3255.field1432) {
                arg0.field1698 = class34.field424;
            } else {
                arg0.field1698 = class184.field2944;
            }
        } else if (var2 == 325) {
            if (class34.field424 == -1) {
                class34.field424 = arg0.field1698;
                class184.field2944 = arg0.field1664;
            }
            if (class203.field3255.field1432) {
                arg0.field1698 = class184.field2944;
            } else {
                arg0.field1698 = class34.field424;
            }
        } else if (var2 == 327) {
            arg0.field1683 = 150;
            arg0.field1605 = (int) (Math.sin((double) class9.field141 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1631 = 5;
            arg0.field1724 = -1;
        } else if (arg1 == 5 && var2 == 328) {
            if (class197.field3179.field3735 == null) {
                arg0.field1724 = 0;
            } else {
                arg0.field1683 = 150;
                arg0.field1605 = (int) (Math.sin((double) class9.field141 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1631 = 5;
                arg0.field1724 = ((int) class238.method1570(class197.field3179.field3735, (byte) 127) << 11) + 2047;
                arg0.field1594 = class197.field3179.field609;
                arg0.field1712 = class197.field3179.field668;
                arg0.field1632 = class197.field3179.field659;
                arg0.field1633 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method40(int arg0, int arg1) {
        if (arg1 != -325) {
            field70 = 53;
        }
        field74++;
        if (class44.field514 == null || class44.field514.length < arg0) {
            class44.field514 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)I")
    public static final int method41(int arg0, int arg1, int arg2) {
        field79++;
        if (arg0 == -2) {
            return 12345678;
        }
        if (arg1 >= -81) {
            field75 = null;
        }
        if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
