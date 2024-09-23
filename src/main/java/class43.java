import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NLSYPUNJ")
public class class43 extends class53 {

    @OriginalMember(owner = "NLSYPUNJ", name = "p", descriptor = "Z")
    public boolean field1143 = false;

    @OriginalMember(owner = "NLSYPUNJ", name = "s", descriptor = "Z")
    private boolean field1146 = false;

    @OriginalMember(owner = "NLSYPUNJ", name = "r", descriptor = "LFPSNPMMW;")
    private class17 field1145;

    @OriginalMember(owner = "NLSYPUNJ", name = "l", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "NLSYPUNJ", name = "m", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "NLSYPUNJ", name = "n", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "NLSYPUNJ", name = "o", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "NLSYPUNJ", name = "q", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "NLSYPUNJ", name = "t", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "NLSYPUNJ", name = "u", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "NLSYPUNJ", name = "a", descriptor = "(Z)LITSMSHJO;")
    public final class27 method2(boolean arg0) {
        class27 var2 = this.field1145.method206();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1145.field729.field815[this.field1147];
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        class27 var5 = new class27(var2, class49.method401(var3, 0), false, (byte) 85, true);
        if (!this.field1143) {
            var5.method245(0);
            var5.method246(-1851, var3);
            var5.field895 = null;
            var5.field894 = null;
        }
        if (this.field1145.field732 != 128 || this.field1145.field733 != 128) {
            var5.method254(this.field1145.field732, this.field1145.field732, this.field1145.field733, 619);
        }
        if (this.field1145.field734 != 0) {
            if (this.field1145.field734 == 90) {
                var5.method249(true);
            }
            if (this.field1145.field734 == 180) {
                var5.method249(true);
                var5.method249(true);
            }
            if (this.field1145.field734 == 270) {
                var5.method249(true);
                var5.method249(true);
                var5.method249(true);
            }
        }
        var5.method255(this.field1145.field735 + 64, this.field1145.field736 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "NLSYPUNJ", name = "<init>", descriptor = "(IIIIIIII)V")
    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1145 = class17.field725[arg1];
        if (arg3 < 0 || arg3 > 0) {
            this.field1146 = !this.field1146;
        }
        this.field1139 = arg4;
        this.field1140 = arg2;
        this.field1141 = arg0;
        this.field1142 = arg7;
        this.field1144 = arg5 + arg6;
        this.field1143 = false;
    }

    @OriginalMember(owner = "NLSYPUNJ", name = "a", descriptor = "(II)V")
    public final void method368(int arg0, int arg1) {
        if (arg0 < 7 || arg0 > 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1148 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1148 <= this.field1145.field729.method227(956, this.field1147)) {
                        return;
                    }
                    this.field1148 -= this.field1145.field729.method227(956, this.field1147) + 1;
                    this.field1147++;
                } while (this.field1147 < this.field1145.field729.field814);
            } while (this.field1147 >= 0 && this.field1147 < this.field1145.field729.field814);
            this.field1147 = 0;
            this.field1143 = true;
        }
    }
}
