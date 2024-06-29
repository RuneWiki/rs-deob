import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class42 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lmg;")
    private class252 field939 = new class252(256);

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lmg;")
    private class252 field950 = new class252(256);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lbj;")
    private class151 field945;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lbj;")
    private class151 field948;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
    public static boolean field936 = true;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lrk;")
    public static class257 field937 = new class257();

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ljd;")
    public static class86 field943 = class122.method868("Benutzeroberfl-=che geladen)3", true);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Ljd;")
    public static class86 field946 = class122.method868("_labels", true);

    @OriginalMember(owner = "client!le", name = "p", descriptor = "[I")
    public static int[] field951 = new int[2];

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public static int[] field947 = new int[4096];

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lbj;Lbj;ILbj;)V")
    public static final void method338(class151 arg0, class151 arg1, int arg2, class151 arg3) {
        field944++;
        if (arg2 == -4097) {
            class171.field3161 = arg1;
            class27.field622 = arg0;
            class252.field4485 = arg3;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([IIZI)Lhe;")
    private final class19 method339(int[] arg0, int arg1, boolean arg2, int arg3) {
        field940++;
        int var5 = ((arg1 & 0xE0000FFF) << 4 | arg1 >>> 12) ^ arg3;
        int var6 = var5 | arg1 << 16;
        if (!arg2) {
            field937 = null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class19 var9 = (class19) this.field950.method1698(var7, (byte) 115);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class225 var10 = (class225) this.field939.method1698(var7, (byte) -32);
            if (var10 == null) {
                var10 = class225.method1577(this.field945, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field939.method1699(-28407, var10, var7);
            }
            class19 var11 = var10.method1576(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1477(1);
                this.field950.method1699(-28407, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([III)Lhe;")
    public final class19 method340(int[] arg0, int arg1, int arg2) {
        field941++;
        if (this.field945.method1081(-2) == 1) {
            return this.method339(arg0, 0, true, arg1);
        } else if (this.field945.method1075(arg1, -118) == 1) {
            return this.method339(arg0, arg1, true, 0);
        } else {
            if (arg2 >= -2) {
                this.method342((int[]) null, -76, 69, 77);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method341(byte arg0) {
        field943 = null;
        field947 = null;
        field946 = null;
        if (arg0 != -82) {
            field943 = null;
        }
        field951 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([IIII)Lhe;")
    private final class19 method342(int[] arg0, int arg1, int arg2, int arg3) {
        field938++;
        int var5 = arg1 ^ (arg3 >>> 12 | (arg3 & 0xF0000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class19 var9 = (class19) this.field950.method1698(var7, (byte) -60);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            int var10 = -77 / ((arg2 - 17) / 60);
            class199 var11 = class199.method1373(this.field948, arg3, arg1);
            if (var11 == null) {
                return null;
            }
            class19 var12 = var11.method1372();
            this.field950.method1699(-28407, var12, var7);
            if (arg0 != null) {
                arg0[0] -= var12.field511.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[IB)Lhe;")
    public final class19 method343(int arg0, int[] arg1, byte arg2) {
        if (arg2 > -47) {
            this.method343(125, (int[]) null, (byte) 107);
        }
        field942++;
        if (this.field948.method1081(-2) == 1) {
            return this.method342(arg1, arg0, 78, 0);
        } else if (this.field948.method1075(arg0, -2) == 1) {
            return this.method342(arg1, 0, -97, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lbj;Lbj;)V")
    public class42(class151 arg0, class151 arg1) {
        this.field945 = arg1;
        this.field948 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field947[var0] = class239.method1645(var0, 1276611244);
        }
    }
}
