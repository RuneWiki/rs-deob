import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class132 {

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    private int field2222;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    private int field2226;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    private int field2223;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    private int field2236;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "[I")
    public static int[] field2224 = new int[1];

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "Llca;")
    public static class645 field2230;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIBII)V")
    public static final void method1088(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -18) {
            method1091(73);
        }
        field2231++;
        class242.field3531 = arg3;
        class458.field6450 = arg1;
        class131.field2199 = arg0;
        class201.field2913 = arg4;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIBIIIIIIII)V")
    public final void method1089(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2232++;
        this.field2226 = arg3;
        this.field2234 = arg9;
        this.field2222 = arg4 * arg4;
        this.field2225 = arg5;
        this.field2221 = this.field2225 + arg7;
        this.field2229 = this.field2225 + arg8;
        this.field2236 = this.field2226 + arg10;
        this.field2235 = this.field2226 + arg6;
        this.field2233 = this.field2234 + arg1;
        this.field2223 = this.field2234 + arg0;
        if (arg2 != -4) {
            field2230 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII)Z")
    public final boolean method1090(int arg0, int arg1, int arg2, int arg3) {
        field2228++;
        if (this.field2235 > arg3 || this.field2236 < arg3) {
            return false;
        } else if (arg2 < this.field2233 || arg2 > this.field2223) {
            return false;
        } else if (arg1 >= this.field2229 && arg1 <= this.field2221) {
            if (arg0 != -14735) {
                method1092(null, null, (byte) 29);
            }
            int var5 = arg3 - this.field2226;
            int var6 = arg1 - this.field2225;
            return this.field2222 > var5 * var5 + var6 * var6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2224 = null;
        field2230 = null;
        if (arg0 != 1) {
            method1091(-112);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lin;Lwea;B)V")
    public static final void method1092(class91 arg0, class158 arg1, byte arg2) {
        class432.field6179 = "";
        class241.field3526 = arg1;
        field2227++;
        class534.field7356 = arg0;
        if (class141.field2334.startsWith("win")) {
            class432.field6179 = class432.field6179 + "windows/";
        } else if (class141.field2334.startsWith("linux")) {
            class432.field6179 = class432.field6179 + "linux/";
        } else if (class141.field2334.startsWith("mac")) {
            class432.field6179 = class432.field6179 + "macos/";
        }
        if (arg2 != 95) {
            field2224 = null;
        }
        if (class241.field3526.field2542) {
            class432.field6179 = class432.field6179 + "msjava/";
        } else if (class141.field2333.startsWith("amd64") || class141.field2333.startsWith("x86_64")) {
            class432.field6179 = class432.field6179 + "x86_64/";
        } else if (class141.field2333.startsWith("i386") || class141.field2333.startsWith("i486") || class141.field2333.startsWith("i586") || class141.field2333.startsWith("x86")) {
            class432.field6179 = class432.field6179 + "x86/";
        } else if (class141.field2333.startsWith("ppc")) {
            class432.field6179 = class432.field6179 + "ppc/";
        } else {
            class432.field6179 = class432.field6179 + "universal/";
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2225 = arg2;
        this.field2234 = arg1;
        this.field2222 = arg3 * arg3;
        this.field2226 = arg0;
        this.field2229 = this.field2225 + arg8;
        this.field2223 = this.field2234 + arg7;
        this.field2233 = this.field2234 + arg6;
        this.field2221 = this.field2225 + arg9;
        this.field2236 = this.field2226 + arg5;
        this.field2235 = this.field2226 + arg4;
    }
}
