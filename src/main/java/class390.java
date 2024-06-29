import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class390 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Z")
    public static boolean field5705 = false;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Ljp;")
    public static class55 field5708 = new class55(96, -1);

    @OriginalMember(owner = "client!os", name = "j", descriptor = "Z")
    public static boolean field5713 = false;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public int field5707;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public int field5710;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public int field5716;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Lde;")
    public static class10 field5714;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[[Z")
    public static boolean[][] field5715;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public static final void method2465(int arg0) {
        if (arg0 != 8031) {
            method2466(-27);
        }
        field5706++;
        class183.field2805.method360(-58);
        class456.field6781.method360(-94);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method2466(int arg0) {
        field5715 = null;
        if (arg0 != -1) {
            method2465(-93);
        }
        field5708 = null;
        field5714 = null;
    }
}
