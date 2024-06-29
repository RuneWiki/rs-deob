import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class34 {

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Lrc;")
    public static class105 field794 = class43.method374(")1", 0);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lrc;")
    public static class105 field786 = class43.method374("Spieler kann nicht gefunden werden: ", 0);

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lrc;")
    private static class105 field788 = class43.method374("Loading title screen )2 ", 0);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[I")
    public static int[] field799 = new int[50];

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
    public static boolean field801 = false;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lrc;")
    public static class105 field796 = field788;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field806 = 128;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lte;")
    public static class119 field790;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lbd;")
    public static class11 field791;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lbd;")
    public static class11 field793;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lud;")
    public static class124 field787;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Leb;")
    public static class27 field800;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lmc;")
    public static class75 field792;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Ljava/awt/Image;")
    public Image field804;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
    public int[] field789;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 17)
    public static final void method322(int arg0) {
        class12.field235.method602((byte) -70);
        field803++;
        if (arg0 > -62) {
            field799 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 30)
    public final void method323(int arg0) {
        field785++;
        if (arg0 != 0) {
            method326((byte) -42);
        }
        class69.method582(this.field789, this.field805, this.field802);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 57)
    public static void method324(int arg0) {
        field800 = null;
        field793 = null;
        field796 = null;
        if (arg0 > -22) {
            return;
        }
        field790 = null;
        field788 = null;
        field786 = null;
        field787 = null;
        field799 = null;
        field791 = null;
        field792 = null;
        field794 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 80)
    public static final void method325(int arg0, int arg1) {
        class3.field57 += arg0;
        field797++;
        while (class76.field1698 <= class3.field57) {
            class17.field365 -= class17.field365 >> 2;
            class3.field57 -= class76.field1698;
        }
        class17.field365 -= arg0 * 1000;
        if (class17.field365 < arg1) {
            class17.field365 = 0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 105)
    public static final void method326(byte arg0) {
        field798++;
        if (arg0 < 90) {
            method326((byte) 97);
        }
        Object var1 = class3.field36;
        synchronized (class3.field36) {
            if (class31.field698 != 0) {
                class31.field698 = 1;
                try {
                    class3.field36.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 152)
    protected class34() {
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public abstract void method320(int arg0, Graphics arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method321(int arg0, int arg1, int arg2, Component arg3);
}
