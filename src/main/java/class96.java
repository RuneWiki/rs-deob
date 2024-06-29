import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class96 extends class28 {

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public int field1806 = -1;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public int field1815 = -1;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public int field1810 = 0;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "Z")
    public boolean field1816 = true;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Lqe;")
    public static class179 field1809 = class206.method1380("Nehmen", (byte) -41);

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lqe;")
    public static class179 field1808 = class206.method1380("Update)2Liste geladen)3", (byte) -128);

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "Lqe;")
    public static class179 field1807 = class206.method1380("Freie Welt", (byte) 57);

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "[I")
    public static int[] field1813 = new int[100];

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Lqe;")
    public static class179 field1819 = class206.method1380("::errortest", (byte) -126);

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "[I")
    public static int[] field1818 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field1820 = 0;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lra;BI)V")
    public final void method620(class185 arg0, byte arg1, int arg2) {
        field1814++;
        while (true) {
            int var4 = arg0.method1243(3);
            if (var4 == 0) {
                int var5 = -114 % ((26 - arg1) / 53);
                return;
            }
            this.method622(var4, 2, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V")
    public static void method621(boolean arg0) {
        field1808 = null;
        field1809 = null;
        field1818 = null;
        field1807 = null;
        field1819 = null;
        field1813 = null;
        if (arg0) {
            method621(false);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILra;)V")
    private final void method622(int arg0, int arg1, int arg2, class185 arg3) {
        field1812++;
        if (arg1 != 2) {
            this.method622(31, -46, 49, null);
        }
        if (arg0 == 1) {
            this.field1810 = class107.method701(arg3.method1244(-27523), (byte) -107);
        } else if (arg0 == 2) {
            this.field1806 = arg3.method1243(3);
        } else if (arg0 == 3) {
            this.field1806 = arg3.method1252(2);
            if (this.field1806 == 65535) {
                this.field1806 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field1816 = false;
        } else {
            if (arg0 == 7) {
                this.field1815 = class107.method701(arg3.method1244(-27523), (byte) 122);
            } else if (arg0 == 8) {
                class174.field3113 = arg2;
                return;
            } else if (arg0 == 9) {
                arg3.method1252(2);
                return;
            }
            return;
        }
    }
}
