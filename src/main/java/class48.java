import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("eg")
public abstract class class48 {

    @OriginalMember(owner = "eg", name = "a", descriptor = "Lvg;")
    public static class200 field984 = null;

    @OriginalMember(owner = "eg", name = "g", descriptor = "I")
    public static int field990 = 0;

    @OriginalMember(owner = "eg", name = "e", descriptor = "Llf;")
    public static class109 field988 = class35.method275("gr-Un:", 2);

    @OriginalMember(owner = "eg", name = "j", descriptor = "Llf;")
    public static class109 field993 = class35.method275("Lade Titelbild )2 ", 2);

    @OriginalMember(owner = "eg", name = "k", descriptor = "Z")
    public static boolean field994 = true;

    @OriginalMember(owner = "eg", name = "b", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "eg", name = "d", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "eg", name = "f", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "eg", name = "i", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "eg", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field991;

    @OriginalMember(owner = "eg", name = "c", descriptor = "[I")
    public int[] field986;

    @OriginalMember(owner = "eg", name = "a", descriptor = "(B)V")
    public final void method325(byte arg0) {
        class11.method62(this.field986, this.field992, this.field987);
        field985++;
        if (arg0 != 10) {
            this.field986 = null;
        }
    }

    @OriginalMember(owner = "eg", name = "a", descriptor = "(I)V")
    public static void method326(int arg0) {
        int var1 = 104 % ((15 - arg0) / 48);
        field988 = null;
        field993 = null;
        field984 = null;
    }

    @OriginalMember(owner = "eg", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method327(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "eg", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method328(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "eg", name = "<init>", descriptor = "()V")
    protected class48() {
    }

    @OriginalMember(owner = "eg", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method329(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);
}
