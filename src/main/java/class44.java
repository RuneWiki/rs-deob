import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class44 {

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Z")
    public boolean field713 = false;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "J")
    public long field701;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lrn;")
    public static class18 field702;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lrn;")
    public static class18 field703;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lqf;")
    public class64 field714;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field711;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JZ)V", line = 12)
    public static final void method449(long arg0, boolean arg1) {
        field712++;
        class99.field1491.field397 = 0;
        class99.field1491.method273(0, 21);
        class99.field1491.method279(12086, arg0);
        class129.field2139 = 1;
        class150.field2455 = 0;
        class113.field1738 = 0;
        if (arg1) {
            method449(-127L, true);
        }
        class135.field2261 = -3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 32)
    public static final void method450(byte arg0) {
        field707++;
        class264.field4101.method656(0);
        class53.field801.method656(0);
        if (arg0 < 10) {
            method449(-37L, false);
        }
        class184.field2891.method656(0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 59)
    public static void method451(int arg0) {
        if (arg0 != 0) {
            field711 = (Image) null;
        }
        field702 = null;
        field711 = null;
        field703 = null;
    }
}
