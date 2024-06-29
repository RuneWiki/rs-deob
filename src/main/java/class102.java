import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class102 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Loc;")
    private static class99 field2476 = class48.method402((byte) -104, " is already on your friend list");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Loc;")
    public static class99 field2475 = class48.method402((byte) -104, "(X100(U(Y");

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Loc;")
    public static class99 field2480 = class48.method402((byte) -104, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2487 = -1;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2483 = 0;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Loc;")
    public static class99 field2482 = field2476;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Loc;")
    private static class99 field2489 = class48.method402((byte) -104, "Loaded input handler");

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Loc;")
    public static class99 field2490 = field2489;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Loc;")
    public static class99 field2481 = class48.method402((byte) -104, "@or3@");

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Loc;")
    public static class99 field2492 = class48.method402((byte) -104, "au");

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Loe;")
    public static class102 field2484;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field2479;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[I")
    public int[] field2478;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method107(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public final void method874(byte arg0) {
        field2488++;
        class96.method790(this.field2478, this.field2486, this.field2491);
        int var2 = 56 % ((-arg0 - 34) / 62);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2489 = null;
        if (arg0 != 4121) {
            field2483 = 8;
        }
        field2481 = null;
        field2476 = null;
        field2475 = null;
        field2482 = null;
        field2480 = null;
        field2492 = null;
        field2484 = null;
        field2490 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method109(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    protected class102() {
    }
}
