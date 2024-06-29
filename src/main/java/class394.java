import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class394 extends class130 {

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    private int field5741;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public int field5739;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    private int field5746;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    private int field5740;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "I")
    public int field5753;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    public int field5752;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    private int field5750;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    private int field5748;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public int field5737;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "[Ldv;")
    public static class508[] field5742 = new class508[16];

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "[[Lfi;")
    public static class38[][] field5749;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILfi;)Ljava/lang/String;")
    public static final String method2475(int arg0, class38 arg1) {
        field5754++;
        if (client.method3078(arg1).method797(-89) == 0) {
            return null;
        } else if (arg1.field561 == null || arg1.field561.trim().length() == 0) {
            return class267.field4246 ? "Hidden-use" : null;
        } else {
            int var2 = 32 / ((44 - arg0) / 33);
            return arg1.field561;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lfh;I)V")
    public static final void method2476(class194 arg0, int arg1) {
        field5747++;
        int var2 = arg0.method1340(-98);
        class147.field2187 = new class330[var2];
        int var3 = 0;
        int var4 = 38 % ((71 - arg1) / 53);
        while (var3 < var2) {
            class147.field2187[var3] = new class330();
            class147.field2187[var3].field4980 = arg0.method1340(-86);
            class147.field2187[var3].field4981 = arg0.method1399((byte) 100);
            var3++;
        }
        class358.field5297 = arg0.method1340(-62);
        class472.field6933 = arg0.method1340(-108);
        class275.field4311 = arg0.method1340(-112);
        class247.field3701 = new class424[class472.field6933 + 1 - class358.field5297];
        for (int var5 = 0; var5 < class275.field4311; var5++) {
            int var6 = arg0.method1340(-74);
            class424 var7 = class247.field3701[var6] = new class424();
            var7.field2202 = arg0.method1337((byte) -112);
            var7.field2198 = arg0.method1401(-107);
            var7.field6227 = class358.field5297 + var6;
            var7.field6230 = arg0.method1399((byte) 124);
            var7.field6223 = arg0.method1399((byte) 87);
        }
        class150.field2247 = arg0.method1401(123);
        class93.field1494 = true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public static final void method2477(int arg0, int arg1, int arg2) {
        field5745++;
        if (arg2 == -23862) {
            class188 var3 = class10.method48((byte) 74, 7, arg1);
            var3.method1308(false);
            var3.field2873 = arg0;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I[III)V")
    public final void method2478(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = this.field5737 + arg3 - this.field5740;
        arg1[arg0] = 0;
        field5744++;
        arg1[2] = this.field5753 + arg2 - this.field5746;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method2479(int arg0) {
        field5749 = null;
        if (arg0 != -9658) {
            method2477(0, -88, 102);
        }
        field5742 = null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(III)Z")
    public final boolean method2480(int arg0, int arg1, int arg2) {
        field5743++;
        if (arg0 != 32257) {
            this.field5750 = -34;
        }
        return arg1 >= this.field5740 && arg1 <= this.field5741 && arg2 >= this.field5746 && arg2 <= this.field5750;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2481(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -54) {
            this.field5737 = 63;
        }
        field5738++;
        return this.field5748 == arg2 && arg0 >= this.field5740 && arg0 <= this.field5741 && arg1 >= this.field5746 && this.field5750 >= arg1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I[III)V")
    public final void method2482(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = this.field5748;
        field5756++;
        arg1[1] = arg2 - (this.field5737 - this.field5740);
        arg1[2] = this.field5746 + arg0 - this.field5753;
        if (arg3 != 5072) {
            method2484(null, (byte) -33, null);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZII)Z")
    public final boolean method2483(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method2477(-107, -88, 40);
        }
        field5755++;
        return arg1 >= this.field5737 && arg1 <= this.field5739 && arg2 >= this.field5753 && arg2 <= this.field5752;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lum;BLum;)I")
    public static final int method2484(class83 arg0, byte arg1, class83 arg2) {
        field5751++;
        int var3 = 0;
        if (arg2.method739((byte) -66, class294.field4539)) {
            var3++;
        }
        if (arg2.method739((byte) -80, class380.field5596)) {
            var3++;
        }
        if (arg1 > -118) {
            return -29;
        }
        if (arg2.method739((byte) -92, class53.field821)) {
            var3++;
        }
        if (arg0.method739((byte) -82, class294.field4539)) {
            var3++;
        }
        if (arg0.method739((byte) -115, class380.field5596)) {
            var3++;
        }
        if (arg0.method739((byte) -45, class53.field821)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5741 = arg3;
        this.field5739 = arg7;
        this.field5746 = arg2;
        this.field5740 = arg1;
        this.field5753 = arg6;
        this.field5752 = arg8;
        this.field5750 = arg4;
        this.field5748 = arg0;
        this.field5737 = arg5;
    }
}
