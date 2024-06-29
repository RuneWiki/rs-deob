import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class239 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    private int[] field3365;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3364 = -1;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lqp;")
    public static class475 field3360;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1572(int arg0, int arg1, int arg2, int arg3) {
        field3363++;
        if (arg3 != -8001) {
            method1573(-54);
        }
        class177 var4 = class344.method2229(9, arg1, (byte) 90);
        var4.method1191(arg3 + 8093);
        var4.field2369 = arg0;
        var4.field2372 = arg2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 23)
    public static void method1573(int arg0) {
        if (arg0 != 0) {
            method1575(null, null, null, -32, 91, -80);
        }
        field3360 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZBI)V", line = 33)
    public static final void method1574(int arg0, boolean arg1, byte arg2, int arg3) {
        field3361++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class56.field818 = arg0;
        if (arg2 <= -63) {
            class103.field1483 = arg1;
            class355.field5493 = arg3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([I[ILnq;III)Lat;", line = 50)
    public static final class261 method1575(int[] arg0, int[] arg1, class325 arg2, int arg3, int arg4, int arg5) {
        field3362++;
        byte[] var6 = new byte[arg3 * arg5];
        int var7 = 0;
        if (arg4 <= 65) {
            field3360 = null;
        }
        while (var7 < arg5) {
            int var8 = arg3 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class261(arg2, arg3, arg5, var6);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I", line = 81)
    public final int method1576(int arg0, int arg1) {
        field3366++;
        if (arg1 <= 42) {
            this.field3365 = null;
        }
        int var3 = (this.field3365.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3365[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3365[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([I)V", line = 111)
    public class239(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3365 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3365[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3365[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field3365[var5 + var5] = arg0[var4];
            this.field3365[var5 + var5 + 1] = var4++;
        }
    }
}
