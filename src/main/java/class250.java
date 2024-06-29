import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class250 implements Runnable {

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "[Lah;")
    public volatile class258[] field3073 = new class258[2];

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Z")
    public volatile boolean field3071 = false;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "Z")
    public volatile boolean field3075 = false;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field3068 = 0;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "Lwp;")
    public static class453 field3076 = new class453(57, 8);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "Lrj;")
    public class648 field3070;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "[Lf;")
    public static class536[] field3072;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1465(int arg0) {
        field3067++;
        int var1 = -88 % ((arg0 - 42) / 44);
        if (!class691.field9783) {
            return;
        }
        while (true) {
            while (class267.field3383 < class68.field930.length) {
                class532 var2 = class68.field930[class267.field3383];
                if (var2 != null && var2.field7177 == -1) {
                    if (class120.field1531 == null) {
                        class120.field1531 = class473.field6005.method257(var2.field7178, 93);
                    }
                    int var3 = class120.field1531.field5346;
                    if (var3 == -1) {
                        return;
                    }
                    class120.field1531 = null;
                    class267.field3383++;
                    var2.field7177 = var3;
                } else {
                    class267.field3383++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V", line = 55)
    public static void method1466(byte arg0) {
        field3072 = null;
        field3076 = null;
        if (arg0 != -17) {
            method1466((byte) 59);
        }
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V", line = 72)
    public static final void method1467(int arg0) {
        field3077++;
        if (arg0 != -17 || class595.field8376) {
            return;
        }
        if (class301.field3698.field6607) {
            class133.field1739 = ((int) class133.field1739 - 17 & 0xFFFFFFF0);
        } else {
            class304.field3757 += (-class304.field3757 - 12.0F) / 2.0F;
        }
        class595.field8376 = true;
        class365.field4649 = true;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 98)
    public static final void method1468(int arg0, boolean arg1, String arg2) {
        field3074++;
        class1.method3("", arg2, arg0, -1, "", 0, "");
        if (arg1) {
            field3072 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "run", descriptor = "()V", line = 110)
    public final void run() {
        this.field3075 = true;
        field3069++;
        try {
            while (!this.field3071) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class258 var2 = this.field3073[var1];
                    if (var2 != null) {
                        var2.method1502(-26789);
                    }
                }
                class419.method2233(-28448, 10L);
                class491.method2647(this.field3070, (byte) -50, null);
            }
        } catch (Exception var9) {
            class106.method597(null, -2, var9);
        } finally {
            Object var6 = null;
            this.field3075 = false;
        }
    }
}
