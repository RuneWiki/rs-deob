import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class259 extends class88 {

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "[I")
    public static int[] field4641 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "[I")
    public static int[] field4643 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Lnb;")
    public static class199 field4642 = new class199(64);

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field4646 = 0;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Lhj;")
    public static class69 field4644 = class181.method1318("Mem:", (byte) -122);

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Lhj;")
    public static class69 field4647 = class181.method1318("Verbindung mit Update)2Server)3)3)3", (byte) -128);

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "Lhj;")
    public static class69 field4648 = class181.method1318(":allyreq:", (byte) -120);

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field4645 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1784(int arg0, int arg1, int arg2, int arg3) {
        if (class152.method1154(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class64.method419(var4 + 1, class271.field4793[arg0][arg1][arg2] + arg3, var5 + 1) && class64.method419(var4 + 128 - 1, class271.field4793[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class64.method419(var4 + 128 - 1, class271.field4793[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class64.method419(var4 + 1, class271.field4793[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method1785(byte arg0) {
        field4642 = null;
        field4641 = null;
        field4643 = null;
        field4648 = null;
        if (arg0 > -53) {
            field4641 = null;
        }
        field4644 = null;
        field4647 = null;
    }
}
