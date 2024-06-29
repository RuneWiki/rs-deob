import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class718 {

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "[Law;")
    public class76[] field10091 = null;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Lgp;")
    public class49 field10087 = null;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "Lgp;")
    public class49 field10092 = null;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "[Law;")
    public class76[] field10090 = null;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "Lgp;")
    public class49 field10093 = null;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Z")
    public boolean field10085;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "[I")
    public static int[] field10088 = new int[14];

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIB)Lcq;", line = 6)
    public static final class468 method4078(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 6) {
            field10088 = null;
        }
        field10089++;
        class468 var4 = null;
        if (arg2 == 0) {
            var4 = class93.method734(class29.field284, class629.field8790, 8174);
            class304.field4318++;
        }
        if (arg2 == 1) {
            class365.field5263++;
            var4 = class93.method734(class29.field284, class524.field7487, 8174);
        }
        var4.field6839.method3704(true, class35.field371.method2474(82, (byte) 116) ? 1 : 0);
        var4.field6839.method3734(class361.field5224 + arg0, 501927912);
        var4.field6839.method3734(arg1 + class582.field8288, 501927912);
        class445.field6615 = arg1;
        class344.field4987 = arg0;
        class72.field1010 = false;
        class557.method3248((byte) -23);
        return var4;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V", line = 50)
    public static final void method4079(byte arg0) {
        field10086++;
        if (arg0 != -86) {
            field10088 = null;
        }
        class22.method118((byte) 123, 255, -1);
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lwh;)V", line = 87)
    public class718(class148 arg0) {
        this.field10085 = arg0.field2305;
        class25.method128(arg0, true);
        if (this.field10085) {
            byte[] var2 = class287.method1830(false, -1688, class595.field8438);
            this.field10092 = new class49(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class287.method1830(false, -1688, class454.field6694);
            this.field10087 = new class49(arg0, 6410, 128, 128, 16, var3, 6410);
            class309 var4 = arg0.field2169;
            if (var4.method1959(-31793)) {
                byte[] var5 = class287.method1830(false, -1688, class691.field9557);
                this.field10093 = new class49(arg0, 6408, 128, 128, 16);
                class49 var6 = new class49(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method1956(this.field10093, (byte) -10, var6, 2.0F)) {
                    this.field10093.method1358((byte) 117);
                } else {
                    this.field10093.method1351(92);
                    this.field10093 = null;
                }
                var6.method1351(77);
                return;
            }
        } else {
            this.field10091 = new class76[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class341.method2172(32768, var7 * 256 * 128, (byte) 76, class595.field8438);
                this.field10091[var7] = new class76(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field10090 = new class76[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class341.method2172(32768, var8 * 128 * 128 * 2, (byte) 116, class454.field6694);
                this.field10090[var8] = new class76(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)V", line = 79)
    public static void method4080(byte arg0) {
        int var1 = -46 / ((20 - arg0) / 62);
        field10088 = null;
    }
}
