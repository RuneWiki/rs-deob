import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class91 implements class46 {

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Lop;")
    public class172 field1277;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lpe;")
    public class564 field1273;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Z")
    public boolean field1280;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    public static int[] field1268 = new int[64];

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lwo;")
    public static class690 field1276 = new class690(33, -2);

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "[Lbca;")
    public static class612[] field1279 = new class612[14];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Lraa;")
    public static class562 field1282;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "[I")
    public static int[] field1281;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)Lsq;", line = 5)
    public final class161 method448(byte arg0) {
        if (arg0 != 25) {
            this.method448((byte) -101);
        }
        field1267++;
        return class335.field4449;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 34)
    public static void method707(int arg0) {
        field1279 = null;
        field1276 = null;
        field1268 = null;
        field1281 = null;
        if (arg0 < -39) {
            field1282 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ILpe;Lop;IIIIIIIZ)V", line = 58)
    public class91(int arg0, class564 arg1, class172 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field1277 = arg2;
        this.field1273 = arg1;
        this.field1265 = arg4;
        this.field1275 = arg5;
        this.field1272 = arg3;
        this.field1271 = arg8;
        this.field1270 = arg7;
        this.field1266 = arg9;
        this.field1269 = arg0;
        this.field1274 = arg6;
        this.field1280 = arg10;
    }
}
