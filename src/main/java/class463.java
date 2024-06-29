import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class463 extends class69 {

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "S")
    public short field6465;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljn;")
    public static class134 field6466 = new class134(21, -1);

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lof;")
    public static class475 field6467 = new class475(6, 1);

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Laf;")
    public static class39 field6468 = new class39(8);

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "F")
    public static float field6464;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method2784(byte arg0) {
        field6466 = null;
        field6468 = null;
        int var1 = 34 % ((31 - arg0) / 57);
        field6467 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class463() {
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(S)V")
    public class463(short arg0) {
        this.field6465 = arg0;
    }
}
