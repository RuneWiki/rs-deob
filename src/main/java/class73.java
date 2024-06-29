import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field1616 = -1;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
    public boolean field1617 = false;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lg;")
    public class37 field1622 = null;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    public int[] field1618;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[I")
    public int[] field1623;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    public int[] field1625;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    public int[] field1619;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
    private static int[] field1621 = new int[500];

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[I")
    private static int[] field1624 = new int[500];

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
    private static int[] field1620 = new int[500];

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
    private static int[] field1626 = new int[500];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public static void method573() {
        field1621 = null;
        field1624 = null;
        field1626 = null;
        field1620 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([BLg;)V")
    public class73(byte[] arg0, class37 arg1) {
        this.field1622 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field2554 = 2;
        int var5 = var3.method879((byte) 45);
        int var6 = -1;
        int var7 = 0;
        var4.field2554 = var3.field2554 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method879((byte) 45);
            if (var10 > 0) {
                if (this.field1622.field845[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1622.field845[var11] == 0) {
                            field1621[var7] = var11;
                            field1624[var7] = 0;
                            field1626[var7] = 0;
                            field1620[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1621[var7] = var8;
                short var12 = 0;
                if (this.field1622.field845[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1624[var7] = var12;
                } else {
                    field1624[var7] = var4.method871(26470);
                }
                if ((var10 & 0x2) == 0) {
                    field1626[var7] = var12;
                } else {
                    field1626[var7] = var4.method871(26470);
                }
                if ((var10 & 0x4) == 0) {
                    field1620[var7] = var12;
                } else {
                    field1620[var7] = var4.method871(26470);
                }
                var6 = var8;
                var7++;
                if (this.field1622.field845[var8] == 5) {
                    this.field1617 = true;
                }
            }
        }
        if (arg0.length != var4.field2554) {
            throw new RuntimeException();
        }
        this.field1616 = var7;
        this.field1618 = new int[var7];
        this.field1623 = new int[var7];
        this.field1625 = new int[var7];
        this.field1619 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1618[var9] = field1621[var9];
            this.field1623[var9] = field1624[var9];
            this.field1625[var9] = field1626[var9];
            this.field1619[var9] = field1620[var9];
        }
    }
}
