import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class257 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field4166 = -1;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field4168;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private int field4167;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lqi;")
    private class223[] field4169;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[Lqi;")
    private class223[] field4175;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lqi;")
    private class223 field4174;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    private int field4172;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Leh;")
    public static class137 field4173;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lnf;")
    private class227 field4164;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
    public static void method1757() {
        field4173 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Leh;)V")
    public static final void method1758(class137 arg0) {
        field4173 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    private final void method1759(int arg0) {
        if (this.field4166 == arg0) {
            return;
        }
        this.field4166 = arg0;
        int var2 = class77.method429(arg0, 1);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field4165 != var2) {
            this.field4165 = var2;
            this.field4164 = null;
        }
        if (this.field4169 == null) {
            return;
        }
        this.field4172 = 0;
        int[] var3 = new int[this.field4169.length];
        for (int var4 = 0; var4 < this.field4169.length; var4++) {
            class223 var5 = this.field4169[var4];
            if (var5.method1576(this.field4168, this.field4167, this.field4170, this.field4166)) {
                var3[this.field4172] = var5.field3585;
                this.field4175[this.field4172++] = var5;
            }
        }
        class188.method1315(0, var3, this.field4172 - 1, (byte) -14, this.field4175);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1759(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field4171 == -1) {
            class217.method1526(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field4164 == null) {
                this.field4164 = class174.field2756.method769(this.field4171, class174.field2765, this.field4165, -4, false);
            }
            if (!class174.field2756.method770(this.field4171, (byte) 20)) {
                class217.method1526(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field4164 != null) {
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
                for (int var12 = var11 - arg4; var12 < class217.field3481; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class217.field3478; var13 += arg4) {
                        this.field4164.method320(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field4172 - 1; var14 >= 0; var14--) {
            this.field4175[var14].method1577(arg1, arg2, arg3, arg4, arg5, var9, this.field4174);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I[Lqi;IIII)V")
    public class257(int arg0, class223[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4168 = arg3;
        this.field4167 = arg4;
        this.field4170 = arg5;
        this.field4171 = arg0;
        this.field4169 = arg1;
        if (arg1 == null) {
            this.field4175 = null;
            this.field4174 = null;
        } else {
            this.field4175 = new class223[arg1.length];
            this.field4174 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
