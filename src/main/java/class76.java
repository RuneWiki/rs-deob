import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class76 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ltd;")
    private class192 field995 = new class192(256);

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Ltd;")
    private class192 field997 = new class192(256);

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Llm;")
    private class210 field983;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Llm;")
    private class210 field986;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "[Lrj;")
    public static class258[] field982 = new class258[28];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
    public static int[] field981 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static volatile int field992 = -1;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Llm;")
    public static class210 field987;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[III)Lsf;", line = 4)
    private final class220 method482(int arg0, int[] arg1, int arg2, int arg3) {
        field984++;
        int var5 = arg2 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFF9);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class220 var9 = (class220) this.field997.method1320(var7, 13002);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class65 var10 = class65.method431(this.field986, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class220 var11 = var10.method432();
            if (arg0 != 0) {
                this.field997 = (class192) null;
            }
            this.field997.method1319(-65, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field3351.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 41)
    public static void method483(int arg0) {
        field982 = null;
        if (arg0 == 1) {
            field981 = null;
            field987 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lre;I)Lbc;", line = 61)
    public static final class152 method484(class263 arg0, int arg1) {
        int var2 = -124 / ((arg1 - 66) / 38);
        field991++;
        return new class152(arg0.method1845((byte) -123), arg0.method1845((byte) -122), arg0.method1845((byte) -123), arg0.method1845((byte) -121), arg0.method1845((byte) -126), arg0.method1845((byte) -128), arg0.method1845((byte) -126), arg0.method1845((byte) -128), arg0.method1824(false), arg0.method1787(false));
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 99)
    public static final void method485(String arg0, int arg1, int arg2) {
        field990++;
        class169 var3 = class101.method712(arg1, arg2, arg2 + 2089666397);
        var3.method1183(false);
        var3.field2527 = arg0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III[I)Lsf;", line = 111)
    private final class220 method486(int arg0, int arg1, int arg2, int[] arg3) {
        field988++;
        int var5 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x70000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg1 != 0) {
            this.method486(58, -35, 38, (int[]) null);
        }
        class220 var9 = (class220) this.field997.method1320(var7, 13002);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class102 var10 = (class102) this.field995.method1320(var7, 13002);
            if (var10 == null) {
                var10 = class102.method717(this.field983, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field995.method1319(64, var7, var10);
            }
            class220 var11 = var10.method720(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method714(100);
                this.field997.method1319(-99, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[II)Lsf;", line = 153)
    public final class220 method487(int arg0, int[] arg1, int arg2) {
        field989++;
        if (arg0 != 0) {
            this.method488((int[]) null, -63, (byte) -22);
        }
        if (this.field986.method1445(-17371) == 1) {
            return this.method482(0, arg1, arg2, 0);
        } else if (this.field986.method1464((byte) 17, arg2) == 1) {
            return this.method482(0, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([IIB)Lsf;", line = 174)
    public final class220 method488(int[] arg0, int arg1, byte arg2) {
        field998++;
        if (this.field983.method1445(-17371) == 1) {
            return this.method486(0, 0, arg1, arg0);
        }
        if (arg2 < 43) {
            field993 = -29;
        }
        if (this.field983.method1464((byte) 89, arg1) != 1) {
            throw new RuntimeException();
        }
        return this.method486(arg1, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Llm;Llm;)V", line = 208)
    public class76(class210 arg0, class210 arg1) {
        this.field983 = arg1;
        this.field986 = arg0;
    }
}
