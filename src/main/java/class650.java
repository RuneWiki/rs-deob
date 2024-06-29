import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class650 extends class627 {

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "Lmq;")
    public static class78 field8931 = new class78(36, 6);

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "[J")
    public static long[] field8934 = new long[32];

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "Lbba;")
    public static class721 field8933 = new class721();

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    public int field8929;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    public int field8930;

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "Lus;")
    public class328 field8932;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "Ldfa;")
    public class757 field8928;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZB)V")
    public static final void method3509(boolean arg0, byte arg1) {
        if (class426.field6057 != null) {
            class426.field6057.method872(-1);
            class426.field6057 = null;
        }
        field8926++;
        class575.field8031 = 0;
        class326.method1932(arg1 ^ 0xFFFFFFB6);
        class569.method3202();
        for (int var2 = 0; var2 < 4; var2++) {
            class410.field5786[var2].method3794(-94);
        }
        class676.method3638(-1, false);
        System.gc();
        class750.method4190(2, true);
        class537.field7549 = false;
        class601.field8357 = -1;
        class519.method2979((byte) -115);
        class301.method1774(true, 8);
        if (arg1 != -74) {
            method3511(37);
        }
        class108.field1336 = 0;
        class753.field10509 = 0;
        class63.field851 = 0;
        class509.field7194 = 0;
        class506.field7142 = 0;
        class237.field3071 = 0;
        for (int var3 = 0; var3 < class498.field7043.length; var3++) {
            class498.field7043[var3] = null;
        }
        class630.method3430((byte) -121);
        for (int var4 = 0; var4 < 2048; var4++) {
            class447.field6287[var4] = null;
        }
        class443.field6200 = 0;
        class563.field7875.method3251(false);
        class676.field9195 = 0;
        class497.field7028.method3251(false);
        class241.method1503(arg1 ^ 0xFFFFEE5B);
        class214.field2716 = 0;
        class461.field6637.method1680(-82);
        class350.method2056(true);
        class221.method1430((byte) 61);
        class761.field10597 = 0L;
        class130.field1565 = null;
        if (arg0) {
            class614.method3369(12, (byte) -54);
            return;
        }
        class614.method3369(3, (byte) -73);
        try {
            class193.method1213(-13481, "loggedout", class745.field10393);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public final void method3510(int arg0) {
        field8927++;
        if (class477.field6820 < class66.field878.length) {
            class66.field878[class477.field6820++] = this;
            if (arg0 != 12) {
                this.method3510(108);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
    public static void method3511(int arg0) {
        field8934 = null;
        field8931 = null;
        if (arg0 >= 25) {
            field8933 = null;
        }
    }
}
