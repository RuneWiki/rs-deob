import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class487 extends class386 {

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "Lwp;")
    public static class453 field6451 = new class453(67, 8);

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "[B")
    private byte[] field6454;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "[Llda;")
    public static class203[] field6450;

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class487() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
    public static final void method2636(int arg0, boolean arg1) {
        class164 var2 = (class164) class236.field2953.method237(arg0 ^ 0x58);
        if (arg0 != 2) {
            method2636(-22, true);
        }
        while (var2 != null) {
            if (var2.field2170 != null) {
                class480.field6387.method1295(var2.field2170);
                var2.field2170 = null;
            }
            if (var2.field2156 != null) {
                class480.field6387.method1295(var2.field2156);
                var2.field2156 = null;
            }
            var2.method1871(-30);
            var2 = (class164) class236.field2953.method245((byte) 22);
        }
        field6448++;
        if (!arg1) {
            return;
        }
        for (class164 var3 = (class164) class702.field9921.method237(97); var3 != null; var3 = (class164) class702.field9921.method245((byte) 44)) {
            if (var3.field2170 != null) {
                class480.field6387.method1295(var3.field2170);
                var3.field2170 = null;
            }
            var3.method1871(-59);
        }
        for (class164 var4 = (class164) class646.field9086.method407((byte) 124); var4 != null; var4 = (class164) class646.field9086.method403(arg0 + 12559)) {
            if (var4.field2170 != null) {
                class480.field6387.method1295(var4.field2170);
                var4.field2170 = null;
            }
            var4.method1871(-126);
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V")
    public static void method2637(byte arg0) {
        field6451 = null;
        if (arg0 < 126) {
            field6450 = null;
        }
        field6450 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIZ)V")
    public final void method2079(byte arg0, int arg1, boolean arg2) {
        field6453++;
        if (arg2) {
            this.field6454 = null;
        }
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field6454[var4] = -1;
        this.field6454[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2638(int arg0, int arg1, int arg2, int arg3) {
        field6452++;
        this.field6454 = new byte[arg2 * 2 * arg1 * arg3];
        if (arg0 == 0) {
            this.method831((byte) 120, arg3, arg2, arg1);
            return this.field6454;
        } else {
            return null;
        }
    }
}
