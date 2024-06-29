import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class195 {

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "Z")
    public static boolean field2997 = false;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "Lbu;")
    public static class21 field2996 = new class21(45, 4);

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "Lvk;")
    public static class387 field2998 = new class387(0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "Lmda;")
    public static class276 field2999;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "[Lcv;")
    public static class593[] field3000;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public static void method1353(int arg0) {
        field2996 = null;
        field3000 = null;
        field2999 = null;
        if (arg0 != 0) {
            field3000 = null;
        }
        field2998 = null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BZ)V")
    public static final void method1354(byte arg0, boolean arg1) {
        field2995++;
        if (class527.field7529 != null) {
            class527.field7529.method612((byte) -60);
            class527.field7529 = null;
        }
        class613.method3559(-6878);
        if (arg0 != -61) {
            method1353(7);
        }
        class449.method2678(arg0 + 61);
        class622.method3585();
        for (int var2 = 0; var2 < 4; var2++) {
            class346.field4838[var2].method1772(arg0 + 24815);
        }
        class92.method681((byte) -101, false);
        System.gc();
        class688.method3878((byte) -91, 2);
        class577.field8137 = -1;
        class169.field2642 = false;
        class753.method4192(21);
        class433.method2596(-67, true);
        class436.field5884 = 0;
        class432.field5849 = 0;
        class88.field999 = 0;
        class472.field6621 = 0;
        class589.field8315 = 0;
        class124.field1922 = 0;
        for (int var3 = 0; var3 < class693.field9665.length; var3++) {
            class693.field9665[var3] = null;
        }
        class534.method3220((byte) -17);
        for (int var4 = 0; var4 < 2048; var4++) {
            class767.field10560[var4] = null;
        }
        class235.field3545 = 0;
        class645.field9014.method2240(-108);
        class36.field483 = 0;
        class250.field3692.method2240(90);
        class202.method1415(24828);
        class234.field3518 = 0;
        class537.field7727.method4138(-124);
        class749.method4170(-128);
        class235.method1574(0);
        class393.field5405 = null;
        class262.field3846 = null;
        class714.field9901 = 0L;
        class259.field3811 = null;
        class673.field9377 = null;
        field2999 = null;
        if (arg1) {
            class225.method1539(false, 12);
            return;
        }
        class225.method1539(false, 3);
        try {
            class323.method2083(-10217, "loggedout", class319.field4527);
        } catch (Throwable var5) {
        }
    }
}
