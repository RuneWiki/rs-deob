import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class114 extends class69 {

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field1375 = 0;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "[S")
    public static short[] field1386 = new short[] { 48, 25, 19, 52, 17, 49, 53, 2 };

    @OriginalMember(owner = "client!so", name = "j", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "Lsha;")
    public class115 field1376;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Lsha;")
    public class115 field1378;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "Ljava/lang/String;")
    public String field1381;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "Z")
    public boolean field1385;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "[I")
    public static int[] field1373;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field1384;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method819(int arg0) {
        if (arg0 == 2) {
            field1373 = null;
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IFFIF)F")
    public static final float method820(int arg0, float arg1, float arg2, int arg3, float arg4) {
        if (arg0 == 25) {
            field1371++;
            float[] var5 = class641.field9013[arg3];
            return var5[2] * arg4 + var5[0] * arg1 + var5[1] * arg2;
        } else {
            return -0.3361765F;
        }
    }
}
