import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class186 extends class120 {

    @OriginalMember(owner = "client!dca", name = "Ab", descriptor = "Lke;")
    public static class622 field2796 = new class622(3, -1);

    @OriginalMember(owner = "client!dca", name = "zb", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!dca", name = "Bb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!dca", name = "Cb", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZIBI)V")
    public static final void method1380(boolean arg0, int arg1, byte arg2, int arg3) {
        ++field2795;
        if (class622.field8773.method380((byte) -3, (long) arg1) == null) {
            if (!class60.field827) {
                class737.method4131(arg0, arg1, false);
            } else {
                class542 var4 = new class542(arg1, new class220(4096, class71.field967, arg1), arg3, arg0);
                var4.field7597.method4266(class752.field10428[class526.field7494], -18099);
                class622.field8773.method384((long) arg1, var4, false);
            }
        }
        if (arg2 < 90) {
            field2796 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
    public class186(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(FI)V")
    public final void method1381(float arg0, int arg1) {
        if (arg1 == 3) {
            ++field2797;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field1556[super.field1521++] = (byte) var3;
            super.field1556[super.field1521++] = (byte) (var3 >> 8);
            super.field1556[super.field1521++] = (byte) (var3 >> 16);
            super.field1556[super.field1521++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "(I)V")
    public static void method1382(int arg0) {
        field2796 = null;
        if (arg0 != -427312600) {
            method1380(false, 78, (byte) 97, -31);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BF)V")
    public final void method1383(byte arg0, float arg1) {
        ++field2798;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field1556[super.field1521++] = (byte) (var3 >> 24);
        super.field1556[super.field1521++] = (byte) (var3 >> 16);
        int var4 = 66 % ((-52 - arg0) / 61);
        super.field1556[super.field1521++] = (byte) (var3 >> 8);
        super.field1556[super.field1521++] = (byte) var3;
    }
}
