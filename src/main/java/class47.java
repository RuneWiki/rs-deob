import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class47 extends Canvas {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field654;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lkn;")
    public static class442 field657 = new class442("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Loi;")
    public static class45 field660;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
    public static int[] field653;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[I")
    public static int[] field662;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lnq;Lnq;BLnq;)V")
    public static final void method413(class268 arg0, class268 arg1, byte arg2, class268 arg3) {
        if (arg2 < 26) {
            method415(-88);
        }
        field655++;
        class258.field3626 = arg1;
        class284.method1853(arg3, arg0, 1000000);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    public static final int method414(int arg0, int arg1) {
        return class126.field1782 == null ? 0 : class126.field1782[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class47(Component arg0) {
        this.field654 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field652++;
        this.field654.update(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field654.paint(arg0);
        field651++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field660 = null;
        field653 = null;
        field657 = null;
        if (arg0 >= 14) {
            field662 = null;
        }
    }

    static {
        Math.sqrt(8192.0D);
    }
}
