import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class612 {

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[S")
    public static short[] field110 = new short[256];

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field112 = -1;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Ljca;")
    public static class585 field111;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V", line = 7)
    public static void method111(int arg0) {
        field110 = null;
        if (arg0 != -2) {
            method111(120);
        }
        field111 = null;
    }
}
