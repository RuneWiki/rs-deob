import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class143 extends class551 {

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Ldaa;")
    public class243 field1859;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lqp;")
    public static class586 field1858 = new class586(107, 0);

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lica;")
    public static class205 field1860 = new class205(32);

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "[[S")
    public static short[][] field1861;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 5)
    public static void method856(byte arg0) {
        if (arg0 != -27) {
            field1860 = null;
        }
        field1860 = null;
        field1861 = null;
        field1858 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ldaa;)V", line = 17)
    public class143(class243 arg0) {
        this.field1859 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 33)
    public static final void method857(byte arg0) {
        class325 var1 = class203.field3028;
        synchronized (class203.field3028) {
            class203.field3028.method2024((byte) -85);
        }
        field1857++;
        if (arg0 != 42) {
            field1861 = null;
        }
    }
}
