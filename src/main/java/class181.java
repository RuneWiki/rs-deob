import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class181 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
    public static boolean field3043 = true;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lul;")
    public static class51 field3044 = new class51(2);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V", line = 10)
    public static final void method1379(long arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        if (!class38.field572) {
            class288.field4590 += (float) arg0 * class349.field5549 / 40.0F;
            class83.field1331 += (float) arg0 * class131.field2257 / 40.0F;
        }
        int var3 = class159.field2814 + class218.field3632.field2036;
        int var4 = class249.field4043 + class218.field3632.field1985;
        field3046++;
        if (class53.field833 - var3 < -500 || class53.field833 - var3 > 500 || class139.field2556 - var4 < -500 || (class139.field2556 - var4) > 500) {
            class53.field833 = var3;
            class139.field2556 = var4;
        }
        if (class53.field833 != var3) {
            int var5 = var3 - class53.field833;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class53.field833 += var6;
        }
        if (class139.field2556 != var4) {
            int var7 = var4 - class139.field2556;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class139.field2556 += var8;
        }
        class33.method304(arg1 ^ 0x3CFD);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 113)
    public static void method1380(int arg0) {
        if (arg0 != 2333) {
            method1380(40);
        }
        field3044 = null;
    }
}
