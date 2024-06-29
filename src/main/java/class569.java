import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class569 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[S")
    private static short[] field7185 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "[S")
    private static short[] field7191 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Z")
    public static volatile boolean field7188 = false;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "[S")
    private static short[] field7194 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[S")
    private static short[] field7190 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[[S")
    public static short[][] field7187 = new short[][] { field7185, field7190, field7191, field7194 };

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lbj;")
    public class569 field7189;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lhd;")
    public class620 field7193;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILft;)V", line = 3)
    public static final void method3062(int arg0, class727 arg1) {
        field7186++;
        if (arg0 != -10290) {
            field7191 = null;
        }
        for (class53 var2 = (class53) class418.field5515.method3591(arg0 ^ 0xFFFFD7CE); var2 != null; var2 = (class53) class418.field5515.method3600((byte) 37)) {
            if (var2.field682 == arg1) {
                if (var2.field686 != null) {
                    class1.field10.method30(var2.field686);
                    var2.field686 = null;
                }
                var2.method1946(-10364);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 43)
    public static void method3063(int arg0) {
        field7187 = null;
        field7190 = null;
        field7185 = null;
        field7191 = null;
        int var1 = 111 / ((13 - arg0) / 62);
        field7194 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 59)
    public final void method3064(byte arg0) {
        field7192++;
        if (class511.field6525 >= 500) {
            return;
        }
        this.field7193 = null;
        this.field7189 = class207.field2845;
        class511.field6525++;
        class207.field2845 = this;
        if (arg0 != -57) {
            this.method3064((byte) -56);
        }
    }
}
