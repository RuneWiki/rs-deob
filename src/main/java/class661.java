import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class661 {

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field9433 = 0;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "Ldh;")
    public static class320 field9429 = new class320(70, 2);

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "[F")
    public static float[] field9434 = new float[2];

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field9436 = 0;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method3763(int arg0, int arg1, Random arg2) {
        field9431++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class560.method3273(arg1 ^ 0xFFFF84E7, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            if (arg1 != 30356) {
                method3764((byte) 101);
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class747.method4151(-115595585, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public static void method3764(byte arg0) {
        field9429 = null;
        field9434 = null;
        if (arg0 > -8) {
            method3763(-5, 5, null);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)V")
    public static final void method3765(int arg0, byte arg1, int arg2) {
        class415.field5687 = arg0;
        class627.field9011 = arg2;
        if (arg1 >= -34) {
            field9434 = null;
        }
        field9430++;
        if (class3.field27 == 0) {
            class2.field9 = class627.field9011 + (class485.field6895 * 2);
            class233.field2723 = class415.field5687 + (class200.field2367 * 2);
        } else if (class3.field27 == 1) {
            class486.field6971 = class627.field9011 / class541.field7787 - (-class459.field6559 - 2);
            class712.field10031 = class415.field5687 / class125.field1313 + class603.field8573 + 2;
            class233.field2723 = class712.field10031 * class125.field1313;
            class2.field9 = class541.field7787 * class486.field6971;
            class485.field6895 = class2.field9 - class627.field9011 >> 1;
            class200.field2367 = class233.field2723 - class415.field5687 >> 1;
            return;
        } else if (class3.field27 == 2) {
            class233.field2723 = class415.field5687;
            class2.field9 = class627.field9011;
            return;
        }
    }
}
