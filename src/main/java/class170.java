import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class170 {

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lpj;")
    public class679 field2404 = null;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[Laaa;")
    public class227[] field2399 = null;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lpj;")
    public class679 field2400 = null;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lpj;")
    public class679 field2405 = null;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[Laaa;")
    public class227[] field2406 = null;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Z")
    public boolean field2403;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lr;")
    public static class98 field2401;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Luca;)V", line = 63)
    public class170(class287 arg0) {
        this.field2403 = arg0.field4168;
        class112.method841((byte) -114, arg0);
        if (this.field2403) {
            byte[] var2 = class360.method2217(false, -362969972, class28.field493);
            this.field2405 = new class679(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class360.method2217(false, -362969972, class520.field7301);
            this.field2400 = new class679(arg0, 6410, 128, 128, 16, var3, 6410);
            class117 var4 = arg0.field4021;
            if (var4.method866(true)) {
                byte[] var5 = class360.method2217(false, -362969972, class91.field1394);
                this.field2404 = new class679(arg0, 6408, 128, 128, 16);
                class679 var6 = new class679(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method864(var6, this.field2404, (byte) 16, 2.0F)) {
                    this.field2404.method2926((byte) -65);
                } else {
                    this.field2404.method2922(0);
                    this.field2404 = null;
                }
                var6.method2922(0);
                return;
            }
        } else {
            this.field2406 = new class227[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class135.method962(false, 32768, var7 * 128 * 2 * 128, class28.field493);
                this.field2406[var7] = new class227(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field2399 = new class227[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class135.method962(false, 32768, var8 * 128 * 256, class520.field7301);
                this.field2399[var8] = new class227(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 13)
    public static void method1183(byte arg0) {
        if (arg0 != 58) {
            method1184((byte) -57);
        }
        field2401 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I", line = 23)
    public static final int method1184(byte arg0) {
        if (arg0 <= 40) {
            method1184((byte) 9);
        }
        field2402++;
        if ((double) class55.field842 == 3.0D) {
            return 37;
        } else if ((double) class55.field842 == 4.0D) {
            return 50;
        } else if ((double) class55.field842 == 6.0D) {
            return 75;
        } else if ((double) class55.field842 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }
}
