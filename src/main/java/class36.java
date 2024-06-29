import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public abstract class class36 {

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "Lea;")
    public static class10 field487 = class3.method8("overlay)3dat", 100);

    @OriginalMember(owner = "mapview!sa", name = "f", descriptor = "[[B")
    public static byte[][] field492 = new byte[1000][];

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "Lea;")
    public static class10 field488 = class3.method8("Transportation", 123);

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "Loa;")
    public static class28 field490;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field489;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 19)
    public static void method243(int arg0) {
        field487 = null;
        field492 = null;
        field490 = null;
        field488 = null;
        int var1 = -8 % ((arg0 - 63) / 57);
        field489 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Ls;Lea;Lea;B)[Lm;", line = 39)
    public static final class24[] method244(class35 arg0, class10 arg1, class10 arg2, byte arg3) {
        int var4 = arg0.method242(arg1, arg3 - 63);
        if (arg3 != 69) {
            method244(null, null, null, (byte) -1);
        }
        int var5 = arg0.method241((byte) 67, arg2, var4);
        return class38.method246(arg0, -29411, var4, var5);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(BII)I")
    public abstract int method148(byte arg0, int arg1, int arg2);
}
