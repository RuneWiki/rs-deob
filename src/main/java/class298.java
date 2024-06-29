import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class298 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
    public boolean field4449 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public int field4454 = 64;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Z")
    public boolean field4451 = false;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field4450 = 2;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field4457 = 64;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public int field4458 = -1;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public int field4459 = 1;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[J")
    public static long[] field4460 = new long[10];

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Ldg;")
    public static class376 field4452 = new class376(3, 8);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;IB)Lhaa;", line = 18)
    public static final class71 method1922(String arg0, int arg1, byte arg2) {
        field4448++;
        class71 var3;
        try {
            if (arg2 != -51) {
                method1926((byte) 109);
            }
            var3 = (class71) Class.forName("bo").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class128();
        }
        var3.field1256 = arg0;
        var3.field1257 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILmo;)V", line = 43)
    public final void method1923(int arg0, int arg1, class695 arg2) {
        field4453++;
        while (true) {
            int var4 = arg2.method3826(false);
            if (var4 == 0) {
                int var5 = -1 / ((-arg1 - 37) / 33);
                return;
            }
            this.method1925(arg2, 5, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V", line = 63)
    public static final void method1924(int arg0, String arg1, String arg2) {
        class460.field6579 = 1;
        field4456++;
        class689.field9707 = -1;
        class296.method1912(false, arg1, arg2, false);
        if (arg0 != 8) {
            field4460 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lmo;III)V", line = 79)
    private final void method1925(class695 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field4458 = arg0.method3847((byte) 118);
            if (this.field4458 == 65535) {
                this.field4458 = -1;
            }
        } else if (arg2 == 2) {
            this.field4457 = arg0.method3847((byte) 118) + 1;
            this.field4454 = arg0.method3847((byte) 118) + 1;
        } else if (arg2 == 3) {
            arg0.method3827((byte) -116);
        } else if (arg2 == 4) {
            this.field4450 = arg0.method3826(false);
        } else if (arg2 == 5) {
            this.field4459 = arg0.method3826(false);
        } else if (arg2 == 6) {
            this.field4451 = true;
        } else if (arg2 == 7) {
            this.field4449 = true;
        }
        if (arg1 != 5) {
            this.field4451 = true;
        }
        field4455++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 136)
    public static void method1926(byte arg0) {
        field4452 = null;
        field4460 = null;
        if (arg0 < 86) {
            method1924(-67, null, null);
        }
    }
}
