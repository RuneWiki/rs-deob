import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class471 extends class197 {

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "S")
    public short field6505;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "S")
    public short field6500;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "B")
    public byte field6502;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Z")
    public boolean field6504;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "S")
    public short field6497;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "S")
    public short field6491;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "B")
    public byte field6499;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public int field6507;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
    public static int[] field6496 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[S")
    public static short[] field6506 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lhu;")
    public static class76 field6493 = new class76(50);

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field6492;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[Ljd;")
    public static class139[] field6498;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field6495;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 3)
    public void method538(byte arg0) {
        field6494++;
        if (arg0 != 127) {
            this.method538((byte) -90);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V", line = 22)
    public static void method2762(byte arg0) {
        if (arg0 != 40) {
            return;
        }
        field6498 = null;
        field6493 = null;
        field6496 = null;
        field6495 = null;
        field6506 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 54)
    public class471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6505 = (short) arg5;
        this.field6500 = (short) arg4;
        this.field6502 = (byte) arg0;
        this.field6504 = arg8;
        this.field6497 = (short) arg7;
        this.field6491 = (short) arg6;
        this.field6501 = (short) arg1;
        this.field6499 = arg9;
        this.field6503 = (short) arg2;
        this.field6507 = (short) arg3;
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(I)I")
    public abstract int method6(int arg0);
}
