import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class199 {

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "Z")
    public static boolean field2812 = false;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[Lis;")
    public class117[] field2810;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILgga;)V")
    public final void method1289(int arg0, class511 arg1) {
        field2811++;
        this.field2809 = arg1.method2983(true);
        int var3 = -120 % ((arg0 + 35) / 44);
        this.field2808 = arg1.method3002(-1);
        this.field2810 = new class117[arg1.method3013(-120)];
        class475[] var4 = class572.method3360(0);
        for (int var5 = 0; var5 < this.field2810.length; var5++) {
            this.field2810[var5] = this.method1290(var4[arg1.method3013(38)], 0, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lof;ILgga;)Lis;")
    private final class117 method1290(class475 arg0, int arg1, class511 arg2) {
        field2813++;
        if (class181.field2287 == arg0) {
            return class542.method3213(arg2, -96);
        }
        if (arg1 != 0) {
            this.field2809 = -49;
        }
        if (class656.field9257 == arg0) {
            return class180.method1144(arg1 - 20194, arg2);
        } else if (class538.field7430 == arg0) {
            return class489.method2892((byte) -95, arg2);
        } else if (class463.field6467 == arg0) {
            return class324.method2054(-80, arg2);
        } else if (class558.field7853 == arg0) {
            return class81.method575(arg2, -84);
        } else if (class227.field3443 == arg0) {
            return class635.method3643((byte) -79, arg2);
        } else if (class86.field1037 == arg0) {
            return class483.method2871(arg2, arg1 + 29332);
        } else if (class132.field1692 == arg0) {
            return class113.method817(-1, arg2);
        } else if (class777.field10690 == arg0) {
            return class8.method22(arg2, (byte) 119);
        } else if (class696.field9705 == arg0) {
            return class141.method937(arg2, arg1 + 8);
        } else {
            return null;
        }
    }
}
