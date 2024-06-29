import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class286 {

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Lgh;")
    private class51 field4362;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lp;")
    private class164 field4364;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Lmi;")
    private class138 field4365;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
    public static int[] field4356 = new int[99];

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Z")
    public static boolean field4361;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lef;")
    private class385 field4353;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[Lnh;")
    private class453[] field4355;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Luj;BILuj;)Lnh;")
    public final class453 method1767(class415 arg0, byte arg1, int arg2, class415 arg3) {
        if (arg1 > -89) {
            return null;
        } else {
            field4360++;
            return this.method1773(true, arg2, arg0, arg3, true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method1768(boolean arg0) {
        if (arg0) {
            method1771(95);
        }
        field4356 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
    public static final int method1769(int arg0, int arg1) {
        if (arg0 != 255) {
            field4361 = true;
        }
        field4354++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)Ldj;")
    public static final class132 method1770(boolean arg0, int arg1) {
        field4358++;
        class132 var2 = (class132) class371.field5416.method927((long) arg1, -121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class303.field4587.method823(class221.method1343((byte) -92, arg1), -20334, class388.method2402(arg1, -68));
        class132 var4 = new class132();
        if (arg0) {
            field4356 = null;
        }
        if (var3 != null) {
            var4.method783(new class385(var3), (byte) -117);
        }
        class371.field5416.method929((long) arg1, var4, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method1771(int arg0) {
        field4357++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 != 17895) {
            field4356 = null;
        }
        while (class115.field1522 > var2) {
            for (int var3 = 0; var3 < class198.field3004; var3++) {
                if (class310.method1891(class277.field4216, var1, true, var2, var3, 50)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)Z")
    public final boolean method1772(boolean arg0) {
        if (!arg0) {
            this.field4364 = null;
        }
        field4363++;
        if (this.field4353 != null) {
            return true;
        }
        if (this.field4365 == null) {
            if (this.field4362.method290(-101)) {
                return false;
            }
            this.field4365 = this.field4362.method289(255, true, 31996, 255, (byte) 0);
        }
        if (this.field4365.field5140) {
            return false;
        } else {
            this.field4353 = new class385(this.field4365.method880(0));
            this.field4355 = new class453[(this.field4353.field5685.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZILuj;Luj;Z)Lnh;")
    private final class453 method1773(boolean arg0, int arg1, class415 arg2, class415 arg3, boolean arg4) {
        field4359++;
        if (this.field4353 == null) {
            throw new RuntimeException();
        }
        this.field4353.field5666 = arg1 * 8 + 5;
        if (this.field4353.field5666 >= this.field4353.field5685.length) {
            throw new RuntimeException();
        } else if (this.field4355[arg1] != null) {
            return this.field4355[arg1];
        } else if (arg0) {
            int var6 = this.field4353.method2354(255);
            int var7 = this.field4353.method2354(255);
            class453 var8 = new class453(arg1, arg3, arg2, this.field4362, this.field4364, var6, var7, arg4);
            this.field4355[arg1] = var8;
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public final void method1774(int arg0) {
        field4352++;
        if (this.field4355 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4355.length; var2++) {
            if (this.field4355[var2] != null) {
                this.field4355[var2].method2821(false);
            }
        }
        for (int var3 = arg0; var3 < this.field4355.length; var3++) {
            if (this.field4355[var3] != null) {
                this.field4355[var3].method2819(arg0 ^ 0xFFFFD93C);
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lgh;Lp;)V")
    public class286(class51 arg0, class164 arg1) {
        this.field4362 = arg0;
        this.field4364 = arg1;
        if (!this.field4362.method290(-101)) {
            this.field4365 = this.field4362.method289(255, true, 31996, 255, (byte) 0);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4356[var1] = var0 / 4;
        }
        field4361 = false;
    }
}
