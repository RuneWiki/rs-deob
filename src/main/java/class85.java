import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("j")
public abstract class class85 extends class71 {

    @OriginalMember(owner = "j", name = "G", descriptor = "[Lj;")
    public class85[] field1735;

    @OriginalMember(owner = "j", name = "x", descriptor = "Z")
    public boolean field1726;

    @OriginalMember(owner = "j", name = "v", descriptor = "Llf;")
    public static class109 field1724 = class35.method275("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 2);

    @OriginalMember(owner = "j", name = "z", descriptor = "Lpd;")
    public static class143 field1728 = new class143();

    @OriginalMember(owner = "j", name = "J", descriptor = "Llf;")
    private static class109 field1738 = class35.method275("flash1:", 2);

    @OriginalMember(owner = "j", name = "L", descriptor = "Llf;")
    public static class109 field1740 = field1738;

    @OriginalMember(owner = "j", name = "K", descriptor = "Llf;")
    public static class109 field1739 = field1738;

    @OriginalMember(owner = "j", name = "O", descriptor = "Llf;")
    public static class109 field1743 = class35.method275(" )2> <col=ff9040>", 2);

    @OriginalMember(owner = "j", name = "P", descriptor = "I")
    public static int field1744 = 1;

    @OriginalMember(owner = "j", name = "n", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "j", name = "o", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "j", name = "p", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "j", name = "r", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "j", name = "s", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "j", name = "t", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "j", name = "u", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "j", name = "w", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "j", name = "y", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "j", name = "A", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "j", name = "B", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "j", name = "C", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "j", name = "D", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "j", name = "F", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "j", name = "I", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "j", name = "M", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "j", name = "N", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "j", name = "H", descriptor = "Lma;")
    public class113 field1736;

    @OriginalMember(owner = "j", name = "E", descriptor = "Lcb;")
    public static class23 field1733;

    @OriginalMember(owner = "j", name = "q", descriptor = "Ljh;")
    public class93 field1719;

    @OriginalMember(owner = "j", name = "a", descriptor = "(IJ)V")
    public static final void method539(int arg0, long arg1) {
        field1737++;
        if (arg1 == 0L) {
            return;
        }
        if (class199.field3786 >= 100 && class84.field1712 != 1 || class199.field3786 >= 200) {
            class98.method690(class174.field3306, false, class13.field207, 0);
            return;
        }
        class109 var3 = class136.method981((byte) 84, arg1).method810(true);
        for (int var4 = 0; var4 < class199.field3786; var4++) {
            if (class109.field2160[var4] == arg1) {
                class98.method690(class174.field3306, false, class36.method279(new class109[] { var3, class20.field451 }, 124), 0);
                return;
            }
        }
        if (arg0 <= 48) {
            return;
        }
        for (int var5 = 0; var5 < class19.field426; var5++) {
            if (class82.field1607[var5] == arg1) {
                class98.method690(class174.field3306, false, class36.method279(new class109[] { class210.field4088, var3, class88.field1834 }, -117), 0);
                return;
            }
        }
        if (var3.method809(class157.field2955.field3455, -1)) {
            class98.method690(class174.field3306, false, class177.field3336, 0);
            return;
        }
        class114.field2265[class199.field3786] = var3;
        class109.field2160[class199.field3786] = arg1;
        field1720++;
        class93.field1923[class199.field3786] = 0;
        class142.field2744[class199.field3786] = 0;
        class199.field3786++;
        class107.field2127 = class75.field1442;
        class200.field3850.method1339((byte) 95, 46);
        class200.field3850.method592(arg1, -562765672);
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(III)[I")
    public final int[] method540(int arg0, int arg1, int arg2) {
        field1716++;
        int var4 = -26 / ((-arg1 - 75) / 49);
        return this.field1735[arg2].field1726 ? this.field1735[arg2].method87(-72, arg0) : this.field1735[arg2].method29(arg0, 2177)[0];
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(I)V")
    public static void method541(int arg0) {
        field1724 = null;
        field1733 = null;
        field1743 = null;
        field1740 = null;
        field1728 = null;
        field1738 = null;
        field1739 = null;
        if (arg0 != 13218) {
            field1744 = -79;
        }
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(BILja;)V")
    public void method31(byte arg0, int arg1, class86 arg2) {
        field1727++;
        if (arg0 >= -120) {
            field1739 = null;
        }
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(IBLoh;ZIII)V")
    public static final void method542(int arg0, byte arg1, class138 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) ((arg4 << 16) + arg6);
        field1717++;
        class180 var9 = (class180) class149.field2880.method337(var7, (byte) -93);
        if (arg5 < 86) {
            field1743 = null;
        }
        if (var9 != null) {
            return;
        }
        class180 var10 = (class180) class134.field2571.method337(var7, (byte) -106);
        if (var10 != null) {
            return;
        }
        class180 var11 = (class180) class22.field495.method337(var7, (byte) -78);
        if (var11 == null) {
            if (!arg3) {
                class180 var12 = (class180) class13.field211.method337(var7, (byte) -126);
                if (var12 != null) {
                    return;
                }
            }
            class180 var13 = new class180();
            var13.field3394 = arg1;
            var13.field3393 = arg2;
            var13.field3403 = arg0;
            if (arg3) {
                class149.field2880.method339(var7, false, var13);
                class150.field2889++;
            } else {
                class5.field66.method738(18619, var13);
                class22.field495.method339(var7, false, var13);
                class26.field550++;
            }
        } else if (arg3) {
            var11.method1031((byte) 3);
            class149.field2880.method339(var7, false, var11);
            class26.field550--;
            class150.field2889++;
        }
    }

    @OriginalMember(owner = "j", name = "b", descriptor = "(III)V")
    public static final void method543(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field27 = null;
        }
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(II)[I")
    public int[] method87(int arg0, int arg1) {
        field1731++;
        if (arg0 > -49) {
            this.field1735 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(ZII)[[I")
    public final int[][] method544(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field1741 = -92;
        }
        field1722++;
        if (this.field1735[arg2].field1726) {
            int[] var4 = this.field1735[arg2].method87(-55, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1735[arg2].method29(arg1, 2177);
        }
    }

    @OriginalMember(owner = "j", name = "b", descriptor = "(I)I")
    public int method545(int arg0) {
        field1718++;
        return arg0 == 24649 ? -1 : -5;
    }

    @OriginalMember(owner = "j", name = "c", descriptor = "(I)V")
    public void method199(int arg0) {
        field1721++;
        if (arg0 != 25614) {
            field1724 = null;
        }
    }

    @OriginalMember(owner = "j", name = "a", descriptor = "(BII)V")
    public final void method546(byte arg0, int arg1, int arg2) {
        if (arg0 < 13) {
            return;
        }
        int var4 = this.field1729 == 255 ? arg2 : this.field1729;
        if (this.field1726) {
            this.field1736 = new class113(var4, arg2, arg1);
        } else {
            this.field1719 = new class93(var4, arg2, arg1);
        }
        field1732++;
    }

    @OriginalMember(owner = "j", name = "d", descriptor = "(I)I")
    public int method547(int arg0) {
        if (arg0 == -1) {
            field1723++;
            return -1;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "j", name = "<init>", descriptor = "(IZ)V")
    public class85(int arg0, boolean arg1) {
        this.field1735 = new class85[arg0];
        this.field1726 = arg1;
    }

    @OriginalMember(owner = "j", name = "c", descriptor = "(B)V")
    public final void method548(byte arg0) {
        if (arg0 != -113) {
            field1743 = null;
        }
        if (this.field1726) {
            this.field1736.method837(27);
            this.field1736 = null;
        } else {
            this.field1719.method678(false);
            this.field1719 = null;
        }
        field1734++;
    }

    @OriginalMember(owner = "j", name = "b", descriptor = "(II)[[I")
    public int[][] method29(int arg0, int arg1) {
        field1742++;
        if (arg1 != 2177) {
            this.method199(56);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }
}
