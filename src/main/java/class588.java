import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class588 extends class339 {

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "Lfk;")
    public class118 field8110;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "Lvi;")
    public class632 field8117;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "Leba;")
    public static class550 field8115 = new class550(73, 7);

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "[I")
    public static int[] field8120 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "[I")
    public static int[] field8121 = new int[4096];

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "F")
    public static float field8118;

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
    public int field8108;

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
    public int field8112;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    public int field8113;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    public int field8114;

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public int field8119;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(IJ)V", line = 6)
    public static final void method3253(int arg0, long arg1) {
        field8111++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == (long) arg0) {
            class308.method1816((byte) -115, arg1 - 1L);
            class308.method1816((byte) -115, 1L);
        } else {
            class308.method1816((byte) -115, arg1);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V", line = 30)
    public final void method3254(boolean arg0) {
        this.field8119 = this.field8110.field1501;
        field8116++;
        this.field8112 = this.field8110.field1506;
        this.field8108 = this.field8110.field1503;
        if (this.field8110.field1494 != null) {
            this.field8110.field1494.method358(this.field8117.field8756, this.field8117.field8739, this.field8117.field8748, class6.field60);
        }
        this.field8114 = class6.field60[0];
        this.field8113 = class6.field60[2];
        if (arg0) {
            this.field8112 = -112;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 53)
    public static void method3255(int arg0) {
        field8121 = null;
        field8115 = null;
        field8120 = null;
        if (arg0 != 10) {
            field8120 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)Ljava/lang/String;", line = 65)
    public static final String method3256(byte arg0) {
        field8109++;
        String var1 = "www";
        if (class480.field6673 == class28.field411) {
            var1 = "www-wtrc";
        } else if (class480.field6673 == class392.field5250) {
            var1 = "www-wtqa";
        } else if (class85.field1021 == class480.field6673) {
            var1 = "www-wtwip";
        }
        if (arg0 != -102) {
            return null;
        }
        String var2 = "";
        if (class291.field3850 != null) {
            var2 = "/p=" + class291.field3850;
        }
        return "http://" + var1 + "." + class508.field7015.field8978 + ".com/l=" + class422.field5539 + "/a=" + class190.field2640 + var2 + "/";
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lfk;Lii;)V", line = 105)
    public class588(class118 arg0, class514 arg1) {
        this.field8110 = arg0;
        this.field8117 = this.field8110.method690((byte) 72);
        this.method3254(false);
    }
}
