import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class425 {

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public int field6341;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public int field6337;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "B")
    public byte field6340;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public int field6334;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "Z")
    public static boolean field6333 = false;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "Z")
    public static boolean field6336 = false;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Lpj;")
    public class177 field6335;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lbf;")
    public class183 field6330;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "Ltd;")
    public class380 field6338;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "Llv;")
    public class528 field6329;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ldr;BI)V")
    public static final void method2527(class293 arg0, byte arg1, int arg2) {
        if (arg1 != 64) {
            return;
        }
        field6342++;
        class36.field503 = false;
        class491.field7321 = 0;
        class521.method3087(arg0, arg1 - 63);
        class155.method1115(arg0, arg1 ^ 0x81F);
        if (class36.field503) {
            System.out.println("---endgpp---");
        }
        if (arg0.field6830 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field6830 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(BIIIII)V")
    public class425(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6341 = arg4;
        this.field6331 = arg1;
        this.field6337 = arg5;
        this.field6339 = arg3;
        this.field6340 = arg0;
        this.field6334 = arg2;
    }
}
