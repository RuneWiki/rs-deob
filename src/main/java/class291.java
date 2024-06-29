import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class291 extends class71 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Ljava/lang/String;")
    public String field4180;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field4181 = 0;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Lkr;")
    public static class602 field4176 = new class602(17, 0);

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "D")
    public static double field4182;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Lgo;")
    public static class221 field4179;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Luu;")
    public static class237 field4177;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1931(byte arg0) {
        if (arg0 < 50) {
            method1931((byte) -125);
        }
        field4179 = null;
        field4176 = null;
        field4177 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class291() {
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class291(String arg0, int arg1) {
        this.field4180 = arg0;
    }
}
