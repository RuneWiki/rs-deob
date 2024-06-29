import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class181 {

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Luj;")
    private class132 field2892 = new class132(256);

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Luj;")
    private class132 field2893 = new class132(256);

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Laj;")
    private class151 field2890;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Laj;")
    private class151 field2884;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2880 = "Unable to find ";

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "[Lwl;")
    public static class10[] field2885 = new class10[50];

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field2886 = 0;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lbb;")
    public static class49 field2881 = new class49();

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Laj;")
    public static class151 field2887;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
    public static int[] field2889;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method1315(byte arg0) {
        field2885 = null;
        field2889 = null;
        field2887 = null;
        field2881 = null;
        field2880 = null;
        if (arg0 >= -126) {
            field2880 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public static final void method1316(byte arg0) {
        if (arg0 != 124) {
            method1315((byte) -85);
        }
        class45.field703.method94(34);
        field2888++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([IIIZ)Lti;")
    private final class178 method1317(int[] arg0, int arg1, int arg2, boolean arg3) {
        field2883++;
        int var5 = (arg2 << 4 & 0xFFFA | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class178 var9 = (class178) this.field2893.method987(-105, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class309 var10 = class309.method2080(this.field2890, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class178 var11 = var10.method2082();
            this.field2893.method986(var7, arg3, var11);
            if (arg0 != null) {
                arg0[0] -= var11.field2857.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[I)Lti;")
    private final class178 method1318(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = ((arg2 & 0x60000FFF) << 4 | arg2 >>> 12) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field2879++;
        class178 var9 = (class178) this.field2893.method987(arg0 ^ 0xFFFFF155, var7);
        if (arg0 != 3807) {
            this.method1319(-55, (int[]) null, -50);
        }
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class212 var10 = (class212) this.field2892.method987(-90, var7);
            if (var10 == null) {
                var10 = class212.method1502(this.field2884, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field2892.method986(var7, true, var10);
            }
            class178 var11 = var10.method1504(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method993(32);
                this.field2893.method986(var7, true, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[II)Lti;")
    public final class178 method1319(int arg0, int[] arg1, int arg2) {
        field2882++;
        if (this.field2890.method1155((byte) -126) == 1) {
            return this.method1317(arg1, arg2, 0, true);
        } else if (this.field2890.method1132(16777215, arg2) == 1) {
            return this.method1317(arg1, 0, arg2, true);
        } else if (arg0 <= 1) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I[II)Lti;")
    public final class178 method1320(int arg0, int[] arg1, int arg2) {
        if (arg2 != -1) {
            field2880 = null;
        }
        field2891++;
        if (this.field2884.method1155((byte) -128) == 1) {
            return this.method1318(3807, arg0, 0, arg1);
        } else if (this.field2884.method1132(16777215, arg0) == 1) {
            return this.method1318(arg2 + 3808, 0, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Laj;Laj;)V")
    public class181(class151 arg0, class151 arg1) {
        this.field2890 = arg0;
        this.field2884 = arg1;
    }
}
