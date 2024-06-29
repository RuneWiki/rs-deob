import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class95 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Lmp;")
    public class95 field1328;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Ljd;")
    public class361 field1318;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field1324 = 0;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field1325 = -1;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Lpf;")
    public static class425 field1323 = new class425(3, 3);

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Lnn;")
    public static class151 field1329 = new class151("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Liq;")
    public static class134 field1330;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static void method622(int arg0) {
        field1323 = null;
        field1329 = null;
        field1330 = null;
        if (arg0 != 3) {
            field1327 = -10;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(II)V")
    public class95(int arg0, int arg1) {
        this.field1320 = arg1;
        this.field1322 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lmp;I)V")
    public class95(class95 arg0, int arg1) {
        this.field1328 = arg0;
        this.field1318 = this.field1328.field1318;
        this.field1320 = this.field1328.field1320 + arg1;
        this.field1322 = this.field1328.field1322;
    }
}
