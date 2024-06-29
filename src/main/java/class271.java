import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class271 {

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lmn;")
    private class247 field3741 = new class247(256);

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lmn;")
    private class247 field3743 = new class247(256);

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lmg;")
    private class101 field3734;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lmg;")
    private class101 field3742;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[S")
    public static short[] field3735 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[Lqv;")
    public static class310[] field3736;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[III)Lck;")
    private final class452 method1616(int arg0, int[] arg1, int arg2, int arg3) {
        field3732++;
        int var5 = (arg2 >>> 12 | arg2 << 4 & arg3) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class452 var9 = (class452) this.field3743.method1492(var7, 6340);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class363 var10 = (class363) this.field3741.method1492(var7, 6340);
            if (var10 == null) {
                var10 = class363.method2194(this.field3734, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field3741.method1487(-85, var7, var10);
            }
            class452 var11 = var10.method2191(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1565(0);
                this.field3743.method1487(-38, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lem;II)Ljava/lang/String;")
    public static final String method1617(class150 arg0, int arg1, int arg2) {
        field3740++;
        if (!client.method1228(arg0).method1181(-2049225995, arg1) && arg0.field2209 == null) {
            return null;
        } else if (arg2 <= 59) {
            return null;
        } else if (arg0.field2271 == null || arg1 >= arg0.field2271.length || arg0.field2271[arg1] == null || arg0.field2271[arg1].trim().length() == 0) {
            return class214.field2982 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field2271[arg1];
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method1618(boolean arg0) {
        field3736 = null;
        field3735 = null;
        if (!arg0) {
            method1622((byte) 99);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[II)Lck;")
    public final class452 method1619(int arg0, int[] arg1, int arg2) {
        if (arg0 != 0) {
            this.method1616(-115, null, 40, -71);
        }
        field3738++;
        if (this.field3742.method746(44) == 1) {
            return this.method1620(0, arg2, arg1, arg0 ^ 0xC9D);
        } else if (this.field3742.method753(arg2, arg0 - 85) == 1) {
            return this.method1620(arg2, 0, arg1, 3229);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[II)Lck;")
    private final class452 method1620(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg3 != 3229) {
            this.field3742 = null;
        }
        field3737++;
        int var5 = arg1 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFD);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class452 var9 = (class452) this.field3743.method1492(var7, arg3 ^ 0x1459);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class191 var10 = class191.method1202(this.field3742, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class452 var11 = var10.method1201();
            this.field3743.method1487(-63, var7, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field6656.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I[II)Lck;")
    public final class452 method1621(int arg0, int[] arg1, int arg2) {
        field3733++;
        if (this.field3734.method746(20) == 1) {
            return this.method1616(arg0, arg1, 0, 65520);
        } else if (arg2 != 2616) {
            return null;
        } else if (this.field3734.method753(arg0, arg2 ^ 0xFFFFF5B6) == 1) {
            return this.method1616(0, arg1, arg0, 65520);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)[Lwa;")
    public static final class433[] method1622(byte arg0) {
        if (arg0 >= -44) {
            field3735 = null;
        }
        field3739++;
        return new class433[] { class467.field6839, class453.field6659, class138.field1976 };
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lmg;Lmg;)V")
    public class271(class101 arg0, class101 arg1) {
        this.field3734 = arg1;
        this.field3742 = arg0;
    }
}
