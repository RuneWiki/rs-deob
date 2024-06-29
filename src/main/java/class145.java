import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class145 extends class35 {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[I")
    public static int[] field2050 = new int[2];

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
    public static int[] field2052;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 4)
    public static final void method989(int arg0) {
        field2053++;
        if (arg0 >= -27) {
            field2050 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            client.field6675[var1] = false;
        }
        class258.field3855 = -1;
        class88.field1246 = 0;
        class358.field5438 = 0;
        class469.field6596 = 1;
        class100.field1423 = -1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIZZII)V", line = 34)
    public static final void method990(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        field2051++;
        long var6 = (long) (arg1 | (arg3 ? Integer.MIN_VALUE : 0));
        if (!arg2) {
            field2049 = -42;
        }
        class341 var8 = (class341) class230.field3388.method2305(var6, (byte) 107);
        if (var8 == null) {
            var8 = new class341();
            class230.field3388.method2307(var6, var8, (byte) 124);
        }
        if (arg5 >= var8.field5108.length) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field5108.length; var11++) {
                var9[var11] = var8.field5108[var11];
                var10[var11] = var8.field5110[var11];
            }
            for (int var12 = var8.field5108.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5110 = var10;
            var8.field5108 = var9;
        }
        var8.field5108[arg5] = arg0;
        var8.field5110[arg5] = arg4;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V", line = 92)
    public static void method991(int arg0) {
        if (arg0 != 7042) {
            field2050 = null;
        }
        field2050 = null;
        field2052 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 105)
    public class145() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V", line = 107)
    public class145(int arg0) {
        this.field2054 = arg0;
    }
}
