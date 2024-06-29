import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class214 extends class180 {

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[Lcl;")
    public class214[] field3026;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "Z")
    public boolean field3032;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field3021 = 1406;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "Lcs;")
    public static class351 field3033 = new class351(32, 3);

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "Lcs;")
    public static class351 field3035 = new class351(23, -1);

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Lob;")
    public class444 field3024;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "Lsi;")
    public class474 field3030;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "[[S")
    public static short[][] field3037;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public static void method1350(int arg0) {
        if (arg0 != 21648) {
            method1350(-43);
        }
        field3035 = null;
        field3037 = null;
        field3033 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public void method1295(boolean arg0) {
        if (!arg0) {
            this.method12(-33);
        }
        if (this.field3032) {
            this.field3024.method2584(-23339);
            this.field3024 = null;
        } else {
            this.field3030.method2778((byte) 97);
            this.field3030 = null;
        }
        field3027++;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)I")
    public int method1351(int arg0) {
        if (arg0 != -5070) {
            field3035 = null;
        }
        field3031++;
        return -1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)[I")
    public final int[] method1352(int arg0, int arg1, int arg2) {
        if (arg2 >= -25) {
            method1350(-31);
        }
        field3029++;
        return this.field3026[arg1].field3032 ? this.field3026[arg1].method14((byte) 123, arg0) : this.field3026[arg1].method11(arg0, (byte) 92)[0];
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
    public void method1353(int arg0, int arg1, int arg2) {
        field3019++;
        int var4 = this.field3023 == 255 ? arg1 : this.field3023;
        if (this.field3032) {
            this.field3024 = new class444(var4, arg1, arg0);
        } else {
            this.field3030 = new class474(var4, arg1, arg0);
        }
        if (arg2 != -1) {
            this.method1295(true);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Llk;II)V")
    public void method15(class425 arg0, int arg1, int arg2) {
        field3028++;
        if (arg1 > -114) {
            this.method11(-40, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)I")
    public int method1297(boolean arg0) {
        if (arg0) {
            field3034 = 84;
        }
        field3022++;
        return -1;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public void method12(int arg0) {
        if (arg0 != 27108) {
            this.method12(-8);
        }
        field3018++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method1354(int arg0, int arg1, byte arg2) {
        field3038++;
        if (arg2 != 23) {
            this.field3032 = false;
        }
        if (this.field3026[arg0].field3032) {
            int[] var4 = this.field3026[arg0].method14((byte) 123, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3026[arg0].method11(arg1, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IZ)V")
    public class214(int arg0, boolean arg1) {
        this.field3026 = new class214[arg0];
        this.field3032 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[[I")
    public int[][] method11(int arg0, byte arg1) {
        field3020++;
        if (arg1 == 92) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[I")
    public int[] method14(byte arg0, int arg1) {
        field3025++;
        if (arg0 != 123) {
            field3036 = -54;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
