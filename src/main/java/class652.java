import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class652 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lme;")
    private class668 field9064 = new class668(256);

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Le;")
    private class702 field9072;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lfc;")
    private class575 field9067;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
    public static int[] field9065 = new int[50];

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "[Z")
    public static boolean[] field9069 = new boolean[8];

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 3)
    public final void method3580(int arg0) {
        this.field9064.method3659(-118, 5);
        field9071++;
        if (arg0 != 256) {
            method3584((byte) 74, -2);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lqaa;", line = 16)
    public final class309 method3581(int arg0, int arg1) {
        field9074++;
        Object var3 = this.field9064.method3655(89, (long) arg0);
        if (var3 != null) {
            return (class309) var3;
        } else if (this.field9072.method3164((byte) -31, arg0)) {
            class59 var4 = this.field9072.method3162((byte) -104, arg0);
            int var5 = var4.field794 ? 64 : this.field9067.field7737;
            class309 var7;
            if (var4.field795 && this.field9067.method211()) {
                float[] var6 = this.field9072.method3157(0.7F, var5, arg0, false, var5, arg1 + 3694);
                var7 = this.field9067.method3118(var5, var4.field801 != 0, var6, var5, class135.field1774, 82);
            } else {
                int[] var8 = var4.field812 ? this.field9072.method3160(false, var5, arg0, var5, 0.7F, 78) : this.field9072.method3158(var5, true, 0.7F, var5, arg0, (byte) -56);
                var7 = this.field9067.method3078(var8, var5, 68, var5, var4.field801 != 0);
            }
            var7.method1133(var4.field808, var4.field809, 19263);
            if (arg1 != -3787) {
                method3582((byte) 117, -38, 64, -65, 121, 11, 47);
            }
            this.field9064.method3650((long) arg0, -112, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIIIII)V", line = 56)
    public static final void method3582(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9068++;
        int var7 = class650.method3574(class99.field1309, class165.field2061, arg2, 116);
        int var8 = class650.method3574(class99.field1309, class165.field2061, arg4, -111);
        int var9 = class650.method3574(class641.field8924, class265.field3552, arg1, 113);
        int var10 = class650.method3574(class641.field8924, class265.field3552, arg5, 115);
        int var11 = class650.method3574(class99.field1309, class165.field2061, arg2 + arg3, -71);
        int var12 = class650.method3574(class99.field1309, class165.field2061, arg4 - arg3, 111);
        int var13 = var7;
        int var14 = 71 / ((arg0 + 55) / 58);
        while (var11 > var13) {
            class349.method2008(var10, (byte) 68, class213.field2746[var13], var9, arg6);
            var13++;
        }
        for (int var15 = var8; var15 > var12; var15--) {
            class349.method2008(var10, (byte) 37, class213.field2746[var15], var9, arg6);
        }
        int var16 = class650.method3574(class641.field8924, class265.field3552, arg1 + arg3, 117);
        int var17 = class650.method3574(class641.field8924, class265.field3552, arg5 - arg3, 110);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class213.field2746[var18];
            class349.method2008(var16, (byte) 102, var19, var9, arg6);
            class349.method2008(var10, (byte) 88, var19, var17, arg6);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 111)
    public static void method3583(int arg0) {
        field9069 = null;
        if (arg0 >= 16) {
            field9065 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)V", line = 135)
    public static final void method3584(byte arg0, int arg1) {
        if (arg0 == -15) {
            field9070++;
            class367 var2 = class573.method3057(8, arg1, arg0 ^ 0xFFFFFFF3);
            var2.method2113(65);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 148)
    public final void method3585(int arg0) {
        if (arg0 < 76) {
            this.field9072 = null;
        }
        field9066++;
        this.field9064.method3656((byte) 0);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lfc;Le;)V", line = 161)
    public class652(class575 arg0, class702 arg1) {
        this.field9072 = arg1;
        this.field9067 = arg0;
    }
}
