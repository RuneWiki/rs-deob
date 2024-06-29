import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Laf;")
    private class7 field892 = new class7(256);

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Laf;")
    private class7 field894 = new class7(256);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Ldd;")
    private class26 field883;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ldd;")
    private class26 field877;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lic;")
    private static class59 field886 = class59.method433(0, "Please use a different world)3");

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lic;")
    public static class59 field882 = field886;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lic;")
    public static class59 field880 = field886;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Laf;")
    public static class7 field887 = new class7(4096);

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field888 = 0;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lic;")
    public static class59 field890 = class59.method433(0, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lic;")
    public static class59 field896 = class59.method433(0, ":duelreq:");

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Laf;")
    public static class7 field889 = new class7(8);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lse;")
    public static class130 field891;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([III)Lp;")
    public final class104 method258(int[] arg0, int arg1, int arg2) {
        field878++;
        if (this.field883.method188(24761) == 1) {
            return this.method264(0, arg1, arg2 ^ 0xFFFFFEFE, arg0);
        } else if (this.field883.method181(arg2 ^ arg2, arg1) == 1) {
            return this.method264(arg1, 0, -2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII[I)Lp;")
    private final class104 method259(boolean arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (arg1 << 4 & 0xFFFD | arg1 >>> 12) ^ arg2;
        field879++;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class104 var9 = (class104) this.field894.method35(var7, 105);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class101 var10 = class101.method809(this.field877, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class104 var11 = var10.method810();
            if (arg0) {
                return null;
            }
            this.field894.method38(var11, (byte) 127, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field2519.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static void method260(boolean arg0) {
        field891 = null;
        field887 = null;
        field896 = null;
        field886 = null;
        field880 = null;
        field882 = null;
        field890 = null;
        if (arg0) {
            field897 = -5;
        }
        field889 = null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "([III)Lp;")
    public final class104 method261(int[] arg0, int arg1, int arg2) {
        field876++;
        if (this.field877.method188(24761) == 1) {
            return this.method259(false, 0, arg1, arg0);
        } else if (this.field877.method181(arg2 ^ arg2, arg1) == 1) {
            return this.method259(false, arg1, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method262(byte arg0) {
        class126.field2868 = null;
        class56.field1382 = null;
        class84.field2075 = null;
        if (arg0 < 16) {
            method260(false);
        }
        class1.field12 = null;
        class155.field3355 = null;
        class6.field124 = null;
        field885++;
        class63.field1628 = null;
        class108.field2605 = null;
        class21.field460 = null;
        class115.field2716 = null;
        class155.field3367 = null;
        class134.field2986 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Z")
    public static final boolean method263(int arg0, int arg1) {
        field875++;
        if (arg1 != 1) {
            field897 = 49;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[I)Lp;")
    private final class104 method264(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (arg0 << 4 & 0xFFF8 | arg0 >>> 12) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field884++;
        class104 var9 = (class104) this.field894.method35(var7, 105);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg2 != -2) {
                field893 = 58;
            }
            class14 var10 = (class14) this.field892.method35(var7, arg2 ^ 0xFFFFFF97);
            if (var10 == null) {
                var10 = class14.method79(this.field883, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field892.method38(var10, (byte) 119, var7);
            }
            class104 var11 = var10.method77(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method929(124);
                this.field894.method38(var11, (byte) 92, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ldd;Ldd;)V")
    public class33(class26 arg0, class26 arg1) {
        this.field883 = arg1;
        this.field877 = arg0;
    }
}
