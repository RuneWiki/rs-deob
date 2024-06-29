import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class300 {

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(JB)V")
    public static final void method1922(long arg0, byte arg1) {
        field4524++;
        if (class488.field7062 != null) {
            if (class639.field8978 == 1 || class639.field8978 == 5) {
                class121.method952(arg0, (byte) -30);
            } else if (class639.field8978 == 4) {
                class514.method3081(arg0, 93);
            }
        }
        class551.method3214((byte) -118, (long) class199.field3403, class364.field5573);
        if (class673.field9523 != -1) {
            class292.method1900(1592, class673.field9523);
        }
        for (int var3 = 0; var3 < class429.field6280; var3++) {
            if (class6.field66[var3]) {
                class376.field5666[var3] = true;
            }
            class580.field8207[var3] = class6.field66[var3];
            class6.field66[var3] = false;
        }
        class285.field4389 = class199.field3403;
        class373.method2371(null, 102, -1, -1);
        int var4 = -92 % ((arg1 - 52) / 51);
        class347.method2213(null, -1, true, -1);
        if (class673.field9523 != -1) {
            class429.field6280 = 0;
            class714.method3951((byte) -102);
        }
        class364.field5573.method374();
        class754.method4203(class364.field5573, false);
        int var5 = class451.method2769(9264);
        if (var5 == -1) {
            var5 = class618.field8708;
        }
        if (var5 == -1) {
            var5 = class472.field6844;
        }
        class106.method860(var5, true);
        int var6 = class145.field2251.method878(-5740) << 8;
        class70.method654(class145.field2251.field9475 + var6, (byte) -43, class145.field2251.field9470, class83.field1223, class145.field2251.field9477 + var6);
        class83.field1223 = 0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Liba;")
    public static final class302 method1923(int arg0) {
        field4528++;
        if (class729.field10210 == null || class660.field9393 == null) {
            return null;
        }
        class660.field9393.method447(class729.field10210, false);
        class302 var1 = (class302) class660.field9393.method444(126);
        if (var1 == null) {
            return null;
        }
        class277 var2 = class729.field10206.method2550(var1.field4601, -71);
        if (arg0 == -1) {
            return var2 != null && var2.field4210 && var2.method1813((byte) 67, class729.field10200) ? var1 : class368.method2354((byte) -16);
        } else {
            return null;
        }
    }
}
