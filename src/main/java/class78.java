import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class78 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field1645 = 0;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public int field1658 = 0;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lo;")
    public static class84 field1646 = class15.method124("::noclip", 255);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field1657 = -1;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field1664 = 20;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lo;")
    public static class84 field1659 = class15.method124("Chat panel redrawn", 255);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static volatile int field1669 = -1;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lud;")
    public static class118 field1653;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Ld;")
    public static class19 field1666;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Ljd;")
    public class58 field1673;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public static int[] field1668;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 23)
    public static void method574(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1653 = null;
        field1659 = null;
        field1646 = null;
        field1666 = null;
        field1668 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z", line = 66)
    public static final boolean method575(int arg0, byte arg1) {
        if (arg1 != -122) {
            field1664 = 38;
        }
        field1663++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLo;Lo;I)V", line = 100)
    public static final void method576(boolean arg0, class84 arg1, class84 arg2, int arg3) {
        field1665++;
        short var4 = 151;
        int var6 = var4 - 3;
        if (class1.field5) {
            class1.field5 = false;
            class49.method417(0, class30.field593);
            class5.method19(-111, class30.field593);
            class85.method678(-114, class30.field593);
            class38.method339(4, class30.field593);
            class128.method997(class125.field2771, class30.field593, class123.field2762, class123.field2756, -14024, class28.field550);
            class112.method866(class74.field1546, class3.field32, -1, field1657 == -1, arg3 ^ 0xFFFF81F6, class30.field593);
            class8.field160 = true;
            class111.field2411 = true;
            class6.field118 = true;
        }
        class88.method701(25085);
        class123.field2762.method311(arg2, 257, var6, 0);
        if (arg3 != -32266) {
            return;
        }
        class123.field2762.method311(arg2, 256, var6 - 1, 16777215);
        if (arg1 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class123.field2762.method313(arg1) + 4;
                class32.method290(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class123.field2762.method311(arg1, 257, var6, 0);
            class123.field2762.method311(arg1, 256, var6 - 1, 16777215);
        }
        class97.method745((byte) -102, class30.field593);
    }
}
