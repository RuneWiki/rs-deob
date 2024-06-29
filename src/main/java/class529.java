import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public abstract class class529 extends class627 {

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "Z")
    public boolean field7461;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "[Luu;")
    public class529[] field7469;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "D")
    public static double field7466;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "F")
    public static float field7465;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public int field7454;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "Luea;")
    public class272 field7456;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "Lmga;")
    public class363 field7450;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "[I")
    public static int[] field7463;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)I", line = 4)
    public int method2606(int arg0) {
        if (arg0 != 29543) {
            field7463 = null;
        }
        field7462++;
        return -1;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 20)
    public static final void method3024(int arg0) {
        if (arg0 > -32) {
            return;
        }
        class304.field3930 = 0;
        class117.field1427 = 0;
        field7467++;
        for (int var1 = 0; var1 < class665.field9109; var1++) {
            int var2 = class680.field9231 * var1;
            for (int var3 = 0; var3 < class680.field9231; var3++) {
                int var4 = var2 + var3;
                class641.field8860[var4].method335(class112.field1383 * var3, class664.field9087 * var1, class112.field1383, class664.field9087, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[[I", line = 62)
    public int[][] method592(int arg0, int arg1) {
        field7458++;
        if (arg1 != 2) {
            field7463 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V", line = 75)
    public void method303(int arg0) {
        field7457++;
        if (arg0 >= -92) {
            this.method2606(44);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V", line = 87)
    public void method2607(int arg0, int arg1, int arg2) {
        field7464++;
        int var4 = ~this.field7454 == arg0 ? arg1 : this.field7454;
        if (this.field7461) {
            this.field7456 = new class272(var4, arg1, arg2);
        } else {
            this.field7450 = new class363(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 108)
    public static void method3025(byte arg0) {
        field7463 = null;
        if (arg0 > -34) {
            method3024(-44);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLtn;)V", line = 118)
    public void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 > 45) {
            field7451++;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)[I", line = 133)
    public int[] method191(int arg0, byte arg1) {
        field7455++;
        int var3 = 111 % ((arg1 - 27) / 49);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)[[I", line = 144)
    public final int[][] method3026(int arg0, int arg1, int arg2) {
        if (arg2 != 18464) {
            this.method3026(-81, -12, -27);
        }
        field7459++;
        if (this.field7469[arg0].field7461) {
            int[] var4 = this.field7469[arg0].method191(arg1, (byte) -50);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field7469[arg0].method592(arg1, arg2 ^ 0x4822);
        }
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)I", line = 179)
    public int method3027(int arg0) {
        if (arg0 == 20152) {
            field7460++;
            return -1;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V", line = 192)
    public void method2608(byte arg0) {
        if (arg0 > -20) {
            return;
        }
        if (this.field7461) {
            this.field7456.method1632(false);
            this.field7456 = null;
        } else {
            this.field7450.method2245(-124);
            this.field7450 = null;
        }
        field7452++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BII)[I", line = 217)
    public final int[] method3028(byte arg0, int arg1, int arg2) {
        field7453++;
        if (arg0 <= 101) {
            field7463 = null;
        }
        return this.field7469[arg2].field7461 ? this.field7469[arg2].method191(arg1, (byte) -72) : this.field7469[arg2].method592(arg1, 2)[0];
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IZ)V", line = 239)
    public class529(int arg0, boolean arg1) {
        this.field7461 = arg1;
        this.field7469 = new class529[arg0];
    }
}
