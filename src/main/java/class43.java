import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 extends class300 {

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field521 = new String[500];

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Lff;")
    public static class48 field526;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Lvl;")
    public static class73 field525;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = 45 / (arg0 / 47);
        ++field522;
        int[][] var4 = super.field4786.method538(arg1, (byte) 107);
        if (super.field4786.field1200) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class180.field2826; ++var8) {
                var5[var8] = this.field524;
                var6[var8] = this.field523;
                var7[var8] = this.field519;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
    private class43(int arg0) {
        super(0, false);
        this.method245(arg0, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field520;
        if (~arg2 == -1) {
            this.method245(arg0.method1212(460736848), true);
        }
        if (arg1 >= -43) {
            this.field519 = 22;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
    public class43() {
        this(0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
    public static final void method243(int arg0, int arg1, int arg2, int arg3) {
        class113 var4 = class184.field2892[arg0][arg1][arg2];
        if (var4 != null) {
            class165 var5 = var4.field1649;
            if (var5 != null) {
                var5.field2553 = var5.field2553 * arg3 / 16;
                var5.field2548 = var5.field2548 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    public static void method244(int arg0) {
        field525 = null;
        field521 = null;
        if (arg0 != -1) {
            field525 = null;
        }
        field526 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
    private final void method245(int arg0, boolean arg1) {
        this.field524 = (16711680 & arg0) >> 12;
        ++field518;
        if (arg1) {
            this.field523 = arg0 >> 4 & 4080;
            this.field519 = (arg0 & 255) << 4;
        }
    }
}
