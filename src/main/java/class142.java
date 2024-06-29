import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class142 {

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lie;")
    private class86 field2192 = new class86();

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2188 = "Loading...";

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
    public static int[] field2199 = new int[50];

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field2193 = 2;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2203 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[Lrg;")
    public static class95[] field2204 = new class95[28];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Z")
    public static boolean field2186 = false;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lie;")
    private class86 field2198;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
    public static int[] field2194;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[[Z")
    public static boolean[][] field2191;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lie;", line = 4)
    public final class86 method1068(int arg0) {
        field2196++;
        class86 var2 = this.field2198;
        if (arg0 != 29540) {
            field2199 = (int[]) null;
        }
        if (this.field2192 == var2) {
            this.field2198 = null;
            return null;
        } else {
            this.field2198 = var2.field1269;
            return var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I", line = 27)
    public final int method1069(int arg0) {
        if (arg0 < 4) {
            method1073(55);
        }
        int var2 = 0;
        for (class86 var3 = this.field2192.field1269; var3 != this.field2192; var3 = var3.field1269) {
            var2++;
        }
        field2189++;
        return var2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)Lie;", line = 52)
    public final class86 method1070(boolean arg0) {
        if (!arg0) {
            method1075(-25, (String) null);
        }
        class86 var2 = this.field2192.field1269;
        field2197++;
        if (this.field2192 == var2) {
            return null;
        } else {
            var2.method713((byte) 84);
            return var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V", line = 76)
    public static final void method1071(int arg0, int arg1) {
        field2200++;
        class23 var2 = class252.field3767;
        synchronized (class252.field3767) {
            if (arg0 < 87) {
                field2193 = 89;
            }
            class318.field4959 = arg1;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z[B)[B", line = 103)
    public static final byte[] method1072(boolean arg0, byte[] arg1) {
        field2205++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            byte[] var2 = new byte[arg1.length];
            class151.method1117(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 122)
    public static void method1073(int arg0) {
        field2188 = null;
        field2203 = null;
        field2191 = (boolean[][]) null;
        field2199 = null;
        field2204 = null;
        field2194 = null;
        if (arg0 != 0) {
            field2194 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V", line = 138)
    public final void method1074(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2195++;
        while (true) {
            class86 var2 = this.field2192.field1269;
            if (this.field2192 == var2) {
                this.field2198 = null;
                return;
            }
            var2.method713((byte) 111);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)V", line = 159)
    public static final void method1075(int arg0, String arg1) {
        if (arg0 < 40) {
            method1073(-122);
        }
        field2201++;
        System.out.println("Error: " + class69.method580((byte) -119, "%0a", arg1, "\n"));
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 234)
    public class142() {
        this.field2192.field1258 = this.field2192;
        this.field2192.field1269 = this.field2192;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lie;B)V", line = 184)
    public final void method1076(class86 arg0, byte arg1) {
        field2187++;
        if (arg0.field1258 != null) {
            arg0.method713((byte) 127);
        }
        if (arg1 > -34) {
            field2186 = false;
        }
        arg0.field1269 = this.field2192;
        arg0.field1258 = this.field2192.field1258;
        arg0.field1258.field1269 = arg0;
        arg0.field1269.field1258 = arg0;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)Lie;", line = 212)
    public final class86 method1077(int arg0) {
        field2190++;
        if (arg0 != 18667) {
            return (class86) null;
        }
        class86 var2 = this.field2192.field1269;
        if (this.field2192 == var2) {
            this.field2198 = null;
            return null;
        } else {
            this.field2198 = var2.field1269;
            return var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I", line = 259)
    public static int method1078(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
