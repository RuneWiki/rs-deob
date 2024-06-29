import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public abstract class class325 extends class316 {

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "B")
    public byte field4527;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "S")
    public short field4539;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "S")
    public short field4534;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "S")
    public short field4535;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "Z")
    public boolean field4541;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "S")
    public short field4526;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "B")
    public byte field4531;

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "[I")
    public static int[] field4542 = new int[32];

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Ljd;")
    public static class383 field4529 = new class383("WTWIP", 3);

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Lrn;")
    public static class417 field4525;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V")
    public void method1753(boolean arg0) {
        field4528++;
        if (!arg0) {
            this.field4530 = 97;
        }
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
    public static void method2050(int arg0) {
        if (arg0 == 255) {
            field4525 = null;
            field4529 = null;
            field4542 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)V")
    public static final void method2051(int arg0) {
        field4538++;
        int var1 = class164.method1210(false);
        if (var1 == 0) {
            class486.field6878 = null;
            class436.method2667((byte) 13, 0);
        } else if (var1 == 1) {
            class77.method680((byte) 0, 0);
            class436.method2667((byte) 13, 512);
            if (class372.field5120 != null) {
                class132.method984(114);
            }
        } else {
            class77.method680((byte) (class392.field5407 - 4 & 0xFF), 0);
            class436.method2667((byte) 13, 2);
        }
        class263.field3789 = class387.field5306;
        int var2 = -50 % ((18 - arg0) / 54);
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)I")
    public abstract int method251(byte arg0);

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4527 = arg9;
        this.field4539 = (short) arg6;
        this.field4534 = (short) arg7;
        this.field4537 = (short) arg1;
        this.field4535 = (short) arg4;
        this.field4530 = (short) arg3;
        this.field4532 = (short) arg2;
        this.field4541 = arg8;
        this.field4526 = (short) arg5;
        this.field4531 = (byte) arg0;
    }
}
