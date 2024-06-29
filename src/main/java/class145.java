import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class145 implements class257 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public boolean field2084;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lfv;")
    public class120 field2079;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Ldp;")
    public class3 field2076;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Las;")
    public static class151 field2085 = new class151(8, 0, 4, 1);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
    public static int[] field2089 = new int[256];

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lgda;")
    public static class53 field2088 = new class53(20, -1);

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "F")
    public static float field2090;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lon;")
    public static class335 field2086;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Loia;")
    public static class88 field2087;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Lg;")
    public final class153 method769(boolean arg0) {
        field2083++;
        return arg0 ? null : class456.field6439;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public static final void method1006(int arg0, int arg1, int arg2) {
        if (arg2 < 114) {
            field2088 = null;
        }
        field2078++;
        class592 var3 = class682.method3825(-652872096, 15, 0);
        var3.method3351(0);
        var3.field8343 = arg1;
        var3.field8337 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2087 = null;
        field2089 = null;
        int var1 = 3 % ((arg0 + 47) / 42);
        field2088 = null;
        field2085 = null;
        field2086 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(ILdp;Lfv;IIIIIIIZ)V")
    public class145(int arg0, class3 arg1, class120 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field2075 = arg3;
        this.field2084 = arg10;
        this.field2079 = arg2;
        this.field2080 = arg0;
        this.field2072 = arg4;
        this.field2077 = arg5;
        this.field2076 = arg1;
        this.field2074 = arg6;
        this.field2073 = arg7;
        this.field2082 = arg9;
        this.field2081 = arg8;
    }
}
