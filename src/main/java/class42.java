import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PKNSNRDF")
public class class42 extends class50 {

    @OriginalMember(owner = "client!PKNSNRDF", name = "p", descriptor = "Z")
    private boolean field1146 = true;

    @OriginalMember(owner = "client!PKNSNRDF", name = "s", descriptor = "Z")
    public boolean field1149 = false;

    @OriginalMember(owner = "client!PKNSNRDF", name = "t", descriptor = "I")
    private int field1150 = -479;

    @OriginalMember(owner = "client!PKNSNRDF", name = "n", descriptor = "LPHXJLMVH;")
    private class41 field1144;

    @OriginalMember(owner = "client!PKNSNRDF", name = "u", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!PKNSNRDF", name = "v", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!PKNSNRDF", name = "w", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!PKNSNRDF", name = "x", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!PKNSNRDF", name = "o", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!PKNSNRDF", name = "q", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client!PKNSNRDF", name = "r", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!PKNSNRDF", name = "<init>", descriptor = "(IIIBIIII)V")
    public class42(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1144 = class41.field1131[arg2];
        this.field1151 = arg0;
        this.field1152 = arg6;
        if (arg3 == 8) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        this.field1153 = arg1;
        this.field1154 = arg7;
        this.field1145 = arg4 + arg5;
        this.field1149 = false;
    }

    @OriginalMember(owner = "client!PKNSNRDF", name = "a", descriptor = "(I)LJUQSYEMB;")
    public final class22 method167(int arg0) {
        int var2 = 92 / arg0;
        class22 var3 = this.field1144.method414();
        if (var3 == null) {
            return null;
        }
        int var4 = this.field1144.field1135.field925[this.field1147];
        class22 var5 = new class22(false, true, (byte) 119, var3, class69.method579(true, var4));
        if (!this.field1149) {
            var5.method219(301);
            var5.method220(true, var4);
            var5.field800 = null;
            var5.field799 = null;
        }
        if (this.field1144.field1138 != 128 || this.field1144.field1139 != 128) {
            var5.method228(this.field1144.field1138, this.field1144.field1139, this.field1144.field1138, this.field1150);
        }
        if (this.field1144.field1140 != 0) {
            if (this.field1144.field1140 == 90) {
                var5.method223(-21890);
            }
            if (this.field1144.field1140 == 180) {
                var5.method223(-21890);
                var5.method223(-21890);
            }
            if (this.field1144.field1140 == 270) {
                var5.method223(-21890);
                var5.method223(-21890);
                var5.method223(-21890);
            }
        }
        var5.method229(this.field1144.field1141 + 64, this.field1144.field1142 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "client!PKNSNRDF", name = "a", descriptor = "(II)V")
    public final void method415(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1146 = !this.field1146;
        }
        this.field1148 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1148 <= this.field1144.field1135.method256(this.field1147, 642)) {
                        return;
                    }
                    this.field1148 -= this.field1144.field1135.method256(this.field1147, 642) + 1;
                    this.field1147++;
                } while (this.field1147 < this.field1144.field1135.field924);
            } while (this.field1147 >= 0 && this.field1147 < this.field1144.field1135.field924);
            this.field1147 = 0;
            this.field1149 = true;
        }
    }
}
