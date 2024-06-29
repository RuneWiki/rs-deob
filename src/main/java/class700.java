import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class700 extends class65 {

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public int field9895;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public int field9896;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public int field9898;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public int field9899;

    @OriginalMember(owner = "client!uca", name = "w", descriptor = "I")
    public int field9903;

    @OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
    public int field9904;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "Lraa;")
    public class353 field9894;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "Lraa;")
    public class353 field9902;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "Ljava/lang/String;")
    public String field9900;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "Z")
    public boolean field9893;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "[Ljava/lang/Object;")
    public Object[] field9891;

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "[Z")
    public static boolean[] field9901;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    public static final void method3889(int arg0) {
        class206.field3457.method76(arg0 - 12230);
        if (arg0 != 12294) {
            field9901 = null;
        }
        field9897++;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method3890(byte arg0) {
        field9901 = null;
        int var1 = 42 / ((10 - arg0) / 63);
    }
}
