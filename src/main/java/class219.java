import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class219 extends class15 {

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "[Lrb;")
    public class145[] field3691;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field3672 = 0;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Lce;")
    private static class126 field3668 = class206.method1445(-7923, "Nov");

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Lce;")
    private static class126 field3671 = class206.method1445(-7923, "Apr");

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Lce;")
    private static class126 field3673 = class206.method1445(-7923, "Jan");

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "Lce;")
    private static class126 field3677 = class206.method1445(-7923, "May");

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "Lce;")
    private static class126 field3678 = class206.method1445(-7923, "Sep");

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "[I")
    public static int[] field3679 = new int[5];

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lce;")
    public static class126 field3667 = class206.method1445(-7923, "Untersuchen");

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Lce;")
    private static class126 field3674 = class206.method1445(-7923, "Feb");

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Lce;")
    public static class126 field3680 = class206.method1445(-7923, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lce;")
    private static class126 field3682 = class206.method1445(-7923, "Oct");

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lce;")
    private static class126 field3685 = class206.method1445(-7923, "Jul");

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Lce;")
    private static class126 field3670 = class206.method1445(-7923, "Aug");

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lce;")
    private static class126 field3686 = class206.method1445(-7923, "Jun");

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "Lce;")
    public static class126 field3684 = class206.method1445(-7923, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Lce;")
    private static class126 field3687 = class206.method1445(-7923, "Mar");

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lce;")
    private static class126 field3690 = class206.method1445(-7923, "Dec");

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "[Lce;")
    public static class126[] field3681 = new class126[] { field3673, field3674, field3687, field3671, field3677, field3686, field3685, field3670, field3678, field3682, field3668, field3690 };

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "[Ljk;")
    public static class273[] field3676;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V", line = 11)
    public static final void method1498(byte arg0) {
        class206.field3528 = 0;
        class134.field2326 = 0;
        class9.method48(-1);
        class48.method300((byte) 5);
        class89.method622(50);
        field3683++;
        class283.method1893(0);
        for (int var1 = 0; var1 < class134.field2326; var1++) {
            int var2 = class286.field4740[var1];
            if (class249.field4174 != class85.field1352[var2].field2447) {
                if (class85.field1352[var2].field5023 > 0) {
                    class263.method1769((byte) -56, class85.field1352[var2]);
                }
                class85.field1352[var2] = null;
            }
        }
        if (class315.field5404 != class227.field3834.field2299) {
            throw new RuntimeException("gpp1 pos:" + class227.field3834.field2299 + " psize:" + class315.field5404);
        }
        int var3 = 0;
        if (arg0 < 33) {
            field3676 = (class273[]) null;
        }
        while (var3 < class239.field4036) {
            if (class85.field1352[class166.field2958[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class239.field4036);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ[Lsh;I[BI)V", line = 68)
    public static final void method1499(int arg0, boolean arg1, class32[] arg2, int arg3, byte[] arg4, int arg5) {
        field3669++;
        class134 var6 = new class134(arg4);
        if (arg5 != 2) {
            field3673 = (class126) null;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method961(arg5 + 1153370958);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method930(-15535);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var6.method948(-122);
                int var13 = var9 & 0x3F;
                int var14 = var9 >> 12;
                int var15 = arg3 + var11;
                int var16 = var12 >> 2;
                int var17 = var12 & 0x3;
                int var18 = arg0 + var13;
                if (var15 > 0 && var18 > 0 && var15 < 103 && var18 < 103) {
                    class32 var19 = null;
                    if (!arg1) {
                        int var20 = var14;
                        if ((class301.field4992[1][var15][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class52.method329(23, var15, var14, var14, var19, var18, var16, var17, arg1, var7, !arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)V", line = 146)
    public static void method1500(byte arg0) {
        field3679 = null;
        field3676 = null;
        field3685 = null;
        field3677 = null;
        field3681 = null;
        field3686 = null;
        field3674 = null;
        field3690 = null;
        field3684 = null;
        field3680 = null;
        field3667 = null;
        field3673 = null;
        field3678 = null;
        field3682 = null;
        field3670 = null;
        field3687 = null;
        field3668 = null;
        field3671 = null;
        if (arg0 != 39) {
            field3670 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IZ)Z", line = 183)
    public final boolean method1501(int arg0, boolean arg1) {
        field3675++;
        if (!arg1) {
            field3685 = (class126) null;
        }
        return this.field3691[arg0].field2654;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lcc;B)Z", line = 226)
    public static final boolean method1502(class313 arg0, byte arg1) {
        field3692++;
        int var2 = -119 % ((-arg1 - 60) / 53);
        return arg0.method2166(-28257, class33.field497);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I", line = 258)
    public static final int method1503(int arg0) {
        if (arg0 >= -90) {
            return -6;
        } else {
            field3688++;
            return class39.field626 && class217.field3655[81] && class173.field3067 > 2 ? class131.field2247[class173.field3067 - 2] : class131.field2247[class173.field3067 - 1];
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lcc;Lcc;IZ)V", line = 285)
    public class219(class313 arg0, class313 arg1, int arg2, boolean arg3) {
        class129 var5 = new class129();
        int var6 = arg0.method2165(0, arg2);
        this.field3691 = new class145[var6];
        int[] var7 = arg0.method2182(arg2, (byte) 125);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2173(arg2, var7[var8], (byte) -45);
            class180 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class180 var12 = (class180) var5.method898((byte) -87); var12 != null; var12 = (class180) var5.method893((byte) -71)) {
                if (var12.field3136 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2187(0, var11, 0);
                } else {
                    var13 = arg1.method2187(var11, 0, 0);
                }
                var10 = new class180(var11, var13);
                var5.method899(var10, -28);
            }
            this.field3691[var7[var8]] = new class145(var9, var10);
        }
    }
}
