import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class607 extends class696 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lus;")
    public static class328 field8419 = new class328(43, -1);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field8420 = 0;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lus;")
    public static class328 field8422 = new class328(1, 2);

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lus;")
    public static class328 field8427 = new class328(14, 4);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "J")
    public static long field8426;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lmb;")
    public class410 field8417;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Z")
    public boolean field8418;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[Lfda;")
    public class678[] field8425;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 3)
    public static void method3329(byte arg0) {
        int var1 = -93 % ((arg0 - 17) / 50);
        field8422 = null;
        field8419 = null;
        field8427 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILha;)Z", line = 17)
    public final boolean method3330(int arg0, int arg1, int arg2, class454 arg3) {
        field8423++;
        int var5 = this.field8417.method789(127);
        if (this.field8425 != null) {
            for (int var6 = 0; var6 < this.field8425.length; var6++) {
                this.field8425[var6].field9206 <<= var5;
                if (this.field8425[var6].method3642(arg0, arg1) && this.field8417.method512(arg0, arg1, (byte) -4, arg3)) {
                    this.field8425[var6].field9206 >>= var5;
                    return true;
                }
                this.field8425[var6].field9206 >>= var5;
            }
        }
        if (arg2 >= -88) {
            field8420 = 84;
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lkba;BI)V", line = 61)
    public static final void method3331(class24 arg0, byte arg1, int arg2) {
        if (arg1 != -7) {
            return;
        }
        field8424++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field339 > class266.field3368) {
            class636.method3454(arg0, 512);
        } else if (class266.field3368 > arg0.field355) {
            class572.method3216(false, (byte) -97, arg0);
            var4 = class213.field2712;
            var3 = class363.field5163;
        } else {
            class281.method1684(arg0, arg1 - 84);
        }
        if (arg0.field5790 < 512 || arg0.field5784 < 512 || class613.field8591 * 512 - 512 <= arg0.field5790 || class1.field3 * 512 - 512 <= arg0.field5784) {
            arg0.field408 = null;
            arg0.field339 = 0;
            var4 = 0;
            arg0.field376 = -1;
            var3 = -1;
            arg0.field395 = -1;
            arg0.field367 = -1;
            arg0.field355 = 0;
            arg0.field5790 = arg0.field435[0] * 512 + arg0.method253((byte) -27) * 256;
            arg0.field5784 = arg0.field426[0] * 512 + arg0.method253((byte) -27) * 256;
            arg0.method248(arg1 + 7);
        }
        if (class339.field4374 == arg0 && (arg0.field5790 < 6144 || arg0.field5784 < 6144 || (class613.field8591 - 12) * 512 <= arg0.field5790 || (class1.field3 * 512 - 6144) <= arg0.field5784)) {
            arg0.field395 = -1;
            arg0.field408 = null;
            var4 = 0;
            var3 = -1;
            arg0.field355 = 0;
            arg0.field339 = 0;
            arg0.field376 = -1;
            arg0.field367 = -1;
            arg0.field5790 = arg0.field435[0] * 512 + arg0.method253((byte) -27) * 256;
            arg0.field5784 = arg0.field426[0] * 512 + arg0.method253((byte) -27) * 256;
            arg0.method248(arg1 + 7);
        }
        int var5 = class515.method2957(arg0, (byte) 115);
        class427.method2534(25342, arg0);
        class92.method635(var3, var4, var5, (byte) -11, arg0);
        class612.method3347(var3, arg0, -104);
        class204.method1262(arg1 - 110, arg0);
    }
}
