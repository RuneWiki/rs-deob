import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class311 {

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "[Laaa;")
    public class616[] field4203 = null;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "[Laaa;")
    public class616[] field4206 = null;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "Lqj;")
    public class510 field4204 = null;

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "Lqj;")
    public class510 field4208 = null;

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "Lqj;")
    public class510 field4205 = null;

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "Z")
    public boolean field4207;

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lac;)V", line = 41)
    public class311(class541 arg0) {
        this.field4207 = arg0.field7645;
        class480.method2694(true, arg0);
        if (this.field4207) {
            byte[] var2 = class688.method3894(false, class171.field2135, false);
            this.field4205 = new class510(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class688.method3894(false, class707.field9897, false);
            this.field4208 = new class510(arg0, 6410, 128, 128, 16, var3, 6410);
            class104 var4 = arg0.field7533;
            if (var4.method710(true)) {
                byte[] var5 = class688.method3894(false, class106.field1415, false);
                this.field4204 = new class510(arg0, 6408, 128, 128, 16);
                class510 var6 = new class510(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method711(0, var6, 2.0F, this.field4204)) {
                    this.field4204.method1257(35);
                } else {
                    this.field4204.method1261(true);
                    this.field4204 = null;
                }
                var6.method1261(true);
                return;
            }
        } else {
            this.field4206 = new class616[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class12.method45(2, 32768, var7 * 128 * 128 * 2, class171.field2135);
                this.field4206[var7] = new class616(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field4203 = new class616[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class12.method45(2, 32768, var8 * 16384 * 2, class707.field9897);
                this.field4203[var8] = new class616(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILtm;Ltm;)V", line = 19)
    public static final void method1869(int arg0, class392 arg1, class392 arg2) {
        if (arg2.field5560 != null) {
            arg2.method2287((byte) -90);
        }
        if (arg0 < 32) {
            return;
        }
        field4209++;
        arg2.field5555 = arg1;
        arg2.field5560 = arg1.field5560;
        arg2.field5560.field5555 = arg2;
        arg2.field5555.field5560 = arg2;
    }
}
