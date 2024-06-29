import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class230 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lvd;")
    public static class222 field4321 = class212.method1357("Anmelde)2Zeitlimit -Uberschritten)3", 10731);

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lvd;")
    public static class222 field4324 = class212.method1357("hitmarks", 10731);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4322 = 100;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lvd;")
    public static class222 field4327 = class212.method1357("compass", 10731);

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4329 = -1;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field4323;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
    public static int[] field4319;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
    public int[] field4328;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public abstract void method250(boolean arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method251(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public final void method1511(boolean arg0) {
        if (arg0) {
            method1512((byte) -7);
        }
        class53.method390(this.field4328, this.field4325, this.field4320);
        field4330++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1512(byte arg0) {
        field4324 = null;
        if (arg0 <= 2) {
            field4329 = 30;
        }
        field4321 = null;
        field4327 = null;
        field4319 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lvd;Lvd;IILvd;)V")
    public static final void method1513(class222 arg0, class222 arg1, int arg2, int arg3, class222 arg4) {
        field4326++;
        class110.method715(arg0, arg3, arg2, arg4, 33, arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method252(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    protected class230() {
    }
}
