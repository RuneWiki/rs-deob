import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lgd;")
    public class40 field1698 = null;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field1704 = -1;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Z")
    public boolean field1703 = false;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
    public int[] field1697;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
    public int[] field1701;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
    public int[] field1707;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
    public int[] field1702;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    private static int[] field1706 = new int[500];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    private static int[] field1700 = new int[500];

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[I")
    private static int[] field1705 = new int[500];

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    private static int[] field1699 = new int[500];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 9)
    public static void method504() {
        field1705 = null;
        field1699 = null;
        field1706 = null;
        field1700 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BLgd;)V", line = 42)
    public class73(byte[] arg0, class40 arg1) {
        this.field1698 = arg1;
        class113 var3 = new class113(arg0);
        class113 var4 = new class113(arg0);
        var3.field2507 = 2;
        int var5 = var3.method821(true);
        int var6 = -1;
        int var7 = 0;
        var4.field2507 = var3.field2507 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method821(true);
            if (var10 > 0) {
                if (this.field1698.field896[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1698.field896[var11] == 0) {
                            field1705[var7] = var11;
                            field1699[var7] = 0;
                            field1706[var7] = 0;
                            field1700[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1705[var7] = var8;
                short var12 = 0;
                if (this.field1698.field896[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1699[var7] = var12;
                } else {
                    field1699[var7] = var4.method831(23138);
                }
                if ((var10 & 0x2) == 0) {
                    field1706[var7] = var12;
                } else {
                    field1706[var7] = var4.method831(23138);
                }
                if ((var10 & 0x4) == 0) {
                    field1700[var7] = var12;
                } else {
                    field1700[var7] = var4.method831(23138);
                }
                var6 = var8;
                var7++;
                if (this.field1698.field896[var8] == 5) {
                    this.field1703 = true;
                }
            }
        }
        if (arg0.length != var4.field2507) {
            throw new RuntimeException();
        }
        this.field1704 = var7;
        this.field1697 = new int[var7];
        this.field1701 = new int[var7];
        this.field1707 = new int[var7];
        this.field1702 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1697[var9] = field1705[var9];
            this.field1701[var9] = field1699[var9];
            this.field1707[var9] = field1706[var9];
            this.field1702[var9] = field1700[var9];
        }
    }
}
