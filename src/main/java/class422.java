import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class422 {

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "Z")
    public static volatile boolean field5790;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public int field5780;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public int field5784;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public int field5788;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "[B")
    public byte[] field5782;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "[B")
    public byte[] field5786;

    static {
        new class72("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field5781 = 0;
        field5790 = true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()V", line = 9)
    public static final void method2585() {
        class71.method427(1, class238.field3149);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lwo;II)Lso;", line = 23)
    public static final class174 method2586(class285 arg0, int arg1, int arg2) {
        field5789++;
        if (arg1 != -26733) {
            field5790 = true;
        }
        byte[] var3 = arg0.method1805(arg2, true);
        return var3 == null ? null : new class174(var3);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lwo;Lwo;BZI)V", line = 45)
    public static final void method2587(class285 arg0, class285 arg1, byte arg2, boolean arg3, int arg4) {
        class279.field3615 = arg1;
        class252.field3303 = arg3;
        if (arg2 == 77) {
            field5778++;
            class423.field5800 = arg4;
            class4.field31 = arg0;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[[BLip;I[[BLuo;[[BZI[[B[[ILip;I)V", line = 62)
    public static final void method2588(int arg0, byte[][] arg1, class279 arg2, int arg3, byte[][] arg4, class118 arg5, byte[][] arg6, boolean arg7, int arg8, byte[][] arg9, int[][] arg10, class279 arg11, int arg12) {
        if (class20.field220 == arg12 && !class362.field4906) {
            class362.method2277(arg5, 3, arg11, arg10, arg1, arg0, arg2, arg8, arg6, arg4, arg9, arg7, arg3);
        } else {
            class304.method1937(arg11, arg6, arg1, arg10, arg9, arg7, arg3, arg5, arg0, arg8, arg4, (byte) 12, arg2);
        }
        field5785++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method2589(int arg0, byte arg1) {
        if (arg1 < 22) {
            field5790 = true;
        }
        field5779++;
        class12 var2 = class390.method2422(341555040, arg0, 10);
        var2.method65(-104);
    }
}
