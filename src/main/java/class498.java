import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class498 {

    @OriginalMember(owner = "client!no", name = "h", descriptor = "B")
    public byte field7260 = 0;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "B")
    public byte field7269;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "B")
    public byte field7262;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "S")
    public short field7274;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "S")
    public short field7270;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "[C")
    public static char[] field7254 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!no", name = "c", descriptor = "B")
    public byte field7255;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "B")
    public byte field7266;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "B")
    public byte field7272;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "B")
    public byte field7275;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lpj;")
    public class100 field7259;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "Lpj;")
    public class100 field7271;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Lbq;")
    public class192 field7263;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "Lvv;")
    public class215 field7268;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Luj;")
    public class262 field7257;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Luj;")
    public class262 field7264;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "Leu;")
    public class336 field7265;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "Lno;")
    public class498 field7276;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Lrv;")
    public class73 field7273;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "S")
    public short field7256;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "Z")
    public boolean field7258;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Z")
    public boolean field7261;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Z")
    public boolean field7267;

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(III)V", line = 5)
    public class498(int arg0, int arg1, int arg2) {
        this.field7262 = this.field7269 = (byte) arg0;
        this.field7274 = (short) arg2;
        this.field7270 = (short) arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 20)
    public final void method2996(byte arg0) {
        if (arg0 != -90) {
            return;
        }
        field7253++;
        while (this.field7263 != null) {
            class192 var2 = this.field7263.field2469;
            this.field7263.method1092((byte) -86);
            this.field7263 = var2;
        }
        this.field7260 = 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 58)
    public static void method2997(boolean arg0) {
        if (arg0) {
            field7254 = null;
        }
        field7254 = null;
    }
}
