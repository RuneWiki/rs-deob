import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class207 {

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
    public long field3414 = 0L;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lph;")
    public static class229 field3401 = class266.method1858("cross", 0);

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lph;")
    public static class229 field3404 = class266.method1858("p12_full", 0);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field3402 = 0;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lph;")
    private static class229 field3407 = class266.method1858("Connected to update server", 0);

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field3412 = 0;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "Lph;")
    public static class229 field3418 = field3407;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lrk;")
    public class216 field3403;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lrk;")
    public class216 field3416;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method1443(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 22) {
            return 102;
        }
        int var4 = arg3 & 0x3;
        field3405++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 40)
    public static void method1444(int arg0) {
        field3407 = null;
        if (arg0 != 1) {
            field3407 = (class229) null;
        }
        field3401 = null;
        field3404 = null;
        field3418 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 74)
    public static final void method1445(byte arg0) {
        if (arg0 < 5) {
            method1443(-88, 124, -34, -48);
        }
        field3406++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class314.field5337 - 1); var2++) {
                if (class53.field748[var2] < 1000 && class53.field748[var2 + 1] > 1000) {
                    class229 var3 = class141.field2282[var2];
                    var1 = false;
                    class141.field2282[var2] = class141.field2282[var2 + 1];
                    class141.field2282[var2 + 1] = var3;
                    class229 var4 = class94.field1579[var2];
                    class94.field1579[var2] = class94.field1579[var2 + 1];
                    class94.field1579[var2 + 1] = var4;
                    int var5 = class255.field4263[var2];
                    class255.field4263[var2] = class255.field4263[var2 + 1];
                    class255.field4263[var2 + 1] = var5;
                    int var6 = class293.field4788[var2];
                    class293.field4788[var2] = class293.field4788[var2 + 1];
                    class293.field4788[var2 + 1] = var6;
                    short var7 = class53.field748[var2];
                    class53.field748[var2] = class53.field748[var2 + 1];
                    class53.field748[var2 + 1] = var7;
                    long var8 = class27.field409[var2];
                    class27.field409[var2] = class27.field409[var2 + 1];
                    class27.field409[var2 + 1] = var8;
                }
            }
        }
    }
}
