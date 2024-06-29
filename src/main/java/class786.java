import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class786 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "J")
    private long field10800 = -1L;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Lok;")
    private class266 field10803 = new class266();

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field10798;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field10799;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field10801;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field10804;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "J")
    private long field10802;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBII)V")
    public static final void method4305(int arg0, byte arg1, int arg2, int arg3) {
        field10798++;
        class313 var4 = class312.method1998((long) arg0, 11, -1);
        var4.method2001((byte) 98);
        if (arg1 >= 61) {
            var4.field4455 = arg2;
            var4.field4464 = arg3;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lso;B)V")
    private final void method4306(class494 arg0, byte arg1) {
        this.field10802 = arg0.method3005(-117);
        field10804++;
        int var3 = -104 % ((23 - arg1) / 51);
        this.field10800 = arg0.method3005(-116);
        for (int var4 = arg0.method2964((byte) 73); var4 != 0; var4 = arg0.method2964((byte) 71)) {
            class417 var5;
            if (var4 == 1) {
                var5 = new class182();
            } else if (var4 == 4) {
                var5 = new class693();
            } else if (var4 == 3) {
                var5 = new class79();
            } else if (var4 == 2) {
                var5 = new class375();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var5.method610(arg0, -126);
            this.field10803.method1727(var5, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILie;IZIIIILaa;Lmea;Ljava/lang/String;Lda;)V")
    public static final void method4307(int arg0, class6 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class511 arg8, class451 arg9, String arg10, class66 arg11) {
        field10799++;
        if (!arg3) {
            method4305(124, (byte) -33, 52, 112);
        }
        int var12;
        if (class416.field5704 == 4) {
            var12 = (int) class758.field10460 & 0x3FFF;
        } else {
            var12 = (int) class758.field10460 + class29.field416 & 0x3FFF;
        }
        int var13 = Math.max(arg9.field6290 / 2, arg9.field6288 / 2) + 10;
        int var14 = arg5 * arg5 + arg6 * arg6;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class376.field5186[var12];
        int var16 = class376.field5188[var12];
        if (class416.field5704 != 4) {
            var16 = var16 * 256 / (class347.field4853 + 256);
            var15 = var15 * 256 / (class347.field4853 + 256);
        }
        int var17 = arg5 * var15 + arg6 * var16 >> 14;
        int var18 = arg5 * var16 - (arg6 * var15) >> 14;
        int var19 = arg1.method39(null, arg10, 100, (byte) -27);
        int var20 = arg1.method47(100, null, arg10, 14, 0);
        int var21 = var17 - var19 / 2;
        if (var21 >= (-arg9.field6290) && arg9.field6290 >= var21 && var18 >= -arg9.field6288 && arg9.field6288 >= var18) {
            arg11.method571(arg2, null, 0, var19, arg2 + (arg9.field6288 / 2) - var18 - arg0 - var20, 1, 0, -22888, arg10, 50, null, arg7 + var21 + (arg9.field6290 / 2), arg7, arg4, arg8, 0);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLhs;)V")
    public final void method4308(byte arg0, class344 arg1) {
        if (arg0 != 123) {
            method4305(17, (byte) -41, 42, 120);
        }
        field10801++;
        if (this.field10802 != arg1.field8133 || this.field10800 != arg1.field4803) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg1.field8133 + " updateNum:" + arg1.field4803 + " delta.clanHash:" + this.field10802 + " updateNum:" + this.field10800);
        }
        for (class417 var3 = (class417) this.field10803.method1731((byte) -124); var3 != null; var3 = (class417) this.field10803.method1724(0)) {
            var3.method611(arg1, true);
        }
        arg1.field4803++;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lso;)V")
    public class786(class494 arg0) {
        this.method4306(arg0, (byte) -35);
    }
}
