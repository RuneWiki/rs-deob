import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class35 extends RuntimeException {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field816;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Ljava/lang/String;")
    public String field827;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field820 = 0;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lgg;")
    public static class63 field821 = class116.method911(43, "Registrierter Benutzer");

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lgg;")
    private static class63 field823 = class116.method911(43, "wave:");

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lgg;")
    public static class63 field822 = field823;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lgg;")
    public static class63 field824 = class116.method911(43, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lgg;")
    public static class63 field817 = field823;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field819 = 99;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
    public static int[] field825;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[[S")
    public static short[][] field826;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method324(int arg0) {
        field824 = null;
        field821 = null;
        field825 = null;
        field826 = null;
        field823 = null;
        if (arg0 != 99) {
            field817 = null;
        }
        field822 = null;
        field817 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZI)I")
    public static final int method325(int arg0, boolean arg1, int arg2) {
        field818++;
        if (arg1) {
            return -105;
        }
        class90 var3 = (class90) class110.field2484.method694(-23979, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field2102.length) {
            return var3.field2102[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class35(Throwable arg0, String arg1) {
        this.field816 = arg0;
        this.field827 = arg1;
    }
}
