import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class281 {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public int field4420 = -1;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public int field4429 = -1;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "[I")
    public static int[] field4424 = new int[64];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lug;")
    public static class321 field4419;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
    public int[] field4421;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1989(int arg0) {
        if (arg0 != 0) {
            method1990(125);
        }
        field4428++;
        class226.field3589.method1623(1);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 16)
    public static void method1990(int arg0) {
        if (arg0 <= 22) {
            field4424 = (int[]) null;
        }
        field4424 = null;
        field4419 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILim;)V", line = 29)
    public static final void method1991(int arg0, int arg1, class192 arg2) {
        if (arg0 != 24) {
            return;
        }
        if (class145.field2178 != null) {
            try {
                class145.field2178.method1420(0L, -127);
                class145.field2178.method1416(97, arg2.field3128, arg1, 24);
            } catch (Exception var4) {
            }
        }
        field4427++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lim;III)V", line = 54)
    private final void method1992(class192 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 78) {
            this.field4421 = (int[]) null;
        }
        if (arg2 == 1) {
            this.field4420 = arg0.method1396(-86);
        } else if (arg2 == 2) {
            this.field4421 = new int[arg0.method1399(-1172389784)];
            for (int var5 = 0; var5 < this.field4421.length; var5++) {
                this.field4421[var5] = arg0.method1396(-99);
            }
        } else if (arg2 == 3) {
            this.field4429 = arg0.method1399(-1172389784);
        }
        field4426++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lsa;", line = 95)
    public static final class118 method1993(int arg0, int arg1) {
        field4417++;
        class118 var2 = (class118) class240.field3799.method1619((long) arg0, 105);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field51.method250(true, class145.method1019((byte) 125, arg0), class321.method2249(arg0, 113));
        class118 var4 = new class118();
        var4.field1801 = arg0;
        if (var3 != null) {
            var4.method820(new class192(var3), arg1 ^ 0xFFFF9958);
        }
        var4.method828(2047);
        if (arg1 != -3) {
            field4425 = 38;
        }
        class240.field3799.method1621((long) arg0, 61, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILim;I)V", line = 139)
    public final void method1994(int arg0, class192 arg1, int arg2) {
        field4418++;
        if (arg2 != -14903) {
            return;
        }
        while (true) {
            int var4 = arg1.method1399(-1172389784);
            if (var4 == 0) {
                return;
            }
            this.method1992(arg1, arg0, var4, 105);
        }
    }
}
