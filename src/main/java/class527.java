import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class527 {

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lrg;")
    public static class548 field7384 = new class548(16, 8);

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Ldn;")
    public static class438 field7382;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "[B")
    public byte[] field7385;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[S")
    public short[] field7381;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[S")
    public short[] field7386;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[S")
    public short[] field7387;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 11)
    public static void method3004(int arg0) {
        if (arg0 < -19) {
            field7382 = null;
            field7384 = null;
        }
    }
}
