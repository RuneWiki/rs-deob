import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class144 extends class510 {

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "Z")
    public boolean field1901;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "S")
    public short field1911;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "S")
    public short field1902;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "S")
    public short field1898;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "B")
    public byte field1904;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "S")
    public short field1907;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "B")
    public byte field1900;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field1908 = 0;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field1909 = 1338;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V", line = 9)
    public void method893(int arg0) {
        field1906++;
        if (arg0 != 32107) {
            this.field1904 = -77;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BC)Z", line = 23)
    public static final boolean method897(byte arg0, char arg1) {
        int var2 = 51 / ((-arg0 - 31) / 60);
        field1897++;
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V", line = 41)
    public static final void method898(boolean arg0) {
        class22.field257++;
        class61.method498(class247.field3708, 1);
        field1903++;
        class30.field357.method2376((byte) 122, 0);
        if (arg0) {
            method898(false);
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 59)
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1899 = arg3;
        this.field1901 = arg8;
        this.field1896 = arg1;
        this.field1911 = (short) arg4;
        this.field1902 = (short) arg6;
        this.field1898 = (short) arg5;
        this.field1904 = (byte) arg0;
        this.field1907 = (short) arg7;
        this.field1912 = arg2;
        this.field1900 = arg9;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)I")
    public abstract int method127(byte arg0);
}
