import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class323 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lwf;")
    private class89 field4092 = new class89();

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Ltk;")
    private class230 field4100 = new class230();

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    private int field4102;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    private int field4097;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lek;")
    private class352 field4098;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lud;")
    public static class27 field4099 = new class27(4, 1, 1, 1);

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "Ldq;")
    public static class493 field4101 = new class493(77, 3);

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field4104 = 1;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Lqn;")
    public static class47 field4095;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method1891(int arg0) {
        field4101 = null;
        if (arg0 != 4) {
            field4103 = -35;
        }
        field4099 = null;
        field4095 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(JZ)Lwf;")
    public final class89 method1892(long arg0, boolean arg1) {
        if (arg1) {
            method1891(-101);
        }
        field4096++;
        class89 var4 = (class89) this.field4098.method2022(-1, arg0);
        if (var4 != null) {
            this.field4100.method1400(false, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method1893(int arg0) {
        field4094++;
        this.field4100.method1396(-73);
        if (arg0 <= 18) {
            this.method1892(49L, false);
        }
        this.field4098.method2024(false);
        this.field4092 = new class89();
        this.field4102 = this.field4097;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lwf;JI)V")
    public final void method1894(class89 arg0, long arg1, int arg2) {
        if (this.field4102 == 0) {
            class89 var5 = this.field4100.method1393((byte) 126);
            var5.method2165(arg2 ^ 0x1E93);
            var5.method701(83);
            if (this.field4092 == var5) {
                class89 var6 = this.field4100.method1393((byte) 126);
                var6.method2165(16225);
                var6.method701(arg2 - 8625);
            }
        } else {
            this.field4102--;
        }
        field4093++;
        this.field4098.method2019((byte) -78, arg0, arg1);
        if (arg2 == 8690) {
            this.field4100.method1400(false, arg0);
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
    public class323(int arg0) {
        this.field4102 = arg0;
        this.field4097 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4098 = new class352(var2);
    }
}
