import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class701 {

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "Llh;")
    private class205 field9913 = new class205();

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "Lvu;")
    private class677 field9914 = new class677();

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    private int field9917;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
    private int field9916;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "Lpl;")
    private class616 field9918;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "Lvj;")
    public static class26 field9906 = new class26(7, 2);

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "Z")
    public static boolean field9908 = false;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "Ltm;")
    public static class334 field9912 = new class334(33, -1);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 6)
    public static void method3891(int arg0) {
        field9906 = null;
        field9912 = null;
        if (arg0 != 0) {
            field9907 = -74;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(JZ)V", line = 19)
    public final void method3892(long arg0, boolean arg1) {
        field9905++;
        if (arg1) {
            method3891(48);
        }
        class205 var4 = (class205) this.field9918.method3512(!arg1, arg0);
        if (var4 != null) {
            var4.method636((byte) 97);
            var4.method1507(1);
            this.field9916++;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IJ)Llh;", line = 39)
    public final class205 method3893(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method3892(86L, true);
        }
        field9915++;
        class205 var4 = (class205) this.field9918.method3512(true, arg1);
        if (var4 != null) {
            this.field9914.method3779(-14068, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Llh;JI)V", line = 63)
    public final void method3894(class205 arg0, long arg1, int arg2) {
        if (this.field9916 == arg2) {
            class205 var5 = this.field9914.method3775(arg2 ^ 0x1E);
            var5.method636((byte) 97);
            var5.method1507(arg2 ^ 0x1);
            if (this.field9913 == var5) {
                class205 var6 = this.field9914.method3775(30);
                var6.method636((byte) 97);
                var6.method1507(arg2 + 1);
            }
        } else {
            this.field9916--;
        }
        field9911++;
        this.field9918.method3516(arg2 + 255, arg1, arg0);
        this.field9914.method3779(-14068, arg0);
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V", line = 106)
    public final void method3895(int arg0) {
        this.field9914.method3773((byte) -128);
        if (arg0 != 2) {
            this.field9918 = null;
        }
        field9910++;
        this.field9918.method3517(-99);
        this.field9913 = new class205();
        this.field9916 = this.field9917;
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(I)V", line = 144)
    public class701(int arg0) {
        this.field9917 = arg0;
        this.field9916 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field9918 = new class616(var2);
    }
}
