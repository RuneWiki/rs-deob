import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class301 extends class615 {

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4199 = new BigInteger("eb51df29ed25ea9e1e3e44fb194556a04b5298b4f920fd5276f02b9629db03d9d951bcead868b60af74747a376e3154e1ad17095b8acd03ecb0f70c1653a03cb", 16);

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "Ldb;")
    public static class298 field4202 = new class298(44, -1);

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
    public static int field4203 = 0;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "Lbi;")
    public static class449 field4204;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "Lkga;")
    public static class511 field4201;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            ++field4200;
            int[] var3 = super.field8125.method298(arg0, -125);
            if (super.field8125.field579) {
                class83.method684(var3, 0, class505.field6740, class402.field5353[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V", line = 25)
    public class301() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V", line = 28)
    public static void method1831(boolean arg0) {
        field4199 = null;
        field4204 = null;
        if (arg0) {
            method1832(-123, -110);
        }
        field4202 = null;
        field4201 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)I", line = 43)
    public static final int method1832(int arg0, int arg1) {
        ++field4198;
        int var2 = 67 % ((37 - arg1) / 46);
        int var3 = 63 & arg0;
        int var4 = (arg0 & 236) >> 6;
        if (~var3 == -19) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || ~var3 == -22) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (~var4 == -3) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
