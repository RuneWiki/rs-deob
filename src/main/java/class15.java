import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
    public int[] field138;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
    public int[] field139;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Z")
    public static boolean field140 = false;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V", line = 10)
    public class15(int arg0) {
        this.field137 = arg0;
        this.field138 = new int[this.field137];
        this.field139 = new int[this.field137];
    }
}
