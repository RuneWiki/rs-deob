import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class615 {

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "Lqc;")
    private class325 field9014 = new class325(128);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Ldda;")
    private class597 field9010;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field9012 = -1;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3575(int arg0) {
        class17.method80(-2);
        field9011++;
        if (arg0 != 64) {
            method3575(-52);
        }
        class171.method1090(-13787);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lvc;[[BB)V", line = 16)
    public static final void method3576(class359 arg0, byte[][] arg1, byte arg2) {
        field9015++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = -85 % ((-arg2 - 36) / 57);
        int var5 = arg1.length;
        for (int var6 = 0; var6 < var5; var6++) {
            byte[] var11 = arg1[var6];
            if (var11 != null) {
                class428 var12 = new class428(var11);
                int var13 = class256.field3741[var6] >> 8;
                int var14 = class256.field3741[var6] & 0xFF;
                int var15 = var13 * 64 - class584.field8677;
                int var16 = var14 * 64 - class424.field6061;
                class171.method1090(-13787);
                arg0.method3632(var12, var15, 11613, class424.field6061, var16, class67.field772, class584.field8677);
                arg0.method2209(class379.field5558, var12, var15, var16, var3, -127);
                if (!arg0.field9135 && (class157.field2003 / 8) == var13 && (class184.field2798 / 8) == var14 && var3[0] != -1) {
                    class477.field7267 = class28.field255.method2310(class458.field6652, var3[1], -123, var3[0], var3[3], var3[2]);
                    class492.field7432 = var3[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class256.field3741[var7] >> 8) * 64 - class584.field8677;
            int var9 = (class256.field3741[var7] & 0xFF) * 64 - class424.field6061;
            byte[] var10 = arg1[var7];
            if (var10 == null && class184.field2798 < 800) {
                class171.method1090(-13787);
                arg0.method3638(var9, var8, 64, 64, 115);
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Lrn;", line = 96)
    public final class308 method3577(int arg0, int arg1) {
        field9013++;
        class325 var3 = this.field9014;
        class308 var4;
        synchronized (this.field9014) {
            var4 = (class308) this.field9014.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field9010.method3486((byte) -88, class213.method1381(arg1 + 27334, arg0), class41.method215(arg0, 427362568));
        class308 var6 = new class308();
        if (arg1 != -27079) {
            return null;
        }
        if (var5 != null) {
            var6.method1893(arg1 ^ 0x69C9, new class428(var5));
        }
        class325 var7 = this.field9014;
        synchronized (this.field9014) {
            this.field9014.method2029(false, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 138)
    public class615(class559 arg0, int arg1, class597 arg2) {
        this.field9010 = arg2;
        if (this.field9010 != null) {
            int var4 = this.field9010.method3477(false) - 1;
            this.field9010.method3462(var4, 93);
        }
    }
}
