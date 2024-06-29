import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class490 extends class28 {

    @OriginalMember(owner = "client!is", name = "n", descriptor = "J")
    public long field6607;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "Lfo;")
    public static class417 field6606 = new class417();

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "[S")
    public static short[] field6605;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([[BILm;)V")
    public static final void method2722(byte[][] arg0, int arg1, class110 arg2) {
        field6603++;
        int var3 = class681.field9677.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class339.field4957[var4] >> 8) * 64 - class253.field3490;
                int var7 = (class339.field4957[var4] & 0xFF) * 64 - class186.field2280;
                class155.method1031(-64);
                arg2.method588(class624.field8489, var7, class9.field103, (byte) 47, var6, var5);
            }
        }
        if (arg1 >= -53) {
            method2724(70, 27, 87, -92, 18);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public static void method2723(int arg0) {
        field6605 = null;
        field6606 = null;
        if (arg0 != 41447496) {
            method2724(107, -91, -113, 2, -27);
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
    public class490() {
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(J)V")
    public class490(long arg0) {
        this.field6607 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIII)V")
    public static final void method2724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class398.field5676 <= arg1 - arg2 && (arg1 + arg2) <= class298.field3995 && class609.field8313 <= (arg4 - arg2) && class19.field169 >= (arg2 + arg4)) {
            class285.method1709(arg0, arg1, arg2, -111, arg4);
        } else {
            class114.method637(arg0, arg4, arg2, arg1, 6);
        }
        int var5 = -107 % ((arg3 - 91) / 35);
        field6604++;
    }
}
