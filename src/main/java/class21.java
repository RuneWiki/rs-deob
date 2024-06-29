import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class21 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lrt;")
    public static class124 field262 = new class124(0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lng;")
    public static class153 field261;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method190(byte arg0) {
        field261 = null;
        if (arg0 != -80) {
            method192(39);
        }
        field262 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIB)I")
    public static final int method191(int arg0, int arg1, byte arg2) {
        field263++;
        if (arg0 == 1 || arg0 == 3) {
            return class436.field6174[arg1 & 0x3];
        } else {
            if (arg2 <= 117) {
                field262 = null;
            }
            return class493.field6937[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method192(int arg0) {
        class378.method2320(class410.field5930, (byte) 119);
        class225.field3257++;
        if (arg0 != 3) {
            field258 = 13;
        }
        field259++;
        class230.field3390.method2592(class81.field1138, (byte) -95);
    }
}
