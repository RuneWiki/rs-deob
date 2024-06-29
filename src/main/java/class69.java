import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Z")
    public boolean field1764 = false;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Ld;")
    public class22 field1765 = null;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field1767 = -1;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "[I")
    public int[] field1761;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
    public int[] field1768;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
    public int[] field1770;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    public int[] field1762;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[I")
    private static int[] field1763 = new int[500];

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
    private static int[] field1766 = new int[500];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    private static int[] field1760 = new int[500];

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[I")
    private static int[] field1769 = new int[500];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
    public static void method551() {
        field1760 = null;
        field1766 = null;
        field1763 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([BLd;)V")
    public class69(byte[] arg0, class22 arg1) {
        this.field1765 = arg1;
        class157 var3 = new class157(arg0);
        class157 var4 = new class157(arg0);
        var3.field3457 = 2;
        int var5 = var3.method1194(false);
        int var6 = -1;
        int var7 = 0;
        var4.field3457 = var3.field3457 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method1194(false);
            if (var10 > 0) {
                if (this.field1765.field518[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1765.field518[var11] == 0) {
                            field1760[var7] = var11;
                            field1766[var7] = 0;
                            field1763[var7] = 0;
                            field1769[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1760[var7] = var8;
                short var12 = 0;
                if (this.field1765.field518[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1766[var7] = var12;
                } else {
                    field1766[var7] = var4.method1210(-98);
                }
                if ((var10 & 0x2) == 0) {
                    field1763[var7] = var12;
                } else {
                    field1763[var7] = var4.method1210(-76);
                }
                if ((var10 & 0x4) == 0) {
                    field1769[var7] = var12;
                } else {
                    field1769[var7] = var4.method1210(-96);
                }
                var6 = var8;
                var7++;
                if (this.field1765.field518[var8] == 5) {
                    this.field1764 = true;
                }
            }
        }
        if (arg0.length != var4.field3457) {
            throw new RuntimeException();
        }
        this.field1767 = var7;
        this.field1761 = new int[var7];
        this.field1768 = new int[var7];
        this.field1770 = new int[var7];
        this.field1762 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1761[var9] = field1760[var9];
            this.field1768[var9] = field1766[var9];
            this.field1770[var9] = field1763[var9];
            this.field1762[var9] = field1769[var9];
        }
    }
}
