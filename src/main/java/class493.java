import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class493 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[Lada;")
    public static class258[] field7445 = new class258[100];

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lwo;")
    public static class408 field7446 = new class408();

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "F")
    public static float field7442;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Ldda;")
    public static class597 field7443;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
    public static final int method2984(int arg0, byte arg1) {
        field7447++;
        int var2 = 123 / ((arg1 + 61) / 41);
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method2985(int arg0) {
        field7445 = null;
        if (arg0 != 127) {
            method2984(-125, (byte) -95);
        }
        field7443 = null;
        field7446 = null;
    }
}
