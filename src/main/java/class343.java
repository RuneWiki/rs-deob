import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class343 extends class93 {

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "C")
    public char field4978;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "J")
    public long field4973;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "Lhv;")
    public class343 field4983;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Z")
    public boolean field4980;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        field4981++;
        if (arg0 != 29767) {
            this.field4980 = false;
        }
        return this.field4980;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)J")
    public final long method573(boolean arg0) {
        field4976++;
        return arg0 ? this.field4973 : 31L;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)I")
    public final int method576(byte arg0) {
        int var2 = -24 % ((arg0 + 42) / 32);
        field4977++;
        return this.field4982;
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
    public final int method574(int arg0) {
        if (arg0 == 250) {
            field4975++;
            return this.field4974;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)I")
    public static final int method2074(byte arg0, int arg1) {
        field4984++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0 != -74) {
            method2074((byte) -109, 23);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "(I)C")
    public final char method575(int arg0) {
        field4979++;
        return arg0 == 26283 ? this.field4978 : '(';
    }
}
