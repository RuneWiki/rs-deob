import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class232 {

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3540 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3541 = -1;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 7)
    public static void method1676(int arg0) {
        if (arg0 > -32) {
            field3541 = -34;
        }
        field3540 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)V", line = 22)
    public static final void method1677(byte arg0, int arg1, int arg2) {
        field3535++;
        class93.field1518[arg1] = arg2;
        class173 var3 = (class173) class16.field332.method79((long) arg1, (byte) 0);
        if (arg0 != -94) {
            method1678(-44, -113, -78, (byte) 3);
        }
        if (var3 == null) {
            class173 var4 = new class173(4611686018427387905L);
            class16.field332.method75(var4, -1, (long) arg1);
        } else if (var3.field2771 != 4611686018427387905L) {
            var3.field2771 = class212.method1543(arg0 ^ 0xFFFFA894) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIB)I", line = 48)
    public static final int method1678(int arg0, int arg1, int arg2, byte arg3) {
        field3536++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else {
            if (arg3 != 26) {
                method1676(-58);
            }
            return var4 == 2 ? 1023 - arg2 : 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)I", line = 75)
    public static final int method1679(int arg0, int arg1, byte arg2) {
        field3537++;
        if (arg2 <= 85) {
            return -21;
        } else {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg1 - var3;
        }
    }
}
