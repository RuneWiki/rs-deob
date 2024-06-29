import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class69 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field965 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field970 = 0;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljda;")
    private class239 field969 = new class239(64);

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Laea;")
    private class55 field974 = null;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Laj;")
    private class333 field964;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Laj;")
    private class333 field967;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static volatile int field968 = -1;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Ltja;")
    public static class288 field963 = new class288(1, -1);

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([IBLmt;J)Ljava/lang/String;", line = 5)
    public final String method605(int[] arg0, byte arg1, class419 arg2, long arg3) {
        field966++;
        if (arg1 > -24) {
            return null;
        }
        if (this.field974 != null) {
            String var6 = this.field974.method397(arg0, 110, arg3, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 30)
    public static void method606(int arg0) {
        if (arg0 == 1718625538) {
            field963 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(ILaj;Laj;Laea;)V", line = 172)
    public class69(int arg0, class333 arg1, class333 arg2, class55 arg3) {
        this.field964 = arg2;
        this.field967 = arg1;
        this.field974 = arg3;
        if (this.field967 != null) {
            this.field965 = this.field967.method2090(1, false);
        }
        if (this.field964 != null) {
            this.field970 = this.field964.method2090(1, false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I[BIIIIII[B)V", line = 53)
    public static final void method607(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field973++;
        if (arg0 != -852) {
            method607(-123, null, -98, 9, 14, -76, 18, 32, null);
        }
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg6++]);
                int var14 = arg4++;
                arg8[var14] = (byte) (arg8[var14] - arg1[arg6++]);
                int var15 = arg4++;
                arg8[var15] = (byte) (arg8[var15] - arg1[arg6++]);
                int var16 = arg4++;
                arg8[var16] = (byte) (arg8[var16] - arg1[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg8[var10001] = (byte) (arg8[var10001] - arg1[arg6++]);
            }
            arg4 += arg2;
            arg6 += arg3;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lnb;I)Lgs;", line = 97)
    public static final class48 method608(class319 arg0, int arg1) {
        field971++;
        class48 var2;
        if (class736.field10189 == null) {
            var2 = new class48();
        } else {
            var2 = class736.field10189;
            class736.field10189 = class736.field10189.field726;
            class365.field5313--;
            var2.field726 = null;
        }
        var2.field725 = arg0;
        if (arg1 <= 64) {
            field968 = 37;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Ltr;", line = 128)
    public final class311 method609(int arg0, int arg1) {
        field972++;
        class311 var3 = (class311) this.field969.method1541(arg1 ^ 0xFFFFBBF6, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field967.method2095(arg0, 1, arg1 - 17407);
        } else {
            var4 = this.field964.method2095(arg0 & 0x7FFF, 1, 1);
        }
        class311 var5 = new class311();
        var5.field4470 = this;
        if (var4 != null) {
            var5.method1957(new class376(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method1950(104);
        }
        this.field969.method1544(true, var5, (long) arg0);
        if (arg1 != 17408) {
            method607(-35, null, 23, 19, 45, -121, 125, -127, null);
        }
        return var5;
    }
}
