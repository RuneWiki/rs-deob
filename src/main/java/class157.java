import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class157 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    private int field2337 = -1;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    private int field2347;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field2340;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "[Ldi;")
    private class143[] field2348;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[Ldi;")
    private class143[] field2344;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Ldi;")
    private class143 field2339;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lff;")
    private class48 field2343;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lvl;")
    public static class73 field2341;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lvl;)V")
    public static final void method1086(class73 arg0) {
        field2341 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    private final void method1087(int arg0) {
        if (this.field2337 == arg0) {
            return;
        }
        this.field2337 = arg0;
        int var2 = class164.method1132(57, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2346 != var2) {
            this.field2346 = var2;
            this.field2343 = null;
        }
        if (this.field2348 == null) {
            return;
        }
        this.field2342 = 0;
        int[] var3 = new int[this.field2348.length];
        for (int var4 = 0; var4 < this.field2348.length; var4++) {
            class143 var5 = this.field2348[var4];
            if (var5.method941(this.field2347, this.field2340, this.field2338, this.field2337)) {
                var3[this.field2342] = var5.field2128;
                this.field2344[this.field2342++] = var5;
            }
        }
        class60.method386(var3, this.field2344, this.field2342 - 1, 0, -111);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1087(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2345 == -1) {
            class151.method1026(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2343 == null) {
                this.field2343 = class221.field3464.method576(this.field2346, -119, this.field2345, false, class221.field3469);
            }
            if (!class221.field3464.method578((byte) -124, this.field2345)) {
                class151.method1026(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2343 != null) {
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
                        this.field2343.method292(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2342 - 1; var14 >= 0; var14--) {
            this.field2344[var14].method935(arg1, arg2, arg3, arg4, arg5, var9, this.field2339);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()V")
    public static void method1089() {
        field2341 = null;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I[Ldi;IIII)V")
    public class157(int arg0, class143[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2347 = arg3;
        this.field2340 = arg4;
        this.field2338 = arg5;
        this.field2345 = arg0;
        this.field2348 = arg1;
        if (arg1 == null) {
            this.field2344 = null;
            this.field2339 = null;
        } else {
            this.field2344 = new class143[arg1.length];
            this.field2339 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
