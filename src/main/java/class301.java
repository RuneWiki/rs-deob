import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class301 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lew;")
    public class520 field4138 = null;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lew;")
    public class520 field4143 = null;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[Lkf;")
    public class268[] field4139 = null;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[Lkf;")
    public class268[] field4144 = null;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lew;")
    public class520 field4142 = null;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
    public boolean field4146;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lhk;)V", line = 74)
    public class301(class111 arg0) {
        this.field4146 = arg0.field1998;
        class576.method3322(arg0, true);
        if (this.field4146) {
            byte[] var2 = class734.method4075((byte) 121, class791.field10837, false);
            this.field4142 = new class520(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class734.method4075((byte) 123, class594.field8343, false);
            this.field4143 = new class520(arg0, 6410, 128, 128, 16, var3, 6410);
            class417 var4 = arg0.field1937;
            if (var4.method2456(true)) {
                byte[] var5 = class734.method4075((byte) 127, class249.field3509, false);
                this.field4138 = new class520(arg0, 6408, 128, 128, 16);
                class520 var6 = new class520(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method2458(this.field4138, 1, var6, 2.0F)) {
                    this.field4138.method119((byte) 71);
                } else {
                    this.field4138.method128((byte) 118);
                    this.field4138 = null;
                }
                var6.method128((byte) 118);
                return;
            }
        } else {
            this.field4139 = new class268[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class757.method4189(class791.field10837, var7 * 128 * 128 * 2, 32768, (byte) -10);
                this.field4139[var7] = new class268(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field4144 = new class268[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class757.method4189(class594.field8343, var8 * 128 * 128 * 2, 32768, (byte) -10);
                this.field4144[var8] = new class268(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBILkh;)V", line = 10)
    public static final void method1932(int arg0, byte arg1, int arg2, class17 arg3) {
        field4141++;
        int var4 = 46 % ((arg1 + 47) / 44);
        if (arg3 == null) {
            return;
        }
        if (arg3.field329 != null) {
            class255 var5 = new class255();
            var5.field3586 = arg3.field329;
            var5.field3583 = arg3;
            class76.method644(var5);
        }
        class342.field4609 = arg3.field372;
        class657.field9100 = arg3.field282;
        class220.field3234 = arg0;
        class340.field4584 = arg3.field357;
        class675.field9384 = true;
        class335.field4516 = arg3.field348;
        class448.field6148 = arg2;
        class783.field10758 = arg3.field355;
        class410.method2433(arg3, 14049);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)Z", line = 59)
    public static final boolean method1933(int arg0, byte arg1, int arg2) {
        if (arg1 <= 44) {
            field4140 = 70;
        }
        field4145++;
        return (arg2 & 0x800) != 0;
    }
}
