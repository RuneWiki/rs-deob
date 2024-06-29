import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class637 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
    public static boolean field9281 = false;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field9280 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lqb;")
    public static class189 field9283;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I")
    public static final int method3692(byte arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0x55555555);
        field9282++;
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 != -115) {
            method3692((byte) -73, 16);
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method3693(byte arg0) {
        field9283 = null;
        if (arg0 >= -107) {
            method3692((byte) 61, -23);
        }
    }

    static {
        new class104("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
    }
}
