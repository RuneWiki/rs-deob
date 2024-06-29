import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class392 {

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "B")
    public byte field5984;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public int field5994;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public int field5997;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    private int field6003;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Llq;")
    public class392 field5982;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "[I")
    public static int[] field5987 = new int[14];

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field5983 = -1;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "Lni;")
    public static class367 field6004 = new class367(80, 4);

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "Llp;")
    public static class272 field6005 = new class272(64);

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public int field5985;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public int field5986;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public int field5992;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public int field5995;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public int field5998;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public int field6002;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 6)
    public static void method2444(int arg0) {
        if (arg0 != -15784) {
            method2445(1, -108);
        }
        field5987 = null;
        field6004 = null;
        field6005 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V", line = 18)
    public static final void method2445(int arg0, int arg1) {
        class398.field6075 = arg1;
        field6000++;
        if (arg0 != 638) {
            field5988 = 108;
        }
        class283.field4160.method2127((byte) -73);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)Llq;", line = 32)
    public final class392 method2446(int arg0, int arg1, int arg2, int arg3) {
        field5996++;
        if (arg2 != 64) {
            method2444(108);
        }
        return new class392(this.field6003, arg1, arg0, arg3, this.field5984);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)Lun;", line = 51)
    public final class296 method2447(byte arg0) {
        field5990++;
        return arg0 > -55 ? null : class424.method2586(true, this.field6003);
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIB)V", line = 79)
    public class392(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field5984 = arg4;
        this.field5994 = arg1;
        this.field5989 = arg2;
        this.field5997 = arg3;
        this.field6003 = arg0;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Llq;I)V", line = 90)
    public class392(class392 arg0, int arg1) {
        this.field5982 = arg0;
        this.field6003 = this.field5982.field6003;
        this.field5997 = this.field5982.field5997 + arg1;
        this.field5994 = this.field5982.field5994 + arg1;
        this.field5989 = this.field5982.field5989 + arg1;
        this.field5984 = this.field5982.field5984;
    }
}
