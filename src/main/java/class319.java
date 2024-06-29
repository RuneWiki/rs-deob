import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class319 {

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "[I")
    public static int[] field4252 = new int[32];

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lsd;")
    public static class63 field4250 = new class63(8, 0, 4, 1);

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field4257 = -2;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field4260 = 0;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Ljc;")
    public static class305 field4259 = new class305("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "Z")
    public static boolean field4261 = false;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Lmf;")
    public static class290 field4256;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Lts;")
    public static class375 field4258;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[B")
    public byte[] field4251;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "[S")
    public short[] field4249;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "[S")
    public short[] field4254;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "[S")
    public short[] field4255;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method1895(int arg0) {
        field4258 = null;
        if (arg0 != 0) {
            method1895(-29);
        }
        field4252 = null;
        field4250 = null;
        field4259 = null;
        field4256 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
    public static final void method1896(int arg0, int arg1) {
        field4253++;
        if (arg0 == -1 || !class260.field3494[arg0]) {
            return;
        }
        class186.field2420.method2139(arg0, true);
        if (arg1 <= 14) {
            field4261 = false;
        }
        class339.field4491[arg0] = null;
        class363.field4969[arg0] = null;
        class260.field3494[arg0] = false;
    }
}
