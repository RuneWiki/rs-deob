import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class112 extends class354 {

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "Z")
    public static boolean field1562 = false;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "[[F")
    public static float[][] field1561 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "Lwi;")
    public static class330 field1560 = new class330(260);

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "Lwh;")
    public static class101 field1566 = new class101("WIP", 2);

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "Lla;")
    public static class319 field1568 = new class319(81, 7);

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "Lgw;")
    public static class117 field1564;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        if (arg0 >= -74) {
            method700((byte) 96);
        }
        field1563++;
        return class195.field2616;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BJLqa;)V")
    public static final void method699(byte arg0, long arg1, class165 arg2) {
        field1565++;
        class467.field6963 = 0;
        class224.field3111 = class457.field6849;
        if (arg0 < 15) {
            field1566 = null;
        }
        class457.field6849 = 0;
        long var4 = class58.method427((byte) -19);
        for (class228 var6 = (class228) class11.field184.method3040(false); var6 != null; var6 = (class228) class11.field184.method3043((byte) -125)) {
            if (var6.method1524(arg2, arg1)) {
                class467.field6963++;
            }
        }
        if (class454.field6839 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class11.field184.method3048(125) + ", running: " + class467.field6963 + ". Particles: " + class457.field6849 + ". Time taken: " + (class58.method427((byte) -19) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
    public static void method700(byte arg0) {
        field1564 = null;
        field1566 = null;
        if (arg0 != 69) {
            method699((byte) 67, 105L, null);
        }
        field1561 = null;
        field1568 = null;
        field1560 = null;
    }
}
