import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class class117 extends class68 {

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "B")
    public byte field1761;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "B")
    public byte field1768;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "S")
    public short field1770;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
    public boolean field1772;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "S")
    public short field1771;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "S")
    public short field1765;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "S")
    public short field1762;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "Lri;")
    public static class73 field1767 = new class73(27, 6);

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BII)V")
    public static final void method782(byte arg0, int arg1, int arg2) {
        int var3 = -105 % ((-arg0 - 21) / 35);
        field1764++;
        class338 var4 = class230.method1580(16, -1332166328, arg1);
        var4.method2053(-93);
        var4.field4756 = arg2;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
    public static void method783(int arg0) {
        if (arg0 > -93) {
            field1767 = null;
        }
        field1767 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public void method784(boolean arg0) {
        field1760++;
        if (!arg0) {
            this.field1762 = 21;
        }
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)I")
    public abstract int method283(int arg0);

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1761 = arg9;
        this.field1768 = (byte) arg0;
        this.field1770 = (short) arg5;
        this.field1769 = arg3;
        this.field1772 = arg8;
        this.field1771 = (short) arg6;
        this.field1766 = arg2;
        this.field1765 = (short) arg7;
        this.field1763 = arg1;
        this.field1762 = (short) arg4;
    }
}
