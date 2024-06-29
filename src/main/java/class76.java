import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class76 {

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public int field1276 = -1;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public int field1280 = -1;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Z")
    public static boolean field1278 = false;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1281 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1279;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
    public int[] field1274;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[Lqd;")
    public static class3[] field1272;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lf;ZII)V")
    private final void method601(class37 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field1280 = arg0.method293(115);
        } else if (arg3 == 2) {
            this.field1274 = new int[arg0.method333((byte) -59)];
            for (int var5 = 0; var5 < this.field1274.length; var5++) {
                this.field1274[var5] = arg0.method293(-96);
            }
        } else if (arg3 == 3) {
            this.field1276 = arg0.method333((byte) -59);
        }
        field1282++;
        if (arg1) {
            method603((byte) -118);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLf;I)V")
    public final void method602(boolean arg0, class37 arg1, int arg2) {
        field1277++;
        while (true) {
            int var4 = arg1.method333((byte) -59);
            if (var4 == 0) {
                if (arg0) {
                    this.field1280 = -11;
                    return;
                } else {
                    return;
                }
            }
            this.method601(arg1, arg0, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method603(byte arg0) {
        field1272 = null;
        if (arg0 == -71) {
            field1279 = null;
            field1281 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[B)I")
    public static final int method604(int arg0, int arg1, byte[] arg2) {
        field1273++;
        if (arg1 != 0) {
            field1281 = null;
        }
        return class80.method631(arg0, arg1 - 54, 0, arg2);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    public static int method605(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
