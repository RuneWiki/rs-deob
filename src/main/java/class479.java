import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class479 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Ljm;")
    public class630 field7032 = null;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Ljm;")
    public class630 field7033 = null;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Ljm;")
    public class630 field7035 = null;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[Lkp;")
    public class446[] field7034 = null;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "[Lkp;")
    public class446[] field7031 = null;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "Z")
    public boolean field7036;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field7037 = 0;

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lap;)V")
    public class479(class435 arg0) {
        this.field7036 = arg0.field6067;
        class250.method1435(arg0, 16);
        if (this.field7036) {
            byte[] var6 = class548.method3100(false, (byte) 92, class380.field4936);
            this.field7033 = new class630(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class548.method3100(false, (byte) 23, class264.field3333);
            this.field7032 = new class630(arg0, 6410, 128, 128, 16, var7, 6410);
            class445 var8 = arg0.field5929;
            if (var8.method2460((byte) -92)) {
                byte[] var9 = class548.method3100(false, (byte) 23, class211.field2559);
                this.field7035 = new class630(arg0, 6408, 128, 128, 16);
                class630 var10 = new class630(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2459(this.field7035, (byte) -93, 2.0F, var10)) {
                    this.field7035.method2229((byte) -100);
                } else {
                    this.field7035.method2228(-128);
                    this.field7035 = null;
                }
                var10.method2228(-113);
            }
        } else {
            this.field7034 = new class446[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class386.method2116(32768, class380.field4936, var2 * 256 * 128, (byte) -127);
                this.field7034[var2] = new class446(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field7031 = new class446[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class386.method2116(32768, class264.field3333, var3 * 128 * 128 * 2, (byte) 122);
                this.field7031[var3] = new class446(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
