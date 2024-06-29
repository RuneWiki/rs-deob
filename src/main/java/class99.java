import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class99 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
    public static int[] field1622 = new int[14];

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field1633 = 0;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
    public static int[] field1637 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[I")
    public static int[] field1635 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1639 = "Loaded wordpack";

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
    public static int[] field1620;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method726(int arg0, String arg1) {
        field1632++;
        if (arg0 != 0) {
            method727(113, 15);
        }
        for (class55 var2 = (class55) class9.field117.method843(arg0 ^ 0x61); var2 != null; var2 = (class55) class9.field117.method852((byte) 123)) {
            if (var2.field930.equals(arg1)) {
                class142.field2296 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Ljl;")
    public static final class247 method727(int arg0, int arg1) {
        if (arg1 != 32767) {
            field1620 = null;
        }
        field1626++;
        class247 var2 = (class247) class198.field3155.method1832((long) arg0, (byte) -35);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class91.field1502.method1357(arg0, 0, -1);
        } else {
            var3 = class193.field3101.method1357(arg0 & 0x7FFF, 0, -1);
        }
        class247 var4 = new class247();
        if (var3 != null) {
            var4.method1698(new class221(var3), -4159);
        }
        if (arg0 >= 32768) {
            var4.method1693(119);
        }
        class198.field3155.method1831((long) arg0, var4, arg1 - 32639);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method728(boolean arg0, String arg1) {
        int var2 = arg1.length();
        int var3 = 0;
        if (!arg0) {
            method727(1, -58);
        }
        field1624++;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class122.method882(arg1.charAt(var4), -44) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILog;II)V")
    private final void method729(int arg0, class221 arg1, int arg2, int arg3) {
        field1634++;
        if (arg2 == arg3) {
            this.field1638 = arg1.method1521((byte) 113);
        } else if (arg2 == 2) {
            this.field1631 = arg1.method1517((byte) -96);
            this.field1630 = arg1.method1517((byte) -96);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lea;")
    public final class37 method730(int arg0) {
        class37 var2 = (class37) class75.field1208.method480((long) this.field1638, 102);
        if (arg0 >= -69) {
            return null;
        }
        field1629++;
        if (var2 != null) {
            return var2;
        }
        class37 var3 = class280.method1888(0, 14, this.field1638, class27.field429);
        if (var3 != null) {
            class75.field1208.method474((long) this.field1638, (byte) 119, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Log;II)V")
    public final void method731(class221 arg0, int arg1, int arg2) {
        if (arg1 <= 88) {
            this.method729(54, (class221) null, 80, 114);
        }
        field1636++;
        while (true) {
            int var4 = arg0.method1517((byte) -96);
            if (var4 == 0) {
                return;
            }
            this.method729(arg2, arg0, var4, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method732(int arg0) {
        field1622 = null;
        field1639 = null;
        if (arg0 > 27) {
            field1637 = null;
            field1620 = null;
            field1635 = null;
        }
    }
}
