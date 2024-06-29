import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class90 {

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
    public boolean field1586 = false;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public int field1588 = -1;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lsc;")
    public class166 field1585 = null;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
    public int[] field1579;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[I")
    public int[] field1584;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public int[] field1583;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[I")
    public int[] field1578;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[I")
    private static int[] field1580 = new int[500];

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[I")
    private static int[] field1582 = new int[500];

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
    private static int[] field1587 = new int[500];

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    private static int[] field1581 = new int[500];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
    public static void method550() {
        field1580 = null;
        field1582 = null;
        field1587 = null;
        field1581 = null;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([BLsc;)V")
    public class90(byte[] arg0, class166 arg1) {
        this.field1585 = arg1;
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        var3.field2170 = 2;
        int var5 = var3.method767(true);
        int var6 = -1;
        int var7 = 0;
        var4.field2170 = var3.field2170 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method767(true);
            if (var10 > 0) {
                if (this.field1585.field3185[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1585.field3185[var11] == 0) {
                            field1580[var7] = var11;
                            field1582[var7] = 0;
                            field1587[var7] = 0;
                            field1581[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1580[var7] = var8;
                short var12 = 0;
                if (this.field1585.field3185[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1582[var7] = var12;
                } else {
                    field1582[var7] = var4.method794((byte) 21);
                }
                if ((var10 & 0x2) == 0) {
                    field1587[var7] = var12;
                } else {
                    field1587[var7] = var4.method794((byte) 21);
                }
                if ((var10 & 0x4) == 0) {
                    field1581[var7] = var12;
                } else {
                    field1581[var7] = var4.method794((byte) 21);
                }
                var6 = var8;
                var7++;
                if (this.field1585.field3185[var8] == 5) {
                    this.field1586 = true;
                }
            }
        }
        if (arg0.length != var4.field2170) {
            throw new RuntimeException();
        }
        this.field1588 = var7;
        this.field1579 = new int[var7];
        this.field1584 = new int[var7];
        this.field1583 = new int[var7];
        this.field1578 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1579[var9] = field1580[var9];
            this.field1584[var9] = field1582[var9];
            this.field1583[var9] = field1587[var9];
            this.field1578[var9] = field1581[var9];
        }
    }
}
