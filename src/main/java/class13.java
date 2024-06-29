import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class13 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[[Lgd;")
    public static class157[][] field168;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I", line = 6)
    public static final int method89(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBILhm;)V", line = 18)
    public static final void method90(int arg0, int arg1, byte arg2, int arg3, class101 arg4) {
        field171++;
        int var5 = 63 % ((71 - arg2) / 41);
        for (class124 var6 = (class124) class140.field2387.method83(-66); var6 != null; var6 = (class124) class140.field2387.method87((byte) -80)) {
            if (var6.field2211 == arg0 && (arg1 * 128) == var6.field2215 && (arg3 * 128) == var6.field2214 && var6.field2205.field1801 == arg4.field1801) {
                if (var6.field2193 != null) {
                    class184.field3279.method112(var6.field2193);
                    var6.field2193 = null;
                }
                if (var6.field2213 != null) {
                    class184.field3279.method112(var6.field2213);
                    var6.field2213 = null;
                }
                var6.method1054((byte) 113);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIII)V", line = 57)
    public static final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg4 + 1;
        class19.method126(7, arg3, class154.field2638[arg4], arg1, arg2);
        int var8 = arg0 - 1;
        class19.method126(7, arg3, class154.field2638[arg0], arg1, arg2);
        if (arg5 <= 115) {
            field170 = 18;
        }
        field167++;
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class154.field2638[var6];
            var7[arg1] = var7[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(JB)V", line = 93)
    public static final void method92(long arg0, byte arg1) {
        field169++;
        class159.field2710.field4051 = 0;
        int var3 = 23 / ((10 - arg1) / 50);
        class159.field2710.method1598(213, 27052);
        class159.field2710.method1603(arg0, -1649350304);
        class74.field1293 = 0;
        class260.field4521 = 0;
        class165.field2810 = 1;
        class246.field4275 = -3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 115)
    public static void method93(int arg0) {
        field168 = (class157[][]) null;
        if (arg0 != 126) {
            field170 = 92;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[BI)I", line = 152)
    public static final int method94(int arg0, byte[] arg1, int arg2) {
        field172++;
        if (arg2 != 17365) {
            field170 = 61;
        }
        return class165.method1103((byte) -113, arg1, 0, arg0);
    }
}
