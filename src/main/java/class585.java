import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class585 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field8408 = 0;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field8409 = 0;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lhp;")
    private class277 field8412 = new class277(64);

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lsi;")
    private class487 field8415 = null;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lkea;")
    private class203 field8404;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lkea;")
    private class203 field8410;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public static int[] field8405 = new int[128];

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lkea;")
    public static class203 field8407;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lkea;")
    public static class203 field8411;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lco;")
    public final class102 method3401(int arg0, int arg1) {
        field8406++;
        class102 var3 = (class102) this.field8412.method1801(arg0 ^ arg0, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field8404.method1286(arg1, 1, (byte) -49);
        } else {
            var4 = this.field8410.method1286(arg1 & 0x7FFF, 1, (byte) -49);
        }
        class102 var5 = new class102();
        var5.field1207 = this;
        if (var4 != null) {
            var5.method630(~arg0, new class194(var4));
        }
        if (arg1 >= 32768) {
            var5.method636((byte) -30);
        }
        this.field8412.method1808((long) arg1, var5, (byte) -66);
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method3402(byte arg0) {
        field8411 = null;
        if (arg0 > -123) {
            method3403(true, 49, true, 71, -102);
        }
        field8407 = null;
        field8405 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIZII)Lkea;")
    public static final class203 method3403(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field8403++;
        class121 var5 = null;
        if (class375.field5705 != null) {
            var5 = new class121(arg4, class375.field5705, class550.field7851[arg4], 1000000);
        }
        class126.field1561[arg4] = class144.field1763.method640(var5, arg4, false, class492.field7166);
        if (arg0) {
            class126.field1561[arg4].method3317((byte) -93);
        }
        return arg3 == 1 ? new class203(class126.field1561[arg4], arg2, arg1) : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(JLdb;[II)Ljava/lang/String;")
    public final String method3404(long arg0, class272 arg1, int[] arg2, int arg3) {
        field8413++;
        if (arg3 < 89) {
            return null;
        }
        if (this.field8415 != null) {
            String var6 = this.field8415.method2575(arg1, arg2, 0, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
    public static final boolean method3405(int arg0, int arg1, int arg2) {
        field8414++;
        if (arg0 != 1) {
            method3403(true, -54, false, -50, 1);
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ILkea;Lkea;Lsi;)V")
    public class585(int arg0, class203 arg1, class203 arg2, class487 arg3) {
        this.field8404 = arg1;
        this.field8410 = arg2;
        this.field8415 = arg3;
        if (this.field8404 != null) {
            this.field8408 = this.field8404.method1309(1675886592, 1);
        }
        if (this.field8410 != null) {
            this.field8409 = this.field8410.method1309(1675886592, 1);
        }
    }

    static {
        for (int var0 = 0; var0 < field8405.length; var0++) {
            field8405[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field8405[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field8405[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field8405[var3] = var3 + 52 - 48;
        }
        field8405[45] = field8405[47] = 63;
        field8405[42] = field8405[43] = 62;
    }
}
