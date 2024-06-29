import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZQTIEXZH")
public class VarbitType {

    @OriginalMember(owner = "client!ZQTIEXZH", name = "h", descriptor = "Z")
    public boolean field1765 = false;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "i", descriptor = "I")
    public int field1766 = -1;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "k", descriptor = "Z")
    public boolean field1768 = true;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "a", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "b", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "e", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "f", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "g", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "j", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "d", descriptor = "Ljava/lang/String;")
    public String field1761;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "c", descriptor = "[LZQTIEXZH;")
    public static VarbitType[] field1760;

    @OriginalMember(owner = "client!ZQTIEXZH", name = "a", descriptor = "(LATJMVOZR;I)V")
    public static void method602(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(true, arg0.method2("varbit.dat", null));
        if (arg1 != 36135) {
            return;
        }
        field1759 = var2.g2();
        if (field1760 == null) {
            field1760 = new VarbitType[field1759];
        }
        for (int var3 = 0; var3 < field1759; var3++) {
            if (field1760[var3] == null) {
                field1760[var3] = new VarbitType();
            }
            field1760[var3].method603(-954, var3, var2);
            if (field1760[var3].field1765) {
                VarpType.field1507[field1760[var3].field1762].field1519 = true;
            }
        }
        if (var2.data.length != var2.pos) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!ZQTIEXZH", name = "a", descriptor = "(IILMFMVIYHT;)V")
    public void method603(int arg0, int arg1, Packet arg2) {
        if (arg0 >= 0) {
            this.field1758 = -151;
        }
        while (true) {
            int var4 = arg2.g1();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1762 = arg2.g2();
                this.field1763 = arg2.g1();
                this.field1764 = arg2.g1();
            } else if (var4 == 10) {
                this.field1761 = arg2.gjstr();
            } else if (var4 == 2) {
                this.field1765 = true;
            } else if (var4 == 3) {
                this.field1766 = arg2.g4();
            } else if (var4 == 4) {
                this.field1767 = arg2.g4();
            } else if (var4 == 5) {
                this.field1768 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
