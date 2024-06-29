import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class158 extends class79 {

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Lcb;")
    public class22 field3017 = new class22();

    @OriginalMember(owner = "client!re", name = "R", descriptor = "Lw;")
    public class198 field3029 = new class198();

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lse;")
    private class167 field3028;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Lsg;")
    public static class169 field3013 = class165.method1060("<img=1>", 1536);

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field3018 = 0;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Lsg;")
    public static class169 field3020 = class165.method1060("::noclip", 1536);

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lsg;")
    public static class169 field3016 = class165.method1060("Neuer Benutzer", 1536);

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lsg;")
    private static class169 field3022 = class165.method1060("Connection lost)3", 1536);

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lsg;")
    public static class169 field3026 = field3022;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "[S")
    public static short[] field3025 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!re", name = "T", descriptor = "[I")
    public static int[] field3031 = new int[50];

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "Lqf;")
    public static class150 field3019;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lha;")
    public static class65 field3027;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLke;Lke;Lke;)V")
    public static final void method1016(byte arg0, class95 arg1, class95 arg2, class95 arg3) {
        field3030++;
        class128.field2396 = arg3;
        if (arg0 > -1) {
            field3027 = null;
        }
        class200.field3905 = arg1;
        class172.field3323 = arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()Lig;")
    public final class79 method480() {
        field3012++;
        class202 var1 = (class202) this.field3017.method145(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3956 == null) {
            return this.method481();
        } else {
            return var1.field3956;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILwd;III[I)V")
    private final void method1017(int arg0, class202 arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field3015++;
        if ((this.field3028.field3225[arg1.field3949] & 0x4) != 0 && arg1.field3933 < 0) {
            int var7 = this.field3028.field3222[arg1.field3949] / class70.field1313;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3943) / var7;
                if (var8 > arg3) {
                    arg1.field3943 += arg3 * var7;
                    break;
                }
                arg1.field3956.method482(arg5, arg0, var8);
                arg3 -= var8;
                int var9 = 262144 / var7;
                arg1.field3943 += var7 * var8 - 1048576;
                int var10 = class70.field1313 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                arg0 += var8;
                class108 var11 = arg1.field3956;
                if (this.field3028.field3182[arg1.field3949] == 0) {
                    arg1.field3956 = class108.method666(arg1.field3935, var11.method637(), var11.method655(), var11.method633());
                } else {
                    arg1.field3956 = class108.method666(arg1.field3935, var11.method637(), 0, var11.method633());
                    this.field3028.method1094(arg1, arg1.field3940.field1564[arg1.field3947] < 0, (byte) 15);
                    arg1.field3956.method642(var10, var11.method655());
                }
                if (arg1.field3940.field1564[arg1.field3947] < 0) {
                    arg1.field3956.method651(-1);
                }
                var11.method647(var10);
                var11.method482(arg5, arg0, arg2 - arg0);
                if (var11.method644()) {
                    this.field3029.method1296(var11);
                }
            }
        }
        if (arg4 <= 70) {
            this.method486();
        }
        arg1.field3956.method482(arg5, arg0, arg3);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lwd;IB)V")
    private final void method1018(class202 arg0, int arg1, byte arg2) {
        field3014++;
        if ((this.field3028.field3225[arg0.field3949] & 0x4) != 0 && arg0.field3933 < 0) {
            int var4 = this.field3028.field3222[arg0.field3949] / class70.field1313;
            int var5 = (var4 + 1048575 - arg0.field3943) / var4;
            arg0.field3943 = arg0.field3943 + arg1 * var4 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field3028.field3182[arg0.field3949] == 0) {
                    arg0.field3956 = class108.method666(arg0.field3935, arg0.field3956.method637(), arg0.field3956.method655(), arg0.field3956.method633());
                } else {
                    arg0.field3956 = class108.method666(arg0.field3935, arg0.field3956.method637(), 0, arg0.field3956.method633());
                    this.field3028.method1094(arg0, arg0.field3940.field1564[arg0.field3947] < 0, (byte) 15);
                }
                if (arg0.field3940.field1564[arg0.field3947] < 0) {
                    arg0.field3956.method651(-1);
                }
                arg1 = arg0.field3943 / var4;
            }
        }
        arg0.field3956.method485(arg1);
        if (arg2 <= 10) {
            this.field3029 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
    public final int method486() {
        field3032++;
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public final void method485(int arg0) {
        this.field3029.method485(arg0);
        field3011++;
        for (class202 var2 = (class202) this.field3017.method145(0); var2 != null; var2 = (class202) this.field3017.method152((byte) -128)) {
            if (!this.field3028.method1082(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var2.field3953 >= var3) {
                        this.method1018(var2, var3, (byte) 82);
                        var2.field3953 -= var3;
                        break;
                    }
                    this.method1018(var2, var2.field3953, (byte) 34);
                    var3 -= var2.field3953;
                } while (!this.field3028.method1086(var3, var2, 0, null, (byte) 23));
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()Lig;")
    public final class79 method481() {
        field3023++;
        class202 var1;
        do {
            var1 = (class202) this.field3017.method152((byte) -126);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3956 == null);
        return var1.field3956;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        field3026 = null;
        field3016 = null;
        field3025 = null;
        field3013 = null;
        field3019 = null;
        field3031 = null;
        field3020 = null;
        field3027 = null;
        field3022 = null;
        if (arg0 != 61) {
            method1016((byte) -43, null, null, null);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
    public final void method482(int[] arg0, int arg1, int arg2) {
        field3021++;
        this.field3029.method482(arg0, arg1, arg2);
        for (class202 var4 = (class202) this.field3017.method145(0); var4 != null; var4 = (class202) this.field3017.method152((byte) -128)) {
            if (!this.field3028.method1082(var4, 0)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3953) {
                        this.method1017(var5, var4, var5 + var6, var6, 91, arg0);
                        var4.field3953 -= var6;
                        break;
                    }
                    this.method1017(var5, var4, var5 + var6, var4.field3953, 119, arg0);
                    var5 += var4.field3953;
                    var6 -= var4.field3953;
                } while (!this.field3028.method1086(var6, var4, var5, arg0, (byte) 23));
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lse;)V")
    public class158(class167 arg0) {
        this.field3028 = arg0;
    }
}
