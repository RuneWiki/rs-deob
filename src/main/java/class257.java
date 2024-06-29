import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class257 extends class51 {

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    private int field4627 = -32768;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field4620 = 0;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Ldj;")
    public static class289 field4619;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Lgf;")
    public static class7 field4618;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public static void method1701(boolean arg0) {
        if (arg0) {
            field4625 = -20;
        }
        field4619 = null;
        field4618 = null;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()V")
    public static final void method1702() {
        for (int var0 = 0; var0 < class182.field3248; var0++) {
            class211 var1 = class229.field4190[var0];
            class116.method718(var1);
            class229.field4190[var0] = null;
        }
        class182.field3248 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4626++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()I")
    public final int method166() {
        field4622++;
        return this.field4627;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfi;I)V")
    public static final void method1703(class228 arg0, int arg1) {
        field4623++;
        int var2 = arg0.field4139 - class146.field2635;
        int var3 = arg0.field4180 * 128 + (arg0.method218((byte) 118) * 64);
        int var4 = arg0.field4167 * 128 + (arg0.method218((byte) -128) * 64);
        arg0.field4136 = 0;
        arg0.field4108 += (var4 - arg0.field4108) / var2;
        int var5 = -64 % ((arg1 + 94) / 32);
        arg0.field4178 += (var3 - arg0.field4178) / var2;
        if (arg0.field4118 == 0) {
            arg0.field4168 = 1024;
        }
        if (arg0.field4118 == 1) {
            arg0.field4168 = 1536;
        }
        if (arg0.field4118 == 2) {
            arg0.field4168 = 0;
        }
        if (arg0.field4118 == 3) {
            arg0.field4168 = 512;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10) {
        class150 var13 = class262.method1743(this.field4629, 17366).method955(0, (class104) null, this.field4621, (byte) -20);
        field4624++;
        if (var13 != null) {
            var13.method174(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4627 = var13.method166();
        }
    }
}
