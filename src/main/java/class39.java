import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class39 {

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public int field517;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public int[] field515;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
    public int[] field513;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Z")
    public static boolean field514 = false;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field517 = arg0;
        this.field515 = new int[this.field517];
        this.field513 = new int[this.field517];
    }
}
