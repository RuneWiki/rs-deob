import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class189 extends class447 {

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field2617 = 0;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2622 = "Checking for updates - ";

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field2624 = 0;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "[I")
    public static int[] field2626 = new int[4096];

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2620 = "Started 3d Library";

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BD)V")
    public static final void method1237(byte arg0, double arg1) {
        if (arg0 != -74) {
            return;
        }
        field2618++;
        if (class344.field4807 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class69.field1080[var3] = var4 > 255 ? 255 : var4;
        }
        class344.field4807 = arg1;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BIIIZ)V")
    public static final void method1238(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2621++;
        if (arg0 == -36 && class77.method545(true, arg1)) {
            class323.method2041(arg2, class333.field4511[arg1], -1, arg3, arg4, 20069);
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)Z")
    public abstract boolean method1239(int arg0);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lpo;Z)V")
    public static final void method1240(class331 arg0, boolean arg1) {
        field2625++;
        arg0.field4484 = null;
        if (arg1 && class373.field5321 < 20) {
            class378.field5393.method2310(arg0, -12918);
            class373.field5321++;
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(B)V")
    public static void method1241(byte arg0) {
        if (arg0 != 124) {
            field2619 = -2;
        }
        field2622 = null;
        field2620 = null;
        field2626 = null;
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1242(int arg0);
}
