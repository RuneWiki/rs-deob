import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class609 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lnh;")
    public class694 field8641 = null;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[Lwh;")
    public class133[] field8645 = null;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[Lwh;")
    public class133[] field8642 = null;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lnh;")
    public class694 field8647 = null;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lnh;")
    public class694 field8653 = null;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
    public boolean field8644;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lhga;")
    public static class158 field8648 = new class158(24, 8);

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Z")
    public static boolean field8649 = false;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field8650 = 0;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Leu;")
    public static class444 field8651 = new class444(8, 1);

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field8652 = 7000;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8643;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JB)V")
    public static final void method3543(long arg0, byte arg1) {
        field8646++;
        if (class454.field6818 != null) {
            if (class126.field2062 == 1 || class126.field2062 == 5) {
                class610.method3550(arg0, (byte) 91);
            } else if (class126.field2062 == 4) {
                class333.method2310(-1, arg0);
            }
        }
        class691.method3916(false, class627.field8857, (long) class562.field8084);
        if (class528.field7706 != -1) {
            class149.method1249(-55, class528.field7706);
        }
        int var3 = 0;
        if (arg1 != 58) {
            return;
        }
        while (var3 < class700.field9880) {
            if (class532.field7753[var3]) {
                class185.field3111[var3] = true;
            }
            class476.field7053[var3] = class532.field7753[var3];
            class532.field7753[var3] = false;
            var3++;
        }
        class581.field8274 = class562.field8084;
        if (class528.field7706 != -1) {
            class700.field9880 = 0;
            class34.method463((byte) 102);
        }
        class627.field8857.method281();
        class486.method2980(class627.field8857, 679);
        int var4 = class225.method1652((byte) -99);
        if (var4 == -1) {
            var4 = class250.field4003;
        }
        if (var4 == -1) {
            var4 = class459.field6864;
        }
        class217.method1624(arg1 ^ 0xFFFFFFB0, var4);
        int var5 = class567.field8141.method1841(arg1 ^ 0x5132) << 8;
        class54.method597(class567.field8141.field9695, (byte) 29, class567.field8141.field9696 + var5, class567.field8141.field9705 + var5, class116.field1805);
        class116.field1805 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method3544(int arg0) {
        field8648 = null;
        if (arg0 != -30615) {
            method3544(55);
        }
        field8651 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Z")
    public static final boolean method3545(int arg0, int arg1) {
        field8643++;
        if (arg0 != -29131) {
            method3543(89L, (byte) -64);
        }
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ler;)V")
    public class609(class92 arg0) {
        this.field8644 = arg0.field1424;
        class582.method3413(arg0, 6119);
        if (this.field8644) {
            byte[] var6 = class642.method3721(false, -1, class156.field2678);
            this.field8647 = new class694(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class642.method3721(false, -1, class229.field3675);
            this.field8641 = new class694(arg0, 6410, 128, 128, 16, var7, 6410);
            class562 var8 = arg0.field1329;
            if (var8.method3339(0)) {
                byte[] var9 = class642.method3721(false, -1, class374.field5846);
                this.field8653 = new class694(arg0, 6408, 128, 128, 16);
                class694 var10 = new class694(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3337(var10, 2.0F, 1, this.field8653)) {
                    this.field8653.method2508((byte) -10);
                } else {
                    this.field8653.method2513(-4);
                    this.field8653 = null;
                }
                var10.method2513(-4);
            }
        } else {
            this.field8642 = new class133[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class532.method3217(class156.field2678, -91, 32768, var2 * 128 * 256);
                this.field8642[var2] = new class133(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field8645 = new class133[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class532.method3217(class229.field3675, -97, 32768, var3 * 128 * 256);
                this.field8645[var3] = new class133(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
