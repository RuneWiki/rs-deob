import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class391 extends class132 {

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Ltt;")
    public class77 field5529;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "Ldv;")
    public static class566 field5531 = new class566(1, 3);

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public static void method2351(int arg0) {
        if (arg0 == 10108) {
            field5531 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lgn;[[BI)V")
    public static final void method2352(class600 arg0, byte[][] arg1, int arg2) {
        if (arg2 < 50) {
            return;
        }
        field5527++;
        int var3 = class219.field3132.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class183.field2585[var4] >> 8) * 64 - class519.field7304;
                int var7 = (class183.field2585[var4] & 0xFF) * 64 - class6.field80;
                class184.method1146(-106);
                arg0.method3535(class428.field6075, (byte) -31, class69.field1165, var6, var7, var5);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)Z")
    public static final boolean method2353(int arg0, int arg1, int arg2) {
        int var3 = -125 / ((arg0 + 63) / 46);
        field5530++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ltt;)V")
    public class391(class77 arg0) {
        this.field5529 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method2354(int arg0) {
        field5528++;
        if (class483.field6820 || class401.field5717 == null) {
            return "";
        } else {
            if (arg0 != 0) {
                method2351(40);
            }
            return class401.field5717.field6289;
        }
    }
}
