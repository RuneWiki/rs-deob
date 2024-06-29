import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class434 extends class186 {

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
    public boolean field6280;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public int field6287;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "S")
    public short field6290;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "S")
    public short field6277;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "S")
    public short field6282;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public int field6281;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "B")
    public byte field6293;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "S")
    public short field6288;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public int field6284;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "B")
    public byte field6279;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Z")
    public static boolean field6283 = false;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "[I")
    public static int[] field6291 = new int[32];

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "Z")
    public static boolean field6286 = false;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "Lhi;")
    public static class45 field6275 = new class45(74, 7);

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    public static int field6294 = 1400;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z", line = 17)
    public static final boolean method2574(int arg0, int arg1) {
        if (arg0 == 1400) {
            field6292++;
            return arg1 == 23 || arg1 == 25 || arg1 == 1002 || arg1 == 11 || arg1 == 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "(I)V", line = 32)
    public void method100(int arg0) {
        field6276++;
        if (arg0 != 0) {
            this.field6274 = -62;
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)V", line = 46)
    public static void method2575(byte arg0) {
        field6291 = null;
        field6275 = null;
        int var1 = -36 % ((arg0 - 48) / 41);
    }

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "(I)V", line = 58)
    public static final void method2576(int arg0) {
        class349.field5071.method1583(127);
        if (arg0 == 13334) {
            field6289++;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 73)
    public class434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6280 = arg8;
        this.field6287 = arg3;
        this.field6290 = (short) arg4;
        this.field6277 = (short) arg6;
        this.field6282 = (short) arg7;
        this.field6281 = arg2;
        this.field6293 = arg9;
        this.field6288 = (short) arg5;
        this.field6284 = arg1;
        this.field6279 = (byte) arg0;
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)I")
    public abstract int method836(int arg0);
}
