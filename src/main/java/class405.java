import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class405 extends class352 {

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field5893;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[F")
    public static float[] field5885 = new float[4];

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "F")
    public static float field5888;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "Lig;")
    public static class154 field5890;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[S")
    public static short[] field5892;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)V")
    public static final void method2401(long arg0, int arg1) {
        field5891++;
        class230.field3508.field585 = 0;
        class230.field3508.method221(-1, class247.field3793.field3849);
        class230.field3508.method261((byte) 12, arg0);
        class390.field5712 = 0;
        if (arg1 != 8747) {
            method2401(97L, 119);
        }
        class407.field5909 = -3;
        class74.field1320 = 1;
        class284.field4292 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lah;Ljava/lang/Object;I)V")
    public class405(class250 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5893 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
    public static void method2402(int arg0) {
        field5892 = null;
        field5890 = null;
        field5885 = null;
        if (arg0 != -16108) {
            method2403(-69, 29, (byte) 16, 28);
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z")
    public final boolean method1782(byte arg0) {
        int var2 = -102 / ((arg0 + 34) / 61);
        field5889++;
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBI)I")
    public static final int method2403(int arg0, int arg1, byte arg2, int arg3) {
        field5886++;
        int var4 = arg3 & 0x3;
        if (arg2 <= 5) {
            field5890 = null;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1783(byte arg0) {
        if (arg0 == -72) {
            field5887++;
            return this.field5893;
        } else {
            return null;
        }
    }
}
