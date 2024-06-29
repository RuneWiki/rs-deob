import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class94 {

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lte;")
    public class137 field2192 = new class137();

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Z")
    public static boolean field2188 = false;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lgd;")
    public static class46 field2198 = new class46(100);

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Laf;")
    private static class7 field2201 = class48.method406(40, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Laf;")
    public static class7 field2199 = field2201;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2205 = 255;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    public static int[] field2207 = new int[256];

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Laf;")
    public static class7 field2209 = class48.method406(40, "::rect_debug");

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "B")
    public static byte field2206;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Lte;")
    private class137 field2204;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lkb;")
    public static class71 field2203;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[[B")
    public static byte[][] field2200;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lte;")
    public final class137 method758(int arg0) {
        field2193++;
        if (arg0 != 255) {
            this.method762(-80);
        }
        class137 var2 = this.field2192.field3268;
        if (this.field2192 == var2) {
            this.field2204 = null;
            return null;
        } else {
            this.field2204 = var2.field3268;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lte;")
    public final class137 method759(int arg0) {
        if (arg0 < 16) {
            this.method768((byte) 101);
        }
        field2195++;
        class137 var2 = this.field2204;
        if (this.field2192 == var2) {
            this.field2204 = null;
            return null;
        } else {
            this.field2204 = var2.field3262;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lte;")
    public final class137 method760(int arg0) {
        if (arg0 != 256) {
            this.method759(122);
        }
        field2191++;
        class137 var2 = this.field2192.field3262;
        if (this.field2192 == var2) {
            this.field2204 = null;
            return null;
        } else {
            this.field2204 = var2.field3262;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lte;")
    public final class137 method761(byte arg0) {
        class137 var2 = this.field2192.field3262;
        field2202++;
        if (this.field2192 == var2) {
            return null;
        }
        if (arg0 != -22) {
            this.method760(-45);
        }
        var2.method1124((byte) 62);
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public final void method762(int arg0) {
        if (arg0 != 100) {
            return;
        }
        field2186++;
        while (true) {
            class137 var2 = this.field2192.field3268;
            if (this.field2192 == var2) {
                return;
            }
            var2.method1124((byte) 62);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static void method763(int arg0) {
        field2209 = null;
        field2203 = null;
        field2207 = null;
        field2199 = null;
        field2201 = null;
        if (arg0 >= -118) {
            method764(99, 111);
        }
        field2200 = null;
        field2198 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lde;")
    public static final class27 method764(int arg0, int arg1) {
        class27 var2 = (class27) class152.field3559.method395(126, (long) arg0);
        field2187++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1480.method572(13, false, arg0);
        class27 var4 = new class27();
        if (arg1 != -21565) {
            method764(64, 55);
        }
        var4.field714 = arg0;
        if (var3 != null) {
            var4.method248(new class122(var3), -126);
        }
        class152.field3559.method388(var4, (long) arg0, arg1 ^ 0xFFFFAC3C);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lte;I)V")
    public final void method765(class137 arg0, int arg1) {
        field2196++;
        if (arg1 != 0) {
            field2199 = null;
        }
        if (arg0.field3262 != null) {
            arg0.method1124((byte) 62);
        }
        arg0.field3268 = this.field2192;
        arg0.field3262 = this.field2192.field3262;
        arg0.field3262.field3268 = arg0;
        arg0.field3268.field3262 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)Lte;")
    public final class137 method766(int arg0) {
        field2189++;
        class137 var2 = this.field2204;
        if (arg0 >= -31) {
            field2198 = null;
        }
        if (this.field2192 == var2) {
            this.field2204 = null;
            return null;
        } else {
            this.field2204 = var2.field3268;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lte;Z)V")
    public final void method767(class137 arg0, boolean arg1) {
        if (arg0.field3262 != null) {
            arg0.method1124((byte) 62);
        }
        field2197++;
        arg0.field3262 = this.field2192;
        arg0.field3268 = this.field2192.field3268;
        arg0.field3262.field3268 = arg0;
        if (arg1) {
            arg0.field3268.field3262 = arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)Lte;")
    public final class137 method768(byte arg0) {
        field2185++;
        class137 var2 = this.field2192.field3268;
        if (arg0 != -11) {
            this.method766(-84);
        }
        if (this.field2192 == var2) {
            return null;
        } else {
            var2.method1124((byte) 62);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lte;Lte;I)V")
    public final void method769(class137 arg0, class137 arg1, int arg2) {
        field2190++;
        if (arg1.field3262 != null) {
            arg1.method1124((byte) 62);
        }
        arg1.field3262 = arg0.field3262;
        arg1.field3268 = arg0;
        if (arg2 != -25408) {
            method764(-78, -36);
        }
        arg1.field3262.field3268 = arg1;
        arg1.field3268.field3262 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class94() {
        this.field2192.field3262 = this.field2192;
        this.field2192.field3268 = this.field2192;
    }
}
