import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class82 {

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "S")
    public short field1289;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "B")
    public byte field1282;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "S")
    public short field1279;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "S")
    public short field1288;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
    public boolean field1283;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "B")
    public byte field1285;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Laea;")
    public static class47 field1278 = new class47();

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "[F")
    public static float[] field1284 = new float[16];

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "[I")
    public static int[] field1287 = new int[1000];

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field1287 = null;
        if (arg0 == -122) {
            field1278 = null;
            field1284 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)Ltt;")
    public final class82 method680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1000) {
            field1280++;
            return new class82(arg2, arg3, arg4, arg0, this.field1289, this.field1288, this.field1279, this.field1282, this.field1285, this.field1283);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)V")
    public static final void method681(byte arg0, int arg1) {
        int var2 = -80 % ((arg0 + 56) / 54);
        class693.field9751.method3740((byte) 60, arg1);
        field1281++;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1289 = (short) arg4;
        this.field1286 = arg0;
        this.field1282 = (byte) arg7;
        this.field1279 = (short) arg6;
        this.field1288 = (short) arg5;
        this.field1283 = arg9;
        this.field1285 = (byte) arg8;
    }
}
