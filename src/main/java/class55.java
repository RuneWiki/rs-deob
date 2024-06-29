import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class55 {

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lvd;")
    private class126 field911 = new class126(256);

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lvd;")
    private class126 field915 = new class126(256);

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lcb;")
    private class267 field907;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lcb;")
    private class267 field909;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lwa;")
    public static class75 field902 = class66.method560("Schrifts-=tze geladen)3", false);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lwa;")
    public static class75 field906 = class66.method560("Untersuchen", false);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lwa;")
    public static class75 field910 = class66.method560("blinken1:", false);

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field905 = 0;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lwa;")
    public static class75 field912 = class66.method560("Weiter", false);

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 5)
    public static void method396(byte arg0) {
        if (arg0 < 26) {
            method396((byte) -82);
        }
        field910 = null;
        field912 = null;
        field906 = null;
        field902 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([IBI)Ltd;", line = 23)
    public final class227 method397(int[] arg0, byte arg1, int arg2) {
        field904++;
        if (this.field907.method1912((byte) 87) == 1) {
            return this.method399(arg2, arg0, 0, (byte) -91);
        } else if (this.field907.method1914(-50, arg2) == 1) {
            return this.method399(0, arg0, arg2, (byte) -22);
        } else {
            int var4 = -83 / ((arg1 + 3) / 53);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)I", line = 44)
    public static final int method398(boolean arg0, int arg1, int arg2) {
        field913++;
        int var3 = class272.method1943(arg1 - 1, arg2 + -1, (byte) 90) + class272.method1943(arg1 - 1, arg2 - -1, (byte) 119) + class272.method1943(arg1 + 1, arg2 - 1, (byte) 108) + class272.method1943(arg1 - -1, arg2 + 1, (byte) 88);
        int var4 = class272.method1943(arg1, arg2 - 1, (byte) 122) + class272.method1943(arg1, arg2 + 1, (byte) 114) + class272.method1943(arg1 + -1, arg2, (byte) 87) + class272.method1943(arg1 + 1, arg2, (byte) 79);
        int var5 = class272.method1943(arg1, arg2, (byte) 119);
        return arg0 ? var3 / 16 + var4 / 8 + var5 / 4 : 112;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[IIB)Ltd;", line = 66)
    private final class227 method399(int arg0, int[] arg1, int arg2, byte arg3) {
        int var5 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF7);
        int var6 = var5 | arg2 << 16;
        field903++;
        long var7 = (long) var6 ^ 0x100000000L;
        class227 var9 = (class227) this.field915.method1007(var7, -17004);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class256 var10 = (class256) this.field911.method1007(var7, -17004);
            if (var10 == null) {
                var10 = class256.method1830(this.field907, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field911.method1004((byte) 73, var7, var10);
            }
            class227 var11 = var10.method1832(arg1);
            int var12 = 104 / ((arg3 - 58) / 61);
            if (var11 == null) {
                return null;
            } else {
                var10.method1527(127);
                this.field915.method1004((byte) 73, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIIB)Ltd;", line = 110)
    private final class227 method400(int[] arg0, int arg1, int arg2, byte arg3) {
        field914++;
        if (arg3 >= -91) {
            return (class227) null;
        }
        int var5 = arg2 ^ (arg1 >>> 12 | (arg1 & 0x20000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class227 var9 = (class227) this.field915.method1007(var7, -17004);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class179 var10 = class179.method1317(this.field909, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class227 var11 = var10.method1319();
            this.field915.method1004((byte) 73, var7, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field3818.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([IBI)Ltd;", line = 168)
    public final class227 method401(int[] arg0, byte arg1, int arg2) {
        field908++;
        if (this.field909.method1912((byte) 87) == 1) {
            return this.method400(arg0, 0, arg2, (byte) -101);
        }
        int var4 = -16 / ((38 - arg1) / 63);
        if (this.field909.method1914(-80, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method400(arg0, arg2, 0, (byte) -115);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lcb;Lcb;)V", line = 208)
    public class55(class267 arg0, class267 arg1) {
        this.field907 = arg1;
        this.field909 = arg0;
    }
}
