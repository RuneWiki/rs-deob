import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class28 {

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "S")
    public short field374;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
    public boolean field376;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "S")
    public short field368;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "B")
    public byte field367;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "S")
    public short field366;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field370 = 1401;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Llga;")
    public static class711 field372 = new class711();

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lrq;")
    public static class350 field378;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method166(byte arg0) {
        field378 = null;
        field372 = null;
        if (arg0 > -101) {
            method166((byte) -126);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field374 = (short) arg6;
        this.field379 = arg0;
        this.field376 = arg10;
        this.field368 = (short) arg5;
        this.field371 = arg11;
        this.field367 = (byte) arg8;
        this.field366 = (short) arg4;
        this.field375 = arg1;
        this.field377 = arg2;
        this.field365 = arg3;
    }
}
