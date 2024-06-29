import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field1657 = 0;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field1665 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1644 = -1;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lsc;")
    public static class128 field1646 = class129.method1017(false, "Schlie-8en");

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lsc;")
    private static class128 field1652 = class129.method1017(false, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lsc;")
    public static class128 field1645 = field1652;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lsc;")
    public static class128 field1655 = class129.method1017(false, "sl_flags");

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Z")
    public static boolean field1663 = false;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Lsc;")
    public static class128 field1667 = class129.method1017(false, "nav");

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Lsc;")
    public static class128 field1668 = class129.method1017(false, ")1");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lwc;")
    public class156 field1659;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lwc;")
    public class156 field1664;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method555(byte arg0) {
        if (arg0 > -67) {
            method556(33);
        }
        int var1 = class155.field3562 * 128 + 64;
        int var2 = class27.field527 * 128 + 64;
        field1660++;
        int var3 = class97.method755(var1, class29.field553, var2, 256) - class69.field1554;
        if (var2 > class147.field3410) {
            class147.field3410 += class14.field266 + (var2 - class147.field3410) * class140.field3264 / 1000;
            if (var2 < class147.field3410) {
                class147.field3410 = var2;
            }
        }
        if (class1.field2 < var1) {
            class1.field2 += (var1 - class1.field2) * class140.field3264 / 1000 + class14.field266;
            if (var1 < class1.field2) {
                class1.field2 = var1;
            }
        }
        if (var2 < class147.field3410) {
            class147.field3410 -= class14.field266 + (class147.field3410 - var2) * class140.field3264 / 1000;
            if (class147.field3410 < var2) {
                class147.field3410 = var2;
            }
        }
        if (var3 > class65.field1430) {
            class65.field1430 += (var3 - class65.field1430) * class140.field3264 / 1000 + class14.field266;
            if (class65.field1430 > var3) {
                class65.field1430 = var3;
            }
        }
        int var4 = class64.field1367 * 128 + 64;
        if (class65.field1430 > var3) {
            class65.field1430 -= (class65.field1430 - var3) * class140.field3264 / 1000 + class14.field266;
            if (var3 > class65.field1430) {
                class65.field1430 = var3;
            }
        }
        if (var1 < class1.field2) {
            class1.field2 -= (class1.field2 - var1) * class140.field3264 / 1000 + class14.field266;
            if (class1.field2 < var1) {
                class1.field2 = var1;
            }
        }
        int var5 = class131.field3032 * 128 + 64;
        int var6 = class97.method755(var5, class29.field553, var4, 256) - class141.field3297;
        int var7 = var4 - class147.field3410;
        int var8 = var6 - class65.field1430;
        int var9 = var5 - class1.field2;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > class156.field3589) {
            class156.field3589 += (var11 - class156.field3589) * class126.field2860 / 1000 + class156.field3591;
            if (class156.field3589 > var11) {
                class156.field3589 = var11;
            }
        }
        int var13 = var12 - class1.field10;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class156.field3589 > var11) {
            class156.field3589 -= (class156.field3589 - var11) * class126.field2860 / 1000 + class156.field3591;
            if (var11 > class156.field3589) {
                class156.field3589 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class1.field10 += class156.field3591 + class126.field2860 * var13 / 1000;
            class1.field10 &= 0x7FF;
        }
        if (var13 < 0) {
            class1.field10 -= -var13 * class126.field2860 / 1000 + class156.field3591;
            class1.field10 &= 0x7FF;
        }
        int var14 = var12 - class1.field10;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class1.field10 = var12;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method556(int arg0) {
        if (arg0 > -89) {
            field1667 = null;
        }
        field1646 = null;
        field1652 = null;
        field1667 = null;
        field1655 = null;
        field1668 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lm;I)V")
    public static final void method557(class83 arg0, int arg1) {
        field1647++;
        if (arg0.field1849 != null) {
            arg0.field1849.field1810 = 0;
        }
        arg0.field1848 = false;
        for (class83 var2 = arg0.method353(); var2 != null; var2 = arg0.method377()) {
            method557(var2, 2047);
        }
        if (arg1 != 2047) {
            method555((byte) 109);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
    public static final void method558(int arg0, boolean arg1) {
        class7.method31((byte) 0);
        field1651++;
        class159.field3652++;
        if (arg0 < 88) {
            method560(-101, 51);
        }
        if (class159.field3652 < 50 && !arg1) {
            return;
        }
        class159.field3652 = 0;
        if (class19.field347 || class63.field1358 == null) {
            return;
        }
        class72.field1616++;
        class152.field3502.method507(-127, 152);
        try {
            class63.field1358.method496(true, class152.field3502.field1920, class152.field3502.field1924, 0);
            class152.field3502.field1924 = 0;
        } catch (IOException var2) {
            class19.field347 = true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILsc;)Z")
    public static final boolean method559(int arg0, class128 arg1) {
        field1662++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 < 31) {
            method556(-72);
        }
        for (int var2 = 0; var2 < class35.field675; var2++) {
            if (arg1.method1010(1, class111.field2502[var2])) {
                return true;
            }
        }
        return arg1.method1010(1, class151.field3473.field1050);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z")
    public static final boolean method560(int arg0, int arg1) {
        field1658++;
        if (arg1 != -49) {
            method560(-117, -89);
        }
        return arg0 >= 48 && arg0 <= 57;
    }
}
