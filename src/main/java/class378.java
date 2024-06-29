import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class378 {

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "[I")
    public int[] field5516 = new int[4];

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "B")
    public byte field5521;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
    public int[] field5517;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "B")
    public byte field5524;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[I")
    public int[] field5515;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "S")
    public short field5522;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "S")
    public short field5518;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "S")
    public short field5513;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "S")
    public short field5512;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "[S")
    public short[] field5525;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "[S")
    public short[] field5514;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "[S")
    public short[] field5519;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Lmw;")
    public static class517 field5520 = new class517(20, 0);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5520 = null;
        if (arg0 != 27947) {
            field5520 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method2365(int arg0, byte arg1, int arg2) {
        field5523++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else {
            if (arg1 != 101) {
                method2364(-78);
            }
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field5521 = (byte) arg1;
        this.field5517 = new int[4];
        this.field5524 = (byte) arg0;
        this.field5515 = new int[4];
        this.field5517[1] = arg3;
        this.field5517[3] = arg5;
        this.field5517[2] = arg4;
        this.field5517[0] = arg2;
        this.field5515[3] = arg9;
        this.field5515[0] = arg6;
        this.field5515[2] = arg8;
        this.field5515[1] = arg7;
        this.field5522 = (short) (arg2 >> class478.field6717);
        this.field5516[0] = arg10;
        this.field5516[1] = arg11;
        this.field5516[2] = arg12;
        this.field5516[3] = arg13;
        this.field5518 = (short) (arg4 >> class478.field6717);
        this.field5513 = (short) (arg10 >> class478.field6717);
        this.field5512 = (short) (arg12 >> class478.field6717);
        this.field5525 = new short[4];
        this.field5514 = new short[4];
        this.field5519 = new short[4];
    }
}
