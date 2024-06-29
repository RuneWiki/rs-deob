import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class423 {

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Ljava/lang/String;")
    public String field6359;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field6357 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field6353 = 0;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
    public static int[] field6354 = new int[13];

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field6360 = 0;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Llt;")
    public static class475 field6350 = new class475(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lic;")
    public static class491 field6356;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lf;")
    public static class529 field6361;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[Lf;")
    public static class529[] field6358;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILme;)V", line = 4)
    public static final void method2542(int arg0, class129 arg1) {
        field6352++;
        boolean var2 = false;
        if (class317.field4559 == arg1.field1982 || arg1.field1950 == -1 || arg1.field1936 != 0) {
            var2 = true;
        } else {
            class329 var3 = class84.field1295.method1182(arg1.field1950, 8);
            if (var3.field4666 || var3.field4665[arg1.field1940] < arg1.field1935 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field1982 - arg1.field1965;
            int var5 = class317.field4559 - arg1.field1965;
            int var6 = arg1.field1984 * 128 + arg1.method847(-1) * 64;
            int var7 = arg1.field1928 * 128 + (arg1.method847(-1) * 64);
            int var8 = arg1.field1941 * 128 + arg1.method847(-1) * 64;
            int var9 = arg1.field1900 * 128 + arg1.method847(-1) * 64;
            arg1.field1769 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field1763 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field1998 = 0;
        if (arg1.field1988 == 0) {
            arg1.method855(8192, 2);
        }
        if (arg1.field1988 == 1) {
            arg1.method855(12288, 2);
        }
        if (arg1.field1988 == 2) {
            arg1.method855(0, 2);
        }
        if (arg1.field1988 == 3) {
            arg1.method855(4096, 2);
        }
        if (arg0 > -75) {
            field6353 = 89;
        }
    }

    @OriginalMember(owner = "client!ai", name = "toString", descriptor = "()Ljava/lang/String;", line = 69)
    public final String toString() {
        field6349++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 79)
    public static void method2543(int arg0) {
        field6361 = null;
        field6354 = null;
        field6356 = null;
        field6358 = null;
        if (arg0 == -3621) {
            field6350 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 109)
    public class423(String arg0, int arg1) {
        this.field6359 = arg0;
        this.field6355 = arg1;
    }
}
