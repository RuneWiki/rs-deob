import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class333 {

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Ljava/lang/String;")
    private String field4933 = "null";

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "J")
    public static long field4942;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "C")
    public char field4927;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "C")
    public char field4930;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "Lhl;")
    private class375 field4934;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Lhl;")
    public class375 field4937;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "[I")
    public static int[] field4938;

    static {
        new class44(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field4942 = 0L;
        field4936 = 100;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)Z", line = 4)
    public final boolean method2109(byte arg0, int arg1) {
        field4940++;
        if (this.field4937 == null) {
            return false;
        }
        if (arg0 != 54) {
            method2111(114, null, 14, null, -50, 70, null, null);
        }
        if (this.field4934 == null) {
            this.method2119(-2);
        }
        class175 var3 = (class175) this.field4934.method2284(true, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 28)
    public final boolean method2110(int arg0, String arg1) {
        field4935++;
        if (this.field4937 == null) {
            return false;
        }
        if (this.field4934 == null) {
            this.method2112(8456);
        }
        for (class276 var3 = (class276) this.field4934.method2284(true, class258.method1663(arg1, arg0 + 16442)); var3 != null; var3 = (class276) this.field4934.method2290((byte) -120)) {
            if (var3.field4120.equals(arg1)) {
                return true;
            }
        }
        return arg0 == -23009 ? false : false;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILrg;ILqa;IILau;Ljk;)V", line = 56)
    public static final void method2111(int arg0, class463 arg1, int arg2, class167 arg3, int arg4, int arg5, class528 arg6, class456 arg7) {
        field4939++;
        int var8 = arg6.field7717 - arg2 / 2 - 5;
        int var9 = arg4 + 2;
        if (arg1.field6690 != arg5) {
            arg3.method1193(1, var9, var8, arg2 + 10, arg7.method2710() * arg0 + -var9 - -1 + arg4, arg1.field6690);
        }
        if (arg1.field6693 != 0) {
            arg3.method1200(true, var9, var8, arg1.field6693, arg2 + 10, -var9 + arg4 + arg0 * arg7.method2710() + 1);
        }
        int var10 = arg1.field6721;
        if (arg6.field7724 && arg1.field6726 != -1) {
            var10 = arg1.field6726;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class230.field3448[var11];
            if ((arg0 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method2709(arg3, var12, arg6.field7717, arg4, var10, true);
            arg4 += arg7.method2710();
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 97)
    private final void method2112(int arg0) {
        this.field4934 = new class375(this.field4937.method2289((byte) -47));
        field4943++;
        if (arg0 != 8456) {
            this.method2109((byte) 21, 66);
        }
        for (class163 var2 = (class163) this.field4937.method2285(33); var2 != null; var2 = (class163) this.field4937.method2283((byte) 11)) {
            class276 var3 = new class276(var2.field2461, (int) var2.field863);
            this.field4934.method2292(class258.method1663(var2.field2461, arg0 - 15023), var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILwn;)V", line = 119)
    private final void method2113(int arg0, int arg1, class519 arg2) {
        field4931++;
        int var4 = 97 % ((arg1 - 89) / 32);
        if (arg0 == 1) {
            this.field4930 = class221.method1501(arg2.method3034((byte) 76), -23667);
        } else if (arg0 == 2) {
            this.field4927 = class221.method1501(arg2.method3034((byte) 79), -23667);
        } else if (arg0 == 3) {
            this.field4933 = arg2.method3082((byte) 62);
        } else if (arg0 == 4) {
            this.field4928 = arg2.method3053(-129);
        } else if (arg0 == 5 || arg0 == 6) {
            int var5 = arg2.method3018(566990904);
            this.field4937 = new class375(class487.method2869(1366891568, var5));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method3053(-129);
                class42 var8;
                if (arg0 == 5) {
                    var8 = new class163(arg2.method3082((byte) 75));
                } else {
                    var8 = new class175(arg2.method3053(-129));
                }
                this.field4937.method2292((long) var7, var8, (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(BI)Ljava/lang/String;", line = 172)
    public final String method2114(byte arg0, int arg1) {
        field4932++;
        if (this.field4937 == null) {
            return this.field4933;
        }
        if (arg0 > -76) {
            field4938 = null;
        }
        class163 var3 = (class163) this.field4937.method2284(true, (long) arg1);
        return var3 == null ? this.field4933 : var3.field2461;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 192)
    public static void method2115(byte arg0) {
        if (arg0 != -48) {
            field4938 = null;
        }
        field4938 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ltf;Ltf;I)V", line = 203)
    public static final void method2116(class198 arg0, class198 arg1, int arg2) {
        class92.field1472++;
        class228.method1528(true, class215.field3237);
        field4929++;
        class276.field4124.method3019(arg1.field3016, 11648);
        class276.field4124.method3029(arg2 ^ 0x2E, arg1.field2969);
        class276.field4124.method3019(arg0.field3016, arg2 + 11649);
        class276.field4124.method3068((byte) 57, arg0.field2952);
        class276.field4124.method3029(arg2 ^ 0xFFFFFFA0, arg0.field2969);
        class276.field4124.method3045(3, arg1.field2952);
        if (arg2 != -1) {
            field4936 = -106;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)I", line = 223)
    public final int method2117(int arg0, byte arg1) {
        field4944++;
        if (this.field4937 == null) {
            return this.field4928;
        }
        class175 var3 = (class175) this.field4937.method2284(true, (long) arg0);
        if (arg1 != 98) {
            this.field4934 = null;
        }
        return var3 == null ? this.field4928 : var3.field2612;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lwn;B)V", line = 256)
    public final void method2118(class519 arg0, byte arg1) {
        int var3 = -102 % ((arg1 + 45) / 34);
        while (true) {
            int var4 = arg0.method3072((byte) -119);
            if (var4 == 0) {
                field4941++;
                return;
            }
            this.method2113(var4, 24, arg0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 289)
    private final void method2119(int arg0) {
        this.field4934 = new class375(this.field4937.method2289((byte) -47));
        field4926++;
        for (class175 var2 = (class175) this.field4937.method2285(92); var2 != null; var2 = (class175) this.field4937.method2283((byte) 11)) {
            class175 var3 = new class175((int) var2.field863);
            this.field4934.method2292((long) var2.field2612, var3, (byte) -127);
        }
        if (arg0 != -2) {
            this.field4933 = null;
        }
    }
}
