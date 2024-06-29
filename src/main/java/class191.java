import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class191 {

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "J")
    public long field2688;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Lbo;")
    private class511 field2686;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lok;")
    public static class166 field2684 = new class166(4, 6);

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Z")
    public static boolean field2687 = false;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Lrb;")
    public static class234 field2691 = new class234("stellardawn", 1);

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field2694 = 1;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "Lvj;")
    public static class304 field2693 = new class304("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "[I")
    public static int[] field2695 = new int[2048];

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!tr", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field2686.method2970(this.field2688, 1);
        field2685++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I", line = 14)
    public static int method1230(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ldm;)V", line = 32)
    public static final void method1231(class37 arg0) {
        for (int var1 = arg0.field581; var1 <= arg0.field580; var1++) {
            for (int var2 = arg0.field587; var2 <= arg0.field569; var2++) {
                class409 var3 = class497.field6886[arg0.field573][var1][var2];
                if (var3 != null) {
                    class165 var4 = var3.field5630;
                    class165 var5 = null;
                    while (var4 != null) {
                        if (var4.field2402 == arg0) {
                            if (var5 == null) {
                                var3.field5630 = var4.field2400;
                            } else {
                                var5.field2400 = var4.field2400;
                            }
                            var4.method1113((byte) -115);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2400;
                    }
                    var3.field5622 = 0;
                    for (class165 var6 = var3.field5630; var6 != null; var6 = var6.field2400) {
                        var3.field5622 = (byte) (var3.field5622 | var6.field2401);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V", line = 84)
    public static final void method1232(int arg0, int arg1, int arg2) {
        boolean var3 = class497.field6886[0][arg1][arg2] != null && class497.field6886[0][arg1][arg2].field5612 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class497.field6886[var4][arg1][arg2] == null) {
                class409 var5 = class497.field6886[var4][arg1][arg2] = new class409(var4, arg1, arg2);
                if (var3) {
                    var5.field5620++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZII)V", line = 104)
    public static final void method1233(boolean arg0, int arg1, int arg2) {
        if (class347.field4686 == 1) {
            class355.method2075(arg1, 82, arg2, class44.field663);
        } else if (class347.field4686 == 2) {
            class281.method1676(arg2, arg1, true);
        }
        if (arg0) {
            field2690++;
            class44.field663 = null;
            class347.field4686 = 0;
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lbo;JI)V", line = 128)
    public class191(class511 arg0, long arg1, int arg2) {
        this.field2688 = arg1;
        this.field2686 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 139)
    public static void method1234(byte arg0) {
        field2693 = null;
        if (arg0 != -102) {
            method1231(null);
        }
        field2684 = null;
        field2695 = null;
        field2691 = null;
    }
}
