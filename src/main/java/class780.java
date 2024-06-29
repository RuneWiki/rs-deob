import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class780 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lui;")
    public class554 field10719 = null;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[Lrq;")
    public class470[] field10718 = null;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lui;")
    public class554 field10720 = null;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[Lrq;")
    public class470[] field10721 = null;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lui;")
    public class554 field10725 = null;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
    public boolean field10723;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
    public static boolean field10724 = false;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lpq;)V", line = 78)
    public class780(class194 arg0) {
        this.field10723 = arg0.field2698;
        class75.method550((byte) -111, arg0);
        if (this.field10723) {
            byte[] var6 = class410.method2503(class61.field699, 5, false);
            this.field10720 = new class554(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class410.method2503(class341.field4950, 5, false);
            this.field10725 = new class554(arg0, 6410, 128, 128, 16, var7, 6410);
            class627 var8 = arg0.field2613;
            if (var8.method3609(35632)) {
                byte[] var9 = class410.method2503(class770.field10598, 5, false);
                this.field10719 = new class554(arg0, 6408, 128, 128, 16);
                class554 var10 = new class554(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3608(2.0F, var10, -124, this.field10719)) {
                    this.field10719.method3202((byte) -83);
                } else {
                    this.field10719.method3206(false);
                    this.field10719 = null;
                }
                var10.method3206(false);
            }
        } else {
            this.field10718 = new class470[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class10.method28(class61.field699, 32768, (byte) 125, var2 * 128 * 2 * 128);
                this.field10718[var2] = new class470(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field10721 = new class470[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class10.method28(class341.field4950, 32768, (byte) 74, var3 * 128 * 2 * 128);
                this.field10721[var3] = new class470(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 25)
    public static final void method4295(int arg0) {
        for (class154 var1 = (class154) class580.field8153.method3098(0); var1 != null; var1 = (class154) class580.field8153.method3098(0)) {
            class416.method2523(var1, (byte) 17);
        }
        field10722++;
        if (arg0 < 50) {
            return;
        }
        int var2;
        int var3;
        if (class688.field9602.field8542.method1756((byte) -98) == 1) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class464.field6471;
            var3 = class464.field6471;
        }
        client.method794();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method782();
            client.method770(var4);
            client.method790(var4);
        }
        client.method775();
        client.method772();
    }
}
