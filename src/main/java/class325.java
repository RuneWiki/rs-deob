import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class325 extends class101 {

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
    public boolean field4738;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "[Lle;")
    public class325[] field4729;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public int field4739;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Luh;")
    public class177 field4733;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lga;")
    public class425 field4727;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIB)[I", line = 4)
    public final int[] method2062(int arg0, int arg1, byte arg2) {
        field4735++;
        if (arg2 == 33) {
            return this.field4729[arg1].field4738 ? this.field4729[arg1].method100((byte) 115, arg0) : this.field4729[arg1].method360(arg0, (byte) -9)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 27)
    public void method101(boolean arg0) {
        field4730++;
        if (!arg0) {
            this.field4733 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V", line = 43)
    public void method414(int arg0, int arg1, int arg2) {
        if (arg2 != -8740) {
            this.method100((byte) -103, 48);
        }
        field4737++;
        int var4 = this.field4739 == 255 ? arg1 : this.field4739;
        if (this.field4738) {
            this.field4727 = new class425(var4, arg1, arg0);
        } else {
            this.field4733 = new class177(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I", line = 71)
    public int[] method100(byte arg0, int arg1) {
        field4728++;
        if (arg0 < 21) {
            this.method414(-79, -9, 20);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljp;IB)V", line = 82)
    public void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            this.field4733 = null;
        }
        field4726++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)[[I", line = 92)
    public final int[][] method2063(int arg0, int arg1, int arg2) {
        field4736++;
        if (arg1 != 1) {
            this.field4733 = null;
        }
        if (this.field4729[arg0].field4738) {
            int[] var4 = this.field4729[arg0].method100((byte) 118, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4729[arg0].method360(arg2, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I", line = 124)
    public int[][] method360(int arg0, byte arg1) {
        field4734++;
        if (arg1 != -9) {
            this.field4733 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I", line = 137)
    public int method2064(byte arg0) {
        if (arg0 == -17) {
            field4731++;
            return -1;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)I", line = 149)
    public int method416(byte arg0) {
        field4740++;
        if (arg0 > -74) {
            this.field4738 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 163)
    public void method417(int arg0) {
        if (this.field4738) {
            this.field4727.method2604((byte) 95);
            this.field4727 = null;
        } else {
            this.field4733.method1250(2);
            this.field4733 = null;
        }
        field4732++;
        if (arg0 != -31278) {
            this.method417(-50);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IZ)V", line = 200)
    public class325(int arg0, boolean arg1) {
        this.field4738 = arg1;
        this.field4729 = new class325[arg0];
    }
}
