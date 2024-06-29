import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class260 {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[I")
    public static int[] field3842 = new int[120];

    @OriginalMember(owner = "client!at", name = "c", descriptor = "[I")
    public static int[] field3844;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Lha;")
    public static class43 field3845;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "J")
    public static long field3847;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lc;")
    public static class125 field3846;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Loi;")
    public static class53 field3848;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field3842[var1] = var0 / 4;
        }
        field3844 = new int[14];
        field3845 = null;
        field3847 = -1L;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1664(int arg0, byte arg1) {
        if (arg1 != 87) {
            method1665(-42);
        }
        field3850++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1665(int arg0) {
        field3843++;
        for (class77 var1 = (class77) class363.field5198.method2745(-115); var1 != null; var1 = (class77) class363.field5198.method2745(-106)) {
            class467.method2707(49, var1);
        }
        int var2;
        int var3;
        if (class4.field81.method1791(-2, class405.field5737)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class146.field1941;
            var3 = class146.field1941;
        }
        if (arg0 != 0) {
            method1666(-11);
        }
        client.method1286();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1281();
            client.method1284(var4);
            client.method1268(var4);
        }
        client.method1292();
        client.method1290();
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V", line = 90)
    public static void method1666(int arg0) {
        if (arg0 != 14) {
            field3846 = null;
        }
        field3844 = null;
        field3842 = null;
        field3848 = null;
        field3846 = null;
        field3845 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)I", line = 105)
    public static final int method1667(int arg0, int arg1, int arg2) {
        if (arg0 == 3) {
            field3849++;
            return arg1 == 1 || arg1 == 3 ? class131.field1727[arg2 & 0x3] : class213.field3072[arg2 & 0x3];
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)I")
    public abstract int method265(byte arg0, int arg1);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
    public abstract void method266(int arg0);

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)J")
    public abstract long method267(int arg0);
}
