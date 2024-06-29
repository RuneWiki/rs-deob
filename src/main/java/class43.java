import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class43 {

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lge;")
    private class551 field519 = new class551();

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lmc;")
    private class384 field522 = new class384();

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "Lica;")
    private class205 field523;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "[I")
    public static int[] field515 = new int[13];

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lqp;")
    public static class586 field520 = new class586(23, 28);

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "Lqu;")
    public static class364 field526 = new class364(39, -1);

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "Lkp;")
    public static class464 field527 = new class464();

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field529 = -2;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "[Z")
    public static boolean[] field521;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JB)Lge;", line = 11)
    public final class551 method227(long arg0, byte arg1) {
        field518++;
        class551 var4 = (class551) this.field523.method1333(arg0, false);
        if (var4 != null) {
            this.field522.method2331(2, var4);
        }
        if (arg1 < 55) {
            this.field522 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 35)
    public static void method228(int arg0) {
        field526 = null;
        field515 = null;
        field527 = null;
        field521 = null;
        field520 = null;
        int var1 = -112 / ((arg0 + 69) / 42);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 50)
    public final void method229(int arg0) {
        this.field522.method2334((byte) -97);
        field517++;
        this.field523.method1332(-22538);
        int var2 = -34 % ((arg0 + 42) / 39);
        this.field519 = new class551();
        this.field525 = this.field524;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JLge;I)V", line = 67)
    public final void method230(long arg0, class551 arg1, int arg2) {
        if (arg2 != 50) {
            return;
        }
        if (this.field525 == 0) {
            class551 var5 = this.field522.method2332(false);
            var5.method2997(1);
            var5.method3225(-96);
            if (this.field519 == var5) {
                class551 var6 = this.field522.method2332(false);
                var6.method2997(1);
                var6.method3225(-62);
            }
        } else {
            this.field525--;
        }
        field516++;
        this.field523.method1341(arg1, (byte) 72, arg0);
        this.field522.method2331(2, arg1);
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(I)V", line = 123)
    public class43(int arg0) {
        this.field525 = arg0;
        this.field524 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field523 = new class205(var2);
    }
}
