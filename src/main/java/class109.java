import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class109 extends class195 {

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
    private int field1668 = 4096;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    private int field1660 = 4096;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    private int field1674 = 4096;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "[Lck;")
    public static class119[] field1673 = new class119[100];

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "Lck;")
    public static class119 field1667 = class298.method1987((byte) 95, "(U5");

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "Lck;")
    private static class119 field1666 = class298.method1987((byte) 113, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "Z")
    public static boolean field1670 = false;

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "Lck;")
    public static class119 field1671 = field1666;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "Lll;")
    public static class17 field1664;

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "[I")
    public static int[] field1665;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)[Lve;", line = 15)
    public static final class33[] method702(byte arg0) {
        field1675++;
        if (arg0 < 69) {
            method706((byte) -86);
        }
        class33[] var1 = new class33[class285.field4706];
        for (int var2 = 0; var2 < class285.field4706; var2++) {
            var1[var2] = new class33(class227.field3641, class207.field3304, class155.field2475[var2], class7.field152[var2], class232.field3741[var2], class64.field1006[var2], class247.field3989[var2], class161.field2553);
        }
        class162.method1035(-20432);
        return var1;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V", line = 39)
    public static final void method703(byte arg0) {
        class155.method988(false);
        field1672++;
        class57.method427();
        class210.method1319();
        class262.field4252 = -1;
        class57.field928 = null;
        class25.field376 = class24.field364 = new class145[4][];
        class181.method1158(0);
        class21.field293.method526(-32275);
        class169.field2672 = new class29();
        ((class216) class284.field4692).method1363((byte) -72);
        class125.field1934 = new class243[255];
        class125.field1927 = 0;
        class228.method1464();
        class172.field2721 = (class137[][]) null;
        class260.method1670(5);
        class241.method1568((byte) 124);
        class234.method1508((byte) 68);
        for (int var1 = 0; var1 < 2048; var1++) {
            class292 var2 = class23.field346[var1];
            if (var2 != null) {
                var2.field4849 = null;
            }
        }
        int var3 = -93 % ((arg0 + 36) / 62);
        class244.method1589(-532684948);
        class143.method940();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)[[I", line = 80)
    public final int[][] method9(byte arg0, int arg1) {
        field1661++;
        if (arg0 != 3) {
            method704(-84, -81, -83, 1, -122, -126, 14);
        }
        int[][] var3 = this.field3126.method603(arg1, arg0 - 127);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, arg0 ^ 0xFFFFD8AB);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class157.field2504; var11++) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var13 == var14 && var12 == var14) {
                    var9[var11] = this.field1660 * var13 >> 12;
                    var8[var11] = this.field1674 * var14 >> 12;
                    var10[var11] = this.field1668 * var12 >> 12;
                } else {
                    var9[var11] = this.field1660;
                    var8[var11] = this.field1674;
                    var10[var11] = this.field1668;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lfj;II)V", line = 153)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1660 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field1674 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field1668 = arg0.method63((byte) 1);
        }
        if (arg1 >= -117) {
            this.method13((class3) null, 53, -45);
        }
        field1669++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIII)V", line = 185)
    public static final void method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1662++;
        if (arg4 != 12) {
            method705(-102, 90, 38, (class36) null);
        }
        class229[] var7 = class292.field4857;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class229 var9 = var7[var8];
            if (var9 != null && var9.field3708 == 2) {
                class120.method801((var9.field3713 - class30.field421 << 7) + var9.field3720, arg3 >> 1, (var9.field3703 - class189.field2995 << 7) + var9.field3715, var9.field3712 * 2, arg2 >> 1, arg6, arg0, -67);
                if (class49.field741 > -1 && class1.field15 % 20 < 10) {
                    class174.field2791[var9.field3707].method139(class49.field741 + arg5 - 12, arg1 + -28 + class283.field4672);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 274)
    public class109() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILva;)[Lmd;", line = 229)
    public static final class88[] method705(int arg0, int arg1, int arg2, class36 arg3) {
        field1663++;
        if (arg2 < 49) {
            field1665 = (int[]) null;
        }
        return class56.method414(arg0, arg3, false, arg1) ? class211.method1322((byte) 121) : null;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)V", line = 252)
    public static void method706(byte arg0) {
        field1665 = null;
        field1666 = null;
        field1671 = null;
        field1673 = null;
        field1667 = null;
        field1664 = null;
        if (arg0 >= -124) {
            field1666 = (class119) null;
        }
    }
}
