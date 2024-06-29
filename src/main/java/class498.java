import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class498 {

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "S")
    public short field6391;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "S")
    public short field6378;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "B")
    public byte field6385;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "S")
    public short field6384;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "Z")
    public boolean field6387;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "B")
    public byte field6381;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "Lhu;")
    public static class238 field6379 = new class238();

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public static int field6390 = 0;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)I")
    public static final int method2764(int arg0) {
        field6392++;
        return arg0 == -2 ? class11.field99 : 103;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)I")
    public static final int method2765(byte arg0) {
        field6380++;
        if (class596.field7567 == 1) {
            return class340.field4159;
        } else {
            if (arg0 > -21) {
                method2766((byte) -111);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)V")
    public static void method2766(byte arg0) {
        if (arg0 != -128) {
            method2767(-6);
        }
        field6379 = null;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
    public static final void method2767(int arg0) {
        class617.field7826 = 0;
        class636.field8085 = 0;
        class560.field7109 = 0;
        class415.field5486 = 0;
        field6389++;
        if (arg0 != 10178) {
            field6386 = 124;
        }
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field6391 = (short) arg5;
        this.field6378 = (short) arg4;
        this.field6385 = (byte) arg7;
        this.field6384 = (short) arg6;
        this.field6387 = arg9;
        this.field6382 = arg0;
        this.field6381 = (byte) arg8;
        this.field6383 = arg10;
    }
}
