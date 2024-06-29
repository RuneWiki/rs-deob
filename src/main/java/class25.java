import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class25 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lnc;")
    public class80 field583 = null;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field587 = -1;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
    public boolean field591 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    public int[] field588;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    public int[] field586;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    public int[] field584;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[I")
    public int[] field589;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
    private static int[] field582 = new int[500];

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
    private static int[] field585 = new int[500];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[I")
    private static int[] field581 = new int[500];

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[I")
    private static int[] field590 = new int[500];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V", line = 12)
    public static void method151() {
        field581 = null;
        field590 = null;
        field585 = null;
        field582 = null;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([BLnc;)V", line = 42)
    public class25(byte[] arg0, class80 arg1) {
        this.field583 = arg1;
        class104 var3 = new class104(arg0);
        class104 var4 = new class104(arg0);
        var3.field2563 = 2;
        int var5 = var3.method798((byte) -58);
        int var6 = -1;
        int var7 = 0;
        var4.field2563 = var3.field2563 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method798((byte) -92);
            if (var10 > 0) {
                if (this.field583.field1831[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field583.field1831[var11] == 0) {
                            field581[var7] = var11;
                            field590[var7] = 0;
                            field585[var7] = 0;
                            field582[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field581[var7] = var8;
                short var12 = 0;
                if (this.field583.field1831[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field590[var7] = var12;
                } else {
                    field590[var7] = var4.method788(-49152);
                }
                if ((var10 & 0x2) == 0) {
                    field585[var7] = var12;
                } else {
                    field585[var7] = var4.method788(-49152);
                }
                if ((var10 & 0x4) == 0) {
                    field582[var7] = var12;
                } else {
                    field582[var7] = var4.method788(-49152);
                }
                var6 = var8;
                var7++;
                if (this.field583.field1831[var8] == 5) {
                    this.field591 = true;
                }
            }
        }
        if (arg0.length != var4.field2563) {
            throw new RuntimeException();
        }
        this.field587 = var7;
        this.field588 = new int[var7];
        this.field586 = new int[var7];
        this.field584 = new int[var7];
        this.field589 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field588[var9] = field581[var9];
            this.field586[var9] = field590[var9];
            this.field584[var9] = field585[var9];
            this.field589[var9] = field582[var9];
        }
    }
}
