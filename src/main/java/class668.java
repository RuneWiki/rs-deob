import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class668 extends class502 {

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Z")
    private boolean field9297 = true;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "Z")
    public boolean field9302 = false;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "[I")
    public static int[] field9303 = null;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "Lpja;")
    public static class43 field9294 = new class43(30);

    @OriginalMember(owner = "client!or", name = "j", descriptor = "D")
    public static double field9292;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Ljf;")
    public static class229 field9304;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field9293;
        if (arg1 != 0) {
            field9303 = null;
        }
        if (!super.field6863.method2824((byte) -99).method195(5583)) {
            return 3;
        } else {
            return arg0 == 3 && !class541.method3057(10, "jagdx") ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)Z")
    public final boolean method3780(int arg0) {
        ++field9298;
        if (arg0 != 0) {
            this.field9302 = true;
        }
        return super.field6863.method2824((byte) 46).method195(5583);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(B)Z")
    public final boolean method3781(byte arg0) {
        ++field9300;
        int var2 = -93 / ((29 - arg0) / 52);
        return this.field9297;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
    public final void method3782(boolean arg0, int arg1) {
        int var3 = -65 / ((55 - arg1) / 44);
        ++field9301;
        this.field9297 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field9296;
        super.field6865 = arg0;
        this.field9302 = false;
        if (arg1 != 0) {
            field9292 = 1.1346346334333643D;
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public static void method3783(int arg0) {
        field9294 = null;
        field9304 = null;
        if (arg0 != 2) {
            method3783(-79);
        }
        field9303 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        this.field9302 = true;
        if (arg0 != -2) {
            this.field9302 = true;
        }
        ++field9291;
        return !super.field6863.method2824((byte) 93).method195(5583) ? 0 : 2;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        ++field9295;
        if (!arg0) {
            this.method3780(38);
        }
        if (!super.field6863.method2824((byte) 65).method195(5583)) {
            super.field6865 = 0;
        }
        if (super.field6865 < 0 || super.field6865 > 5) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILeka;)V")
    public class668(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)I")
    public final int method3784(byte arg0) {
        ++field9299;
        if (arg0 < 49) {
            field9304 = null;
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Leka;)V")
    public class668(class492 arg0) {
        super(arg0);
    }
}
