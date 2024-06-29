import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class238 {

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "[S")
    public short[] field4237;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public int[] field4225;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "[B")
    public byte[] field4228;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[Lha;")
    public class46[] field4232;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[S")
    public short[] field4234;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lha;")
    public static class46 field4227 = class271.method1828("um", -46);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lha;")
    public static class46 field4220 = class271.method1828("runes", -46);

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[I")
    public static int[] field4236 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lha;")
    public static class46 field4235 = class271.method1828("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -46);

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[I")
    public static int[] field4238 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field4239 = 7759444;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "S")
    public static short field4241 = 1;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lpi;")
    public static class181 field4221;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[Z")
    public static boolean[] field4231;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIILvd;I)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, class141 arg5, int arg6) {
        class137.method1050(arg3, arg6, arg2, arg5.field2585, arg1, arg0, arg5.field2546, 89);
        field4223++;
        if (arg4 <= 17) {
            method1637(-1, 22, -108, -56, 5, (class141) null, 40);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1638(byte arg0) {
        field4220 = null;
        field4235 = null;
        field4221 = null;
        int var1 = 55 % ((-arg0 - 47) / 39);
        field4238 = null;
        field4227 = null;
        field4231 = null;
        field4236 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)I")
    public static final int method1639(int arg0, int arg1, int arg2) {
        field4240++;
        int var3 = arg0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
    public final int method1640(int arg0, int arg1) {
        field4230++;
        int var3 = -68 / ((39 - arg1) / 58);
        return this.field4228[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Z")
    public static final boolean method1641(int arg0, int arg1) {
        if (arg1 != 2) {
            field4235 = null;
        }
        field4229++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class238(int arg0) {
        this.field4224 = arg0;
        this.field4237 = new short[this.field4224];
        this.field4225 = new int[this.field4224];
        this.field4228 = new byte[this.field4224];
        this.field4232 = new class46[this.field4224];
        this.field4234 = new short[this.field4224];
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)Z")
    public final boolean method1642(int arg0, int arg1) {
        field4233++;
        if (arg1 > -89) {
            method1639(-124, -2, -78);
        }
        return (this.field4228[arg0] & 0x4) != 0;
    }
}
