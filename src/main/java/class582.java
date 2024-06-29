import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class582 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
    public boolean field8302;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "S")
    public short field8305;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public int field8303;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "S")
    public short field8308;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public int field8299;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "S")
    public short field8311;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "B")
    public byte field8304;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Llc;")
    public static class435 field8301 = new class435(37, 7);

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Lgr;")
    public static class530 field8312 = new class530(74, 2);

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[F")
    public static float[] field8313 = new float[2];

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V", line = 5)
    public static final void method3427(int arg0, int arg1, int arg2) {
        if (arg0 != 74) {
            method3427(-127, 100, 95);
        }
        field8310++;
        class123 var3 = class680.field9653[arg2][arg1];
        if (var3 != null) {
            class344.field4732 = var3.field1685;
            class469.field6682 = var3.field1691;
            class111.field1573 = var3.field1688;
        }
        class108.method798((byte) -64);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 35)
    public static void method3428(byte arg0) {
        field8312 = null;
        field8313 = null;
        field8301 = null;
        if (arg0 != -49) {
            method3429(true, (byte) 71, -92);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZBI)Ljt;", line = 51)
    public static final class37 method3429(boolean arg0, byte arg1, int arg2) {
        if (arg1 > -97) {
            field8312 = null;
        }
        field8309++;
        long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class37) class475.field6761.method4020(var3, (byte) -88);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 70)
    public class582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8300 = arg1;
        this.field8302 = arg10;
        this.field8306 = arg2;
        this.field8307 = arg11;
        this.field8305 = (short) arg5;
        this.field8303 = arg0;
        this.field8308 = (short) arg6;
        this.field8299 = arg3;
        this.field8311 = (short) arg4;
        this.field8304 = (byte) arg8;
    }
}
