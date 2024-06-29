import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class94 extends class16 {

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field1447 = 585;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field1452 = -1;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field1449;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "[[[I")
    public static int[][][] field1450;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V", line = 6)
    public static final void method677(int arg0) {
        field1448++;
        int var1 = 0;
        if (arg0 != 12) {
            field1452 = -105;
        }
        while (class284.field4487 > var1) {
            class147 var2 = class160.method1113(var1, (byte) -107);
            if (var2 != null && var2.field2203 == 0) {
                class17.field235[var1] = 0;
                class29.field422[var1] = 0;
            }
            var1++;
        }
        class241.field3833 = new class246(16);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)[I", line = 33)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field1452 = 80;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = class130.field1921[arg1];
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                int var6 = class27.field396[var5];
                if (var6 > this.field1447 && var6 < 4096 - this.field1447 && var4 > (2048 - this.field1447) && var4 < (this.field1447 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1447);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field1447) && var6 < this.field1447 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1447;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1447);
                } else if (var4 < this.field1447 || var4 > 4096 - this.field1447) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1447;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1447);
                } else if (this.field1447 <= var6 && var6 <= 4096 - this.field1447) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1447);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        field1445++;
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 118)
    public class94() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)V", line = 122)
    public static void method678(int arg0) {
        field1449 = null;
        if (arg0 != 8465) {
            method677(-80);
        }
        field1450 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLim;I)V", line = 143)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1447 = arg1.method1396(-25);
        }
        if (arg0 != -7) {
            field1450 = (int[][][]) ((int[][][]) null);
        }
        field1446++;
    }
}
