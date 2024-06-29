import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class560 implements class186 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Lnd;")
    private class547 field7900;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Ljava/lang/String;")
    private String field7901;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lhg;")
    public static class693 field7896 = new class693(62, 3);

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Lhg;")
    public static class693 field7899 = new class693(30, 7);

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Lkg;")
    public static class275 field7903 = new class275(78, 0);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lnd;")
    public static class547 field7904;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Lqia;")
    public final class21 method1249(int arg0) {
        if (arg0 != -32660) {
            method3240(-86, -89, 90);
        }
        field7897++;
        return class21.field379;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lnd;Ljava/lang/String;)V")
    public class560(class547 arg0, String arg1) {
        this.field7900 = arg0;
        this.field7901 = arg1;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static void method3239(int arg0) {
        field7903 = null;
        field7904 = null;
        if (arg0 != 2048) {
            method3239(19);
        }
        field7899 = null;
        field7896 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
    public static final boolean method3240(int arg0, int arg1, int arg2) {
        if (arg2 < 47) {
            field7903 = null;
        }
        field7898++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
    public final int method1248(int arg0) {
        field7902++;
        if (this.field7900.method3156(true, this.field7901)) {
            return 100;
        } else {
            if (arg0 != 27076) {
                this.method1248(-79);
            }
            return this.field7900.method3152((byte) 95, this.field7901);
        }
    }
}
