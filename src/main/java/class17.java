import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class17 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[J")
    public static long[] field289 = new long[100];

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lpj;")
    public static class237 field292 = class33.method353("Sprites geladen)3", 59);

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lpj;")
    private static class237 field293 = class33.method353("level:", 37);

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lpj;")
    public static class237 field291 = field293;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field298 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
    public static int[] field297 = new int[256];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lfa;")
    public static class239 field301;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Ljd;")
    public static class86 field302;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field299;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public int[] field300;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method152(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public final void method153(int arg0) {
        field303++;
        if (arg0 == 100) {
            class192.method1300(this.field300, this.field295, this.field294);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method154(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public abstract void method155(Component arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static void method156(int arg0) {
        field289 = null;
        field302 = null;
        field297 = null;
        field293 = null;
        field301 = null;
        field292 = null;
        field291 = null;
        int var1 = -119 / ((arg0 - 6) / 52);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    protected class17() {
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
    public static final void method157(int arg0, byte arg1) {
        field290++;
        if (arg1 == -64) {
            class51.field1085 = -1;
            class22.field405 = arg0;
            class51.field1085 = -1;
            class208.method1393((byte) 25);
        }
    }
}
