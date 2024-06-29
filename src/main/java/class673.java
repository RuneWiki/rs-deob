import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class673 {

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "[Lpv;")
    public class65[] field9524 = new class65[8];

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "[I")
    public int[] field9520 = new int[3];

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "[Lag;")
    public class641[] field9522 = new class641[100];

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
    public int[] field9521 = new int[100];

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "Lgba;")
    public static class625 field9525 = null;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public int field9523;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9527;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field9526;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3765(int arg0) {
        field9527++;
        class319.field4368.method3255((byte) -114);
        if (arg0 != 100) {
            field9525 = null;
        }
        class249.field3451 = 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(FIBFF)F", line = 24)
    public static final float method3766(float arg0, int arg1, byte arg2, float arg3, float arg4) {
        field9529++;
        if (arg2 != 22) {
            field9525 = null;
        }
        float[] var5 = class78.field1227[arg1];
        return var5[2] * arg3 + var5[0] * arg0 + var5[1] * arg4;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 41)
    public static void method3767(byte arg0) {
        if (arg0 != 48) {
            field9525 = null;
        }
        field9525 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLjava/lang/String;)V", line = 66)
    public static final void method3768(byte arg0, String arg1) {
        field9528++;
        if (!class400.field5305 || (class658.field9093 & 0x18) == 0 || arg0 != -123) {
            return;
        }
        boolean var2 = false;
        int var3 = class664.field9426;
        int[] var4 = class55.field762;
        for (int var5 = 0; var5 < var3; var5++) {
            class403 var6 = class572.field7601[var4[var5]];
            if (var6.field5398 != null && var6.field5398.equalsIgnoreCase(arg1) && (class199.field2897 == var6 && (class658.field9093 & 0x10) != 0 || var6 != null && (class658.field9093 & 0x8) != 0)) {
                class611.field8078++;
                class402 var7 = class390.method2252(class137.field2219, -95, class262.field3644);
                var7.field5354.method2030(var4[var5], arg0 + 151);
                var7.field5354.method2021(1326408496, class522.field6979);
                var7.field5354.method2021(arg0 + 1326408619, class37.field563);
                var7.field5354.method1989((byte) -47, 0);
                var7.field5354.method1982(class255.field3536, (byte) 63);
                class36.method278(arg0 ^ 0xFFFFFF85, var7);
                var2 = true;
                class157.method1098(var6.method2317((byte) 40), true, 0, var6.method2317((byte) 40), var6.field5649[0], (byte) 105, var6.field5643[0], 0, -2);
                break;
            }
        }
        if (!var2) {
            class315.method1881(class72.field1085.method546(class516.field6892, (byte) -35) + arg1, 0, 4);
        }
        if (class400.field5305) {
            class671.method3761(1);
        }
    }
}
