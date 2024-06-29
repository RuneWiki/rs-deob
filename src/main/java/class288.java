import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class288 {

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lai;")
    private class597 field3544;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "J")
    public long field3545;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field3543 = 0;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Ldh;")
    public static class320 field3542 = new class320(76, -1);

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "Ldh;")
    public static class320 field3546 = new class320(78, 2);

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
    public static final void method1713(boolean arg0) {
        field3540++;
        class729 var1 = null;
        try {
            class290 var2 = class289.field3549.method3201(arg0, (byte) -119, "2");
            while (var2.field3573 == 0) {
                class524.method3076(1, 1L);
            }
            if (var2.field3573 == 1) {
                var1 = (class729) var2.field3577;
                byte[] var3 = new byte[(int) var1.method4059((byte) 88)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method4066(var3, var4, (byte) 125, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class477.method2861(-1, new class244(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method4060((byte) 79);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3544.method3401(this.field3545, (byte) 60);
        field3539++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public static void method1714(int arg0) {
        field3542 = null;
        if (arg0 != -4387) {
            method1714(-91);
        }
        field3546 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lai;J[Let;)V")
    public class288(class597 arg0, long arg1, class592[] arg2) {
        this.field3544 = arg0;
        this.field3545 = arg1;
    }
}
