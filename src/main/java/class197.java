import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class197 extends class141 {

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field3253;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "Luf;")
    public static class168 field3258 = class148.method1019(-1720, ")4");

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "Luf;")
    public static class168 field3257 = class148.method1019(-1720, "(U(Y");

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Luf;")
    public static class168 field3259 = class148.method1019(-1720, "zap");

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Lk;")
    public static class36 field3252 = new class36(128);

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "[I")
    public static int[] field3261 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field3262 = 0;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field3263 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V", line = 4)
    public static void method1389(byte arg0) {
        if (arg0 <= 89) {
            method1391((byte) -14, -118);
        }
        field3258 = null;
        field3261 = null;
        field3257 = null;
        field3259 = null;
        field3252 = null;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)Z", line = 19)
    public final boolean method974(int arg0) {
        if (arg0 != 0) {
            field3257 = (class168) null;
        }
        field3256++;
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 30)
    public class197(Object arg0) {
        this.field3253 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 40)
    public final Object method972(int arg0) {
        if (arg0 != -3490) {
            field3259 = (class168) null;
        }
        field3255++;
        return this.field3253;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V", line = 65)
    public static final void method1390(int arg0) {
        class231.field3724 = arg0;
        for (int var1 = 0; var1 < class117.field1821; var1++) {
            for (int var2 = 0; var2 < class244.field4160; var2++) {
                if (class92.field1424[arg0][var1][var2] == null) {
                    class92.field1424[arg0][var1][var2] = new class127(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V", line = 93)
    public static final void method1391(byte arg0, int arg1) {
        class205 var2 = class159.field2509;
        synchronized (class159.field2509) {
            if (arg0 >= -33) {
                return;
            }
            class68.field902 = arg1;
        }
        field3254++;
    }
}
