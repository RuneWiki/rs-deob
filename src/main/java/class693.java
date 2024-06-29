import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class693 {

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public int field9482;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "Z")
    public boolean field9480;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "S")
    public short field9479;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "B")
    public byte field9469;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public int field9472;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public int field9477;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "S")
    public short field9468;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    public int field9481;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public int field9474;

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "S")
    public short field9476;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    public static int field9478 = -1;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "Lnj;")
    public static class415 field9470 = new class415(64, -1);

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 5)
    public static final void method3772(byte arg0) {
        if (arg0 != 47) {
            field9483 = 50;
        }
        class399.field5084 = true;
        field9475++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[S)[S", line = 23)
    public static final short[] method3773(int arg0, short[] arg1) {
        field9471++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -27689) {
            field9470 = null;
        }
        short[] var2 = new short[arg1.length];
        class443.method2516(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 40)
    public static void method3774(int arg0) {
        if (arg0 > -80) {
            method3772((byte) 12);
        }
        field9470 = null;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V", line = 64)
    public static final void method3775(int arg0) {
        int var1 = 7 % ((26 - arg0) / 59);
        field9473++;
        class442.method2508(11, 1);
        class378.method2161(121);
        System.gc();
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 78)
    public class693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9482 = arg1;
        this.field9480 = arg10;
        this.field9479 = (short) arg4;
        this.field9469 = (byte) arg8;
        this.field9472 = arg2;
        this.field9477 = arg0;
        this.field9468 = (short) arg6;
        this.field9481 = arg3;
        this.field9474 = arg11;
        this.field9476 = (short) arg5;
    }
}
