import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class258 {

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lib;")
    private class106 field3804 = new class106(256);

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lib;")
    private class106 field3809 = new class106(256);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lfs;")
    private class387 field3796;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Lfs;")
    private class387 field3803;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lsl;")
    public static class318 field3795 = new class318(8, 8);

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lsp;")
    public static class448 field3807 = new class448("LOCAL", 4);

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "J")
    public static long field3800;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[I)Ljs;")
    private final class217 method1658(int arg0, int arg1, int arg2, int[] arg3) {
        field3802++;
        int var5 = (arg0 << 4 & 0xFFF4 | arg0 >>> 12) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class217 var9 = (class217) this.field3809.method875(var7, 123);
        if (var9 != null) {
            return var9;
        } else if (arg3 != null && arg3[0] <= 0) {
            return null;
        } else if (arg1 < 85) {
            return null;
        } else {
            class362 var10 = class362.method2165(this.field3803, arg0, arg2);
            if (var10 == null) {
                return null;
            }
            class217 var11 = var10.method2166();
            this.field3809.method878(var7, -2301, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field3136.length;
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1659(byte arg0) {
        int var1 = 85 % ((60 - arg0) / 51);
        field3795 = null;
        field3807 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[IBI)Ljs;")
    private final class217 method1660(int arg0, int[] arg1, byte arg2, int arg3) {
        field3797++;
        int var5 = arg3 ^ (arg0 << 4 & 0xFFF2 | arg0 >>> 12);
        if (arg2 < 19) {
            return null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class217 var9 = (class217) this.field3809.method875(var7, 124);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class83 var10 = (class83) this.field3804.method875(var7, 125);
            if (var10 == null) {
                var10 = class83.method745(this.field3796, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3804.method878(var7, -2301, var10);
            }
            class217 var11 = var10.method749(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1525((byte) 118);
                this.field3809.method878(var7, -2301, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([III)Ljs;")
    public final class217 method1661(int[] arg0, int arg1, int arg2) {
        if (arg2 != 2509) {
            this.field3803 = null;
        }
        field3801++;
        if (this.field3796.method2359((byte) 39) == 1) {
            return this.method1660(0, arg0, (byte) 20, arg1);
        } else if (this.field3796.method2367(arg1, 28724) == 1) {
            return this.method1660(arg1, arg0, (byte) 114, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public static final void method1662(int arg0, int arg1, int arg2) {
        if (class467.field6889 != arg2) {
            class453.field6672 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class453.field6672[var3] = (var3 << 12) / arg2;
            }
            class166.field2356 = arg2 - 1;
            class467.field6889 = arg2;
            class196.field2863 = arg2 * 32;
        }
        field3799++;
        if (arg1 != 9188) {
            method1662(-112, -115, -10);
        }
        if (class227.field3310 == arg0) {
            return;
        }
        if (class467.field6889 == arg0) {
            class290.field4168 = class453.field6672;
        } else {
            class290.field4168 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class290.field4168[var4] = (var4 << 12) / arg0;
            }
        }
        class227.field3310 = arg0;
        class519.field7637 = arg0 - 1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILuu;B)V")
    public static final void method1663(int arg0, int arg1, class188 arg2, byte arg3) {
        field3808++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field2658 != null) {
            class125 var4 = new class125();
            var4.field1830 = arg2;
            var4.field1833 = arg2.field2658;
            class41.method409(var4);
        }
        class404.field5977 = arg2.field2678;
        class299.field4290 = arg0;
        class453.field6671 = true;
        class86.field1177 = arg2.field2606;
        class412.field6116 = arg2.field2617;
        class223.field3273 = arg1;
        class219.field3149 = arg2.field2773;
        if (arg3 == -38) {
            class148.field2074 = arg2.field2641;
            class120.method951(arg2, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "([III)Ljs;")
    public final class217 method1664(int[] arg0, int arg1, int arg2) {
        if (arg1 != -1903291760) {
            this.method1658(-81, -67, -64, null);
        }
        field3798++;
        if (this.field3803.method2359((byte) 39) == 1) {
            return this.method1658(0, 123, arg2, arg0);
        } else if (this.field3803.method2367(arg2, 28724) == 1) {
            return this.method1658(arg2, arg1 + 1903291868, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lfs;Lfs;)V")
    public class258(class387 arg0, class387 arg1) {
        this.field3796 = arg1;
        this.field3803 = arg0;
    }
}
