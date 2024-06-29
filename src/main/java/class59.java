import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class59 extends RuntimeException {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljava/lang/String;")
    public String field785;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field787;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
    public static int[] field789 = new int[14];

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lmc;")
    public static class78 field790 = new class78(36, 3);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Z")
    public static boolean field791 = false;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
    public static boolean field792;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    public static int[] field793;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        field789 = null;
        field790 = null;
        if (arg0 != 3) {
            method418(30, (byte) 15);
        }
        field793 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lrt;")
    public static final class137 method418(int arg0, byte arg1) {
        field788++;
        class137[] var2 = class460.method2700(0);
        if (arg1 < 79) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class137 var4 = var2[var3];
            if (var4.field1986 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class59(Throwable arg0, String arg1) {
        this.field785 = arg1;
        this.field787 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method419(boolean arg0, String arg1) {
        if (arg0) {
            field794 = 90;
        }
        field786++;
        return class342.method1941((byte) -102, true, arg1, 10);
    }

    static {
        new class206("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field792 = false;
        field793 = new int[100];
        field794 = -2;
    }
}
