import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class266 extends class618 {

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Llq;")
    public class210 field3528;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lg;")
    public static class619 field3530;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3531;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
    public boolean field3527;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[Lvu;")
    public class706[] field3533;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field3530 = null;
        field3531 = null;
        if (arg0 != -1) {
            field3530 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)Leo;")
    public static final class340 method1677(byte arg0, int arg1, int arg2) {
        int var3 = -2 % ((arg0 - 63) / 45);
        field3529++;
        class340 var4 = new class340();
        var4.field4158 = -1;
        var4.field4167 = arg1 + 6;
        var4.field4157 = -1;
        var4.field4155 = arg2 + 1 + 5;
        var4.field4160 = new int[var4.field4155][var4.field4167];
        var4.method1961((byte) -36);
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method1678(class570 arg0, int arg1, int arg2, int arg3) {
        field3532++;
        int var5 = this.field3528.method1405((byte) 119);
        if (arg1 != 25837) {
            field3530 = null;
        }
        if (this.field3533 != null) {
            for (int var6 = 0; var6 < this.field3533.length; var6++) {
                this.field3533[var6].field9325 <<= var5;
                if (this.field3533[var6].method3817(arg2, arg3) && this.field3528.method179(arg2, arg3, arg0, arg1 - 25939)) {
                    this.field3533[var6].field9325 >>= var5;
                    return true;
                }
                this.field3533[var6].field9325 >>= var5;
            }
        }
        return false;
    }
}
