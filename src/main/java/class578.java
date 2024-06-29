import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class578 extends class665 {

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "Loj;")
    private class346 field7763;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljr;B)V")
    public final void method3165(class96 arg0, byte arg1) {
        field7762++;
        while (true) {
            int var3 = arg0.method718(117);
            if (var3 == 0) {
                if (arg1 > -40) {
                    this.method3167(17, 56, (byte) -104);
                    return;
                } else {
                    return;
                }
            }
            this.method3169((byte) -66, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)Z")
    public static final boolean method3166(int arg0, int arg1, int arg2) {
        if (arg2 <= 55) {
            method3166(5, 123, 22);
        }
        field7765++;
        return (class614.method3397(arg0, (byte) 107, arg1) | class280.method1700(-105, arg0, arg1) | class183.method1235(arg0, 86, arg1)) & class590.method3275(arg1, (byte) -104, arg0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)I")
    public final int method3167(int arg0, int arg1, byte arg2) {
        if (arg2 != 39) {
            return 39;
        }
        field7761++;
        if (this.field7763 == null) {
            return arg1;
        } else {
            class108 var4 = (class108) this.field7763.method2061(-17305, (long) arg0);
            return var4 == null ? arg1 : var4.field1479;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
    public final String method3168(String arg0, int arg1, byte arg2) {
        field7766++;
        if (this.field7763 == null) {
            return arg0;
        } else if (arg2 == 3) {
            class615 var4 = (class615) this.field7763.method2061(-17305, (long) arg1);
            return var4 == null ? arg0 : var4.field8520;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjr;I)V")
    private final void method3169(byte arg0, class96 arg1, int arg2) {
        field7764++;
        int var4 = -60 % ((10 - arg0) / 41);
        if (arg2 != 249) {
            return;
        }
        int var5 = arg1.method718(85);
        if (this.field7763 == null) {
            int var6 = class350.method2082(-3, var5);
            this.field7763 = new class346(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg1.method718(111) == 1;
            int var9 = arg1.method736(-122);
            class539 var10;
            if (var8) {
                var10 = new class615(arg1.method739(45));
            } else {
                var10 = new class108(arg1.method714(false));
            }
            this.field7763.method2063((long) var9, 1, var10);
        }
    }
}
