import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class534 extends class243 {

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    private int field7403;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    private int field7411;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    private int field7414;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    private int field7415;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "[I")
    public static int[] field7410 = new int[50];

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "Lst;")
    public static class335 field7412 = new class335(25, 7);

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field7413 = 0;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "F")
    public static float field7416;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILuu;)Lde;", line = 4)
    public static final class604 method3168(int arg0, int arg1, int arg2, class237 arg3) {
        if (arg2 != -16604) {
            field7412 = null;
        }
        ++field7405;
        class63 var4 = new class63(arg3.method1572(arg1, 0, arg0));
        class604 var5 = new class604(arg0, var4.method479((byte) -16), var4.method479((byte) -49), var4.method457(arg2 + 2072), var4.method457(-14532), ~var4.method505((byte) -119) == -2, var4.method505((byte) -119), var4.method505((byte) -119));
        int var6 = var4.method505((byte) -119);
        for (int var7 = 0; var6 > var7; ++var7) {
            var5.field8156.method3610(arg2 + 25893, new class81(var4.method505((byte) -119), var4.method482(-772591672), var4.method482(arg2 + -772575068), var4.method482(-772591672), var4.method482(arg2 ^ 772575468), var4.method482(-772591672), var4.method482(arg2 + -772575068), var4.method482(-772591672), var4.method482(-772591672)));
        }
        var5.method3442(36);
        return var5;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(III)V", line = 31)
    public final void method92(int arg0, int arg1, int arg2) {
        ++field7409;
        int var4 = 58 / ((arg1 - -20) / 33);
        int var5 = this.field7403 * arg2 >> 12;
        int var6 = this.field7411 * arg2 >> 12;
        int var7 = this.field7414 * arg0 >> 12;
        int var8 = this.field7415 * arg0 >> 12;
        class507.method3049(var6, super.field3607, (byte) 43, super.field3610, var8, var5, var7);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 50)
    public static void method3169(int arg0) {
        field7412 = null;
        field7410 = null;
        if (arg0 != -23612) {
            field7412 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)V", line = 66)
    public final void method87(int arg0, int arg1, byte arg2) {
        ++field7406;
        int var4 = this.field7403 * arg1 >> 12;
        if (arg2 <= 92) {
            method3168(109, 52, 98, (class237) null);
        }
        int var5 = this.field7411 * arg1 >> 12;
        int var6 = this.field7414 * arg0 >> 12;
        int var7 = this.field7415 * arg0 >> 12;
        class596.method3418(var6, 2, var5, super.field3610, var4, super.field3607, super.field3614, var7);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V", line = 86)
    public final void method90(int arg0, int arg1, int arg2) {
        ++field7404;
        int var4 = this.field7403 * arg0 >> 12;
        int var5 = this.field7411 * arg0 >> 12;
        int var6 = this.field7414 * arg1 >> 12;
        if (arg2 != 10893) {
            this.method87(-7, -83, (byte) -109);
        }
        int var7 = this.field7415 * arg1 >> 12;
        class56.method406(var6, super.field3614, var5, var4, var7, 3732);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIIII)V", line = 117)
    public class534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7403 = arg0;
        this.field7411 = arg2;
        this.field7414 = arg1;
        this.field7415 = arg3;
    }
}
