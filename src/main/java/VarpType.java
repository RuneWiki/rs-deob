import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WEUDDWZB")
public class VarpType {

    @OriginalMember(owner = "client!WEUDDWZB", name = "h", descriptor = "Z")
    public boolean field1513 = false;

    @OriginalMember(owner = "client!WEUDDWZB", name = "i", descriptor = "Z")
    public boolean field1514 = true;

    @OriginalMember(owner = "client!WEUDDWZB", name = "k", descriptor = "Z")
    public boolean field1516 = false;

    @OriginalMember(owner = "client!WEUDDWZB", name = "n", descriptor = "Z")
    public boolean field1519 = false;

    @OriginalMember(owner = "client!WEUDDWZB", name = "o", descriptor = "I")
    public int field1520 = -1;

    @OriginalMember(owner = "client!WEUDDWZB", name = "p", descriptor = "Z")
    public boolean field1521 = true;

    @OriginalMember(owner = "client!WEUDDWZB", name = "a", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!WEUDDWZB", name = "c", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!WEUDDWZB", name = "f", descriptor = "I")
    public int field1511;

    @OriginalMember(owner = "client!WEUDDWZB", name = "g", descriptor = "I")
    public int field1512;

    @OriginalMember(owner = "client!WEUDDWZB", name = "j", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!WEUDDWZB", name = "l", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!WEUDDWZB", name = "m", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!WEUDDWZB", name = "e", descriptor = "Ljava/lang/String;")
    public String field1510;

    @OriginalMember(owner = "client!WEUDDWZB", name = "d", descriptor = "[I")
    public static int[] field1509;

    @OriginalMember(owner = "client!WEUDDWZB", name = "b", descriptor = "[LWEUDDWZB;")
    public static VarpType[] field1507;

    @OriginalMember(owner = "client!WEUDDWZB", name = "a", descriptor = "(LATJMVOZR;I)V")
    public static void method484(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(true, arg0.method2("varp.dat", null));
        if (arg1 != 36135) {
            return;
        }
        field1508 = 0;
        field1506 = var2.g2();
        if (field1507 == null) {
            field1507 = new VarpType[field1506];
        }
        if (field1509 == null) {
            field1509 = new int[field1506];
        }
        for (int var3 = 0; var3 < field1506; var3++) {
            if (field1507[var3] == null) {
                field1507[var3] = new VarpType();
            }
            field1507[var3].method485(-954, var3, var2);
        }
        if (var2.data.length != var2.pos) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!WEUDDWZB", name = "a", descriptor = "(IILMFMVIYHT;)V")
    public void method485(int arg0, int arg1, Packet arg2) {
        if (arg0 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg2.g1();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1511 = arg2.g1();
            } else if (var4 == 2) {
                this.field1512 = arg2.g1();
            } else if (var4 == 3) {
                this.field1513 = true;
                field1509[field1508++] = arg1;
            } else if (var4 == 4) {
                this.field1514 = false;
            } else if (var4 == 5) {
                this.field1515 = arg2.g2();
            } else if (var4 == 6) {
                this.field1516 = true;
            } else if (var4 == 7) {
                this.field1517 = arg2.g4();
            } else if (var4 == 8) {
                this.field1518 = 1;
                this.field1519 = true;
            } else if (var4 == 10) {
                this.field1510 = arg2.gjstr();
            } else if (var4 == 11) {
                this.field1519 = true;
            } else if (var4 == 12) {
                this.field1520 = arg2.g4();
            } else if (var4 == 13) {
                this.field1518 = 2;
                this.field1519 = true;
            } else if (var4 == 14) {
                this.field1521 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
