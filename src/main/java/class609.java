import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class609 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[Lwaa;")
    public class646[] field8465 = null;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lrb;")
    public class321 field8464 = null;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[Lwaa;")
    public class646[] field8461 = null;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lrb;")
    public class321 field8468 = null;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lrb;")
    public class321 field8466 = null;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Z")
    public boolean field8462;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Luc;")
    public static class27 field8467 = new class27(83, 3);

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field8471 = 0;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lpj;")
    public static class132 field8470;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lqk;")
    public static class16 field8469;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lxa;")
    public static class461 field8472;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 7)
    public static final void method3367(int arg0) {
        field8460++;
        if (arg0 != 128) {
            method3369((byte) -54, 48);
        }
        class594.field8264.method2060(0);
        class412.field5837.method3616(-129);
        class190.field2803.method3616(arg0 - 257);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 22)
    public static void method3368(int arg0) {
        if (arg0 == 16) {
            field8467 = null;
            field8469 = null;
            field8472 = null;
            field8470 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method3369(byte arg0, int arg1) {
        if (arg0 <= 124) {
            field8471 = 56;
        }
        for (class539 var2 = class422.field5960.method2066(false); var2 != null; var2 = class422.field5960.method2062(-19704)) {
            if (((long) arg1) == (var2.field7311 >> 48 & 0xFFFFL)) {
                var2.method2971(1);
            }
        }
        field8463++;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Len;)V", line = 81)
    public class609(class289 arg0) {
        this.field8462 = arg0.field4346;
        class122.method867(arg0, (byte) -71);
        if (this.field8462) {
            byte[] var2 = class116.method852(class383.field5369, false, false);
            this.field8468 = new class321(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class116.method852(class344.field4975, false, false);
            this.field8466 = new class321(arg0, 6410, 128, 128, 16, var3, 6410);
            class220 var4 = arg0.field4220;
            if (var4.method1418(79)) {
                byte[] var5 = class116.method852(class627.field8740, false, false);
                this.field8464 = new class321(arg0, 6408, 128, 128, 16);
                class321 var6 = new class321(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1420(2.0F, (byte) 124, this.field8464, var6)) {
                    this.field8464.method3287(-10286);
                } else {
                    this.field8464.method3292(0);
                    this.field8464 = null;
                }
                var6.method3292(0);
                return;
            }
        } else {
            this.field8465 = new class646[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class547.method3007(32768, class383.field5369, (byte) 22, var7 * 128 * 2 * 128);
                this.field8465[var7] = new class646(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field8461 = new class646[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class547.method3007(32768, class344.field4975, (byte) 127, var8 * 128 * 128 * 2);
                this.field8461[var8] = new class646(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
