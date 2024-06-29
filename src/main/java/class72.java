import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class72 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lwd;")
    public static class150 field1792 = class2.method9(true, "lila:");

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lwd;")
    private static class150 field1796 = class2.method9(true, "Please remove ");

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    public static int[] field1797 = new int[1000];

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lwd;")
    public static class150 field1801 = class2.method9(true, "M");

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Lwd;")
    public static class150 field1805 = field1796;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lwd;")
    public static class150 field1791 = class2.method9(true, "b12_full");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static volatile int field1802 = 0;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lwd;")
    private static class150 field1804 = class2.method9(true, "Connection timed out)3");

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lwd;")
    public static class150 field1799 = field1796;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Lwd;")
    public static class150 field1806 = class2.method9(true, "(Z");

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lwd;")
    private static class150 field1808 = class2.method9(true, "Loading sprites )2 ");

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lwd;")
    public static class150 field1803 = field1808;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lwd;")
    public static class150 field1807 = field1804;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lff;")
    public static class42 field1809;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Ljava/awt/Image;")
    public Image field1810;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
    public int[] field1794;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public abstract void method287(Graphics arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method545(byte arg0) {
        field1797 = null;
        field1792 = null;
        field1808 = null;
        field1796 = null;
        field1799 = null;
        field1803 = null;
        field1804 = null;
        field1807 = null;
        field1805 = null;
        if (arg0 != -57) {
            field1809 = null;
        }
        field1791 = null;
        field1806 = null;
        field1801 = null;
        field1809 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method286(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method546(int arg0) {
        int var2 = 96 / ((arg0 + 40) / 50);
        field1793++;
        class120.method879(this.field1794, this.field1800, this.field1795);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public static final void method547(boolean arg0) {
        field1811++;
        if (!arg0) {
            method547(false);
        }
        for (int var1 = -1; var1 < class109.field2533; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class61.field1574[var1];
            }
            class111 var3 = class137.field3217[var2];
            if (var3 != null) {
                class14.method108(var3, 1, true);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IJ)V")
    public static final void method548(int arg0, long arg1) {
        if (arg0 > -30) {
            field1806 = null;
        }
        field1812++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class6.method37(arg1 - 1L, (byte) -105);
            class6.method37(1L, (byte) -105);
        } else {
            class6.method37(arg1, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    protected class72() {
    }
}
