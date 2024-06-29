import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class64 extends class337 {

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "Z")
    public static boolean field836 = false;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "J")
    public static long field837 = 1L;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "Luw;")
    public static class208 field841 = new class208(119, -2);

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "D")
    public static double field842;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "[I")
    public static int[] field839;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method376(boolean arg0, int arg1) {
        field835++;
        for (class53 var2 = (class53) class409.field5429.method3591(0); var2 != null; var2 = (class53) class409.field5429.method3600((byte) 65)) {
            if (var2.field686 != null) {
                class1.field10.method30(var2.field686);
                var2.field686 = null;
            }
            if (var2.field689 != null) {
                class1.field10.method30(var2.field689);
                var2.field689 = null;
            }
            var2.method1946(-10364);
        }
        if (arg0) {
            for (class53 var3 = (class53) class418.field5515.method3591(0); var3 != null; var3 = (class53) class418.field5515.method3600((byte) 67)) {
                if (var3.field686 != null) {
                    class1.field10.method30(var3.field686);
                    var3.field686 = null;
                }
                var3.method1946(-10364);
            }
            for (class53 var4 = (class53) class548.field6848.method2610((byte) -17); var4 != null; var4 = (class53) class548.field6848.method2620(arg1 ^ 0x1)) {
                if (var4.field686 != null) {
                    class1.field10.method30(var4.field686);
                    var4.field686 = null;
                }
                var4.method1946(-10364);
            }
        }
        if (arg1 != 1) {
            method377(45);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 75)
    public static void method377(int arg0) {
        if (arg0 < 78) {
            field836 = false;
        }
        field841 = null;
        field839 = null;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(II)V", line = 97)
    public class64(int arg0, int arg1) {
        this.field840 = arg1;
        this.field838 = arg0;
    }
}
