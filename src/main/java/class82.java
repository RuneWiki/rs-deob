import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class82 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "B")
    public byte field1333;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "S")
    public short field1344;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Z")
    public boolean field1335;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "S")
    public short field1336;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "B")
    public byte field1343;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "S")
    public short field1337;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1333 = (byte) arg8;
        this.field1334 = arg0;
        this.field1339 = arg1;
        this.field1345 = arg11;
        this.field1344 = (short) arg5;
        this.field1335 = arg10;
        this.field1342 = arg3;
        this.field1336 = (short) arg4;
        this.field1343 = (byte) arg7;
        this.field1341 = arg2;
        this.field1337 = (short) arg6;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static final void method628(boolean arg0) {
        class556.field7671 = new class503(8);
        field1338++;
        class496.field6937 = 0;
        for (class475 var1 = (class475) class150.field2281.method3150(16); var1 != null; var1 = (class475) class150.field2281.method3147(16)) {
            var1.method2765();
        }
        if (arg0) {
            method628(true);
        }
    }

    static {
        new class104("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
