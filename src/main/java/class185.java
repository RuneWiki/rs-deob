import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class185 extends class211 {

    @OriginalMember(owner = "client!da", name = "B", descriptor = "Z")
    public boolean field3417 = false;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    private int field3408 = -1;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    private int field3409 = 0;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field3427 = 0;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    private int field3426 = -32768;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    private int field3422;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lna;")
    private class31 field3407;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lcf;")
    public static class93 field3406 = class147.method1066("gelb:", -48);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lcf;")
    public static class93 field3401 = class147.method1066(" GMT", -48);

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field3411 = 0;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lcf;")
    private static class93 field3410 = class147.method1066("Discard", -48);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lcf;")
    public static class93 field3412 = class147.method1066("rect_debug=", -48);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lcf;")
    public static class93 field3404 = class147.method1066("Chargement du module texte )2 ", -48);

    @OriginalMember(owner = "client!da", name = "y", descriptor = "Lcf;")
    public static class93 field3414 = field3410;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lhg;")
    public static class177 field3399;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lod;")
    private class91 field3403;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3424++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V")
    public final void method1348(int arg0, byte arg1) {
        field3423++;
        if (this.field3417) {
            return;
        }
        this.field3409 += arg0;
        while (this.field3407.field486[this.field3427] < this.field3409) {
            this.field3409 -= this.field3407.field486[this.field3427];
            this.field3427++;
            if (this.field3407.field479.length <= this.field3427) {
                this.field3417 = true;
                break;
            }
        }
        if (arg1 != 69) {
            this.method93();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()I")
    public final int method93() {
        field3415++;
        return this.field3426;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Lbk;")
    private final class20 method1349(int arg0) {
        if (arg0 != 26919) {
            this.field3403 = null;
        }
        field3405++;
        class135 var2 = class188.method1359(this.field3422, -127);
        class20 var3;
        if (this.field3417) {
            var3 = var2.method984(-1, (byte) 124, -1, 0);
        } else {
            var3 = var2.method984(this.field3408, (byte) 124, this.field3427, this.field3409);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static void method1350(int arg0) {
        if (arg0 != 2992) {
            method1352(103, -128);
        }
        field3399 = null;
        field3406 = null;
        field3412 = null;
        field3414 = null;
        field3410 = null;
        field3401 = null;
        field3404 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10) {
        class20 var13 = this.method1349(26919);
        field3421++;
        if (var13 != null) {
            var13.method106(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3403);
            this.field3426 = var13.method93();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)Lmd;")
    public static final class221 method1351(int arg0, byte arg1) {
        field3416++;
        class221 var2 = (class221) class266.field4731.method302((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class136.field2378.method1271(arg0, -2154, 0);
        int var4 = 97 % ((arg1 + 57) / 42);
        class221 var5 = new class221(var3);
        var5.method1818(class140.field2434, (int[]) null);
        class266.field4731.method297((long) arg0, var5, 10414);
        return var5;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Lcf;")
    public static final class93 method1352(int arg0, int arg1) {
        field3400++;
        return arg0 == -626138072 ? class130.method949((byte) -77, new class93[] { class148.method1067(-7015, arg1 >> 24 & 0xFF), class236.field4208, class148.method1067(-7015, (arg1 & 0xFF83B0) >> 16), class236.field4208, class148.method1067(-7015, arg1 >> 8 & 0xFF), class236.field4208, class148.method1067(-7015, arg1 & 0xFF) }) : null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIIII)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3428 = arg4;
        this.field3419 = arg5 + arg6;
        this.field3402 = arg3;
        this.field3422 = arg0;
        this.field3418 = arg1;
        this.field3425 = arg2;
        int var8 = class188.method1359(this.field3422, -98).field2352;
        if (var8 == -1) {
            this.field3417 = true;
        } else {
            this.field3417 = false;
            this.field3407 = class131.method964(var8, true);
        }
    }
}
