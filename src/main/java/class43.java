import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class43 extends class221 {

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "[J")
    private long[] field948 = new long[10];

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field945 = 0;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field943 = 256;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field942 = 1;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "J")
    private long field940 = class181.method1244((byte) -116);

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lpj;")
    public static class237 field947 = class33.method353(" )2> <col=ffffff>", 62);

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lpj;")
    public static class237 field950 = class33.method353("Starte 3D)2Softwarebibliothek)3", 127);

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "[J")
    public static long[] field951 = new long[1000];

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Lci;")
    public static class233 field952 = new class233(16);

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "Lfa;")
    public static class239 field941;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field946;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    public static final void method412(int arg0, int arg1) {
        if (arg1 != 951) {
            field952 = null;
        }
        field956++;
        class270 var2 = class202.method1368(arg1 - 966, 2, arg0);
        var2.method1795(-2113);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static void method413(int arg0) {
        field950 = null;
        if (arg0 != -15617) {
            method416(-41, -15, -93, -50, -105, -54, -69, 42, (class95) null, 123, true, 91L);
        }
        field952 = null;
        field951 = null;
        field946 = null;
        field947 = null;
        field941 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIIIII)V")
    public static final void method414(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 112 % ((arg0 + 54) / 46);
        field957++;
        if (arg2 >= class89.field1637 && arg3 <= class94.field1676 && arg5 >= class13.field215 && arg6 <= class34.field727) {
            if (arg1 == 1) {
                class222.method1476(arg5, arg3, arg4, -96, arg6, arg2);
            } else {
                class143.method987(arg4, arg5, -104, arg6, arg2, arg3, arg1);
            }
        } else if (arg1 == 1) {
            class178.method1232(-28820, arg4, arg5, arg3, arg6, arg2);
        } else {
            class39.method400(arg4, arg1, arg2, arg5, arg6, 94, arg3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public final void method415(byte arg0) {
        field955++;
        int var2 = 0;
        if (arg0 != 105) {
            this.field954 = 3;
        }
        while (var2 < 10) {
            this.field948[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIILqe;IZJ)Z")
    public static final boolean method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class99.field1773 == class206.field3509;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class224.field3852 || var24 >= class182.field3211) {
                    return false;
                }
                class35 var25 = class274.field4775[arg0][var15][var24];
                if (var25 != null && var25.field759 >= 5) {
                    return false;
                }
            }
        }
        class191 var16 = new class191();
        var16.field3314 = arg11;
        var16.field3323 = arg0;
        var16.field3317 = arg5;
        var16.field3312 = arg6;
        var16.field3325 = arg7;
        var16.field3318 = arg8;
        var16.field3328 = arg9;
        var16.field3316 = arg1;
        var16.field3315 = arg2;
        var16.field3327 = arg1 + arg3 - 1;
        var16.field3320 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class274.field4775[var22][var17][var20] == null) {
                        class274.field4775[var22][var17][var20] = new class35(var22, var17, var20);
                    }
                }
                class35 var23 = class274.field4775[arg0][var17][var20];
                var23.field755[var23.field759] = var16;
                var23.field765[var23.field759] = var21;
                var23.field768 |= var21;
                var23.field759++;
                if (var13 && class123.field2166[var17][var20] != 0) {
                    var14 = class123.field2166[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class123.field2166[var18][var19] == 0) {
                        class123.field2166[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class185.field3239[class85.field1579++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class43() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field948[var1] = this.field940;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
    public final int method417(int arg0, int arg1, int arg2) {
        int var4 = this.field943;
        this.field943 = 300;
        int var5 = this.field942;
        if (arg1 != -10006) {
            this.method417(47, 103, 20);
        }
        this.field942 = 1;
        this.field940 = class181.method1244((byte) -87);
        if (this.field948[this.field954] == 0L) {
            this.field942 = var5;
            this.field943 = var4;
        } else if (this.field940 > this.field948[this.field954]) {
            this.field943 = (int) ((long) (arg2 * 2560) / (this.field940 - this.field948[this.field954]));
        }
        field949++;
        if (this.field943 < 25) {
            this.field943 = 25;
        }
        if (this.field943 > 256) {
            this.field943 = 256;
            this.field942 = (int) ((long) arg2 - ((this.field940 - this.field948[this.field954]) / 10L));
        }
        if (this.field942 > arg2) {
            this.field942 = arg2;
        }
        this.field948[this.field954] = this.field940;
        this.field954 = (this.field954 + 1) % 10;
        if (this.field942 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field948[var6] != 0L) {
                    this.field948[var6] -= -((long) this.field942);
                }
            }
        }
        if (arg0 > this.field942) {
            this.field942 = arg0;
        }
        class84.method645(arg1 ^ 0xFFFFD8EB, (long) this.field942);
        int var7 = 0;
        while (this.field945 < 256) {
            this.field945 += this.field943;
            var7++;
        }
        this.field945 &= 0xFF;
        return var7;
    }
}
