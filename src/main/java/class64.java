import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class64 {

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field1508 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public int field1514 = 0;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
    public static int[] field1510 = new int[32];

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lkc;")
    public static class67 field1519 = class19.method144("@yel@", 99);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Ldb;")
    public class24 field1506;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Ldb;")
    public class24 field1520;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lab;")
    public static class3 field1513;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lac;")
    public static class4 field1521;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1510[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 7)
    public static final void method492(byte arg0) {
        field1504++;
        if (arg0 > -76) {
            field1513 = null;
        }
        if (class54.field1289 == 2) {
            class31.method270((byte) 58, class49.field1179 * 2, (class81.field1912 - class32.field685 << 7) + class31.field674, (-class30.field640 + class14.field296 << 7) + class2.field28);
            if (class45.field1096 > -1 && class135.field3243 % 20 < 10) {
                class22.field491[0].method661(class45.field1096 - 12, class66.field1554 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 25)
    public static void method493(int arg0) {
        field1513 = null;
        field1510 = null;
        field1519 = null;
        if (arg0 != -12029) {
            method497(-111, 32, -117);
        }
        field1521 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V", line = 51)
    public static final void method494(byte arg0, int arg1) {
        class70.field1661 = arg1;
        if (arg0 != -7) {
            field1513 = null;
        }
        field1512++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Lkc;", line = 64)
    public static final class67 method495(int arg0, int arg1) {
        field1507++;
        class67 var2 = class71.method586(103, arg0);
        int var3 = 107 % ((79 - arg1) / 40);
        for (int var4 = var2.method539(2618) - 3; var4 > 0; var4 -= 3) {
            var2 = class63.method479(new class67[] { var2.method529(0, var4, 17804), class70.field1669, var2.method531(13401, var4) }, 0);
        }
        if (var2.method539(2618) > 8) {
            var2 = class63.method479(new class67[] { class25.field536, var2.method529(0, var2.method539(2618) - 8, 17804), class4.field41, class25.field545, var2, class18.field354 }, 0);
        } else if (var2.method539(2618) > 4) {
            var2 = class63.method479(new class67[] { class12.field254, var2.method529(0, var2.method539(2618) - 4, 17804), class38.field880, class25.field545, var2, class18.field354 }, 0);
        }
        return class63.method479(new class67[] { class44.field1079, var2 }, 0);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 94)
    public static final int method496(int arg0, KeyEvent arg1) {
        if (arg0 > -16) {
            return -12;
        }
        field1517++;
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V", line = 148)
    public static final void method497(int arg0, int arg1, int arg2) {
        int var3 = 124 / ((48 - arg0) / 34);
        if (class96.field2169 != 0 && arg2 != -1) {
            class135.method1049(-126, 0, class121.field2826, arg2, 1, false, class96.field2169);
            class141.field3393 = arg1;
        }
        field1511++;
    }
}
