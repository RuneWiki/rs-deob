import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class144 {

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lsg;")
    public static class30 field2776 = class167.method1221((byte) 33, "::gc");

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[Lsg;")
    public static class30[] field2772 = new class30[1000];

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "J")
    public static volatile long field2778 = 0L;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field2770;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
    public int[] field2773;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Lsk;")
    public static final class104 method1065(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class104 var4 = var3.field3541;
            var3.field3541 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method38(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lmc;Z)V")
    public static final void method1066(class151 arg0, boolean arg1) {
        class201.field3585 = arg0;
        if (!arg1) {
            method1067(38);
        }
        field2771++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field2776 = null;
        if (arg0 == 1000) {
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    protected class144() {
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public abstract void method36(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public abstract void method33(int arg0, int arg1, byte arg2, Component arg3);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public final void method1068(boolean arg0) {
        field2777++;
        if (!arg0) {
            class188.method1368(this.field2773, this.field2775, this.field2774);
        }
    }
}
