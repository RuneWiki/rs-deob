import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class112 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[I")
    private int[] field2143;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[Led;")
    public static class43[] field2141 = new class43[500];

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ln;")
    public static class118 field2145 = new class118();

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Led;")
    public static class43 field2149 = class191.method1219("sch-Utteln:", false);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field2147;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lig;BILf;)V")
    public static final void method690(class80 arg0, byte arg1, int arg2, class48 arg3) {
        field2142++;
        byte[] var4 = null;
        class118 var5 = field2145;
        synchronized (field2145) {
            if (arg1 != 73) {
                return;
            }
            for (class201 var6 = (class201) field2145.method753(-26703); var6 != null; var6 = (class201) field2145.method755((byte) 115)) {
                if ((long) arg2 == var6.field1353 && var6.field3953 == arg3 && var6.field3943 == 0) {
                    var4 = var6.field3949;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg3.method298(arg2, false);
            arg0.method493(var7, arg2, arg3, true, (byte) 108);
        } else {
            arg0.method493(var4, arg2, arg3, true, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)I")
    public final int method691(int arg0, boolean arg1) {
        if (arg1) {
            field2144 = -61;
        }
        int var3 = (this.field2143.length >> 1) - 1;
        field2146++;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field2143[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2143[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "([I)V")
    public class112(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2143 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2143[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2143[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2143[var5 + var5] = arg0[var4];
            this.field2143[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method692(byte arg0) {
        field2149 = null;
        if (arg0 <= -127) {
            field2145 = null;
            field2141 = null;
            field2147 = null;
        }
    }
}
