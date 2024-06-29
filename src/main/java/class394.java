import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public abstract class class394 {

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "Leba;")
    public static class550 field5259 = new class550(5, 7);

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "[I")
    public static int[] field5264 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "[B")
    public static byte[] field5265 = new byte[2048];

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "[I")
    public static int[] field5266 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public int field5256;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Z")
    public final boolean method2266(int arg0) {
        field5258++;
        if (arg0 == 1) {
            return (this.field5256 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)Z")
    public final boolean method2267(byte arg0) {
        field5261++;
        int var2 = 106 / ((-arg0 - 11) / 62);
        return (this.field5256 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Z")
    public final boolean method2268(int arg0) {
        field5260++;
        int var2 = -58 % ((-arg0 - 1) / 57);
        return (this.field5256 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public static void method2269(int arg0) {
        if (arg0 < 81) {
            method2269(-5);
        }
        field5259 = null;
        field5266 = null;
        field5264 = null;
        field5265 = null;
    }

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)Z")
    public final boolean method2270(int arg0) {
        field5263++;
        int var2 = -121 / ((49 - arg0) / 36);
        return (this.field5256 & 0x8) != 0;
    }
}
