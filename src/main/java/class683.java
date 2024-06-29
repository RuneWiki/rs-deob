import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public abstract class class683 extends class159 {

    @OriginalMember(owner = "client!kja", name = "k", descriptor = "I")
    public static int field9123 = 1;

    @OriginalMember(owner = "client!kja", name = "l", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!kja", name = "n", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!kja", name = "o", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!kja", name = "m", descriptor = "[Lofa;")
    public static class347[] field9125;

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lhr;B)V")
    public abstract void method1668(class551 arg0, byte arg1);

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(Ldt;I)V")
    public abstract void method1666(class254 arg0, int arg1);

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
    public static final void method3744(int arg0, Rectangle[] arg1, int arg2) throws class283 {
        if (arg0 != -10901) {
            return;
        }
        if (class206.field2664 == 1) {
            class685.field9171.method521(arg1, arg2, class16.field155, class90.field1281);
        } else {
            class685.field9171.method521(arg1, arg2, 0, 0);
        }
        field9126++;
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(BI)I")
    public static final int method3745(byte arg0, int arg1) {
        if (arg0 != 21) {
            method3745((byte) -39, -62);
        }
        field9127++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I)V")
    public static void method3746(int arg0) {
        field9125 = null;
        if (arg0 != 0) {
            field9123 = 84;
        }
    }
}
