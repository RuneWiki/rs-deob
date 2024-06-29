import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class16 extends class141 {

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public int field155 = 0;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "[Lgg;")
    public class69[] field158 = new class69[5];

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "[I")
    public int[] field174 = new int[5];

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lhi;")
    public static class82 field143 = class95.method664((byte) -40, ")4a=");

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lhi;")
    private static class82 field142 = class95.method664((byte) -80, "");

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Lhi;")
    public static class82 field144 = field142;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lhi;")
    public static class82 field145 = class95.method664((byte) -98, "glissement:");

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "Z")
    public static boolean field149 = true;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "B")
    public byte field167;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "Ltf;")
    public class123 field161;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "Lrk;")
    public class16 field170;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "Lq;")
    public class182 field172;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "Lid;")
    public class256 field150;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "Leg;")
    public class41 field157;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Lc;")
    public class72 field164;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "Lhm;")
    public class88 field166;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lem;")
    public class90 field171;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "Z")
    public boolean field160;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "Z")
    public boolean field162;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "Z")
    public boolean field169;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[Lti;")
    public static class186[] field147;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 20)
    public static void method94(int arg0) {
        field145 = null;
        field147 = null;
        if (arg0 == 0) {
            field142 = null;
            field144 = null;
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V", line = 41)
    public static final void method95(int arg0) {
        class143.method969((byte) -98, false);
        field173++;
        System.gc();
        if (arg0 != 0) {
            field146 = 92;
        }
        class292.method2014(28, 25);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(III)V", line = 70)
    public class16(int arg0, int arg1, int arg2) {
        this.field159 = this.field163 = arg0;
        this.field153 = arg1;
        this.field152 = arg2;
    }
}
