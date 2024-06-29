import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class385 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
    private int[] field5634;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field5636 = 0;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field5637 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public final int method2463(int arg0, int arg1) {
        field5633++;
        if (arg1 != 31730) {
            field5637 = -52;
        }
        int var3 = (this.field5634.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field5634[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5634[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Lpm;")
    public static final class348 method2464(int arg0, int arg1, int arg2) {
        if (arg1 != 1302) {
            field5637 = -14;
        }
        field5635++;
        class348 var3 = (class348) class219.field3002.method1204((byte) -114, (long) arg2 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class348(arg0, arg2);
            class219.field3002.method1202(-1, var3.field5248, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "([I)V")
    public class385(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field5634 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5634[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5634[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field5634[var5 + var5] = arg0[var4];
            this.field5634[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    public static final void method2465(int arg0, int arg1) {
        class48.field561 = arg1;
        field5638++;
        class162.field2284 = -1;
        class100.field1118 = 100;
        class239.field3249 = 3;
        if (arg0 > -125) {
            method2464(-22, -25, -111);
        }
    }
}
