import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class214 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    private int field3231 = -1;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    private int field3235;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[Lok;")
    private class41[] field3233;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[Lok;")
    private class41[] field3227;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lok;")
    private class41 field3237;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    private int field3229;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lta;")
    private class203 field3238;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lnh;")
    public static class305 field3236;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    private final void method1343(int arg0) {
        if (this.field3231 == arg0) {
            return;
        }
        this.field3231 = arg0;
        int var2 = class281.method1825(125, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field3230 != var2) {
            this.field3230 = var2;
            this.field3238 = null;
        }
        if (this.field3233 == null) {
            return;
        }
        this.field3229 = 0;
        int[] var3 = new int[this.field3233.length];
        for (int var4 = 0; var4 < this.field3233.length; var4++) {
            class41 var5 = this.field3233[var4];
            if (var5.method277(this.field3235, this.field3232, this.field3228, this.field3231)) {
                var3[this.field3229] = var5.field622;
                this.field3227[this.field3229++] = var5;
            }
        }
        class156.method968(this.field3227, (byte) -88, var3, this.field3229 - 1, 0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1343(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field3234 == -1) {
            class266.method1730(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field3238 == null) {
                this.field3238 = class118.field1696.method562(this.field3230, 116, false, class118.field1689, this.field3234);
            }
            if (!class118.field1696.method563(this.field3234, (byte) 127)) {
                class266.method1730(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field3238 != null) {
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
                        this.field3238.method685(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field3229 - 1; var14 >= 0; var14--) {
            this.field3227[var14].method271(arg1, arg2, arg3, arg4, arg5, var9, this.field3237);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lnh;)V")
    public static final void method1345(class305 arg0) {
        field3236 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public static void method1346() {
        field3236 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I[Lok;IIII)V")
    public class214(int arg0, class41[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3235 = arg3;
        this.field3232 = arg4;
        this.field3228 = arg5;
        this.field3234 = arg0;
        this.field3233 = arg1;
        if (arg1 == null) {
            this.field3227 = null;
            this.field3237 = null;
        } else {
            this.field3227 = new class41[arg1.length];
            this.field3237 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
