import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class215 extends class88 {

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    private int field3462;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Lgg;")
    public static class61 field3461 = new class61(16);

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "Lcd;")
    public static class60 field3464;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)V")
    public final void method621(int arg0, int arg1, int arg2) {
        int var4 = this.field3460 * arg0 >> 12;
        ++field3457;
        if (arg2 == 0) {
            int var5 = this.field3462 * arg1 >> 12;
            int var6 = this.field3459 * arg0 >> 12;
            int var7 = this.field3463 * arg1 >> 12;
            class234.method1546(var4, var5, super.field1207, var6, (byte) 113, var7);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public final void method620(int arg0, int arg1, int arg2) {
        ++field3456;
        if (arg0 != -1) {
            method1438(-47, 61L, false, 54, 23);
        }
        int var4 = this.field3460 * arg1 >> 12;
        int var5 = this.field3459 * arg1 >> 12;
        int var6 = this.field3462 * arg2 >> 12;
        int var7 = this.field3463 * arg2 >> 12;
        class267.method1811(super.field1208, var5, var6, var7, (byte) -19, super.field1200, var4, super.field1207);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
    public final void method629(int arg0, int arg1, byte arg2) {
        ++field3458;
        int var4 = 14 % ((-19 - arg2) / 62);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V")
    public class215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3460 = arg0;
        this.field3462 = arg3;
        this.field3459 = arg2;
        this.field3463 = arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IJZII)Ljava/lang/String;")
    public static final String method1438(int arg0, long arg1, boolean arg2, int arg3, int arg4) {
        ++field3455;
        char var6 = ',';
        char var7 = '.';
        if (arg3 != 10) {
            method1438(-43, -77L, true, -106, -99);
        }
        boolean var8 = false;
        StringBuffer var9 = new StringBuffer(26);
        if (~arg4 == -1) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        if (~arg0 < -1) {
            for (int var10 = 0; arg0 > var10; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (-((int) arg1 * 10) + var11 + 48));
            }
            var9.append(var6);
        }
        if (~arg4 == -3) {
            var7 = 160;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (48 - (int) arg1 * 10 + var13));
            if (~arg1 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                ++var12;
                if (~(var12 % 3) == -1) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static void method1439(int arg0) {
        field3464 = null;
        field3461 = null;
        if (arg0 != -1) {
            method1438(-11, -53L, false, -112, 38);
        }
    }
}
