import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class21 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    private int field262 = -1;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[Lid;")
    private class106[] field263;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lid;")
    private class106[] field271;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lid;")
    private class106 field268;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lqi;")
    private class232 field264;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ldk;")
    public static class251 field270;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ldk;)V")
    public static final void method114(class251 arg0) {
        field270 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public static void method115() {
        field270 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    private final void method116(int arg0) {
        if (this.field262 == arg0) {
            return;
        }
        this.field262 = arg0;
        int var2 = class120.method848(-125, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field260 != var2) {
            this.field260 = var2;
            this.field264 = null;
        }
        if (this.field263 == null) {
            return;
        }
        this.field269 = 0;
        int[] var3 = new int[this.field263.length];
        for (int var4 = 0; var4 < this.field263.length; var4++) {
            class106 var5 = this.field263[var4];
            if (var5.method749(this.field266, this.field261, this.field265, this.field262)) {
                var3[this.field269] = var5.field1681;
                this.field271[this.field269++] = var5;
            }
        }
        class40.method259(80, 0, this.field269 - 1, this.field271, var3);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method116(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field267 == -1) {
            class127.method886(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field264 == null) {
                this.field264 = class302.field4828.method105(this.field260, false, class302.field4820, this.field267, -16578);
            }
            if (!class302.field4828.method112(this.field267, (byte) 102)) {
                class127.method886(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field264 != null) {
                int var10 = arg4 * arg5 / -512;
                int var11;
                for (var11 = arg4 * var9 / 512 + (arg3 - arg4) / 2; var11 > arg4; var11 -= arg4) {
                }
                while (var11 < 0) {
                    var11 += arg4;
                }
                while (var10 > arg4) {
                    var10 -= arg4;
                }
                while (var10 < 0) {
                    var10 += arg4;
                }
                for (int var12 = var11 - arg4; var12 < arg3; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < arg4; var13 += arg4) {
                        this.field264.method1019(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field269 - 1; var14 >= 0; var14--) {
            this.field271[var14].method751(arg1, arg2, arg3, arg4, arg5, var9, this.field268);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I[Lid;IIII)V")
    public class21(int arg0, class106[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field266 = arg3;
        this.field261 = arg4;
        this.field265 = arg5;
        this.field267 = arg0;
        this.field263 = arg1;
        if (arg1 == null) {
            this.field271 = null;
            this.field268 = null;
        } else {
            this.field271 = new class106[arg1.length];
            this.field268 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
