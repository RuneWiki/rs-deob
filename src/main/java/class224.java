import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class224 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ldc;")
    private class5 field3159 = new class5(256);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lhe;")
    private class239 field3162;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Liu;")
    public static class390 field3164 = new class390(42, 0);

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Liu;")
    public static class390 field3169 = new class390(50, 8);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Liu;")
    public static class390 field3170 = new class390(97, 0);

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lwt;")
    public static class194 field3171 = new class194("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method1381(int arg0, int arg1, int arg2, int arg3) {
        field3161++;
        if (class389.field5768 < 100) {
            return -2;
        }
        int var4 = arg1;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class249.field3584;
        int var7 = arg2 - class249.field3604;
        for (class410 var8 = (class410) class249.field3582.method2096(-21400); var8 != null; var8 = (class410) class249.field3582.method2084((byte) 19)) {
            if (var8.field6017 == arg0) {
                int var9 = var8.field6009;
                int var10 = var8.field6014;
                int var11 = class249.field3604 + var10 | class249.field3584 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 52)
    public static void method1382(int arg0) {
        field3170 = null;
        field3164 = null;
        field3171 = null;
        field3169 = null;
        if (arg0 != 20739) {
            method1382(4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lua;", line = 69)
    public final class453 method1383(int arg0, int arg1) {
        field3163++;
        class5 var3 = this.field3159;
        class453 var4;
        synchronized (this.field3159) {
            var4 = (class453) this.field3159.method40(arg0 ^ arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3162.method1470(4, arg1, 26);
        class453 var6 = new class453();
        if (var5 != null) {
            var6.method2636(new class156(var5), (byte) -70);
        }
        class5 var7 = this.field3159;
        synchronized (this.field3159) {
            this.field3159.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZI)Lsc;", line = 96)
    public static final class220 method1384(boolean arg0, boolean arg1, int arg2) {
        field3168++;
        if (arg1) {
            long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
            return (class220) class151.field1947.method2310((byte) -118, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 113)
    public final void method1385(byte arg0) {
        class5 var2 = this.field3159;
        synchronized (this.field3159) {
            this.field3159.method38((byte) -118);
        }
        if (arg0 != -32) {
            this.field3162 = null;
        }
        field3166++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 128)
    public static final void method1386(int arg0) {
        field3165++;
        class410.field6007.method38((byte) -20);
        if (arg0 != -25688) {
            method1384(false, true, -113);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V", line = 139)
    public final void method1387(boolean arg0, int arg1) {
        field3167++;
        class5 var3 = this.field3159;
        synchronized (this.field3159) {
            if (!arg0) {
                this.method1383(-46, 56);
            }
            this.field3159.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 152)
    public final void method1388(int arg0) {
        if (arg0 != -2) {
            field3171 = null;
        }
        field3160++;
        class5 var2 = this.field3159;
        synchronized (this.field3159) {
            this.field3159.method35((byte) -1);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 177)
    public class224(class298 arg0, int arg1, class239 arg2) {
        this.field3162 = arg2;
        this.field3162.method1473(4309, 26);
    }
}
