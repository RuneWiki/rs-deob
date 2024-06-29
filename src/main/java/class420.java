import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class420 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "B")
    public byte field6258 = 0;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "S")
    public short field6267;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "B")
    public byte field6272;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "B")
    public byte field6274;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "S")
    public short field6259;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "Lcm;")
    public static class449 field6282 = new class449(43, 3);

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "B")
    public byte field6264;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "B")
    public byte field6276;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "B")
    public byte field6278;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "B")
    public byte field6281;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Lnp;")
    public class115 field6273;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Ljo;")
    public class255 field6277;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "Ljo;")
    public class255 field6283;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Lvo;")
    public class258 field6263;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Llf;")
    public class383 field6260;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Ldr;")
    public class420 field6275;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Lkq;")
    public class523 field6268;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lmj;")
    public class70 field6261;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "Lmj;")
    public class70 field6271;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "S")
    public short field6279;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
    public boolean field6265;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Z")
    public boolean field6266;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "Z")
    public boolean field6270;

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(III)V")
    public class420(int arg0, int arg1, int arg2) {
        this.field6267 = (short) arg1;
        this.field6274 = this.field6272 = (byte) arg0;
        this.field6259 = (short) arg2;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIBIII)V")
    public static final void method2529(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field6257++;
        int var10 = arg4 + 1;
        class271.method1736(arg5, arg1, arg0, -11, class23.field356[arg4]);
        int var9 = arg3 - 1;
        class271.method1736(arg5, arg1, arg0, -11, class23.field356[arg3]);
        int var6 = var10;
        if (arg2 != -34) {
            method2530((byte) 114);
        }
        while (var6 <= var9) {
            int[] var7 = class23.field356[var6];
            var7[arg0] = var7[arg5] = arg1;
            var6++;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method2530(byte arg0) {
        if (arg0 != 0) {
            method2529(-17, 91, (byte) -1, 17, -87, -40);
        }
        field6282 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method2531(int arg0) {
        int var2 = -11 / ((-arg0 - 13) / 45);
        while (this.field6273 != null) {
            class115 var3 = this.field6273.field1600;
            this.field6273.method747(48);
            this.field6273 = var3;
        }
        field6262++;
        this.field6258 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBIZI)V")
    public static final void method2532(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field6280++;
        if (class441.field6563 == 0) {
            class530.method3131(false, 64);
        } else {
            class286.field4265 = class441.field6563;
            class310.method1995(true, 0);
        }
        class95.field1387 = arg4;
        if (arg1 > -104) {
            method2529(120, -105, (byte) -5, 94, 27, 5);
        }
        class458.field6730 = arg2;
        class304.field4475 = arg3;
        class135.method887(arg0);
    }
}
