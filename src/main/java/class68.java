import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class68 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
    public boolean field1726 = true;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1727 = new Object();

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
    public int[] field1749 = new int[500];

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public int field1752 = 0;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "[I")
    public int[] field1750 = new int[500];

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Lmc;")
    private static class75 field1725 = class30.method234(true, " seconds)3");

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    public static int[] field1733 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "[Lmc;")
    public static class75[] field1738 = new class75[5];

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
    public static int[] field1741 = new int[] { 6, 0, 6, 6, 0, 0, 0, 0, 0, -2, 0, 0, 1, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2, 0, 2, 0, -2, 0, 0, 0, -1, 3, 0, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 5, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0, 5, 0, 0, 0, -2, 2, 0, 3, 0, 6, 1, 0, 0, 0, 0, 3, 0, -2, 0, 0, 1, 0, 0, 0, -2, 15, 0, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 4, 1, 6, 1, 0, 0, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 2, 0, 4, 0, 0, 0, 6, 7, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, -2, 0, 0, 2, 6, 4, 0, 0, 0, 8, 0, 3, 0, 0, 6, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, -2, 6, 14, 0, 0, 0, 0, 0, 0, 0, 4, 5, 0, 0, 0, 8, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, 2, 0, 0, 6, 10, 4, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lmc;")
    public static class75 field1742 = field1725;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lmc;")
    private static class75 field1744 = class30.method234(true, "Loading ignore list");

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lmc;")
    private static class75 field1732 = class30.method234(true, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lmc;")
    private static class75 field1737 = class30.method234(true, "This computers address has been blocked");

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1730 = 7759444;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lmc;")
    public static class75 field1724 = field1732;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1728 = 0;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Lmc;")
    public static class75 field1745 = field1744;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lmc;")
    public static class75 field1735 = field1737;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Lmc;")
    public static class75 field1739 = class30.method234(true, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lja;")
    public static class55 field1747;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lna;")
    public static class79 field1740;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 3)
    public static void method582(int arg0) {
        field1737 = null;
        field1741 = null;
        field1732 = null;
        field1735 = null;
        field1733 = null;
        field1739 = null;
        field1742 = null;
        field1724 = null;
        field1745 = null;
        field1738 = null;
        field1725 = null;
        field1747 = null;
        int var1 = -92 % ((12 - arg0) / 33);
        field1744 = null;
        field1740 = null;
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V", line = 39)
    public final void run() {
        while (this.field1726) {
            Object var1 = this.field1727;
            synchronized (this.field1727) {
                if (this.field1752 < 500) {
                    this.field1749[this.field1752] = class90.field2200;
                    this.field1750[this.field1752] = class45.field1104;
                    this.field1752++;
                }
            }
            class13.method86(50L, 1);
        }
        field1734++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 65)
    public static final void method583(int arg0) {
        field1751++;
        if (arg0 != 24097) {
            return;
        }
        class84 var1 = class129.field3136;
        synchronized (class129.field3136) {
            class130.field3162 = class61.field1607;
            if (class75.field1872 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class71.field1810[var2] = false;
                }
                class75.field1872 = class84.field2080;
            } else {
                while (class84.field2080 != class75.field1872) {
                    int var3 = class126.field3088[class84.field2080];
                    class84.field2080 = class84.field2080 + 1 & 0x7F;
                    if (var3 < 0) {
                        class71.field1810[~var3] = false;
                    } else {
                        class71.field1810[var3] = true;
                    }
                }
            }
            class61.field1607 = class25.field509;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 106)
    public static final void method584(Component arg0, boolean arg1) {
        field1748++;
        try {
            Method var2 = class124.field3044;
            if (var2 != null) {
                var2.invoke(arg0, Boolean.FALSE);
            }
            if (!arg1) {
                field1744 = null;
            }
        } catch (Throwable var3) {
        }
        arg0.addKeyListener(class129.field3136);
        arg0.addFocusListener(class129.field3136);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILja;I)Lnc;", line = 158)
    public static final class81 method585(int arg0, int arg1, class55 arg2, int arg3) {
        field1743++;
        if (class82.method693(2151, arg0, arg2, arg1)) {
            if (arg3 < 66) {
                field1730 = -82;
            }
            return class86.method723(false);
        } else {
            return null;
        }
    }
}
