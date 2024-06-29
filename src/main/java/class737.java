import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class737 extends class484 {

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "[I")
    public int[] field10372;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "[I")
    public int[] field10374;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "J")
    public static long field10373 = 0L;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Z")
    public static boolean field10375 = false;

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II[I[I)V", line = 15)
    public class737(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field10372 = arg2;
        this.field10374 = arg3;
    }
}
