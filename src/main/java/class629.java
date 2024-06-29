import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class629 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field9202;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Llc;")
    public static class629 field9205 = new class629(1);

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Llc;")
    public static class629 field9206 = new class629(2);

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Llc;")
    public static class629 field9207 = new class629(4);

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Llc;")
    public static class629 field9208 = new class629(1);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Llc;")
    public static class629 field9209 = new class629(2);

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Llc;")
    public static class629 field9210 = new class629(4);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Llc;")
    public static class629 field9211 = new class629(2);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Llc;")
    public static class629 field9212 = new class629(4);

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[I")
    public static int[] field9214 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZIIIIFI)[I")
    public static final int[] method3667(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7) {
        field9204++;
        int[] var8 = new int[arg4];
        class196 var9 = new class196();
        var9.field2946 = arg0;
        var9.field2954 = arg7;
        var9.field2962 = arg2;
        var9.field2947 = (int) (arg6 * 4096.0F);
        var9.field2955 = arg3;
        var9.field2963 = arg1;
        var9.method212(-19103);
        class335.method2094(-28, arg5, arg4);
        var9.method1269(var8, 0, (byte) -103);
        return var8;
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9203++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method3668(int arg0) {
        field9211 = null;
        field9210 = null;
        if (arg0 != 1) {
            method3668(80);
        }
        field9208 = null;
        field9212 = null;
        field9205 = null;
        field9207 = null;
        field9209 = null;
        field9214 = null;
        field9206 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
    private class629(int arg0) {
        this.field9202 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method3669(int arg0) {
        field9201++;
        class212.method1374(class94.field1158.field300, (byte) -1, 2, 22050);
        class648.field9399 = new class427();
        class648.field9399.method2543(128, -1672502902, 9);
        if (arg0 <= 111) {
            field9212 = null;
        }
        class94.field1170 = class292.method1819(class328.field4850, 0, class110.field1401, 22050, 256);
        class94.field1170.method1656(-69, class648.field9399);
        class342.method2118(class163.field2180, class577.field8509, 0, class648.field9399, class197.field2968);
        class178.field2704 = class292.method1819(class328.field4850, 1, class110.field1401, 2048, 256);
        class105.field1321 = new class332();
        class178.field2704.method1656(-71, class105.field1321);
        class371.field5359 = new class104(22050, class36.field419);
        class384.field5626 = class524.field7765.method3478(-1, "scape main");
    }
}
