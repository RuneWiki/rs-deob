import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class38 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field578 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "B")
    public byte field576;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "J")
    public static long field575;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Ljava/lang/String;")
    public String field579;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Ljava/lang/String;")
    public String field581;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Ljava/lang/String;")
    public String field583;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[I")
    public static int[] field582;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[Lrg;)V", line = 29)
    public static final void method381(int arg0, int arg1, class342[] arg2) {
        field580++;
        if (arg1 != -2) {
            field578 = (String[]) null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class342 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field5279 == 0) {
                    if (var4.field5312 != null) {
                        method381(arg0, -2, var4.field5312);
                    }
                    class36 var5 = (class36) class135.field2251.method370((byte) -120, (long) var4.field5433);
                    if (var5 != null) {
                        class238.method1768((byte) 28, arg0, var5.field540);
                    }
                }
                if (arg0 == 0 && var4.field5290 != null) {
                    class112 var6 = new class112();
                    var6.field1711 = var4.field5290;
                    var6.field1706 = var4;
                    class160.method1288((byte) -45, var6);
                }
                if (arg0 == 1 && var4.field5305 != null) {
                    if (var4.field5380 >= 0) {
                        class342 var7 = class355.method2497(arg1 ^ 0xFFFFFFFE, var4.field5433);
                        if (var7 == null || var7.field5312 == null || var4.field5380 >= var7.field5312.length || var7.field5312[var4.field5380] != var4) {
                            continue;
                        }
                    }
                    class112 var8 = new class112();
                    var8.field1706 = var4;
                    var8.field1711 = var4.field5305;
                    class160.method1288((byte) -45, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 98)
    public static void method382(int arg0) {
        field578 = null;
        field582 = null;
        int var1 = -108 / ((-arg0 - 24) / 54);
    }
}
