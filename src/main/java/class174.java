import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class174 {

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lfu;")
    private class363 field2042 = new class363();

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lkp;")
    private class456 field2044 = new class456();

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "Lhd;")
    private class694 field2045;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "F")
    public static float field2036;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(JLfu;Z)V", line = 4)
    public final void method1042(long arg0, class363 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field2039++;
        if (this.field2043 == 0) {
            class363 var5 = this.field2044.method2507((byte) 80);
            var5.method1566(-100);
            var5.method2110(96);
            if (this.field2042 == var5) {
                class363 var6 = this.field2044.method2507((byte) 80);
                var6.method1566(-79);
                var6.method2110(115);
            }
        } else {
            this.field2043--;
        }
        this.field2045.method3832(arg1, arg0, 98);
        this.field2044.method2504((byte) -118, arg1);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIIIBI)V", line = 37)
    public static final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2041++;
        if (class409.method2299((byte) -115, arg6)) {
            int var10 = 45 % ((-arg7 - 1) / 51);
            if (class79.field1035[arg6] == null) {
                class90.method671(-1, (byte) 38, arg4, arg3, arg5, class325.field4062[arg6], arg1, arg2, arg0, arg8);
            } else {
                class90.method671(-1, (byte) 38, arg4, arg3, arg5, class79.field1035[arg6], arg1, arg2, arg0, arg8);
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class58.field743[var9] = true;
            }
        } else {
            class58.field743[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BJ)V", line = 73)
    public static final void method1044(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 != -61) {
            field2037 = -35;
        }
        field2038++;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 87)
    public final void method1045(byte arg0) {
        field2035++;
        int var2 = 84 % ((arg0 - 46) / 61);
        this.field2044.method2501(9);
        this.field2045.method3839((byte) -125);
        this.field2042 = new class363();
        this.field2043 = this.field2046;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IJ)Lfu;", line = 102)
    public final class363 method1046(int arg0, long arg1) {
        field2040++;
        if (arg0 != 100) {
            this.method1046(66, 56L);
        }
        class363 var4 = (class363) this.field2045.method3828(arg1, (byte) -91);
        if (var4 != null) {
            this.field2044.method2504((byte) -108, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(I)V", line = 153)
    public class174(int arg0) {
        this.field2043 = arg0;
        this.field2046 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2045 = new class694(var2);
    }
}
