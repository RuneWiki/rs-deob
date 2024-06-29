import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class91 {

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "Ljda;")
    public class91 field1311;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "Ljda;")
    public class91 field1313;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "[I")
    public static int[] field1312;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "[Lmq;")
    public static class85[] field1308;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Z)[Lfe;")
    public static final class345[] method777(boolean arg0) {
        field1317++;
        if (!arg0) {
            method779((byte) 106);
        }
        return new class345[] { class653.field9247, class494.field6785, class206.field3013 };
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method778(String arg0, int arg1, String arg2) {
        field1309++;
        class347.field4939 = -1;
        if (arg1 < 80) {
            field1308 = null;
        }
        class591.field8484 = 1;
        class563.method3279(false, arg2, arg0, -6864);
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(B)V")
    public static final void method779(byte arg0) {
        if (arg0 <= -20) {
            field1314++;
            class371 var1 = class490.method2867((byte) -127, 15, 0L);
            var1.method2215(4);
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public static void method780(int arg0) {
        field1308 = null;
        field1312 = null;
        if (arg0 != -16835) {
            field1308 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
    public final void method781(int arg0) {
        field1316++;
        if (this.field1311 == null) {
            return;
        }
        this.field1311.field1313 = this.field1313;
        if (arg0 == 5555) {
            this.field1313.field1311 = this.field1311;
            this.field1313 = null;
            this.field1311 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILfm;)V")
    public static final void method782(int arg0, class281 arg1) {
        if (arg0 != 4096) {
            field1312 = null;
        }
        field1315++;
        int var2 = arg1.field4099 - class594.field8494;
        int var3 = arg1.field4079 * 512 + arg1.method209(true) * 256;
        int var4 = arg1.field4070 * 512 + arg1.method209(true) * 256;
        arg1.field10347 += (var3 - arg1.field10347) / var2;
        arg1.field4144 = 0;
        arg1.field10350 += (var4 - arg1.field10350) / var2;
        if (arg1.field4042 == 0) {
            arg1.method1791(8192, (byte) -104);
        }
        if (arg1.field4042 == 1) {
            arg1.method1791(12288, (byte) 115);
        }
        if (arg1.field4042 == 2) {
            arg1.method1791(0, (byte) 102);
        }
        if (arg1.field4042 == 3) {
            arg1.method1791(4096, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)V")
    public static final void method783(int arg0, int arg1, int arg2) {
        if (arg0 >= 67) {
            class705.method3943(false, arg2, arg1);
            field1310++;
        }
    }
}
