import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class100 extends class262 {

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    private int field1609 = 3216;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    private int field1616 = 4096;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
    private int[] field1611 = new int[3];

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
    private int field1624 = 3216;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field1621 = 127;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Lok;")
    private static class146 field1617 = class235.method1724(-12908, "Allocating memory");

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "Lok;")
    public static class146 field1620 = field1617;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[I")
    public static int[] field1612;

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 13)
    public class100() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I", line = 25)
    public final int[] method38(int arg0, byte arg1) {
        field1615++;
        if (arg1 > -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 93);
        if (this.field4350.field3333) {
            int var4 = class26.field460 * this.field1616 >> 12;
            int[] var5 = this.method1895(7, 0, class259.field4297 & arg0 - 1);
            int[] var6 = this.method1895(7, 0, arg0);
            int[] var7 = this.method1895(7, 0, arg0 + 1 & class259.field4297);
            for (int var8 = 0; var8 < class98.field1598; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[var8 - 1 & class218.field3595] - var6[var8 + 1 & class218.field3595]) * var4 >> 12;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class269.field4621[var12 + ((var10 + 1) * var10 >> 1)] & 0xFF;
                int var14 = var11 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field1611[0] * var14 >> 12;
                int var18 = this.field1611[1] * var16 >> 12;
                int var19 = this.field1611[2] * var15 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 122)
    public static void method688(int arg0) {
        field1620 = null;
        field1612 = null;
        if (arg0 < 100) {
            method688(98);
        }
        field1617 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IB)V", line = 143)
    public static final void method689(int arg0, byte arg1) {
        field1610++;
        class158 var2 = class206.method1564(arg0, 11, -103);
        var2.method1238(-57);
        if (arg1 < 38) {
            field1619 = 39;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwe;II)V", line = 172)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1616 = arg0.method379(arg1 ^ 0xFFFFF7FE);
        } else if (arg2 == 1) {
            this.field1609 = arg0.method379(arg1 - 2050);
        } else if (arg2 == 2) {
            this.field1624 = arg0.method379(-2);
        }
        if (arg1 != 2048) {
            method689(30, (byte) -94);
        }
        field1623++;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V", line = 206)
    private final void method690(int arg0) {
        field1613++;
        double var2 = Math.cos((double) ((float) this.field1624 / 4096.0F));
        if (arg0 < 74) {
            this.method38(-112, (byte) 7);
        }
        this.field1611[0] = (int) (Math.sin((double) ((float) this.field1609 / 4096.0F)) * 4096.0D * var2);
        this.field1611[1] = (int) (Math.cos((double) ((float) this.field1609 / 4096.0F)) * var2 * 4096.0D);
        this.field1611[2] = (int) (Math.sin((double) ((float) this.field1624 / 4096.0F)) * 4096.0D);
        int var4 = this.field1611[2] * this.field1611[2] >> 12;
        int var5 = this.field1611[0] * this.field1611[0] >> 12;
        int var6 = this.field1611[1] * this.field1611[1] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1611[2] = (this.field1611[2] << 12) / var7;
            this.field1611[0] = (this.field1611[0] << 12) / var7;
            this.field1611[1] = (this.field1611[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 239)
    public final void method43(int arg0) {
        if (arg0 != -2) {
            method689(70, (byte) -83);
        }
        this.method690(arg0 ^ 0xFFFFFFAB);
        field1614++;
    }
}
