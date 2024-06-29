import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class110 extends class601 {

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    private int field1475 = 1;

    @OriginalMember(owner = "client!qba", name = "K", descriptor = "I")
    private int field1478 = 204;

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
    private int field1477 = 1;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!qba", name = "M", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!qba", name = "L", descriptor = "Ljava/lang/Object;")
    public static Object field1479;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "([Llq;II)V")
    public static final void method644(class210[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class210 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field2887;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field2887 < (var7 & 1) + var6) {
                    class210 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method644(arg0, arg1, var4 - 1);
            method644(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "(I)V")
    public static void method645(int arg0) {
        int var1 = 14 / ((-76 - arg0) / 37);
        field1479 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field1480;
        if (arg1 > -76) {
            this.method259((class234) null, 77, -36);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            for (int var4 = 0; class418.field5518 > var4; ++var4) {
                int var5 = class64.field839[var4];
                int var6 = class427.field5623[arg0];
                int var7 = this.field1477 * var5 >> 12;
                int var8 = this.field1475 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1477) * this.field1477;
                int var10 = var6 % (4096 / this.field1475) * this.field1475;
                if (this.field1478 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field1478) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1478 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "(B)V")
    public static final void method646(byte arg0) {
        if (arg0 != 34) {
            method646((byte) -11);
        }
        ++field1474;
        if (class80.field1134 != null) {
            try {
                String var1 = class80.field1134.getParameter("cookiehost");
                int var2 = (int) (class502.method2786(-7114) / 86400000L) - 11745;
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class586.method3136("document.cookie=\"" + var3 + "\"", 21424, class80.field1134);
            } catch (Throwable var4) {
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1478 = arg0.method1553((byte) -128);
                }
            } else {
                this.field1475 = arg0.method1509(true);
            }
        } else {
            this.field1477 = arg0.method1509(true);
        }
        int var5 = -70 % ((arg2 - 40) / 52);
        ++field1476;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, true);
    }
}
