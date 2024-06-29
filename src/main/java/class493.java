import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class493 extends class103 {

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
    public boolean field6924 = false;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    public boolean field6922 = false;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "S")
    public short field6917;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field6921;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public int field6918;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lbv;")
    public static class567 field6920 = new class567("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
    public static int[] field6923 = new int[2];

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field6925 = 0;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V", line = 14)
    public static void method2816(int arg0) {
        field6923 = null;
        if (arg0 != 2) {
            method2816(-40);
        }
        field6920 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIZZ)V", line = 36)
    public class493(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field6917 = (short) arg3;
        this.field6921 = arg1;
        this.field6924 = arg5;
        this.field6919 = arg2;
        this.field6918 = arg0;
        this.field6922 = arg4;
    }
}
