import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class191 {

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Lng;")
    private class226 field2811 = new class226(64);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Lic;")
    private class491 field2806;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lic;")
    private class491 field2808;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Lvg;")
    public static class38 field2809;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Lic;")
    public static class491 field2810;

    static {
        new class475("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field2809 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method1298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class303.field4277 = arg0;
        field2805++;
        class237.field3496 = arg2;
        class150.field2237 = arg3;
        if (arg4 != -3918) {
            method1299(-32);
        }
        class11.field144 = arg5;
        class41.field616 = arg1;
        class485.field7118 = arg6;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 26)
    public static void method1299(int arg0) {
        field2809 = null;
        if (arg0 != 0) {
            method1298(-38, 109, -71, 119, -63, 63, -113);
        }
        field2810 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)Lhg;", line = 55)
    public final class486 method1300(int arg0, int arg1) {
        field2807++;
        class486 var3 = (class486) this.field2811.method1536((long) arg1, arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field2806.method2945(0, arg1 & 0x7FFF, true);
        } else {
            var4 = this.field2808.method2945(0, arg1, true);
        }
        class486 var5 = new class486();
        if (var4 != null) {
            var5.method2888(new class209(var4), 10015);
        }
        if (arg1 >= 32768) {
            var5.method2885(0);
        }
        this.field2811.method1542(var5, (byte) 112, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(ILic;Lic;)V", line = 95)
    public class191(int arg0, class491 arg1, class491 arg2) {
        this.field2806 = arg2;
        this.field2808 = arg1;
        if (this.field2808 != null) {
            this.field2808.method2942(false, 0);
        }
        if (this.field2806 != null) {
            this.field2806.method2942(false, 0);
        }
    }
}
