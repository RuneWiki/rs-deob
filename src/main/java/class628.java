import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class628 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Lpfa;")
    public class268 field8998 = null;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Lpfa;")
    public class268 field9001 = null;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "[Lsaa;")
    public class298[] field9004 = null;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "[Lsaa;")
    public class298[] field9003 = null;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Lpfa;")
    public class268 field9006 = null;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "Z")
    public boolean field9008;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "[Lwt;")
    public static class282[] field9002 = new class282[14];

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field9000 = 0;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Lgfa;")
    public static class696 field8999 = new class696(2, 4, 4, 0);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "[J")
    public static long[] field9005;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)Z")
    public static final boolean method3606(byte arg0, int arg1) {
        if (arg0 >= -88) {
            method3606((byte) 20, 114);
        }
        field9007++;
        return arg1 == 7 || arg1 == 9;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public static final void method3607(int arg0) {
        field8997++;
        int var1 = (int) ((double) class473.field6604 * 34.46D);
        int var2 = var1 << 2;
        if (arg0 <= 95) {
            field8999 = null;
        }
        if (class68.field1045.method318()) {
            var2 += 512;
        }
        class68.field1045.method297(200, var2);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
    public static void method3608(boolean arg0) {
        field9005 = null;
        field8999 = null;
        field9002 = null;
        if (!arg0) {
            field8999 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lkga;)V")
    public class628(class506 arg0) {
        this.field9008 = arg0.field7349;
        class512.method3037((byte) 64, arg0);
        if (this.field9008) {
            byte[] var6 = class589.method3422(class188.field2291, true, false);
            this.field8998 = new class268(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class589.method3422(class124.field1597, true, false);
            this.field9001 = new class268(arg0, 6410, 128, 128, 16, var7, 6410);
            class592 var8 = arg0.field7263;
            if (var8.method3432(28261)) {
                byte[] var9 = class589.method3422(class226.field2927, true, false);
                this.field9006 = new class268(arg0, 6408, 128, 128, 16);
                class268 var10 = new class268(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3431(2.0F, (byte) -97, var10, this.field9006)) {
                    this.field9006.method1202(-32177);
                } else {
                    this.field9006.method1204(-1);
                    this.field9006 = null;
                }
                var10.method1204(-1);
            }
        } else {
            this.field9004 = new class298[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class270.method1626(var2 * 128 * 256, class188.field2291, -1, 32768);
                this.field9004[var2] = new class298(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field9003 = new class298[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class270.method1626(var3 * 128 * 2 * 128, class124.field1597, -1, 32768);
                this.field9003[var3] = new class298(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
